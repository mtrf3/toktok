package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.QMh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66871QMh implements InterfaceC66869QMf {
    public final Context LIZ;
    public final /* synthetic */ C66870QMg LIZIZ;

    @Override // X.InterfaceC66869QMf
    public final void LIZ() {
    }

    @Override // X.InterfaceC66869QMf
    public final void LIZIZ(Intent intent) {
        try {
            intent.setComponent(new ComponentName(this.LIZ, this.LIZIZ.LIZIZ));
            C16880lQ.LLLL(this.LIZ, intent);
        } catch (Throwable unused) {
        }
    }

    public C66871QMh(C66870QMg c66870QMg, Context context) {
        this.LIZIZ = c66870QMg;
        this.LIZ = context;
    }
}
