package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VSA extends Editable.Factory {
    public final NoCopySpan[] LIZ;

    public VSA(NoCopySpan... noCopySpanArr) {
        this.LIZ = noCopySpanArr;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence source) {
        o.LJIIJ(source, "source");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(source);
        for (NoCopySpan noCopySpan : this.LIZ) {
            valueOf.setSpan(noCopySpan, 0, source.length(), 18);
        }
        o.LJFF(valueOf, "SpannableStringBuilder.v…)\n            }\n        }");
        return valueOf;
    }
}
