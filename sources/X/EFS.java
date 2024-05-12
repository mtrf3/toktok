package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class EFS extends ThreadLocal<List<EFM>> {
    @Override // java.lang.ThreadLocal
    public final List<EFM> initialValue() {
        return new ArrayList();
    }
}
