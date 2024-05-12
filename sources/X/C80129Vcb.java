package X;

import android.content.Context;
import android.graphics.PointF;
import com.ss.android.ugc.aweme.views.SpannedGridLayoutManager;

/* renamed from: X.Vcb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80129Vcb extends C1C9 {
    public final /* synthetic */ SpannedGridLayoutManager LJIILL;

    @Override // X.C0AB
    public final PointF LIZ(int i) {
        return new PointF(0.0f, (this.LJIILL.LLIIJI(i) - this.LJIILL.LLFF) * this.LJIILL.LJZL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80129Vcb(SpannedGridLayoutManager spannedGridLayoutManager, Context context) {
        super(context);
        this.LJIILL = spannedGridLayoutManager;
    }
}
