package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JKH extends AbstractC48937JIn {
    public final /* synthetic */ JKG LJLIL;

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LIZ() {
        JON n0 = this.LJLIL.n0();
        if (n0 == null) {
            return;
        }
        n0.setVisibility(8);
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LJIIIZ() {
        JON n0;
        ITopLiveProductView l0;
        if (this.LJLIL.T() && (l0 = this.LJLIL.l0()) != null) {
            l0.resumeDisplay();
        }
        JHK jhk = EnumC48916JHs.Companion;
        J1C.LJ();
        int i = J1C.LIZIZ;
        jhk.getClass();
        EnumC48916JHs LIZ = JHK.LIZ(i);
        if (LIZ != null && (n0 = this.LJLIL.n0()) != null) {
            n0.LIZ(LIZ, false);
        }
        JON n02 = this.LJLIL.n0();
        if (n02 != null) {
            n02.setVisibility(0);
        }
        this.LJLIL.c0().getLiveCore().setMute(J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, this.LJLIL.w0() ? 1 : 0, null));
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void onPause() {
        ITopLiveProductView l0;
        if (this.LJLIL.T() && (l0 = this.LJLIL.l0()) != null) {
            l0.pauseDisplay();
        }
        JON n0 = this.LJLIL.n0();
        if (n0 == null) {
            return;
        }
        n0.setVisibility(8);
    }

    public JKH(JKG jkg) {
        this.LJLIL = jkg;
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void onError(String info) {
        o.LJIIIZ(info, "info");
        JON n0 = this.LJLIL.n0();
        if (n0 == null) {
            return;
        }
        n0.setVisibility(8);
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LJI(int i, int i2, View view) {
        JKG jkg = this.LJLIL;
        jkg.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLiveVideoSizeChanged: textureView: ");
        LIZ.append(view.hashCode());
        LIZ.append("; width: ");
        LIZ.append(i);
        LIZ.append("; height: ");
        LIZ.append(i2);
        X1D.LIZIZ(LIZ);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int width = jkg.itemView.findViewById(R.id.n9f).getWidth();
        int height = jkg.itemView.findViewById(R.id.n9f).getHeight();
        if (width <= 0 || height <= 0 || view.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (i > i2) {
            layoutParams2.gravity = 17;
            if (jkg.w0()) {
                C1JI.LJJIIZ(view, Float.valueOf(KL2.LIZJ(jkg.itemView.getContext(), jkg.h0())), null, null, null, null, 30);
                return;
            } else {
                C1JI.LJJIIZ(view, Float.valueOf(KL2.LIZJ(jkg.itemView.getContext(), jkg.i0())), null, null, null, null, 30);
                return;
            }
        }
        float f = i2 / i;
        float f2 = height;
        float f3 = width;
        float f4 = f2 / f3;
        if (jkg.w0()) {
            int LIZJ = (int) KL2.LIZJ(jkg.itemView.getContext(), 150.0f);
            layoutParams2.width = LIZJ;
            layoutParams2.height = (int) (LIZJ * f);
            if (f >= f4) {
                layoutParams2.gravity = 80;
            } else {
                layoutParams2.gravity = 17;
            }
            C1JI.LJJIIZ(view, Float.valueOf(KL2.LIZJ(jkg.itemView.getContext(), jkg.h0())), null, null, null, null, 30);
        } else {
            JKI.LIZ.getClass();
            if (JKI.LIZ()) {
                layoutParams2.gravity = 17;
                C1JI.LJJIIZ(view, Float.valueOf(KL2.LIZJ(jkg.itemView.getContext(), jkg.i0())), null, null, null, null, 30);
            } else {
                if (f >= f4) {
                    layoutParams2.width = (int) (f2 / f);
                    layoutParams2.height = height;
                } else {
                    layoutParams2.width = width;
                    layoutParams2.height = (int) (f3 * f);
                }
                layoutParams2.gravity = 17;
                C1JI.LJJIIZ(view, Float.valueOf(KL2.LIZJ(jkg.itemView.getContext(), jkg.i0())), null, null, null, null, 30);
            }
        }
        view.setLayoutParams(layoutParams2);
    }
}
