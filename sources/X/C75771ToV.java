package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostCmdDismissLinkDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.ToV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75771ToV implements InterfaceC75230Tfm {
    public final /* synthetic */ DataChannel LIZ;
    public final /* synthetic */ View LIZIZ;
    public final /* synthetic */ InterfaceC75774ToY LIZJ;

    @Override // X.InterfaceC75230Tfm
    public final void LIZ() {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.pv0(CoHostCmdDismissLinkDialogEvent.class);
        }
    }

    @Override // X.InterfaceC75230Tfm
    public final void LIZIZ() {
        C75770ToU.LIZIZ(this.LIZIZ, this.LIZJ);
    }

    public C75771ToV(DataChannel dataChannel, View view, InterfaceC75774ToY interfaceC75774ToY) {
        this.LIZ = dataChannel;
        this.LIZIZ = view;
        this.LIZJ = interfaceC75774ToY;
    }
}
