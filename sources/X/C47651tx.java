package X;

import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.1tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47651tx extends AbstractC65781Prl implements InterfaceC88472Yns<C1MX, C76800UCe> {
    public final /* synthetic */ StickerShortCutWidget LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47651tx(StickerShortCutWidget stickerShortCutWidget) {
        super(1);
        this.LJLIL = stickerShortCutWidget;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C1MX c1mx) {
        LiveEffect liveEffect;
        C1MX it = c1mx;
        o.LJIIIZ(it, "it");
        StickerShortCutWidget stickerShortCutWidget = this.LJLIL;
        stickerShortCutWidget.LJZ = it.LJLJJI;
        stickerShortCutWidget.LJZI = it.LJLJI;
        if (stickerShortCutWidget.isShowing()) {
            StickerShortCutWidget stickerShortCutWidget2 = this.LJLIL;
            if (stickerShortCutWidget2.LJZ) {
                stickerShortCutWidget2.LLFF();
            } else if (it.LJLJI && (liveEffect = stickerShortCutWidget2.LJZL) != null && !o.LJ(stickerShortCutWidget2.LJLLLL, liveEffect)) {
                if (ORZ.LJLJJI(stickerShortCutWidget2.LJZL, stickerShortCutWidget2.LLF().LJLIL)) {
                    C49531wz LLF = stickerShortCutWidget2.LLF();
                    LiveEffect liveEffect2 = stickerShortCutWidget2.LJZL;
                    if (liveEffect2 == null) {
                        LLF.getClass();
                    } else {
                        LLF.LLJJJIL();
                        LLF.LLJJIJIIJIL(liveEffect2);
                        LLF.LLIL(liveEffect2);
                    }
                } else {
                    LiveEffect liveEffect3 = new LiveEffect();
                    liveEffect3.setLocalViewType(C6NP.NONE);
                    List<? extends LiveEffect> LJJIJIL = C47261Igj.LJJIJIL(liveEffect3);
                    LiveEffect liveEffect4 = stickerShortCutWidget2.LJZL;
                    if (liveEffect4 != null) {
                        LJJIJIL.add(liveEffect4);
                    }
                    LJJIJIL.addAll(((ArrayList) stickerShortCutWidget2.LLF().LJLIL).subList(1, ((ArrayList) stickerShortCutWidget2.LLF().LJLIL).size()));
                    stickerShortCutWidget2.LLF().LLJLIL(LJJIJIL, stickerShortCutWidget2.LJZL, true);
                }
            }
        } else {
            StickerShortCutWidget stickerShortCutWidget3 = this.LJLIL;
            stickerShortCutWidget3.LJZI(new IDqS176S0200000(stickerShortCutWidget3, it, 28));
        }
        return C76800UCe.LIZ;
    }
}
