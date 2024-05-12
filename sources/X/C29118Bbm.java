package X;

import com.bytedance.android.livesdkapi.host.IHostUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bbm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29118Bbm implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 109;
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        Object value = C7N.LJII.getValue();
        o.LJIIIIZZ(value, "<get-hostUser>(...)");
        if (((IHostUser) value).isNeedProtectMinor()) {
            C30868C9o.LIZJ(R.string.sw4);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
