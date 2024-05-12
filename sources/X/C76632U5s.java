package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U5s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76632U5s implements InterfaceC76768UAy<LeaveGroupResult> {
    public final /* synthetic */ U7T LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(LeaveGroupResult value) {
        long j;
        o.LJIIIZ(value, "value");
        U7T u7t = this.LJLIL;
        U7T u7t2 = this.LJLIL;
        String str = this.LJLILLLLZI;
        u7t2.getClass();
        if (o.LJ(str, "rtc_error")) {
            j = 10011;
        } else {
            j = 0;
        }
        u7t.LLLLLLZZ(new DestroyChannelData(j, null, 2, null), null);
    }

    public C76632U5s(U7T u7t, String str) {
        this.LJLIL = u7t;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        long j;
        o.LJIIIZ(error, "error");
        U7T u7t = this.LJLIL;
        U7T u7t2 = this.LJLIL;
        String str = this.LJLILLLLZI;
        u7t2.getClass();
        if (o.LJ(str, "rtc_error")) {
            j = 10011;
        } else {
            j = 0;
        }
        u7t.LLLLLLZZ(new DestroyChannelData(j, null, 2, null), null);
    }
}
