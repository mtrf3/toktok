package Y;

import X.C145995oB;
import X.C41485GPx;
import X.C55406Loo;
import X.C5V5;
import X.C68395Qsp;
import X.C6FZ;
import X.C73040SlY;
import X.C76800UCe;
import X.FMX;
import X.GQ4;
import X.GXR;
import X.InterfaceC45040Hm0;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class ACallableS19S0100100_7 implements Callable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS19S0100100_7 aCallableS19S0100100_7) {
        C6FZ.LIZIZ((C6FZ) ((MvChoosePhotoScene) aCallableS19S0100100_7.l0).LLZILL.getValue(), "click_album", aCallableS19S0100100_7.j1, true, 8);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS19S0100100_7 aCallableS19S0100100_7) {
        C145995oB LJI = C5V5.LJI((VideoPublishEditModel) aCallableS19S0100100_7.l0);
        LJI.LIZ(110, "publish_step");
        LJI.LIZIZ(aCallableS19S0100100_7.j1, "duration");
        FMX.LJIIL("parallel_publish_result", LJI.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS19S0100100_7 aCallableS19S0100100_7) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(aCallableS19S0100100_7.j1, "duration");
        c145995oB.LJI("videoPath", ((AwemeDraft) aCallableS19S0100100_7.l0).LJFF);
        c145995oB.LIZIZ(((AwemeDraft) aCallableS19S0100100_7.l0).lastEditTime, "modify_time");
        C68395Qsp c68395Qsp = new C68395Qsp(3);
        AwemeDraft source = (AwemeDraft) aCallableS19S0100100_7.l0;
        o.LJIIIZ(source, "source");
        c68395Qsp.LJLIL = source;
        c145995oB.LIZIZ(c68395Qsp.LIZIZ(), "size");
        GXR.LIZ("tool_performance_draft_save", c145995oB.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS19S0100100_7 aCallableS19S0100100_7) {
        AnalysisActivityComponent analysisActivityComponent = (AnalysisActivityComponent) aCallableS19S0100100_7.l0;
        long j = aCallableS19S0100100_7.j1;
        Analysis LIZ = analysisActivityComponent.LIZ();
        if (LIZ != null && !TextUtils.isEmpty(LIZ.getLabelName())) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", LIZ.getLabelName());
            c145995oB.LIZIZ(j, "duration");
            if (LIZ.getExtraMap() != null && !LIZ.getExtraMap().isEmpty()) {
                c145995oB.LJFF(LIZ.getExtraMap());
            }
            FMX.LJIIL("stay_time", c145995oB.LIZ);
            return null;
        }
        return null;
    }

    public static final Object call$4(ACallableS19S0100100_7 aCallableS19S0100100_7) {
        C41485GPx c41485GPx = (C41485GPx) aCallableS19S0100100_7.l0;
        GQ4 gq4 = c41485GPx.LJII;
        VideoPublishEditModel videoPublishEditModel = c41485GPx.LIZ;
        long j = aCallableS19S0100100_7.j1;
        gq4.getClass();
        GQ4.LIZIZ(videoPublishEditModel, "publish", j);
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS19S0100100_7 aCallableS19S0100100_7) {
        InterfaceC45040Hm0 interfaceC45040Hm0;
        com.ss.android.ugc.aweme.analysis.Analysis analysis;
        String str;
        String str2;
        com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent analysisActivityComponent = (com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent) aCallableS19S0100100_7.l0;
        long j = aCallableS19S0100100_7.j1;
        WeakReference<InterfaceC45040Hm0> weakReference = analysisActivityComponent.LJLILLLLZI;
        if (weakReference != null && (interfaceC45040Hm0 = weakReference.get()) != null && (analysis = interfaceC45040Hm0.getAnalysis()) != null && !TextUtils.isEmpty(analysis.getLabelName())) {
            C73040SlY.LJIIIIZZ(analysisActivityComponent.LJLJI, "event_v1", "stay_time", analysis.getLabelName(), j, analysis.getExt_value(), null);
            C55406Loo c55406Loo = new C55406Loo();
            c55406Loo.LJJL = String.valueOf(j);
            c55406Loo.LIZLLL = analysis.getLabelName();
            c55406Loo.LJJIIZ(AwemeService.LIZ().i6(String.valueOf(analysis.getValue())));
            JSONObject ext_json = analysis.getExt_json();
            if (ext_json != null) {
                String str3 = "";
                if (!ext_json.has("process_id")) {
                    str = "";
                } else {
                    str = JSONObjectProtectorUtils.getString(ext_json, "process_id");
                }
                c55406Loo.LJJLIIIJJIZ = str;
                if (!ext_json.has("challenge_id")) {
                    str2 = "";
                } else {
                    str2 = JSONObjectProtectorUtils.getString(ext_json, "challenge_id");
                }
                c55406Loo.LJJLIIIJL = str2;
                if (ext_json.has("page_model")) {
                    str3 = JSONObjectProtectorUtils.getString(ext_json, "page_model");
                }
                c55406Loo.LIZLLL("page_model", str3);
            }
            if ("chat".equalsIgnoreCase(analysis.getLabelName())) {
                c55406Loo.LIZLLL("chat_type", analysis.getCategory());
            }
            c55406Loo.LJIILIIL();
        }
        return null;
    }

    public ACallableS19S0100100_7(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
