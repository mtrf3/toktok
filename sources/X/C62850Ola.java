package X;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.framework.services.StaticServiceImplManager;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ola, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C62850Ola implements EVY {
    public static InterfaceC43072GvM LJ() {
        return C60903NvH.LJIIJJI().LJJIJL().getPathService();
    }

    @Override // X.EVY
    public void LIZ() {
        StaticServiceImplManager.getInstance();
    }

    public static NLESegmentAudio LIZLLL(NLETrackSlot nLETrackSlot, String str) {
        o.LJIIIIZZ(nLETrackSlot, str);
        return NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
    }

    public static LinkedHashMap LJFF(Context context, String str) {
        o.LJIIIZ(context, str);
        return new LinkedHashMap();
    }

    public static C70920RsS LJI(View view, String str) {
        o.LJIIIIZZ(view, str);
        return new C70920RsS();
    }

    public static void LJII(Effect effect, ArrayList arrayList) {
        arrayList.add(new com.ss.android.ugc.effectmanager.effect.model.Effect(effect));
    }

    public static AlphaAnimation LIZIZ(float f, float f2, long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        return alphaAnimation;
    }

    public static FrameLayout LIZJ(Context context, int i, int i2) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(i);
        frameLayout.setVisibility(i2);
        return frameLayout;
    }

    public static void LJIIIIZZ(StringBuilder sb, long j, char c, String str) {
        sb.append(j);
        sb.append(c);
        sb.append(str);
    }
}
