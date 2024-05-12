package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.sticker_core.RecordFavoriteSticker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.ICe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46224ICe extends C81663W3f {
    public final C29S LJLLJ;
    public final TEZ LJLLL;
    public final InterfaceC74343TFr LJLLLL;
    public final THX LJLLLLLL;
    public final InterfaceC78118UlG LJLZ;
    public final InterfaceC65784Pro<TGD> LJZ;
    public final InterfaceC88471Ynr<Effect, Boolean, C76800UCe> LJZI;
    public final InterfaceC88472Yns<Effect, Boolean> LJZL;

    @Override // X.C81663W3f
    public final InterfaceC81664W3g LJIILL(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        C29S c29s = this.LJLLJ;
        TEZ tez = this.LJLLL;
        InterfaceC74343TFr interfaceC74343TFr = this.LJLLLL;
        THX thx = this.LJLLLLLL;
        View findViewById = stickerView.findViewById(R.id.fm_);
        o.LJIIIIZZ(findViewById, "stickerView.findViewById…R.id.layout_sticker_like)");
        View findViewById2 = stickerView.findViewById(R.id.ek2);
        o.LJIIIIZZ(findViewById2, "stickerView.findViewById…er.R.id.img_sticker_like)");
        return new RecordFavoriteSticker(c29s, tez, interfaceC74343TFr, thx, (FrameLayout) findViewById, (C81658W3a) findViewById2, this.LJLZ, this.LJZ, this.LJZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46224ICe(C29S activity, THX thx, InterfaceC74343TFr stickerMobHelper, TEZ stickerDataManager, InterfaceC78118UlG interfaceC78118UlG, AqS157S0100000_7 aqS157S0100000_7, AqS173S0100000_7 aqS173S0100000_7, AqS189S0100000_7 aqS189S0100000_7) {
        super(activity, thx, stickerDataManager, stickerMobHelper, interfaceC78118UlG, null, aqS173S0100000_7, aqS157S0100000_7, 32);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(stickerMobHelper, "stickerMobHelper");
        this.LJLLJ = activity;
        this.LJLLL = stickerDataManager;
        this.LJLLLL = stickerMobHelper;
        this.LJLLLLLL = thx;
        this.LJLZ = interfaceC78118UlG;
        this.LJZ = aqS157S0100000_7;
        this.LJZI = aqS189S0100000_7;
        this.LJZL = aqS173S0100000_7;
    }
}
