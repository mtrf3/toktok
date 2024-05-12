package X;

import android.text.TextUtils;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1Uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33941Uw extends AbstractC16280kS<CharSequence> {
    public C33941Uw(Class cls) {
        super(R.id.l0e, cls, 64, 30);
    }

    @Override // X.AbstractC16280kS
    public final CharSequence LIZIZ(View view) {
        return C16420kg.LIZ(view);
    }

    @Override // X.AbstractC16280kS
    public final void LIZJ(View view, CharSequence charSequence) {
        C16420kg.LIZIZ(view, charSequence);
    }

    @Override // X.AbstractC16280kS
    public final boolean LJFF(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
