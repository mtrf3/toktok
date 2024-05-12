package X;

import Y.AObjectS119S0200000_14;
import android.content.Intent;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83494Wpm implements InterfaceC144185lG {
    public final /* synthetic */ AqS164S0100000_14 LJLIL;

    public C83494Wpm(AqS164S0100000_14 aqS164S0100000_14) {
        this.LJLIL = aqS164S0100000_14;
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        Boolean bool;
        if (i == 10001 || i == 10004) {
            InterfaceC83524WqG interfaceC83524WqG = ((UploadPicStickerARPresenter) this.LJLIL.l0).LLILZIL;
            if (interfaceC83524WqG != null) {
                interfaceC83524WqG.LIZ();
            }
            if (intent != null && i2 == -1) {
                ((UploadPicStickerARPresenter) this.LJLIL.l0).getClass();
                List<IB3> LIZ = ((UploadPicStickerARPresenter) this.LJLIL.l0).LLIIJLIL.LIZ(intent);
                if (LIZ != null) {
                    String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "click_content");
                    if (LLJJIJIIJIL == null) {
                        LLJJIJIIJIL = "";
                    }
                    UploadPicStickerARPresenter uploadPicStickerARPresenter = (UploadPicStickerARPresenter) this.LJLIL.l0;
                    InterfaceC83485Wpd interfaceC83485Wpd = uploadPicStickerARPresenter.LLILLL;
                    if (interfaceC83485Wpd != null) {
                        Effect effect = uploadPicStickerARPresenter.LJLJL;
                        if (effect != null) {
                            effect.getEffectId();
                        }
                        LIZ.size();
                        interfaceC83485Wpd.onComplete(LLJJIJIIJIL);
                    }
                    C0IB<Boolean> c0ib = ((UploadPicStickerARPresenter) this.LJLIL.l0).LLILIL;
                    if (c0ib != null) {
                        bool = c0ib.LIZ();
                    } else {
                        bool = null;
                    }
                    if (o.LJ(bool, Boolean.FALSE)) {
                        UploadPicStickerARPresenter uploadPicStickerARPresenter2 = (UploadPicStickerARPresenter) this.LJLIL.l0;
                        uploadPicStickerARPresenter2.LLILIL.LIZIZ(uploadPicStickerARPresenter2.LLIIII, new AObjectS119S0200000_14(LIZ, this, 14));
                        return true;
                    }
                    ((UploadPicStickerARPresenter) this.LJLIL.l0).LJIIZILJ(LIZ);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
