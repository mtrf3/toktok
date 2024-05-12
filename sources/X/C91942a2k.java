package X;

import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a2k, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C91942a2k {
    public final InterfaceC88472Yns<JSONObject, C76800UCe> LIZ;
    public final java.util.Map<String, InterfaceC91938a2g<?>> LIZIZ = new LinkedHashMap();

    public final boolean LIZIZ() {
        Collection values = ((LinkedHashMap) this.LIZIZ).values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof C92352a9M)) {
                return true;
            }
        }
        return false;
    }

    public final int LIZJ() {
        Collection values = ((LinkedHashMap) this.LIZIZ).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!(obj instanceof C92352a9M) && !(obj instanceof C92182a6c)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91942a2k(InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    public final void LIZ(String str, Elements elements, C92083a51 apiService, String str2, String str3) {
        o.LJIIIZ(apiService, "apiService");
        if (((InterfaceC91938a2g) ((LinkedHashMap) this.LIZIZ).get(str)) instanceof C92351a9L) {
            return;
        }
        this.LIZIZ.put(str, new C92351a9L(apiService, elements, str2, str3, this.LIZ));
    }
}
