package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Zju, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90774Zju extends C90284Zc0 {
    @Override // X.C90284Zc0
    public final void LIZ() {
        Iterable<Map.Entry> entrySet;
        if (!this.LJLJJI) {
            for (int i = 0; i < this.LJLILLLLZI.size(); i++) {
                Map.Entry entry = (Map.Entry) ListProtector.get(this.LJLILLLLZI, i);
                if (((InterfaceC90255ZbX) entry.getKey()).LIZIZ()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            if (this.LJLJI.isEmpty()) {
                entrySet = C90249ZbR.LIZIZ;
            } else {
                entrySet = this.LJLJI.entrySet();
            }
            for (Map.Entry entry2 : entrySet) {
                if (((InterfaceC90255ZbX) entry2.getKey()).LIZIZ()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.LIZ();
    }

    public C90774Zju(int i) {
        super(i);
    }
}
