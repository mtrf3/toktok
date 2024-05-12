package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final /* synthetic */ class JBR implements InterfaceC73592SuS {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(JBS jbs) {
        if (jbs instanceof Fragment) {
            Fragment fragment = (Fragment) jbs;
            if (fragment.mo49getActivity() instanceof JBS) {
                ((JBS) fragment.mo49getActivity()).onBackPressed_Activity();
            }
        }
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        return !((C29985Bpl) obj).LIZJ.isRecycled();
    }

    public static AnimatorSet LIZLLL(ObjectAnimator objectAnimator, long j) {
        objectAnimator.setDuration(j);
        return new AnimatorSet();
    }

    public static int LIZJ(long j, int i, int i2) {
        return (C16880lQ.LLJIJIL(j) + i) * i2;
    }

    public static StringBuilder LJI(String str, boolean z, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(z);
        LIZ.append(str2);
        return LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(JBS jbs, int i, int i2, Intent intent) {
        if (jbs instanceof Fragment) {
            Fragment fragment = (Fragment) jbs;
            if (fragment.mo49getActivity() instanceof JBS) {
                ((JBS) fragment.mo49getActivity()).onActivityResult_Activity(i, i2, intent);
            }
        }
    }

    public static String LJ(StringBuilder sb, Long l, char c, StringBuilder sb2) {
        sb.append(l);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static String LJFF(StringBuilder sb, String str, String str2, StringBuilder sb2) {
        sb.append(str);
        sb.append(str2);
        return X1D.LIZIZ(sb2);
    }

    public static C188727au LJIIIIZZ(String str, String str2, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJI(str, str2);
        c188727au.LJI(str3, str4);
        return c188727au;
    }

    public static void LJIIIZ(StringBuilder sb, String str, StringBuilder sb2, String str2) {
        sb.append(str);
        C78253UnR.LJI(str2, X1D.LIZIZ(sb2));
    }

    public static void LJIIJ(StringBuilder sb, String str, StringBuilder sb2, String str2) {
        sb.append(str);
        C0NB.LJIIIZ(str2, X1D.LIZIZ(sb2));
    }

    public static ArrayList LJII(ArrayList arrayList, String str, int i, HashMap hashMap, ArrayList arrayList2, int i2) {
        arrayList.add(str);
        hashMap.put(Integer.valueOf(i), arrayList2);
        return new ArrayList(i2);
    }
}
