package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC23670wN;
import X.InterfaceC88471Ynr;
import X.TBS;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

/* loaded from: classes.dex */
public final /* synthetic */ class CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 extends TBS implements InterfaceC88471Ynr<String, String, AbstractC23670wN> {
    public CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final AbstractC23670wN invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
