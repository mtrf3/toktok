package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.HKb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C43881HKb implements FWB {
    public static float LIZ(float f, float f2, float f3, float f4) {
        return ((f / f2) * f3) + f4;
    }

    @Override // X.FWB
    public void invoke(Object[] objArr) {
        Aweme[] awemeArr = (Aweme[]) objArr;
        try {
            OJY LJIL = C73340SqO.LJIL();
            Context LIZIZ = EF7.LIZIZ();
            Aweme aweme = awemeArr[0];
            LJIL.getClass();
            OJY.LJII(LIZIZ, aweme);
        } catch (Exception unused) {
        }
    }

    public static StringBuilder LIZIZ(Object obj, String str) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        return LIZ;
    }

    public static void LIZLLL(EnumC139485dg enumC139485dg, ArrayList arrayList, C145995oB c145995oB, String str) {
        c145995oB.LIZ(arrayList.contains(Integer.valueOf(enumC139485dg.getScene())) ? 1 : 0, str);
    }

    public static void LIZJ(long j, HashMap hashMap, String str, String str2, String str3) {
        hashMap.put(str, String.valueOf(j));
        hashMap.put(str2, str3);
    }
}
