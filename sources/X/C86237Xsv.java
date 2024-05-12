package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.Xsv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86237Xsv implements InterfaceC61118Nyk {
    public final /* synthetic */ C86226Xsk LIZ;
    public final /* synthetic */ Activity LIZIZ;

    public C86237Xsv(C86226Xsk c86226Xsk, Activity activity) {
        this.LIZ = c86226Xsk;
        this.LIZIZ = activity;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] grantResults, String[] strArr) {
        o.LJIIIIZZ(grantResults, "grantResults");
        if (grantResults.length == 0) {
            return;
        }
        if (grantResults[0] == 0) {
            C86226Xsk c86226Xsk = this.LIZ;
            Activity activity = this.LIZIZ;
            c86226Xsk.getClass();
            C86226Xsk.LIZLLL(activity);
            return;
        }
        this.LIZ.LIZIZ.LIZ(-6, "Storage permission denied");
    }
}
