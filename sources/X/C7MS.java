package X;

import Y.ARunnableS22S0200000_3;
import com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7MS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7MS extends AbstractC65781Prl implements InterfaceC88471Ynr<NowShareBottomAssem, C43I<? extends OSZ<? extends C80H, ? extends Object>>, C76800UCe> {
    public static final C7MS LJLIL = new C7MS();

    public C7MS() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowShareBottomAssem nowShareBottomAssem, C43I<? extends OSZ<? extends C80H, ? extends Object>> c43i) {
        NowShareBottomAssem selectSubscribe = nowShareBottomAssem;
        C43I<? extends OSZ<? extends C80H, ? extends Object>> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 == null) {
            C7MK.LJII("now_share_highlight_click", new AqS169S0100000_3(selectSubscribe, 352));
            selectSubscribe.q4();
            selectSubscribe.m4();
        } else {
            C35570Dxe.LIZ(new ARunnableS22S0200000_3(selectSubscribe, c43i2, 21), selectSubscribe.Y3().findViewById(R.id.jt3).findViewById(R.id.jtc));
        }
        return C76800UCe.LIZ;
    }
}
