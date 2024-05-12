package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes9.dex */
public final class JGE extends JGG {
    public final Context LIZ;
    public volatile C48852JFg LIZIZ;
    public volatile QIF LIZJ;

    @Override // X.JGG
    public final String LIZLLL() {
        return this.LIZIZ.LJLJJL.LIZIZ(this.LIZ).getString("device_token", null);
    }

    public JGE(QIF qif, C48852JFg c48852JFg) {
        this.LIZJ = qif;
        this.LIZ = qif.LIZJ;
        this.LIZIZ = c48852JFg;
    }

    @Override // X.JGH
    public final void LIZJ(String str, C48852JFg c48852JFg) {
        SharedPreferences LIZ;
        this.LIZIZ = c48852JFg;
        if (c48852JFg != null && (LIZ = c48852JFg.LIZ(this.LIZJ)) != null) {
            LIZ.edit().putString("device_token", str).apply();
        }
        JG8.LIZ(this.LIZ).LIZJ(this.LIZJ.LIZ(), "device_token", str);
    }
}
