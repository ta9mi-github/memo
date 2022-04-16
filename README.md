postgresql

#コマンド一覧
・postgresql起動　複数起動はできないため、エラーになる
    postgres -D /(postgresqlがあるパス)/postgres
      ex) postgres -D /usr/local/var/postgres
・postgresql終了
    ctrl+c or \q だと思う...
・バージョンアップデート後、バージョンに関するエラーがでた場合実行する
    windows,linux->調査中...
    mac->brew postgresql-upgrade-database


#環境構築
#postgresql バージョン14.2
  ・インストール
      windows,linux->https://www.enterprisedb.com/downloads/postgres-postgresql-downloads
      mac->brew install postgresql

#pgAdmin4
  ・インストール
      ダウンロード->https://www.pgadmin.org/download/
  ・pgAdmin4を起動
  ・マスターパスワードの設定（次回からログイン時に求められる）
  ・言語モードを日本語に変更
      メニューバー->Preferrence->Miscellaneous->User languageからjapaneseを選択してpgAdmin4を再起動
  ・postgresqlを起動する
  ・（任意）サーバーグループを作成
      メニューバー->オブジェクト->サーバーグループの作成
  ・サーバーの作成
      メニューバー->オブジェクト->サーバーの作成 or pgAdmin4内のブラウザにあるサーバーグループを右クリック->サーバーの作成
      下記の項目を設定して保存ボタンを押下
        General-DB名: 任意の名前
        General-サーバーグループ: 任意のサーバーグループを選択
        接続-ホスト名/アドレス: postgresqlを起動したアドレスを指定
        ポート番号・管理用データベース: デフォルト（いつか変えたい...）
        ユーザー名: 任意の名前
        パスワード: 任意のパスワード、pgAdmin4ログイン時に求められる

#テーブル作成
  ・ROLE,権限等
      一旦無視
  ・テーブル
      初回は作成者のバックアップを復元してください
      その後要相談







