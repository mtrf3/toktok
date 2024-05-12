package Y;

import X.AbstractC44912Hjw;
import X.C00F;
import X.C0A2;
import X.C10K;
import X.C268613q;
import X.C2U8;
import X.C41641GVx;
import X.C42034Gec;
import X.C42041Gej;
import X.C42499Gm7;
import X.C42898GsY;
import X.C43199GxP;
import X.C43203GxT;
import X.C43206GxW;
import X.C43213Gxd;
import X.C43356Gzw;
import X.C43619H9z;
import X.C43976HNs;
import X.C44018HPi;
import X.C44436HcG;
import X.C44453HcX;
import X.C44913Hjx;
import X.C45804HyK;
import X.C46143I9b;
import X.C5NP;
import X.C60903NvH;
import X.C78496UrM;
import X.C78915Uy7;
import X.C82890Wg2;
import X.C82891Wg3;
import X.CallableC42192GhA;
import X.GUQ;
import X.GUX;
import X.GVX;
import X.GW2;
import X.GW6;
import X.HA3;
import X.HA4;
import X.HA6;
import X.HAA;
import X.HWG;
import X.HWH;
import X.HWK;
import X.HYF;
import X.HYN;
import X.I9L;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.KL2;
import X.KMP;
import X.ProgressDialogC43239Gy3;
import X.TMB;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.ParallelPublishDialogFragment;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.vesdk.VEMediaParser;
import com.zhiliaoapp.musically.R;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public class ARunnableS18S0300000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        float f;
        Integer valueOf = Integer.valueOf(((C43976HNs) this.l0).itemView.getWidth());
        MyMediaModel myMediaModel = (MyMediaModel) this.l1;
        int intValue = valueOf.intValue();
        if (intValue > 0 && myMediaModel.width > intValue) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = ((C43976HNs) this.l0).itemView.getWidth() / valueOf.intValue();
        } else {
            f = 1.0f;
        }
        try {
            C10K.LIZIZ(new CallableC42192GhA((VEMediaParser) this.l2, (MyMediaModel) this.l1, (int) (r4.width * f), (int) (r4.height * f)), C10K.LJI, null).LJ(new AgS110S0200000_7((C43976HNs) this.l0, (VEMediaParser) this.l2, 0), C10K.LJIIIIZZ, null);
        } catch (Exception unused) {
        }
    }

    public final void LIZ$1() {
        Context context;
        boolean[] zArr = (boolean[]) this.l0;
        if (zArr != null && zArr[0] && (context = (Context) this.l1) != null) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (((ProgressDialogC43239Gy3[]) this.l2) != null && LJIJJ != null && !LJIJJ.isFinishing()) {
                ((ProgressDialogC43239Gy3[]) this.l2)[0] = C42034Gec.LIZIZ((Context) this.l1);
                ((ProgressDialogC43239Gy3[]) this.l2)[0].setMessage(((Context) this.l1).getResources().getString(R.string.rjz));
                C44018HPi.LJII(1503, true);
            }
        }
    }

    public final void LIZ$2() {
        if (((VoiceConversionRecordService) this.l0).LIZJ && !((Activity) this.l1).isFinishing()) {
            VoiceConversionRecordService voiceConversionRecordService = (VoiceConversionRecordService) this.l0;
            voiceConversionRecordService.LIZ = HWG.LIZIZ((Activity) this.l1, HWK.VISIBLE, new C44453HcX(voiceConversionRecordService, (MusicModel) this.l2));
            HWH hwh = ((VoiceConversionRecordService) this.l0).LIZ;
            if (hwh != null) {
                hwh.setMessage(((Activity) this.l1).getString(R.string.rjz));
            }
        }
    }

    public final void LIZ$3() {
        C43213Gxd c43213Gxd = (C43213Gxd) this.l0;
        Activity activity = (Activity) this.l1;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l2;
        c43213Gxd.getClass();
        String outputFile = videoPublishEditModel.getOutputFile();
        long LIZ = C78496UrM.LIZ(outputFile);
        try {
            Uri LJFF = C268613q.LJFF(activity, new SimpleDateFormat("yyyyMMdd_HHmmssSS", Locale.US).format(new Date()));
            if (LJFF != null) {
                c43213Gxd.LIZ(activity, videoPublishEditModel, new FileInputStream(outputFile), activity.getContentResolver().openOutputStream(LJFF, "w"), LIZ);
            }
        } catch (Exception unused) {
            c43213Gxd.LIZIZ.getClass();
            C43199GxP.LIZ(videoPublishEditModel);
        }
    }

    public final void LIZ$4() {
        if (C43213Gxd.LIZLLL) {
            Activity activity = (Activity) this.l0;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.acrossActivities(true);
            creativeToastBuilder.icon(R.raw.icon_tick_fill_small);
            creativeToastBuilder.iconColorRes(R.attr.e8);
            creativeToastBuilder.messageRes(R.string.ho1);
            C78915Uy7.LJJIIZI(activity, 5003, creativeToastBuilder);
        } else {
            C43199GxP c43199GxP = (C43199GxP) this.l1;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l2;
            C43206GxW.LIZIZ = 4;
            C43206GxW.LIZJ = 0;
            C43206GxW.LIZLLL = videoPublishEditModel;
            c43199GxP.getClass();
            C2U8.LIZ(new C43203GxT());
        }
        C43213Gxd.LIZJ = false;
    }

    public final void LIZ$5() {
        int i;
        HA3 ha3;
        boolean z = true;
        ((HAA) this.l0).LIZLLL = true;
        C43619H9z c43619H9z = (C43619H9z) this.l1;
        if (c43619H9z != null) {
            int i2 = c43619H9z.LJIIJJI;
            if (i2 != 1) {
                i = 4;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                i = 0;
                            } else {
                                i = 9;
                            }
                        } else {
                            i = 8;
                        }
                    } else {
                        i = 6;
                    }
                }
            } else {
                i = 2;
            }
            c43619H9z.LJIIIZ = i;
        }
        MvThemeData mvThemeData = ((HAA) this.l0).LJ;
        if (mvThemeData != null) {
            if (C00F.LIZ(31744, 0, "studio_photo_ai_music_optimization", true) != 2) {
                z = false;
            }
            if (z && (ha3 = ((HAA) this.l0).LIZJ) != null) {
                HA4 LLILII = ha3.LLILII();
                if (LLILII.LIZ()) {
                    HA6 ha6 = (HA6) this.l2;
                    if (ha6 != null) {
                        ha6.LIZ(mvThemeData, LLILII.LIZ, LLILII.LIZIZ, false, true);
                        return;
                    }
                    return;
                }
                HA6 ha62 = (HA6) this.l2;
                if (ha62 == null) {
                    return;
                }
                ha62.LIZ(mvThemeData, null, null, false, false);
                return;
            }
            HA6 ha63 = (HA6) this.l2;
            if (ha63 == null) {
                return;
            }
            ha63.LIZ(mvThemeData, null, null, false, false);
            return;
        }
        HA6 ha64 = (HA6) this.l2;
        if (ha64 == null) {
            return;
        }
        ha64.onFailed();
    }

    public static final void run$0(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            aRunnableS18S0300000_7.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            ((ImageView) aRunnableS18S0300000_7.l0).setImageBitmap((Bitmap) aRunnableS18S0300000_7.l1);
            C42499Gm7.LIZ((ImageView) aRunnableS18S0300000_7.l0, KL2.LIZJ(((GW6) aRunnableS18S0300000_7.l2).LJLIL, 2.0f));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            ((C42041Gej) aRunnableS18S0300000_7.l0).LJLLLL.LJ((C43356Gzw) aRunnableS18S0300000_7.l1);
            ((InterfaceC65784Pro) aRunnableS18S0300000_7.l2).invoke();
            ((C42041Gej) aRunnableS18S0300000_7.l0).LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            ((ParallelPublishDialogFragment) aRunnableS18S0300000_7.l0).LJLLILLLL.LJ((C43356Gzw) aRunnableS18S0300000_7.l1);
            ((InterfaceC65784Pro) aRunnableS18S0300000_7.l2).invoke();
            ((ParallelPublishDialogFragment) aRunnableS18S0300000_7.l0).wl();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            ((ParallelPublishDialogFragment) aRunnableS18S0300000_7.l0).LJLLILLLL.LJ((C43356Gzw) aRunnableS18S0300000_7.l1);
            ((InterfaceC65784Pro) aRunnableS18S0300000_7.l2).invoke();
            ((ParallelPublishDialogFragment) aRunnableS18S0300000_7.l0).wl();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            ((C42041Gej) aRunnableS18S0300000_7.l0).LJLLLL.LJ((C43356Gzw) aRunnableS18S0300000_7.l1);
            ((InterfaceC65784Pro) aRunnableS18S0300000_7.l2).invoke();
            ((C42041Gej) aRunnableS18S0300000_7.l0).LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            GVX.LJFF = true;
            C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZLLL(((GW2) aRunnableS18S0300000_7.l0).LIZ, (AwemeDraft) aRunnableS18S0300000_7.l1, (PublishFailureReason) aRunnableS18S0300000_7.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            GVX.LIZJ = true;
            C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZLLL(((GW2) aRunnableS18S0300000_7.l0).LIZ, (AwemeDraft) aRunnableS18S0300000_7.l1, (PublishFailureReason) aRunnableS18S0300000_7.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            ((ImageView) aRunnableS18S0300000_7.l0).setImageBitmap((Bitmap) aRunnableS18S0300000_7.l1);
            C42499Gm7.LIZ((ImageView) aRunnableS18S0300000_7.l0, KL2.LIZJ(((C41641GVx) aRunnableS18S0300000_7.l2).LJLIL, 2.0f));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            aRunnableS18S0300000_7.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            ((AbstractC44912Hjw) aRunnableS18S0300000_7.l0).LJII((Activity) aRunnableS18S0300000_7.l1, (C44913Hjx) aRunnableS18S0300000_7.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            ((LinearLayoutManager) ((C0A2) aRunnableS18S0300000_7.l1)).LJFF(((MixVideosDialog) aRunnableS18S0300000_7.l2).LJLL, (int) (KL2.LIZJ(r0.getContext(), 101.0f) * 1.5d));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            aRunnableS18S0300000_7.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        C46143I9b c46143I9b = (C46143I9b) aRunnableS18S0300000_7.l0;
        Integer num = (Integer) aRunnableS18S0300000_7.l1;
        HYN hyn = (HYN) aRunnableS18S0300000_7.l2;
        c46143I9b.getClass();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StartRecordingCommandEventHandlerFactory:startRecordWithResult:");
        LIZ.append(num);
        LIZLLL.d(X1D.LIZIZ(LIZ));
        if (num.intValue() == 0) {
            if (c46143I9b.LIZJ.Ue0().LIZ().booleanValue()) {
                return;
            }
            c46143I9b.LIZJ.LJLJJL(hyn);
            return;
        }
        int intValue = num.intValue();
        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("StartRecordingCommandEventHandlerFactory:onStartRecordFailed ");
        LIZ2.append(intValue);
        LIZLLL2.d(X1D.LIZIZ(LIZ2));
        c46143I9b.LIZJ.LJJLIIJ(new HYF(intValue));
        TMB.LIZIZ(C82890Wg2.LJFF, c46143I9b.LIZ, R.string.q6d).LIZ();
        I9L i9l = new I9L(KMP.LJ("start record failed, error code: ", intValue));
        i9l.LIZ = 1;
        c46143I9b.LIZJ.Ec0(i9l);
    }

    public static final void run$4(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            aRunnableS18S0300000_7.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            aRunnableS18S0300000_7.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            aRunnableS18S0300000_7.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            List list = (List) aRunnableS18S0300000_7.l0;
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aRunnableS18S0300000_7.l1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                interfaceC88472Yns.invoke((GUX) it.next());
            }
            ((InterfaceC88472Yns) aRunnableS18S0300000_7.l1).invoke(((GUQ) aRunnableS18S0300000_7.l2).LJLLL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            ((C44436HcG) aRunnableS18S0300000_7.l0).LJIIIIZZ((EffectListResponse) aRunnableS18S0300000_7.l1, (StringBuilder) aRunnableS18S0300000_7.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS18S0300000_7 aRunnableS18S0300000_7) {
        boolean LIZ;
        try {
            MutableLiveData<List<AnchorTransData>> updateAnchors = ((ExtensionMisc) aRunnableS18S0300000_7.l0).getExtensionDataRepo().getUpdateAnchors();
            C42898GsY c42898GsY = (C42898GsY) aRunnableS18S0300000_7.l1;
            ArrayList arrayList = (ArrayList) aRunnableS18S0300000_7.l2;
            c42898GsY.getClass();
            updateAnchors.setValue(C42898GsY.LIZJ(arrayList));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS18S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
