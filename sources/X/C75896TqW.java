package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostCrossUserInfoFixSetting;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.TqW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75896TqW implements InterfaceC75414Tik<PermitApplyGroupResult> {
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLIL;
    public final /* synthetic */ C75951TrP LJLILLLLZI;
    public final /* synthetic */ InterfaceC75414Tik<PermitApplyGroupResult> LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(PermitApplyGroupResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApplyGroup");
        LIZ.append(", onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLIL.LJLJLLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJJLIIIJLLLLLLLZ = this.LJLILLLLZI.LJLILLLLZI;
            linkCrossRoomDataHolder.LJJLIIJ = C44432HcC.LJI();
        }
        InterfaceC75414Tik<PermitApplyGroupResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
        if (!this.LJLJJI && LiveCohostCrossUserInfoFixSetting.INSTANCE.isEnable()) {
            this.LJLIL.LLJLLIL(this.LJLILLLLZI.LJLILLLLZI, i0.LJFF("permitApplyGroup", ", permitStatus not agree"));
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApplyGroup");
        LIZ.append(", onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<PermitApplyGroupResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        if (LiveCohostCrossUserInfoFixSetting.INSTANCE.isEnable()) {
            this.LJLIL.LLJLLIL(this.LJLILLLLZI.LJLILLLLZI, i0.LJFF("permitApplyGroup", ", permitApply Failed"));
        }
    }

    public C75896TqW(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, C75951TrP c75951TrP, IDo0S413S0100000_13 iDo0S413S0100000_13, boolean z) {
        this.LJLIL = multiHostCrossAdapterImpl;
        this.LJLILLLLZI = c75951TrP;
        this.LJLJI = iDo0S413S0100000_13;
        this.LJLJJI = z;
    }
}
