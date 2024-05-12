package Y;

import X.AR4;
import X.ARN;
import X.C145995oB;
import X.C16880lQ;
import X.C43870HJq;
import X.C43873HJt;
import X.C44018HPi;
import X.C44108HSu;
import X.C44172HVg;
import X.C45928I0u;
import X.C46143I9b;
import X.C5NP;
import X.C73340SqO;
import X.C76800UCe;
import X.C82891Wg3;
import X.F9J;
import X.FMX;
import X.HYN;
import X.IDP;
import X.InterfaceC40961G5t;
import X.InterfaceC43874HJu;
import X.InterfaceC45932I0y;
import X.InterfaceC83865Wvl;
import X.InterfaceC88472Yns;
import X.NN1;
import X.OJY;
import X.WX6;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS123S0200000_7 implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS123S0200000_7 aObjectS123S0200000_7, Object obj) {
        IDP idp = (IDP) aObjectS123S0200000_7.l0;
        idp.LJJLIIIJLLLLLLLZ(0, (Aweme) aObjectS123S0200000_7.l1);
        OJY LJIL = C73340SqO.LJIL();
        Context LJJIIZ = idp.LJJIIZ();
        LJIL.getClass();
        NN1.LJJIJ(LJJIIZ, (Aweme) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS123S0200000_7 aObjectS123S0200000_7, Object obj) {
        String str;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS123S0200000_7.l0;
        InterfaceC40961G5t interfaceC40961G5t = (InterfaceC40961G5t) aObjectS123S0200000_7.l1;
        videoPublishContainerScene.getClass();
        ((AR4) obj).LIZIZ = true;
        videoPublishContainerScene.LLILZLL.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType = 1;
        interfaceC40961G5t.LIZIZ();
        C145995oB c145995oB = new C145995oB();
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
        String str2 = "mModel is null";
        if (videoPublishEditModel == null) {
            str = "mModel is null";
        } else {
            str = videoPublishEditModel.getCreationId();
        }
        c145995oB.LJI("creation_id", str);
        c145995oB.LJI("content_type", videoPublishContainerScene.LLLLIILLL());
        c145995oB.LJI("content_source", videoPublishContainerScene.LLILZLL.getAvetParameter().getContentSource());
        c145995oB.LIZ(1, "action_type");
        FMX.LJIIL("aigc_toggle", c145995oB.LIZ);
        C145995oB c145995oB2 = new C145995oB();
        VideoPublishEditModel videoPublishEditModel2 = videoPublishContainerScene.LLILZLL;
        if (videoPublishEditModel2 != null) {
            str2 = videoPublishEditModel2.getCreationId();
        }
        c145995oB2.LJI("creation_id", str2);
        c145995oB2.LJI("content_type", videoPublishContainerScene.LLLLIILLL());
        c145995oB2.LJI("content_source", videoPublishContainerScene.LLILZLL.getAvetParameter().getContentSource());
        c145995oB2.LJI("exit_method", "OK");
        FMX.LJIIL("dismiss_aigc_pop_up", c145995oB2.LIZ);
        return null;
    }

    public static final Object invoke$2(AObjectS123S0200000_7 aObjectS123S0200000_7, Object obj) {
        boolean z;
        Intent intent = (Intent) aObjectS123S0200000_7.l0;
        Activity activity = (Activity) aObjectS123S0200000_7.l1;
        List list = (List) obj;
        if (TextUtils.equals(C16880lQ.LLJJIJIIJIL(intent, "enter_from"), "from_duet_mode")) {
            intent.putExtra("duet_mode", true);
            intent.addFlags(67108864);
        }
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            z = true;
        } else {
            z = false;
        }
        C44108HSu.LJII(4, C44018HPi.LIZJ, C44018HPi.LIZIZ, z, intent, null);
        C44018HPi.LJFF(activity, intent, list);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AObjectS123S0200000_7 aObjectS123S0200000_7, Object obj) {
        C46143I9b c46143I9b = (C46143I9b) aObjectS123S0200000_7.l0;
        c46143I9b.LIZ.runOnUiThread(new ARunnableS18S0300000_7(c46143I9b, (Integer) obj, (HYN) aObjectS123S0200000_7.l1, 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AObjectS123S0200000_7 aObjectS123S0200000_7, Object eventArgs) {
        o.LJIIIZ(eventArgs, "eventArgs");
        ((C45928I0u) aObjectS123S0200000_7.l0).hidePanel();
        ((C45928I0u) aObjectS123S0200000_7.l0).LJJLI();
        ((C45928I0u) aObjectS123S0200000_7.l0).Ka();
        C45928I0u c45928I0u = (C45928I0u) aObjectS123S0200000_7.l0;
        c45928I0u.LLIZ.commentVideoModel = null;
        InterfaceC45932I0y recordQaStickerApi = c45928I0u.getRecordQaStickerApi();
        if (recordQaStickerApi != null) {
            recordQaStickerApi.I4((QaStruct) aObjectS123S0200000_7.l1);
        }
        ((C45928I0u) aObjectS123S0200000_7.l0).LJZI((QaStruct) aObjectS123S0200000_7.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AObjectS123S0200000_7 aObjectS123S0200000_7, Object obj) {
        MvThemeData mvThemeData = (MvThemeData) aObjectS123S0200000_7.l0;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) aObjectS123S0200000_7.l1;
        ARN arn = (ARN) obj;
        String key = mvThemeData.effect.getId();
        o.LJIIIZ(key, "key");
        SharedPreferences.Editor edit = F9J.LIZIZ(C44172HVg.LIZ, 0, "mv_template").edit();
        edit.putBoolean(key, true);
        WX6.LIZ(edit);
        if (onClickListener != null) {
            onClickListener.onClick(arn.LIZ(), arn.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AObjectS123S0200000_7 aObjectS123S0200000_7, Object obj) {
        C43870HJq c43870HJq = (C43870HJq) aObjectS123S0200000_7.l0;
        InterfaceC43874HJu interfaceC43874HJu = (InterfaceC43874HJu) aObjectS123S0200000_7.l1;
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        c43870HJq.getClass();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraVideoRecorder concatWithReleaseGPUResource concatAsync result ");
        LIZ.append(recorderConcatResult.ret);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        String str = recorderConcatResult.videoPath;
        String str2 = recorderConcatResult.audioPath;
        int i = recorderConcatResult.ret;
        InterfaceC83865Wvl interfaceC83865Wvl = c43870HJq.LJ;
        if (interfaceC83865Wvl != null) {
            interfaceC83865Wvl.c9(new C43873HJt(c43870HJq, interfaceC43874HJu, str, str2, i));
        }
        return C76800UCe.LIZ;
    }

    public AObjectS123S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
