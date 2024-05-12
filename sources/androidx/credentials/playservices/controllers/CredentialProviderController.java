package androidx.credentials.playservices.controllers;

import X.AbstractC23600wG;
import X.AbstractC23670wN;
import X.C0NY;
import X.C35451aH;
import X.C35491aL;
import X.C35521aO;
import X.C35551aR;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC22350uF;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS32S0300000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {
    public static final Companion Companion = new Companion();
    public final Context context;

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, interfaceC65784Pro);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, InterfaceC88471Ynr<? super CancellationSignal, ? super InterfaceC65784Pro<C76800UCe>, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AbstractC23600wG, C76800UCe> interfaceC88472Yns, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i, interfaceC88471Ynr, interfaceC88472Yns, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, InterfaceC88471Ynr<? super CancellationSignal, ? super InterfaceC65784Pro<C76800UCe>, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AbstractC23670wN, C76800UCe> interfaceC88472Yns, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i, interfaceC88471Ynr, interfaceC88472Yns, cancellationSignal);
    }

    public abstract T2 convertRequestToPlayServices(T1 t1);

    public abstract R1 convertResponseToCredentialManager(R2 r2);

    public abstract void invokePlayServices(T1 t1, InterfaceC22350uF<R1, E1> interfaceC22350uF, Executor executor, CancellationSignal cancellationSignal);

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public Companion() {
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int i) {
            return C0NY.LIZIZ("activity with result code: ", i, " indicating not RESULT_OK");
        }

        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, InterfaceC65784Pro<C76800UCe> onResultOrException) {
            o.LJIIIZ(onResultOrException, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, X.1aL] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, X.1aH] */
        public final boolean maybeReportErrorResultCodeCreate(int i, InterfaceC88471Ynr<? super CancellationSignal, ? super InterfaceC65784Pro<C76800UCe>, C76800UCe> cancelOnError, InterfaceC88472Yns<? super AbstractC23600wG, C76800UCe> onError, CancellationSignal cancellationSignal) {
            o.LJIIIZ(cancelOnError, "cancelOnError");
            o.LJIIIZ(onError, "onError");
            if (i != -1) {
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = new C35491aL(generateErrorStringUnknown$credentials_play_services_auth_release(i));
                if (i == 0) {
                    c68322mC.element = new C35451aH(generateErrorStringCanceled$credentials_play_services_auth_release());
                }
                cancelOnError.invoke(cancellationSignal, new IDqS176S0200000(onError, (InterfaceC88472Yns<? super AbstractC23600wG, C76800UCe>) c68322mC, (C68322mC<AbstractC23600wG>) 16));
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [X.1aR, T] */
        /* JADX WARN: Type inference failed for: r1v2, types: [X.1aO, T] */
        public final boolean maybeReportErrorResultCodeGet(int i, InterfaceC88471Ynr<? super CancellationSignal, ? super InterfaceC65784Pro<C76800UCe>, C76800UCe> cancelOnError, InterfaceC88472Yns<? super AbstractC23670wN, C76800UCe> onError, CancellationSignal cancellationSignal) {
            o.LJIIIZ(cancelOnError, "cancelOnError");
            o.LJIIIZ(onError, "onError");
            if (i != -1) {
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = new C35551aR(generateErrorStringUnknown$credentials_play_services_auth_release(i));
                if (i == 0) {
                    c68322mC.element = new C35521aO(generateErrorStringCanceled$credentials_play_services_auth_release());
                }
                cancelOnError.invoke(cancellationSignal, new IDqS176S0200000(onError, (InterfaceC88472Yns<? super AbstractC23600wG, C76800UCe>) c68322mC, (C68322mC<AbstractC23600wG>) 17));
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.context = context;
    }

    public final boolean maybeReportErrorFromResultReceiver(Bundle resultData, InterfaceC88471Ynr<? super String, ? super String, ? extends E1> conversionFn, Executor executor, InterfaceC22350uF<R1, E1> callback, CancellationSignal cancellationSignal) {
        o.LJIIIZ(resultData, "resultData");
        o.LJIIIZ(conversionFn, "conversionFn");
        o.LJIIIZ(executor, "executor");
        o.LJIIIZ(callback, "callback");
        if (!resultData.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new IDqS32S0300000(executor, (Executor) callback, (InterfaceC22350uF<R1, int>) conversionFn.invoke(resultData.getString("EXCEPTION_TYPE"), resultData.getString("EXCEPTION_MESSAGE")), 1));
        return true;
    }
}
