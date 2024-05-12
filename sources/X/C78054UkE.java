package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVLinearLayoutManager;

/* renamed from: X.UkE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78054UkE extends C1C9 {
    public final /* synthetic */ MVLinearLayoutManager LJIILL;

    @Override // X.C0AB
    public final PointF LIZ(int i) {
        return this.LJIILL.LJII(i);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        return this.LJIILL.LLIIIJ / displayMetrics.densityDpi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78054UkE(MVLinearLayoutManager mVLinearLayoutManager, Context context) {
        super(context);
        this.LJIILL = mVLinearLayoutManager;
    }
}
