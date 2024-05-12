package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;

/* renamed from: X.Vcs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80146Vcs extends C1C9 {
    public final /* synthetic */ CreatorCaptionEditActivity.HighLightLayoutManager LJIILL;

    @Override // X.C1C9
    public final int LJII(int i, int i2, int i3, int i4, int i5) {
        return i3 - i;
    }

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
        int i;
        float f = CreatorCaptionEditActivity.this.LJZ;
        if (displayMetrics != null) {
            i = displayMetrics.densityDpi;
        } else {
            i = 200;
        }
        return f / i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80146Vcs(CreatorCaptionEditActivity.HighLightLayoutManager highLightLayoutManager, Context context) {
        super(context);
        this.LJIILL = highLightLayoutManager;
    }
}
