package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel;

import X.ActivityC45651qj;
import X.C100963xk;
import X.C100973xl;
import X.C100993xn;
import X.C106884Hk;
import X.C17N;
import X.C36L;
import X.C40I;
import X.C44L;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C63088OpQ;
import X.C63120Opw;
import X.C65777Prh;
import X.C73318Sq2;
import X.C84283Sm;
import X.C93363lU;
import X.C95773pN;
import X.C98563ts;
import X.C99033ud;
import X.V9W;
import Y.AObserverS69S0100000_1;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupTitleBarViewModel extends AssemViewModel<C100973xl> {
    public final C44L LJLIL;
    public final C73318Sq2 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C5H3 LJLJJI;
    public final C55749LuL LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final MutableLiveData<Integer> LJLJLJ;
    public final AObserverS69S0100000_1 LJLJLLL;

    public GroupTitleBarViewModel() {
        C106884Hk c106884Hk = new C106884Hk();
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLIL = c106884Hk;
        this.LJLILLLLZI = c73318Sq2;
        this.LJLJI = new C55749LuL(C47704Ins.LIZLLL(this, C40I.class, null), true);
        this.LJLJJI = C17N.LJJIJL(new AqS151S0100000_1(this, 845));
        this.LJLJJL = new C55749LuL(C47704Ins.LIZLLL(this, C100993xn.class, null), true);
        this.LJLJJLL = C17N.LJJIJL(new AqS151S0100000_1(this, 843));
        this.LJLJL = C17N.LJJIJL(new AqS151S0100000_1(this, 844));
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = new AObserverS69S0100000_1(this, 97);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C100973xl defaultState() {
        String str;
        int i;
        C63088OpQ coreInfo;
        C63120Opw gv0 = gv0();
        if (gv0 != null && (coreInfo = gv0.getCoreInfo()) != null) {
            str = coreInfo.getIcon();
        } else {
            str = null;
        }
        String LIZLLL = C84283Sm.LIZLLL(gv0());
        C63120Opw gv02 = gv0();
        if (gv02 != null) {
            i = gv02.getMemberCount();
        } else {
            i = 0;
        }
        return new C100973xl(str, C84283Sm.LJII(gv0()), LIZLLL, i, 5);
    }

    public final C63120Opw gv0() {
        return (C63120Opw) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C63120Opw gv0 = gv0();
        if (gv0 != null) {
            C95773pN c95773pN = C95773pN.LJLIL;
            long conversationShortId = gv0.getConversationShortId();
            MutableLiveData<Integer> liveData = this.LJLJLJ;
            c95773pN.getClass();
            o.LJIIIZ(liveData, "liveData");
            CopyOnWriteArrayList<MutableLiveData<Integer>> copyOnWriteArrayList = C95773pN.LJLJJI.get(Long.valueOf(conversationShortId));
            if (copyOnWriteArrayList != null) {
                C65777Prh.LIZ(copyOnWriteArrayList).remove(liveData);
            }
        }
        this.LJLJLJ.removeObserver(this.LJLJLLL);
        this.LJLILLLLZI.LIZLLL();
        super.onCleared();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPrepared() {
        /*
            r5 = this;
            super.onPrepared()
            X.Opw r0 = r5.gv0()
            r3 = 0
            if (r0 == 0) goto L1c
            X.3pN r4 = X.C95773pN.LJLIL
            long r1 = r0.getConversationShortId()
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r5.LJLJLJ
            r4.getClass()
            X.C95773pN.LIZIZ(r1, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L26
        L1c:
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r5.LJLJLJ
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setValue(r0)
        L26:
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r5.LJLJLJ
            Y.AObserverS69S0100000_1 r0 = r5.LJLJLLL
            r1.observeForever(r0)
            X.44L r1 = r5.LJLIL
            X.5H3 r0 = r5.LJLJL
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            X.Srp r2 = r1.LIZLLL(r0)
            kotlin.jvm.internal.AqS167S0100000_1 r1 = new kotlin.jvm.internal.AqS167S0100000_1
            r0 = 297(0x129, float:4.16E-43)
            r1.<init>(r5, r0)
            r0 = 3
            X.SrX r1 = X.C73542Ste.LJIIIIZZ(r2, r3, r3, r1, r0)
            X.Sq2 r0 = r5.LJLILLLLZI
            X.C78999UzT.LJFF(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupTitleBarViewModel.onPrepared():void");
    }

    public final void iv0(C63120Opw c63120Opw) {
        String str;
        C63088OpQ coreInfo = c63120Opw.getCoreInfo();
        if (coreInfo != null) {
            str = coreInfo.getIcon();
        } else {
            str = null;
        }
        setState(new C100963xk(str, C84283Sm.LIZLLL(c63120Opw), c63120Opw.getMemberCount(), C84283Sm.LJII(c63120Opw)));
    }

    public final void hv0(ActivityC45651qj activityC45651qj, String str) {
        boolean z;
        C63088OpQ coreInfo;
        if (!getState().LJLJJLL) {
            return;
        }
        C63120Opw gv0 = gv0();
        if (gv0 != null && (coreInfo = gv0.getCoreInfo()) != null && coreInfo.getOwner() == C36L.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        C93363lU.LIZ(((C99033ud) this.LJLJJI.getValue()).getConversationId(), str, z);
        V9W.LIZ(activityC45651qj, (C98563ts) this.LJLJJI.getValue(), 16, false);
    }
}
