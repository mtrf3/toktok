package com.ss.android.ugc.feed.platform.panel.pip;

import X.AbstractC55082Lja;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C2MA;
import X.C2MJ;
import X.C48770JCc;
import X.C50913JyX;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.C66642jU;
import X.C8MM;
import X.C8RO;
import X.EnumC221088m0;
import X.IFH;
import X.InterfaceC46330IGg;
import X.InterfaceC55102Lju;
import X.JAK;
import X.JAM;
import X.JAN;
import X.JCQ;
import X.JCR;
import X.JCS;
import X.JCT;
import X.KU4;
import X.UC7;
import X.X1D;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1;
import com.ss.android.ugc.feed.platform.fragment.IRecommendFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class RecommendFeedPipComponent extends BasePanelComponent implements C2MJ, JCS, IPipAbility, InterfaceC55102Lju {
    public static final C8RO LJZI = new C8RO("FypPipCmp");
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(JAN.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 403));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 739));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 738));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 737));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 736));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 401));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 402));
    public final C5H3 LJLL;
    public JCQ LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public boolean LJLZ;
    public final JCR LJZ;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0115, code lost:
    
        if (r1 != null) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H3() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.pip.RecommendFeedPipComponent.H3():void");
    }

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final void Va() {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -168195021) {
            return null;
        }
        return this;
    }

    public final IPlayerComponentAbility A3() {
        return (IPlayerComponentAbility) this.LJLJJI.getValue();
    }

    public final FeedPipViewModel C3() {
        return (FeedPipViewModel) this.LJLILLLLZI.getValue();
    }

    public final IViewPagerComponentAbility E3() {
        return (IViewPagerComponentAbility) this.LJLJI.getValue();
    }

    public final IFeedPanelPlatformAbility v3() {
        return (IFeedPanelPlatformAbility) this.LJLJJL.getValue();
    }

    public final IPipFeedService x3() {
        return (IPipFeedService) this.LJLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendFeedPipComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 404), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 9));
        }
        this.LJLL = c62822Ol8;
        this.LJLLLLLL = C221108m2.LIZIZ(JAM.INSTANCE);
        this.LJZ = new JCR(this);
    }

    public final void F3() {
        C2MA curViewHolder;
        C2MA c2ma;
        VideoViewCell videoViewCell;
        InterfaceC46330IGg playerManager;
        if (!C3().LJZL) {
            return;
        }
        boolean z = false;
        C3().LJZL = false;
        this.LJLLILLLL = false;
        this.LJLLL = false;
        IPlayerComponentAbility A3 = A3();
        if (A3 != null && (playerManager = A3.getPlayerManager()) != null) {
            playerManager.LJFF(C3().LJZI.LIZLLL);
        }
        Aweme value = C3().LJLIL.getValue();
        float f = C3().LJZI.LIZLLL;
        float f2 = C3().LJZI.LJ;
        IFH.LIZ = value;
        IFH.LIZIZ = f;
        IFH.LIZJ = f2;
        IPlayerComponentAbility A32 = A3();
        if (A32 != null && A32.gu() == 3) {
            z = true;
        }
        String str = null;
        if (C3().LJZI.LIZJ) {
            if (!z) {
                ((Handler) this.LJLLLLLL.getValue()).postDelayed(new ARunnableS37S0100000_1(this, 53), 0L);
            }
            this.LJLLLL = true;
            IViewPagerComponentAbility E3 = E3();
            if (E3 != null) {
                c2ma = E3.getCurViewHolder();
            } else {
                c2ma = null;
            }
            if ((c2ma instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c2ma) != null) {
                videoViewCell.LLJJJJ(2);
            }
        } else if (z) {
            IPlayerComponentAbility A33 = A3();
            if (A33 != null) {
                A33.tryResumePlay();
            }
            IPlayButtonAbility iPlayButtonAbility = (IPlayButtonAbility) this.LJLJJLL.getValue();
            if (iPlayButtonAbility != null) {
                iPlayButtonAbility.bo();
            }
        }
        IViewPagerComponentAbility E32 = E3();
        if (E32 != null && (curViewHolder = E32.getCurViewHolder()) != null) {
            curViewHolder.w1();
        }
        C8RO c8ro = LJZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resumed state with ");
        Aweme value2 = C3().LJLIL.getValue();
        if (value2 != null) {
            str = value2.getAid();
        }
        LIZ.append(str);
        LIZ.append(", some info: (prog: ");
        LIZ.append(C3().LJZI.LIZIZ);
        LIZ.append(" speed: ");
        LIZ.append(C3().LJZI.LIZLLL);
        LIZ.append(')');
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final void d5() {
        C3().LJLJLJ = this;
        x3().LJII("For You");
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility E3 = E3();
        if (E3 != null) {
            E3.De0(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L15;
     */
    @Override // X.C8W0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.pip.RecommendFeedPipComponent.onPause():void");
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        LJZI.LJIIIIZZ("assem onResume");
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        if (x3().LIZLLL() && C3().LJZL) {
            if (x3().isInPipMode()) {
                x3().LIZJ();
                LJZI.LJIIL("after-Start window destroy, calling restore process");
                H3();
                return;
            }
            H3();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final boolean rh0() {
        return x3().isInPipMode();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final void C90(boolean z) {
        this.LJLLLL = z;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final int Dh(Aweme aweme) {
        if (!x3().LIZLLL() || aweme == null || !C3().iv0(aweme)) {
            return 0;
        }
        return (int) (C3().LJZI.LIZIZ * aweme.getVideo().getDuration());
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        o.LJIIIZ(c8mm, "<this>");
        c8mm.LIZ("event_on_render_first_frame", new AqS174S0100000_8(this, 149));
        c8mm.LIZ("event_on_play_pause", new AqS174S0100000_8(this, 150));
        c8mm.LIZ("event_on_request_resume_play", new AqS174S0100000_8(this, 151));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KU4
    public final void onPageResume(int i) {
        super.onPageResume(i);
        x3().LIZ();
        x3().LJJI("stitch", "duet", "disable_ad_videos", "fyp_whitelist_video", "sub_aweme", "photo_sensitive");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        AbstractC55082Lja abstractFeedAdapter;
        List<Aweme> Q8;
        Aweme currentAweme;
        String str;
        AbstractC55082Lja abstractFeedAdapter2;
        this.LJLLLL = false;
        if (!x3().LIZLLL()) {
            return;
        }
        if (x3().isInPipMode()) {
            JCQ jcq = this.LJLLI;
            if (jcq != null) {
                IFeedPanelPlatformAbility v3 = v3();
                if (v3 != null && (abstractFeedAdapter2 = v3.getAbstractFeedAdapter()) != null) {
                    jcq.LIZ(abstractFeedAdapter2.LJJIL(), abstractFeedAdapter2.LJLLL);
                }
                this.LJLLI = null;
                return;
            }
            return;
        }
        this.LJLLI = null;
        if (this.LJLLJ) {
            x3().LJIJ();
            this.LJLLJ = false;
            this.LJLLL = true;
        } else if (x3().LJIIJ()) {
            IViewPagerComponentAbility E3 = E3();
            if (E3 != null && (currentAweme = E3.getCurrentAweme()) != null) {
                C3().LJLIL.setValue((FeedPipViewModel$currentAweme$1) currentAweme);
                String aid = currentAweme.getAid();
                Aweme aweme = C3().LJLLLLLL;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (!o.LJ(aid, str)) {
                    C3().jv0(null);
                }
            }
            IFeedPanelPlatformAbility v32 = v3();
            if (v32 != null) {
                C3().LJZI.LIZ = v32.getCurrentIndex();
            }
            IFeedPanelPlatformAbility v33 = v3();
            if (v33 != null && (abstractFeedAdapter = v33.getAbstractFeedAdapter()) != null && (Q8 = abstractFeedAdapter.Q8()) != null) {
                FeedPipViewModel C3 = C3();
                C3.getClass();
                if (!((Boolean) C48770JCc.LIZ.getValue()).booleanValue()) {
                    List<Aweme> list = C3.LJLJLLL;
                    C66642jU c66642jU = C66642jU.LJLIL;
                    for (Aweme aweme2 : Q8) {
                        ArrayList arrayList = (ArrayList) list;
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((Boolean) c66642jU.invoke(next, aweme2)).booleanValue()) {
                                if (next == null) {
                                }
                            }
                        }
                        arrayList.add(aweme2);
                    }
                } else {
                    for (Aweme aweme3 : Q8) {
                        Set<String> set = C3.LJLL;
                        String aid2 = aweme3.getAid();
                        o.LJIIIIZZ(aid2, "it.aid");
                        if (set.add(aid2)) {
                            ((ArrayList) C3.LJLJLLL).add(aweme3);
                        }
                    }
                }
            }
        }
        UC7.LIZLLL("onPageSelect with ", i);
    }

    @Override // X.JCS
    public final void t2(JCT jct) {
        if (!this.LJLZ) {
            ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LJLJL.getValue();
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.ep0(this.LJZ);
            }
            this.LJLZ = true;
        }
        IRecommendFeedFragmentAbility iRecommendFeedFragmentAbility = (IRecommendFeedFragmentAbility) this.LJLJLLL.getValue();
        if (iRecommendFeedFragmentAbility != null) {
            iRecommendFeedFragmentAbility.k00();
        }
        this.LJLLI = jct;
        ((Handler) this.LJLLLLLL.getValue()).postDelayed(new ARunnableS44S0100000_8(this, 113), 3000L);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final void ea0(Aweme aweme, C50913JyX c50913JyX) {
        String str;
        String str2;
        C8RO c8ro = LJZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Checking Video Play Event: aweme: ");
        LIZ.append(aweme.getAid());
        LIZ.append(", lastPipAweme: ");
        Aweme aweme2 = C3().LJLLLLLL;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", beforeRestore: ");
        LIZ.append(C3().LJZL);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
        String aid = aweme.getAid();
        Aweme aweme3 = C3().LJLLLLLL;
        if (aweme3 != null) {
            str2 = aweme3.getAid();
        } else {
            str2 = null;
        }
        if (o.LJ(aid, str2)) {
            C3().jv0(null);
            c50913JyX.LLL = true;
        }
    }
}
