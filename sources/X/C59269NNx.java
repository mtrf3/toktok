package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.vast.model.AdVerification;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NNx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59269NNx {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Aweme aweme) {
        if (!aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        o.LJI(awemeRawAd);
        if (awemeRawAd.getOmVast() == null || NNV.LIZ(aweme) == null || NNV.LIZ(aweme) == null) {
            return false;
        }
        return true;
    }

    public static String LIZLLL(Aweme mAweme) {
        o.LJIIIZ(mAweme, "mAweme");
        if (!LIZIZ(mAweme)) {
            return "";
        }
        AdVerification LIZ2 = NNV.LIZ(mAweme);
        o.LJI(LIZ2);
        String str = LIZ2.javascriptResource;
        o.LJIIIIZZ(str, "getAdVerification(mAweme)!!.javascriptResource");
        return str;
    }

    public static String LJ(Aweme mAweme) {
        o.LJIIIZ(mAweme, "mAweme");
        if (!LIZIZ(mAweme)) {
            return "";
        }
        AdVerification LIZ2 = NNV.LIZ(mAweme);
        o.LJI(LIZ2);
        String str = LIZ2.vender;
        o.LJIIIIZZ(str, "getAdVerification(mAweme)!!.vender");
        return str;
    }

    public static String LJFF(Aweme mAweme) {
        o.LJIIIZ(mAweme, "mAweme");
        if (!LIZIZ(mAweme)) {
            return "";
        }
        AdVerification LIZ2 = NNV.LIZ(mAweme);
        o.LJI(LIZ2);
        String str = LIZ2.verificationParameters;
        o.LJIIIIZZ(str, "getAdVerification(mAweme)!!.verificationParameters");
        return str;
    }

    public static boolean LIZ(int i, int i2, View view) {
        if (view.getHeight() > i * 0.8f && view.getWidth() > i2 * 0.8f) {
            return true;
        }
        return false;
    }

    public static List LIZJ(int i, int i2, View view) {
        ArrayList arrayList = new ArrayList();
        if (LIZ(i, i2, view)) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View child = viewGroup.getChildAt(i3);
                if (LIZ(i, i2, view)) {
                    o.LJIIIIZZ(child, "child");
                    arrayList.add(child);
                }
                o.LJIIIIZZ(child, "child");
                arrayList.addAll(LIZJ(i, i2, child));
            }
        }
        return arrayList;
    }
}
