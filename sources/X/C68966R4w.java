package X;

import android.content.Context;

/* renamed from: X.R4w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68966R4w implements R7F {
    public final Context LIZ;

    public C68966R4w(Context context) {
        this.LIZ = context;
    }

    @Override // X.R7F
    public final void LIZ(String str, java.util.Map<String, String> map, QQE<C68922R3e> qqe) {
        Context context = this.LIZ;
        String LJIJJLI = C77412UZs.LJIJJLI(str);
        QQN qqn = new QQN();
        qqn.LIZ = LJIJJLI;
        qqn.LIZLLL(map);
        new C68921R3d(context, qqn.LIZIZ(), qqe).LJIIIZ();
    }

    @Override // X.R7F
    public final void LIZIZ(String str, java.util.Map<String, String> map, QQE<C68922R3e> qqe) {
        Context context = this.LIZ;
        String LJIJJLI = C77412UZs.LJIJJLI(str);
        QQN qqn = new QQN();
        qqn.LIZ = LJIJJLI;
        qqn.LIZLLL(map);
        new C68921R3d(context, qqn.LJFF(), qqe).LJIIIZ();
    }
}
