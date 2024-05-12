package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MM0 implements LDY {
    public final /* synthetic */ C56671MLz LJLIL;

    public MM0(C56671MLz c56671MLz) {
        this.LJLIL = c56671MLz;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        o.LJIIIZ(to, "to");
        if (TextUtils.equals(to, "NOTIFICATION")) {
            this.LJLIL.f0();
        }
    }
}
