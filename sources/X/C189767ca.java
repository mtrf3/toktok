package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.nows.feed.ui.NowAddPostButtonAssem;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189767ca extends AbstractC65781Prl implements InterfaceC88471Ynr<NowAddPostButtonAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C189767ca LJLIL = new C189767ca();

    public C189767ca() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowAddPostButtonAssem nowAddPostButtonAssem, C43I<? extends Integer> c43i) {
        NowAddPostButtonAssem selectSubscribe = nowAddPostButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLFF = true;
            C8YN.LJIJI((AssemViewModel) selectSubscribe.LL.LIZ(selectSubscribe, NowAddPostButtonAssem.LLFFF[0]), new AqS13S2100000_3(selectSubscribe, "show", 12));
        }
        return C76800UCe.LIZ;
    }
}
