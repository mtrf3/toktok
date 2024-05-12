package X;

import android.view.ViewParent;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;
import n.b;
import o7a.i;
import p8.a;

/* renamed from: X.TAz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C74221TAz {
    public static String LIZJ(VideoItemParams videoItemParams, String str) {
        String aid = videoItemParams.getAweme().getAid();
        o.LJIIIIZZ(aid, str);
        return aid;
    }

    public static long LIZ(long j, long j2, int i, long j3) {
        return Long.rotateLeft(j * j2, i) * j3;
    }

    public static String LIZLLL(StringBuilder sb, float f, char c, StringBuilder sb2) {
        sb.append(f);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static ViewParent LIZIZ(String str, a.b bVar, TuxIconView tuxIconView, LinearLayout.LayoutParams layoutParams, TuxIconView tuxIconView2) {
        i.LIZ(str, bVar, tuxIconView, layoutParams);
        b.LIZ(tuxIconView2);
        return tuxIconView.getParent();
    }
}
