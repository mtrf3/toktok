package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xsq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86232Xsq implements InterfaceC61118Nyk {
    public final /* synthetic */ C86226Xsk LIZ;
    public final /* synthetic */ Activity LIZIZ;

    public C86232Xsq(C86226Xsk c86226Xsk, Activity activity) {
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
            this.LIZ.LIZIZ(this.LIZIZ);
            return;
        }
        if (this.LIZ.LJIIIZ == 0) {
            C5S1 c5s1 = new C5S1(this.LIZIZ);
            c5s1.LIZLLL(this.LIZIZ.getString(R.string.jga));
            c5s1.LJ();
        }
        this.LIZ.LIZIZ.LIZ(-6, "Storage permission denied");
    }
}
