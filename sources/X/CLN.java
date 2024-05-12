package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizAudioFixSetting;
import com.bytedance.android.livesdk.quiz.ActQuizWidget;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CLN implements InterfaceC60949Nw1 {
    public final /* synthetic */ C68322mC<B35> LIZ;
    public final /* synthetic */ ActQuizWidget LIZIZ;

    @Override // X.InterfaceC60949Nw1
    public final void LIZ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZIZ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZLLL(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        C0NB.LJIIIZ("EOYQuiz", "spark container onPostStarted isSuppressed=true");
        AnonymousClass149.LIZ.LJFF(true);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJFF(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJI(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIIZ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIL(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILJJIL(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        LJJIFFI(popup, "onSparkPopupPostResumed");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILLIIL(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        C0NB.LJIIIZ("EOYQuiz", "spark container onSparkPopupDismissed isSuppressed=false");
        AnonymousClass149.LIZ.LJFF(false);
        if (LiveQuizAudioFixSetting.INSTANCE.getValue()) {
            B35 b35 = this.LIZ.element;
            if (b35 != null) {
                b35.restoreAudioStatus();
            }
            B35 b352 = this.LIZ.element;
            if (b352 != null) {
                b352.setAudioRespondDisableForQuiz(false);
            }
        }
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIJ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIJJLI(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIL(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJJ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJJI(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    public CLN(ActQuizWidget actQuizWidget, C68322mC c68322mC) {
        this.LIZ = c68322mC;
        this.LIZIZ = actQuizWidget;
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIJ(SparkPopup sparkPopup, Configuration configuration) {
        CLW.LIZ(sparkPopup, configuration);
    }

    @Override // X.InterfaceC60949Nw1
    public final boolean LJIIJJI(SparkPopup sparkPopup, SparkContext sparkContext) {
        CLW.LIZIZ(sparkPopup, sparkContext);
        return false;
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILL(SparkPopup sparkPopup, Bundle bundle) {
        CLW.LIZLLL(sparkPopup, bundle);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIJI(SparkPopup sparkPopup, Bundle bundle) {
        CLW.LIZJ(sparkPopup, bundle);
    }

    public final void LJJIFFI(SparkPopup popup, String str) {
        o.LJIIIZ(popup, "popup");
        if (!this.LIZIZ.LJLJLLL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("spark container closed due to widget is not live ");
            LIZ.append(str);
            C0NB.LJIIIZ("EOYQuiz", X1D.LIZIZ(LIZ));
            popup.Nl(true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("msg", str);
            C0K2.LJII(1, "ttlive_eoy_quiz_card_enverror_monitor", C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap));
        }
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZJ(SparkPopup sparkPopup, View view, float f) {
        CLW.LJFF(sparkPopup, view);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJ(SparkPopup sparkPopup, View view, int i) {
        CLW.LJIIJ(sparkPopup, view);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJII(SparkPopup sparkPopup, View view, Bundle bundle) {
        CLW.LJIIIZ(sparkPopup, view);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILIIL(SparkPopup sparkPopup, View view, Bundle bundle) {
        CLW.LJII(sparkPopup, view);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIIIZZ(SparkPopup popup, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(inflater, "inflater");
        CLW.LJI(popup, inflater);
        LJJIFFI(popup, "onSparkPopupPostCreateView");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIZILJ(SparkPopup sparkPopup, int i, String[] strArr, int[] iArr) {
        CLW.LJ(sparkPopup, strArr, iArr);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIJJ(SparkPopup sparkPopup, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CLW.LJIIIIZZ(sparkPopup, layoutInflater);
    }
}
