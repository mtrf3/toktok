package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;

/* renamed from: X.OIt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61683OIt extends AbstractC61685OIv {
    public C61683OIt() {
        super("is_empty");
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        if (list != null) {
            boolean z = true;
            if (list.size() == 1) {
                Object obj = ListProtector.get(list, 0);
                if (obj == null || (obj instanceof Collection)) {
                    Collection collection = (Collection) obj;
                    if (collection != null && !collection.isEmpty()) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                if (obj == null || (obj instanceof String)) {
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence != null && charSequence.length() != 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                return Boolean.FALSE;
            }
        }
        throw new C61596OFk(105, "params error");
    }
}
