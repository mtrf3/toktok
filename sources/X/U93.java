package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkJoinChannelRetryCount;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U93<T1, T2> implements InterfaceC73786Sxa {
    public final /* synthetic */ C72242sW LJLIL;

    public U93(C72242sW c72242sW) {
        this.LJLIL = c72242sW;
    }

    @Override // X.InterfaceC73786Sxa
    public final boolean test(Object obj, Object obj2) {
        Integer count = (Integer) obj;
        o.LJIIIZ(count, "count");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        this.LJLIL.element++;
        if (count.intValue() <= LinkMicSdkJoinChannelRetryCount.getValue()) {
            return true;
        }
        return false;
    }
}
