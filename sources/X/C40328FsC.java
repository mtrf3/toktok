package X;

import android.app.Activity;
import android.text.TextUtils;

/* renamed from: X.FsC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C40328FsC implements F85 {
    public static String LIZ(Activity activity) {
        if (activity instanceof KMV) {
            String rootFragmentClsName = ((KMV) activity).getRootFragmentClsName();
            if (!TextUtils.isEmpty(rootFragmentClsName)) {
                return rootFragmentClsName;
            }
        }
        return activity.getClass().getName();
    }

    public static EI0 LIZJ(C36093EEn c36093EEn) {
        c36093EEn.getClass();
        return new EI0();
    }

    public static void LIZLLL(ActivityC45651qj activityC45651qj, int i) {
        C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
    }

    public static int LIZIZ(C43I c43i, int i, int i2) {
        return (c43i.hashCode() + i) * i2;
    }
}
