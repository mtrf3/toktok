package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.sticker.model.EffectAttribution;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GtK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42946GtK {
    public static final C116714i3 LIZ(EffectAttribution effectAttribution, Context context) {
        o.LJIIIZ(effectAttribution, "<this>");
        C116724i4 c116724i4 = new C116724i4();
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        String[] strArr = new String[2];
        String author = effectAttribution.getAuthor();
        String str = "";
        if (author == null) {
            author = "";
        }
        strArr[0] = author;
        String creator = effectAttribution.getCreator();
        if (creator != null) {
            str = creator;
        }
        strArr[1] = str;
        c116724i4.LIZ(resources, R.string.fr8, strArr);
        return c116724i4.LIZ;
    }

    public static final String LIZIZ(EffectAttribution effectAttribution, Context context) {
        o.LJIIIZ(effectAttribution, "<this>");
        StringBuilder sb = new StringBuilder();
        String name = effectAttribution.getName();
        String str = "";
        if (name == null) {
            name = "";
        }
        sb.append(name);
        sb.append("\n");
        sb.append((CharSequence) LIZ(effectAttribution, context));
        sb.append("\n");
        String license = effectAttribution.getLicense();
        if (license != null) {
            str = license;
        }
        sb.append(str);
        sb.append("\n");
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply {\n…nd(\"\\n\")\n    }.toString()");
        return sb2;
    }
}
