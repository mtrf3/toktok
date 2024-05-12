package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4sF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123034sF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C123034sF LJLIL = new C123034sF();

    public C123034sF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        C62822Ol8 c62822Ol8 = C123054sH.LIZIZ;
        Object value = c62822Ol8.getValue();
        List<Integer> list = C123054sH.LIZ;
        if (!o.LJ(value, list)) {
            z = false;
            if (((List) c62822Ol8.getValue()).size() == list.size()) {
                Iterator<Integer> it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    if (it.next().intValue() != ((Number) ListProtector.get((List) C123054sH.LIZIZ.getValue(), i)).intValue()) {
                        break;
                    }
                    i = i2;
                }
            }
            return Boolean.valueOf(z);
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
