package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import kotlin.jvm.internal.AqS190S0100000_8;

/* renamed from: X.JMo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49042JMo implements NIR {
    public final /* synthetic */ SearchVideoHolder LIZ;

    @Override // X.NIR
    public final void LJIL() {
        this.LIZ.LLLJIL();
    }

    @Override // X.NIR
    public final void LJJIIJ() {
        this.LIZ.LLLJIL();
    }

    @Override // X.NIR
    public final ViewGroup LJJJ() {
        return this.LIZ.LLFZ;
    }

    @Override // X.NIR
    public final ViewGroup LJJJJLI() {
        return this.LIZ.LLFII;
    }

    @Override // X.NIR
    public final void LJJJLL() {
        this.LIZ.LLLLLJLJLL();
    }

    @Override // X.NIR
    public final Context getContext() {
        return this.LIZ.LJLJLJ;
    }

    @Override // X.NIR
    public final String getEnterFrom() {
        return this.LIZ.LJLJL().LJFF;
    }

    @Override // X.NIR
    public final void LJJIJ() {
        JHI.LIZ().LJII = 53;
        SearchVideoHolder searchVideoHolder = this.LIZ;
        searchVideoHolder.onClick(searchVideoHolder.w0());
    }

    @Override // X.NIR
    public final void LJJJJZ() {
        JHI.LIZ().LJII = 54;
        SearchVideoHolder searchVideoHolder = this.LIZ;
        searchVideoHolder.onClick(searchVideoHolder.w0());
    }

    public C49042JMo(SearchVideoHolder searchVideoHolder) {
        this.LIZ = searchVideoHolder;
    }

    @Override // X.NIR
    public final void LJIIIZ(ViewGroup viewGroup) {
        JON jon;
        ViewParent viewParent;
        if (!C46314IFq.LIZIZ() || !C49044JMq.LIZ) {
            return;
        }
        SearchVideoHolder searchVideoHolder = this.LIZ;
        JON jon2 = null;
        if (!(viewGroup instanceof JON) || (jon = (JON) viewGroup) == null) {
            return;
        }
        searchVideoHolder.LLJJL = jon;
        C16880lQ.LJJJLZIJ(jon, new ACListenerS28S0100000_8(searchVideoHolder, 98));
        C49045JMr v0 = this.LIZ.v0();
        InterfaceC49066JNm interfaceC49066JNm = this.LIZ.LLJJI;
        if (interfaceC49066JNm != null) {
            viewParent = interfaceC49066JNm.LJJIII();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof JON) {
            jon2 = (JON) viewParent;
        }
        v0.LJLJLLL = jon2;
        SearchVideoHolder searchVideoHolder2 = this.LIZ;
        JON jon3 = searchVideoHolder2.LLJJL;
        if (jon3 == null) {
            return;
        }
        C78897Uxp.LJJJJLI(jon3, new AqS190S0100000_8(searchVideoHolder2, 80));
    }
}
