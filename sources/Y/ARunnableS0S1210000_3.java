package Y;

import X.C188727au;
import X.C2045581b;
import X.C211628Sg;
import X.FMX;
import X.V2B;
import X.WM7;
import X.X1D;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.Map;
import ujb.o;

/* loaded from: classes4.dex */
public class ARunnableS0S1210000_3 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Object obj;
        C2045581b c2045581b = (C2045581b) this.l1;
        SlidesImageLoadParams slidesImageLoadParams = (SlidesImageLoadParams) this.l2;
        String str = this.s0;
        boolean z = this.z3;
        c2045581b.getClass();
        C188727au c188727au = new C188727au();
        String str2 = slidesImageLoadParams.aid;
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("aweme_id", str2);
        c188727au.LJIIIZ("duration", String.valueOf(slidesImageLoadParams.duration));
        c188727au.LJIIIZ("status", String.valueOf(slidesImageLoadParams.status));
        c188727au.LJIIIZ("url", slidesImageLoadParams.url);
        c188727au.LJIIIZ("enter_from", c2045581b.LIZLLL);
        c188727au.LJFF(slidesImageLoadParams.statusCode, "error_code");
        c188727au.LJIIIZ("index", String.valueOf(slidesImageLoadParams.index));
        c188727au.LJIIIZ("total_count", String.valueOf(slidesImageLoadParams.totalCount));
        c188727au.LJIIIZ("play_ladder", String.valueOf(slidesImageLoadParams.useMultiBitRate ? 1 : 0));
        c188727au.LJIIIZ("play_ladder_errcodec", String.valueOf(slidesImageLoadParams.playLadderErrCode));
        c188727au.LJIIIZ("play_ladder_gear", slidesImageLoadParams.playLadderGear);
        c188727au.LJIIIZ("bitrate_set", slidesImageLoadParams.allBitrateGears);
        c188727au.LJIIIZ("resolution", slidesImageLoadParams.resolution);
        c188727au.LJIIIZ("width", String.valueOf(slidesImageLoadParams.width));
        c188727au.LJIIIZ("height", String.valueOf(slidesImageLoadParams.height));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(slidesImageLoadParams.originWidth);
        LIZ.append('*');
        LIZ.append(slidesImageLoadParams.originHeight);
        c188727au.LJIIIZ("origin_resolution", X1D.LIZIZ(LIZ));
        c188727au.LJIIIZ("origin_width", String.valueOf(slidesImageLoadParams.originWidth));
        c188727au.LJIIIZ("origin_height", String.valueOf(slidesImageLoadParams.originHeight));
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, String.valueOf(slidesImageLoadParams.sourceFromScene));
        c188727au.LJIIIZ("from_cache", String.valueOf(slidesImageLoadParams.isImageCached));
        String str3 = slidesImageLoadParams.url;
        if (str3 != null) {
            obj = Boolean.valueOf(o.LJJJLIIL(str3, "file", false));
        } else {
            obj = null;
        }
        c188727au.LJFF(obj, "is_publish_image_cache");
        c188727au.LJIIIZ("play_repeat", String.valueOf(z ? 1 : 0));
        Map<String, String> realLogSlidesImageLoad$lambda$17 = c188727au.LIZ;
        kotlin.jvm.internal.o.LJIIIIZZ(realLogSlidesImageLoad$lambda$17, "realLogSlidesImageLoad$lambda$17");
        V2B.LJIJI(str, realLogSlidesImageLoad$lambda$17);
        FMX.LJIIL("slides_image_load", realLogSlidesImageLoad$lambda$17);
    }

    public static final void run$0(ARunnableS0S1210000_3 aRunnableS0S1210000_3) {
        boolean LIZ;
        try {
            C211628Sg c211628Sg = ((InteractAreaComponent) aRunnableS0S1210000_3.l1).LLFZ;
            if (c211628Sg != null) {
                c211628Sg.LIZJ(aRunnableS0S1210000_3.s0, (ComponentPriorityProtocol) aRunnableS0S1210000_3.l2, aRunnableS0S1210000_3.z3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1210000_3 aRunnableS0S1210000_3) {
        boolean LIZ;
        try {
            aRunnableS0S1210000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1210000_3(Object obj, String str, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.z3 = z;
    }
}
