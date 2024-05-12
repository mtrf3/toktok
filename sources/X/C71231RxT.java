package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.RxT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71231RxT extends F9E {
    public final ECommerceMessage LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C71231RxT(ECommerceMessage ecMessage) {
        o.LJIIIZ(ecMessage, "ecMessage");
        this.LJLIL = ecMessage;
        this.LJLILLLLZI = false;
    }
}
