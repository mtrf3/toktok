package com.ss.android.ugc.aweme.search.detail.filter.viewmodel;

import X.C1JD;
import X.C201667vm;
import X.C252449vU;
import X.C50420Jqa;
import X.C50653JuL;
import X.C50654JuM;
import X.C51526KKc;
import X.C51527KKd;
import X.C51528KKe;
import X.EnumC51554KLe;
import X.QD3;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes9.dex */
public final class FilterVM extends AssemViewModel<C252449vU> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C252449vU defaultState() {
        return new C252449vU(0);
    }

    public FilterVM() {
        C1JD.LJJJIL(EventBus.LIZJ(), this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1JD.LJJJJ(EventBus.LIZJ(), this);
    }

    public static void gv0(int i) {
        C50653JuL.LJLILLLLZI.getClass();
        Map LIZIZ = C50654JuM.LIZIZ();
        C51528KKe c51528KKe = new C51528KKe();
        c51528KKe.LJIJI((String) LIZIZ.get("enter_from_merge"));
        c51528KKe.LJIIZILJ("search_keyword", (String) LIZIZ.get("search_keyword"));
        c51528KKe.LJIIZILJ("search_id", (String) LIZIZ.get("search_id"));
        c51528KKe.LJIIZILJ("group_id", (String) LIZIZ.get("group_id"));
        c51528KKe.LJIIZILJ("is_success", String.valueOf(i));
        c51528KKe.LJIILIIL();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onMaskCancelEvent(C201667vm cancelVideoMaskEvent) {
        o.LJIIIZ(cancelVideoMaskEvent, "cancelVideoMaskEvent");
        setState(C51526KKc.LJLIL);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onVideoEvent(C50420Jqa videoEvent) {
        o.LJIIIZ(videoEvent, "videoEvent");
        if (videoEvent.LJLIL == 13) {
            Object obj = videoEvent.LJLILLLLZI;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            setState(new AqS29S1000000_4((String) obj, 20));
        }
    }

    public final void hv0(EnumC51554KLe enterMethod, int i) {
        o.LJIIIZ(enterMethod, "enterMethod");
        C252449vU state = getState();
        Iterator<Aweme> it = state.LJLIL.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next().getAid(), state.LJLJJI)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        C50653JuL.LJLILLLLZI.getClass();
        Map LIZIZ = C50654JuM.LIZIZ();
        C51527KKd c51527KKd = new C51527KKd();
        c51527KKd.LJIIZILJ("enter_method", enterMethod.getEventValue());
        c51527KKd.LJIJI((String) LIZIZ.get("enter_from_merge"));
        c51527KKd.LJIIZILJ("search_keyword", (String) LIZIZ.get("search_keyword"));
        c51527KKd.LJIIZILJ("search_id", (String) LIZIZ.get("search_id"));
        c51527KKd.LJIJ("search_result_id", (String) LIZIZ.get("search_result_id"));
        c51527KKd.LJIIZILJ("group_id", (String) LIZIZ.get("group_id"));
        c51527KKd.LJIIZILJ("item_num", String.valueOf(i));
        c51527KKd.LJJI(Integer.valueOf(i2));
        c51527KKd.LJIILIIL();
    }
}
