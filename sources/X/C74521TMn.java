package X;

import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TMn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74521TMn extends AbstractC65781Prl implements InterfaceC65784Pro<C74518TMk> {
    public static final C74521TMn LJLIL = new C74521TMn();

    public C74521TMn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C74518TMk invoke() {
        C44372HbE provider = C44372HbE.LJLIL;
        C74524TMq effectPlatform = C74524TMq.LJLIL;
        TN1 stickerPanelSupplier = TN1.LJLIL;
        C36978EfG stickerNameSupplier = C36978EfG.LJLIL;
        TN2 emojiPanelSupplier = TN2.LJLIL;
        C36979EfH emojiNameSupplier = C36979EfH.LJLIL;
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(stickerPanelSupplier, "stickerPanelSupplier");
        o.LJIIIZ(stickerNameSupplier, "stickerNameSupplier");
        o.LJIIIZ(emojiPanelSupplier, "emojiPanelSupplier");
        o.LJIIIZ(emojiNameSupplier, "emojiNameSupplier");
        C74518TMk c74518TMk = new C74518TMk(effectPlatform, new AqS72S0400000_12(stickerPanelSupplier, stickerNameSupplier, emojiPanelSupplier, emojiNameSupplier, 33));
        o.LJIIIZ(provider, "provider");
        c74518TMk.LIZ = provider;
        return c74518TMk;
    }
}
