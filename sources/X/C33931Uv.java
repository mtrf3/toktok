package X;

import android.text.TextUtils;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1Uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33931Uv extends AbstractC16280kS<CharSequence> {
    public C33931Uv(Class cls) {
        super(R.id.kzs, cls, 8, 28);
    }

    @Override // X.AbstractC16280kS
    public final CharSequence LIZIZ(View view) {
        return C16400ke.LIZIZ(view);
    }

    @Override // X.AbstractC16280kS
    public final void LIZJ(View view, CharSequence charSequence) {
        C16400ke.LJIIIIZZ(view, charSequence);
    }

    @Override // X.AbstractC16280kS
    public final boolean LJFF(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
