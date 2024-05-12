package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VSB extends CharacterStyle {
    public final String LIZ;
    public final String LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZ, this.LIZIZ};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VSB) {
            return C78966Uyw.LJIIIZ(((VSB) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("LynxMentionSpan:%s,%s", LIZ());
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    public VSB(String str, String symbol) {
        o.LJIIJ(symbol, "symbol");
        this.LIZ = str;
        this.LIZIZ = symbol;
    }
}
