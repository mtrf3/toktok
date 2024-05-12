package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.Q5g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66428Q5g implements InterfaceC66438Q5q {
    public final Activity LIZ;

    @Override // X.InterfaceC66438Q5q
    public final Activity LIZ() {
        return this.LIZ;
    }

    public C66428Q5g(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC66438Q5q
    public final void startActivityForResult(Intent intent, int i) {
        C16880lQ.LJFF(this.LIZ, i, intent);
    }
}
