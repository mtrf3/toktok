package X;

import android.view.View;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.TFd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74329TFd extends AbstractViewOnClickListenerC55470Lpq {
    public final /* synthetic */ EffectInfoStickerHandler LJLJJI;
    public final /* synthetic */ Effect LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ InterfaceC74334TFi LJLJL;

    @Override // X.AbstractViewOnClickListenerC55470Lpq
    public final void LIZ(View view) {
        InterfaceC74330TFe LJ = this.LJLJJI.LJ();
        if (LJ != null) {
            LJ.QM(this.LJLJJL, this.LJLJJLL, this.LJLJL.getUid());
        }
    }

    public C74329TFd(EffectInfoStickerHandler effectInfoStickerHandler, Effect effect, String str, InterfaceC74334TFi interfaceC74334TFi) {
        this.LJLJJI = effectInfoStickerHandler;
        this.LJLJJL = effect;
        this.LJLJJLL = str;
        this.LJLJL = interfaceC74334TFi;
    }
}
