package com.ss.android.ugc.aweme.dsp.playpage.queue;

import X.A2F;
import X.A2G;
import X.C221108m2;
import X.C2IZ;
import X.C33Q;
import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C61878OQg;
import X.C62822Ol8;
import X.C76800UCe;
import X.C8HZ;
import X.C91439Zud;
import X.C91513Zvp;
import X.C91614ZxS;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.QD3;
import android.content.Context;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import java.util.List;
import kotlin.jvm.internal.IDqS417S0100000_29;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes22.dex */
public final class MDQueueViewModel extends AssemListViewModel<C91614ZxS, InterfaceC57784Mm4, Long> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C91439Zud.class, "play_page"), true);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 47));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C91614ZxS(0);
    }

    public final C91439Zud gv0() {
        return (C91439Zud) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        gv0().getClass();
        throw null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        gv0().getClass();
        throw null;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new IDqS417S0100000_29(newListState, (C8HZ<InterfaceC57784Mm4>) 16));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onExpiredPlayableEvent(C2IZ event) {
        o.LJIIIZ(event, "event");
        List<ITEM> listGetAll = listGetAll();
        if (listGetAll != 0) {
            int i = 0;
            for (Object obj : listGetAll) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) obj;
                    if (interfaceC57784Mm4 instanceof C91513Zvp) {
                        C91513Zvp c91513Zvp = (C91513Zvp) interfaceC57784Mm4;
                        boolean isPlayableExpiredToday = ExpiredPlayableManager.INSTANCE.isPlayableExpiredToday(c91513Zvp.LJLIL);
                        if (c91513Zvp.LJLJJL != isPlayableExpiredToday) {
                            String id = c91513Zvp.LJLIL;
                            UrlModel pictureUrl = c91513Zvp.LJLILLLLZI;
                            String songName = c91513Zvp.LJLJI;
                            String artistName = c91513Zvp.LJLJJI;
                            InterfaceC88471Ynr<String, Context, C76800UCe> interfaceC88471Ynr = c91513Zvp.LJLJJLL;
                            c91513Zvp.getClass();
                            o.LJIIIZ(id, "id");
                            o.LJIIIZ(pictureUrl, "pictureUrl");
                            o.LJIIIZ(songName, "songName");
                            o.LJIIIZ(artistName, "artistName");
                            listSetItemAt(i, (int) new C91513Zvp(id, pictureUrl, songName, artistName, isPlayableExpiredToday, interfaceC88471Ynr));
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        gv0().getClass();
        throw null;
    }

    public final void hv0(Context context, String str) {
        gv0().getClass();
        throw null;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        A2F a2f = A2G.LIZ;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        a2f.getClass();
        return A2F.LIZ(c61878OQg);
    }
}
