package androidx.credentials.playservices.controllers.CreatePassword;

import X.AbstractC22250u5;
import X.AbstractC23600wG;
import X.C16880lQ;
import X.C1ZU;
import X.C68515Qul;
import X.C76800UCe;
import X.InterfaceC22350uF;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class CredentialProviderCreatePasswordController extends CredentialProviderController<C1ZU, SavePasswordRequest, C76800UCe, AbstractC22250u5, AbstractC23600wG> {
    public static final Companion Companion = new Companion();
    public static final String TAG = CredentialProviderCreatePasswordController.class.getName();
    public static CredentialProviderCreatePasswordController controller;
    public InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG> callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            o.LJIIIZ(context, "context");
            if (CredentialProviderCreatePasswordController.controller == null) {
                CredentialProviderCreatePasswordController.controller = new CredentialProviderCreatePasswordController(context);
            }
            CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.controller;
            o.LJI(credentialProviderCreatePasswordController);
            return credentialProviderCreatePasswordController;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.context = context;
        final Handler handler = new Handler(C16880lQ.LLJJJJ());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle resultData) {
                o.LJIIIZ(resultData, "resultData");
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.this;
                CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController2 = CredentialProviderCreatePasswordController.this;
                Executor executor = credentialProviderCreatePasswordController2.executor;
                if (executor != null) {
                    InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG> interfaceC22350uF = credentialProviderCreatePasswordController2.callback;
                    if (interfaceC22350uF != null) {
                        if (credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, interfaceC22350uF, credentialProviderCreatePasswordController2.cancellationSignal)) {
                            return;
                        }
                        CredentialProviderCreatePasswordController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt("ACTIVITY_REQUEST_CODE"), i);
                        return;
                    }
                    o.LJIJI("callback");
                    throw null;
                }
                o.LJIJI("executor");
                throw null;
            }
        };
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public SavePasswordRequest convertRequestToPlayServices(C1ZU request) {
        o.LJIIIZ(request, "request");
        C68515Qul c68515Qul = new C68515Qul();
        c68515Qul.LIZ = new SignInPassword(null, null);
        return new SavePasswordRequest(c68515Qul.LIZ, c68515Qul.LIZIZ, c68515Qul.LIZJ);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public AbstractC22250u5 convertResponseToCredentialManager(C76800UCe response) {
        o.LJIIIZ(response, "response");
        return new AbstractC22250u5() { // from class: X.1ZV
            {
                new Bundle();
            }
        };
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2) {
        if (i != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() || CredentialProviderController.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePasswordController$handleResponse$1.INSTANCE, new IDqS416S0100000(this, 8), this.cancellationSignal)) {
            return;
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new IDqS176S0200000(this, convertResponseToCredentialManager(C76800UCe.LIZ), 9));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C1ZU request, InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG> callback, Executor executor, CancellationSignal cancellationSignal) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        SavePasswordRequest convertRequestToPlayServices = convertRequestToPlayServices(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", convertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, intent, "CREATE_PASSWORD");
        this.context.startActivity(intent);
    }
}
