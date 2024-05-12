package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C142535ib;
import X.C149705uA;
import X.C166866gk;
import X.C59722Wa;
import X.C68322mC;
import X.C6ES;
import X.C76800UCe;
import X.C78983UzD;
import X.GWN;
import X.H7R;
import X.InterfaceC149745uE;
import X.InterfaceC166046fQ;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* loaded from: classes3.dex */
public class AqS4S1301000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS4S1301000_2 aqS4S1301000_2) {
        ((C166866gk) aqS4S1301000_2.l1).LIZIZ();
        ((InterfaceC166046fQ) aqS4S1301000_2.l2).LIZJ(aqS4S1301000_2.s0, aqS4S1301000_2.i4, (C59722Wa) aqS4S1301000_2.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS4S1301000_2 aqS4S1301000_2) {
        ((C166866gk) aqS4S1301000_2.l1).LIZIZ();
        ((InterfaceC166046fQ) aqS4S1301000_2.l2).LIZLLL(aqS4S1301000_2.i4, aqS4S1301000_2.s0, (List) aqS4S1301000_2.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS4S1301000_2 aqS4S1301000_2) {
        ((C149705uA) aqS4S1301000_2.l1).LJJLIIJ(aqS4S1301000_2.i4, (C166866gk) aqS4S1301000_2.l2, (InterfaceC149745uE) aqS4S1301000_2.l3, aqS4S1301000_2.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS4S1301000_2 aqS4S1301000_2) {
        DialogFragment dialogFragment = (DialogFragment) ((C68322mC) aqS4S1301000_2.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS4S1301000_2.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(0);
        }
        String creationId = ((VideoPublishEditModel) aqS4S1301000_2.l3).getCreationId();
        o.LJIIIIZZ(creationId, "videoPublishEditModel.creationId");
        String str = ((VideoPublishEditModel) aqS4S1301000_2.l3).mShootWay;
        o.LJIIIIZZ(str, "videoPublishEditModel.mShootWay");
        String str2 = aqS4S1301000_2.s0;
        String LJIIIZ = H7R.LJIIIZ((VideoPublishEditModel) aqS4S1301000_2.l3);
        String LJIIIIZZ = H7R.LJIIIIZZ((VideoPublishEditModel) aqS4S1301000_2.l3);
        C6ES.LIZIZ(aqS4S1301000_2.i4, ((VideoPublishEditModel) aqS4S1301000_2.l3).getVideoLength(), ((VideoPublishEditModel) aqS4S1301000_2.l3).creativeModel.audioCopyrightDetectModel.getHasMusicReplaced() ? 1 : 0, C78983UzD.LJJJJJL((VideoPublishEditModel) aqS4S1301000_2.l3) ? 1 : 0, creationId, str, str2, LJIIIZ, LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AqS4S1301000_2 aqS4S1301000_2) {
        DialogFragment dialogFragment = (DialogFragment) ((C68322mC) aqS4S1301000_2.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS4S1301000_2.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(0);
        }
        String creationId = ((VideoPublishEditModel) aqS4S1301000_2.l3).getCreationId();
        o.LJIIIIZZ(creationId, "videoPublishEditModel.creationId");
        String str = ((VideoPublishEditModel) aqS4S1301000_2.l3).mShootWay;
        o.LJIIIIZZ(str, "videoPublishEditModel.mShootWay");
        String str2 = aqS4S1301000_2.s0;
        String LJIIIZ = H7R.LJIIIZ((VideoPublishEditModel) aqS4S1301000_2.l3);
        String LJIIIIZZ = H7R.LJIIIIZZ((VideoPublishEditModel) aqS4S1301000_2.l3);
        C6ES.LIZIZ(aqS4S1301000_2.i4, ((VideoPublishEditModel) aqS4S1301000_2.l3).getVideoLength(), ((VideoPublishEditModel) aqS4S1301000_2.l3).creativeModel.audioCopyrightDetectModel.getHasMusicReplaced() ? 1 : 0, C78983UzD.LJJJJJL((VideoPublishEditModel) aqS4S1301000_2.l3) ? 1 : 0, creationId, str, str2, LJIIIZ, LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AqS4S1301000_2 aqS4S1301000_2) {
        DialogFragment dialogFragment = (DialogFragment) ((C68322mC) aqS4S1301000_2.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS4S1301000_2.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(0);
        }
        String creationId = ((VideoPublishEditModel) aqS4S1301000_2.l3).getCreationId();
        o.LJIIIIZZ(creationId, "videoPublishEditModel.creationId");
        String str = ((VideoPublishEditModel) aqS4S1301000_2.l3).mShootWay;
        o.LJIIIIZZ(str, "videoPublishEditModel.mShootWay");
        String str2 = aqS4S1301000_2.s0;
        String LJIIIZ = H7R.LJIIIZ((VideoPublishEditModel) aqS4S1301000_2.l3);
        String LJIIIIZZ = H7R.LJIIIIZZ((VideoPublishEditModel) aqS4S1301000_2.l3);
        C6ES.LIZIZ(aqS4S1301000_2.i4, ((VideoPublishEditModel) aqS4S1301000_2.l3).getVideoLength(), ((VideoPublishEditModel) aqS4S1301000_2.l3).creativeModel.audioCopyrightDetectModel.getHasMusicReplaced() ? 1 : 0, C78983UzD.LJJJJJL((VideoPublishEditModel) aqS4S1301000_2.l3) ? 1 : 0, creationId, str, str2, LJIIIZ, LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r5 != null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AqS4S1301000_2 r9) {
        /*
            java.lang.Object r8 = r9.l1
            X.GWN r8 = (X.GWN) r8
            java.lang.Object r5 = r9.l2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r5
            java.lang.String r2 = r9.s0
            int r4 = r9.i4
            java.lang.Object r6 = r9.l3
            X.Yns r6 = (X.InterfaceC88472Yns) r6
            r8.getClass()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "saveCheckPoint creationId: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C143195jf.LIZ(r0)
            r7 = 0
            r2 = 1
            if (r5 == 0) goto L50
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.creative.model.CheckPointModel r0 = r0.checkPointModel
            if (r0 == 0) goto L39
            boolean r0 = r0.enableCheckPoint
            if (r0 != 0) goto L39
        L36:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L39:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
            if (r0 == 0) goto L50
            boolean r0 = r0.isDraft
            if (r0 != r2) goto L50
            boolean r0 = X.C41647GWd.LIZ()
            if (r0 == 0) goto L36
            boolean r0 = r5.isFromRestoreRecover
            if (r0 != 0) goto L50
            goto L36
        L50:
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "creative_restore_work_phase_two"
            int r0 = X.C00F.LIZ(r1, r7, r0, r2)
            r3 = 3
            if (r0 >= r3) goto L6e
            r0 = 1
        L5c:
            r2 = r2 ^ r0
            if (r5 == 0) goto L66
            boolean r0 = r8.LJ(r5)
            if (r0 != 0) goto L66
            r7 = 1
        L66:
            if (r2 != 0) goto L6a
            if (r7 == 0) goto L70
        L6a:
            X.HB4.LJ(r3)
            goto L36
        L6e:
            r0 = 0
            goto L5c
        L70:
            r2 = 0
            if (r5 == 0) goto L91
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            if (r0 == 0) goto L83
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r1 = r0.draftInfoModel
            if (r1 != 0) goto L7e
        L7b:
            if (r5 == 0) goto L91
            goto L83
        L7e:
            java.lang.String r0 = "silence"
            r1.saveDraftScene = r0
            goto L7b
        L83:
            X.XIF r0 = X.C150985wE.LIZ     // Catch: java.lang.Throwable -> L36
            X.2gm r1 = X.C48841JEv.LIZ(r0)     // Catch: java.lang.Throwable -> L36
            X.5tF r0 = new X.5tF     // Catch: java.lang.Throwable -> L36
            r0.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> L36
            X.XKX.LIZLLL(r1, r2, r2, r0, r3)     // Catch: java.lang.Throwable -> L36
        L91:
            X.HB4.LJ(r4)     // Catch: java.lang.Throwable -> L36
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS4S1301000_2.invoke$6(kotlin.jvm.internal.AqS4S1301000_2):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S1301000_2(int i, InterfaceC166046fQ interfaceC166046fQ, C166866gk c166866gk, String str, List list, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c166866gk;
        this.l2 = interfaceC166046fQ;
        this.s0 = str;
        this.i4 = i;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS4S1301000_2(C68322mC c68322mC, C68322mC<TuxSheet> c68322mC2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, VideoPublishEditModel videoPublishEditModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c68322mC;
        this.l2 = c68322mC2;
        this.l3 = interfaceC88472Yns;
        this.s0 = videoPublishEditModel;
        this.i4 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S1301000_2(C149705uA c149705uA, int i, C166866gk c166866gk, InterfaceC149745uE interfaceC149745uE, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c149705uA;
        this.i4 = i;
        this.l2 = c166866gk;
        this.l3 = interfaceC149745uE;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S1301000_2(C166866gk c166866gk, InterfaceC166046fQ interfaceC166046fQ, String str, int i, C59722Wa c59722Wa, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c166866gk;
        this.l2 = interfaceC166046fQ;
        this.s0 = str;
        this.i4 = i;
        this.l3 = c59722Wa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS4S1301000_2(GWN gwn, GWN gwn2, VideoPublishEditModel videoPublishEditModel, String str, int i, InterfaceC88472Yns<? super C142535ib, C76800UCe> interfaceC88472Yns) {
        super(0);
        this.$t = interfaceC88472Yns;
        this.l1 = gwn;
        this.l2 = gwn2;
        this.s0 = videoPublishEditModel;
        this.i4 = str;
        this.l3 = i;
    }
}
