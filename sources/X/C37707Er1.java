package X;

import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;

/* renamed from: X.Er1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37707Er1 implements InterfaceC37709Er3 {
    public static final C1UB<C37707Er1> LIZJ = new C1UB<>(10);
    public ReadableMap LIZ;
    public String LIZIZ;

    @Override // X.InterfaceC37709Er3
    public final ReadableType getType() {
        String str;
        ReadableMap readableMap = this.LIZ;
        if (readableMap != null && (str = this.LIZIZ) != null) {
            return readableMap.getType(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }
}
