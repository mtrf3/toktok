package X;

import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: X.ZcN, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90307ZcN {
    public final IIL<C91028Zo0> LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final void LIZ(C91028Zo0 c91028Zo0, int i) {
        C67358Qc6 c67358Qc6;
        C90979ZnD LJIIL = C91028Zo0.LJIIL(c91028Zo0);
        String str = this.LIZIZ;
        if (LJIIL.LJLJI) {
            LJIIL.LJ();
            LJIIL.LJLJI = false;
        }
        C91028Zo0.LJIL((C91028Zo0) LJIIL.LJLILLLLZI, str);
        C91028Zo0 LIZJ = LJIIL.LIZJ();
        if (this.LIZJ - 1 != 0) {
            c67358Qc6 = new C67358Qc6(Integer.valueOf(i - 1), LIZJ, EnumC67357Qc5.DEFAULT);
        } else {
            c67358Qc6 = new C67358Qc6(Integer.valueOf(i - 1), LIZJ, EnumC67357Qc5.VERY_LOW);
        }
        ((C67360Qc8) this.LIZ).LIZ(c67358Qc6);
    }

    public C90307ZcN(SharedPreferences sharedPreferences, C67360Qc8 c67360Qc8, long j) {
        int i;
        this.LIZ = c67360Qc8;
        String string = sharedPreferences.getString("client_sender_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.LIZIZ = string;
        if (j == 0) {
            i = 1;
        } else {
            i = 2;
        }
        this.LIZJ = i;
    }
}
