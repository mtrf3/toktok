package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.EeA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36910EeA {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final List<EJ6> LIZLLL;
    public final TypedInput LJ;
    public Object LJFF;
    public String LJI;

    public final boolean LIZJ() {
        int i = this.LIZIZ;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    public final EJ6 LIZ(String str) {
        List<EJ6> list = this.LIZLLL;
        if (list == null) {
            return null;
        }
        for (EJ6 ej6 : list) {
            if (str.equalsIgnoreCase(ej6.LIZ)) {
                return ej6;
            }
        }
        return null;
    }

    public final List<EJ6> LIZIZ(String str) {
        List<EJ6> list;
        ArrayList arrayList = null;
        if (str != null && (list = this.LIZLLL) != null) {
            for (EJ6 ej6 : list) {
                if (str.equalsIgnoreCase(ej6.LIZ)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ej6);
                }
            }
        }
        return arrayList;
    }

    public C36910EeA(String str, int i, String str2, List<EJ6> list, TypedInput typedInput) {
        if (str != null) {
            if (i >= 200) {
                if (str2 != null) {
                    if (list != null) {
                        this.LIZ = str;
                        this.LIZIZ = i;
                        this.LIZJ = str2;
                        this.LIZLLL = Collections.unmodifiableList(new ArrayList(list));
                        this.LJ = typedInput;
                        return;
                    }
                    throw new IllegalArgumentException("headers == null");
                }
                throw new IllegalArgumentException("reason == null");
            }
            throw new IllegalArgumentException(KMP.LJ("Invalid status code: ", i));
        }
        throw new IllegalArgumentException("url == null");
    }
}
