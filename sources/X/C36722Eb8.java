package X;

import android.app.Application;
import android.os.Build;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;

/* renamed from: X.Eb8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36722Eb8 extends F8Y {
    public final Application LIZ;

    @Override // X.F8Y
    public final String LIZIZ() {
        return "DeadSystemExceptionPlugin";
    }

    @Override // X.F8Y
    public final void LIZLLL() {
        new C36721Eb7().LJ();
        if (Build.VERSION.SDK_INT == 29) {
            new C36725EbB().LIZ(this.LIZ);
            new C36713Eaz().LJ();
        }
    }

    public C36722Eb8(AwemeHostApplication awemeHostApplication) {
        this.LIZ = awemeHostApplication;
        if (awemeHostApplication != null) {
        } else {
            throw new IllegalArgumentException("Argument application can not be null!");
        }
    }
}
