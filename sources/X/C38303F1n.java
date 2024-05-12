package X;

import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.F1n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38303F1n<T> implements InterfaceC38301F1l<List<T>> {
    @Override // X.InterfaceC38301F1l
    public final Object LIZ(Object obj) {
        if (obj instanceof JSONArray) {
            try {
                return JsonParseUtils.LIZIZ(null, obj.toString());
            } catch (Throwable th) {
                throw new C37067Egh(th);
            }
        }
        throw new C38304F1o();
    }
}
