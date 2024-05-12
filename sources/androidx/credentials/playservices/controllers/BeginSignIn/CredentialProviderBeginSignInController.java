package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC23670wN;
import X.C16880lQ;
import X.C22410uL;
import X.C22420uM;
import X.C35521aO;
import X.C35531aP;
import X.C35551aR;
import X.C58322Muk;
import X.C67675QhD;
import X.C67798QjC;
import X.C68322mC;
import X.C85777XlV;
import X.ETK;
import X.InterfaceC22350uF;
import X.QH7;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController extends CredentialProviderController<C22410uL, BeginSignInRequest, SignInCredential, C22420uM, AbstractC23670wN> {
    public static final Companion Companion = new Companion();
    public static final String TAG = CredentialProviderBeginSignInController.class.getName();
    public static CredentialProviderBeginSignInController controller;
    public InterfaceC22350uF<C22420uM, AbstractC23670wN> callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final InterfaceC22350uF<C22420uM, AbstractC23670wN> getCallback() {
        InterfaceC22350uF<C22420uM, AbstractC23670wN> interfaceC22350uF = this.callback;
        if (interfaceC22350uF != null) {
            return interfaceC22350uF;
        }
        o.LJIJI("callback");
        throw null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        o.LJIJI("executor");
        throw null;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final CredentialProviderBeginSignInController getInstance(Context context) {
            o.LJIIIZ(context, "context");
            if (CredentialProviderBeginSignInController.controller == null) {
                CredentialProviderBeginSignInController.controller = new CredentialProviderBeginSignInController(context);
            }
            CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.controller;
            o.LJI(credentialProviderBeginSignInController);
            return credentialProviderBeginSignInController;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.context = context;
        final Handler handler = new Handler(C16880lQ.LLJJJJ());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle resultData) {
                o.LJIIIZ(resultData, "resultData");
                if (CredentialProviderBeginSignInController.this.maybeReportErrorFromResultReceiver(resultData, new CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), CredentialProviderBeginSignInController.this.getExecutor(), CredentialProviderBeginSignInController.this.getCallback(), CredentialProviderBeginSignInController.this.cancellationSignal)) {
                    return;
                }
                CredentialProviderBeginSignInController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt("ACTIVITY_REQUEST_CODE"), i, (Intent) resultData.getParcelable("RESULT_DATA"));
            }
        };
    }

    private final C85777XlV createGoogleIdCredential(SignInCredential signInCredential) {
        C58322Muk c58322Muk = new C58322Muk();
        String str = signInCredential.zba;
        o.LJIIIIZZ(str, "response.id");
        c58322Muk.LIZ = str;
        String str2 = signInCredential.zbg;
        o.LJI(str2);
        c58322Muk.LIZIZ = str2;
        String str3 = signInCredential.zbb;
        if (str3 != null) {
            c58322Muk.LIZJ = str3;
        }
        String str4 = signInCredential.zbc;
        if (str4 != null) {
            c58322Muk.LJ = str4;
        }
        String str5 = signInCredential.zbd;
        if (str5 != null) {
            c58322Muk.LIZLLL = str5;
        }
        String str6 = signInCredential.zbh;
        if (str6 != null) {
            c58322Muk.LJI = str6;
        }
        Uri uri = signInCredential.zbe;
        if (uri != null) {
            c58322Muk.LJFF = uri;
        }
        return new C85777XlV(c58322Muk.LIZ, c58322Muk.LIZIZ, c58322Muk.LIZJ, c58322Muk.LIZLLL, c58322Muk.LJ, c58322Muk.LJFF, c58322Muk.LJI);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public BeginSignInRequest convertRequestToPlayServices(C22410uL request) {
        o.LJIIIZ(request, "request");
        return BeginSignInControllerUtility.Companion.constructBeginSignInRequest$credentials_play_services_auth_release(request, this.context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r2 != null) goto L5;
     */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C22420uM convertResponseToCredentialManager(com.google.android.gms.auth.api.identity.SignInCredential r4) {
        /*
            r3 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = r4.zbf
            if (r0 == 0) goto L20
            X.1Zd r2 = new X.1Zd
            java.lang.String r1 = r4.zba
            java.lang.String r0 = "response.id"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = r4.zbf
            kotlin.jvm.internal.o.LJI(r0)
            r2.<init>(r1, r0)
        L1a:
            X.0uM r0 = new X.0uM
            r0.<init>(r2)
            return r0
        L20:
            java.lang.String r0 = r4.zbg
            if (r0 == 0) goto L2b
            X.XlV r2 = r3.createGoogleIdCredential(r4)
            if (r2 == 0) goto L3b
            goto L1a
        L2b:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r0 = r4.zbi
            if (r0 == 0) goto L3b
            X.1Ze r2 = new X.1Ze
            androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility$Companion r0 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.Companion
            java.lang.String r0 = r0.toAssertPasskeyResponse(r4)
            r2.<init>(r0)
            goto L1a
        L3b:
            X.1aR r1 = new X.1aR
            java.lang.String r0 = "When attempting to convert get response, null credential found"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController.convertResponseToCredentialManager(com.google.android.gms.auth.api.identity.SignInCredential):X.0uM");
    }

    public final void setCallback(InterfaceC22350uF<C22420uM, AbstractC23670wN> interfaceC22350uF) {
        o.LJIIIZ(interfaceC22350uF, "<set-?>");
        this.callback = interfaceC22350uF;
    }

    public final void setExecutor(Executor executor) {
        o.LJIIIZ(executor, "<set-?>");
        this.executor = executor;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.1aR, T] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, X.1aP] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.1aO, T] */
    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        if (i != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() || CredentialProviderController.maybeReportErrorResultCodeGet(i2, CredentialProviderBeginSignInController$handleResponse$1.INSTANCE, new IDqS416S0100000(this, 7), this.cancellationSignal)) {
            return;
        }
        try {
            Context context = this.context;
            QH7.LJIIIIZZ(context);
            new C67798QjC(context, new C67675QhD());
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new IDqS176S0200000(this, convertResponseToCredentialManager(C67798QjC.LJFF(intent)), 5));
        } catch (AbstractC23670wN e) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new IDqS176S0200000(this, e, 7));
        } catch (ETK e2) {
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = new C35551aR(e2.getMessage());
            if (e2.getStatusCode() == 16) {
                c68322mC.element = new C35521aO(e2.getMessage());
            } else if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(e2.getStatusCode()))) {
                c68322mC.element = new C35531aP(e2.getMessage());
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new IDqS176S0200000(this, (CredentialProviderBeginSignInController) c68322mC, (C68322mC<AbstractC23670wN>) 6));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new IDqS176S0200000(this, new C35551aR(th.getMessage()), 8));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C22410uL request, InterfaceC22350uF<C22420uM, AbstractC23670wN> callback, Executor executor, CancellationSignal cancellationSignal) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        BeginSignInRequest convertRequestToPlayServices = convertRequestToPlayServices(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", convertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, intent, "BEGIN_SIGN_IN");
        this.context.startActivity(intent);
    }
}
