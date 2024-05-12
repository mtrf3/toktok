package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;

/* renamed from: X.4VR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4VR implements C4VS {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C4K0.LJLIL);

    @Override // X.C4VS
    public final String LIZIZ() {
        return ((C4VS) this.LIZ.getValue()).LIZIZ();
    }

    @Override // X.C4VS
    public final boolean LIZJ(String str) {
        return ((C4VS) this.LIZ.getValue()).LIZJ(str);
    }

    public final LinkedHashMap<String, Integer> LIZLLL(CharSequence charSequence) {
        int i;
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        if (charSequence == null || charSequence.length() == 0) {
            return linkedHashMap;
        }
        Matcher matcher = C118824lS.LIZ.matcher(charSequence);
        while (matcher.find()) {
            String emojiText = matcher.group();
            if (LIZJ(emojiText)) {
                Integer num = linkedHashMap.get(emojiText);
                if (num == null || num.intValue() <= 0) {
                    i = 1;
                } else {
                    i = C77339UWx.LIZIZ(num, 1);
                }
                o.LJIIIIZZ(emojiText, "emojiText");
                linkedHashMap.put(emojiText, i);
            }
        }
        return linkedHashMap;
    }

    @Override // X.C4VS
    public final Drawable LIZ(Context context, String str) {
        return ((C4VS) this.LIZ.getValue()).LIZ(context, str);
    }
}
