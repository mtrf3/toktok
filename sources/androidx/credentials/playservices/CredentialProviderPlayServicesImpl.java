package androidx.credentials.playservices;

import X.AbstractC22230u3;
import X.AbstractC22250u5;
import X.AbstractC23570wD;
import X.AbstractC23600wG;
import X.AbstractC23670wN;
import X.AbstractC67638Qgc;
import X.C16880lQ;
import X.C1ZU;
import X.C1ZW;
import X.C22190tz;
import X.C22410uL;
import X.C22420uM;
import X.C35441aG;
import X.C67641Qgf;
import X.C67646Qgk;
import X.C67675QhD;
import X.C67798QjC;
import X.InterfaceC22350uF;
import X.InterfaceC22380uI;
import X.InterfaceC67677QhF;
import X.InterfaceC67679QhH;
import X.InterfaceC88472Yns;
import X.QH7;
import android.app.Activity;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements InterfaceC22380uI {
    public static final Companion Companion = new Companion();
    public static final String TAG = CredentialProviderPlayServicesImpl.class.getName();
    public final Context context;
    public GoogleApiAvailability googleApiAvailability;

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    @Override // X.InterfaceC22380uI
    public boolean isAvailableOnDevice() {
        if (isGooglePlayServicesAvailable(this.context) == 0) {
            return true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal != null && cancellationSignal.isCanceled()) {
                return true;
            }
            return false;
        }
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        o.LJIIIZ(context, "context");
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        o.LJIIIIZZ(googleApiAvailability, "getInstance()");
        this.googleApiAvailability = googleApiAvailability;
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return C16880lQ.LLLLLZIL(this.googleApiAvailability, context);
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        o.LJIIIZ(googleApiAvailability, "<set-?>");
        this.googleApiAvailability = googleApiAvailability;
    }

    public static final void onClearCredential$lambda$0(InterfaceC88472Yns tmp0, Object obj) {
        o.LJIIIZ(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onClearCredential$lambda$4$lambda$3$lambda$2(InterfaceC22350uF callback, Exception e) {
        o.LJIIIZ(callback, "$callback");
        o.LJIIIZ(e, "$e");
        callback.LIZ(new C35441aG(e.getMessage()));
    }

    public void onClearCredential(C22190tz request, final CancellationSignal cancellationSignal, final Executor executor, final InterfaceC22350uF<Void, AbstractC23570wD> callback) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(executor, "executor");
        o.LJIIIZ(callback, "callback");
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Context context = this.context;
        QH7.LJIIIIZZ(context);
        AbstractC67638Qgc<Void> LJI = new C67798QjC(context, new C67675QhD()).LJI();
        final IDqS28S0300000 iDqS28S0300000 = new IDqS28S0300000(cancellationSignal, (CancellationSignal) executor, (Executor) callback, (InterfaceC22350uF<Void, AbstractC23570wD>) 1);
        InterfaceC67677QhF interfaceC67677QhF = new InterfaceC67677QhF() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
            @Override // X.InterfaceC67677QhF
            public final void onSuccess(Object obj) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(InterfaceC88472Yns.this, obj);
            }
        };
        C67646Qgk c67646Qgk = (C67646Qgk) LJI;
        c67646Qgk.getClass();
        c67646Qgk.LJFF(C67641Qgf.LIZ, interfaceC67677QhF);
        c67646Qgk.LJIILLIIL(new InterfaceC67679QhH() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
            @Override // X.InterfaceC67679QhH
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$4(CredentialProviderPlayServicesImpl.this, cancellationSignal, executor, callback, exc);
            }
        });
    }

    public static final void onClearCredential$lambda$4(CredentialProviderPlayServicesImpl this$0, CancellationSignal cancellationSignal, Executor executor, final InterfaceC22350uF callback, final Exception e) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(executor, "$executor");
        o.LJIIIZ(callback, "$callback");
        o.LJIIIZ(e, "e");
        if (cancellationSignal == null || !cancellationSignal.isCanceled()) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$lambda$3$lambda$2(InterfaceC22350uF.this, e);
                }
            });
        }
    }

    @Override // X.InterfaceC22380uI
    public void onCreateCredential(AbstractC22230u3 request, Activity activity, CancellationSignal cancellationSignal, Executor executor, InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG> callback) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(executor, "executor");
        o.LJIIIZ(callback, "callback");
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof C1ZU) {
            CredentialProviderCreatePasswordController.Companion.getInstance(activity).invokePlayServices((C1ZU) request, callback, executor, cancellationSignal);
        } else {
            if (request instanceof C1ZW) {
                CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(activity).invokePlayServices((C1ZW) request, callback, executor, cancellationSignal);
                return;
            }
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
    }

    @Override // X.InterfaceC22380uI
    public void onGetCredential(C22410uL request, Activity activity, CancellationSignal cancellationSignal, Executor executor, InterfaceC22350uF<C22420uM, AbstractC23670wN> callback) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(executor, "executor");
        o.LJIIIZ(callback, "callback");
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        new CredentialProviderBeginSignInController(activity).invokePlayServices(request, callback, executor, cancellationSignal);
    }
}
