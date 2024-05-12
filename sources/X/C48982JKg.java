package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLivePlayerAssem;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.JKg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48982JKg extends AbstractC48937JIn {
    public final /* synthetic */ SearchCardLivePlayerAssem LJLIL;

    @Override // X.AbstractC48937JIn, X.JUO
    public final void onError(String info) {
        o.LJIIIZ(info, "info");
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LIZ() {
        SearchCardLivePlayerAssem searchCardLivePlayerAssem = this.LJLIL;
        searchCardLivePlayerAssem.LLII = true;
        Iterator<InterfaceC48983JKh> it = searchCardLivePlayerAssem.n4().iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LIZIZ() {
        Iterator<InterfaceC48983JKh> it = this.LJLIL.n4().iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LJIIIZ() {
        this.LJLIL.m4().setVisibility(8);
        Object value = this.LJLIL.LLFFF.getValue();
        o.LJIIIIZZ(value, "<get-searchLiveViewContainer>(...)");
        ((View) value).setBackgroundColor(-16777216);
        Iterator<InterfaceC48983JKh> it = this.LJLIL.n4().iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ();
        }
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void onPause() {
        Iterator<InterfaceC48983JKh> it = this.LJLIL.n4().iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public C48982JKg(SearchCardLivePlayerAssem searchCardLivePlayerAssem) {
        this.LJLIL = searchCardLivePlayerAssem;
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LJI(int i, int i2, View view) {
        SearchCardLivePlayerAssem searchCardLivePlayerAssem = this.LJLIL;
        Object value = searchCardLivePlayerAssem.LLFFF.getValue();
        o.LJIIIIZZ(value, "<get-searchLiveViewContainer>(...)");
        View view2 = (View) value;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width <= 0 || height <= 0 || searchCardLivePlayerAssem.p4().getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = searchCardLivePlayerAssem.p4().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (i > i2) {
            layoutParams2.gravity = 17;
            return;
        }
        float f = i2 / i;
        float f2 = width;
        if (f >= height / f2) {
            layoutParams2.height = height;
        } else {
            layoutParams2.height = (int) (f2 * f);
        }
        layoutParams2.gravity = 17;
        searchCardLivePlayerAssem.p4().setLayoutParams(layoutParams2);
    }
}
