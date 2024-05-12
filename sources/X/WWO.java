package X;

import com.ss.android.ugc.gamora.recorder.navi.DynamicSelectorHandler;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WWO extends AbstractC65781Prl implements InterfaceC88472Yns<F4V, Boolean> {
    public static final WWO INSTANCE = new WWO();

    public WWO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Boolean invoke(F4V f4v) {
        return Boolean.valueOf(invoke2(f4v));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final boolean invoke2(F4V it) {
        o.LJIIIZ(it, "it");
        return it instanceof DynamicSelectorHandler;
    }
}
