package X;

import com.bytedance.android.livesdkapi.host.IHostUser;
import kotlin.jvm.internal.o;

/* renamed from: X.Bbl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29117Bbl implements InterfaceC29110Bbe {
    @Override // X.InterfaceC29110Bbe
    public final boolean LJIIIZ() {
        Object value = C7N.LJII.getValue();
        o.LJIIIIZZ(value, "<get-hostUser>(...)");
        if (((IHostUser) value).isNeedProtectMinor()) {
            return true;
        }
        return false;
    }
}
