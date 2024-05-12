package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83488Wpg implements InterfaceC83500Wps {
    public final /* synthetic */ C72242sW LIZ;
    public final /* synthetic */ AqS164S0100000_14 LIZIZ;

    @Override // X.InterfaceC83500Wps
    public final void LIZ() {
        ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJJI().LIZIZ();
    }

    @Override // X.InterfaceC83500Wps
    public final void LIZLLL() {
        int i;
        InterfaceC83485Wpd interfaceC83485Wpd;
        ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJIILIIL();
        C83493Wpl LJJI = ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJJI();
        C83483Wpb c83483Wpb = ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJLJLLL;
        if (c83483Wpb != null) {
            i = ((ArrayList) c83483Wpb.LJI.LJLJJI).size();
        } else {
            i = -1;
        }
        LJJI.LJI = i;
        LJJI.LIZLLL = System.currentTimeMillis();
        if (LJJI.LIZJ() && (interfaceC83485Wpd = ((UploadPicStickerARPresenter) this.LIZIZ.l0).LLILLL) != null) {
            interfaceC83485Wpd.LJIJ(LJJI.LIZ());
        }
        LJJI.LIZIZ();
        UploadPicStickerARPresenter uploadPicStickerARPresenter = (UploadPicStickerARPresenter) this.LIZIZ.l0;
        uploadPicStickerARPresenter.LJZL = true;
        uploadPicStickerARPresenter.LJLLI = true;
        C83483Wpb c83483Wpb2 = uploadPicStickerARPresenter.LJLJLLL;
        if (c83483Wpb2 != null) {
            c83483Wpb2.LJFF();
        }
        String invoke = uploadPicStickerARPresenter.LLJJI.invoke();
        C83483Wpb c83483Wpb3 = uploadPicStickerARPresenter.LJLJLLL;
        if (c83483Wpb3 != null && invoke.length() > 0) {
            c83483Wpb3.LJII(invoke);
        }
    }

    @Override // X.InterfaceC83500Wps
    public final void LIZIZ(List<String> list) {
        if (!list.isEmpty()) {
            ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJJI().LIZJ = System.currentTimeMillis();
            ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJLL.addAll(list);
            ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJJIJ(list);
            return;
        }
        UploadPicStickerARPresenter uploadPicStickerARPresenter = (UploadPicStickerARPresenter) this.LIZIZ.l0;
        uploadPicStickerARPresenter.LJLLI = true;
        C83483Wpb c83483Wpb = uploadPicStickerARPresenter.LJLJLLL;
        if (c83483Wpb != null) {
            c83483Wpb.LJFF();
        }
        String invoke = uploadPicStickerARPresenter.LLJJI.invoke();
        C83483Wpb c83483Wpb2 = uploadPicStickerARPresenter.LJLJLLL;
        if (c83483Wpb2 != null && invoke.length() > 0) {
            c83483Wpb2.LJII(invoke);
        }
        ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJJI().getClass();
        ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJJI().LIZIZ();
    }

    @Override // X.InterfaceC83500Wps
    public final void LIZJ(C83489Wph c83489Wph) {
        C83483Wpb c83483Wpb;
        String str;
        C83483Wpb c83483Wpb2;
        if (((UploadPicStickerARPresenter) this.LIZIZ.l0).LJZL) {
            this.LIZ.element = SystemClock.uptimeMillis();
            ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJJI().LJ = System.currentTimeMillis();
            ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJZL = false;
        }
        if (SystemClock.uptimeMillis() - this.LIZ.element < 5000) {
            UploadPicStickerARPresenter uploadPicStickerARPresenter = (UploadPicStickerARPresenter) this.LIZIZ.l0;
            int i = uploadPicStickerARPresenter.LJZ;
            int i2 = uploadPicStickerARPresenter.LJZI;
            int i3 = c83489Wph.LIZJ;
            if (i > i3 || i2 < i3) {
                if (i3 > 0) {
                    ((ArrayList) uploadPicStickerARPresenter.LLD).add(c83489Wph);
                    return;
                }
                return;
            }
            Effect effect = uploadPicStickerARPresenter.LJLJL;
            if (effect == null || (str = effect.getEffectId()) == null) {
                str = "";
            }
            if (TextUtils.isEmpty(c83489Wph.LIZLLL) || !o.LJ(c83489Wph.LIZLLL, str) || (c83483Wpb2 = ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJLJLLL) == null) {
                return;
            }
            c83483Wpb2.LIZ(c83489Wph);
            return;
        }
        ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJIILIIL();
        if (c83489Wph.LIZJ <= 0 || (c83483Wpb = ((UploadPicStickerARPresenter) this.LIZIZ.l0).LJLJLLL) == null) {
            return;
        }
        c83483Wpb.LIZ(c83489Wph);
    }

    public C83488Wpg(C72242sW c72242sW, AqS164S0100000_14 aqS164S0100000_14) {
        this.LIZ = c72242sW;
        this.LIZIZ = aqS164S0100000_14;
    }
}
