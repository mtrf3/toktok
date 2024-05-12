package X;

import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ME5 extends AbstractC65781Prl implements InterfaceC88471Ynr<EdgeSpeedupAssem, C43I<? extends String>, C76800UCe> {
    public static final ME5 LJLIL = new ME5();

    public ME5() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EdgeSpeedupAssem edgeSpeedupAssem, C43I<? extends String> c43i) {
        EdgeSpeedupAssem selectSubscribe = edgeSpeedupAssem;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && c43i2.LIZ != 0) {
            selectSubscribe.LLIIIILZ = true;
        }
        return C76800UCe.LIZ;
    }
}
