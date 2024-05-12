package X;

import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostEnableMatchResumeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.TqY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75898TqY implements InterfaceC75414Tik<CreateChannelResult> {
    public final /* synthetic */ String LJLIL = "onSessionCreate";
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLILLLLZI;
    public final /* synthetic */ InterfaceC75441TjB LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(CreateChannelResult createChannelResult) {
        MultiHostCrossAdapterImpl multiHostCrossAdapterImpl;
        InterfaceC75441TjB interfaceC75441TjB;
        CreateChannelResult value = createChannelResult;
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initLinkMicSession");
        LIZ.append(", source=");
        LIZ.append(this.LJLIL);
        LIZ.append(", createChannel success, result=");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (C76117Tu5.LIZIZ()) {
            C30868C9o.LJI("cross_arc channel success");
        }
        if (value.isResume && LiveCohostEnableMatchResumeSetting.INSTANCE.isEnableCoHostResume() && (interfaceC75441TjB = (multiHostCrossAdapterImpl = this.LJLILLLLZI).LJLJI) != null) {
            interfaceC75441TjB.LJJJI(new C75897TqX(multiHostCrossAdapterImpl, this.LJLJI));
        }
    }

    public C75898TqY(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, InterfaceC75441TjB interfaceC75441TjB) {
        this.LJLILLLLZI = multiHostCrossAdapterImpl;
        this.LJLJI = interfaceC75441TjB;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initLinkMicSession");
        LIZ.append(", source=");
        LIZ.append(this.LJLIL);
        LIZ.append(", createChannel fail, error=");
        LIZ.append(error);
        LIZ.append(", throwable=");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        C76271TwZ.LIZ.LJLJJI("create_channel");
        this.LJLILLLLZI.LJLJI = null;
        if (C76117Tu5.LIZIZ()) {
            C30868C9o.LJI("cross_arc channel fail");
        }
    }
}
