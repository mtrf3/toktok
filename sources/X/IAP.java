package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IAP extends C82640Wc0 implements InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe> {
    public final InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IAP(InterfaceC81640W2i interfaceC81640W2i, LifecycleOwner lifecycleOwner, EnumC45994I3i recordMode, InterfaceC88474Ynu<? super Integer, ? super Integer, ? super String, ? super VERecorder, C76800UCe> interfaceC88474Ynu) {
        super(interfaceC81640W2i, lifecycleOwner, recordMode);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(recordMode, "recordMode");
        this.LJLJI = interfaceC88474Ynu;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Integer num, Integer num2, String str, VERecorder vERecorder) {
        VERecorder p4 = vERecorder;
        o.LJIIIZ(p4, "p4");
        LIZIZ(new IAQ(this, num.intValue(), num2.intValue(), str, p4));
        return C76800UCe.LIZ;
    }
}
