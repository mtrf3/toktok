package X;

import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.Tqf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75905Tqf implements InterfaceC75414Tik<LeaveChannelResult> {
    public final /* synthetic */ C75878TqE LJLIL;
    public final /* synthetic */ C76012TsO LJLILLLLZI;
    public final /* synthetic */ InterfaceC75414Tik<LeaveChannelResult> LJLJI;
    public final /* synthetic */ MultiHostMultiAdapterImpl LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(LeaveChannelResult leaveChannelResult) {
        LeaveChannelResult value = leaveChannelResult;
        o.LJIIIZ(value, "value");
        C75878TqE c75878TqE = this.LJLIL;
        String str = this.LJLILLLLZI.LIZ;
        if (str == null) {
            str = "";
        }
        c75878TqE.LJJJLZIJ(str, value.logId);
        InterfaceC75414Tik<LeaveChannelResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        C75878TqE c75878TqE = this.LJLIL;
        c75878TqE.LJIIJ(th);
        c75878TqE.LJIIJJI();
        c75878TqE.LJIILLIIL("leave_failed");
        InterfaceC75414Tik<LeaveChannelResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        this.LJLJJI.LLJJ("leave_failed");
    }

    public C75905Tqf(C75878TqE c75878TqE, C76012TsO c76012TsO, InterfaceC75414Tik<LeaveChannelResult> interfaceC75414Tik, MultiHostMultiAdapterImpl multiHostMultiAdapterImpl) {
        this.LJLIL = c75878TqE;
        this.LJLILLLLZI = c76012TsO;
        this.LJLJI = interfaceC75414Tik;
        this.LJLJJI = multiHostMultiAdapterImpl;
    }
}
