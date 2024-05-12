package X;

import com.ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler;
import kotlin.jvm.internal.o;

/* renamed from: X.IAi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46176IAi extends AbstractC65781Prl implements InterfaceC88472Yns<F4V, Boolean> {
    public static final C46176IAi INSTANCE = new C46176IAi();

    public C46176IAi() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Boolean invoke(F4V f4v) {
        return Boolean.valueOf(invoke2(f4v));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final boolean invoke2(F4V it) {
        o.LJIIIZ(it, "it");
        return it instanceof VoiceRecognizeStickerHandler;
    }
}
