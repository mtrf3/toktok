package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.AbstractC73672Svk;
import X.AbstractC76019TsV;
import X.ActivityC45651qj;
import X.B5G;
import X.B83;
import X.BPP;
import X.C05630Jz;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C20940ry;
import X.C221108m2;
import X.C265112h;
import X.C29044Baa;
import X.C29374Bfu;
import X.C29S;
import X.C30868C9o;
import X.C31413CUn;
import X.C32537Cpp;
import X.C3C5;
import X.C47261Igj;
import X.C58420MwK;
import X.C5H3;
import X.C62822Ol8;
import X.C73411SrX;
import X.C74838TYs;
import X.C75505TkD;
import X.C75536Tki;
import X.C75597Tlh;
import X.C75642TmQ;
import X.C75975Trn;
import X.C75981Trt;
import X.C76018TsU;
import X.C76800UCe;
import X.C87005YCr;
import X.C88207Yjb;
import X.C8E;
import X.C90903hW;
import X.CHK;
import X.CHM;
import X.CJ2;
import X.CN1;
import X.EnumC75614Tly;
import X.EnumC75697TnJ;
import X.EnumC76039Tsp;
import X.IW0;
import X.InterfaceC75774ToY;
import X.InterfaceC75963Trb;
import X.InterfaceC75964Trc;
import X.InterfaceC76055Tt5;
import X.InterfaceC76141TuT;
import X.InterfaceC88472Yns;
import X.RunnableC31065CHd;
import X.YAY;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.LivingNoticeManager;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListItemUIBugFixSetting;
import com.bytedance.android.livesdkapi.depend.model.live.AgeRestricted;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public abstract class BaseMultiHostInviteListFragment extends MultiCoHostInviteListContract$AbsView implements InterfaceC75964Trc, InterfaceC75963Trb, InterfaceC76141TuT, InterfaceC75774ToY, InterfaceC76055Tt5 {
    public InterfaceC88472Yns<? super Long, C76800UCe> LJLJLLL;
    public View LJLL;
    public DataChannel LJLLI;
    public C73411SrX LJLLJ;
    public boolean LJLLLL;
    public C75975Trn LJLLLLLL;
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public final C31413CUn LJLLILLLL = new C31413CUn();
    public IW0 LJLLL = IW0.Normal;
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 127));
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 124));
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 126));
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 125));
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 129));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS163S0100000_13(this, 128));
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS163S0100000_13(this, 123));

    public abstract void Pl();

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void sc(Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void Hl() {
        String str;
        if (!this.mStatusViewValid) {
            return;
        }
        this.LJLJI.getClass();
        JSONObject jSONObject = new JSONObject();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            str = room.getIdStr();
        } else {
            str = null;
        }
        C05630Jz.LJI(jSONObject, "room_id", str);
        C05630Jz.LJI(jSONObject, "record_id", B5G.LIZIZ().LJJIJIIJI);
        C05630Jz.LJFF(jSONObject, "user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        C58420MwK c58420MwK = C58420MwK.LIZLLL;
        c58420MwK.LJIIJ(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LIZ(0, "err_code", jSONObject2);
        c58420MwK.LJIIJJI("invite", jSONObject2);
        C0NB.LIZIZ("LiveInteractFeatureCollector", "onCoHostInviteSuccessFromInviteList");
        if (C75597Tlh.LIZIZ) {
            return;
        }
        C75597Tlh.LIZIZ = true;
        C20940ry.LIZ(C75597Tlh.LIZ(), "co_host_invite_from_list", new JSONObject().putOpt("result", 1), 2, 8);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void Il() {
        C73411SrX c73411SrX = this.LJLLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLLJ = (C73411SrX) C265112h.LIZ(AbstractC73672Svk.LJJIJIIJI(1L, TimeUnit.SECONDS)).LJJJJZI(new AfS65S0100000_13(this, 51));
    }

    public final View Kl() {
        Object value = this.LLF.getValue();
        o.LJIIIIZZ(value, "<get-mEmptyLayout>(...)");
        return (View) value;
    }

    public final View Ll() {
        Object value = this.LJZ.getValue();
        o.LJIIIIZZ(value, "<get-mPreloadLoadingView>(...)");
        return (View) value;
    }

    public final View Ml() {
        View view = this.LJLL;
        if (view != null) {
            return view;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    public final YAY Nl() {
        Object value = this.LJZI.getValue();
        o.LJIIIIZZ(value, "<get-mSwipeRefreshLayout>(...)");
        return (YAY) value;
    }

    public final RunnableC31065CHd Ol() {
        Object value = this.LJLZ.getValue();
        o.LJIIIIZZ(value, "<get-mUserListRecyclerView>(...)");
        return (RunnableC31065CHd) value;
    }

    public final void Ql() {
        AbstractC76019TsV abstractC76019TsV;
        CJ2 cj2;
        if (!((IInteractService) CN1.LIZ(IInteractService.class)).ta0() || C74838TYs.LJ().LJJ == 0 || (abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI) == null || (cj2 = abstractC76019TsV.LJLLJ) == null || cj2.isEmpty()) {
            Object value = this.LL.getValue();
            o.LJIIIIZZ(value, "<get-multiGuestLastingHintLayout>(...)");
            ((View) value).setVisibility(8);
            Object value2 = this.LLD.getValue();
            o.LJIIIIZZ(value2, "<get-multiGuestHintTextView>(...)");
            ((View) value2).setVisibility(8);
            return;
        }
        Object value3 = this.LL.getValue();
        o.LJIIIIZZ(value3, "<get-multiGuestLastingHintLayout>(...)");
        ((View) value3).setVisibility(0);
        Object value4 = this.LLD.getValue();
        o.LJIIIIZZ(value4, "<get-multiGuestHintTextView>(...)");
        ((View) value4).setVisibility(0);
    }

    @Override // X.InterfaceC75774ToY
    public final boolean fa() {
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            RandomLinkMicManager.LJIILLIIL(dataChannel, EnumC75697TnJ.TYPE_INVITEE_LIST_DIALOG);
            this.LJLIL.dismiss();
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void xl() {
        this.LJLLILLLL.notifyDataSetChanged();
        Ql();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void a() {
        C30868C9o.LIZJ(R.string.nc5);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AgeRestricted ageRestricted;
        super.onResume();
        AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI;
        if (abstractC76019TsV != null) {
            abstractC76019TsV.LJFF(this.LJLLL.getValue());
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (ageRestricted = room.ageRestricted) != null && ageRestricted.ageInterval == 4) {
            C30868C9o.LIZJ(R.string.o2e);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final boolean wl() {
        if (Ol().getScrollState() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void Jl(int i) {
        if (!this.mStatusViewValid) {
            return;
        }
        this.LJLLILLLL.notifyItemChanged(i, C47261Igj.LJJIJIL(1));
    }

    @Override // X.InterfaceC75964Trc
    public final void Z2(Room targetRoom) {
        AbstractC76019TsV abstractC76019TsV;
        o.LJIIIZ(targetRoom, "targetRoom");
        if (this.mStatusViewValid && (abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI) != null) {
            abstractC76019TsV.LJ(targetRoom);
        }
    }

    @Override // X.InterfaceC76055Tt5
    public final void Z6(EnumC76039Tsp type) {
        AbstractC76019TsV abstractC76019TsV;
        o.LJIIIZ(type, "type");
        if (this.mStatusViewValid && (abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI) != null) {
            if (type == EnumC76039Tsp.FRIEND_LIST_TYPE) {
                if (abstractC76019TsV.LJLJJI) {
                    abstractC76019TsV.LJIILLIIL(type);
                    if (CoHostInviteListItemUIBugFixSetting.isEnable()) {
                        C31413CUn c31413CUn = this.LJLLILLLL;
                        int i = abstractC76019TsV.LJLJJLL;
                        int i2 = abstractC76019TsV.LJLJJL;
                        c31413CUn.notifyItemRangeInserted(i - i2, i2);
                        return;
                    }
                    this.LJLLILLLL.notifyItemRangeInserted(abstractC76019TsV.LJLJJLL, abstractC76019TsV.LJLJJL);
                    return;
                }
                abstractC76019TsV.LJIILL(type);
                this.LJLLILLLL.notifyDataSetChanged();
                Ol().LJLIL(0);
                return;
            }
            if (abstractC76019TsV.LJLJL) {
                abstractC76019TsV.LJIILLIIL(type);
                if (CoHostInviteListItemUIBugFixSetting.isEnable()) {
                    C31413CUn c31413CUn2 = this.LJLLILLLL;
                    int i3 = abstractC76019TsV.LJLJLLL;
                    int i4 = abstractC76019TsV.LJLJLJ;
                    c31413CUn2.notifyItemRangeInserted(i3 - i4, i4);
                    return;
                }
                this.LJLLILLLL.notifyItemRangeInserted(abstractC76019TsV.LJLJLLL, abstractC76019TsV.LJLJLJ);
                return;
            }
            abstractC76019TsV.LJIILL(type);
            this.LJLLILLLL.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC75963Trb
    public final void q6(Room targetRoom) {
        AbstractC76019TsV abstractC76019TsV;
        o.LJIIIZ(targetRoom, "targetRoom");
        if (this.mStatusViewValid && (abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI) != null) {
            abstractC76019TsV.LIZLLL(targetRoom);
        }
    }

    @Override // X.InterfaceC76141TuT
    public final void v5(C75981Trt item) {
        AbstractC76019TsV abstractC76019TsV;
        o.LJIIIZ(item, "item");
        if (this.mStatusViewValid && (abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI) != null) {
            abstractC76019TsV.LJIILIIL(item);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void Gl(Throwable th, Room targetRoom) {
        String str;
        int i;
        o.LJIIIZ(targetRoom, "targetRoom");
        if (!this.mStatusViewValid) {
            return;
        }
        boolean z = th instanceof MultiCoHostViolationException;
        if (!z) {
            BPP.LIZJ(getContext(), th);
        }
        JSONObject jSONObject = new JSONObject();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        String str2 = null;
        if (room != null) {
            str = room.getIdStr();
        } else {
            str = null;
        }
        C05630Jz.LJI(jSONObject, "room_id", str);
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            str2 = room2.getIdStr();
        }
        C05630Jz.LJI(jSONObject, "record_id", str2);
        C05630Jz.LJFF(jSONObject, "user_id", B83.LIZ().LIZIZ().getCurrentUserId());
        C58420MwK c58420MwK = C58420MwK.LIZLLL;
        c58420MwK.LJIIJ(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            i = -2;
        } else {
            i = -1;
        }
        C05630Jz.LIZ(i, "err_code", jSONObject2);
        C05630Jz.LJI(jSONObject2, "err_msg", String.valueOf(th));
        c58420MwK.LJIIJJI("invite", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "end_reason", "invite_failed");
        c58420MwK.LIZIZ(2, jSONObject3);
    }

    @Override // X.InterfaceC75963Trb
    public final void F3(C75981Trt item, EnumC75614Tly inviteType, boolean z) {
        o.LJIIIZ(item, "item");
        o.LJIIIZ(inviteType, "inviteType");
        if (!this.mStatusViewValid) {
            return;
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJI;
        linkCrossRoomDataHolder.getClass();
        linkCrossRoomDataHolder.LJIIJ = inviteType;
        AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI;
        if (abstractC76019TsV != null) {
            abstractC76019TsV.LIZJ(item, inviteType, z);
        }
    }

    @Override // X.InterfaceC75964Trc
    public final void c5(C75981Trt item, EnumC75614Tly inviteType, boolean z) {
        long j;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(inviteType, "inviteType");
        if (!this.mStatusViewValid) {
            return;
        }
        InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns = this.LJLJLLL;
        if (interfaceC88472Yns != null) {
            User owner = item.LJLIL.getOwner();
            if (owner != null) {
                j = owner.getId();
            } else {
                j = 0;
            }
            interfaceC88472Yns.invoke(Long.valueOf(j));
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJI;
        linkCrossRoomDataHolder.getClass();
        linkCrossRoomDataHolder.LJIIJ = inviteType;
        AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI;
        if (abstractC76019TsV != null) {
            abstractC76019TsV.LJIIIIZZ(item, inviteType, z);
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [X.Tki, O] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        CHK chk;
        boolean z2;
        long j;
        C75536Tki c75536Tki;
        LivingNoticeManager livingNoticeManager;
        C75536Tki c75536Tki2;
        long j2;
        C75536Tki c75536Tki3;
        C75536Tki c75536Tki4;
        o.LJIIIZ(inflater, "inflater");
        boolean z3 = true;
        if (C8E.LIZLLL().LJIILJJIL().size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LJLLL = IW0.InviteMore;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d4e, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …ontainer, false\n        )");
        this.LJLL = LLLLIILL;
        RunnableC31065CHd Ol = Ol();
        getContext();
        Ol.setLayoutManager(new LinearLayoutManager());
        if (Ol().getItemAnimator() instanceof AbstractC28931Bp) {
            AbstractC030109x itemAnimator = Ol().getItemAnimator();
            o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((AbstractC28931Bp) itemAnimator).LJI = false;
        }
        Ol().setAdapter(this.LJLLILLLL);
        Pl();
        Ol().LJLJJLL();
        AbstractC030109x itemAnimator2 = Ol().getItemAnimator();
        if (itemAnimator2 instanceof AbstractC28931Bp) {
            ((AbstractC28931Bp) itemAnimator2).LJI = false;
        }
        RunnableC31065CHd Ol2 = Ol();
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_broadcast_link_slide");
        C29S c29s = null;
        if (c5h3 != null) {
            chk = (CHK) c5h3.getValue();
        } else {
            chk = null;
        }
        Ol2.LJIIJJI(new CHM(chk));
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null && (c75536Tki4 = (C75536Tki) dataChannel.kv0(C75505TkD.class)) != null && c75536Tki4.LJLILLLLZI) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            DataChannel dataChannel2 = this.LJLLI;
            if (dataChannel2 != null && (c75536Tki3 = (C75536Tki) dataChannel2.kv0(C75505TkD.class)) != null) {
                j2 = c75536Tki3.LJLIL;
            } else {
                j2 = 0;
            }
            this.LJLJJI = j2;
        } else {
            DataChannel dataChannel3 = this.LJLLI;
            if (dataChannel3 != null && (c75536Tki = (C75536Tki) dataChannel3.kv0(C75505TkD.class)) != null) {
                j = c75536Tki.LJLIL;
            } else {
                j = 0;
            }
            this.LJLJJL = j;
        }
        DataChannel dataChannel4 = this.LJLLI;
        if (dataChannel4 == null || (c75536Tki2 = (C75536Tki) dataChannel4.kv0(C75505TkD.class)) == null || !c75536Tki2.LJLILLLLZI) {
            z3 = false;
        }
        this.LJLJJLL = z3;
        DataChannel dataChannel5 = this.LJLLI;
        if (dataChannel5 != null) {
            ((C32537Cpp) dataChannel5.gv0(C75505TkD.class)).LIZ = new C75536Tki(0L, false, false);
        }
        Ol().setItemAnimator(new C87005YCr());
        RunnableC31065CHd Ol3 = Ol();
        Context context = getContext();
        if (context != null) {
            livingNoticeManager = new LivingNoticeManager(context);
        } else {
            livingNoticeManager = null;
        }
        Ol3.setLayoutManager(livingNoticeManager);
        C75642TmQ.LJII = System.currentTimeMillis();
        if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).oT()) {
            AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI;
            if (abstractC76019TsV != null) {
                abstractC76019TsV.LJIIJJI();
            }
        } else {
            AbstractC76019TsV abstractC76019TsV2 = (AbstractC76019TsV) this.LJLILLLLZI;
            if (abstractC76019TsV2 != null) {
                abstractC76019TsV2.LJIIJ();
            }
        }
        Ll().setVisibility(0);
        this.LJLLLL = false;
        Nl().setOnRefreshListener(new C76018TsU(this));
        T t = this.LJLILLLLZI;
        if (t != 0) {
            t.onCreate();
        }
        View Ml = Ml();
        try {
            ViewTreeLifecycleOwner.set(Ml, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(Ml, this);
            C10A.LIZIZ(Ml, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return Ml;
    }
}
