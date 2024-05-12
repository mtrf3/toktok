package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NR9 extends NR4 implements IVK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NR9(NRC omsdkService) {
        super(omsdkService);
        o.LJIIIZ(omsdkService, "omsdkService");
    }

    @Override // X.NR4
    public final View LJIL(Activity activity) {
        return this.LIZIZ.LJIILIIL();
    }

    @Override // X.NR4, X.NIT
    public final void LJIIJJI(Context context, View view, Aweme aweme) {
        o.LJIIIZ(context, "context");
        super.LJIIJJI(context, view, aweme);
    }

    @Override // X.NR4, X.NIT
    public final void LJII(int i, Context context, View view, Aweme aweme) {
        o.LJIIIZ(context, "context");
        NR4.LJIJJLI(aweme);
        super.LJII(i, context, view, aweme);
    }

    @Override // X.NR4, X.NIT
    public final void LJIIJ(int i, Context context, View view, Aweme aweme) {
        o.LJIIIZ(context, "context");
        NR4.LJIJJLI(aweme);
        super.LJIIJ(i, context, view, aweme);
    }

    @Override // X.NR4, X.NIT
    public final void LJIIZILJ(int i, Context context, View view, Aweme aweme) {
        super.LJIIZILJ(i, context, view, aweme);
    }

    @Override // X.IVK
    public final void LJI(View adView, Context context, Aweme aweme, IVK ivk, C61878OQg friendlyView) {
        o.LJIIIZ(adView, "adView");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(friendlyView, "friendlyView");
        NRF LJIJJLI = NR4.LJIJJLI(aweme);
        LJIIIZ(adView, aweme);
        this.LIZ.LIZIZ(ivk);
        this.LIZ.LJIIJJI(LJIJJLI, context, adView, LJJ(context, adView));
    }
}
