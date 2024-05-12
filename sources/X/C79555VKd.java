package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.VKd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79555VKd {
    public static final /* synthetic */ int LIZJ = 0;
    public final C79554VKc LIZ;
    public boolean LIZIZ;

    static {
        new C79555VKd(0);
    }

    public final Object clone() {
        Iterable<Map.Entry> entrySet;
        C79555VKd c79555VKd = new C79555VKd();
        for (int i = 0; i < this.LIZ.LJLILLLLZI.size(); i++) {
            Map.Entry entry = (Map.Entry) ListProtector.get(this.LIZ.LJLILLLLZI, i);
            c79555VKd.LIZ((InterfaceC79557VKf) entry.getKey(), entry.getValue());
        }
        C79554VKc c79554VKc = this.LIZ;
        if (c79554VKc.LJLJI.isEmpty()) {
            entrySet = C79558VKg.LIZIZ;
        } else {
            entrySet = c79554VKc.LJLJI.entrySet();
        }
        for (Map.Entry entry2 : entrySet) {
            c79555VKd.LIZ((InterfaceC79557VKf) entry2.getKey(), entry2.getValue());
        }
        return c79555VKd;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C79555VKd() {
        this.LIZ = new C79554VKc(16);
    }

    public C79555VKd(int i) {
        C79554VKc c79554VKc = new C79554VKc(0);
        this.LIZ = c79554VKc;
        if (!this.LIZIZ) {
            c79554VKc.LIZ();
            this.LIZIZ = true;
        }
        if (this.LIZIZ) {
            return;
        }
        c79554VKc.LIZ();
        this.LIZIZ = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79555VKd)) {
            return false;
        }
        return this.LIZ.equals(((C79555VKd) obj).LIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void LIZIZ(InterfaceC79557VKf interfaceC79557VKf, Object obj) {
        boolean z;
        interfaceC79557VKf.LIZ();
        obj.getClass();
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if ((obj instanceof AbstractC87134YHq) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC79557VKf.zza()), interfaceC79557VKf.LIZ().zza(), obj.getClass().getName()}));
            case ENUM:
                if (obj instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC79557VKf.zza()), interfaceC79557VKf.LIZ().zza(), obj.getClass().getName()}));
            case MESSAGE:
                if (obj instanceof YIH) {
                    return;
                }
                throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC79557VKf.zza()), interfaceC79557VKf.LIZ().zza(), obj.getClass().getName()}));
            default:
                throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC79557VKf.zza()), interfaceC79557VKf.LIZ().zza(), obj.getClass().getName()}));
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC79557VKf.zza()), interfaceC79557VKf.LIZ().zza(), obj.getClass().getName()}));
    }

    public final void LIZ(InterfaceC79557VKf interfaceC79557VKf, Object obj) {
        if (interfaceC79557VKf.LIZIZ()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    LIZIZ(interfaceC79557VKf, ListProtector.get(arrayList, i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            LIZIZ(interfaceC79557VKf, obj);
        }
        this.LIZ.put(interfaceC79557VKf, obj);
    }
}
