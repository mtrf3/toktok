package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_search_tips_from_discover_pop")
/* loaded from: classes10.dex */
public final class LPG extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(LPC.LJLIL);
    public final int LJLJJI = SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJI;
    }

    public LPG(ActivityC45651qj activityC45651qj, TuxIconView tuxIconView) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = tuxIconView;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        C142425iQ c142425iQ = new C142425iQ(this.LJLIL);
        c142425iQ.LIZIZ(this.LJLILLLLZI);
        c142425iQ.LJI(WHL.BOTTOM);
        c142425iQ.LIZ.LJII = 5000L;
        c142425iQ.LIZ.LJIIIIZZ = C17N.LJIILL(8.0d);
        c142425iQ.LJIIIIZZ(AnonymousClass636.LJIIIIZZ(R.attr.eh, this.LJLIL));
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cqh, C16880lQ.LLZIL(this.LJLIL), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        ((TextView) LLLZIIL).setText(this.LJLIL.getText(((ISearchService) this.LJLJI.getValue()).LJLI()));
        c142425iQ.LIZ.LJIJ = LLLZIIL;
        int i = -C17N.LJIILL(12.0d);
        C82682Wcg c82682Wcg = c142425iQ.LIZ;
        c82682Wcg.LJFF = i;
        c82682Wcg.LJIJJLI = true;
        c142425iQ.LJ(new AqS159S0100000_9(wrapper, 1077));
        c142425iQ.LIZJ().show();
        ((ISearchService) this.LJLJI.getValue()).LJJLIIIJL();
    }
}
