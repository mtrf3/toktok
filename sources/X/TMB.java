package X;

import android.content.Context;

/* loaded from: classes13.dex */
public final class TMB {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;

    static {
        TBV tbv = new TBV(TMB.class, "hook", "getHook()Lcom/ss/android/ugc/tools/view/widget/CukaieToast$ToastHook;", 0);
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbv};
    }

    public static C82890Wg2 LIZ(int i, int i2, Context context) {
        String str;
        if (context != null) {
            str = context.getString(i);
        } else {
            str = null;
        }
        return new C82890Wg2(context, str, i2, 2);
    }

    public static /* synthetic */ C82890Wg2 LIZIZ(TMB tmb, Context context, int i) {
        tmb.getClass();
        return LIZ(i, 0, context);
    }

    public static C82890Wg2 LIZJ(int i, int i2, Context context) {
        String str;
        if (context != null) {
            str = context.getString(i);
        } else {
            str = null;
        }
        return new C82890Wg2(context, str, i2, 3);
    }

    public static C82890Wg2 LIZLLL(TMB tmb, Context context, String str) {
        tmb.getClass();
        return new C82890Wg2(context, str, 0, 3);
    }
}
