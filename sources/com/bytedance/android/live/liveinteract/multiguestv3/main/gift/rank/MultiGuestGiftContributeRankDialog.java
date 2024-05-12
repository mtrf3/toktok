package com.bytedance.android.live.liveinteract.multiguestv3.main.gift.rank;

import X.B83;
import X.C05170If;
import X.C15380j0;
import X.C16880lQ;
import X.C29306Beo;
import X.C29374Bfu;
import X.C2A7;
import X.C31413CUn;
import X.C41081jM;
import X.C47121t6;
import X.C73098SmU;
import X.C73318Sq2;
import X.C74824TYe;
import X.C74880Ta8;
import X.C75173Ter;
import X.C75174Tes;
import X.C75390TiM;
import X.C75391TiN;
import X.C76582U3u;
import X.C78866UxK;
import X.CJ2;
import X.CVT;
import X.EnumC74877Ta5;
import X.IOD;
import X.InterfaceC75175Tet;
import X.RunnableC31065CHd;
import X.TQA;
import X.TV5;
import X.TV9;
import X.U35;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS33S0100000_13;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
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
public final class MultiGuestGiftContributeRankDialog extends LiveDialogFragment implements TV9, InterfaceC75175Tet {
    public static final /* synthetic */ int LJZI = 0;
    public RunnableC31065CHd LJLIL;
    public TV5 LJLILLLLZI;
    public C31413CUn LJLJI;
    public CVT LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public C41081jM LJLJL;
    public C47121t6 LJLJLJ;
    public C75174Tes LJLJLLL;
    public C47121t6 LJLL;
    public C2A7 LJLLI;
    public FanTicketRanklistResponse.ResponseData LJLLJ;
    public EnumC74877Ta5 LJLLL;
    public User LJLLLL;
    public Room LJLLLLLL;
    public Long LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final C73318Sq2 LJLLILLLL = new C73318Sq2();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MultiGuestGiftContributeRankDialog() {
        C78866UxK.LJIJJ(this, 9, true, true, null, 0, 240);
    }

    @Override // X.TV9
    public final void LJJI() {
        CVT cvt = this.LJLJJI;
        if (cvt != null) {
            C29306Beo.LJJLIIIJJI(cvt, true);
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLIL;
        if (runnableC31065CHd != null) {
            C29306Beo.LJJLIIIJJI(runnableC31065CHd, false);
        }
        View view = this.LJLJJL;
        if (view != null) {
            C29306Beo.LJJLIIIJJI(view, false);
        }
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            C29306Beo.LJJLIIIJJI(view2, false);
        }
        C75174Tes c75174Tes = this.LJLJLLL;
        if (c75174Tes != null) {
            C29306Beo.LJJLIIIJJI(c75174Tes, false);
        }
    }

    @Override // X.TV9
    public final void hl() {
        CVT cvt = this.LJLJJI;
        boolean z = false;
        if (cvt != null) {
            C29306Beo.LJJLIIIJJI(cvt, false);
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLIL;
        if (runnableC31065CHd != null) {
            C29306Beo.LJJLIIIJJI(runnableC31065CHd, false);
        }
        View view = this.LJLJJL;
        if (view != null) {
            C29306Beo.LJJLIIIJJI(view, false);
        }
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            C29306Beo.LJJLIIIJJI(view2, true);
        }
        C75174Tes c75174Tes = this.LJLJLLL;
        if (c75174Tes != null) {
            C29306Beo.LJJLIIIJJI(c75174Tes, false);
        }
        User user = this.LJLLLL;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            z = LIZ.LJIIJJI();
        }
        C74824TYe.LJJIJL(user, null, z);
    }

    @Override // X.TV9
    public final void B1() {
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        CVT cvt = this.LJLJJI;
        boolean z = false;
        if (cvt != null) {
            C29306Beo.LJJLIIIJJI(cvt, false);
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLIL;
        if (runnableC31065CHd != null) {
            C29306Beo.LJJLIIIJJI(runnableC31065CHd, false);
        }
        View view = this.LJLJJL;
        if (view != null) {
            C29306Beo.LJJLIIIJJI(view, true);
        }
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            C29306Beo.LJJLIIIJJI(view2, false);
        }
        C75174Tes c75174Tes = this.LJLJLLL;
        if (c75174Tes != null) {
            C29306Beo.LJJLIIIJJI(c75174Tes, false);
        }
        if (vl(LJ)) {
            C2A7 c2a7 = this.LJLLI;
            if (c2a7 != null) {
                C29306Beo.LJJLIIIJJI(c2a7, false);
            }
            C47121t6 c47121t6 = this.LJLL;
            if (c47121t6 != null) {
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ltt);
                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_gu…ints_ranking_empty_desc2)");
                String LLLZ = C16880lQ.LLLZ(LJIILJJIL, Arrays.copyOf(new Object[]{C05170If.LIZ(this.LJLLLL)}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                c47121t6.setText(LLLZ);
            }
        } else {
            C2A7 c2a72 = this.LJLLI;
            if (c2a72 != null) {
                C29306Beo.LJJLIIIJJI(c2a72, true);
            }
            C47121t6 c47121t62 = this.LJLL;
            if (c47121t62 != null) {
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lts);
                o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_gu…oints_ranking_empty_desc)");
                String LLLZ2 = C16880lQ.LLLZ(LJIILJJIL2, Arrays.copyOf(new Object[]{C05170If.LIZ(this.LJLLLL)}, 1));
                o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                c47121t62.setText(LLLZ2);
            }
        }
        User user = this.LJLLLL;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            z = LIZ.LJIIJJI();
        }
        C74824TYe.LJJIJL(user, null, z);
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
            r0 = 2131564002(0x7f0d15e2, float:1.8753477E38)
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.gift.rank.MultiGuestGiftContributeRankDialog.createParams():X.BGt");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLIL = null;
        TV5 tv5 = this.LJLILLLLZI;
        if (tv5 != null) {
            tv5.LIZJ();
        }
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLLJ = null;
    }

    @Override // X.TV9
    public final void a8(FanTicketRanklistResponse resp) {
        boolean z;
        boolean z2;
        List<FanTicketRanklistResponse.RanklistUser> list;
        IOD iod;
        o.LJIIIZ(resp, "resp");
        CVT cvt = this.LJLJJI;
        if (cvt != null) {
            C29306Beo.LJJLIIIJJI(cvt, false);
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLIL;
        if (runnableC31065CHd != null) {
            C29306Beo.LJJLIIIJJI(runnableC31065CHd, true);
        }
        View view = this.LJLJJL;
        if (view != null) {
            C29306Beo.LJJLIIIJJI(view, false);
        }
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            C29306Beo.LJJLIIIJJI(view2, false);
        }
        this.LJLLJ = resp.data;
        C31413CUn c31413CUn = new C31413CUn();
        MultiGuestLiveShowConfigSetting multiGuestLiveShowConfigSetting = MultiGuestLiveShowConfigSetting.INSTANCE;
        if (multiGuestLiveShowConfigSetting.isOpenLiveShow() && this.LJLLL == EnumC74877Ta5.LIVE_SHOW_END) {
            c31413CUn.LJLZ(IOD.class, new C75390TiM());
        }
        c31413CUn.LJLZ(C74880Ta8.class, new C75391TiN());
        Context context = getContext();
        User user = this.LJLLLL;
        FanTicketRanklistResponse.ResponseData responseData = resp.data;
        C73318Sq2 c73318Sq2 = this.LJLLILLLL;
        EnumC74877Ta5 enumC74877Ta5 = this.LJLLL;
        EnumC74877Ta5 enumC74877Ta52 = EnumC74877Ta5.LIVE_SHOW_END;
        if (enumC74877Ta5 == enumC74877Ta52) {
            z = true;
        } else {
            z = false;
        }
        c31413CUn.LJLZ(FanTicketRanklistResponse.RanklistUser.class, new C76582U3u(false, true, context, user, responseData, c73318Sq2, false, z, 64));
        this.LJLJI = c31413CUn;
        CJ2 cj2 = new CJ2();
        boolean isOpenLiveShow = multiGuestLiveShowConfigSetting.isOpenLiveShow();
        C75173Ter c75173Ter = null;
        if (isOpenLiveShow && this.LJLLL == enumC74877Ta52) {
            FanTicketRanklistResponse.ResponseData responseData2 = resp.data;
            if (responseData2 != null) {
                iod = new IOD(responseData2.fanTicketTotal);
            } else {
                iod = null;
            }
            cj2.add(iod);
        }
        cj2.add(new C74880Ta8());
        FanTicketRanklistResponse.ResponseData responseData3 = resp.data;
        if (responseData3 != null && (list = responseData3.ranklistUsers) != null) {
            cj2.addAll(list);
        }
        C31413CUn c31413CUn2 = this.LJLJI;
        if (c31413CUn2 != null) {
            c31413CUn2.LJLIL = cj2;
        }
        RunnableC31065CHd runnableC31065CHd2 = this.LJLIL;
        if (runnableC31065CHd2 != null) {
            if (getContext() == null) {
                return;
            } else {
                runnableC31065CHd2.setLayoutManager(new LinearLayoutManager());
            }
        }
        RunnableC31065CHd runnableC31065CHd3 = this.LJLIL;
        if (runnableC31065CHd3 != null) {
            runnableC31065CHd3.setAdapter(this.LJLJI);
        }
        FanTicketRanklistResponse.ResponseData responseData4 = resp.data;
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        if (vl(LJ)) {
            C75174Tes c75174Tes = this.LJLJLLL;
            z2 = false;
            if (c75174Tes != null) {
                C29306Beo.LJJLIIIJJI(c75174Tes, false);
            }
        } else {
            z2 = false;
            C75174Tes c75174Tes2 = this.LJLJLLL;
            if (c75174Tes2 != null) {
                C29306Beo.LJJLIIIJJI(c75174Tes2, true);
            }
            if (responseData4 != null) {
                long j = responseData4.ownIndex;
                long j2 = responseData4.ownScore;
                List<FanTicketRanklistResponse.RanklistUser> list2 = responseData4.ranklistUsers;
                o.LJIIIIZZ(list2, "data.ranklistUsers");
                c75173Ter = new C75173Ter(LJ, j, j2, list2, this.LJLLLL, responseData4);
            }
            C75174Tes c75174Tes3 = this.LJLJLLL;
            if (c75174Tes3 != null) {
                c75174Tes3.LJJLJLI(this.dataChannel, this, c75173Ter);
            }
        }
        User user2 = this.LJLLLL;
        FanTicketRanklistResponse.ResponseData responseData5 = resp.data;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            z2 = LIZ.LJIIJJI();
        }
        C74824TYe.LJJIJL(user2, responseData5, z2);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Long l;
        String str;
        List<FanTicketRanklistResponse.RanklistUser> list;
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        this.LJLLILLLL.LIZLLL();
        User user = this.LJLLLL;
        FanTicketRanklistResponse.ResponseData responseData = this.LJLLJ;
        HashMap LIZLLL = C73098SmU.LIZLLL();
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        LIZLLL.put("user_type", C74824TYe.LJIILL(LJ));
        if (user != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        LIZLLL.put("guest_id", String.valueOf(l));
        int i = 0;
        if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL.put("is_own_ranking", str);
        LIZLLL.put("ranking_enter_from", "guest_window");
        if (responseData != null && (list = responseData.ranklistUsers) != null) {
            i = list.size();
        }
        LIZLLL.put("contributors_num", String.valueOf(i));
        LIZLLL.put("user_rank", C74824TYe.LJIILJJIL(responseData));
        LIZLLL.put("duration", String.valueOf(System.currentTimeMillis() - C74824TYe.LJII));
        C74824TYe.LJLL("livesdk_guest_charm_ranking_list_duration", LIZLLL);
    }

    public final boolean vl(User user) {
        Long l;
        User user2 = this.LJLLLL;
        if (user2 != null) {
            l = Long.valueOf(user2.getId());
        } else {
            l = null;
        }
        return o.LJ(l, Long.valueOf(user.getId()));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 30), view.findViewById(R.id.liz));
        this.LJLIL = (RunnableC31065CHd) view.findViewById(R.id.j_2);
        this.LJLJJI = (CVT) view.findViewById(R.id.g94);
        this.LJLJJL = view.findViewById(R.id.cvv);
        this.LJLJJLL = view.findViewById(R.id.gyt);
        this.LJLJL = (C41081jM) view.findViewById(R.id.eca);
        this.LJLJLJ = (C47121t6) view.findViewById(R.id.m5c);
        this.LJLJLLL = (C75174Tes) view.findViewById(R.id.jnf);
        this.LJLL = (C47121t6) view.findViewById(R.id.jo9);
        this.LJLLI = (C2A7) view.findViewById(R.id.az2);
        TV5 tv5 = new TV5();
        tv5.LIZ(this.LJLLLL, null, this.LJLLLLLL, this.LJLZ, this);
        this.LJLILLLLZI = tv5;
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 31), view2);
        }
        C41081jM c41081jM = this.LJLJL;
        if (c41081jM != null) {
            C16880lQ.LJJIIZI(c41081jM, new ACListenerS25S0100000_5(this, 21));
        }
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && this.LJLLL == EnumC74877Ta5.LIVE_SHOW_END) {
            C47121t6 c47121t6 = this.LJLJLJ;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.ndf));
            }
        } else {
            C47121t6 c47121t62 = this.LJLJLJ;
            if (c47121t62 != null) {
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ltv);
                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_guest_points_ranking_header)");
                String LLLZ = C16880lQ.LLLZ(LJIILJJIL, Arrays.copyOf(new Object[]{C05170If.LIZ(this.LJLLLL)}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                c47121t62.setText(LLLZ);
            }
        }
        C2A7 c2a7 = this.LJLLI;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS33S0100000_13(this, 32));
        }
    }
}
