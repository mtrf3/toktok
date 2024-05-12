package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C4LX;
import X.C65352Pkq;
import X.C76800UCe;
import X.C8HZ;
import X.C8NK;
import X.C8V4;
import X.C91188Zqa;
import X.C91304ZsS;
import X.C91379Ztf;
import X.C91414ZuE;
import X.C91420ZuK;
import X.C91422ZuM;
import X.C91439Zud;
import X.C91444Zui;
import X.C91464Zv2;
import X.C91502Zve;
import X.C91546ZwM;
import X.C91551ZwR;
import X.C91556ZwW;
import X.C91557ZwX;
import X.C91558ZwY;
import X.C91609ZxN;
import X.C91614ZxS;
import X.EnumC91294ZsI;
import X.EnumC91305ZsT;
import X.EnumC91307ZsV;
import X.EnumC91310ZsY;
import X.InterfaceC57784Mm4;
import X.InterfaceC88472Yns;
import X.InterfaceC91289ZsD;
import X.InterfaceC91291ZsF;
import X.InterfaceC91296ZsK;
import X.InterfaceC91297ZsL;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.dsp.library.net.DSPCollectMusicResponse;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.ss.android.ugc.aweme.dsp.playpage.card.DspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playpage.card.upsell.LandingPageVm;
import com.ss.android.ugc.aweme.dsp.playpage.favpage.FavPlayerViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueFragment;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.AudioCardAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioconver.AudioCoverInfoAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioinfo.AudioInfoAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem;
import com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueAssem;
import com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueFragment;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonTrigger;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes22.dex */
public class IDqS417S0100000_29 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;

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
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS417S0100000_29(C8HZ c8hz, C8HZ<InterfaceC57784Mm4> c8hz2) {
        super(1);
        this.$t = c8hz2;
        this.l0 = c8hz;
    }

    public static final Object invoke$0(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        InterfaceC91289ZsD it = (InterfaceC91289ZsD) obj;
        o.LJIIIZ(it, "it");
        it.onError((C91304ZsS) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        InterfaceC91289ZsD it = (InterfaceC91289ZsD) obj;
        o.LJIIIZ(it, "it");
        it.onLoadStateChanged((EnumC91305ZsT) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C8V4 uiContentAssem = (C8V4) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(MDAudioQueueAssem.class);
        uiContentAssem.LJIIIIZZ = new MDAudioQueueAssem();
        uiContentAssem.LJII = ((View) iDqS417S0100000_29.l0).findViewById(R.id.iq);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.rv0((AudioCardAssem) iDqS417S0100000_29.l0, C91546ZwM.LJLIL);
        assemble.sv0((AudioCardAssem) iDqS417S0100000_29.l0, C91551ZwR.LJLIL);
        AudioCardAssem audioCardAssem = (AudioCardAssem) iDqS417S0100000_29.l0;
        assemble.rv0(audioCardAssem, new IDqS417S0100000_29(audioCardAssem, 12));
        AudioCardAssem audioCardAssem2 = (AudioCardAssem) iDqS417S0100000_29.l0;
        assemble.rv0(audioCardAssem2, new IDqS417S0100000_29(audioCardAssem2, 13));
        AudioCardAssem audioCardAssem3 = (AudioCardAssem) iDqS417S0100000_29.l0;
        assemble.rv0(audioCardAssem3, new IDqS417S0100000_29(audioCardAssem3, 14));
        assemble.rv0((AudioCardAssem) iDqS417S0100000_29.l0, C91556ZwW.LJLIL);
        assemble.rv0((AudioCardAssem) iDqS417S0100000_29.l0, C91557ZwX.LJLIL);
        assemble.rv0((AudioCardAssem) iDqS417S0100000_29.l0, C91558ZwY.LJLIL);
        AudioCardAssem audioCardAssem4 = (AudioCardAssem) iDqS417S0100000_29.l0;
        assemble.rv0(audioCardAssem4, new IDqS417S0100000_29(audioCardAssem4, 15));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C8NK reusedUiContentAssem = (C8NK) obj;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(CollectAssem.class);
        reusedUiContentAssem.LIZJ = new CollectAssem();
        C91188Zqa c91188Zqa = ((AudioCardAssem) iDqS417S0100000_29.l0).LLFII;
        if (c91188Zqa != null) {
            reusedUiContentAssem.LJFF = c91188Zqa;
            return C76800UCe.LIZ;
        }
        o.LJIJI("audioStyleView");
        throw null;
    }

    public static final Object invoke$13(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C8NK reusedUiContentAssem = (C8NK) obj;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(AudioCoverInfoAssem.class);
        reusedUiContentAssem.LIZJ = new AudioCoverInfoAssem();
        C91188Zqa c91188Zqa = ((AudioCardAssem) iDqS417S0100000_29.l0).LLFII;
        if (c91188Zqa != null) {
            reusedUiContentAssem.LJFF = c91188Zqa;
            return C76800UCe.LIZ;
        }
        o.LJIJI("audioStyleView");
        throw null;
    }

    public static final Object invoke$14(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C8NK reusedUiContentAssem = (C8NK) obj;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(AudioInfoAssem.class);
        reusedUiContentAssem.LIZJ = new AudioInfoAssem();
        C91188Zqa c91188Zqa = ((AudioCardAssem) iDqS417S0100000_29.l0).LLFII;
        if (c91188Zqa != null) {
            reusedUiContentAssem.LJFF = c91188Zqa;
            return C76800UCe.LIZ;
        }
        o.LJIJI("audioStyleView");
        throw null;
    }

    public static final Object invoke$15(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C8NK reusedUiContentAssem = (C8NK) obj;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(AudioSeekBarAssem.class);
        reusedUiContentAssem.LIZJ = new AudioSeekBarAssem();
        C91188Zqa c91188Zqa = ((AudioCardAssem) iDqS417S0100000_29.l0).LLFII;
        if (c91188Zqa != null) {
            reusedUiContentAssem.LJFF = c91188Zqa;
            return C76800UCe.LIZ;
        }
        o.LJIJI("audioStyleView");
        throw null;
    }

    public static final Object invoke$16(IDqS417S0100000_29 iDqS417S0100000_29, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        C8HZ listState = (C8HZ) iDqS417S0100000_29.l0;
        o.LJIIIZ(listState, "listState");
        return new C91614ZxS((C8HZ<InterfaceC57784Mm4>) listState);
    }

    public static final Object invoke$17(IDqS417S0100000_29 iDqS417S0100000_29, Object hierarchyData) {
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        ((MDQueueFragment) iDqS417S0100000_29.l0).getClass();
        new C91439Zud();
        throw null;
    }

    public static final Object invoke$18(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C8V4 uiContentAssem = (C8V4) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(MDQueueAssem.class);
        uiContentAssem.LJIIIIZZ = new MDQueueAssem();
        uiContentAssem.LJII = ((View) iDqS417S0100000_29.l0).findViewById(R.id.j1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(IDqS417S0100000_29 iDqS417S0100000_29, Object it) {
        o.LJIIIZ(it, "it");
        ((MusicDspUGCButtonTrigger) iDqS417S0100000_29.l0).getContainerView().setVisibility(0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        InterfaceC91289ZsD it = (InterfaceC91289ZsD) obj;
        o.LJIIIZ(it, "it");
        it.onPlayableChanged((InterfaceC91296ZsK) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        InterfaceC91291ZsF it = (InterfaceC91291ZsF) obj;
        o.LJIIIZ(it, "it");
        it.Kj((EnumC91307ZsV) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        InterfaceC91291ZsF it = (InterfaceC91291ZsF) obj;
        o.LJIIIZ(it, "it");
        it.Hz((InterfaceC91297ZsL) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        InterfaceC91291ZsF it = (InterfaceC91291ZsF) obj;
        o.LJIIIZ(it, "it");
        it.Y50((InterfaceC91297ZsL) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(IDqS417S0100000_29 iDqS417S0100000_29, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C91414ZuE(2, (FollowStatus) iDqS417S0100000_29.l0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (X.YBK.LIZJ().notificationPicOn33 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$24(kotlin.jvm.internal.IDqS417S0100000_29 r5, java.lang.Object r6) {
        /*
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            java.lang.Object r0 = r5.l0
            X.Zve r0 = (X.C91502Zve) r0
            X.Zuh r2 = r0.LJLJL
            r4 = 0
            r3 = 1
            if (r2 == 0) goto L45
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Xiaomi"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L29
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L45
            X.YBK r0 = X.YBK.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig r0 = X.YBK.LIZJ()
            boolean r0 = r0.notificationPicOn33
            if (r0 == 0) goto L45
        L29:
            if (r6 == 0) goto L73
            boolean r0 = r6.isRecycled()
            if (r0 != r3) goto L73
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "coverBitmap("
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ") already recycled."
            r1.append(r0)
            X.X1D.LIZIZ(r1)
        L45:
            java.lang.Object r0 = r5.l0
            X.Zve r0 = (X.C91502Zve) r0
            X.Zub r2 = r0.LJLJJLL
            if (r2 == 0) goto L70
            X.Zrn r1 = r2.LJI
            r1.LJI = r6
            X.ZxJ r0 = r2.LIZLLL
            boolean r0 = r0.LJFF()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.LIZJ = r0
            X.ZxJ r0 = r2.LIZLLL
            X.ZsK r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto L67
        L66:
            r4 = 1
        L67:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.LIZIZ = r0
            r2.LJFF(r3)
        L70:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L73:
            X.01P r1 = r2.LIZJ()
            java.lang.String r0 = "android.media.metadata.ART"
            r1.LIZIZ(r6, r0)
            android.support.v4.media.session.MediaSessionCompat r1 = r2.LIZLLL
            X.01P r0 = r2.LIZJ()
            android.support.v4.media.MediaMetadataCompat r0 = r0.LIZ()
            r1.LJI(r0)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS417S0100000_29.invoke$24(kotlin.jvm.internal.IDqS417S0100000_29, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$25(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C91420ZuK setState = (C91420ZuK) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C91420ZuK.LIZ(setState, new C91422ZuM(((DSPCollectMusicResponse) iDqS417S0100000_29.l0).getDspList()), null, 2);
    }

    public static final Object invoke$26(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZIZ = "AudioPlayerHierarchyData";
        hierarchyData.LIZ = new C91444Zui((BasePlayerFragment) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZIZ = "AudioPlayerHierarchyData";
        hierarchyData.LIZ = new C91444Zui((BasePlayerFragment) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZIZ = "AudioPlayerHierarchyData";
        hierarchyData.LIZ = new C91444Zui((BasePlayerFragment) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZIZ = "AudioPlayerHierarchyData";
        hierarchyData.LIZ = new C91444Zui((BasePlayerFragment) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        InterfaceC91289ZsD it = (InterfaceC91289ZsD) obj;
        o.LJIIIZ(it, "it");
        it.onPlaybackStateChanged((EnumC91310ZsY) iDqS417S0100000_29.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(IDqS417S0100000_29 iDqS417S0100000_29, Object it) {
        o.LJIIIZ(it, "it");
        ((FavPlayerViewModel) iDqS417S0100000_29.l0).LJLLL.setValue(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        DspItemReusedAssem dspItemReusedAssem = (DspItemReusedAssem) iDqS417S0100000_29.l0;
        assemble.sv0(dspItemReusedAssem, new IDqS173S0200000_29(assemble, dspItemReusedAssem, 4));
        DspItemReusedAssem dspItemReusedAssem2 = (DspItemReusedAssem) iDqS417S0100000_29.l0;
        assemble.rv0(dspItemReusedAssem2, new IDqS173S0200000_29(assemble, dspItemReusedAssem2, 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZIZ = "PageCardHierarchyData";
        hierarchyData.LIZIZ(((DspItemReusedAssem) iDqS417S0100000_29.l0).LLFII.LJLJJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZIZ = "PageCardHierarchyData";
        hierarchyData.LIZIZ(((DspItemReusedAssem) iDqS417S0100000_29.l0).LLFII.LJLJJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS417S0100000_29 iDqS417S0100000_29, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        EnumC91294ZsI status = EnumC91294ZsI.SUCCESS;
        ArrayList arrayList = new ArrayList(((LandingPageVm) iDqS417S0100000_29.l0).LJLILLLLZI);
        o.LJIIIZ(status, "status");
        return new C91464Zv2(status, arrayList);
    }

    public static final Object invoke$8(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C91609ZxN setState = (C91609ZxN) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C91609ZxN.LIZ(setState, (C8HZ) iDqS417S0100000_29.l0, null, false, 6);
    }

    public static final Object invoke$9(IDqS417S0100000_29 iDqS417S0100000_29, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C91379Ztf(((MDAudioQueueFragment) iDqS417S0100000_29.l0).LJLIL);
        hierarchyData.LIZIZ = "play_page";
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(InterfaceC91296ZsK interfaceC91296ZsK, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC91296ZsK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(InterfaceC91297ZsL interfaceC91297ZsL, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC91297ZsL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(C91304ZsS c91304ZsS, int i) {
        super(1);
        this.$t = i;
        this.l0 = c91304ZsS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(EnumC91305ZsT enumC91305ZsT, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC91305ZsT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(EnumC91307ZsV enumC91307ZsV, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC91307ZsV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(EnumC91310ZsY enumC91310ZsY, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC91310ZsY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(C91502Zve c91502Zve, int i) {
        super(1);
        this.$t = i;
        this.l0 = c91502Zve;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(DSPCollectMusicResponse dSPCollectMusicResponse, int i) {
        super(1);
        this.$t = i;
        this.l0 = dSPCollectMusicResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(BasePlayerFragment basePlayerFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = basePlayerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(DspItemReusedAssem dspItemReusedAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = dspItemReusedAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(LandingPageVm landingPageVm, int i) {
        super(1);
        this.$t = i;
        this.l0 = landingPageVm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(FavPlayerViewModel favPlayerViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = favPlayerViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(MDAudioQueueFragment mDAudioQueueFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = mDAudioQueueFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(AudioCardAssem audioCardAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = audioCardAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(MDQueueFragment mDQueueFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = mDQueueFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(MusicDspUGCButtonTrigger musicDspUGCButtonTrigger, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicDspUGCButtonTrigger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS417S0100000_29(FollowStatus followStatus, int i) {
        super(1);
        this.$t = i;
        this.l0 = followStatus;
    }
}
