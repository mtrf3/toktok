package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC91394Ztu;
import X.C212518Vr;
import X.C2NU;
import X.C34K;
import X.C44498HdG;
import X.C4LX;
import X.C5S1;
import X.C65352Pkq;
import X.C68322mC;
import X.C76800UCe;
import X.C8NH;
import X.C8NK;
import X.C8V1;
import X.C8V4;
import X.C8VK;
import X.C91299ZsN;
import X.C91400Zu0;
import X.C91456Zuu;
import X.C91473ZvB;
import X.EnumC91307ZsV;
import X.InterfaceC88472Yns;
import X.InterfaceC91288ZsC;
import X.InterfaceC91290ZsE;
import X.InterfaceC91291ZsF;
import X.InterfaceC91296ZsK;
import X.InterfaceC91297ZsL;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.AudioPlayerAssem;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.ss.android.ugc.aweme.dsp.playpage.card.DspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueFragment;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.AudioCardAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.morequeue.MoreQueueAssem;
import com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueFragment;
import com.ss.android.ugc.aweme.dsp.playpage.v2.EventDispatchAssem;
import com.ss.android.ugc.aweme.dsp.playpage.v2.FragmentServiceAssem;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.StatusViewAssem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes22.dex */
public class IDqS173S0200000_29 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        InterfaceC91288ZsC it = (InterfaceC91288ZsC) obj;
        o.LJIIIZ(it, "it");
        C34K c34k = (C34K) iDqS173S0200000_29.l0;
        if (!c34k.element) {
            c34k.element = it.interceptPause((C91299ZsN) iDqS173S0200000_29.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        InterfaceC91288ZsC it = (InterfaceC91288ZsC) obj;
        o.LJIIIZ(it, "it");
        C34K c34k = (C34K) iDqS173S0200000_29.l0;
        if (!c34k.element) {
            c34k.element = it.interceptResume((C91299ZsN) iDqS173S0200000_29.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        InterfaceC91290ZsE it = (InterfaceC91290ZsE) obj;
        o.LJIIIZ(it, "it");
        C34K c34k = (C34K) iDqS173S0200000_29.l0;
        if (!c34k.element) {
            c34k.element = it.LJIIL((InterfaceC91297ZsL) iDqS173S0200000_29.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        InterfaceC91291ZsF it = (InterfaceC91291ZsF) obj;
        o.LJIIIZ(it, "it");
        it.a50((C91299ZsN) iDqS173S0200000_29.l1, (InterfaceC91296ZsK) iDqS173S0200000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS173S0200000_29 iDqS173S0200000_29, Object it) {
        String str;
        C91473ZvB x5;
        o.LJIIIZ(it, "it");
        MoreQueueAssem moreQueueAssem = (MoreQueueAssem) iDqS173S0200000_29.l0;
        Music music = (Music) iDqS173S0200000_29.l1;
        moreQueueAssem.getClass();
        String str2 = null;
        if (!C2NU.LIZ.LIZIZ()) {
            TuxIconView tuxIconView = moreQueueAssem.LLFII;
            if (tuxIconView != null) {
                C5S1 c5s1 = new C5S1(tuxIconView.getContext());
                c5s1.LIZJ(R.string.img);
                c5s1.LJ();
            } else {
                o.LJIJI("moreRootView");
                throw null;
            }
        } else {
            ShareDependService.LIZ.getClass();
            ShareDependService LIZ = C44498HdG.LIZ();
            TuxIconView tuxIconView2 = moreQueueAssem.LLFII;
            if (tuxIconView2 != null) {
                Context context = tuxIconView2.getContext();
                o.LJIIIIZZ(context, "moreRootView.context");
                IContainerUtilityAbility a4 = moreQueueAssem.a4();
                if (a4 != null && (x5 = a4.x5()) != null) {
                    str2 = x5.LJLIL;
                }
                if (o.LJ(str2, "dsp_player")) {
                    str = "my_playlist";
                } else {
                    str = "track_reco";
                }
                LIZ.LJIIIIZZ(music, context, str);
            } else {
                o.LJIJI("moreRootView");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        C8V1 assem = (C8V1) obj;
        o.LJIIIZ(assem, "$this$assem");
        Assembler assembler = (Assembler) iDqS173S0200000_29.l0;
        BasePlayerFragment basePlayerFragment = (BasePlayerFragment) iDqS173S0200000_29.l1;
        assembler.mv0(basePlayerFragment, new IDqS417S0100000_29(basePlayerFragment, 26));
        assem.LIZ = C65352Pkq.LIZ(AudioPlayerAssem.class);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        C8V1 assem = (C8V1) obj;
        o.LJIIIZ(assem, "$this$assem");
        Assembler assembler = (Assembler) iDqS173S0200000_29.l0;
        BasePlayerFragment basePlayerFragment = (BasePlayerFragment) iDqS173S0200000_29.l1;
        assembler.mv0(basePlayerFragment, new IDqS417S0100000_29(basePlayerFragment, 27));
        assem.LIZ = C65352Pkq.LIZ(FragmentServiceAssem.class);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        C8V1 assem = (C8V1) obj;
        o.LJIIIZ(assem, "$this$assem");
        Assembler assembler = (Assembler) iDqS173S0200000_29.l0;
        BasePlayerFragment basePlayerFragment = (BasePlayerFragment) iDqS173S0200000_29.l1;
        assembler.mv0(basePlayerFragment, new IDqS417S0100000_29(basePlayerFragment, 28));
        assem.LIZ = C65352Pkq.LIZ(EventDispatchAssem.class);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        C8V4 uiContentAssem = (C8V4) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        Assembler assembler = (Assembler) iDqS173S0200000_29.l0;
        BasePlayerFragment basePlayerFragment = (BasePlayerFragment) iDqS173S0200000_29.l1;
        assembler.mv0(basePlayerFragment, new IDqS417S0100000_29(basePlayerFragment, 29));
        uiContentAssem.LIZ = C65352Pkq.LIZ(StatusViewAssem.class);
        uiContentAssem.LJIIIIZZ = new StatusViewAssem();
        uiContentAssem.LJII = ((BasePlayerFragment) iDqS173S0200000_29.l1).LJLL;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZIZ = "ViewPagerHierarchyData";
        hierarchyData.LIZ = new C91456Zuu((AbstractC91394Ztu) iDqS173S0200000_29.l0, ((BasePlayerFragment) iDqS173S0200000_29.l1).LJLJLLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        BasePlayerFragment basePlayerFragment = (BasePlayerFragment) iDqS173S0200000_29.l0;
        assemble.gv0(basePlayerFragment, new IDqS173S0200000_29(assemble, basePlayerFragment, 13));
        BasePlayerFragment basePlayerFragment2 = (BasePlayerFragment) iDqS173S0200000_29.l0;
        assemble.gv0(basePlayerFragment2, new IDqS173S0200000_29(assemble, basePlayerFragment2, 14));
        BasePlayerFragment basePlayerFragment3 = (BasePlayerFragment) iDqS173S0200000_29.l0;
        assemble.gv0(basePlayerFragment3, new IDqS173S0200000_29(assemble, basePlayerFragment3, 15));
        BasePlayerFragment basePlayerFragment4 = (BasePlayerFragment) iDqS173S0200000_29.l0;
        assemble.wv0(basePlayerFragment4, new IDqS173S0200000_29(assemble, basePlayerFragment4, 16));
        BasePlayerFragment basePlayerFragment5 = (BasePlayerFragment) iDqS173S0200000_29.l0;
        assemble.wv0(basePlayerFragment5, new IDqS29S0300000_29(assemble, basePlayerFragment5, (AbstractC91394Ztu) iDqS173S0200000_29.l1, 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        InterfaceC91288ZsC it = (InterfaceC91288ZsC) obj;
        o.LJIIIZ(it, "it");
        C34K c34k = (C34K) iDqS173S0200000_29.l0;
        if (!c34k.element) {
            c34k.element = it.interceptStop((C91299ZsN) iDqS173S0200000_29.l1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.ZsK, T] */
    public static final Object invoke$3(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        InterfaceC91288ZsC it = (InterfaceC91288ZsC) obj;
        o.LJIIIZ(it, "it");
        C68322mC c68322mC = (C68322mC) iDqS173S0200000_29.l0;
        ?? r0 = (InterfaceC91296ZsK) iDqS173S0200000_29.l1;
        it.processPlayable(r0);
        c68322mC.element = r0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        C8NH reusedUiSlotAssem = (C8NH) obj;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        Assembler assembler = (Assembler) iDqS173S0200000_29.l0;
        DspItemReusedAssem dspItemReusedAssem = (DspItemReusedAssem) iDqS173S0200000_29.l1;
        assembler.nv0(dspItemReusedAssem, new IDqS417S0100000_29(dspItemReusedAssem, 5));
        reusedUiSlotAssem.LJ = C212518Vr.LIZLLL;
        reusedUiSlotAssem.LIZ = C65352Pkq.LIZ(UpsellLandingPageSlotAssem.class);
        reusedUiSlotAssem.LIZJ = new UpsellLandingPageSlotAssem();
        reusedUiSlotAssem.LIZLLL = R.id.jh;
        reusedUiSlotAssem.LIZLLL(C8VK.LAZY);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        C8NK reusedUiContentAssem = (C8NK) obj;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        Assembler assembler = (Assembler) iDqS173S0200000_29.l0;
        DspItemReusedAssem dspItemReusedAssem = (DspItemReusedAssem) iDqS173S0200000_29.l1;
        assembler.nv0(dspItemReusedAssem, new IDqS417S0100000_29(dspItemReusedAssem, 6));
        C91400Zu0 c91400Zu0 = ((DspItemReusedAssem) iDqS173S0200000_29.l1).LLFZ;
        if (c91400Zu0 != null) {
            reusedUiContentAssem.LJFF = c91400Zu0.getAudioStyleView();
            reusedUiContentAssem.LIZ = C65352Pkq.LIZ(AudioCardAssem.class);
            reusedUiContentAssem.LIZJ = new AudioCardAssem();
            return C76800UCe.LIZ;
        }
        o.LJIJI("mDspPageView");
        throw null;
    }

    public static final Object invoke$6(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        MDAudioQueueFragment mDAudioQueueFragment = (MDAudioQueueFragment) iDqS173S0200000_29.l0;
        assemble.mv0(mDAudioQueueFragment, new IDqS417S0100000_29(mDAudioQueueFragment, 9));
        assemble.wv0((MDAudioQueueFragment) iDqS173S0200000_29.l0, new IDqS417S0100000_29((View) iDqS173S0200000_29.l1, 10));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        MDQueueFragment mDQueueFragment = (MDQueueFragment) iDqS173S0200000_29.l0;
        assemble.mv0(mDQueueFragment, new IDqS417S0100000_29(mDQueueFragment, 17));
        assemble.wv0((MDQueueFragment) iDqS173S0200000_29.l0, new IDqS417S0100000_29((View) iDqS173S0200000_29.l1, 18));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        InterfaceC91290ZsE it = (InterfaceC91290ZsE) obj;
        o.LJIIIZ(it, "it");
        C34K c34k = (C34K) iDqS173S0200000_29.l0;
        if (!c34k.element) {
            c34k.element = it.LJII((InterfaceC91296ZsK) iDqS173S0200000_29.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS173S0200000_29 iDqS173S0200000_29, Object obj) {
        InterfaceC91290ZsE it = (InterfaceC91290ZsE) obj;
        o.LJIIIZ(it, "it");
        C34K c34k = (C34K) iDqS173S0200000_29.l0;
        if (!c34k.element) {
            c34k.element = it.LJIILJJIL((EnumC91307ZsV) iDqS173S0200000_29.l1);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDqS173S0200000_29(X.AbstractC91394Ztu r3, com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 17: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS173S0200000_29.<init>(X.Ztu, com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS173S0200000_29(C68322mC c68322mC, C68322mC<InterfaceC91296ZsK> c68322mC2, InterfaceC91296ZsK interfaceC91296ZsK) {
        super(1);
        this.$t = interfaceC91296ZsK;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS173S0200000_29(C34K c34k, InterfaceC91296ZsK interfaceC91296ZsK, int i) {
        super(1);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = interfaceC91296ZsK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS173S0200000_29(C34K c34k, InterfaceC91297ZsL interfaceC91297ZsL, int i) {
        super(1);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = interfaceC91297ZsL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS173S0200000_29(C34K c34k, C91299ZsN c91299ZsN, int i) {
        super(1);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = c91299ZsN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS173S0200000_29(C34K c34k, EnumC91307ZsV enumC91307ZsV, int i) {
        super(1);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = enumC91307ZsV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS173S0200000_29(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC91296ZsK;
        this.l1 = c91299ZsN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS173S0200000_29(Assembler assembler, BasePlayerFragment basePlayerFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = assembler;
        this.l1 = basePlayerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS173S0200000_29(Assembler assembler, DspItemReusedAssem dspItemReusedAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = assembler;
        this.l1 = dspItemReusedAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS173S0200000_29(MDAudioQueueFragment mDAudioQueueFragment, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = mDAudioQueueFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS173S0200000_29(MoreQueueAssem moreQueueAssem, Music music, int i) {
        super(1);
        this.$t = i;
        this.l0 = moreQueueAssem;
        this.l1 = music;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS173S0200000_29(MDQueueFragment mDQueueFragment, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = mDQueueFragment;
        this.l1 = view;
    }
}
