package Y;

import X.C169586l8;
import X.C1E5;
import X.C35362DuI;
import X.C47261Igj;
import X.C48841JEv;
import X.C5NP;
import X.C61878OQg;
import X.C68322mC;
import X.C78685UuP;
import X.C81975WFf;
import X.C82054WIg;
import X.C82055WIh;
import X.C82064WIq;
import X.C82068WIu;
import X.C82071WIx;
import X.C82328WSu;
import X.C82329WSv;
import X.C82464WYa;
import X.C82492WZc;
import X.C82622Wbi;
import X.C82891Wg3;
import X.C83765Wu9;
import X.EnumC82072WIy;
import X.H78;
import X.HYN;
import X.I38;
import X.InterfaceC29911Fj;
import X.InterfaceC70422pa;
import X.InterfaceC82053WIf;
import X.InterfaceC82086WJm;
import X.OSZ;
import X.OUP;
import X.V16;
import X.WI2;
import X.WI6;
import X.WID;
import X.WMH;
import X.WS0;
import X.WSI;
import X.WYR;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEAudioCapture;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AObjectS71S0300000_14 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            case 17:
                onChanged$17(this, obj);
                return;
            case 18:
                onChanged$18(this, obj);
                return;
            case 19:
                onChanged$19(this, obj);
                return;
            case 20:
                onChanged$20(this, obj);
                return;
            case 21:
                onChanged$21(this, obj);
                return;
            case 22:
                onChanged$22(this, obj);
                return;
            case 23:
                onChanged$23(this, obj);
                return;
            case 24:
                onChanged$24(this, obj);
                return;
            case 25:
                onChanged$25(this, obj);
                return;
            case 26:
                onChanged$26(this, obj);
                return;
            case 27:
                onChanged$27(this, obj);
                return;
            case 28:
                onChanged$28(this, obj);
                return;
            case 29:
                onChanged$29(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("livephoto startRecording StopPrePlayState:");
        LIZ.append(booleanValue);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        if (booleanValue) {
            if (!C48841JEv.LJIILLIIL((InterfaceC70422pa) aObjectS71S0300000_14.l2)) {
                ((C83765Wu9) aObjectS71S0300000_14.l1).LJLJI.getCameraApiComponent().e8().getMediaController().R8().removeObserver(aObjectS71S0300000_14);
            } else {
                ((C83765Wu9) aObjectS71S0300000_14.l1).LJLJI.getClass();
                throw null;
            }
        }
    }

    public static final void onChanged$1(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (((WSI) aObjectS71S0300000_14.l0).LIZIZ == null) {
            return;
        }
        if (bool.booleanValue()) {
            if (o.LJ(((WSI) aObjectS71S0300000_14.l0).LIZIZ.getTag(), "RecordLiveScene")) {
                if (!((WSI) aObjectS71S0300000_14.l0).LIZIZ.LLJILJIL()) {
                    ((C82328WSu) aObjectS71S0300000_14.l1).getRootScene().LLLILZLLLI(true, false);
                } else {
                    ((C82328WSu) aObjectS71S0300000_14.l1).getRootScene().LLLIZZ();
                }
                if (((C82328WSu) aObjectS71S0300000_14.l1).isZTLiveSwitch() && ((C82328WSu) aObjectS71S0300000_14.l1).isLiveReuseSwitchOpen()) {
                    ((C82328WSu) aObjectS71S0300000_14.l1).setLiveTagState(-1);
                }
            }
            ((WMH) aObjectS71S0300000_14.l2).show(((WSI) aObjectS71S0300000_14.l0).LIZIZ);
            ((WSI) aObjectS71S0300000_14.l0).LIZIZ.show();
            return;
        }
        if (o.LJ(((WSI) aObjectS71S0300000_14.l0).LIZIZ.getTag(), "RecordLiveScene") && !((WSI) aObjectS71S0300000_14.l0).LIZIZ.LLJILJIL()) {
            ((C82328WSu) aObjectS71S0300000_14.l1).getRootScene().LLLILZLLLI(false, true);
        }
        ((WSI) aObjectS71S0300000_14.l0).LIZIZ.hide();
        ((WMH) aObjectS71S0300000_14.l2).hide(((WSI) aObjectS71S0300000_14.l0).LIZIZ);
    }

    public static final void onChanged$10(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        Boolean toOn = (Boolean) obj;
        C81975WFf LIZIZ = ((WID) aObjectS71S0300000_14.l0).LIZIZ();
        o.LJIIIIZZ(toOn, "toOn");
        LIZIZ.LJLJLLL = toOn.booleanValue();
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l1;
        C82622Wbi c82622Wbi = (C82622Wbi) aObjectS71S0300000_14.l2;
        c82064WIq.getClass();
        C82064WIq.LJII(c82622Wbi, LIZIZ);
    }

    public static final void onChanged$11(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        int i;
        C35362DuI c35362DuI = (C35362DuI) obj;
        C81975WFf LJIILLIIL = ((WID) aObjectS71S0300000_14.l0).LJIILLIIL();
        if (c35362DuI.LJLILLLLZI) {
            i = R.drawable.b7_;
        } else {
            i = R.drawable.b79;
        }
        LJIILLIIL.LJLILLLLZI = i;
        LJIILLIIL.LJLJJLL = !c35362DuI.LJLIL;
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l1;
        C82622Wbi c82622Wbi = (C82622Wbi) aObjectS71S0300000_14.l2;
        c82064WIq.getClass();
        C82064WIq.LJII(c82622Wbi, LJIILLIIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$12(Y.AObjectS71S0300000_14 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS71S0300000_14.onChanged$12(Y.AObjectS71S0300000_14, java.lang.Object):void");
    }

    public static final void onChanged$13(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l0;
        C82068WIu c82068WIu = c82064WIq.LIZ;
        c82068WIu.LJIIIIZZ = c82064WIq.LJFF(c82068WIu.LIZIZ);
        ((C82064WIq) aObjectS71S0300000_14.l0).LJ();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ((List) new AqS141S0200000_10(arrayList, (List<C81975WFf>) arrayList2, (List<C81975WFf>) 54).invoke(Boolean.valueOf(((C82064WIq) aObjectS71S0300000_14.l0).LIZ.LJIIIIZZ))).add(((WID) aObjectS71S0300000_14.l1).LIZIZ());
        ((C82064WIq) aObjectS71S0300000_14.l0).LIZIZ((C82622Wbi) aObjectS71S0300000_14.l2, arrayList, arrayList2);
        ((C82064WIq) aObjectS71S0300000_14.l0).LJIIIIZZ((C82622Wbi) aObjectS71S0300000_14.l2, (WID) aObjectS71S0300000_14.l1);
    }

    public static final void onChanged$14(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        boolean z;
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l0;
        C82068WIu c82068WIu = c82064WIq.LIZ;
        InterfaceC82086WJm interfaceC82086WJm = c82064WIq.LIZIZ;
        if (interfaceC82086WJm != null) {
            if (interfaceC82086WJm.f8() && interfaceC82086WJm.LLJJJJLIIL(c82064WIq.LIZ.LIZIZ)) {
                z = true;
            } else {
                z = false;
            }
            c82068WIu.LIZLLL = z;
            C82064WIq c82064WIq2 = (C82064WIq) aObjectS71S0300000_14.l0;
            C82068WIu c82068WIu2 = c82064WIq2.LIZ;
            InterfaceC82086WJm interfaceC82086WJm2 = c82064WIq2.LIZIZ;
            if (interfaceC82086WJm2 != null) {
                c82068WIu2.LIZJ = interfaceC82086WJm2.zy(c82068WIu2.LIZIZ, c82068WIu2.LIZ);
                ((C82064WIq) aObjectS71S0300000_14.l0).LJ();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                AqS141S0200000_10 aqS141S0200000_10 = new AqS141S0200000_10(arrayList, (List<C81975WFf>) arrayList2, (List<C81975WFf>) 55);
                ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82064WIq) aObjectS71S0300000_14.l0).LIZ.LIZLLL))).add(((WID) aObjectS71S0300000_14.l1).LJIJ());
                ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82064WIq) aObjectS71S0300000_14.l0).LIZ.LIZJ))).add(((WID) aObjectS71S0300000_14.l1).LJIIL());
                ((C82064WIq) aObjectS71S0300000_14.l0).LIZIZ((C82622Wbi) aObjectS71S0300000_14.l2, arrayList, arrayList2);
                return;
            }
            o.LJIJI("cameraApiComponent");
            throw null;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }

    public static final void onChanged$15(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        ((C82064WIq) aObjectS71S0300000_14.l0).LJI((C82622Wbi) aObjectS71S0300000_14.l1, (WID) aObjectS71S0300000_14.l2, false);
    }

    public static final void onChanged$16(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        ((C82064WIq) aObjectS71S0300000_14.l0).LJI((C82622Wbi) aObjectS71S0300000_14.l1, (WID) aObjectS71S0300000_14.l2, false);
    }

    public static final void onChanged$17(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        Integer num = (Integer) obj;
        C81975WFf LJIJ = ((WID) aObjectS71S0300000_14.l0).LJIJ();
        if (num != null) {
            if (num.intValue() == 2) {
                LJIJ.LJLJLLL = false;
            } else if (num.intValue() == 3) {
                LJIJ.LJLJLLL = true;
            }
        }
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l1;
        C82622Wbi c82622Wbi = (C82622Wbi) aObjectS71S0300000_14.l2;
        c82064WIq.getClass();
        C82064WIq.LJII(c82622Wbi, LJIJ);
        if (C1E5.LJII(((C82064WIq) aObjectS71S0300000_14.l1).LIZ)) {
            C81975WFf LJII = ((WID) aObjectS71S0300000_14.l0).LJII();
            LJII.LJLILLLLZI = WI2.LIZIZ(0);
            C82064WIq c82064WIq2 = (C82064WIq) aObjectS71S0300000_14.l1;
            C82622Wbi c82622Wbi2 = (C82622Wbi) aObjectS71S0300000_14.l2;
            c82064WIq2.getClass();
            C82064WIq.LJII(c82622Wbi2, LJII);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$18(Y.AObjectS71S0300000_14 r7, java.lang.Object r8) {
        /*
            X.HqQ r8 = (X.C45314HqQ) r8
            java.lang.Object r0 = r7.l0
            X.WID r0 = (X.WID) r0
            X.WFf r2 = r0.LJIIIIZZ()
            com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableMicWithBGMConfig r0 = X.WJR.LIZ()
            boolean r0 = r0.useRedButton
            r3 = 0
            r4 = 0
            r5 = 1
            java.lang.String r1 = "shortVideoContext"
            if (r0 == 0) goto L9e
            com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableMicWithBGMConfig r0 = X.WJR.LIZ()
            boolean r0 = r0.enableMicButton
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r7.l1
            X.WIq r0 = (X.C82064WIq) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LJ
            if (r0 == 0) goto La4
            boolean r0 = r0.LJJIJIL()
            if (r0 == 0) goto L9e
            r6 = 1
        L2e:
            com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableLoudNormAndAlignInDuetConfig r0 = X.WJU.LIZ()
            boolean r0 = r0.useRedButton
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r7.l1
            X.WIq r0 = (X.C82064WIq) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LJ
            if (r0 == 0) goto La0
            boolean r0 = r0.LJJJI()
            if (r0 == 0) goto L9c
            r3 = 1
        L45:
            int r1 = r8.LJLIL
            if (r1 == r5) goto L83
            r0 = 2
            if (r1 == r0) goto L67
            r0 = 3
            if (r1 == r0) goto L64
            r0 = 4
            if (r1 == r0) goto L61
        L52:
            java.lang.Object r1 = r7.l1
            X.WIq r1 = (X.C82064WIq) r1
            java.lang.Object r0 = r7.l2
            X.Wbi r0 = (X.C82622Wbi) r0
            r1.getClass()
            X.C82064WIq.LJII(r0, r2)
            return
        L61:
            r2.LJLJJLL = r4
            goto L52
        L64:
            r2.LJLJJLL = r5
            goto L52
        L67:
            com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableMicWithBGMConfig r0 = X.WJR.LIZ()
            boolean r0 = r0.enableMicButton
            if (r0 == 0) goto L72
            X.HB4.LJIIIIZZ(r5)
        L72:
            r2.LJLJLLL = r4
            r0 = 2131756088(0x7f100438, float:1.9143074E38)
            r2.LJLJI = r0
            if (r6 != 0) goto L7d
            if (r3 == 0) goto L80
        L7d:
            r4 = 2130968665(0x7f040059, float:1.754599E38)
        L80:
            r2.LJLJJI = r4
            goto L52
        L83:
            boolean r0 = r2.LJLJJLL
            if (r0 == 0) goto L52
            com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableMicWithBGMConfig r0 = X.WJR.LIZ()
            boolean r0 = r0.enableMicButton
            if (r0 == 0) goto L92
            X.HB4.LJIIIIZZ(r4)
        L92:
            r2.LJLJLLL = r4
            r0 = 2131756085(0x7f100435, float:1.9143068E38)
            r2.LJLJI = r0
            r2.LJLJJI = r4
            goto L52
        L9c:
            r3 = 0
            goto L45
        L9e:
            r6 = 0
            goto L2e
        La0:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r3
        La4:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS71S0300000_14.onChanged$18(Y.AObjectS71S0300000_14, java.lang.Object):void");
    }

    public static final void onChanged$19(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        Integer num = (Integer) obj;
        InterfaceC82086WJm interfaceC82086WJm = ((C82064WIq) aObjectS71S0300000_14.l0).LIZIZ;
        if (interfaceC82086WJm != null) {
            if (interfaceC82086WJm.LLFZ()) {
                return;
            }
            C81975WFf LJII = ((WID) aObjectS71S0300000_14.l1).LJII();
            if (num != null) {
                if (num.intValue() == 0) {
                    LJII.LJLJI = R.raw.icon_camera_flash_slash_fill;
                } else if (num.intValue() == 5) {
                    LJII.LJLJJLL = false;
                } else if (num.intValue() == 6) {
                    LJII.LJLJJLL = true;
                }
                C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l0;
                C82622Wbi c82622Wbi = (C82622Wbi) aObjectS71S0300000_14.l2;
                c82064WIq.getClass();
                C82064WIq.LJII(c82622Wbi, LJII);
                return;
            }
            LJII.LJLJI = R.raw.icon_camera_flash_fill;
            C82064WIq c82064WIq2 = (C82064WIq) aObjectS71S0300000_14.l0;
            C82622Wbi c82622Wbi2 = (C82622Wbi) aObjectS71S0300000_14.l2;
            c82064WIq2.getClass();
            C82064WIq.LJII(c82622Wbi2, LJII);
            return;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }

    public static final void onChanged$2(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        TikTokCameraBaseGroupScene rootScene;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (((WSI) aObjectS71S0300000_14.l0).LIZIZ == null) {
            return;
        }
        if (bool.booleanValue()) {
            if (o.LJ(((WSI) aObjectS71S0300000_14.l0).LIZIZ.getTag(), "RecordLiveScene")) {
                if (!((WSI) aObjectS71S0300000_14.l0).LIZIZ.LLJILJIL()) {
                    TikTokCameraBaseGroupScene rootScene2 = ((C82329WSv) aObjectS71S0300000_14.l1).getRootScene();
                    if (rootScene2 != null) {
                        rootScene2.LLLILZLLLI(true, false);
                    }
                } else {
                    TikTokCameraBaseGroupScene rootScene3 = ((C82329WSv) aObjectS71S0300000_14.l1).getRootScene();
                    if (rootScene3 != null) {
                        rootScene3.LLLIZZ();
                    }
                }
                if (((C82329WSv) aObjectS71S0300000_14.l1).isZTLiveSwitch() && ((C82329WSv) aObjectS71S0300000_14.l1).isLiveReuseSwitchOpen()) {
                    ((C82329WSv) aObjectS71S0300000_14.l1).setLiveTagState(-1);
                }
            }
            ((WMH) aObjectS71S0300000_14.l2).show(((WSI) aObjectS71S0300000_14.l0).LIZIZ);
            ((WSI) aObjectS71S0300000_14.l0).LIZIZ.show();
            return;
        }
        if (o.LJ(((WSI) aObjectS71S0300000_14.l0).LIZIZ.getTag(), "RecordLiveScene") && !((WSI) aObjectS71S0300000_14.l0).LIZIZ.LLJILJIL() && (rootScene = ((C82329WSv) aObjectS71S0300000_14.l1).getRootScene()) != null) {
            rootScene.LLLILZLLLI(false, true);
        }
        ((WSI) aObjectS71S0300000_14.l0).LIZIZ.hide();
        ((WMH) aObjectS71S0300000_14.l2).hide(((WSI) aObjectS71S0300000_14.l0).LIZIZ);
    }

    public static final void onChanged$20(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        OSZ osz = (OSZ) obj;
        int i = C82071WIx.LIZ[((EnumC82072WIy) osz.getSecond()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                if (((C82064WIq) aObjectS71S0300000_14.l0).LJIIJ) {
                    ((WID) aObjectS71S0300000_14.l2).LJIIJ().LJLILLLLZI = R.drawable.b73;
                    ((WID) aObjectS71S0300000_14.l2).LJIIJ().LJLJLLL = true;
                } else {
                    ((WID) aObjectS71S0300000_14.l2).LJIIJ().LJLILLLLZI = R.drawable.b74;
                }
                if (osz.getFirst() == EnumC82072WIy.DISMISS) {
                    ((C82064WIq) aObjectS71S0300000_14.l0).LIZIZ((C82622Wbi) aObjectS71S0300000_14.l1, C47261Igj.LJJIJ(((WID) aObjectS71S0300000_14.l2).LJIIJ()), C61878OQg.INSTANCE);
                }
                ((WID) aObjectS71S0300000_14.l2).LJIIJ().LJLLLL = true;
                return;
            }
            if (((C82064WIq) aObjectS71S0300000_14.l0).LJIIJ) {
                ((WID) aObjectS71S0300000_14.l2).LJIIJ().LJLJLLL = false;
            }
            ((WID) aObjectS71S0300000_14.l2).LJIIJ().LJLILLLLZI = R.drawable.b73;
            if (osz.getFirst() == EnumC82072WIy.DISMISS) {
                ((C82064WIq) aObjectS71S0300000_14.l0).LIZIZ((C82622Wbi) aObjectS71S0300000_14.l1, C47261Igj.LJJIJ(((WID) aObjectS71S0300000_14.l2).LJIIJ()), C61878OQg.INSTANCE);
            }
            ((WID) aObjectS71S0300000_14.l2).LJIIJ().LJLLLL = true;
            return;
        }
        ((C82064WIq) aObjectS71S0300000_14.l0).LIZIZ((C82622Wbi) aObjectS71S0300000_14.l1, C61878OQg.INSTANCE, C47261Igj.LJJIJ(((WID) aObjectS71S0300000_14.l2).LJIIJ()));
    }

    public static final void onChanged$21(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        Integer num = (Integer) obj;
        C81975WFf LJIIL = ((WID) aObjectS71S0300000_14.l0).LJIIL();
        if (num != null) {
            if (num.intValue() == 2) {
                LJIIL.LJLILLLLZI = R.drawable.b77;
            } else if (num.intValue() == 3) {
                LJIIL.LJLILLLLZI = R.drawable.b78;
            }
        }
        LJIIL.LJLLLLLL = R.string.r2r;
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l1;
        C82622Wbi c82622Wbi = (C82622Wbi) aObjectS71S0300000_14.l2;
        c82064WIq.getClass();
        C82064WIq.LJII(c82622Wbi, LJIIL);
    }

    public static final void onChanged$22(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        WS0 ws0 = (WS0) obj;
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l0;
        if (c82064WIq.LJFF != null) {
            Object obj2 = ws0.LIZIZ;
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            if (c82064WIq.LJIIJJI == null) {
                List LJJIJIIJI = C47261Igj.LJJIJIIJI(I38.RECORD_COMBINE.getTag(), I38.RECORD_COMBINE_15.getTag(), I38.RECORD_COMBINE_60.getTag(), I38.PHOTO_SHORT.getTag(), I38.RECORD_LIGHTENING_VIDEO.getTag());
                ArrayList arrayList = new ArrayList();
                Iterator it = LJJIJIIJI.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                arrayList.add("RecordCombinePhoto");
                c82064WIq.LJIIJJI = arrayList;
                c82064WIq.LJIIL = I38.PHOTO_SHORT.getTag();
            }
            List<? extends CharSequence> list = c82064WIq.LJIIJJI;
            if (list != null) {
                if (!((ArrayList) list).contains(obj2)) {
                    return;
                }
                C82064WIq c82064WIq2 = (C82064WIq) aObjectS71S0300000_14.l0;
                Object obj3 = ws0.LIZIZ;
                o.LJII(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                String str = c82064WIq2.LJIIL;
                if (str != null) {
                    boolean LJ = o.LJ(str, obj3);
                    C82064WIq c82064WIq3 = (C82064WIq) aObjectS71S0300000_14.l0;
                    if (c82064WIq3.LIZ.LIZ == LJ) {
                        return;
                    }
                    InterfaceC82086WJm interfaceC82086WJm = c82064WIq3.LIZIZ;
                    if (interfaceC82086WJm != null) {
                        boolean LLFZ = interfaceC82086WJm.LLFZ();
                        C82064WIq c82064WIq4 = (C82064WIq) aObjectS71S0300000_14.l0;
                        C82068WIu c82068WIu = c82064WIq4.LIZ;
                        c82068WIu.LIZ = LJ;
                        InterfaceC82086WJm interfaceC82086WJm2 = c82064WIq4.LIZIZ;
                        if (interfaceC82086WJm2 != null) {
                            c82068WIu.LIZJ = interfaceC82086WJm2.zy(LLFZ, LJ);
                            C82064WIq c82064WIq5 = (C82064WIq) aObjectS71S0300000_14.l0;
                            C82068WIu c82068WIu2 = c82064WIq5.LIZ;
                            InterfaceC82086WJm interfaceC82086WJm3 = c82064WIq5.LIZIZ;
                            if (interfaceC82086WJm3 != null) {
                                c82068WIu2.LIZLLL = interfaceC82086WJm3.LLJJJJLIIL(LLFZ);
                                ((C82064WIq) aObjectS71S0300000_14.l0).LJ();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                AqS141S0200000_10 aqS141S0200000_10 = new AqS141S0200000_10(arrayList2, (List<C81975WFf>) arrayList3, (List<C81975WFf>) 56);
                                C82064WIq c82064WIq6 = (C82064WIq) aObjectS71S0300000_14.l0;
                                if (c82064WIq6.LIZ.LIZ) {
                                    arrayList3.add(((WID) aObjectS71S0300000_14.l1).LJIILJJIL());
                                    ShortVideoContext shortVideoContext = ((C82064WIq) aObjectS71S0300000_14.l0).LJ;
                                    if (shortVideoContext != null) {
                                        if (V16.LJJLIIIJJI(shortVideoContext)) {
                                            arrayList3.add(((WID) aObjectS71S0300000_14.l1).LJIILL());
                                        }
                                        MusicService.LJJLIIIJJI().LJIJJ();
                                        arrayList3.add(((WID) aObjectS71S0300000_14.l1).LJIILLIIL());
                                        arrayList3.add(((WID) aObjectS71S0300000_14.l1).LIZLLL());
                                        ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82064WIq) aObjectS71S0300000_14.l0).LIZ.LIZJ))).add(((WID) aObjectS71S0300000_14.l1).LJIIL());
                                        ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82064WIq) aObjectS71S0300000_14.l0).LIZ.LIZLLL))).add(((WID) aObjectS71S0300000_14.l1).LJIJ());
                                    } else {
                                        o.LJIJI("shortVideoContext");
                                        throw null;
                                    }
                                } else {
                                    if (((Boolean) c82064WIq6.LJIIIZ.getValue()).booleanValue()) {
                                        return;
                                    }
                                    arrayList2.add(((WID) aObjectS71S0300000_14.l1).LJIILJJIL());
                                    ShortVideoContext shortVideoContext2 = ((C82064WIq) aObjectS71S0300000_14.l0).LJ;
                                    if (shortVideoContext2 != null) {
                                        if (V16.LJJLIIIJJI(shortVideoContext2)) {
                                            arrayList2.add(((WID) aObjectS71S0300000_14.l1).LJIILL());
                                        }
                                        MusicService.LJJLIIIJJI().LJIJJ();
                                        ((C82064WIq) aObjectS71S0300000_14.l0).LIZ.getClass();
                                        ((List) aqS141S0200000_10.invoke(Boolean.FALSE)).add(((WID) aObjectS71S0300000_14.l1).LJIILLIIL());
                                        arrayList2.add(((WID) aObjectS71S0300000_14.l1).LIZLLL());
                                        ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82064WIq) aObjectS71S0300000_14.l0).LIZ.LIZJ))).add(((WID) aObjectS71S0300000_14.l1).LJIIL());
                                        ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82064WIq) aObjectS71S0300000_14.l0).LIZ.LIZLLL))).add(((WID) aObjectS71S0300000_14.l1).LJIJ());
                                    } else {
                                        o.LJIJI("shortVideoContext");
                                        throw null;
                                    }
                                }
                                ((C82064WIq) aObjectS71S0300000_14.l0).LIZIZ((C82622Wbi) aObjectS71S0300000_14.l2, arrayList2, arrayList3);
                                return;
                            }
                            o.LJIJI("cameraApiComponent");
                            throw null;
                        }
                        o.LJIJI("cameraApiComponent");
                        throw null;
                    }
                    o.LJIJI("cameraApiComponent");
                    throw null;
                }
                o.LJIJI("liveText");
                throw null;
            }
            o.LJIJI("tabs");
            throw null;
        }
        o.LJIJI("activity");
        throw null;
    }

    public static final void onChanged$23(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        Boolean it = (Boolean) obj;
        C81975WFf LJIIJJI = ((WID) aObjectS71S0300000_14.l0).LJIIJJI();
        if (!o.LJ(Boolean.valueOf(LJIIJJI.LJLJJLL), it)) {
            o.LJIIIIZZ(it, "it");
            LJIIJJI.LJLJJLL = it.booleanValue();
            C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l1;
            C82622Wbi c82622Wbi = (C82622Wbi) aObjectS71S0300000_14.l2;
            c82064WIq.getClass();
            C82064WIq.LJII(c82622Wbi, LJIIJJI);
        }
    }

    public static final void onChanged$24(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        Boolean it = (Boolean) obj;
        C81975WFf LJIIJJI = ((WID) aObjectS71S0300000_14.l0).LJIIJJI();
        if (!o.LJ(Boolean.valueOf(LJIIJJI.LJLJJLL), it) || !o.LJ(Boolean.valueOf(LJIIJJI.LJZ), it)) {
            o.LJIIIIZZ(it, "it");
            LJIIJJI.LJLJJLL = it.booleanValue();
            LJIIJJI.LJZ = it.booleanValue();
            if (it.booleanValue()) {
                LJIIJJI.LJLLL = false;
            }
            C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l1;
            C82622Wbi c82622Wbi = (C82622Wbi) aObjectS71S0300000_14.l2;
            c82064WIq.getClass();
            C82064WIq.LJII(c82622Wbi, LJIIJJI);
        }
    }

    public static final void onChanged$25(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        OSZ osz = (OSZ) obj;
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l0;
        C82068WIu c82068WIu = c82064WIq.LIZ;
        InterfaceC82086WJm interfaceC82086WJm = c82064WIq.LIZIZ;
        if (interfaceC82086WJm != null) {
            c82068WIu.LJIIIZ = interfaceC82086WJm.e8().getCameraController().LLJL();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ((List) new AqS141S0200000_10(arrayList, (List<C81975WFf>) arrayList2, (List<C81975WFf>) 57).invoke(Boolean.valueOf(C1E5.LJII(((C82064WIq) aObjectS71S0300000_14.l0).LIZ)))).add(((WID) aObjectS71S0300000_14.l1).LJII());
            ((C82064WIq) aObjectS71S0300000_14.l0).LIZIZ((C82622Wbi) aObjectS71S0300000_14.l2, arrayList, arrayList2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ToolbarCreator,updateFlash on cameraStateChange.isFrontCamera:");
            LIZ.append(((C82064WIq) aObjectS71S0300000_14.l0).LIZ.LIZIZ);
            LIZ.append(",torchSupport:");
            LIZ.append(((C82064WIq) aObjectS71S0300000_14.l0).LIZ.LJIIIZ);
            LIZ.append(",cameraType:");
            LIZ.append(((Number) osz.getFirst()).intValue());
            LIZ.append(",openState:");
            LIZ.append(((Boolean) osz.getSecond()).booleanValue());
            H78.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }

    public static final void onChanged$26(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        C81975WFf LJFF = ((WID) aObjectS71S0300000_14.l0).LJFF();
        LJFF.LJLJJLL = !((Boolean) obj).booleanValue();
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l1;
        C82622Wbi c82622Wbi = (C82622Wbi) aObjectS71S0300000_14.l2;
        c82064WIq.getClass();
        C82064WIq.LJII(c82622Wbi, LJFF);
    }

    public static final void onChanged$27(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        C81975WFf LJFF = ((WID) aObjectS71S0300000_14.l0).LJFF();
        LJFF.LJLJJL = (ImageUrlModel) obj;
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l1;
        C82622Wbi c82622Wbi = (C82622Wbi) aObjectS71S0300000_14.l2;
        c82064WIq.getClass();
        C82064WIq.LJII(c82622Wbi, LJFF);
    }

    public static final void onChanged$28(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        ((C82064WIq) aObjectS71S0300000_14.l0).LIZJ((C82622Wbi) aObjectS71S0300000_14.l2, (WID) aObjectS71S0300000_14.l1, false);
    }

    public static final void onChanged$29(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        C82064WIq c82064WIq = (C82064WIq) aObjectS71S0300000_14.l0;
        WID wid = (WID) aObjectS71S0300000_14.l1;
        C82622Wbi c82622Wbi = (C82622Wbi) aObjectS71S0300000_14.l2;
        c82064WIq.LIZ.LJ = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(wid.LJ());
        c82064WIq.LIZIZ(c82622Wbi, null, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.WZc, T, java.lang.Object] */
    public static final void onChanged$3(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        HYN hyn = (HYN) obj;
        boolean XP = ((WYR) aObjectS71S0300000_14.l0).LJJLIIIJILLIZJL().XP();
        Effect KK = ((WYR) aObjectS71S0300000_14.l0).LJJLIIIJILLIZJL().KK();
        if (C78685UuP.LJJJZ(OUP.LJJJLZIJ(KK)) && XP) {
            ((VEAudioCapture) aObjectS71S0300000_14.l1).addCaptureListener(((WYR) aObjectS71S0300000_14.l0).LJLLJ);
            WYR wyr = (WYR) aObjectS71S0300000_14.l0;
            ?? LJJLI = wyr.LJJLI(wyr.LJLLI);
            StreamVoiceConversionModel streamVoiceConversionModel = ((WYR) aObjectS71S0300000_14.l0).getShortVideoContext().creativeModel.streamVoiceConversionModel;
            String effectId = KK.getEffectId();
            String LJIJI = OUP.LJIJI(KK);
            o.LJIIIZ(streamVoiceConversionModel, "<this>");
            o.LJIIIZ(effectId, "effectId");
            if (!streamVoiceConversionModel.vcSegmentEffectIdFromMap.containsKey(effectId)) {
                streamVoiceConversionModel.vcSegmentEffectIdFromMap.put(effectId, LJIJI);
            }
            AqS145S0200000_14 aqS145S0200000_14 = new AqS145S0200000_14((C82492WZc) LJJLI, hyn, 16);
            LJJLI.getClass();
            LJJLI.LJLZ = aqS145S0200000_14;
            ((WYR) aObjectS71S0300000_14.l0).LJLLJ.LJLILLLLZI = LJJLI;
            LJJLI.LJII(KK, false);
            C169586l8.LIZ.LIZ(LJJLI);
            ((C68322mC) aObjectS71S0300000_14.l2).element = LJJLI;
            return;
        }
        ((C68322mC) aObjectS71S0300000_14.l2).element = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$4(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        TimeSpeedModelExtension LJIIJ = ((WYR) aObjectS71S0300000_14.l0).getShortVideoContext().LJIIJ();
        C82492WZc c82492WZc = (C82492WZc) ((C68322mC) aObjectS71S0300000_14.l1).element;
        if (c82492WZc != null) {
            C82492WZc.LJIIIIZZ(c82492WZc);
        }
        C82492WZc c82492WZc2 = (C82492WZc) ((C68322mC) aObjectS71S0300000_14.l1).element;
        if (c82492WZc2 != null) {
            c82492WZc2.LJLJLLL = LJIIJ;
        }
        C82464WYa c82464WYa = ((WYR) aObjectS71S0300000_14.l0).LJLLJ;
        c82464WYa.LJLILLLLZI = null;
        ((VEAudioCapture) aObjectS71S0300000_14.l2).removeCaptureListener(c82464WYa);
    }

    public static final void onChanged$5(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        ((C82055WIh) aObjectS71S0300000_14.l0).LIZ.LIZJ = true;
        ArrayList arrayList = new ArrayList();
        ShortVideoContext shortVideoContext = ((C82055WIh) aObjectS71S0300000_14.l0).LIZLLL;
        if (shortVideoContext != null) {
            if (!shortVideoContext.LJJIJIIJI()) {
                arrayList.add(((WI6) aObjectS71S0300000_14.l1).LIZJ());
            }
            InterfaceC82053WIf interfaceC82053WIf = (InterfaceC82053WIf) ((C82622Wbi) aObjectS71S0300000_14.l2).LJ(InterfaceC82053WIf.class, null);
            interfaceC82053WIf.a8(arrayList);
            interfaceC82053WIf.LJLLLL(C82055WIh.LIZIZ());
            return;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public static final void onChanged$6(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        ((C82055WIh) aObjectS71S0300000_14.l0).LIZ.LIZJ = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(((WI6) aObjectS71S0300000_14.l1).LIZJ());
        InterfaceC82053WIf interfaceC82053WIf = (InterfaceC82053WIf) ((C82622Wbi) aObjectS71S0300000_14.l2).LJ(InterfaceC82053WIf.class, null);
        interfaceC82053WIf.t1(arrayList);
        interfaceC82053WIf.LJLLLL(C82055WIh.LIZIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$7(Y.AObjectS71S0300000_14 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS71S0300000_14.onChanged$7(Y.AObjectS71S0300000_14, java.lang.Object):void");
    }

    public static final void onChanged$8(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        C82055WIh c82055WIh = (C82055WIh) aObjectS71S0300000_14.l0;
        C82054WIg c82054WIg = c82055WIh.LIZ;
        InterfaceC82086WJm interfaceC82086WJm = c82055WIh.LIZIZ;
        if (interfaceC82086WJm != null) {
            c82054WIg.LIZIZ = interfaceC82086WJm.zy(c82054WIg.LIZ, false);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ((List) new AqS141S0200000_10(arrayList, (List<C81975WFf>) arrayList2, (List<C81975WFf>) 29).invoke(Boolean.valueOf(((C82055WIh) aObjectS71S0300000_14.l0).LIZ.LIZIZ))).add(((WI6) aObjectS71S0300000_14.l1).LJFF());
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS71S0300000_14.l2).LJ(InterfaceC82053WIf.class, null)).a8(arrayList);
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS71S0300000_14.l2).LJ(InterfaceC82053WIf.class, null)).t1(arrayList2);
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS71S0300000_14.l2).LJ(InterfaceC82053WIf.class, null)).LJLLLL(C82055WIh.LIZIZ());
            return;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }

    public static final void onChanged$9(AObjectS71S0300000_14 aObjectS71S0300000_14, Object obj) {
        WS0 ws0 = (WS0) obj;
        C82055WIh c82055WIh = (C82055WIh) aObjectS71S0300000_14.l0;
        if (c82055WIh.LJ != null) {
            Object obj2 = ws0.LIZIZ;
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            if (c82055WIh.LJII == null) {
                List LJJIJIIJI = C47261Igj.LJJIJIIJI(I38.RECORD_COMBINE.getTag(), I38.RECORD_COMBINE_15.getTag(), I38.RECORD_COMBINE_60.getTag(), I38.PHOTO_SHORT.getTag());
                ArrayList arrayList = new ArrayList();
                Iterator it = LJJIJIIJI.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                c82055WIh.LJII = arrayList;
                I38.PHOTO_SHORT.getTag();
            }
            List<? extends CharSequence> list = c82055WIh.LJII;
            if (list != null) {
                if (!((ArrayList) list).contains(obj2)) {
                    return;
                }
                InterfaceC82086WJm interfaceC82086WJm = ((C82055WIh) aObjectS71S0300000_14.l0).LIZIZ;
                if (interfaceC82086WJm != null) {
                    boolean LLFZ = interfaceC82086WJm.LLFZ();
                    C82055WIh c82055WIh2 = (C82055WIh) aObjectS71S0300000_14.l0;
                    C82054WIg c82054WIg = c82055WIh2.LIZ;
                    InterfaceC82086WJm interfaceC82086WJm2 = c82055WIh2.LIZIZ;
                    if (interfaceC82086WJm2 != null) {
                        c82054WIg.LIZIZ = interfaceC82086WJm2.zy(LLFZ, false);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        AqS141S0200000_10 aqS141S0200000_10 = new AqS141S0200000_10(arrayList2, (List<C81975WFf>) arrayList3, (List<C81975WFf>) 30);
                        arrayList2.add(((WI6) aObjectS71S0300000_14.l1).LJII());
                        ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82055WIh) aObjectS71S0300000_14.l0).LIZ.LIZJ))).add(((WI6) aObjectS71S0300000_14.l1).LIZJ());
                        arrayList2.add(((WI6) aObjectS71S0300000_14.l1).LJII.getValue());
                        ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82055WIh) aObjectS71S0300000_14.l0).LIZ.LIZIZ))).add(((WI6) aObjectS71S0300000_14.l1).LJFF());
                        ((InterfaceC82053WIf) ((C82622Wbi) aObjectS71S0300000_14.l2).LJ(InterfaceC82053WIf.class, null)).a8(arrayList2);
                        ((InterfaceC82053WIf) ((C82622Wbi) aObjectS71S0300000_14.l2).LJ(InterfaceC82053WIf.class, null)).t1(arrayList3);
                        ((InterfaceC82053WIf) ((C82622Wbi) aObjectS71S0300000_14.l2).LJ(InterfaceC82053WIf.class, null)).LJLLLL(C82055WIh.LIZIZ());
                        return;
                    }
                    o.LJIJI("cameraApiComponent");
                    throw null;
                }
                o.LJIJI("cameraApiComponent");
                throw null;
            }
            o.LJIJI("tabs");
            throw null;
        }
        o.LJIJI("activity");
        throw null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS71S0300000_14(X.C82622Wbi r2, X.C82064WIq r3, X.WID r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 10: goto L10;
                case 11: goto L10;
                case 12: goto L18;
                case 13: goto L18;
                case 14: goto L18;
                case 15: goto L5;
                case 16: goto L5;
                case 17: goto L10;
                case 18: goto L10;
                case 19: goto L18;
                case 20: goto L5;
                case 21: goto L10;
                case 22: goto L18;
                case 23: goto L10;
                case 24: goto L10;
                case 25: goto L18;
                case 26: goto L10;
                case 27: goto L10;
                case 28: goto L18;
                case 29: goto L18;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
            goto Lc
        L18:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS71S0300000_14.<init>(X.Wbi, X.WIq, X.WID, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS71S0300000_14(X.WYR r2, X.WYR r3, com.ss.android.vesdk.VEAudioCapture r4, X.C68322mC<X.C82492WZc> r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 3: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS71S0300000_14.<init>(X.WYR, com.ss.android.vesdk.VEAudioCapture, X.2mC, int):void");
    }

    public AObjectS71S0300000_14(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
