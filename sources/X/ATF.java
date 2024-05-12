package X;

import android.content.Context;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATF implements C07G {
    public final /* synthetic */ ATB LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    public ATF(ATB atb, Context context) {
        this.LJLIL = atb;
        this.LJLILLLLZI = context;
    }

    @Override // X.C07G
    public final void LIZ(C45631qh c45631qh, int i, int i2, int i3, int i4) {
        o.LJIIIZ(c45631qh, "<anonymous parameter 0>");
        int[] iArr = new int[2];
        this.LJLIL.findViewById(R.id.jtn).getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        C45631qh c45631qh2 = this.LJLIL.LJLLLLLL;
        if (c45631qh2 != null) {
            c45631qh2.getLocationOnScreen(iArr2);
        }
        if (iArr[1] - iArr2[1] < 0.0f) {
            ViewGroup viewGroup = this.LJLIL.LJZ;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            float LIZJ = (-r2) / KL2.LIZJ(this.LJLILLLLZI, 40.0f);
            ViewGroup viewGroup2 = this.LJLIL.LJZ;
            if (viewGroup2 == null) {
                return;
            }
            if (LIZJ > 1.0f) {
                LIZJ = 1.0f;
            }
            viewGroup2.setAlpha(LIZJ);
            return;
        }
        ViewGroup viewGroup3 = this.LJLIL.LJZ;
        if (viewGroup3 == null) {
            return;
        }
        viewGroup3.setVisibility(8);
    }
}
