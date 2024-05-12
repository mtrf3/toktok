package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C32014ChO;
import X.C32449CoP;
import X.C34K;
import X.C68322mC;
import X.C72242sW;
import X.C74770TWc;
import X.C74987Tbr;
import X.C75068TdA;
import X.C75808Tp6;
import X.C75813TpB;
import X.C75814TpC;
import X.C76439TzH;
import X.C76443TzL;
import X.C76451TzT;
import X.C76732zl;
import X.C76800UCe;
import X.C76820UCy;
import X.C77380UYm;
import X.C78161Ulx;
import X.C78163Ulz;
import X.C78183UmJ;
import X.C78184UmK;
import X.C78185UmL;
import X.C78194UmU;
import X.C7MY;
import X.CN1;
import X.EnumC30836C8i;
import X.InterfaceC65784Pro;
import X.InterfaceC75807Tp5;
import X.InterfaceC75817TpF;
import X.InterfaceC88472Yns;
import X.R2P;
import X.U8M;
import X.U8Q;
import X.UDE;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.viewmodel.MatchSpeedChallengeVM;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundFixSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.Map;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;

/* loaded from: classes14.dex */
public class AqS58S0400000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS58S0400000_13 aqS58S0400000_13, Object obj) {
        C76439TzH setState = (C76439TzH) obj;
        o.LJIIIZ(setState, "$this$setState");
        C76443TzL c76443TzL = new C76443TzL(1, ((C34K) aqS58S0400000_13.l0).element);
        c76443TzL.LIZJ = (ItemInfo4FE) ((C68322mC) aqS58S0400000_13.l3).element;
        return C76439TzH.M(setState, (BattleItem4FEModel) aqS58S0400000_13.l1, null, (BattleItem4FEModel) aqS58S0400000_13.l2, null, c76443TzL, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS58S0400000_13 aqS58S0400000_13, Object obj) {
        C76439TzH setState = (C76439TzH) obj;
        o.LJIIIZ(setState, "$this$setState");
        C76443TzL c76443TzL = new C76443TzL(2, ((C34K) aqS58S0400000_13.l0).element);
        c76443TzL.LIZJ = (ItemInfo4FE) ((C68322mC) aqS58S0400000_13.l3).element;
        return C76439TzH.M(setState, null, (BattleItem4FEModel) aqS58S0400000_13.l1, null, (BattleItem4FEModel) aqS58S0400000_13.l2, c76443TzL, 5);
    }

    public static final Object invoke$10(AqS58S0400000_13 aqS58S0400000_13, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            U8M u8m = ((U8Q) aqS58S0400000_13.l0).LIZ.LJFF;
            String obj2 = bitmap.toString();
            Client.RTCWaterMarkRegion rTCWaterMarkRegion = new Client.RTCWaterMarkRegion();
            RectF rectF = (RectF) aqS58S0400000_13.l2;
            InterfaceC75807Tp5 interfaceC75807Tp5 = (InterfaceC75807Tp5) aqS58S0400000_13.l3;
            rTCWaterMarkRegion.setX(rectF.left);
            rTCWaterMarkRegion.setY(rectF.top);
            rTCWaterMarkRegion.setW(rectF.width());
            rTCWaterMarkRegion.setH(rectF.height());
            rTCWaterMarkRegion.setImage(bitmap);
            rTCWaterMarkRegion.setRenderMode(interfaceC75807Tp5.LIZ());
            rTCWaterMarkRegion.setZorder(1);
            u8m.LJJIZ(obj2, rTCWaterMarkRegion);
            ((U8Q) aqS58S0400000_13.l0).LIZ.LJFF.LJJIL();
        } else {
            ((U8Q) aqS58S0400000_13.l0).LIZIZ.remove((Region) aqS58S0400000_13.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS58S0400000_13 aqS58S0400000_13, Object it) {
        o.LJIIIZ(it, "it");
        C76732zl c76732zl = (C76732zl) aqS58S0400000_13.l0;
        c76732zl.element--;
        ((Map) aqS58S0400000_13.l1).put((C32449CoP) aqS58S0400000_13.l2, new C78183UmJ(true, null));
        if (((C76732zl) aqS58S0400000_13.l0).element <= 0) {
            C78184UmK c78184UmK = (C78184UmK) aqS58S0400000_13.l3;
            Map<C32449CoP, C78183UmJ> map = (Map) aqS58S0400000_13.l1;
            c78184UmK.LJ = map;
            InterfaceC88472Yns<? super Map<C32449CoP, C78183UmJ>, C76800UCe> interfaceC88472Yns = c78184UmK.LIZJ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(map);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS58S0400000_13 aqS58S0400000_13, Object obj) {
        C78163Ulz err = (C78163Ulz) obj;
        o.LJIIIZ(err, "err");
        C76732zl c76732zl = (C76732zl) aqS58S0400000_13.l0;
        c76732zl.element--;
        ((Map) aqS58S0400000_13.l1).put((C32449CoP) aqS58S0400000_13.l2, new C78183UmJ(false, err));
        if (((C76732zl) aqS58S0400000_13.l0).element <= 0) {
            C78184UmK c78184UmK = (C78184UmK) aqS58S0400000_13.l3;
            Map<C32449CoP, C78183UmJ> map = (Map) aqS58S0400000_13.l1;
            c78184UmK.LJ = map;
            InterfaceC88472Yns<? super Map<C32449CoP, C78183UmJ>, C76800UCe> interfaceC88472Yns = c78184UmK.LIZJ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(map);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS58S0400000_13 aqS58S0400000_13, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return C76439TzH.L((BattleItem4FEModel) aqS58S0400000_13.l0, (BattleItem4FEModel) aqS58S0400000_13.l1, (BattleItem4FEModel) aqS58S0400000_13.l2, (BattleItem4FEModel) aqS58S0400000_13.l3, C76451TzT.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AqS58S0400000_13 r21, java.lang.Object r22) {
        /*
            r7 = r22
            X.UCy r7 = (X.C76820UCy) r7
            java.lang.String r0 = "$this$setState"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r3 = r21
            java.lang.Object r0 = r3.l0
            X.UCy r0 = (X.C76820UCy) r0
            X.UD4 r6 = r0.LJLJLLL
            java.lang.Object r0 = r3.l1
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig r0 = (com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig) r0
            long r4 = r0.previewStartTime
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod> r2 = r0.previewPeriodConfig
            if (r2 != 0) goto L20
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L20:
            java.lang.Object r0 = r3.l2
            X.2sW r0 = (X.C72242sW) r0
            long r0 = r0.element
            r6.getClass()
            X.UD4 r17 = new X.UD4
            r21 = r0
            r19 = r4
            r18 = r2
            r17.<init>(r18, r19, r21)
            java.lang.Object r1 = r3.l3
            com.bytedance.android.live.liveinteract.multimatch.speedchallenge.viewmodel.MatchSpeedChallengeVM r1 = (com.bytedance.android.live.liveinteract.multimatch.speedchallenge.viewmodel.MatchSpeedChallengeVM) r1
            java.lang.Object r0 = r3.l1
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig r0 = (com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig) r0
            com.bytedance.android.livesdkapi.depend.model.live.match.TaskPeriodConfig r0 = r0.taskPeriodConfig
            r15 = 0
            if (r0 == 0) goto L96
            int r0 = r0.targetType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L47:
            r1.getClass()
            r1 = 1
            if (r2 != 0) goto L73
        L4d:
            java.lang.String r12 = ""
        L4f:
            java.lang.Object r0 = r3.l1
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig r0 = (com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig) r0
            com.bytedance.android.livesdkapi.depend.model.live.match.TaskPeriodConfig r0 = r0.taskPeriodConfig
            if (r0 == 0) goto L6f
            int r13 = r0.targetType
            int r11 = r0.promptType
            int r14 = r0.clickAction
            com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt r15 = r0.clickToastPrompt
        L5f:
            r8 = 0
            r9 = 0
            r20 = 1667(0x683, float:2.336E-42)
            r16 = r8
            r18 = r8
            r19 = r8
            X.UCy r0 = X.C76820UCy.LIZIZ(r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        L6f:
            r13 = 0
            r11 = 1
            r14 = 0
            goto L5f
        L73:
            int r0 = r2.intValue()
            if (r0 != r1) goto L7c
        L79:
            java.lang.String r12 = "SEND_GIFT_COUNT"
            goto L4f
        L7c:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L84
            goto L79
        L84:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L8e
        L8b:
            java.lang.String r12 = "SEND_GIFT_AMOUNT"
            goto L4f
        L8e:
            int r1 = r2.intValue()
            r0 = 4
            if (r1 != r0) goto L4d
            goto L8b
        L96:
            r2 = r15
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS58S0400000_13.invoke$3(kotlin.jvm.internal.AqS58S0400000_13, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AqS58S0400000_13 aqS58S0400000_13, Object obj) {
        String str;
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        C74987Tbr.LIZJ("anchor_shared_bg", "show quick apply dialog, download image success");
        LiveEffect liveEffect = (LiveEffect) aqS58S0400000_13.l0;
        if (downloadInfo != null) {
            str = downloadInfo.getTargetFilePath();
        } else {
            str = null;
        }
        liveEffect.shareImagePath = str;
        ((IEffectService) CN1.LIZ(IEffectService.class)).removeSoloBgEffect((DataChannel) aqS58S0400000_13.l1);
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) aqS58S0400000_13.l2;
        multiGuestSharedBgAnchorViewModel.iv0((LiveEffect) aqS58S0400000_13.l0, new AqS102S0300000_13(multiGuestSharedBgAnchorViewModel, (Context) aqS58S0400000_13.l3, (DataChannel) aqS58S0400000_13.l1, 5), new AqS102S0300000_13((MultiGuestSharedBgAnchorViewModel) aqS58S0400000_13.l2, (Context) aqS58S0400000_13.l3, (DataChannel) aqS58S0400000_13.l1, 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS58S0400000_13 aqS58S0400000_13, Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue != 0) {
            LinkMicMultiGuestV3BackgroundFixSetting linkMicMultiGuestV3BackgroundFixSetting = LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE;
            if (!linkMicMultiGuestV3BackgroundFixSetting.getValue()) {
                String LIZLLL = C74770TWc.LIZLLL();
                StringBuilder LJ = C7MY.LJ("checkDeviceAndPluginForVoiceChat, multiLiveType: ", intValue, ", fixSetting: ");
                LJ.append(linkMicMultiGuestV3BackgroundFixSetting.getValue());
                C32014ChO.LIZJ(LIZLLL, X1D.LIZIZ(LJ), null);
                Activity activity = (Activity) aqS58S0400000_13.l0;
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS58S0400000_13.l2;
                EnumC30836C8i.LiveResource.checkInstall(activity, "interact", new C75068TdA(intValue, (InterfaceC65784Pro) aqS58S0400000_13.l3, interfaceC88472Yns));
                return C76800UCe.LIZ;
            }
        }
        String LIZLLL2 = C74770TWc.LIZLLL();
        StringBuilder LJ2 = C7MY.LJ("checkBluetoothPermission, multiLiveType: ", intValue, ", fixSetting: ");
        LJ2.append(LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue());
        C32014ChO.LIZJ(LIZLLL2, X1D.LIZIZ(LJ2), null);
        Activity activity2 = (Activity) aqS58S0400000_13.l0;
        UDE.LIZ(activity2, (DataChannel) aqS58S0400000_13.l1, new AqS40S0301000_13(activity2, (Activity) intValue, (int) aqS58S0400000_13.l2, (InterfaceC88472Yns<? super Integer, C76800UCe>) aqS58S0400000_13.l3, (InterfaceC65784Pro<C76800UCe>) 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS58S0400000_13 aqS58S0400000_13, Object obj) {
        String path = (String) obj;
        o.LJIIIZ(path, "path");
        ((C78194UmU) aqS58S0400000_13.l0).LJFF = path;
        ((C78161Ulx) aqS58S0400000_13.l1).LIZLLL(true, null);
        C78185UmL c78185UmL = (C78185UmL) aqS58S0400000_13.l2;
        C78194UmU c78194UmU = (C78194UmU) aqS58S0400000_13.l0;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS58S0400000_13.l3;
        C77380UYm c77380UYm = c78185UmL.LIZJ;
        if (c77380UYm == null) {
            interfaceC88472Yns.invoke(c78194UmU);
        } else {
            c77380UYm.LIZ(new AqS144S0200000_13(c78194UmU, (C78194UmU) interfaceC88472Yns, (InterfaceC88472Yns<? super C78194UmU, C76800UCe>) 35), new AqS144S0200000_13(c78194UmU, (C78194UmU) interfaceC88472Yns, (InterfaceC88472Yns<? super C78194UmU, C76800UCe>) 36));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS58S0400000_13 aqS58S0400000_13, Object obj) {
        boolean z;
        ChangeStateResp changeStateResp = (ChangeStateResp) obj;
        InterfaceC75817TpF interfaceC75817TpF = ((C75813TpB) aqS58S0400000_13.l0).LJLIL;
        int i = ((ChangeStateReq) aqS58S0400000_13.l1).stateType;
        int i2 = 0;
        if (changeStateResp != null && changeStateResp.result == 1) {
            z = true;
        } else {
            z = false;
        }
        interfaceC75817TpF.kl(i, z);
        ((C75813TpB) aqS58S0400000_13.l0).LJLIL.ZI(2, (ChangeStateReq) aqS58S0400000_13.l1);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS58S0400000_13.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
        int i3 = ((ChangeStateReq) aqS58S0400000_13.l1).stateType;
        R2P r2p = (R2P) aqS58S0400000_13.l3;
        if (r2p != null) {
            i2 = r2p.statusCode;
        }
        C75808Tp6.LIZIZ(i3, 1, i2, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS58S0400000_13 aqS58S0400000_13, Object obj) {
        C75814TpC callOnStateUpdate = (C75814TpC) obj;
        o.LJIIIZ(callOnStateUpdate, "$this$callOnStateUpdate");
        return ((C75813TpB) aqS58S0400000_13.l0).LIZIZ(callOnStateUpdate, (ChangeStateReq) aqS58S0400000_13.l1, (C75814TpC) aqS58S0400000_13.l2, (Throwable) aqS58S0400000_13.l3);
    }

    public static final Object invoke$9(AqS58S0400000_13 aqS58S0400000_13, Object obj) {
        C75814TpC callOnStateUpdate = (C75814TpC) obj;
        o.LJIIIZ(callOnStateUpdate, "$this$callOnStateUpdate");
        return ((C75813TpB) aqS58S0400000_13.l0).LIZIZ(callOnStateUpdate, (ChangeStateReq) aqS58S0400000_13.l1, (C75814TpC) aqS58S0400000_13.l2, (Throwable) aqS58S0400000_13.l3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS58S0400000_13(C76732zl c76732zl, C76732zl c76732zl2, Map<C32449CoP, C78183UmJ> map, C32449CoP c32449CoP, C78184UmK c78184UmK) {
        super(1);
        this.$t = c78184UmK;
        this.l0 = c76732zl;
        this.l1 = c76732zl2;
        this.l2 = map;
        this.l3 = c32449CoP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS58S0400000_13(C34K c34k, C34K c34k2, BattleItem4FEModel battleItem4FEModel, BattleItem4FEModel battleItem4FEModel2, C68322mC<ItemInfo4FE> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = c34k;
        this.l1 = c34k2;
        this.l2 = battleItem4FEModel;
        this.l3 = battleItem4FEModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0400000_13(C75813TpB c75813TpB, ChangeStateReq changeStateReq, C75814TpC c75814TpC, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.l0 = c75813TpB;
        this.l1 = changeStateReq;
        this.l2 = c75814TpC;
        this.l3 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS58S0400000_13(C75813TpB c75813TpB, C75813TpB c75813TpB2, ChangeStateReq changeStateReq, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, R2P<ChangeStateResp> r2p) {
        super(1);
        this.$t = r2p;
        this.l0 = c75813TpB;
        this.l1 = c75813TpB2;
        this.l2 = changeStateReq;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0400000_13(U8Q u8q, Region region, RectF rectF, InterfaceC75807Tp5 interfaceC75807Tp5, int i) {
        super(1);
        this.$t = i;
        this.l0 = u8q;
        this.l1 = region;
        this.l2 = rectF;
        this.l3 = interfaceC75807Tp5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0400000_13(C76820UCy c76820UCy, BattleBonusConfig battleBonusConfig, C72242sW c72242sW, MatchSpeedChallengeVM matchSpeedChallengeVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = c76820UCy;
        this.l1 = battleBonusConfig;
        this.l2 = c72242sW;
        this.l3 = matchSpeedChallengeVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0400000_13(C78194UmU c78194UmU, C78161Ulx c78161Ulx, C78185UmL c78185UmL, AqS144S0200000_13 aqS144S0200000_13, int i) {
        super(1);
        this.$t = i;
        this.l0 = c78194UmU;
        this.l1 = c78161Ulx;
        this.l2 = c78185UmL;
        this.l3 = aqS144S0200000_13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0400000_13(Activity activity, DataChannel dataChannel, InterfaceC88472Yns interfaceC88472Yns, AqS163S0100000_13 aqS163S0100000_13, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = dataChannel;
        this.l2 = interfaceC88472Yns;
        this.l3 = aqS163S0100000_13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0400000_13(BattleItem4FEModel battleItem4FEModel, BattleItem4FEModel battleItem4FEModel2, BattleItem4FEModel battleItem4FEModel3, BattleItem4FEModel battleItem4FEModel4, int i) {
        super(1);
        this.$t = i;
        this.l0 = battleItem4FEModel;
        this.l1 = battleItem4FEModel2;
        this.l2 = battleItem4FEModel3;
        this.l3 = battleItem4FEModel4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0400000_13(LiveEffect liveEffect, DataChannel dataChannel, MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveEffect;
        this.l1 = dataChannel;
        this.l2 = multiGuestSharedBgAnchorViewModel;
        this.l3 = context;
    }
}
