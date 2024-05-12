package X;

import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.919, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass919 extends AbstractC65781Prl implements InterfaceC88471Ynr<CellStickerManagerComponent, C43I<? extends Long>, C76800UCe> {
    public static final AnonymousClass919 LJLIL = new AnonymousClass919();

    public AnonymousClass919() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(CellStickerManagerComponent cellStickerManagerComponent, C43I<? extends Long> c43i) {
        CellStickerManagerComponent selectSubscribe = cellStickerManagerComponent;
        C43I<? extends Long> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            C245639kV c4 = selectSubscribe.c4();
            ((Number) c43i2.LIZ).longValue();
            AbsInteractStickerWidget absInteractStickerWidget = c4.LJIILIIL;
            if (absInteractStickerWidget != null) {
                absInteractStickerWidget.LJIILL();
            }
        }
        return C76800UCe.LIZ;
    }
}
