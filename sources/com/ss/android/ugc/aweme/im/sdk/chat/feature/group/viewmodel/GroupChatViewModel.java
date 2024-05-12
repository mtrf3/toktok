package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel;

import X.AbstractC63505Ow9;
import X.ActivityC45651qj;
import X.C221108m2;
import X.C30591Hz;
import X.C36L;
import X.C38350F3i;
import X.C3Q9;
import X.C4WC;
import X.C62822Ol8;
import X.C63088OpQ;
import X.C63120Opw;
import X.C65777Prh;
import X.C75782yE;
import X.C84283Sm;
import X.C90643h6;
import X.C93363lU;
import X.C95773pN;
import X.C98563ts;
import X.V9W;
import Y.IDcS364S0100000_1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final C98563ts LJLIL;
    public final C3Q9 LJLILLLLZI;
    public final MutableLiveData<Integer> LJLJI;
    public final MutableLiveData<C63120Opw> LJLJJI;
    public final MutableLiveData LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final LiveData<Boolean> LJLJL;
    public final MutableLiveData<Boolean> LJLJLJ;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C63120Opw c63120Opw = (C63120Opw) this.LJLJJLL.getValue();
        if (c63120Opw != null) {
            C95773pN c95773pN = C95773pN.LJLIL;
            long conversationShortId = c63120Opw.getConversationShortId();
            MutableLiveData<Integer> liveData = this.LJLJI;
            c95773pN.getClass();
            o.LJIIIZ(liveData, "liveData");
            CopyOnWriteArrayList<MutableLiveData<Integer>> copyOnWriteArrayList = C95773pN.LJLJJI.get(Long.valueOf(conversationShortId));
            if (copyOnWriteArrayList != null) {
                C65777Prh.LIZ(copyOnWriteArrayList).remove(liveData);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupChatViewModel(C98563ts sessionInfo) {
        C75782yE c75782yE = C3Q9.LIZ;
        c75782yE.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        this.LJLIL = sessionInfo;
        this.LJLILLLLZI = c4wc;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LJLJI = mutableLiveData;
        MutableLiveData<C63120Opw> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJI = mutableLiveData2;
        this.LJLJJL = mutableLiveData2;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 842));
        this.LJLJJLL = LIZIZ;
        LiveData<Boolean> map = Transformations.map(mutableLiveData2, C30591Hz.LJLILLLLZI);
        o.LJIIIIZZ(map, "map(conversationInfo) {\n…sGroupChatValid(it)\n    }");
        this.LJLJL = map;
        this.LJLJLJ = new MutableLiveData<>();
        C63120Opw c63120Opw = (C63120Opw) LIZIZ.getValue();
        if (c63120Opw != null) {
            C95773pN c95773pN = C95773pN.LJLIL;
            long conversationShortId = c63120Opw.getConversationShortId();
            c95773pN.getClass();
            C95773pN.LIZIZ(conversationShortId, mutableLiveData);
        } else {
            mutableLiveData.setValue(0);
            Long LJJIZ = C38350F3i.LJJIZ(sessionInfo.getConversationId());
            if (LJJIZ != null) {
                long longValue = LJJIZ.longValue();
                c75782yE.getClass();
                C75782yE.LIZ();
                c4wc.LJIJ(sessionInfo.getConversationId(), longValue, AbstractC63505Ow9.LIZIZ, new IDcS364S0100000_1(this, 13));
            }
        }
        mutableLiveData2.setValue(LIZIZ.getValue());
        C63120Opw c63120Opw2 = (C63120Opw) LIZIZ.getValue();
        if (c63120Opw2 != null) {
            C90643h6.LIZ(c63120Opw2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void gv0(ActivityC45651qj activityC45651qj, String str) {
        boolean z;
        C63088OpQ coreInfo;
        if (!C84283Sm.LJII((C63120Opw) this.LJLJJL.getValue())) {
            return;
        }
        C63120Opw c63120Opw = (C63120Opw) this.LJLJJL.getValue();
        if (c63120Opw != null && (coreInfo = c63120Opw.getCoreInfo()) != null && coreInfo.getOwner() == C36L.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        C93363lU.LIZ(this.LJLIL.getConversationId(), str, z);
        V9W.LIZ(activityC45651qj, this.LJLIL, 16, false);
    }
}
