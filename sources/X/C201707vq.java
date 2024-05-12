package X;

import com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201707vq extends AbstractC65781Prl implements InterfaceC88471Ynr<ReportVideoMaskAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C201707vq LJLIL = new C201707vq();

    public C201707vq() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(ReportVideoMaskAssem reportVideoMaskAssem, C43I<? extends Boolean> c43i) {
        ReportVideoMaskAssem selectSubscribeOnAsync = reportVideoMaskAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        o.LJIIIZ(it, "it");
        if (!C53324KwK.LIZ() || ((Boolean) it.LIZ).booleanValue()) {
            ReportVideoMaskVM p4 = selectSubscribeOnAsync.p4();
            p4.getClass();
            p4.withState(new AqS169S0100000_3(p4, 623));
        }
        return C76800UCe.LIZ;
    }
}
