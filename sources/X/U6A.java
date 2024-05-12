package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ResumeResult;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6A implements InterfaceC76768UAy<ResumeResult> {
    public final /* synthetic */ U64 LJLIL;
    public final /* synthetic */ InterfaceC75414Tik<ResumeResult> LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(ResumeResult value) {
        String cohostLayoutId;
        o.LJIIIZ(value, "value");
        U8H LLJILJIL = this.LJLIL.LLJILJIL();
        U64 u64 = this.LJLIL;
        LinkUser.Builder builder = new LinkUser.Builder();
        builder.setLinkMicId(u64.LLJILJILJ().LLZL().getLinkMicId());
        builder.setRoomId(Long.valueOf(u64.LLJILJILJ().LLZL().getRoomId()));
        builder.setUserId(Long.valueOf(u64.LLJILJILJ().LLZL().getUserId()));
        LinkUser owner = builder.build();
        LLJILJIL.getClass();
        o.LJIIIZ(owner, "owner");
        LLJILJIL.LJIILLIIL = owner;
        U8H LLJILJIL2 = this.LJLIL.LLJILJIL();
        if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled() && ((C76130TuI) this.LJLIL.LLIIJI()).LJJIIZI().size() == 2) {
            cohostLayoutId = "2003";
        } else {
            cohostLayoutId = MultiCohostAreaExpandSetting.INSTANCE.getCohostLayoutId();
        }
        LLJILJIL2.A1(cohostLayoutId, true);
        InterfaceC75414Tik<ResumeResult> interfaceC75414Tik = this.LJLILLLLZI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    public U6A(U64 u64, InterfaceC75414Tik<ResumeResult> interfaceC75414Tik) {
        this.LJLIL = u64;
        this.LJLILLLLZI = interfaceC75414Tik;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75414Tik<ResumeResult> interfaceC75414Tik = this.LJLILLLLZI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
