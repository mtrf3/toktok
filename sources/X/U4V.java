package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U4V implements InterfaceC76768UAy<ReplyInviteGroupResult> {
    public final /* synthetic */ C75952TrQ LJLIL;
    public final /* synthetic */ U65 LJLILLLLZI;
    public final /* synthetic */ InterfaceC75414Tik<ReplyInviteGroupResult> LJLJI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(ReplyInviteGroupResult value) {
        String cohostLayoutId;
        o.LJIIIZ(value, "value");
        if (this.LJLIL.LJLJJI == 1) {
            U8H LJFF = this.LJLILLLLZI.LJFF();
            if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled() && this.LJLILLLLZI.LLIIJI().LJJIIZI().size() == 2) {
                cohostLayoutId = "2003";
            } else {
                cohostLayoutId = MultiCohostAreaExpandSetting.INSTANCE.getCohostLayoutId();
            }
            LJFF.A1(cohostLayoutId, true);
        }
        InterfaceC75414Tik<ReplyInviteGroupResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75414Tik<ReplyInviteGroupResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }

    public U4V(C75952TrQ c75952TrQ, U65 u65, InterfaceC75414Tik<ReplyInviteGroupResult> interfaceC75414Tik) {
        this.LJLIL = c75952TrQ;
        this.LJLILLLLZI = u65;
        this.LJLJI = interfaceC75414Tik;
    }
}
