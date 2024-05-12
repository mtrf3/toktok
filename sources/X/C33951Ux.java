package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1Ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33951Ux extends AbstractC16280kS<Boolean> {
    public C33951Ux(Class cls) {
        super(R.id.kzr, cls, 0, 28);
    }

    @Override // X.AbstractC16280kS
    public final Boolean LIZIZ(View view) {
        return Boolean.valueOf(C16400ke.LIZJ(view));
    }

    @Override // X.AbstractC16280kS
    public final void LIZJ(View view, Boolean bool) {
        C16400ke.LJII(view, bool.booleanValue());
    }

    @Override // X.AbstractC16280kS
    public final boolean LJFF(Boolean bool, Boolean bool2) {
        return !AbstractC16280kS.LIZ(bool, bool2);
    }
}
