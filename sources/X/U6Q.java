package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6Q implements InterfaceC76768UAy<LeaveChannelResult> {
    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(LeaveChannelResult value) {
        o.LJIIIZ(value, "value");
    }
}
