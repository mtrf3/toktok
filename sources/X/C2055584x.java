package X;

import android.text.Layout;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.84x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2055584x {
    public final CharSequence LIZ;
    public float LIZIZ;
    public int LIZJ = Integer.MAX_VALUE;
    public CharSequence LIZLLL;

    public C2055584x(CharSequence charSequence) {
        this.LIZ = charSequence;
    }

    public final List<Layout> LIZ(C74247TBz c74247TBz, Layout layout) {
        if (layout == null) {
            c74247TBz.LIZLLL(this.LIZ);
            TC0 tc0 = c74247TBz.LIZIZ;
            tc0.LIZIZ = Integer.MAX_VALUE;
            tc0.LJIIJ = null;
            tc0.LJIIJJI = 0;
            layout = c74247TBz.LIZ();
        }
        if (layout.getLineCount() <= this.LIZJ) {
            return C47261Igj.LJJIJ(layout);
        }
        float width = layout.getWidth() - this.LIZIZ;
        if (width <= 0.0f) {
            return C47261Igj.LJJIJ(layout);
        }
        CharSequence charSequence = this.LIZLLL;
        if (charSequence == null) {
            charSequence = this.LIZ;
        }
        c74247TBz.LIZLLL(charSequence);
        int i = this.LIZJ;
        TC0 tc02 = c74247TBz.LIZIZ;
        tc02.LIZIZ = i;
        tc02.LJIIJ = TextUtils.TruncateAt.END;
        tc02.LJIIJJI = (int) width;
        return C47261Igj.LJJIJIIJI(layout, c74247TBz.LIZ());
    }
}
