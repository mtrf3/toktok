package X;

import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.C8p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30843C8p extends AbstractC65781Prl implements InterfaceC88472Yns {
    public static final C30843C8p LJLIL = new C30843C8p();

    public C30843C8p() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        boolean z;
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.data != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
