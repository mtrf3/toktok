package X;

import com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201757vv extends AbstractC65781Prl implements InterfaceC88471Ynr<ReportVideoMaskAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C201757vv INSTANCE = new C201757vv();

    public C201757vv() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ReportVideoMaskAssem selectSubscribeOnAsync, C43I<C76800UCe> c43i) {
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (C53324KwK.LIZ() && c43i == null) {
            return;
        }
        selectSubscribeOnAsync.p4().kv0();
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(ReportVideoMaskAssem reportVideoMaskAssem, C43I<? extends C76800UCe> c43i) {
        invoke2(reportVideoMaskAssem, (C43I<C76800UCe>) c43i);
        return C76800UCe.LIZ;
    }
}
