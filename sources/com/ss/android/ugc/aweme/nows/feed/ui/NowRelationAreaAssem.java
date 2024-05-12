package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC193947jK;
import X.C113554cx;
import X.C181847Bs;
import X.C193707iw;
import X.C193717ix;
import X.C193807j6;
import X.C193887jE;
import X.C194237jn;
import X.C194437k7;
import X.C195937mX;
import X.C196367nE;
import X.C197267og;
import X.C199927sy;
import X.C199947t0;
import X.C1DF;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C226668v0;
import X.C226678v1;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C79045V0n;
import X.C7MK;
import X.C7ML;
import X.C7MY;
import X.C7O8;
import X.C8XO;
import X.C8YN;
import X.EnumC112694bZ;
import X.EnumC57853MnB;
import X.EnumC86195XsF;
import X.InterfaceC115514g7;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.MCQ;
import X.MCR;
import X.OSZ;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowRelationAreaAssem extends ReusedUIContentAssem<NowRelationAreaAssem> implements C8XO<InterfaceC194547kI>, InterfaceC194257jp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final InterfaceC115514g7 LLD;
    public final C55749LuL LLF;

    static {
        TBT tbt = new TBT(NowRelationAreaAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowRelationAreaAssem() {
        new LinkedHashMap();
        this.LJZL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 638));
        this.LL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 637));
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LLD = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 639), null, C193807j6.INSTANCE, null, null);
        this.LLF = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
    }

    public final NowPostCellViewModel Z3() {
        return (NowPostCellViewModel) this.LLD.LIZ(this, LLFF[0]);
    }

    public final RelationButton a4() {
        Object value = this.LL.getValue();
        o.LJIIIIZZ(value, "<get-nowRelationButton>(...)");
        return (RelationButton) value;
    }

    public final void c4() {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        String str;
        Context context = getContext();
        if (context != null && (author = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null) {
            Object value = this.LJZL.getValue();
            o.LJIIIIZZ(value, "<get-nowRelationLabel>(...)");
            ((View) value).setVisibility(0);
            C193717ix c193717ix = new C193717ix();
            c193717ix.LIZ = getEnterFrom();
            c193717ix.LIZIZ = 0;
            C197267og LJJIJIL = C1DF.LJJIJIL(matchedFriendStruct);
            if (LJJIJIL == null) {
                LJJIJIL = new C197267og();
            }
            c193717ix.LIZJ = new MCR(context, LJJIJIL, new MCQ(C7MY.LIZIZ(28), C7MY.LIZIZ(2), Integer.valueOf(R.attr.d4), 3, 0.0f, 0.0f, 0, 0, (Boolean) null, (EnumC86195XsF) null, true, 3056));
            c193717ix.LIZLLL = C7MY.LIZIZ(8);
            c193717ix.LJ = 51;
            c193717ix.LJFF = C79045V0n.LJI(R.attr.dk, context);
            OSZ[] oszArr = new OSZ[2];
            NowPostInfo nowPostInfo = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().nowPostInfo;
            if (nowPostInfo == null || (str = nowPostInfo.getNowMediaType()) == null) {
                str = "";
            }
            oszArr[0] = new OSZ("now_type", str);
            oszArr[1] = new OSZ("now_card_type", C7MK.LIZIZ(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme()));
            c193717ix.LJI = C113554cx.LJJL(oszArr);
            C199927sy LIZ = c193717ix.LIZ();
            Object value2 = this.LJZL.getValue();
            o.LJIIIIZZ(value2, "<get-nowRelationLabel>(...)");
            ((C199947t0) value2).LIZIZ(LIZ);
            Object value3 = this.LJZL.getValue();
            o.LJIIIIZZ(value3, "<get-nowRelationLabel>(...)");
            ((C199947t0) value3).LIZ(matchedFriendStruct);
        }
        C226668v0 c226668v0 = new C226668v0();
        c226668v0.LIZ = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAuthor();
        c226668v0.LIZJ(EnumC57853MnB.CUSTOM_TT_NOW_POST);
        c226668v0.LIZIZ = false;
        c226668v0.LIZIZ(EnumC112694bZ.FRIENDS);
        c226668v0.LJIIIZ = this;
        c226668v0.LJIIIIZZ = true;
        C226678v1 LIZ2 = c226668v0.LIZ();
        a4().setClickable(true);
        a4().LLIIIJ.LJJJJJL(LIZ2);
        a4().setTracker(new AqS153S0100000_3(this, 1703));
        getContainerView().setAlpha(1.0f);
        getContainerView().setVisibility(0);
        NowPostCellViewModel Z3 = Z3();
        Z3.getClass();
        Z3.setState(new AqS8S0010000_3(true, 5));
    }

    public final String getEnterFrom() {
        return C7MK.LIZLLL(((C181847Bs) this.LLF.getValue()).LJLILLLLZI, (C7ML) C51029K0z.LJIILLIIL(this));
    }

    public final boolean b4() {
        AbstractC193947jK abstractC193947jK = Z3().getState().LJLIL;
        abstractC193947jK.getClass();
        if (!(abstractC193947jK instanceof C193887jE)) {
            return false;
        }
        C196367nE c196367nE = C196367nE.LIZ;
        Aweme aweme = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme();
        c196367nE.getClass();
        o.LJIIIZ(aweme, "aweme");
        if (!C196367nE.LJFF(aweme) || !C196367nE.LJIIJJI(aweme) || !C195937mX.LJI(aweme)) {
            return false;
        }
        return true;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, Z3());
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        a4().setTuxFont(33);
        Z3().hv0(this, C213688a4.LIZLLL());
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.7O7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C194437k7) obj).LJLLI);
            }
        }, C213688a4.LIZLLL(), C7O8.LJLIL, 4);
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.7j7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C194437k7) obj).LJLJLJ;
            }
        }, C213688a4.LIZLLL(), C193707iw.LJLIL, 4);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    @Override // X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        if (b4()) {
            c4();
        } else {
            getContainerView().setVisibility(8);
        }
    }
}
