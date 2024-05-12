package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AR2 implements C07G {
    public final /* synthetic */ TuxIntroFragment LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public AR2(TuxIntroFragment tuxIntroFragment, int i) {
        this.LJLIL = tuxIntroFragment;
        this.LJLILLLLZI = i;
    }

    @Override // X.C07G
    public final void LIZ(C45631qh c45631qh, int i, int i2, int i3, int i4) {
        int i5;
        o.LJIIIZ(c45631qh, "<anonymous parameter 0>");
        Drawable drawable = this.LJLIL.LJLLLLLL;
        if (drawable == null) {
            return;
        }
        if (i2 > this.LJLILLLLZI) {
            i5 = 255;
        } else {
            i5 = 0;
        }
        drawable.setAlpha(i5);
    }
}
