package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TMX extends TMY<List<? extends RTW>> implements TN3 {
    public final InterfaceC65784Pro<String> LIZJ;
    public final InterfaceC65784Pro<String> LIZLLL;
    public final InterfaceC65784Pro<String> LJ;
    public final InterfaceC65784Pro<String> LJFF;

    @Override // X.TMY
    public final AbstractC73672Svk<List<RTW>> LJIIIIZZ() {
        return AbstractC73672Svk.LJJIJIL(C47261Igj.LJJIJIIJI(new TFO(this.LIZJ.invoke(), this.LIZLLL.invoke()), new C69610RTq(this.LJ.invoke(), this.LJFF.invoke())));
    }

    public TMX(InterfaceC65784Pro<String> stickerPanelSupplier, InterfaceC65784Pro<String> stickerNameSupplier, InterfaceC65784Pro<String> emojiPanelSupplier, InterfaceC65784Pro<String> emojiNameSupplier) {
        o.LJIIIZ(stickerPanelSupplier, "stickerPanelSupplier");
        o.LJIIIZ(stickerNameSupplier, "stickerNameSupplier");
        o.LJIIIZ(emojiPanelSupplier, "emojiPanelSupplier");
        o.LJIIIZ(emojiNameSupplier, "emojiNameSupplier");
        this.LIZJ = stickerPanelSupplier;
        this.LIZLLL = stickerNameSupplier;
        this.LJ = emojiPanelSupplier;
        this.LJFF = emojiNameSupplier;
    }
}
