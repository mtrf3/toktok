package X;

import Y.ARunnableS50S0100000_14;
import android.content.res.Resources;
import com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView;
import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import com.lynx.tasm.base.LLog;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VTI implements VTX {
    public final /* synthetic */ BaseLynxFoldView LIZ;

    public VTI(BaseLynxFoldView baseLynxFoldView) {
        this.LIZ = baseLynxFoldView;
    }

    @Override // X.VTY
    public final void LIZ(C80217Ve1 c80217Ve1, int i) {
        int height;
        this.LIZ.LJJII(c80217Ve1, i);
        BaseLynxFoldView baseLynxFoldView = this.LIZ;
        if (baseLynxFoldView.LJLJJL != i) {
            baseLynxFoldView.recognizeGesturere();
            this.LIZ.LJLJJL = i;
        }
        VNU lynxContext = this.LIZ.mContext;
        o.LJFF(lynxContext, "lynxContext");
        C79646VNq LIZJ = lynxContext.LIZJ();
        LIZJ.getClass();
        C79411VEp.LJ(new ARunnableS50S0100000_14(LIZJ, 196));
        BaseLynxFoldView baseLynxFoldView2 = this.LIZ;
        if (!baseLynxFoldView2.LJLILLLLZI || (height = baseLynxFoldView2.LJJI().getCollapsingToolbarLayout().getHeight() - this.LIZ.LJJI().getFoldToolBar().getHeight()) == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onOffsetChanged: ");
        LIZ.append(i);
        LIZ.append(", height = ");
        LIZ.append(height);
        LIZ.append(' ');
        LLog.LIZLLL(1, "LynxFoldView", X1D.LIZIZ(LIZ));
        float f = height;
        float abs = Math.abs(i) / f;
        float abs2 = Math.abs(this.LIZ.LJLJI - abs);
        BaseLynxFoldView baseLynxFoldView3 = this.LIZ;
        if ((abs2 < baseLynxFoldView3.LJLJJI && abs < 1.0f) || baseLynxFoldView3.LJLJI == abs) {
            return;
        }
        VNU lynxContext2 = baseLynxFoldView3.mContext;
        o.LJFF(lynxContext2, "lynxContext");
        VNL vnl = lynxContext2.LJLJJL;
        C49615Jdb c49615Jdb = new C49615Jdb(this.LIZ.getSign(), "offset");
        BaseLynxFoldView baseLynxFoldView4 = this.LIZ;
        baseLynxFoldView4.getClass();
        if (baseLynxFoldView4 instanceof LynxFoldViewNG) {
            VNU mContext = this.LIZ.mContext;
            o.LJFF(mContext, "mContext");
            float abs3 = Math.abs(i);
            Resources resources = mContext.getResources();
            o.LJFF(resources, "context.resources");
            c49615Jdb.LIZJ(Integer.valueOf((int) ((abs3 / resources.getDisplayMetrics().density) + 0.5f)), "offset");
            VNU mContext2 = this.LIZ.mContext;
            o.LJFF(mContext2, "mContext");
            Resources resources2 = mContext2.getResources();
            o.LJFF(resources2, "context.resources");
            c49615Jdb.LIZJ(Integer.valueOf((int) ((f / resources2.getDisplayMetrics().density) + 0.5f)), "height");
        } else {
            Locale locale = Locale.ENGLISH;
            o.LJFF(locale, "Locale.ENGLISH");
            String LLLZI = C16880lQ.LLLZI(locale, "%.5f", Arrays.copyOf(new Object[]{Float.valueOf(abs)}, 1));
            o.LJFF(LLLZI, "java.lang.String.format(locale, format, *args)");
            c49615Jdb.LIZJ(LLLZI, "offset");
        }
        vnl.LIZIZ(c49615Jdb);
        Locale locale2 = Locale.ENGLISH;
        o.LJFF(locale2, "Locale.ENGLISH");
        String LLLZI2 = C16880lQ.LLLZI(locale2, "%.5f", Arrays.copyOf(new Object[]{Float.valueOf(abs)}, 1));
        o.LJFF(LLLZI2, "java.lang.String.format(locale, format, *args)");
        LLog.LIZLLL(1, "LynxFoldView", "send ".concat(LLLZI2));
        this.LIZ.LJLJI = abs;
    }
}
