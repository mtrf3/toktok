package X;

import X.InterfaceC90255ZbX;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.Zbg, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90264Zbg<T extends InterfaceC90255ZbX<T>> {
    public static final /* synthetic */ int LIZJ = 0;
    public final C90774Zju LIZ;
    public boolean LIZIZ;

    static {
        new C90264Zbg(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object clone() {
        Iterable<Map.Entry> entrySet;
        C90264Zbg c90264Zbg = new C90264Zbg();
        for (int i = 0; i < this.LIZ.LJLILLLLZI.size(); i++) {
            Map.Entry entry = (Map.Entry) ListProtector.get(this.LIZ.LJLILLLLZI, i);
            c90264Zbg.LIZ((InterfaceC90255ZbX) entry.getKey(), entry.getValue());
        }
        C90774Zju c90774Zju = this.LIZ;
        if (c90774Zju.LJLJI.isEmpty()) {
            entrySet = C90249ZbR.LIZIZ;
        } else {
            entrySet = c90774Zju.LJLJI.entrySet();
        }
        for (Map.Entry entry2 : entrySet) {
            c90264Zbg.LIZ((InterfaceC90255ZbX) entry2.getKey(), entry2.getValue());
        }
        return c90264Zbg;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C90264Zbg() {
        this.LIZ = new C90774Zju(16);
    }

    public C90264Zbg(int i) {
        C90774Zju c90774Zju = new C90774Zju(0);
        this.LIZ = c90774Zju;
        if (!this.LIZIZ) {
            c90774Zju.LIZ();
            this.LIZIZ = true;
        }
        if (this.LIZIZ) {
            return;
        }
        c90774Zju.LIZ();
        this.LIZIZ = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C90264Zbg)) {
            return false;
        }
        return this.LIZ.equals(((C90264Zbg) obj).LIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void LIZIZ(T t, Object obj) {
        boolean z;
        EnumC90400Zds LIZ = t.LIZ();
        obj.getClass();
        switch (LIZ.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof AbstractC90364ZdI) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.LIZ().zza(), obj.getClass().getName()}));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC90320Zca)) {
                    return;
                }
                throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.LIZ().zza(), obj.getClass().getName()}));
            case 8:
                if (obj instanceof InterfaceC90712Ziu) {
                    return;
                }
                throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.LIZ().zza(), obj.getClass().getName()}));
            default:
                throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.LIZ().zza(), obj.getClass().getName()}));
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.LIZ().zza(), obj.getClass().getName()}));
    }

    public final void LIZ(T t, Object obj) {
        if (t.LIZIZ()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    LIZIZ(t, ListProtector.get(arrayList, i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            LIZIZ(t, obj);
        }
        this.LIZ.put(t, obj);
    }
}
