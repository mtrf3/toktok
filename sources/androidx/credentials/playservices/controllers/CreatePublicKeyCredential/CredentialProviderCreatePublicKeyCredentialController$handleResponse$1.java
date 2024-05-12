package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$1 extends AbstractC65781Prl implements InterfaceC88471Ynr<CancellationSignal, InterfaceC65784Pro<? extends C76800UCe>, C76800UCe> {
    public static final CredentialProviderCreatePublicKeyCredentialController$handleResponse$1 INSTANCE = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$1();

    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$1() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(CancellationSignal cancellationSignal, InterfaceC65784Pro<? extends C76800UCe> interfaceC65784Pro) {
        invoke2(cancellationSignal, (InterfaceC65784Pro<C76800UCe>) interfaceC65784Pro);
        return C76800UCe.LIZ;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CancellationSignal cancellationSignal, InterfaceC65784Pro<C76800UCe> f) {
        o.LJIIIZ(f, "f");
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, f);
    }
}
