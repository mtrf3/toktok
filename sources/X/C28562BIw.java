package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BIw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28562BIw implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 107;
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        boolean z;
        Context context = bik.LIZ;
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            C30868C9o.LIZLLL(R.string.sox, context);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
