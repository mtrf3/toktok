package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import kotlin.jvm.internal.o;

/* renamed from: X.UkF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78055UkF extends C1C9 {
    public final /* synthetic */ EditCaptionScene.HighLightLayoutManager LJIILL;

    @Override // X.C1C9
    public final int LJIILJJIL() {
        return -1;
    }

    @Override // X.C0AB
    public final PointF LIZ(int i) {
        return this.LJIILL.LJII(i);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        Integer num;
        float f = this.LJIILL.LLIIIL;
        if (displayMetrics != null) {
            num = Integer.valueOf(displayMetrics.densityDpi);
        } else {
            num = null;
        }
        o.LJI(num);
        return f / num.intValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78055UkF(EditCaptionScene.HighLightLayoutManager highLightLayoutManager, Context context) {
        super(context);
        this.LJIILL = highLightLayoutManager;
    }

    @Override // X.C1C9
    public final int LJII(int i, int i2, int i3, int i4, int i5) {
        return (i3 - i) + ((int) KL2.LIZJ(this.LJIILL.LLIIIJ, 52.0f));
    }
}
