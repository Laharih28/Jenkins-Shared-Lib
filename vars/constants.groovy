import groovy.transform.Field

@Field String AWS_ACCOUNT_ID = '727646512111'
@Field String AWS_DEFAULT_REGION = 'us-east-1'
@Field String IMAGE_REPO_NAME = 'sample-webapp'
@Field String GIT_REPO_URL = 'https://github.com/Laharih28/Jenkins-Shared-Lib.git'

// Jenkins Credential IDs
@Field String GIT_CREDENTIALS_ID = 'github-token'
@Field String ECR_CREDENTIALS_ID = '727646512111.dkr.ecr.us-east-1.amazonaws.com/devops12'

def call() {
    return this
}
