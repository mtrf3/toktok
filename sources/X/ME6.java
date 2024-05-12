package X;

import Y.ARunnableS45S0100000_9;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ME6 extends AbstractC65781Prl implements InterfaceC88471Ynr<EdgeSpeedupAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final ME6 LJLIL = new ME6();

    public ME6() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EdgeSpeedupAssem edgeSpeedupAssem, C43I<? extends C195357lb> c43i) {
        EdgeSpeedupAssem selectSubscribeOnAsync = edgeSpeedupAssem;
        C43I<? extends C195357lb> c43i2 = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c43i2 != null && c43i2.LIZ != 0) {
            selectSubscribeOnAsync.LLIIIILZ = false;
            C1DH.LJJIJIIJI(new ARunnableS45S0100000_9(selectSubscribeOnAsync, 35));
        }
        return C76800UCe.LIZ;
    }
}
