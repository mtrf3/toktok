package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.lynx.tasm.behavior.shadow.text.LynxStandardAlignmentSpan;
import java.text.Bidi;

/* renamed from: X.VRp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79749VRp extends C79758VRy {
    public final Layout.Alignment LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final C79743VRj LJI;

    @Override // X.C79758VRy
    public final void LIZ(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2 = this.LIZ;
        if (i2 == 0) {
            i = 18;
        } else {
            i = 34;
        }
        Layout.Alignment alignment = this.LIZLLL;
        if (this.LJ == 0 && !this.LJFF) {
            int i3 = 1;
            boolean z = !new Bidi(spannableStringBuilder.subSequence(i2, this.LIZIZ).toString(), -2).baseIsLeftToRight();
            if (this.LIZ == 0) {
                C79743VRj c79743VRj = this.LJI;
                if (!z) {
                    i3 = 2;
                }
                c79743VRj.LJIJJ = i3;
            }
            if (z) {
                alignment = alignment == Layout.Alignment.ALIGN_NORMAL ? Layout.Alignment.ALIGN_OPPOSITE : alignment == Layout.Alignment.ALIGN_OPPOSITE ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
        }
        spannableStringBuilder.setSpan(new LynxStandardAlignmentSpan(alignment), this.LIZ, this.LIZIZ, i);
    }

    public C79749VRp(int i, int i2, Layout.Alignment alignment, int i3, boolean z, C79743VRj c79743VRj) {
        super(i, i2, null);
        this.LIZLLL = alignment;
        this.LJ = i3;
        this.LJFF = z;
        this.LJI = c79743VRj;
    }
}
