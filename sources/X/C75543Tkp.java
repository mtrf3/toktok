package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostCmdDismissLinkDialogEvent;
import com.bytedance.android.live.liveinteract.platform.core.LinkerManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Tkp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75543Tkp implements InterfaceC75230Tfm {
    public final /* synthetic */ DataChannel LIZ;
    public final /* synthetic */ LinkerManager LIZIZ;
    public final /* synthetic */ C75749To9 LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ LifecycleOwner LJ;
    public final /* synthetic */ InterfaceC75754ToE LJFF;
    public final /* synthetic */ Context LJI;

    @Override // X.InterfaceC75230Tfm
    public final void LIZ() {
        this.LIZ.pv0(CoHostCmdDismissLinkDialogEvent.class);
    }

    @Override // X.InterfaceC75230Tfm
    public final void LIZIZ() {
        InterfaceC30442Bx8.N.LIZ(Boolean.TRUE);
        LinkerManager linkerManager = this.LIZIZ;
        DataChannel dataChannel = this.LIZ;
        C75749To9 c75749To9 = this.LIZJ;
        C75806Tp4.LJII(this.LIZLLL, this.LJI, this.LJ, c75749To9, this.LJFF, linkerManager, dataChannel);
    }

    public C75543Tkp(long j, Context context, LifecycleOwner lifecycleOwner, C75749To9 c75749To9, C75544Tkq c75544Tkq, LinkerManager linkerManager, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = linkerManager;
        this.LIZJ = c75749To9;
        this.LIZLLL = j;
        this.LJ = lifecycleOwner;
        this.LJFF = c75544Tkq;
        this.LJI = context;
    }
}
