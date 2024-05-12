package com.ss.android.ugc.aweme.music.ghost;

import X.C16880lQ;
import X.C1DJ;
import X.C246219lR;
import X.C26227ARb;
import X.C47704Ins;
import X.C55749LuL;
import X.C78983UzD;
import X.C98T;
import X.FMX;
import X.InterfaceC246309la;
import X.SY4;
import X.UC0;
import X.Z8A;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.profile.IProfileAssemService;
import com.ss.android.ugc.aweme.profile.model.ClaimStatus;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class ClaimStatusMusicAssem extends UISlotAssem implements InterfaceC246309la {
    public static final C246219lR LJLLILLLL = new Object() { // from class: X.9lR
    };
    public User LJLL;
    public Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());

    public void _$_clearFindViewByIdCache() {
        this.LJLLI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC246309la, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int v3() {
        return R.layout.c54;
    }

    private final OriginMusicArg H3() {
        return (OriginMusicArg) this.LJLJLLL.getValue();
    }

    @Override // X.InterfaceC246309la
    public void LJLJI() {
        String str;
        User user = this.LJLL;
        if (user != null && C1DJ.LJJIJIIJI(user)) {
            HashMap hashMap = new HashMap();
            User user2 = this.LJLL;
            if (user2 == null || (str = C1DJ.LJIILJJIL(user2)) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("status", str);
            FMX.LJIIL("ghost_music_tab_show", hashMap);
        }
    }

    @Override // X.InterfaceC246309la
    public void LLLIIIIL() {
        String str;
        User user = this.LJLL;
        if (user != null && C1DJ.LJJIJIIJI(user)) {
            HashMap hashMap = new HashMap();
            User user2 = this.LJLL;
            if (user2 == null || (str = C1DJ.LJIILJJIL(user2)) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("status", str);
            FMX.LJIIL("ghost_music_tab_click", hashMap);
        }
    }

    public final void L3() {
        Context context = getContext();
        if (context != null) {
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJ(R.string.btt);
            c26227ARb.LIZIZ(Html.fromHtml(context.getResources().getString(R.string.bts)));
            UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 429));
            c26227ARb.LJI().LIZLLL();
        }
    }

    public final void I3(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        User user = this.LJLL;
        if (user == null || (str2 = C1DJ.LJIILJJIL(user)) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("status", str2);
        FMX.LJIIL("ghost_button_click", hashMap);
    }

    public final void K3(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        User user = this.LJLL;
        if (user == null || (str2 = C1DJ.LJIILJJIL(user)) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("status", str2);
        FMX.LJIIL("ghost_toast_click", hashMap);
    }

    public final void M3(final View view) {
        final MusicTabInfo musicTabInfo;
        MusicTabClaimInfo musicTabClaimInfo;
        MusicTabClaimInfo musicTabClaimInfo2;
        MusicTabClaimInfo musicTabClaimInfo3;
        String desc;
        MusicTabClaimInfo musicTabClaimInfo4;
        MusicTabClaimInfo musicTabClaimInfo5;
        String desc2;
        String str;
        MusicTabClaimInfo musicTabClaimInfo6;
        boolean z;
        MusicTabClaimInfo musicTabClaimInfo7;
        User user = this.LJLL;
        if (user != null && C1DJ.LJJIJIIJI(user)) {
            User user2 = this.LJLL;
            String str2 = null;
            if (user2 != null) {
                musicTabInfo = user2.getMusicTabInfo();
            } else {
                musicTabInfo = null;
            }
            C78983UzD.LJJLIIIJL(view);
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.drv);
            if (tuxIconView != null) {
                if (musicTabInfo != null && (musicTabClaimInfo7 = musicTabInfo.getMusicTabClaimInfo()) != null && musicTabClaimInfo7.getStatus() == ClaimStatus.UNDER_REVIEW.getValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    tuxIconView.setIconRes(R.raw.icon_2pt_clock);
                    tuxIconView.setTintColorRes(R.attr.gp);
                } else {
                    tuxIconView.setIconRes(R.raw.icon_2pt_exclamation_mark_circle);
                    tuxIconView.setTintColorRes(R.attr.gp);
                }
            }
            TextView textView = (TextView) view.findViewById(R.id.dru);
            if (textView != null) {
                if (musicTabInfo == null || (musicTabClaimInfo5 = musicTabInfo.getMusicTabClaimInfo()) == null || (desc2 = musicTabClaimInfo5.getDesc()) == null || desc2.length() == 0) {
                    C78983UzD.LJJIL(textView);
                } else {
                    C78983UzD.LJJLIIIJL(textView);
                    if (musicTabInfo != null && (musicTabClaimInfo6 = musicTabInfo.getMusicTabClaimInfo()) != null) {
                        str = musicTabClaimInfo6.getTitle();
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                }
            }
            TextView textView2 = (TextView) view.findViewById(R.id.drw);
            if (textView2 != null) {
                if (musicTabInfo == null || (musicTabClaimInfo3 = musicTabInfo.getMusicTabClaimInfo()) == null || (desc = musicTabClaimInfo3.getDesc()) == null || desc.length() == 0) {
                    C78983UzD.LJJIL(textView2);
                } else {
                    C78983UzD.LJJLIIIJL(textView2);
                    if (musicTabInfo != null && (musicTabClaimInfo4 = musicTabInfo.getMusicTabClaimInfo()) != null) {
                        str2 = musicTabClaimInfo4.getDesc();
                    }
                    textView2.setText(str2);
                }
            }
            SY4 sy4 = (SY4) view.findViewById(R.id.gyj);
            if (sy4 != null) {
                sy4.setButtonVariant(5);
                if (musicTabInfo != null && (musicTabClaimInfo2 = musicTabInfo.getMusicTabClaimInfo()) != null && musicTabClaimInfo2.getStatus() == ClaimStatus.UNDER_REVIEW.getValue()) {
                    C78983UzD.LJJIL(sy4);
                } else {
                    C78983UzD.LJJLIIIJL(sy4);
                    C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 5), sy4);
                }
            }
            TextView textView3 = (TextView) view.findViewById(R.id.hy_);
            if (textView3 != null) {
                if (musicTabInfo != null && (musicTabClaimInfo = musicTabInfo.getMusicTabClaimInfo()) != null && musicTabClaimInfo.getStatus() == ClaimStatus.UNDER_REVIEW.getValue()) {
                    textView3.setText(R.string.bu2);
                    C16880lQ.LJIIJ(new C98T() { // from class: X.9lL
                        @Override // X.C98T
                        public final void LIZ(View view2) {
                            Integer num;
                            MusicTabClaimInfo musicTabClaimInfo8;
                            if (view2 != null) {
                                Context context = view.getContext();
                                EnumC246169lM enumC246169lM = EnumC246169lM.GHOST_TAB;
                                ClaimStatus.Companion companion = ClaimStatus.Companion;
                                MusicTabInfo musicTabInfo2 = musicTabInfo;
                                if (musicTabInfo2 != null && (musicTabClaimInfo8 = musicTabInfo2.getMusicTabClaimInfo()) != null) {
                                    num = Integer.valueOf(musicTabClaimInfo8.getStatus());
                                } else {
                                    num = null;
                                }
                                SmartRouter.buildRoute(context, new C38281F0r(C246139lJ.LIZ(enumC246169lM, companion.of(num))).LJ()).open();
                                this.I3("privilege");
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(300L);
                        }
                    }, textView3);
                } else {
                    textView3.setText(R.string.bu4);
                    C16880lQ.LJIIJ(new C98T() { // from class: X.9lK
                        @Override // X.C98T
                        public final void LIZ(View view2) {
                            Integer num;
                            MusicTabClaimInfo musicTabClaimInfo8;
                            if (view2 != null) {
                                Context context = view.getContext();
                                EnumC246169lM from = EnumC246169lM.GHOST_TAB;
                                ClaimStatus.Companion companion = ClaimStatus.Companion;
                                MusicTabInfo musicTabInfo2 = musicTabInfo;
                                if (musicTabInfo2 != null && (musicTabClaimInfo8 = musicTabInfo2.getMusicTabClaimInfo()) != null) {
                                    num = Integer.valueOf(musicTabClaimInfo8.getStatus());
                                } else {
                                    num = null;
                                }
                                ClaimStatus claimStatus = companion.of(num);
                                o.LJIIIZ(from, "from");
                                o.LJIIIZ(claimStatus, "claimStatus");
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(C246139lJ.LIZJ().getSearchInputUrl());
                                LIZ.append("&enter_from=");
                                LIZ.append(from.getFrom());
                                LIZ.append("&user_status=");
                                LIZ.append(claimStatus.getValue());
                                SmartRouter.buildRoute(context, new C38281F0r(X1D.LIZIZ(LIZ)).LJ()).open();
                                this.I3("resubmit");
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(300L);
                        }
                    }, textView3);
                }
            }
            view.requestLayout();
            return;
        }
        C78983UzD.LJJIL(view);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        User user;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        OriginMusicArg H3 = H3();
        if (H3 != null) {
            user = H3.getUser();
        } else {
            user = null;
        }
        this.LJLL = user;
        IProfileAssemService profileAssemService = Z8A.LIZIZ.getProfileAssemService();
        if (profileAssemService != null) {
            profileAssemService.selectSubscribeProfileInfoServiceUserUpdateEvent(this, new AqS135S0200000_4(this, view, 67));
        }
    }
}
