# Ii-Ne-bot-auth-function

## デプロイ
```bash
$ gcloud functions deploy createAuth \
  --quiet \
  --entry-point=org.springframework.cloud.function.adapter.gcp.GcfJarLauncher \
  --trigger-event providers/firebase.auth/eventTypes/user.create \
  --trigger-resource ii-ne-bot-dev \
  --runtime java11 \
  --source=build/libs \
  --memory=1024MB \
  --timeout=300
```

$ gcloud functions deploy createAuth \
--quiet \
--entry-point=org.springframework.cloud.function.adapter.gcp.GcfJarLauncher \
--trigger-http \
--runtime java11 \
--source=build/libs \
--memory=1024MB \
--timeout=300