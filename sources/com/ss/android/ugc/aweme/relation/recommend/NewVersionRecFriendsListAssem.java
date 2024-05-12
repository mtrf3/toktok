package com.ss.android.ugc.aweme.relation.recommend;

import X.AbstractC57781Mm1;
import X.AbstractC57828Mmm;
import X.AbstractC58014Mpm;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188727au;
import X.C212428Vi;
import X.C221108m2;
import X.C223208pQ;
import X.C223338pd;
import X.C235119Kp;
import X.C252709vu;
import X.C25770A9m;
import X.C25771A9n;
import X.C26045AKb;
import X.C26338AVi;
import X.C32151Nz;
import X.C33X;
import X.C3C1;
import X.C47704Ins;
import X.C52342KgU;
import X.C52343KgV;
import X.C55749LuL;
import X.C57778Mly;
import X.C57830Mmo;
import X.C57831Mmp;
import X.C57856MnE;
import X.C57858MnG;
import X.C57859MnH;
import X.C57866MnO;
import X.C57867MnP;
import X.C57930MoQ;
import X.C57934MoU;
import X.C58041MqD;
import X.C58042MqE;
import X.C58044MqG;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72912tb;
import X.C72922tc;
import X.C73305Spp;
import X.C7FC;
import X.C94293mz;
import X.C9KF;
import X.FMX;
import X.InterfaceC57784Mm4;
import X.InterfaceC57910Mo6;
import X.KNV;
import X.MG5;
import X.MGN;
import X.O6R;
import X.SIT;
import X.SY4;
import X.SYL;
import X.UPT;
import X.UQ6;
import X.UQ7;
import Y.ACListenerS29S0100000_9;
import Y.ARunnableS28S0200000_9;
import Y.IDcS38S0100000_9;
import Y.IDrS13S0200000_9;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NewVersionRecFriendsListAssem extends UIContentAssem implements InterfaceC57910Mo6 {
    public C252709vu LJLIL;
    public C223338pd LJLILLLLZI;
    public AbstractC58014Mpm LJLJI;
    public final C55749LuL LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    public NewVersionRecFriendsListAssem() {
        new LinkedHashMap();
        this.LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, C58042MqE.class, null), checkSupervisorPrepared());
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 564));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 563));
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 565));
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJJLL.getValue();
    }

    public final C58041MqD v3() {
        return (C58041MqD) this.LJLJJL.getValue();
    }

    public final SYL x3() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        UQ6.LIZJ("follow_rec", "background");
    }

    public final void A3(boolean z) {
        if (z) {
            C223338pd c223338pd = this.LJLILLLLZI;
            if (c223338pd != null) {
                c223338pd.setVisibility(0);
                C223338pd c223338pd2 = this.LJLILLLLZI;
                if (c223338pd2 != null) {
                    c223338pd2.LIZIZ();
                    return;
                } else {
                    o.LJIJI("loadingBallView");
                    throw null;
                }
            }
            o.LJIJI("loadingBallView");
            throw null;
        }
        C223338pd c223338pd3 = this.LJLILLLLZI;
        if (c223338pd3 != null) {
            c223338pd3.setVisibility(8);
            C223338pd c223338pd4 = this.LJLILLLLZI;
            if (c223338pd4 != null) {
                c223338pd4.LIZJ();
                return;
            } else {
                o.LJIJI("loadingBallView");
                throw null;
            }
        }
        o.LJIJI("loadingBallView");
        throw null;
    }

    public final void C3(ActivityC45651qj activityC45651qj) {
        C26045AKb c26045AKb = new C26045AKb(getContainerView());
        c26045AKb.LJIIIZ(v3().getToast());
        c26045AKb.LJIIJ();
        getContainerView().postDelayed(new ARunnableS28S0200000_9(activityC45651qj, this, 27), 1000L);
    }

    public final void E3(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj != null) {
            ((SocialRecFlowModel) ViewModelProviders.of(activityC45651qj).get(SocialRecFlowModel.class)).LJLILLLLZI.postValue(new Bundle());
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        if ((abstractC57828Mmm instanceof C57830Mmo) || (abstractC57828Mmm instanceof C57831Mmp)) {
            UPT.LJ(3, UQ7.NEW_VERSION_RECOMMEND.getValue());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LinearLayoutManager linearLayoutManager;
        boolean z;
        ActivityC45651qj activityC45651qj;
        Object LIZJ;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL x3 = x3();
        x3.setVisibility(0);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ayd, C16880lQ.LLZIL(x3.getContext()), null);
        ((TextView) LLLZIIL.findViewById(R.id.title)).setText(v3().getTitle());
        ((TextView) LLLZIIL.findViewById(R.id.jjg)).setText(v3().getSubTitle());
        ((TuxTextView) LLLZIIL.findViewById(R.id.title)).LJJJ(38.0f);
        x3.LJLJL(0, LLLZIIL);
        if (C52342KgU.LIZIZ()) {
            getContext();
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(2);
            wrapGridLayoutManager.LLIILII = new IDcS38S0100000_9(this, 2);
            linearLayoutManager = wrapGridLayoutManager;
        } else {
            getContext();
            linearLayoutManager = new LinearLayoutManager();
        }
        x3().setLayoutManager(linearLayoutManager);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bfj);
        tuxIconView.setVisibility(0);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS29S0100000_9(this, 59));
        View findViewById = view.findViewById(R.id.l_2);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.title_bar)");
        C252709vu c252709vu = (C252709vu) findViewById;
        this.LJLIL = c252709vu;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZ(v3().getTitle());
        c235119Kp.LIZJ = c9kf;
        c252709vu.setNavActions(c235119Kp);
        x3().LJIIJJI(new IDrS13S0200000_9(linearLayoutManager, this, 0));
        SY4 sy4 = (SY4) view.findViewById(R.id.aog);
        if (((Number) C52343KgV.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = 5;
        if (z) {
            sy4.setButtonVariant(5);
        }
        sy4.setText(v3().getButtonText());
        C7FC.LIZJ(sy4, 0.75f);
        C16880lQ.LJJIZ(sy4, new ACListenerS29S0100000_9(this, 60));
        View findViewById2 = view.findViewById(R.id.g85);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.loading_ball_view)");
        this.LJLILLLLZI = (C223338pd) findViewById2;
        C26338AVi.LJIIIZ(x3(), null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20))), null, 27);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null) {
            activityC45651qj = C212428Vi.LIZ(this);
        } else {
            activityC45651qj = null;
        }
        C57858MnG c57858MnG = new C57858MnG(activityC45651qj, LIZLLL);
        c57858MnG.LIZ(new AqS175S0100000_9(this, 418));
        c57858MnG.LIZLLL(C57856MnE.LJLIL);
        c57858MnG.LIZJ(C58044MqG.LJLIL);
        IRelationUserCardInternalService.LIZ.getClass();
        IRelationUserCardInternalService LIZ = C57930MoQ.LIZ();
        C57867MnP c57867MnP = c57858MnG.LIZLLL;
        if (c57867MnP.LIZLLL == -1) {
            int i2 = c57858MnG.LJFF.LIZJ - 10;
            if (i2 >= 5) {
                i = i2;
            }
            c57867MnP.LIZLLL = i;
        }
        C65776Prg LIZ2 = C65352Pkq.LIZ(AbstractC58014Mpm.class);
        if (!o.LJ(LIZ2, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ2, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
            C57866MnO c57866MnO = c57858MnG.LJFF;
            if (c57866MnO.LJIILJJIL == null) {
                c57866MnO.LJIILJJIL = Boolean.TRUE;
            }
        }
        C57859MnH c57859MnH = new C57859MnH(activityC45651qj, LIZLLL, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(AbstractC58014Mpm.class);
        if (o.LJ(LIZ3, C65352Pkq.LIZ(C25771A9n.class))) {
            LIZJ = C94293mz.LIZ(LIZ, c57859MnH, 2).getLayout();
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(C25770A9m.class))) {
            LIZJ = LIZ.LIZIZ(c57859MnH, 0).getLayout();
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC58014Mpm.class))) {
            LIZJ = LIZ.LIZ(c57859MnH);
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC57781Mm1.class))) {
            LIZJ = LIZ.LIZJ(c57859MnH);
        } else {
            "type is error!".toString();
            throw new IllegalStateException("type is error!");
        }
        if (LIZJ != null) {
            AbstractC58014Mpm abstractC58014Mpm = (AbstractC58014Mpm) LIZJ;
            this.LJLJI = abstractC58014Mpm;
            ((C57934MoU) abstractC58014Mpm).LJIILL(null);
            AbstractC58014Mpm abstractC58014Mpm2 = this.LJLJI;
            if (abstractC58014Mpm2 != null) {
                ((C57934MoU) abstractC58014Mpm2).W7(this);
                AbstractC58014Mpm abstractC58014Mpm3 = this.LJLJI;
                if (abstractC58014Mpm3 != null) {
                    ((C57934MoU) abstractC58014Mpm3).LJLJLJ(false);
                    String str2 = ((C58042MqE) this.LJLJJI.getValue()).LJLILLLLZI;
                    C188727au LIZLLL2 = KNV.LIZLLL(str2, "platform");
                    LIZLLL2.LJIIIZ("enter_from", "version_update");
                    int hashCode = str2.hashCode();
                    if (hashCode != 49) {
                        if (hashCode != 50) {
                            if (hashCode == 48503 && str2.equals("1,2")) {
                                str = "facebook&contact";
                                LIZLLL2.LJIIIZ("platform", str);
                                FMX.LJIIL("show_rec_page", LIZLLL2.LIZ);
                                UQ7 uq7 = UQ7.RECOMMEND;
                                UPT.LJ(2, uq7.getValue());
                                UPT.LJ(1, uq7.getValue());
                                return;
                            }
                            str = "";
                            LIZLLL2.LJIIIZ("platform", str);
                            FMX.LJIIL("show_rec_page", LIZLLL2.LIZ);
                            UQ7 uq72 = UQ7.RECOMMEND;
                            UPT.LJ(2, uq72.getValue());
                            UPT.LJ(1, uq72.getValue());
                            return;
                        }
                        if (str2.equals("2")) {
                            str = "facebook";
                            LIZLLL2.LJIIIZ("platform", str);
                            FMX.LJIIL("show_rec_page", LIZLLL2.LIZ);
                            UQ7 uq722 = UQ7.RECOMMEND;
                            UPT.LJ(2, uq722.getValue());
                            UPT.LJ(1, uq722.getValue());
                            return;
                        }
                        str = "";
                        LIZLLL2.LJIIIZ("platform", str);
                        FMX.LJIIL("show_rec_page", LIZLLL2.LIZ);
                        UQ7 uq7222 = UQ7.RECOMMEND;
                        UPT.LJ(2, uq7222.getValue());
                        UPT.LJ(1, uq7222.getValue());
                        return;
                    }
                    if (str2.equals("1")) {
                        str = "contact";
                        LIZLLL2.LJIIIZ("platform", str);
                        FMX.LJIIL("show_rec_page", LIZLLL2.LIZ);
                        UQ7 uq72222 = UQ7.RECOMMEND;
                        UPT.LJ(2, uq72222.getValue());
                        UPT.LJ(1, uq72222.getValue());
                        return;
                    }
                    str = "";
                    LIZLLL2.LJIIIZ("platform", str);
                    FMX.LJIIL("show_rec_page", LIZLLL2.LIZ);
                    UQ7 uq722222 = UQ7.RECOMMEND;
                    UPT.LJ(2, uq722222.getValue());
                    UPT.LJ(1, uq722222.getValue());
                    return;
                }
                o.LJIJI("userCardChunk");
                throw null;
            }
            o.LJIJI("userCardChunk");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        boolean z;
        Exception exc;
        o.LJIIIZ(state, "state");
        List<InterfaceC57784Mm4> LIZ = state.LIZJ.LIZ();
        if (LIZ != null && LIZ.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        AbstractC72932td<C223208pQ> abstractC72932td = state.LIZ;
        if ((abstractC72932td instanceof C33X) || (abstractC72932td instanceof C72922tc)) {
            A3(true);
            return;
        }
        if (abstractC72932td instanceof C3C1) {
            if (z) {
                C3(getActivity());
                return;
            }
            MGN mgn = MGN.LJLILLLLZI;
            ActivityC45651qj activity = getActivity();
            MG5 mg5 = MG5.DEFAULT;
            Throwable th = ((C3C1) abstractC72932td).LIZ;
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            mgn.triggerNetworkTips(activity, mg5, exc, (C73305Spp) null);
            return;
        }
        if (!(abstractC72932td instanceof C72912tb) || !(state.LIZJ instanceof C72912tb)) {
            return;
        }
        if (state.LIZJ()) {
            C3(getActivity());
            return;
        }
        List<SIT> allChunks = x3().getAllChunks();
        AbstractC58014Mpm abstractC58014Mpm = this.LJLJI;
        if (abstractC58014Mpm != null) {
            if (!allChunks.contains(abstractC58014Mpm)) {
                AbstractC58014Mpm abstractC58014Mpm2 = this.LJLJI;
                if (abstractC58014Mpm2 != null) {
                    ((C57934MoU) abstractC58014Mpm2).LJIJJLI(x3());
                    SYL x3 = x3();
                    AbstractC58014Mpm abstractC58014Mpm3 = this.LJLJI;
                    if (abstractC58014Mpm3 != null) {
                        x3.LJLJJL(abstractC58014Mpm3);
                        SYL x32 = x3();
                        AbstractC58014Mpm abstractC58014Mpm4 = this.LJLJI;
                        if (abstractC58014Mpm4 != null) {
                            x32.setItemAnimator(((C57934MoU) abstractC58014Mpm4).getItemAnimator());
                        } else {
                            o.LJIJI("userCardChunk");
                            throw null;
                        }
                    } else {
                        o.LJIJI("userCardChunk");
                        throw null;
                    }
                } else {
                    o.LJIJI("userCardChunk");
                    throw null;
                }
            }
            A3(false);
            return;
        }
        o.LJIJI("userCardChunk");
        throw null;
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}
