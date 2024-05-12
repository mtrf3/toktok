package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;

/* renamed from: X.JMp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49043JMp implements N6L {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ SearchVideoHolder LIZIZ;

    @Override // X.N6L
    public final void LIZ() {
        this.LIZIZ.LLLJIL();
    }

    @Override // X.N6L
    public final void LIZIZ() {
        this.LIZIZ.LLLLLJLJLL();
    }

    @Override // X.N6L
    public final void LIZJ() {
        SearchVideoHolder searchVideoHolder = this.LIZIZ;
        searchVideoHolder.onClick(searchVideoHolder.w0());
    }

    @Override // X.N6L
    public final AqS158S0100000_8 LJIIJ() {
        return new AqS158S0100000_8(this.LIZIZ, 659);
    }

    @Override // X.N6L
    public final AqS190S0100000_8 LJIIJJI() {
        return new AqS190S0100000_8(this.LIZIZ, 79);
    }

    @Override // X.N6L
    public final ProductAnchor LJLLILLLL() {
        return this.LIZIZ.LLJILLL;
    }

    @Override // X.InterfaceC58801N5x
    public final Context getContext() {
        return this.LIZIZ.LJLJLJ;
    }

    @Override // X.N6L
    public final String getEnterFrom() {
        return this.LIZIZ.LJLJL().LJFF;
    }

    @Override // X.InterfaceC58801N5x
    public final Aweme getAweme() {
        return this.LIZ;
    }

    @Override // X.N6L
    public final void LJIIIZ(ViewGroup viewGroup) {
        JON jon;
        if (!C46314IFq.LIZIZ() || !C49044JMq.LIZ) {
            return;
        }
        SearchVideoHolder searchVideoHolder = this.LIZIZ;
        if (!(viewGroup instanceof JON) || (jon = (JON) viewGroup) == null) {
            return;
        }
        searchVideoHolder.LLJJL = jon;
        C16880lQ.LJJJLZIJ(jon, new ACListenerS28S0100000_8(searchVideoHolder, 97));
        C49045JMr v0 = this.LIZIZ.v0();
        SearchVideoHolder searchVideoHolder2 = this.LIZIZ;
        JON jon2 = searchVideoHolder2.LLJJL;
        v0.LJLJLLL = jon2;
        if (jon2 == null) {
            return;
        }
        C78897Uxp.LJJJJLI(jon2, new AqS190S0100000_8(searchVideoHolder2, 78));
    }

    public C49043JMp(Aweme aweme, SearchVideoHolder searchVideoHolder) {
        this.LIZ = aweme;
        this.LIZIZ = searchVideoHolder;
    }
}
