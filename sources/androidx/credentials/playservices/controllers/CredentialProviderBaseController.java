package androidx.credentials.playservices.controllers;

import X.AbstractC23600wG;
import X.AbstractC23670wN;
import X.C35451aH;
import X.C35461aI;
import X.C35491aL;
import X.C35521aO;
import X.C35531aP;
import X.C35551aR;
import X.C35581aU;
import X.C77275UUl;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class CredentialProviderBaseController {
    public final Context context;
    public static final Companion Companion = new Companion();
    public static final Set<Integer> retryables = C77275UUl.LJIIIIZZ(8, 7, 20);
    public static final int CONTROLLER_REQUEST_CODE = 1;

    public static final int getCONTROLLER_REQUEST_CODE() {
        return Companion.getCONTROLLER_REQUEST_CODE();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$annotations() {
        }

        public Companion() {
        }

        public final int getCONTROLLER_REQUEST_CODE() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        public final Set<Integer> getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        public final AbstractC23600wG createCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (o.LJ(str, C35451aH.class.getName())) {
                return new C35451aH(str2);
            }
            if (o.LJ(str, C35461aI.class.getName())) {
                return new C35461aI(str2);
            }
            return new C35491aL(str2);
        }

        public final AbstractC23670wN getCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (o.LJ(str, C35521aO.class.getName())) {
                return new C35521aO(str2);
            }
            if (o.LJ(str, C35531aP.class.getName())) {
                return new C35531aP(str2);
            }
            if (o.LJ(str, C35581aU.class.getName())) {
                return new C35581aU(str2);
            }
            return new C35551aR(str2);
        }
    }

    public CredentialProviderBaseController(Context context) {
        o.LJIIIZ(context, "context");
        this.context = context;
    }

    public final <T extends ResultReceiver> ResultReceiver toIpcFriendlyResultReceiver(T t) {
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "obtain()");
        o.LJI(t);
        t.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver;
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent hiddenIntent, String typeTag) {
        o.LJIIIZ(resultReceiver, "resultReceiver");
        o.LJIIIZ(hiddenIntent, "hiddenIntent");
        o.LJIIIZ(typeTag, "typeTag");
        hiddenIntent.putExtra("TYPE", typeTag);
        hiddenIntent.putExtra("ACTIVITY_REQUEST_CODE", CONTROLLER_REQUEST_CODE);
        hiddenIntent.putExtra("RESULT_RECEIVER", toIpcFriendlyResultReceiver(resultReceiver));
        hiddenIntent.setFlags(65536);
    }
}
