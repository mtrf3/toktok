package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractDialogInterfaceC26236ARk;
import X.C188727au;
import X.C25859ACx;
import X.C3C5;
import X.C76800UCe;
import X.C77334UWs;
import X.FMX;
import X.InterfaceC88472Yns;
import X.LA5;
import X.U7U;
import X.UB9;
import X.UH5;
import X.UH6;
import X.UH9;
import X.URV;
import X.UTS;
import X.UTT;
import X.XJL;
import X.XKS;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestCameraRevertFixSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;

/* loaded from: classes14.dex */
public class AqS66S1100000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS66S1100000_13 aqS66S1100000_13, Object it) {
        o.LJIIIZ(it, "it");
        new URV(((RelationAuthDialogControl) aqS66S1100000_13.l1).LIZ(), aqS66S1100000_13.s0, (Integer) ((RelationAuthDialogControl) aqS66S1100000_13.l1).LJLJLLL.getValue()).LIZLLL(null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS66S1100000_13 aqS66S1100000_13, Object it) {
        o.LJIIIZ(it, "it");
        ((C77334UWs) aqS66S1100000_13.l1).getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("toast_type", "clean_app");
        FMX.LJIIL("storage_toast_cancel", c188727au.LIZ);
        C77334UWs.LIZ((C77334UWs) aqS66S1100000_13.l1, "not_now", aqS66S1100000_13.s0, null, 4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS66S1100000_13 aqS66S1100000_13, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        o.LJIIIZ(sparkContext, "sparkContext");
        sparkContext.LJJI(new UH6((UH9) aqS66S1100000_13.l1, aqS66S1100000_13.s0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS66S1100000_13 aqS66S1100000_13, Object obj) {
        AbstractDialogInterfaceC26236ARk it = (AbstractDialogInterfaceC26236ARk) obj;
        o.LJIIIZ(it, "it");
        Object obj2 = it.LJLJL;
        if (o.LJ(obj2, 0)) {
            UTS.LIZ(aqS66S1100000_13.s0, LA5.LIZJ.getInt("email_dialog_show_times", 0) + 1, UTT.OK);
            if (((XJL) aqS66S1100000_13.l1).isActive()) {
                XJL xjl = (XJL) aqS66S1100000_13.l1;
                Boolean bool = Boolean.TRUE;
                C3C5.m7constructorimpl(bool);
                xjl.resumeWith(bool);
            }
        } else if (o.LJ(obj2, 1)) {
            UTS.LIZ(aqS66S1100000_13.s0, LA5.LIZJ.getInt("email_dialog_show_times", 0) + 1, UTT.NOT_NOW);
            if (((XJL) aqS66S1100000_13.l1).isActive()) {
                XJL xjl2 = (XJL) aqS66S1100000_13.l1;
                Boolean bool2 = Boolean.FALSE;
                C3C5.m7constructorimpl(bool2);
                xjl2.resumeWith(bool2);
            }
        } else if (obj2 == null) {
            UTS.LIZ(aqS66S1100000_13.s0, LA5.LIZJ.getInt("email_dialog_show_times", 0) + 1, UTT.DISMISS);
            if (((XJL) aqS66S1100000_13.l1).isActive()) {
                XJL xjl3 = (XJL) aqS66S1100000_13.l1;
                Boolean bool3 = Boolean.FALSE;
                C3C5.m7constructorimpl(bool3);
                xjl3.resumeWith(bool3);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS66S1100000_13 aqS66S1100000_13, Object obj) {
        C25859ACx it = (C25859ACx) obj;
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(it, null, null, false, (View) aqS66S1100000_13.l1, null, false, false, aqS66S1100000_13.s0, false, false, false, false, 8384479);
    }

    public static final Object invoke$5(AqS66S1100000_13 aqS66S1100000_13, Object obj) {
        ILiveStream iLiveStream;
        Bitmap bitmap = (Bitmap) obj;
        o.LJIIIZ(bitmap, "bitmap");
        UB9 ub9 = ((U7U) aqS66S1100000_13.l1).LJIJ;
        if (ub9 != null) {
            iLiveStream = ub9.getLiveCore();
        } else {
            iLiveStream = null;
        }
        if (iLiveStream instanceof LiveCore) {
            U7U u7u = (U7U) aqS66S1100000_13.l1;
            LiveCore liveCore = (LiveCore) iLiveStream;
            try {
                u7u.LJJIJIL(aqS66S1100000_13.s0);
                if (!MultiGuestCameraRevertFixSetting.INSTANCE.isFix() || !u7u.LJJIIJ()) {
                    liveCore.getBuilder().setVideoCaptureDevice(5);
                }
                liveCore.setBackGroundPhotoPath(bitmap);
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            } catch (Exception unused) {
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1100000_13(U7U u7u, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = u7u;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1100000_13(UH5 uh5, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = uh5;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1100000_13(C77334UWs c77334UWs, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c77334UWs;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1100000_13(View view, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = view;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1100000_13(RelationAuthDialogControl relationAuthDialogControl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = relationAuthDialogControl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1100000_13(String str, XKS xks, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = xks;
    }
}
