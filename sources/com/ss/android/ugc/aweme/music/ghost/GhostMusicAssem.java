package com.ss.android.ugc.aweme.music.ghost;

import X.C16880lQ;
import X.C1DJ;
import X.C214298b3;
import X.C214528bQ;
import X.C246139lJ;
import X.C246199lP;
import X.C246229lS;
import X.C26227ARb;
import X.C38281F0r;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C78983UzD;
import X.EnumC246169lM;
import X.FMX;
import X.InterfaceC246319lb;
import X.SY4;
import X.UC0;
import X.Z8A;
import android.content.Context;
import android.text.Html;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
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
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class GhostMusicAssem extends UISlotAssem implements InterfaceC246319lb {
    public static final C246229lS LJLLLL = new Object() { // from class: X.9lS
    };
    public final C214298b3 LJLJLLL;
    public final C55749LuL LJLL;
    public User LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public Map<Integer, View> LJLLL = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLL;
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

    @Override // X.InterfaceC246319lb, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int v3() {
        return R.layout.c56;
    }

    public GhostMusicAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(GhostMusicTabViewModel.class);
        this.LJLJLLL = new C214298b3(new AqS154S0100000_4(LIZ, 452), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C246199lP.INSTANCE, LIZ);
        this.LJLL = new C55749LuL(C47704Ins.LJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    }

    private final OriginMusicArg I3() {
        return (OriginMusicArg) this.LJLL.getValue();
    }

    private final void M3() {
        String str;
        HashMap hashMap = new HashMap();
        if (this.LJLLILLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("red_dot", str);
        FMX.LJIIL("ghost_music_tab_show", hashMap);
    }

    public final GhostMusicTabViewModel H3() {
        return (GhostMusicTabViewModel) this.LJLJLLL.getValue();
    }

    @Override // X.InterfaceC246319lb
    public void LJLJI() {
        User user = this.LJLLI;
        if (user != null && C1DJ.LJJIJIL(user)) {
            this.LJLLJ++;
            Keva.getRepo("repo_profile_music").storeInt("key_ghost_show_times", this.LJLLJ);
            M3();
        }
    }

    @Override // X.InterfaceC246319lb
    public void LLLIIIIL() {
        String str;
        User user = this.LJLLI;
        if (user != null && C1DJ.LJJIJIL(user)) {
            HashMap hashMap = new HashMap();
            if (this.LJLLILLLL) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("red_dot", str);
            hashMap.put("show_times", String.valueOf(this.LJLLJ));
            FMX.LJIIL("ghost_music_tab_click", hashMap);
        }
    }

    public final void K3() {
        Context LLLLL;
        MusicTabClaimInfo musicTabClaimInfo;
        MusicTabInfo musicTabInfo;
        Context context = getContext();
        if (context != null && (LLLLL = C16880lQ.LLLLL(context)) != null) {
            User user = this.LJLLI;
            Integer num = null;
            if (user != null && (musicTabInfo = user.getMusicTabInfo()) != null) {
                musicTabClaimInfo = musicTabInfo.getMusicTabClaimInfo();
            } else {
                musicTabClaimInfo = null;
            }
            EnumC246169lM enumC246169lM = EnumC246169lM.GHOST_TAB;
            ClaimStatus.Companion companion = ClaimStatus.Companion;
            if (musicTabClaimInfo != null) {
                num = Integer.valueOf(musicTabClaimInfo.getStatus());
            }
            SmartRouter.buildRoute(LLLLL, new C38281F0r(C246139lJ.LIZ(enumC246169lM, companion.of(num))).LJ()).open();
        }
    }

    public final void O3() {
        Context context = getContext();
        if (context != null) {
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJ(R.string.btt);
            c26227ARb.LIZIZ(Html.fromHtml(context.getResources().getString(R.string.bts)));
            UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 430));
            c26227ARb.LJI().LIZLLL();
        }
    }

    public final void L3(boolean z) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (this.LJLLILLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("red_dot", str);
        if (z) {
            str2 = "show_case";
        } else {
            str2 = "not_interested";
        }
        hashMap.put("name", str2);
        hashMap.put("show_times", String.valueOf(this.LJLLJ));
        FMX.LJIIL("ghost_button_click", hashMap);
    }

    public final void N3(boolean z) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (this.LJLLILLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("red_dot", str);
        if (z) {
            str2 = "cancel";
        } else {
            str2 = "not_interested";
        }
        hashMap.put("name", str2);
        hashMap.put("show_times", String.valueOf(this.LJLLJ));
        FMX.LJIIL("ghost_toast_click", hashMap);
    }

    public final void P3(View view) {
        User user = this.LJLLI;
        if (user != null && C1DJ.LJJIJIL(user)) {
            C78983UzD.LJJLIIIJL(view);
            View findViewById = view.findViewById(R.id.hy_);
            if (findViewById != null) {
                C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 6), findViewById);
            }
            SY4 sy4 = (SY4) view.findViewById(R.id.gyj);
            if (sy4 != null) {
                sy4.setButtonVariant(5);
                C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 7), sy4);
            }
            this.LJLLILLLL = Keva.getRepo("repo_profile_music").getBoolean("key_show_music_alert_badge", true);
            this.LJLLJ = Keva.getRepo("repo_profile_music").getInt("key_ghost_show_times", 0);
            return;
        }
        C78983UzD.LJJIL(view);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        User user;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        OriginMusicArg I3 = I3();
        if (I3 != null) {
            user = I3.getUser();
        } else {
            user = null;
        }
        this.LJLLI = user;
        IProfileAssemService profileAssemService = Z8A.LIZIZ.getProfileAssemService();
        if (profileAssemService != null) {
            profileAssemService.selectSubscribeProfileInfoServiceUserUpdateEvent(this, new AqS135S0200000_4(this, view, 68));
        }
    }
}
