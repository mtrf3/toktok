package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.VKc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79554VKc extends VKV {
    @Override // X.VKV
    public final void LIZ() {
        Iterable<Map.Entry> entrySet;
        if (!this.LJLJJI) {
            for (int i = 0; i < this.LJLILLLLZI.size(); i++) {
                Map.Entry entry = (Map.Entry) ListProtector.get(this.LJLILLLLZI, i);
                if (((InterfaceC79557VKf) entry.getKey()).LIZIZ()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            if (this.LJLJI.isEmpty()) {
                entrySet = C79558VKg.LIZIZ;
            } else {
                entrySet = this.LJLJI.entrySet();
            }
            for (Map.Entry entry2 : entrySet) {
                if (((InterfaceC79557VKf) entry2.getKey()).LIZIZ()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.LIZ();
    }

    public C79554VKc(int i) {
        super(i);
    }
}
