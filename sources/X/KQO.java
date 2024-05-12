package X;

import android.content.Context;
import android.graphics.PointF;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;

/* loaded from: classes9.dex */
public final class KQO extends C1C9 {
    public final /* synthetic */ WrapGridLayoutManager LJIILL;

    @Override // X.C0AB
    public final PointF LIZ(int i) {
        return this.LJIILL.LJII(i);
    }

    @Override // X.C1C9
    public final int LJIIL(int i) {
        return super.LJIIL(i) * 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KQO(WrapGridLayoutManager wrapGridLayoutManager, Context context) {
        super(context);
        this.LJIILL = wrapGridLayoutManager;
    }
}
