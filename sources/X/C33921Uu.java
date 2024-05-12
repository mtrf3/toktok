package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1Uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33921Uu extends AbstractC16280kS<Boolean> {
    public C33921Uu(Class cls) {
        super(R.id.l0d, cls, 0, 28);
    }

    @Override // X.AbstractC16280kS
    public final Boolean LIZIZ(View view) {
        return Boolean.valueOf(C16400ke.LIZLLL(view));
    }

    @Override // X.AbstractC16280kS
    public final void LIZJ(View view, Boolean bool) {
        C16400ke.LJIIIZ(view, bool.booleanValue());
    }

    @Override // X.AbstractC16280kS
    public final boolean LJFF(Boolean bool, Boolean bool2) {
        return !AbstractC16280kS.LIZ(bool, bool2);
    }
}
