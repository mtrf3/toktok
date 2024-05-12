package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.acy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94188acy implements InterfaceC93649aUH<AbstractC94186acw> {
    public final /* synthetic */ List LIZ;

    public C94188acy(List list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC93649aUH
    public final void LIZ(int i, AbstractC94186acw t) {
        o.LJIIIZ(t, "t");
        ((AbstractC94186acw) ListProtector.get(this.LIZ, i)).LIZLLL();
    }
}
