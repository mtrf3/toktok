package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;
import webcast.data.multilive_biz.BizResumeParams;

/* renamed from: X.U5r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76631U5r implements InterfaceC76768UAy<DestroyChannelResult> {
    public final /* synthetic */ U7T LJLIL;
    public final /* synthetic */ CreateChannelData LJLILLLLZI;
    public final /* synthetic */ InterfaceC76768UAy<CreateChannelResult> LJLJI;
    public final /* synthetic */ BizResumeParams LJLJJI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(DestroyChannelResult value) {
        o.LJIIIZ(value, "value");
        this.LJLIL.j(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJJJJI = U7T.LJJJJI(655);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroyChannel failed for handleResumeFailed, throwable:");
        LIZ.append(th);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
    }

    public C76631U5r(InterfaceC76768UAy interfaceC76768UAy, CreateChannelData createChannelData, U7T u7t, BizResumeParams bizResumeParams) {
        this.LJLIL = u7t;
        this.LJLILLLLZI = createChannelData;
        this.LJLJI = interfaceC76768UAy;
        this.LJLJJI = bizResumeParams;
    }
}
