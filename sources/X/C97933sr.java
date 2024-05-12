package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.SessionListReadStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavArg;
import com.ss.android.ugc.aweme.im.sdk.chatlist.viewmodel.SessionListUpdateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS34S0210000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.3sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97933sr implements C3LO<C3L4> {
    public final SessionListUpdateViewModel LJLIL;
    public final SessionListReadStatusViewModel LJLILLLLZI;
    public final C97463s6 LJLJI;
    public final C73305Spp LJLJJI;
    public final DMNavArg LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final C64962gm LJLJLJ;
    public boolean LJLJLLL;
    public final C73306Spq LJLL;

    public final void LIZ() {
        if (this.LJLJI.LJLZ() && this.LJLJLLL) {
            this.LJLJJI.setVisibility(0);
            this.LJLJJI.setStatus(this.LJLL);
        } else {
            this.LJLJJI.setVisibility(8);
        }
    }

    @QD3
    public final void onEvent(C31M event) {
        o.LJIIIZ(event, "event");
        C31N.LIZ();
    }

    @Override // X.C3LO
    public final void xE(boolean z) {
        this.LJLJI.showPullUpLoadMore();
    }

    @Override // X.C3LO
    public final void rn(List<C3L4> list, boolean z, boolean z2, C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        C43045Guv.LIZLLL(new AqS34S0210000_1(z, (boolean) list, (List<C3L4>) this, (C97933sr) 0), 0L);
    }

    public C97933sr(SessionListUpdateViewModel sessionListUpdateViewModel, SessionListReadStatusViewModel sessionListReadStatusViewModel, C97463s6 sessionListAdapter, C73305Spp c73305Spp, DMNavArg dMNavArg) {
        o.LJIIIZ(sessionListAdapter, "sessionListAdapter");
        this.LJLIL = sessionListUpdateViewModel;
        this.LJLILLLLZI = sessionListReadStatusViewModel;
        this.LJLJI = sessionListAdapter;
        this.LJLJJI = c73305Spp;
        this.LJLJJL = dMNavArg;
        this.LJLJJLL = true;
        this.LJLJLJ = C48841JEv.LIZ(C78613UtF.LIZ);
        this.LJLJLLL = true;
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
        c73305Spp.setVisibility(0);
        c73305Spp.LJFF();
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_direct_message;
        c2068389v.LIZIZ = C7MY.LIZIZ(70);
        c2068389v.LIZJ = C7MY.LIZIZ(70);
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        String string = c73305Spp.getContext().getString(R.string.i3b);
        o.LJIIIIZZ(string, "statusView.context.getSt…ring.message_empty_title)");
        c73306Spq.LJFF = string;
        String string2 = c73305Spp.getContext().getString(R.string.i3a);
        o.LJIIIIZZ(string2, "statusView.context.getSt…string.message_empty_des)");
        c73306Spq.LJI = string2;
        this.LJLL = c73306Spq;
    }
}
