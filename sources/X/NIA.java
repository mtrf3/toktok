package X;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NIA {
    public static final List<String> LJII = C47261Igj.LJJIJIIJI("enable_pending_js_task", "enable_prefetch", "spark_perf_bid");
    public final String LIZ;
    public String LIZIZ;
    public final Bundle LIZJ;
    public final String LIZLLL;
    public final F23 LJ;
    public final Boolean LJFF;
    public final InterfaceC88471Ynr<String, String, Boolean> LJI;

    public final void LIZ(String str, boolean z, boolean z2) {
        String str2;
        try {
            android.net.Uri parse = UriProtector.parse(str);
            o.LJIIIIZZ(parse, "parse(url)");
            Uri.Builder buildUpon = C78939UyV.LJJJJJ(parse, LJII).buildUpon();
            String str3 = "1";
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("enable_pending_js_task", str2).appendQueryParameter("spark_perf_bid", this.LIZ);
            if (!z2) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            this.LIZIZ = appendQueryParameter.appendQueryParameter("enable_prefetch", str3).build().toString();
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ad spark lynx url is ");
            LIZ.append(str);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
    }

    public NIA(String scene, String str, Bundle bundle, String str2, F23 f23, boolean z, E8B e8b, boolean z2, int i) {
        Boolean bool;
        str = (i & 2) != 0 ? null : str;
        bundle = (i & 4) != 0 ? null : bundle;
        str2 = (i & 8) != 0 ? null : str2;
        if ((i & 64) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        z = (i & 128) != 0 ? false : z;
        e8b = (i & 256) != 0 ? null : e8b;
        z2 = (i & 512) != 0 ? false : z2;
        o.LJIIIZ(scene, "scene");
        this.LIZ = scene;
        this.LIZIZ = str;
        this.LIZJ = bundle;
        this.LIZLLL = str2;
        this.LJ = f23;
        this.LJFF = bool;
        this.LJI = e8b;
        LIZ(str, z2, z);
    }
}
