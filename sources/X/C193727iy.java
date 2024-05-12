package X;

import com.ss.android.ugc.aweme.nows.feed.ui.NowPostCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193727iy extends AbstractC65781Prl implements InterfaceC88471Ynr<NowPostCoverAssem, C7NN, C76800UCe> {
    public static final C193727iy LJLIL = new C193727iy();

    public C193727iy() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowPostCoverAssem nowPostCoverAssem, C7NN it) {
        NowPostCoverAssem selectSubscribe = nowPostCoverAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (it == C7NN.VISIBLE_ENOUGH) {
            selectSubscribe.D4();
        }
        return C76800UCe.LIZ;
    }
}
