package X;

import com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler;
import kotlin.jvm.internal.o;

/* renamed from: X.Uy8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78916Uy8 extends AbstractC65781Prl implements InterfaceC88472Yns<F4V, Boolean> {
    public static final C78916Uy8 INSTANCE = new C78916Uy8();

    public C78916Uy8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Boolean invoke(F4V f4v) {
        return Boolean.valueOf(invoke2(f4v));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final boolean invoke2(F4V it) {
        o.LJIIIZ(it, "it");
        return it instanceof StickerVideoStatusHandler;
    }
}
