package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136725Ye extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ Bundle LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C136725Ye(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Bundle bundle, long j) {
        super(1);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = bundle;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        this.LJLIL.invoke();
        C145995oB LJI = C5QW.LJI(this.LJLILLLLZI, String.valueOf(this.LJLJI));
        if (LJI != null) {
            FMX.LJIIL("choose_shorter_video_popup_continue", LJI.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
