package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class U6D implements U66 {
    public volatile InterfaceC65784Pro<Boolean> LIZ;
    public volatile InterfaceC65784Pro<C75745To5> LIZIZ;
    public volatile InterfaceC65784Pro<LayoutInfo> LIZJ;
    public InterfaceC65784Pro<Boolean> LIZLLL;

    @Override // X.U66
    public boolean LLLLJI() {
        return false;
    }

    @Override // X.U66
    public boolean LLLLLILLIL() {
        return false;
    }

    @Override // X.U66
    public void LLLLLLJ(long j) {
    }

    @Override // X.U66
    public boolean LLLLZLLIL() {
        return false;
    }

    @Override // X.U66
    public void LLLZLL(String str, InterfaceC76768UAy<RechargeResult> interfaceC76768UAy) {
    }

    @Override // X.U66
    public boolean LLZLLIL() {
        return false;
    }

    @Override // X.U66
    public DSLConfig LLZZZIL() {
        return null;
    }

    @Override // X.U66
    public boolean n8() {
        return false;
    }

    @Override // X.U66
    public void reset() {
    }

    @Override // X.U66
    public java.util.Set<Long> LLLLLJLJLL() {
        return new LinkedHashSet();
    }

    @Override // X.U66
    public final LayoutInfo LLLZI() {
        LayoutInfo invoke;
        InterfaceC65784Pro<LayoutInfo> interfaceC65784Pro = this.LIZJ;
        if (interfaceC65784Pro == null || (invoke = interfaceC65784Pro.invoke()) == null) {
            return new LayoutInfo("", null, null, 0);
        }
        return invoke;
    }

    @Override // X.U66
    public final boolean LLZILL() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro != null) {
            return interfaceC65784Pro.invoke().booleanValue();
        }
        return true;
    }

    @Override // X.U66
    public void LLLLL(U6Y listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.U66
    public final void LLLLLLL(InterfaceC65784Pro<Boolean> autoJoin) {
        o.LJIIIZ(autoJoin, "autoJoin");
        this.LIZ = autoJoin;
    }

    @Override // X.U66
    public final void LLLLLLLLLL(AqS163S0100000_13 aqS163S0100000_13) {
        this.LIZLLL = aqS163S0100000_13;
    }

    @Override // X.U66
    public final void b(AqS163S0100000_13 aqS163S0100000_13) {
        this.LIZIZ = aqS163S0100000_13;
    }

    @Override // X.U66
    public final void n(InterfaceC65784Pro<LayoutInfo> interfaceC65784Pro) {
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.U66
    public void LLLLLZIL(PermitApplyData data, C76600U4m c76600U4m) {
        o.LJIIIZ(data, "data");
    }

    @Override // X.U66
    public void LLLLLZL(DirectJoinData joinData, C76637U5x c76637U5x) {
        o.LJIIIZ(joinData, "joinData");
    }

    @Override // X.U66
    public void a(JoinChannelData data, U6B u6b) {
        o.LJIIIZ(data, "data");
    }

    @Override // X.U66
    public void l(KickOutData data, C76599U4l c76599U4l) {
        o.LJIIIZ(data, "data");
    }

    @Override // X.U66
    public void LLLLZLLLI(InviteData data, C76595U4h c76595U4h, InterfaceC65784Pro canPreJoinChannelAction) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(canPreJoinChannelAction, "canPreJoinChannelAction");
    }
}
