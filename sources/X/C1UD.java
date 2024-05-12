package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1UD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1UD implements InterfaceC65228Piq {
    public final Object LIZ;

    public final Collection LIZJ() {
        Collection values = ((C40601ia) this.LIZ).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) it.next());
        }
        return arrayList;
    }

    public /* synthetic */ C1UD() {
        this.LIZ = new C40601ia(false);
    }

    public /* synthetic */ C1UD(Type type) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
    }

    @Override // X.InterfaceC65228Piq
    public final Object LIZ(byte[] bArr) {
        if (o.LJ(this.LIZ, String.class)) {
            return new String(bArr, PVC.LIZ);
        }
        if (o.LJ(this.LIZ, Q9I.class)) {
            return new Q9L(new ByteArrayInputStream(bArr));
        }
        Object decode = new R2M((Type) this.LIZ).LIZ(bArr);
        if (decode == null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Gson gson = C09650Zl.LIZIZ;
            decode = GsonProtectorUtils.fromJson(gson, gson.LJIIL(new InputStreamReader(byteArrayInputStream)), (Type) this.LIZ);
        }
        o.LJIIIIZZ(decode, "decode");
        return decode;
    }

    public /* synthetic */ C1UD(AbstractC87141YHx abstractC87141YHx) {
        this.LIZ = abstractC87141YHx;
    }

    public final void LIZIZ(Object obj, Object obj2) {
        C46141rW c46141rW = (C46141rW) ((C40601ia) this.LIZ).get(obj);
        if (c46141rW == null) {
            C46141rW c46141rW2 = new C46141rW(false);
            c46141rW2.add(obj2);
            ((C40601ia) this.LIZ).put(obj, c46141rW2);
            return;
        }
        c46141rW.add(obj2);
    }
}
