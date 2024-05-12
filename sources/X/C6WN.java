package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.gamora.editor.recommendeffect.RecommendEffectLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6WN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WN {
    public final /* synthetic */ C6WM LIZ;

    public C6WN(C6WM c6wm) {
        this.LIZ = c6wm;
    }

    public final void LIZ(RecommendEffectLayoutManager layoutManager, View view, float f) {
        boolean z;
        Number valueOf;
        boolean z2;
        o.LJIIIZ(layoutManager, "layoutManager");
        float abs = Math.abs(f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        if (abs == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = Float.valueOf(1.0f);
        } else if (abs <= 2.0f) {
            valueOf = Double.valueOf(1.0f - (abs * 0.2d));
        } else {
            valueOf = Float.valueOf(0.6f);
        }
        view.setScaleX(valueOf.floatValue());
        view.setScaleY(valueOf.floatValue());
        C72790ShW c72790ShW = (C72790ShW) view.findViewById(R.id.ki1);
        if (abs == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c72790ShW.setRectFRadius(C32151Nz.LJIIZILJ(10));
            c72790ShW.invalidate();
        } else if (abs == 1.0f || abs == 2.0f) {
            c72790ShW.setRectFRadius(valueOf.floatValue() * C32151Nz.LJIIZILJ(10));
            c72790ShW.invalidate();
        }
        if (this.LIZ.getUiStates().LJ.LIZ) {
            int LJJJLL = C0A2.LJJJLL(view);
            Float f2 = (Float) ((LinkedHashMap) this.LIZ.LJLLL).get(Integer.valueOf(LJJJLL));
            if (f2 != null) {
                C6WM c6wm = this.LIZ;
                if (f2.floatValue() >= 0.1d && abs < 0.1d && System.currentTimeMillis() - c6wm.LJLLLL > 50) {
                    C6WM c6wm2 = this.LIZ;
                    f2.floatValue();
                    Activity requireActivity = c6wm2.requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    new C61996OUu(requireActivity).LIZ(0);
                    c6wm2.LJLLLL = System.currentTimeMillis();
                }
            }
            this.LIZ.LJLLL.put(Integer.valueOf(LJJJLL), Float.valueOf(abs));
        }
    }
}
