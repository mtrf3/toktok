package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class JRC implements View.OnScrollChangeListener {
    public final /* synthetic */ JRB LIZ;

    public JRC(JRB jrb) {
        this.LIZ = jrb;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        JRE jre;
        C49177JRt c49177JRt;
        JRE jre2;
        C49177JRt c49177JRt2;
        JRB jrb = this.LIZ;
        int i5 = jrb.LJZI;
        if (i5 == 0 && i > i5 && (jre2 = jrb.LJLLL) != null && (c49177JRt2 = jre2.LIZIZ) != null) {
            C49177JRt.LIZ(c49177JRt2, "bounceViewStatus", C51029K0z.LJJIIZI(new OSZ("type", "show")));
        }
        JRB jrb2 = this.LIZ;
        if (jrb2.LJZI > 0 && i <= 0 && (jre = jrb2.LJLLL) != null && (c49177JRt = jre.LIZIZ) != null) {
            C49177JRt.LIZ(c49177JRt, "bounceViewStatus", C51029K0z.LJJIIZI(new OSZ("type", "hide")));
        }
        this.LIZ.LJZI = i;
    }
}
