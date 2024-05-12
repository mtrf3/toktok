package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.R1l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68877R1l implements InterfaceC66740QHg {
    public static final java.util.Map<String, InterfaceC66740QHg> LIZJ = new ConcurrentHashMap();
    public String LIZ;
    public final List<String> LIZIZ;

    public AbstractC68877R1l() {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("logger@");
        LIZ.append(hashCode());
        arrayList.add(X1D.LIZIZ(LIZ));
    }

    public final List<String> LJIIZILJ(List<String> list) {
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.LIZIZ);
            arrayList.addAll(list);
            return arrayList;
        }
        return this.LIZIZ;
    }

    public static String LJIILLIIL(String str, Object... objArr) {
        char c;
        String str2;
        try {
            StringBuilder sb = new StringBuilder();
            if (objArr.length == 0 || !str.contains("{}")) {
                sb.append(str);
            } else {
                int length = str.length();
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (i < length - 1) {
                        c = str.charAt(i + 1);
                    } else {
                        c = ' ';
                    }
                    if (charAt == '{' && c == '}') {
                        if (i2 < objArr.length) {
                            int i3 = i2 + 1;
                            Object obj = objArr[i2];
                            if (obj != null) {
                                str2 = obj.toString();
                            } else {
                                str2 = "";
                            }
                            sb.append(str2);
                            i2 = i3;
                        }
                        i++;
                    } else {
                        sb.append(charAt);
                    }
                    i++;
                }
            }
            str = sb.toString();
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public void LJIJ(int i, int i2, List<String> list, Throwable th, String str, Object... objArr) {
        InterfaceC68884R1s interfaceC68884R1s;
        if (C68882R1q.LIZ.isEmpty() && ((ConcurrentHashMap) C68882R1q.LIZIZ).isEmpty()) {
            return;
        }
        C1KV c1kv = new C1KV(1);
        String str2 = this.LIZ;
        Object obj = c1kv.LJLIL;
        ((C68878R1m) obj).LIZ = str2;
        ((C68878R1m) obj).LIZLLL = i;
        ((C68878R1m) obj).LIZJ = i2;
        String name = C16880lQ.LLLLIIIILLL().getName();
        Object obj2 = c1kv.LJLIL;
        ((C68878R1m) obj2).LIZIZ = name;
        ((C68878R1m) obj2).LJII = th;
        ((C68878R1m) c1kv.LJLIL).LJ = LJIIZILJ(list);
        String LJIILLIIL = LJIILLIIL(str, objArr);
        Object obj3 = c1kv.LJLIL;
        ((C68878R1m) obj3).LJFF = LJIILLIIL;
        C68878R1m c68878R1m = (C68878R1m) obj3;
        C68882R1q.LIZ(c68878R1m);
        String str3 = this.LIZ;
        if (str3 != null && str3.length() > 0 && (interfaceC68884R1s = (InterfaceC68884R1s) ((ConcurrentHashMap) C68882R1q.LIZIZ).get(str3)) != null) {
            interfaceC68884R1s.LIZ(c68878R1m);
        }
    }
}
