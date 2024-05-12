package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.AbstractC73672Svk;
import X.B83;
import X.BZI;
import X.C15380j0;
import X.C15490jB;
import X.C17280m4;
import X.C17P;
import X.C1EW;
import X.C278817o;
import X.C28433BDx;
import X.C28507BGt;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29486Bhi;
import X.C29494Bhq;
import X.C30954CCw;
import X.C31847Ceh;
import X.C41071jL;
import X.C47061t0;
import X.C47121t6;
import X.C47171tB;
import X.C73411SrX;
import X.CFX;
import X.CN1;
import X.InterfaceC29495Bhr;
import X.Q7L;
import X.X1D;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubscriptionCommunityFragment extends LiveDialogFragment implements InterfaceC29495Bhr {
    public static final /* synthetic */ int LLILZLL = 0;
    public ViewGroup LJLIL;
    public C47121t6 LJLILLLLZI;
    public LiveIconView LJLJI;
    public C47171tB LJLJJI;
    public C29486Bhi LJLJJL;
    public ViewGroup LJLJJLL;
    public ViewGroup LJLJL;
    public C47061t0 LJLJLJ;
    public C47121t6 LJLJLLL;
    public LiveIconView LJLL;
    public ViewGroup LJLLI;
    public ViewGroup LJLLILLLL;
    public C47121t6 LJLLJ;
    public ViewGroup LJLLL;
    public C47121t6 LJLLLL;
    public C47061t0 LJLLLLLL;
    public ViewGroup LJLZ;
    public C47061t0 LJZ;
    public C47121t6 LJZI;
    public ViewGroup LJZL;
    public C47121t6 LL;
    public ViewGroup LLD;
    public C47121t6 LLF;
    public ViewGroup LLFF;
    public ProgressBar LLFFF;
    public C47121t6 LLFII;
    public ViewGroup LLFZ;
    public C47121t6 LLI;
    public ViewGroup LLIFFJFJJ;
    public ViewGroup LLII;
    public C47121t6 LLIIII;
    public LiveIconView LLIIIILZ;
    public ViewGroup LLIIIJ;
    public C47121t6 LLIIIL;
    public boolean LLIIIZ;
    public ViewGroup LLIIJI;
    public C47121t6 LLIIJLIL;
    public ViewGroup LLIIL;
    public C41071jL LLIILII;
    public ViewGroup LLIILZL;
    public C47121t6 LLIIZ;
    public ViewGroup LLIL;
    public int LLILII;
    public Room LLILIL;
    public C30954CCw LLILL;
    public C73411SrX LLILLIZIL;
    public long LLILLJJLI;
    public final Map<Integer, View> LLILZIL = new LinkedHashMap();
    public String LLILLL = "";
    public final C28433BDx LLILZ = new C28433BDx();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILZIL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILZIL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d1e);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 73;
        return c28507BGt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x053b, code lost:
    
        if (r7 != null) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0540, code lost:
    
        if (r7.timerStatus == 3) goto L255;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wl() {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment.wl():void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C73411SrX c73411SrX = this.LLILLIZIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).zb(getContext(), "subscription_pin_card_info");
    }

    public final void Al(String str) {
        String str2;
        User owner;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("has_shown_subscription_customized_perks_intro_");
        LIZ.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        String LIZIZ = X1D.LIZIZ(LIZ);
        Boolean bool = (Boolean) ((IBrowserService) CN1.LIZ(IBrowserService.class)).Wn(getContext(), LIZIZ);
        if (bool == null) {
            Dl(LIZIZ, vl(str));
            return;
        }
        if (bool.booleanValue()) {
            Context context = getContext();
            String pinManagementPage = LiveSubscriptionAnchorUrlSetting.pinManagementPage();
            Map<String, String> vl = vl(str);
            Room room = this.LLILIL;
            if (room == null || (owner = room.getOwner()) == null || (str2 = owner.getSecUid()) == null) {
                str2 = "";
            }
            vl.put("sec_anchor_id", str2);
            vl.put("user_type", "anchor");
            C31847Ceh.LJIIIIZZ(context, pinManagementPage, vl);
            return;
        }
        Dl(LIZIZ, vl(str));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        long j;
        User owner;
        String secUid;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.kv0(C29494Bhq.class);
        }
        DataChannel dataChannel2 = this.dataChannel;
        Room room = null;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        }
        this.LLILIL = room;
        SubscribeApi subscribeApi = (SubscribeApi) Q7L.LIZIZ(SubscribeApi.class);
        Room room2 = this.LLILIL;
        String str2 = "";
        if (room2 == null || (str = C17280m4.LIZ(room2)) == null) {
            str = "";
        }
        AbstractC73672Svk LIZ = C1EW.LIZ(subscribeApi.getAnchorSubscriptionInfo(str));
        Room room3 = this.LLILIL;
        if (room3 != null && (owner = room3.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
            str2 = secUid;
        }
        Room room4 = this.LLILIL;
        if (room4 != null) {
            j = room4.getId();
        } else {
            j = 0;
        }
        AbstractC73672Svk.LJJLL(LIZ, C1EW.LIZ(subscribeApi.getAnchorSubscriptionManagement(str2, j)), C17P.LJLIL).LJJJJZI(new AfS57S0100000_5(this, 269));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final Map<String, String> vl(String str) {
        String str2;
        String str3;
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        String LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = this.LLILIL;
        String str4 = "";
        if (room == null || (str2 = C17280m4.LIZ(room)) == null) {
            str2 = "";
        }
        linkedHashMap.put("room_id", str2);
        Room room2 = this.LLILIL;
        if (room2 != null && (owner2 = room2.getOwner()) != null && (LIZIZ = C278817o.LIZIZ(owner2)) != null) {
            str4 = LIZIZ;
        }
        linkedHashMap.put("anchor_id", str4);
        if (str == null) {
            str = this.LLILLL;
        }
        linkedHashMap.put("show_entrance", str);
        Room room3 = this.LLILIL;
        if (room3 != null && (owner = room3.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isSubscribed()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_subscribe", str3);
        linkedHashMap.put("previous_page_name", "subscription_management_popup");
        return linkedHashMap;
    }

    public final void xl(Integer num) {
        Long l;
        String str;
        User owner;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_page_tips_click");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ(this.LLILLL, "show_entrance");
        Room room = this.LLILIL;
        Long l2 = null;
        if (room != null && (owner = room.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "anchor_id");
        Room room2 = this.LLILIL;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        }
        LIZ.LJIJJ(l2, "room_id");
        if (num != null) {
            if (num.intValue() == 0) {
                str = "subscribers";
            } else if (num != null) {
                if (num.intValue() == 1) {
                    str = "sub_goal";
                } else if (num.intValue() == 2) {
                    str = "customized_perks_pin";
                } else if (num.intValue() == 4 || num.intValue() == 3) {
                    str = "sub_only_live";
                }
            }
            LIZ.LJIJJ(str, "show_type");
            LIZ.LJJIIJZLJL();
        }
        str = "";
        LIZ.LJIJJ(str, "show_type");
        LIZ.LJJIIJZLJL();
    }

    public final void Dl(String str, Map<String, String> map) {
        C31847Ceh.LJIIIIZZ(getContext(), LiveSubscriptionAnchorUrlSetting.pinManagementIntro(), map);
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).qk0(getContext(), Boolean.TRUE, str);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (ViewGroup) view.findViewById(R.id.knf);
        this.LJLILLLLZI = (C47121t6) view.findViewById(R.id.knk);
        this.LJLJI = (LiveIconView) view.findViewById(R.id.knj);
        this.LJLJJI = (C47171tB) view.findViewById(R.id.af5);
        this.LJLJJL = (C29486Bhi) view.findViewById(R.id.bul);
        this.LJLJJLL = (ViewGroup) view.findViewById(R.id.em0);
        this.LJLJL = (ViewGroup) view.findViewById(R.id.l9_);
        this.LJLJLJ = (C47061t0) view.findViewById(R.id.l99);
        this.LJLJLLL = (C47121t6) view.findViewById(R.id.l94);
        this.LJLL = (LiveIconView) view.findViewById(R.id.j21);
        this.LJLLI = (ViewGroup) view.findViewById(R.id.kqa);
        this.LJLLILLLL = (ViewGroup) view.findViewById(R.id.lip);
        this.LJLLJ = (C47121t6) view.findViewById(R.id.liq);
        this.LJLLL = (ViewGroup) view.findViewById(R.id.h0c);
        this.LJLLLL = (C47121t6) view.findViewById(R.id.h0d);
        this.LJLLLLLL = (C47061t0) view.findViewById(R.id.h08);
        this.LJLZ = (ViewGroup) view.findViewById(R.id.h0a);
        this.LJZ = (C47061t0) view.findViewById(R.id.h09);
        this.LJZI = (C47121t6) view.findViewById(R.id.h0b);
        this.LJZL = (ViewGroup) view.findViewById(R.id.nhd);
        this.LL = (C47121t6) view.findViewById(R.id.nhe);
        this.LLD = (ViewGroup) view.findViewById(R.id.d1m);
        this.LLF = (C47121t6) view.findViewById(R.id.d1n);
        this.LLFF = (ViewGroup) view.findViewById(R.id.ko1);
        this.LLFFF = (ProgressBar) view.findViewById(R.id.ko3);
        this.LLFII = (C47121t6) view.findViewById(R.id.ko2);
        this.LLFZ = (ViewGroup) view.findViewById(R.id.c2r);
        this.LLI = (C47121t6) view.findViewById(R.id.c2s);
        this.LLIFFJFJJ = (ViewGroup) view.findViewById(R.id.aip);
        this.LLII = (ViewGroup) view.findViewById(R.id.kpf);
        this.LLIIII = (C47121t6) view.findViewById(R.id.kpd);
        this.LLIIIILZ = (LiveIconView) view.findViewById(R.id.kpe);
        this.LLIIIJ = (ViewGroup) view.findViewById(R.id.ksc);
        this.LLIIIL = (C47121t6) view.findViewById(R.id.ksb);
        this.LLIIJI = (ViewGroup) view.findViewById(R.id.kon);
        this.LLIIJLIL = (C47121t6) view.findViewById(R.id.koo);
        this.LLIIL = (ViewGroup) view.findViewById(R.id.koc);
        this.LLIILII = (C41071jL) view.findViewById(R.id.kod);
        this.LLIILZL = (ViewGroup) view.findViewById(R.id.knt);
        this.LLIIZ = (C47121t6) view.findViewById(R.id.knu);
        this.LLIL = (ViewGroup) view.findViewById(R.id.by_);
        C15490jB.LJ(this.LJLJLJ, CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_icon_tips.png");
        C15490jB.LJ(this.LJLLLLLL, CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_top_arrow_green.png");
        ViewGroup viewGroup = this.LJLJJLL;
        if (viewGroup != null) {
            viewGroup.post(new ARunnableS41S0100000_5(this, 153));
        }
        C29486Bhi c29486Bhi = this.LJLJJL;
        if (c29486Bhi != null) {
            ((ArrayList) c29486Bhi.LLIFFJFJJ).add(this);
        }
        wl();
    }

    @Override // X.InterfaceC29495Bhr
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        ViewGroup viewGroup = this.LLIL;
        if (viewGroup != null) {
            viewGroup.setAlpha(C15380j0.LJIJ(i2 - this.LLILII) / 24);
            if (viewGroup.getAlpha() > 0.0f) {
                C29306Beo.LJJLJLI(viewGroup);
            } else {
                C29306Beo.LJI(viewGroup);
            }
        }
    }
}
