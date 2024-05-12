package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.Jny, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C50258Jny {
    public final C50259Jnz LIZ = new C50259Jnz();
    public final Context LIZIZ;

    public C50258Jny(Context context) {
        this.LIZIZ = C16880lQ.LLLLL(context);
    }

    public final void LIZ(int i) {
        this.LIZ.LJFF = this.LIZIZ.getString(i);
        this.LIZ.LJIIJJI = true;
    }

    public final void LIZIZ(int i) {
        C50259Jnz c50259Jnz = this.LIZ;
        c50259Jnz.LIZ = i;
        c50259Jnz.LIZIZ = this.LIZIZ.getResources().getDrawable(i);
        this.LIZ.LJIIIZ = true;
    }

    public final void LIZJ(int i) {
        this.LIZ.LJ = this.LIZIZ.getString(i);
        if (!TextUtils.isEmpty(this.LIZ.LJ)) {
            this.LIZ.LJIIJ = true;
            return;
        }
        throw new IllegalArgumentException("title should not be empty string!");
    }
}
