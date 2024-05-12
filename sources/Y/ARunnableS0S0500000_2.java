package Y;

import X.ActivityC45651qj;
import X.C132865Ji;
import X.C134385Pe;
import X.C152935zN;
import X.C5PL;
import X.C5PQ;
import X.C5PT;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.OSZ;
import X.P5A;
import X.W5G;
import Y.ARunnableS6S0400000_2;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Pair;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS0S0500000_2 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        VERecordData vERecordData = (VERecordData) this.l0;
        Pair pair = (Pair) this.l1;
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l2;
        final W5G w5g = (W5G) this.l3;
        final ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.l4;
        if (activityC45651qj == null) {
            return;
        }
        int i = (int) (videoPublishEditModel.mVideoCoverStartTm * 1000);
        if (videoPublishEditModel.isUseTimeReverseEffect()) {
            int intValue = ((Number) pair.second).intValue();
            Object obj = pair.first;
            o.LJIIIIZZ(obj, "playPair.first");
            i = (intValue - ((Number) obj).intValue()) - i;
        }
        VEUtils.getVideoThumb(vERecordData, i, -1, w5g.getHeight(), false, new P5A() { // from class: X.6Yq
            @Override // X.P5A
            public final boolean processFrame(ByteBuffer frame, int i2, int i3, int i4) {
                o.LJIIIZ(frame, "frame");
                Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(frame.position(0));
                Bitmap LIZJ = OUR.LIZJ(videoPublishEditModel, createBitmap);
                C1M5 c1m5 = new C1M5(activityC45651qj.getResources(), LIZJ);
                c1m5.LIZJ(KL2.LIZJ(C44172HVg.LIZ, 4.0f));
                ExecutorC149205tM.LJLILLLLZI.execute(new ARunnableS6S0400000_2(w5g, c1m5, videoPublishEditModel, LIZJ, 0));
                return false;
            }
        });
    }

    public final void LIZ$1() {
        Float f;
        if (((C134385Pe) this.l0).getParent() != null && ((C134385Pe) this.l0).getVisibility() != 0) {
            ((C5PQ) this.l1).LJLL = new OSZ<>(Integer.valueOf(((C134385Pe) this.l0).getWidth()), Integer.valueOf(((C134385Pe) this.l0).getHeight()));
            C5PT c5pt = (C5PT) this.l2;
            OSZ LIZ = C132865Ji.LIZ(c5pt.LJLIL / c5pt.LJLILLLLZI, ((C134385Pe) this.l0).getWidth(), ((C134385Pe) this.l0).getHeight());
            C134385Pe c134385Pe = (C134385Pe) this.l0;
            int floatValue = (int) ((Number) LIZ.getFirst()).floatValue();
            int floatValue2 = (int) ((Number) LIZ.getSecond()).floatValue();
            c134385Pe.LJLJLJ.left = (c134385Pe.getWidth() - floatValue) / 2;
            Rect rect = c134385Pe.LJLJLJ;
            rect.right = rect.left + floatValue;
            rect.top = (c134385Pe.getHeight() - floatValue2) / 2;
            Rect rect2 = c134385Pe.LJLJLJ;
            rect2.bottom = rect2.top + floatValue2;
            c134385Pe.invalidate();
            ((C134385Pe) this.l0).setCropMode((C5PL) this.l3);
            if (((C134385Pe) this.l0).getCropMode() == C5PL.FREE && (f = (Float) this.l4) != null) {
                ((C134385Pe) this.l0).setFreeModeCropRect(f.floatValue());
            }
            C134385Pe c134385Pe2 = (C134385Pe) this.l0;
            o.LJIIIZ(c134385Pe2, "<this>");
            c134385Pe2.setVisibility(0);
        }
    }

    public static final void run$0(ARunnableS0S0500000_2 aRunnableS0S0500000_2) {
        boolean LIZ;
        try {
            aRunnableS0S0500000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0500000_2 aRunnableS0S0500000_2) {
        boolean LIZ;
        try {
            ((C152935zN) aRunnableS0S0500000_2.l0).LJI((VideoPublishEditModel) aRunnableS0S0500000_2.l1, (InterfaceC88471Ynr) aRunnableS0S0500000_2.l2, (InterfaceC88473Ynt) aRunnableS0S0500000_2.l3, (InterfaceC88472Yns) aRunnableS0S0500000_2.l4);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S0500000_2 aRunnableS0S0500000_2) {
        boolean LIZ;
        try {
            aRunnableS0S0500000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS0S0500000_2(Object obj, VERecordData vERecordData, Pair<Integer, Integer> pair, VideoPublishEditModel videoPublishEditModel, W5G w5g, ActivityC45651qj activityC45651qj) {
        this.$t = activityC45651qj;
        this.l0 = obj;
        this.l1 = vERecordData;
        this.l2 = pair;
        this.l3 = videoPublishEditModel;
        this.l4 = w5g;
    }
}
