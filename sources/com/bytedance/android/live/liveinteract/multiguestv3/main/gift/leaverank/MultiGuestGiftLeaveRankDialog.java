package com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank;

import X.C05170If;
import X.C15380j0;
import X.C16880lQ;
import X.C29306Beo;
import X.C2A7;
import X.C31413CUn;
import X.C41051jJ;
import X.C41081jM;
import X.C47121t6;
import X.C73098SmU;
import X.C73318Sq2;
import X.C74738TUw;
import X.C74824TYe;
import X.C74880Ta8;
import X.C75390TiM;
import X.C75391TiN;
import X.C76582U3u;
import X.CJ2;
import X.CVT;
import X.IOD;
import X.InterfaceC75175Tet;
import X.RunnableC31065CHd;
import X.TV3;
import X.TV4;
import X.TV9;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS33S0100000_13;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestGiftLeaveRankDialog extends LiveDialogFragment implements GenericLifecycleObserver, TV9, InterfaceC75175Tet {
    public static User LJLLLL;
    public static Room LJLLLLLL;
    public static String LJLZ;
    public static Integer LJZ;
    public static boolean LJZI;
    public static String LJZL;
    public static LifecycleOwner LL;
    public FanTicketRanklistResponse.ResponseData LJLIL;
    public RunnableC31065CHd LJLILLLLZI;
    public TV4 LJLJI;
    public C31413CUn LJLJJI;
    public CVT LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public C41081jM LJLJLJ;
    public C47121t6 LJLJLLL;
    public ViewGroup LJLL;
    public C47121t6 LJLLI;
    public C41051jJ LJLLILLLL;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public final C73318Sq2 LJLLJ = new C73318Sq2();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.TV9
    public final void B1() {
        CVT cvt = this.LJLJJL;
        if (cvt != null) {
            C29306Beo.LJJLIIIJJI(cvt, false);
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLILLLLZI;
        if (runnableC31065CHd != null) {
            C29306Beo.LJJLIIIJJI(runnableC31065CHd, false);
        }
        View view = this.LJLJJLL;
        if (view != null) {
            C29306Beo.LJJLIIIJJI(view, true);
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            C29306Beo.LJJLIIIJJI(view2, false);
        }
        ViewGroup viewGroup = this.LJLL;
        if (viewGroup != null) {
            C29306Beo.LJJLIIIJJI(viewGroup, !LJZI);
        }
        C47121t6 c47121t6 = this.LJLLI;
        if (c47121t6 == null) {
            return;
        }
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lts);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_gu…oints_ranking_empty_desc)");
        String LLLZ = C16880lQ.LLLZ(LJIILJJIL, Arrays.copyOf(new Object[]{C05170If.LIZ(LJLLLL)}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        c47121t6.setText(LLLZ);
    }

    @Override // X.TV9
    public final void LJJI() {
        CVT cvt = this.LJLJJL;
        if (cvt != null) {
            C29306Beo.LJJLIIIJJI(cvt, true);
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLILLLLZI;
        if (runnableC31065CHd != null) {
            C29306Beo.LJJLIIIJJI(runnableC31065CHd, false);
        }
        View view = this.LJLJJLL;
        if (view != null) {
            C29306Beo.LJJLIIIJJI(view, false);
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            C29306Beo.LJJLIIIJJI(view2, false);
        }
        ViewGroup viewGroup = this.LJLL;
        if (viewGroup != null) {
            C29306Beo.LJJLIIIJJI(viewGroup, true ^ LJZI);
        }
    }

    @Override // X.TV9
    public final void hl() {
        CVT cvt = this.LJLJJL;
        if (cvt != null) {
            C29306Beo.LJJLIIIJJI(cvt, false);
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLILLLLZI;
        if (runnableC31065CHd != null) {
            C29306Beo.LJJLIIIJJI(runnableC31065CHd, false);
        }
        View view = this.LJLJJLL;
        if (view != null) {
            C29306Beo.LJJLIIIJJI(view, false);
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            C29306Beo.LJJLIIIJJI(view2, true);
        }
        ViewGroup viewGroup = this.LJLL;
        if (viewGroup != null) {
            C29306Beo.LJJLIIIJJI(viewGroup, true ^ LJZI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C28507BGt createParams() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L4e
            int r3 = X.B9K.LIZJ(r0)
        La:
            X.BGt r2 = new X.BGt
            r0 = 2131564005(0x7f0d15e5, float:1.8753483E38)
            r2.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L4c
            java.lang.Class<X.BCW> r0 = X.BCW.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L4c
            boolean r1 = r0.booleanValue()
            if (r1 == 0) goto L48
        L26:
            r0 = 80
        L28:
            r2.LJII = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.LJI = r0
            if (r1 == 0) goto L46
            r0 = -1
        L31:
            r2.LJIIIZ = r0
            if (r1 == 0) goto L36
            r3 = -1
        L36:
            r2.LJIIJ = r3
            if (r1 == 0) goto L40
            r0 = 2131887533(0x7f1205ad, float:1.9409676E38)
            r2.LIZJ = r0
        L3f:
            return r2
        L40:
            r0 = 2131887534(0x7f1205ae, float:1.9409678E38)
            r2.LIZJ = r0
            goto L3f
        L46:
            r0 = r3
            goto L31
        L48:
            r0 = 8388629(0x800015, float:1.1754973E-38)
            goto L28
        L4c:
            r1 = 1
            goto L26
        L4e:
            r3 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog.createParams():X.BGt");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        TV4 tv4;
        super.dismiss();
        C41051jJ c41051jJ = this.LJLLILLLL;
        if (c41051jJ != null && c41051jJ.isChecked() && (tv4 = this.LJLJI) != null) {
            tv4.LIZLLL();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Lifecycle lifecycle;
        super.onDestroy();
        this.LJLILLLLZI = null;
        TV4 tv4 = this.LJLJI;
        if (tv4 != null) {
            tv4.LIZJ();
        }
        this.LJLJI = null;
        this.LJLJJI = null;
        LifecycleOwner lifecycleOwner = LL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        LL = null;
        this.LJLIL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onLifecycleOwnerDestroy() {
        TV3.LJIILJJIL(this);
    }

    @Override // X.TV9
    public final void a8(FanTicketRanklistResponse resp) {
        IOD iod;
        String str;
        int i;
        long j;
        List<FanTicketRanklistResponse.RanklistUser> list;
        List<FanTicketRanklistResponse.RanklistUser> list2;
        o.LJIIIZ(resp, "resp");
        this.LJLIL = resp.data;
        CVT cvt = this.LJLJJL;
        if (cvt != null) {
            C29306Beo.LJJLIIIJJI(cvt, false);
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLILLLLZI;
        boolean z = true;
        if (runnableC31065CHd != null) {
            C29306Beo.LJJLIIIJJI(runnableC31065CHd, true);
        }
        View view = this.LJLJJLL;
        if (view != null) {
            C29306Beo.LJJLIIIJJI(view, false);
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            C29306Beo.LJJLIIIJJI(view2, false);
        }
        ViewGroup viewGroup = this.LJLL;
        if (viewGroup != null) {
            C29306Beo.LJJLIIIJJI(viewGroup, !LJZI);
        }
        C31413CUn c31413CUn = new C31413CUn();
        c31413CUn.LJLZ(IOD.class, new C75390TiM());
        c31413CUn.LJLZ(C74880Ta8.class, new C75391TiN());
        C41051jJ c41051jJ = this.LJLLILLLL;
        if (c41051jJ == null || !c41051jJ.isChecked()) {
            z = false;
        }
        c31413CUn.LJLZ(FanTicketRanklistResponse.RanklistUser.class, new C76582U3u(true, !z, getContext(), LJLLLL, resp.data, this.LJLLJ, LJZI, false, 128));
        this.LJLJJI = c31413CUn;
        CJ2 cj2 = new CJ2();
        FanTicketRanklistResponse.ResponseData responseData = resp.data;
        if (responseData != null) {
            iod = new IOD(responseData.fanTicketTotal);
        } else {
            iod = null;
        }
        cj2.add(iod);
        cj2.add(new C74880Ta8());
        FanTicketRanklistResponse.ResponseData responseData2 = resp.data;
        if (responseData2 != null && (list2 = responseData2.ranklistUsers) != null) {
            cj2.addAll(list2);
        }
        C31413CUn c31413CUn2 = this.LJLJJI;
        if (c31413CUn2 != null) {
            c31413CUn2.LJLIL = cj2;
        }
        RunnableC31065CHd runnableC31065CHd2 = this.LJLILLLLZI;
        if (runnableC31065CHd2 != null) {
            if (getContext() == null) {
                return;
            } else {
                runnableC31065CHd2.setLayoutManager(new LinearLayoutManager());
            }
        }
        RunnableC31065CHd runnableC31065CHd3 = this.LJLILLLLZI;
        if (runnableC31065CHd3 != null) {
            runnableC31065CHd3.setAdapter(this.LJLJJI);
        }
        FanTicketRanklistResponse.ResponseData responseData3 = resp.data;
        boolean z2 = LJZI;
        C74824TYe.LJIIIIZZ = System.currentTimeMillis();
        HashMap LIZLLL = C73098SmU.LIZLLL();
        if (!z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL.put("is_proactive_disconnect", str);
        if (responseData3 != null && (list = responseData3.ranklistUsers) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        LIZLLL.put("contributors_num", String.valueOf(i));
        if (responseData3 != null) {
            j = responseData3.fanTicketTotal;
        } else {
            j = 0;
        }
        LIZLLL.put("charm_values", String.valueOf(j));
        C74824TYe.LJLL("livesdk_guest_disconnect_ranking_popup_show", LIZLLL);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        String str;
        int i;
        long j;
        List<FanTicketRanklistResponse.RanklistUser> list;
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        this.LJLLJ.LIZLLL();
        FanTicketRanklistResponse.ResponseData responseData = this.LJLIL;
        boolean z = LJZI;
        HashMap LIZLLL = C73098SmU.LIZLLL();
        if (!z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL.put("is_proactive_disconnect", str);
        if (responseData != null && (list = responseData.ranklistUsers) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        LIZLLL.put("contributors_num", String.valueOf(i));
        if (responseData != null) {
            j = responseData.fanTicketTotal;
        } else {
            j = 0;
        }
        LIZLLL.put("charm_values", String.valueOf(j));
        LIZLLL.put("duration", String.valueOf(System.currentTimeMillis() - C74824TYe.LJIIIIZZ));
        C74824TYe.LJLL("livesdk_guest_disconnect_ranking_popup_duration", LIZLLL);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            TV3.LJIILJJIL(this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        User user;
        o.LJIIIZ(view, "view");
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 18), view.findViewById(R.id.liz));
        this.LJLILLLLZI = (RunnableC31065CHd) view.findViewById(R.id.j_2);
        this.LJLJJL = (CVT) view.findViewById(R.id.g94);
        this.LJLJJLL = view.findViewById(R.id.cvv);
        this.LJLJL = view.findViewById(R.id.gyt);
        this.LJLJLJ = (C41081jM) view.findViewById(R.id.eca);
        this.LJLJLLL = (C47121t6) view.findViewById(R.id.m5c);
        this.LJLL = (ViewGroup) view.findViewById(R.id.avp);
        this.LJLLI = (C47121t6) view.findViewById(R.id.jo9);
        TV4 tv4 = new TV4();
        tv4.LIZ(LJLLLL, LJZL, LJLLLLLL, null, this);
        this.LJLJI = tv4;
        View view2 = this.LJLJL;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 25), view2);
        }
        C41081jM c41081jM = this.LJLJLJ;
        if (c41081jM != null) {
            C16880lQ.LJJIIZI(c41081jM, new ACListenerS25S0100000_5(this, 19));
        }
        C47121t6 c47121t6 = this.LJLJLLL;
        if (c47121t6 != null) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ltg);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_gu…_disconnect_panel_header)");
            Object[] objArr = new Object[1];
            Room room = LJLLLLLL;
            if (room != null) {
                user = room.getOwner();
            } else {
                user = null;
            }
            objArr[0] = C05170If.LIZ(user);
            String LLLZ = C16880lQ.LLLZ(LJIILJJIL, Arrays.copyOf(objArr, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c47121t6.setText(LLLZ);
        }
        C16880lQ.LJJIII((C2A7) view.findViewById(R.id.av8), new ACListenerS25S0100000_5(this, 20));
        C16880lQ.LJJIII((C2A7) view.findViewById(R.id.avt), new ACListenerS33S0100000_13(this, 26));
        this.LJLLILLLL = (C41051jJ) view.findViewById(R.id.b_r);
        if (C74738TUw.LJFF() || C74738TUw.LIZLLL()) {
            C41051jJ c41051jJ = this.LJLLILLLL;
            if (c41051jJ != null) {
                C29306Beo.LJJLIIIJJI(c41051jJ, true);
            }
        } else {
            C41051jJ c41051jJ2 = this.LJLLILLLL;
            if (c41051jJ2 != null) {
                C29306Beo.LJJLIIIJJI(c41051jJ2, false);
            }
        }
        if (LJZI) {
            ViewGroup viewGroup = this.LJLL;
            if (viewGroup != null) {
                C29306Beo.LJJLIIIJJI(viewGroup, false);
            }
            C41051jJ c41051jJ3 = this.LJLLILLLL;
            if (c41051jJ3 != null) {
                C29306Beo.LJJLIIIJJI(c41051jJ3, false);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        super.show(manager, str);
    }
}
