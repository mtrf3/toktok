package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import java.util.List;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final class Q5D {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(InterfaceC66439Q5r feature) {
        o.LJIIIZ(feature, "feature");
        if (LIZIZ(feature).LIZIZ != -1) {
            return true;
        }
        return false;
    }

    public static final C66432Q5k LIZIZ(InterfaceC66439Q5r feature) {
        int[] iArr;
        C65825PsT LIZIZ;
        java.util.Map<String, C65826PsU> map;
        C65826PsU c65826PsU;
        o.LJIIIZ(feature, "feature");
        String LIZLLL = u.LIZLLL();
        String actionName = feature.getAction();
        String featureName = feature.name();
        o.LJIIIZ(actionName, "actionName");
        o.LJIIIZ(featureName, "featureName");
        C66432Q5k c66432Q5k = null;
        if (C66373Q3d.LJIJJ(actionName) || C66373Q3d.LJIJJ(featureName) || (LIZIZ = C65819PsN.LIZIZ(LIZLLL)) == null || (map = LIZIZ.LIZLLL.get(actionName)) == null || (c65826PsU = map.get(featureName)) == null || (iArr = c65826PsU.LIZJ) == null) {
            iArr = new int[]{feature.getMinVersion()};
        }
        if (C40700FyC.LIZ(Q5A.class)) {
            return null;
        }
        try {
            List<Q5J> list = Q5A.LIZLLL.get(actionName);
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            c66432Q5k = Q5A.LIZ.LJIIJJI(list, iArr);
            return c66432Q5k;
        } catch (Throwable unused) {
            return c66432Q5k;
        }
    }

    public static final void LIZLLL(Q6H appCall, Q4W q4w) {
        o.LJIIIZ(appCall, "appCall");
        Q4J.LIZ(u.LIZJ(), true);
        Intent intent = new Intent();
        intent.setClass(u.LIZJ(), FacebookActivity.class);
        intent.setAction("PassThrough");
        Q5A.LJIILLIIL(intent, appCall.LIZ().toString(), null, Q5A.LJIIL(), Q5A.LIZLLL(q4w));
        if (C40700FyC.LIZ(appCall)) {
            return;
        }
        try {
            appCall.LIZJ = intent;
        } catch (Throwable unused) {
        }
    }

    public static final void LIZJ(Q6H q6h, InterfaceC66437Q5p interfaceC66437Q5p, InterfaceC66439Q5r interfaceC66439Q5r) {
        Bundle LIZ2;
        Intent LJIJ;
        Context LIZJ = u.LIZJ();
        String action = interfaceC66439Q5r.getAction();
        C66432Q5k LIZIZ = LIZIZ(interfaceC66439Q5r);
        int i = LIZIZ.LIZIZ;
        if (i != -1) {
            if (Q5A.LJIILL(i)) {
                LIZ2 = interfaceC66437Q5p.getParameters();
            } else {
                LIZ2 = interfaceC66437Q5p.LIZ();
            }
            if (LIZ2 == null) {
                LIZ2 = new Bundle();
            }
            String uuid = q6h.LIZ().toString();
            if (!C40700FyC.LIZ(Q5A.class)) {
                try {
                    Q5J q5j = LIZIZ.LIZ;
                    if (q5j != null && (LJIJ = Q5A.LJIJ(LIZJ, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(q5j.LIZJ()).addCategory("android.intent.category.DEFAULT"))) != null) {
                        Q5A.LJIILLIIL(LJIJ, uuid, action, LIZIZ.LIZIZ, LIZ2);
                        if (C40700FyC.LIZ(q6h)) {
                            return;
                        }
                        try {
                            q6h.LIZJ = LJIJ;
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            throw new Q4W("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new Q4W("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    public static final void LJ(Q6H q6h, String str, Bundle bundle) {
        Q4J.LIZ(u.LIZJ(), true);
        Q4J.LIZJ(u.LIZJ(), true);
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        Q5A.LJIILLIIL(intent, q6h.LIZ().toString(), str, Q5A.LJIIL(), bundle2);
        intent.setClass(u.LIZJ(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        if (C40700FyC.LIZ(q6h)) {
            return;
        }
        try {
            q6h.LIZJ = intent;
        } catch (Throwable unused) {
        }
    }
}
