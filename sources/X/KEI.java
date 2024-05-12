package X;

import android.text.TextUtils;

/* loaded from: classes9.dex */
public final class KEI {
    public Object LIZ;
    public Integer LIZIZ;
    public CharSequence LIZJ;
    public int LIZLLL = -1;
    public C74053T4n LJ;
    public C74045T4f LJFF;

    public final void LIZ() {
        C74053T4n c74053T4n = this.LJ;
        if (c74053T4n != null) {
            c74053T4n.LJIIJJI(this, true);
        }
    }

    public final void LIZIZ(CharSequence charSequence) {
        C74045T4f c74045T4f;
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence) && (c74045T4f = this.LJFF) != null) {
            c74045T4f.setContentDescription(charSequence);
        }
        this.LIZJ = charSequence;
        C74053T4n c74053T4n = this.LJ;
        if (c74053T4n != null) {
            c74053T4n.LLFF = true;
        }
        C74045T4f c74045T4f2 = this.LJFF;
        if (c74045T4f2 != null) {
            c74045T4f2.LIZ();
        }
    }
}
