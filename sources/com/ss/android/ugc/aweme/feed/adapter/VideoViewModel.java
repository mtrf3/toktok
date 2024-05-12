package com.ss.android.ugc.aweme.feed.adapter;

import X.C198297qL;
import X.C2301491m;
import X.C2302691y;
import X.C2KN;
import X.C33Q;
import X.C36922EeM;
import X.C56162Ii;
import X.C82B;
import X.C86710Y1i;
import X.EnumC61792bf;
import X.IFM;
import X.JYH;
import X.QD3;
import Y.ARunnableS7S0201000_4;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class VideoViewModel extends FeedBaseHolderViewModel<C82B> {
    public static final /* synthetic */ int LJLJJI = 0;
    public final boolean LJLJI = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C82B(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean isHolderVM() {
        return this.LJLJI;
    }

    public final void hv0(C86710Y1i c86710Y1i) {
        setState(new AqS170S0100000_4(c86710Y1i, 374));
    }

    @QD3
    public final void setMuteIconState(C198297qL event) {
        o.LJIIIZ(event, "event");
        if (IFM.LIZ) {
            setState(new AqS169S0100000_3(event, 177));
        }
    }

    public final void iv0(int i, C2301491m c2301491m) {
        ARunnableS7S0201000_4 aRunnableS7S0201000_4 = new ARunnableS7S0201000_4(i, this, c2301491m, 0);
        if (C2302691y.LIZ()) {
            C56162Ii c56162Ii = new C56162Ii();
            c56162Ii.LIZJ = aRunnableS7S0201000_4;
            EnumC61792bf enumC61792bf = EnumC61792bf.RUN_IMMEDIATELY;
            if (enumC61792bf != null) {
                c56162Ii.LIZIZ = enumC61792bf;
            }
            c56162Ii.LIZ = "task_type_feed_on_idle";
            C2KN.LIZJ(c56162Ii);
        } else {
            aRunnableS7S0201000_4.run();
        }
        if (JYH.LIZIZ.LJIIJ()) {
            try {
                if (!EventBus.LIZJ().LJI(this)) {
                    EventBus.LIZJ().LJIILJJIL(this);
                }
            } catch (Exception e) {
                C36922EeM.LIZIZ(e, "OpenOnMute EventBus");
            }
        }
    }

    public final void jv0(final String str, final boolean z) {
        Runnable runnable = new Runnable() { // from class: X.9Mn
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C195357lb c195357lb = new C195357lb(str, z);
                    this.setState(new AqS170S0100000_4(c195357lb, 375));
                    this.setState(new AqS170S0100000_4(c195357lb, 376));
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        if (C2302691y.LIZ()) {
            C56162Ii c56162Ii = new C56162Ii();
            c56162Ii.LIZJ = runnable;
            EnumC61792bf enumC61792bf = EnumC61792bf.RUN_IMMEDIATELY;
            if (enumC61792bf != null) {
                c56162Ii.LIZIZ = enumC61792bf;
            }
            c56162Ii.LIZ = "task_type_feed_on_idle";
            C2KN.LIZJ(c56162Ii);
        } else {
            runnable.run();
        }
        if (JYH.LIZIZ.LJIIJ()) {
            try {
                if (EventBus.LIZJ().LJI(this)) {
                    EventBus.LIZJ().LJIJ(this);
                }
            } catch (Exception e) {
                C36922EeM.LIZIZ(e, "OpenOnMute EventBus");
            }
        }
    }
}
