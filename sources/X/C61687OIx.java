package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.OIx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61687OIx extends AbstractC61686OIw {
    public final LruCache<String, Pattern> LIZJ;

    public C61687OIx() {
        super("is_match_with");
        this.LIZJ = new LruCache<>(30);
    }

    @Override // X.AbstractC61686OIw
    public final boolean LIZIZ(String source, String compare, boolean z) {
        o.LJIIJ(source, "source");
        o.LJIIJ(compare, "compare");
        Pattern pattern = this.LIZJ.get(compare);
        if (pattern == null) {
            pattern = PatternProtector.compile(compare);
            this.LIZJ.put(compare, pattern);
        }
        return pattern.matcher(source).find();
    }
}
