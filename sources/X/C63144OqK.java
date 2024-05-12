package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.OqK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C63144OqK implements FWB {
    public static int LIZ() {
        if (C33949DUb.LIZIZ()) {
            return 1;
        }
        return 16777215;
    }

    public static C63323OtD LIZJ(String str) {
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ(str);
        return c63323OtD;
    }

    @Override // X.FWB
    public void invoke(Object[] objArr) {
        try {
            OJY LJIL = C73340SqO.LJIL();
            Context LIZIZ = EF7.LIZIZ();
            AwemeRawAd awemeRawAd = (AwemeRawAd) objArr[0];
            String str = (String) objArr[1];
            LJIL.getClass();
            OJY.LJIIJJI(LIZIZ, awemeRawAd, str);
        } catch (Exception unused) {
        }
    }

    public static boolean LIZLLL(EnumC139485dg enumC139485dg, ArrayList arrayList) {
        return arrayList.contains(Integer.valueOf(enumC139485dg.getScene()));
    }

    public static String LIZIZ(Object[] objArr, int i, Locale locale, String str, String str2) {
        String LLLZI = C16880lQ.LLLZI(locale, str, Arrays.copyOf(objArr, i));
        o.LJIIIIZZ(LLLZI, str2);
        return LLLZI;
    }
}
