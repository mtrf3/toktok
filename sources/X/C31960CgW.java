package X;

import android.graphics.Typeface;
import com.bytedance.android.livesdkapi.host.IHostResource;
import kotlin.jvm.internal.o;

/* renamed from: X.CgW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31960CgW implements InterfaceC40021FnF {
    public static final C31960CgW LIZ = new C31960CgW();

    @Override // X.InterfaceC40021FnF
    public final Typeface LIZ(int i, String str) {
        if (o.LJ(str, "live_font")) {
            return ((IHostResource) CN1.LIZ(IHostResource.class)).Hj(i);
        }
        return null;
    }
}
