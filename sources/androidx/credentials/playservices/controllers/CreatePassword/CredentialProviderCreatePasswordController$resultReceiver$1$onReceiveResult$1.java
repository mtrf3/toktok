package androidx.credentials.playservices.controllers.CreatePassword;

import X.AbstractC23600wG;
import X.InterfaceC88471Ynr;
import X.TBS;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

/* loaded from: classes.dex */
public final /* synthetic */ class CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 extends TBS implements InterfaceC88471Ynr<String, String, AbstractC23600wG> {
    public CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final AbstractC23600wG invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
