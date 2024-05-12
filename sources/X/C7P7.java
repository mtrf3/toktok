package X;

import com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7P7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7P7 extends AbstractC65781Prl implements InterfaceC88472Yns<C8VL, C76800UCe> {
    public static final C7P7 LJLIL = new C7P7();

    public C7P7() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8VL c8vl) {
        C8VL dynamicAssemConfig = c8vl;
        o.LJIIIZ(dynamicAssemConfig, "$this$dynamicAssemConfig");
        dynamicAssemConfig.LIZ = C65352Pkq.LIZ(DetailPageContainerAssem.class);
        dynamicAssemConfig.LJI("header", C185007Nw.LJLIL);
        dynamicAssemConfig.LJI("navbar", C7P6.LJLIL);
        dynamicAssemConfig.LJI("content", C7P9.LJLIL);
        dynamicAssemConfig.LJI("status", C7P8.LJLIL);
        return C76800UCe.LIZ;
    }
}
