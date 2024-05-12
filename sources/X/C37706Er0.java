package X;

import com.bytedance.vmsdk.jsbridge.utils.ReadableArray;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;

/* renamed from: X.Er0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37706Er0 implements InterfaceC37709Er3 {
    public static final C1UB<C37706Er0> LIZJ = new C1UB<>(10);
    public ReadableArray LIZ;
    public int LIZIZ = -1;

    @Override // X.InterfaceC37709Er3
    public final ReadableType getType() {
        ReadableArray readableArray = this.LIZ;
        if (readableArray != null) {
            return readableArray.getType(this.LIZIZ);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }
}
