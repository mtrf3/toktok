package X;

import X.C65385PlN;
import X.C65403Plf;
import com.bytedance.android.live.browser.UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2$1;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* renamed from: X.1sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47041sy extends AbstractC65781Prl implements InterfaceC65784Pro<UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2$1> {
    public static final C47041sy LJLIL = new C47041sy();

    public C47041sy() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.android.live.browser.UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2$1] */
    @Override // X.InterfaceC65784Pro
    public final UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2$1 invoke() {
        return new TypeAdapter<j>() { // from class: com.bytedance.android.live.browser.UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2$1
            @Override // com.google.gson.TypeAdapter
            public final j read(C65385PlN c65385PlN) {
                j read = TypeAdapters.LJJIIJ.read(c65385PlN);
                o.LJIIIIZZ(read, "JSON_ELEMENT.read(`in`)");
                return read;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            public final void write(j jVar, C65403Plf out) {
                o.LJIIIZ(out, "out");
                if (jVar == null || (jVar instanceof l)) {
                    out.LJIIJJI();
                    return;
                }
                if ((jVar instanceof p) && (jVar.LJIJ().LJLIL instanceof Number)) {
                    long LJIJJLI = jVar.LJIJJLI();
                    if (LJIJJLI >= 2147483647L || LJIJJLI <= -2147483648L) {
                        out.LJJ(jVar.LJJIFFI());
                        return;
                    }
                }
                if (jVar instanceof g) {
                    out.LIZIZ();
                    Iterator<j> it = jVar.LJIILLIIL().iterator();
                    while (it.hasNext()) {
                        write(it.next(), out);
                    }
                    out.LJ();
                    return;
                }
                if (jVar instanceof m) {
                    out.LIZJ();
                    Set<Map.Entry<String, j>> entrySet = jVar.LJIIZILJ().entrySet();
                    o.LJIIIIZZ(entrySet, "value.asJsonObject.entrySet()");
                    for (Map.Entry<String, j> entry : entrySet) {
                        o.LJIIIIZZ(entry, "(k, v)");
                        String key = entry.getKey();
                        j value = entry.getValue();
                        out.LJI(key);
                        write(value, out);
                    }
                    out.LJFF();
                    return;
                }
                TypeAdapters.LJJIIJ.write(out, jVar);
            }
        };
    }
}
