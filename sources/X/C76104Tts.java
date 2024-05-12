package X;

import Y.ARunnableS49S0100000_13;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tts, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76104Tts {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final int LIZ;
    public final double LIZIZ;
    public final RecyclerView LIZJ;
    public final InterfaceC88471Ynr<TreeMap<Integer, C75295Tgp>, TreeMap<Integer, C75295Tgp>, C76800UCe> LIZLLL;
    public final TreeMap<Integer, C75295Tgp> LJ;
    public final TreeMap<Integer, C75295Tgp> LJFF;
    public final TreeMap<Integer, C75295Tgp> LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public final ARunnableS49S0100000_13 LJIIJJI;
    public final ARunnableS49S0100000_13 LJIIL;

    public final void LIZIZ() {
        this.LJII = false;
        C15610jN.LIZ().removeCallbacks(this.LJIIJJI);
        this.LJFF.clear();
        this.LJI.clear();
    }

    public final void LIZ() {
        double d;
        double d2;
        boolean z;
        double d3;
        for (Map.Entry<Integer, C75295Tgp> entry : this.LJ.entrySet()) {
            View view = entry.getValue().LIZIZ;
            if (view != null) {
                Rect rect = new Rect();
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
                double d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                if (globalVisibleRect) {
                    d = rect.height();
                } else {
                    d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                Rect rect2 = new Rect();
                if (view.getGlobalVisibleRect(rect2)) {
                    d2 = rect2.width();
                } else {
                    d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                double measuredHeight = view.getMeasuredHeight();
                if (measuredHeight == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    d3 = (d / measuredHeight) * 100;
                } else {
                    d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                double measuredWidth = view.getMeasuredWidth();
                if (measuredWidth != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d4 = 100 * (d2 / measuredWidth);
                }
                if (this.LIZ != 0) {
                    d4 = d3;
                }
                if (d4 > this.LIZIZ) {
                    C75295Tgp value = entry.getValue();
                    value.getClass();
                    value.LIZJ = d3;
                    if (!this.LJFF.containsKey(entry.getKey())) {
                        this.LJI.put(entry.getKey(), value);
                    }
                    this.LJFF.put(entry.getKey(), value);
                } else {
                    this.LJFF.remove(entry.getKey());
                }
            }
        }
    }

    public final void LIZLLL() {
        if (this.LJII && (!this.LJFF.isEmpty()) && System.currentTimeMillis() - this.LJIIIZ > 100) {
            this.LJIIIZ = System.currentTimeMillis();
            this.LIZLLL.invoke(this.LJI, this.LJFF);
            this.LJI.clear();
        }
    }

    public final void LIZJ(boolean z) {
        this.LJIIIIZZ = 0;
        this.LJII = true;
        if (z) {
            C15610jN.LIZJ(this.LJIIJJI, 500L);
        } else {
            LIZ();
            LIZLLL();
        }
    }

    public C76104Tts(int i, RecyclerView recyclerView, InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LIZ = i;
        this.LIZIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LIZJ = recyclerView;
        this.LIZLLL = interfaceC88471Ynr;
        this.LJ = new TreeMap<>();
        this.LJFF = new TreeMap<>();
        this.LJI = new TreeMap<>();
        recyclerView.LJIIJJI(new C76106Ttu(this));
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new C76107Ttv(this));
        }
        recyclerView.LJIIIZ(new C76105Ttt(this));
        this.LJIIJJI = new ARunnableS49S0100000_13(this, 220);
        this.LJIIL = new ARunnableS49S0100000_13(this, 221);
    }
}
