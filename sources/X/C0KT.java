package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.0KT, reason: invalid class name */
/* loaded from: classes.dex */
public class C0KT {
    public Object LIZ;
    public Drawable LIZIZ;
    public CharSequence LIZJ;
    public CharSequence LJ;
    public View LJI;
    public C0KV LJII;
    public C0KU LJIIIIZZ;
    public boolean LIZLLL = true;
    public int LJFF = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;

    public final void LIZ() {
        C0KV c0kv = this.LJII;
        if (c0kv != null) {
            c0kv.LJIILJJIL(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void LIZJ() {
        C0KU c0ku = this.LJIIIIZZ;
        if (c0ku != null) {
            c0ku.LIZ();
        }
    }

    public final void LIZIZ(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.LJ) && !TextUtils.isEmpty(charSequence)) {
            this.LJIIIIZZ.setContentDescription(charSequence);
        }
        this.LIZJ = charSequence;
        this.LJII.LLILIL = true;
        this.LJIIJ = -1;
        this.LJIIIZ = -1;
        LIZJ();
    }
}
