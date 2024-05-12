package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC22250u5;
import X.AbstractC23600wG;
import X.C16880lQ;
import X.C1ZW;
import X.C1ZX;
import X.C36221bW;
import X.C44091oD;
import X.C64476PSe;
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
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<C1ZW, PublicKeyCredentialCreationOptions, PublicKeyCredential, AbstractC22250u5, AbstractC23600wG> {
    public static final Companion Companion = new Companion();
    public static final String TAG = CredentialProviderCreatePublicKeyCredentialController.class.getName();
    public static CredentialProviderCreatePublicKeyCredentialController controller;
    public InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG> callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            o.LJIIIZ(context, "context");
            if (CredentialProviderCreatePublicKeyCredentialController.controller == null) {
                CredentialProviderCreatePublicKeyCredentialController.controller = new CredentialProviderCreatePublicKeyCredentialController(context);
            }
            CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.controller;
            o.LJI(credentialProviderCreatePublicKeyCredentialController);
            return credentialProviderCreatePublicKeyCredentialController;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.context = context;
        final Handler handler = new Handler(C16880lQ.LLJJJJ());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle resultData) {
                o.LJIIIZ(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController2 = CredentialProviderCreatePublicKeyCredentialController.this;
                Executor executor = credentialProviderCreatePublicKeyCredentialController2.executor;
                if (executor != null) {
                    InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG> interfaceC22350uF = credentialProviderCreatePublicKeyCredentialController2.callback;
                    if (interfaceC22350uF != null) {
                        if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, interfaceC22350uF, credentialProviderCreatePublicKeyCredentialController2.cancellationSignal)) {
                            return;
                        }
                        CredentialProviderCreatePublicKeyCredentialController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt("ACTIVITY_REQUEST_CODE"), i, (Intent) resultData.getParcelable("RESULT_DATA"));
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

    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
        o.LJIIIZ(this$0, "this$0");
        InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG> interfaceC22350uF = this$0.callback;
        if (interfaceC22350uF != null) {
            interfaceC22350uF.LIZ(new C44091oD(new C36221bW(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
        } else {
            o.LJIJI("callback");
            throw null;
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(C1ZW request) {
        o.LJIIIZ(request, "request");
        return PublicKeyCredentialControllerUtility.Companion.convert(request);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public AbstractC22250u5 convertResponseToCredentialManager(PublicKeyCredential response) {
        o.LJIIIZ(response, "response");
        return new C1ZX(PublicKeyCredentialControllerUtility.Companion.toCreatePasskeyResponseJson(response));
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        if (i != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() || CredentialProviderController.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.INSTANCE, new IDqS416S0100000(this, 9), this.cancellationSignal)) {
            return;
        }
        if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA")) == null) {
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor = this.executor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this);
                    }
                });
                return;
            } else {
                o.LJIJI("executor");
                throw null;
            }
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) C64476PSe.LIZ(byteArrayExtra, PublicKeyCredential.CREATOR);
        o.LJIIIIZZ(publicKeyCredential, "deserializeFromBytes(bytes)");
        AbstractC23600wG publicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(publicKeyCredential);
        if (publicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new IDqS176S0200000(this, publicKeyCredentialResponseContainsError, 10));
            return;
        }
        try {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new IDqS176S0200000(this, convertResponseToCredentialManager(publicKeyCredential), 11));
        } catch (JSONException e) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new IDqS176S0200000(this, e, 12));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new IDqS176S0200000(this, th, 13));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C1ZW request, InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG> callback, Executor executor, CancellationSignal cancellationSignal) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions convertRequestToPlayServices = convertRequestToPlayServices(request);
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra("REQUEST_TYPE", convertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
            this.context.startActivity(intent);
        } catch (JSONException e) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new IDqS176S0200000(this, e, 14));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new IDqS176S0200000(this, th, 15));
        }
    }
}
