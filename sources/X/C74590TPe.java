package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;

/* renamed from: X.TPe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74590TPe extends C1C9 {
    public final /* synthetic */ SmoothLinearLayoutManager LJIILL;

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        return this.LJIILL.LLIIIJ / displayMetrics.densityDpi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74590TPe(SmoothLinearLayoutManager smoothLinearLayoutManager, Context context) {
        super(context);
        this.LJIILL = smoothLinearLayoutManager;
    }

    @Override // X.C1C9, X.C0AB
    public final void LJFF(View view, C0AC c0ac, C0A9 c0a9) {
        int LJIIIIZZ = LJIIIIZZ(LJIILIIL(), view);
        int LJIIIZ = LJIIIZ(LJIILJJIL(), view);
        int LJIIL = LJIIL((int) Math.sqrt((LJIIIZ * LJIIIZ) + (LJIIIIZZ * LJIIIIZZ)));
        if (LJIIL > 0) {
            c0a9.LIZIZ(-LJIIIIZZ, -LJIIIZ, LJIIL, this.LJII);
        }
    }

    @Override // X.C1C9
    public final int LJII(int i, int i2, int i3, int i4, int i5) {
        return AnonymousClass030.LIZJ(i4, i3, 2, i3) - (((i2 - i) / 2) + i);
    }
}
