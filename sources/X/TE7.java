package X;

import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TE7 implements InterfaceC74398THu {
    public final /* synthetic */ BaseStickerListViewModel LJLIL;

    public TE7(BaseStickerListViewModel baseStickerListViewModel) {
        this.LJLIL = baseStickerListViewModel;
    }

    @Override // X.InterfaceC74398THu
    public final void LLILLIZIL(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LJLIL.jv0(effect, TEA.DOWNLOADING, null);
    }

    @Override // X.InterfaceC74398THu
    public final void onSuccess(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LJLIL.jv0(effect, TEA.DOWNLOAD_SUCCESS, null);
    }

    @Override // X.InterfaceC74398THu
    public final void LJFF(int i, Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LJLIL.jv0(effect, TEA.DOWNLOADING, Integer.valueOf(i));
    }

    @Override // X.InterfaceC74398THu
    public final void LJLIIL(Effect effect, ExceptionResult exceptionResult) {
        o.LJIIIZ(effect, "effect");
        this.LJLIL.jv0(effect, TEA.DOWNLOAD_FAILED, null);
        this.LJLIL.LJLJJLL.setValue(new C45927I0t<>(effect));
    }
}
