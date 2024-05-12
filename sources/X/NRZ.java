package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NRZ extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC59355NRf, Aweme> {
    public static final NRZ LJLIL = new NRZ();

    public NRZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Aweme invoke(InterfaceC59355NRf interfaceC59355NRf) {
        InterfaceC59355NRf inject = interfaceC59355NRf;
        o.LJIIIZ(inject, "$this$inject");
        return inject.getAweme();
    }
}
