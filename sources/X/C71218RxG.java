package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.RxG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71218RxG extends F9E {
    public final long LJLIL;
    public final InterfaceC79150V4o LJLILLLLZI;
    public final ECommerceMessage LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public C71218RxG(long j, XKQ xkq, ECommerceMessage ecMessage) {
        o.LJIIIZ(ecMessage, "ecMessage");
        this.LJLIL = j;
        this.LJLILLLLZI = xkq;
        this.LJLJI = ecMessage;
    }
}
