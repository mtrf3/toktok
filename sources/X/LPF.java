package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.search.SearchIconTipsHelper;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_search_tips_pop")
/* loaded from: classes10.dex */
public final class LPF extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final C62822Ol8 LJLJJI;
    public final int LJLJJL;

    @Override // X.M74
    public final boolean canShow() {
        if (((ISearchService) this.LJLJJI.getValue()).LLLLLZIL() && SearchIconTipsHelper.LJLIL.LIZJ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJL;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        C142425iQ c142425iQ = new C142425iQ(this.LJLIL);
        TuxIconView tuxIconView = this.LJLILLLLZI;
        o.LJI(tuxIconView);
        c142425iQ.LIZ.LIZIZ = tuxIconView;
        c142425iQ.LJI(WHL.BOTTOM);
        c142425iQ.LIZ.LJII = 5000L;
        c142425iQ.LIZ.LJIIIIZZ = C17N.LJIILL(8.0d);
        c142425iQ.LJIIIIZZ(AnonymousClass636.LJIIIIZZ(R.attr.eh, this.LJLIL));
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cqh, C16880lQ.LLZIL(this.LJLIL), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        ((TextView) LLLZIIL).setText(this.LJLIL.getText(R.string.a1g));
        c142425iQ.LIZ.LJIJ = LLLZIIL;
        int i = -C17N.LJIILL(12.0d);
        C82682Wcg c82682Wcg = c142425iQ.LIZ;
        c82682Wcg.LJFF = i;
        c82682Wcg.LJIJJLI = true;
        c142425iQ.LJ(new AqS159S0100000_9(wrapper, 1078));
        InterfaceC82683Wch LIZJ = c142425iQ.LIZJ();
        LIZJ.LJ(new LPH(this));
        if (!LIZJ.isShowing()) {
            LIZJ.show();
        }
    }

    public LPF(ActivityC45651qj activity, TuxIconView tuxIconView, AqS159S0100000_9 aqS159S0100000_9) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = tuxIconView;
        this.LJLJI = aqS159S0100000_9;
        this.LJLJJI = C221108m2.LIZIZ(LPE.LJLIL);
        this.LJLJJL = SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT;
    }
}
