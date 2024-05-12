package X;

import Y.AObjectS52S0101000_7;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC157016Ef {
    public final VideoPublishEditModel LIZ;
    public final VideoPublishViewModel LIZIZ;
    public final ActivityC45651qj LIZJ;
    public final String LIZLLL;
    public final MutableLiveData<Integer> LJ;
    public boolean LJFF;
    public PreCheckResult LJI;

    public abstract int LIZ();

    public abstract boolean LJ();

    public boolean LJFF() {
        return true;
    }

    public final void LJI() {
        Integer value;
        PreCheckResultModel preCheckResultModel;
        PreCheckResultModel preCheckResultModel2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL);
        LIZ.append(" -> uiTrigger -> needShowUI() = ");
        LIZ.append(LJFF());
        LIZ.append(", isResumed = ");
        LIZ.append(this.LJFF);
        LIZ.append(", detectProcessStatus.value = ");
        LIZ.append(this.LJ.getValue());
        LIZ.append(", getDetectScene = ");
        LIZ.append(LIZ());
        LIZ.append("  detectResult == null : ");
        boolean z = false;
        if (this.LJI == null) {
            z = true;
        }
        LIZ.append(z);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if (!LJFF() || !this.LJFF || C146535p3.LIZJ(LIZ()) || (value = this.LJ.getValue()) == null) {
            return;
        }
        if (value.intValue() == 101) {
            if (this.LJI == null) {
                return;
            }
            FragmentManager supportFragmentManager = this.LIZJ.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            Context LLLLLILLIL = C16880lQ.LLLLLILLIL(this.LIZJ);
            o.LJIIIIZZ(LLLLLILLIL, "activity.applicationContext");
            PreCheckResult preCheckResult = this.LJI;
            if (preCheckResult != null) {
                C157116Ep.LIZIZ(supportFragmentManager, LLLLLILLIL, preCheckResult, LIZIZ(), "video_post_page", "", LIZ(), null, null, new AqS168S0100000_2(this, 455));
                this.LJI = null;
                HashMap<Integer, PreCheckResultModel> detectResults = LIZIZ().creativeModel.audioCopyrightDetectModel.getDetectResults();
                if (detectResults != null && (preCheckResultModel2 = detectResults.get(Integer.valueOf(LIZ()))) != null) {
                    preCheckResultModel2.hasShowResult = true;
                }
                this.LJ.setValue(0);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (value.intValue() == 100) {
            C157116Ep.LIZLLL(this.LIZJ);
            this.LJI = null;
            HashMap<Integer, PreCheckResultModel> detectResults2 = LIZIZ().creativeModel.audioCopyrightDetectModel.getDetectResults();
            if (detectResults2 != null && (preCheckResultModel = detectResults2.get(Integer.valueOf(LIZ()))) != null) {
                preCheckResultModel.hasShowResult = true;
            }
            this.LJ.setValue(0);
            return;
        }
        if (value.intValue() != 102) {
            return;
        }
        C157116Ep.LIZJ(this.LIZJ);
    }

    public VideoPublishEditModel LIZIZ() {
        return this.LIZ;
    }

    public void LIZJ(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        aObjectS52S0101000_7.invoke();
    }

    public void LIZLLL(G7X nextStep, AbstractC42152GgW<?> abstractC42152GgW) {
        o.LJIIIZ(nextStep, "nextStep");
        ((C42150GgU) nextStep).LIZIZ(abstractC42152GgW);
    }

    public AbstractC157016Ef(VideoPublishEditModel model, WM7 rootScene, VideoPublishViewModel viewModel) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(viewModel, "viewModel");
        this.LIZ = model;
        this.LIZIZ = viewModel;
        this.LIZJ = SceneExtensionsKt.LIZLLL(rootScene);
        this.LIZLLL = "BasePublishAudioCopyrightController";
        this.LJ = new MutableLiveData<>(-1);
        this.LJFF = true;
    }
}
