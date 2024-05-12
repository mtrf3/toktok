package X;

import android.view.View;
import com.ss.android.ugc.aweme.dsp.arch.DspFeedBaseItemCell;
import kotlin.jvm.internal.o;

/* renamed from: X.Ztx, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91397Ztx extends F9E {
    public final C8W0 LJLIL;
    public final InterfaceC212878Xb<DspFeedBaseItemCell, C91395Ztv> LJLILLLLZI;
    public final View LJLJI;
    public final C91398Zty LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C91397Ztx(C8W0 viewPagerAssem, InterfaceC212878Xb<DspFeedBaseItemCell, C91395Ztv> proxyer, View view, C91398Zty c91398Zty) {
        o.LJIIIZ(viewPagerAssem, "viewPagerAssem");
        o.LJIIIZ(proxyer, "proxyer");
        this.LJLIL = viewPagerAssem;
        this.LJLILLLLZI = proxyer;
        this.LJLJI = view;
        this.LJLJJI = c91398Zty;
    }
}
