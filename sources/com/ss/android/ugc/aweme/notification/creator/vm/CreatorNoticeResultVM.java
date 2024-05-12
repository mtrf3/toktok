package com.ss.android.ugc.aweme.notification.creator.vm;

import X.C221018lt;
import X.C221108m2;
import X.C33X;
import X.C54362LVe;
import X.C56678MMg;
import X.C56702MNe;
import X.C56732MOi;
import X.C56849MSv;
import X.C56870MTq;
import X.C56878MTy;
import X.C56879MTz;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65777Prh;
import X.C72922tc;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78886Uxe;
import X.EnumC56648MLc;
import X.EnumC56840MSm;
import X.INB;
import X.InterfaceC56771MPv;
import X.InterfaceC56830MSc;
import X.InterfaceC65784Pro;
import X.LVG;
import X.MOG;
import X.MPB;
import X.MT0;
import X.MT1;
import X.MT6;
import X.MT7;
import X.MTO;
import X.MTP;
import X.MTR;
import X.MTS;
import X.MTU;
import X.MU0;
import X.MU1;
import X.MU2;
import X.MU5;
import X.MUC;
import X.MWH;
import X.ORZ;
import X.X1D;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorNoticeResultVM extends AssemViewModel<MT0> implements InterfaceC56771MPv, InterfaceC56830MSc, MOG {
    public boolean LJLJJI;
    public boolean LJLLILLLL;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final String LJLIL = "notification_page";
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(MU1.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C56879MTz.LJLIL);
    public final Object LJLJJL = new Object();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(MU5.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(MU2.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C56878MTy.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C56870MTq.LJLIL);
    public MT7 LJLL = MT7.FIRST_REQUEST;
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(MU0.LJLIL);
    public boolean LJLLJ = true;

    @Override // X.InterfaceC56771MPv
    public final C56732MOi FR() {
        return null;
    }

    @Override // X.InterfaceC56771MPv
    public final void vl() {
        this.LJLJJI = true;
    }

    @Override // X.InterfaceC56771MPv
    public final MWH Kg0() {
        List<NoticeSortModel> list;
        int lv0 = lv0();
        NoticeTabModel noticeTabModel = getState().LJLIL;
        if (noticeTabModel != null) {
            list = noticeTabModel.sortOptionList;
        } else {
            list = null;
        }
        return new MWH(C78886Uxe.LJIL(lv0, list), nv0());
    }

    @Override // X.InterfaceC56830MSc
    public final void LJIIJJI() {
        withState(new AqS175S0100000_9(this, 161));
    }

    @Override // X.InterfaceC56771MPv
    public final CopyOnWriteArraySet<String> cJ() {
        return (CopyOnWriteArraySet) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final MT0 defaultState() {
        MUC muc = MUC.LIZ;
        C56849MSv c56849MSv = new C56849MSv(0);
        C33X c33x = C33X.LIZ;
        return new MT0(null, muc, muc, "", c33x, c33x, null, false, true, null, c56849MSv);
    }

    public final List<MusNotice> jv0() {
        return (List) this.LJLJLJ.getValue();
    }

    @Override // X.MOG
    public final NextLiveData<Boolean> ml0() {
        return (NextLiveData) this.LJLJI.getValue();
    }

    public final Map<Integer, NoticeItems> mv0() {
        return (Map) this.LJLJLLL.getValue();
    }

    public final List<MusNotice> ov0() {
        return (List) this.LJLJL.getValue();
    }

    @Override // X.InterfaceC56771MPv
    public final C73318Sq2 qz() {
        return new C73318Sq2();
    }

    public final List<MusNotice> rv0() {
        boolean z;
        List<MusNotice> ov0;
        List<MusNotice> LLJI;
        synchronized (this.LJLJJL) {
            boolean z2 = false;
            if (this.LJLLLL && this.LJLLL) {
                z = true;
            } else {
                z = false;
            }
            if (z || !this.LJLLILLLL) {
                z2 = true;
            }
            this.LJLLJ = z2;
            if (z) {
                ov0 = jv0();
            } else {
                ov0 = ov0();
            }
            LLJI = ORZ.LLJI(ov0);
        }
        return LLJI;
    }

    @Override // X.InterfaceC56771MPv
    public final String iN() {
        String nv0 = nv0();
        if (nv0 == null) {
            return "";
        }
        return nv0;
    }

    public final List<Integer> kv0() {
        List<Integer> LIZ = getState().LJLJI.LIZ();
        if (LIZ == null) {
            return C61878OQg.INSTANCE;
        }
        return LIZ;
    }

    public final int lv0() {
        Integer LIZ = getState().LJLILLLLZI.LIZ();
        if (LIZ != null) {
            return LIZ.intValue();
        }
        return 0;
    }

    public final String nv0() {
        NoticeTabModel noticeTabModel = getState().LJLIL;
        if (noticeTabModel != null) {
            return noticeTabModel.trackingName;
        }
        return null;
    }

    @Override // X.InterfaceC56771MPv
    public final EnumC56648MLc Aw() {
        return EnumC56648MLc.GONE;
    }

    @Override // X.InterfaceC56771MPv
    public final int az() {
        return C56702MNe.LIZ;
    }

    @Override // X.InterfaceC56771MPv
    public final boolean eo0() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC56771MPv
    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public final void iv0(EnumC56840MSm expandReason) {
        o.LJIIIZ(expandReason, "expandReason");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(nv0());
        LIZ.append(", expand start, expandReason: ");
        LIZ.append(expandReason);
        C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ));
        if (expandReason == EnumC56840MSm.USER_CLICK) {
            withState(new AqS175S0100000_9(this, 534));
        }
        synchronized (this.LJLJJL) {
            try {
                if (this.LJLLL) {
                    try {
                        this.LJLLL = false;
                        if (!(getState().LJLJJLL instanceof C72922tc)) {
                            setState(new AqS175S0100000_9(this, 160));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void qv0(MT7 requestType) {
        o.LJIIIZ(requestType, "requestType");
        setState(MTP.LJLIL);
        this.LJLL = requestType;
        switch (MT6.LIZ[requestType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                setState(MTR.LJLIL);
                ((LiveData) this.LJLLI.getValue()).postValue(Boolean.TRUE);
                cJ().clear();
                break;
            case 6:
            case 7:
                setState(MTS.LJLIL);
                cJ().clear();
                break;
            case 8:
                setState(MTU.LJLIL);
                break;
        }
        withState(new AqS140S0200000_9(this, requestType, 17));
    }

    public final void sv0(MT1 mt1) {
        boolean z;
        synchronized (this.LJLJJL) {
            ov0().clear();
            ov0().addAll(mt1.LIZ);
            jv0().clear();
            jv0().addAll(mt1.LIZLLL);
            if (!mt1.LIZLLL.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            this.LJLLLL = z;
            this.LJLLILLLL = mt1.LJ;
        }
    }

    public static void gv0(int i, int i2) {
        if (i != Integer.MIN_VALUE && i != 0) {
            C54362LVe.LIZJ(LVG.Normal, i);
            C76800UCe c76800UCe = C76800UCe.LIZ;
            if ((!INB.LIZIZ()) && c76800UCe != null) {
                C54362LVe.LIZIZ(260);
            }
            C56678MMg.LJIIJJI();
            return;
        }
        MPB.LIZ(i2);
    }

    public static void hv0(MusNotice musNotice, List list) {
        Object obj;
        if (musNotice != null && !musNotice.hasRead) {
            Iterator it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!((BaseNotice) next).hasRead) {
                    if (next != null) {
                        return;
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (next2 instanceof MTO) {
                    obj = next2;
                    break;
                }
            }
            C65777Prh.LIZ(list).remove(obj);
        }
    }

    @Override // X.InterfaceC56771MPv
    public final void vP(BaseNotice baseNotice, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        MPB.LIZIZ(this, baseNotice, interfaceC65784Pro);
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x04a9, code lost:
    
        if (r13 >= r15.size()) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04ab, code lost:
    
        r15 = r14.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04b0, code lost:
    
        if (r6 >= r15) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04b2, code lost:
    
        r15.LIZIZ(r13 + r6, (com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) com.bytedance.mt.protector.impl.collections.ListProtector.get(r14, r6));
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04fd, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("Insert extra, index: ");
        r1.append(r13);
        X.C221018lt.LJFF("Creators_Inbox:DataProcessHelper", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ee A[Catch: all -> 0x05c7, TryCatch #0 {, blocks: (B:99:0x02ae, B:101:0x02b2, B:102:0x02b7, B:104:0x02c1, B:105:0x02c5, B:109:0x02e0, B:111:0x02ee, B:112:0x02fb, B:114:0x0301, B:117:0x030e, B:120:0x0314, B:126:0x0318, B:127:0x031c, B:129:0x0322, B:273:0x02d5, B:276:0x02d0), top: B:98:0x02ae }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pv0(X.AbstractC72932td<com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse> r32, X.AbstractC72932td<com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse> r33, X.MT7 r34, com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel r35) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM.pv0(X.2td, X.2td, X.MT7, com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel):void");
    }
}
