package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.OIn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61677OIn extends AbstractC61685OIv {
    public final LruCache<String, Pattern> LIZIZ;

    public C61677OIn() {
        super("search");
        this.LIZIZ = new LruCache<>(30);
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        if (list != null && list.size() == 2) {
            if ((ListProtector.get(list, 0) instanceof String) && (ListProtector.get(list, 1) instanceof String)) {
                Object obj = ListProtector.get(list, 0);
                if (obj != null) {
                    String str = (String) obj;
                    Object obj2 = ListProtector.get(list, 1);
                    if (obj2 != null) {
                        String str2 = (String) obj2;
                        Pattern pattern = this.LIZIZ.get(str2);
                        if (pattern == null) {
                            pattern = PatternProtector.compile(str2);
                            this.LIZIZ.put(str2, pattern);
                        }
                        Matcher matcher = pattern.matcher(str);
                        if (matcher.find()) {
                            int groupCount = matcher.groupCount() + 1;
                            String[] strArr = new String[groupCount];
                            for (int i = 0; i < groupCount; i++) {
                                strArr[i] = matcher.group(i);
                            }
                            return strArr;
                        }
                        return null;
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
            }
        }
        throw new C61596OFk(105, "params error");
    }
}
