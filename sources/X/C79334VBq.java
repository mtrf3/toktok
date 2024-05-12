package X;

import Y.ARunnableS14S0301000_14;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFirstFrameCallbackInsertMqHeadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveParseSeiAsyncSetting;

/* renamed from: X.VBq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79334VBq implements InterfaceC79335VBr {
    public final /* synthetic */ VAE LJLIL;

    public C79334VBq(VAE vae) {
        this.LJLIL = vae;
    }

    @Override // X.InterfaceC79335VBr
    public final boolean LJIJJ(EnumC79337VBt enumC79337VBt) {
        InterfaceC79335VBr interfaceC79335VBr = this.LJLIL.LJLJI;
        if (interfaceC79335VBr != null) {
            return interfaceC79335VBr.LJIJJ(enumC79337VBt);
        }
        return false;
    }

    @Override // X.InterfaceC79335VBr
    public final void LJJJJJL(EnumC79337VBt enumC79337VBt, int i, Object obj) {
        if (enumC79337VBt == EnumC79337VBt.RENDERING_START && LiveFirstFrameCallbackInsertMqHeadSetting.INSTANCE.getValue()) {
            this.LJLIL.LJLJJLL.postAtFrontOfQueue(new ARunnableS14S0301000_14(this, enumC79337VBt, i, obj, 1));
            return;
        }
        if (enumC79337VBt == EnumC79337VBt.TEXTURE_RENDER_DRAW_FRAME) {
            this.LJLIL.LJLJJLL.postAtFrontOfQueue(new ARunnableS14S0301000_14(this, enumC79337VBt, i, obj, 2));
            return;
        }
        if (enumC79337VBt == EnumC79337VBt.SEI_UPDATE && LiveParseSeiAsyncSetting.INSTANCE.getValue().getThreadEnable()) {
            InterfaceC79335VBr interfaceC79335VBr = this.LJLIL.LJLJI;
            if (interfaceC79335VBr == null) {
                return;
            }
            interfaceC79335VBr.LJJJJJL(enumC79337VBt, i, obj);
            return;
        }
        this.LJLIL.LJLJJLL.post(new ARunnableS14S0301000_14(this, enumC79337VBt, i, obj, 3));
    }
}
