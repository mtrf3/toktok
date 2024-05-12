package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.M4k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56214M4k extends M56 {
    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "verify");
    }
}
