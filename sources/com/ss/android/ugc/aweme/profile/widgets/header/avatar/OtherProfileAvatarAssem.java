package com.ss.android.ugc.aweme.profile.widgets.header.avatar;

import X.APS;
import X.APV;
import X.AUA;
import X.AV1;
import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C235099Kn;
import X.C26175APb;
import X.C26176APc;
import X.C26179APf;
import X.C26180APg;
import X.C30746C4w;
import X.C38995FSd;
import X.C43I;
import X.C47704Ins;
import X.C53473Kyj;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C71799SFv;
import X.C73318Sq2;
import X.C78895Uxn;
import X.C8VC;
import X.C9A9;
import X.C9JZ;
import X.C9PN;
import X.EnumC112364b2;
import X.EnumC221088m0;
import X.EnumC53663L4h;
import X.InterfaceC100173wT;
import X.InterfaceC100183wU;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC81252Vui;
import X.JBQ;
import X.L4O;
import X.L59;
import X.L69;
import X.M9F;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS5S1100000_4;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveAvatarAnimationOptimizeV2Config;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.ss.android.ugc.profile.platform.business.header.business.avatar.business.base.IAvatarMainAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class OtherProfileAvatarAssem extends ProfileAvatarAssem implements C9A9, IAvatarMainAbility {
    public final C55749LuL LJLL;
    public SlimRoom LJLLI;
    public FrameLayout LJLLILLLL;
    public FrameLayout LJLLJ;
    public SmartImageView LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C5H3 LJLLLLLL;

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final AvatarPresenter E3() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final boolean L7() {
        return false;
    }

    public OtherProfileAvatarAssem() {
        new LinkedHashMap();
        this.LJLL = new C55749LuL(C47704Ins.LJ(this, C26175APb.class, null), checkSupervisorPrepared());
        this.LJLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 735));
        this.LJLLLLLL = C221108m2.LIZ(EnumC221088m0.NONE, C9JZ.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final APV C3() {
        return APS.LIZIZ.LIZ(new AqS170S0100000_4(this, 709));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final void v3() {
        L69 l69;
        Map<EnumC53663L4h, L4O> currentActiveBusiness;
        User I3;
        String str;
        L69 l692 = this.LJLIL;
        if (l692 != null) {
            l692.LIZIZ(new ACListenerS24S0100000_4(this, 149));
        }
        this.LJLLI = null;
        if (C30746C4w.LIZ() && (l69 = this.LJLIL) != null && (currentActiveBusiness = l69.getCurrentActiveBusiness()) != null && currentActiveBusiness.containsKey(EnumC53663L4h.LIVE) && !AV1.LJIIZILJ(I3(), false) && (I3 = I3()) != null && (str = I3.roomData) != null) {
            C38995FSd.LIZJ().execute(new ARunnableS5S1100000_4(this, str, 7));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final void x3() {
        C71799SFv avatar;
        InterfaceC81252Vui controller;
        Animatable LIZ;
        boolean z;
        C43I<Boolean> c43i;
        boolean booleanValue;
        boolean z2;
        MainBusinessAbility mainBusinessAbility;
        L69 l69 = this.LJLIL;
        if (l69 == null || (avatar = l69.getAvatar()) == null || (controller = avatar.getController()) == null || (LIZ = controller.LIZ()) == null) {
            return;
        }
        boolean z3 = AUA.LJI;
        AUA.LJI = false;
        if (z3) {
            LIZ.stop();
            return;
        }
        if (C235099Kn.LIZ()) {
            z = H3().getState().LJLLLLLL;
        } else {
            C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
            if (c9pn != null) {
                z = c9pn.LJIIIZ;
            } else {
                z = false;
            }
        }
        if (C235099Kn.LIZ()) {
            C43I<Boolean> c43i2 = H3().getState().LLFFF;
            if (c43i2 != null) {
                booleanValue = c43i2.LIZ.booleanValue();
            }
            booleanValue = false;
        } else {
            C9PN c9pn2 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
            if (c9pn2 != null && (c43i = c9pn2.LJIIJ) != null) {
                booleanValue = c43i.LIZ.booleanValue();
            }
            booleanValue = false;
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null && (mainBusinessAbility = (MainBusinessAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ2, null), MainBusinessAbility.class, null)) != null) {
            z2 = mainBusinessAbility.D30(C212428Vi.LIZ(this));
        } else {
            z2 = false;
        }
        if (!z || (z2 && !booleanValue)) {
            if (LIZ.isRunning()) {
                LIZ.stop();
            }
        } else {
            if (LIZ.isRunning()) {
                return;
            }
            LIZ.start();
        }
    }

    @Override // X.C9A9
    public final void LJIILLIIL() {
        O3(I3());
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final boolean isVisible() {
        if (C235099Kn.LIZ()) {
            return H3().getState().LJLLLLLL;
        }
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null && c9pn.LJIIIZ) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C55096Ljo.LJIIJJI(C55096Ljo.LJIIZILJ(this), this, IAvatarMainAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C55096Ljo.LJIILL(this, IAvatarMainAbility.class, null);
        EventBus.LIZJ().LJIJ(this);
        ((C73318Sq2) this.LJLLLLLL.getValue()).LIZLLL();
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        InterfaceC100173wT interfaceC100173wT = this.LJLJJLL;
        if (interfaceC100173wT != null) {
            interfaceC100173wT.onInvisible();
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        InterfaceC100173wT interfaceC100173wT = this.LJLJJLL;
        if (interfaceC100173wT != null) {
            interfaceC100173wT.onVisible();
        }
        P3(true);
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        P3(false);
    }

    public final void P3(boolean z) {
        if (((LiveAvatarAnimationOptimizeV2Config) C78895Uxn.LIZ().LJIIIZ(LiveAvatarAnimationOptimizeV2Config.LIZ, "live_avatar_animation_optimize_v2")).enable) {
            if (z) {
                L69 l69 = this.LJLIL;
                if (l69 != null) {
                    l69.LIZLLL(EnumC53663L4h.LIVE, L59.RESUME_ANIMATION);
                    return;
                }
                return;
            }
            L69 l692 = this.LJLIL;
            if (l692 == null) {
                return;
            }
            l692.LIZLLL(EnumC53663L4h.LIVE, L59.PAUSE_ANIMATION);
        }
    }

    public final void Q3(boolean z) {
        Map<EnumC53663L4h, L4O> currentActiveBusiness;
        if (z) {
            M9F m9f = (M9F) this.LJLJL.getValue();
            if (m9f != null) {
                m9f.LIZJ();
            }
            this.LJLLLL.getValue().getClass();
            boolean z2 = false;
            C26180APg.LIZ = false;
            C26180APg.LIZIZ = false;
            C26180APg.LIZJ = false;
            C26180APg.LIZLLL = false;
            C26180APg.LJ = false;
            JBQ.LJLJLJ = false;
            JBQ jbq = (JBQ) this.LJLLLL.getValue();
            User I3 = I3();
            L69 l69 = this.LJLIL;
            if (l69 != null && (currentActiveBusiness = l69.getCurrentActiveBusiness()) != null && currentActiveBusiness.containsKey(EnumC53663L4h.STORY) && (currentActiveBusiness.get(EnumC53663L4h.STORY) instanceof C53473Kyj)) {
                z2 = true;
            }
            jbq.LJ(I3, l69, z2);
        } else {
            M9F m9f2 = (M9F) this.LJLJL.getValue();
            if (m9f2 != null) {
                m9f2.LIZIZ();
            }
            L69 l692 = this.LJLIL;
            if (l692 != null) {
                l692.LIZLLL(EnumC53663L4h.STORY, L59.END_ANIMATION);
            }
        }
        P3(z);
        x3();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:7:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.avatar.business.base.IAvatarMainAbility
    public final void ec0(java.lang.String r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.profile.model.User r3 = r4.I3()
            if (r3 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r3.roomData
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
        L10:
            java.lang.String r1 = r3.roomData     // Catch: java.lang.Exception -> L29
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.SlimRoom> r0 = com.bytedance.android.livesdkapi.depend.model.live.SlimRoom.class
            java.lang.Object r0 = X.C237429Tm.LIZ(r1, r0)     // Catch: java.lang.Exception -> L29
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r0 = (com.bytedance.android.livesdkapi.depend.model.live.SlimRoom) r0     // Catch: java.lang.Exception -> L29
            r4.LJLLI = r0     // Catch: java.lang.Exception -> L29
            if (r0 == 0) goto L29
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic r0 = r0.getLinkMic()     // Catch: java.lang.Exception -> L29
            if (r0 == 0) goto L29
            int r0 = r0.followedCount     // Catch: java.lang.Exception -> L29
            if (r0 <= 0) goto L29
            return
        L29:
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.ss.android.ugc.aweme.live.LiveOuterService.LJJJLL()
            X.LjV r2 = r0.getLiveStateManager()
            X.9KW r1 = new X.9KW
            r1.<init>()
            java.lang.String r0 = "tiktok_profile_head"
            r2.LJIIIIZZ(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.header.avatar.OtherProfileAvatarAssem.ec0(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC100173wT LIZIZ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.acu);
        SmartImageView smartImageView = null;
        if (frameLayout != null) {
            frameLayout.setClickable(false);
            frameLayout.setOutlineProvider(new C26176APc(frameLayout));
            frameLayout.setClipToOutline(true);
        } else {
            frameLayout = null;
        }
        this.LJLLILLLL = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.act);
        if (frameLayout2 != null) {
            frameLayout2.setClickable(false);
            frameLayout2.setOutlineProvider(new C26179APf(frameLayout2));
            frameLayout2.setClipToOutline(true);
        } else {
            frameLayout2 = null;
        }
        this.LJLLJ = frameLayout2;
        SmartImageView smartImageView2 = (SmartImageView) view.findViewById(R.id.acs);
        if (smartImageView2 != null) {
            smartImageView2.setClickable(false);
            smartImageView = smartImageView2;
        }
        this.LJLLL = smartImageView;
        if (SC()) {
            FrameLayout frameLayout3 = this.LJLLILLLL;
            if (frameLayout3 != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = 84;
                    layoutParams.height = 84;
                    frameLayout3.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            FrameLayout frameLayout4 = this.LJLLJ;
            if (frameLayout4 != null) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout4.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = 84;
                    layoutParams2.height = 84;
                    frameLayout4.setLayoutParams(layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.API
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 713));
        if (C235099Kn.LIZ()) {
            H3().pv0(new AqS170S0100000_4(this, 714));
        } else {
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.APJ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C9PN) obj).LJIIIZ);
                }
            }, new AqS170S0100000_4(this, 710));
        }
        L69 l69 = this.LJLIL;
        if (l69 != null) {
            l69.LJI(EnumC53663L4h.LIVE, new AqS170S0100000_4(this, 711));
        }
        L69 l692 = this.LJLIL;
        if (l692 != null) {
            l692.LJI(EnumC53663L4h.STORY, new AqS170S0100000_4(this, 712));
        }
        InterfaceC100183wU activityStatusAccuracyAnalysis = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAccuracyAnalysis();
        EnumC112364b2 enumC112364b2 = EnumC112364b2.PROFILE_PAGE;
        L69 l693 = this.LJLIL;
        if (l693 == null) {
            return;
        }
        LIZIZ = activityStatusAccuracyAnalysis.LIZIZ(enumC112364b2, l693, this, getContext(), null);
        this.LJLJJLL = LIZIZ;
    }
}
