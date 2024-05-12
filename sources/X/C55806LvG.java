package X;

import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.LvG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55806LvG extends AbstractC65781Prl implements InterfaceC88471Ynr<EcVideoGuideAssem, C43I<? extends String>, C76800UCe> {
    public static final C55806LvG LJLIL = new C55806LvG();

    public C55806LvG() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EcVideoGuideAssem ecVideoGuideAssem, C43I<? extends String> c43i) {
        EnumC223268pW enumC223268pW;
        EcVideoGuideAssem selectSubscribe = ecVideoGuideAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            IAutoAScrollAbility LIZ = C224888s8.LIZ(C212428Vi.LIZ(selectSubscribe));
            if (LIZ != null) {
                enumC223268pW = LIZ.dl();
            } else {
                enumC223268pW = null;
            }
            if (enumC223268pW != EnumC223268pW.AUTO_SCROLL_STATE_START) {
                selectSubscribe.LLIILZL = true;
                C38891fp.LJJIIJ(new OSZ(1, 1), selectSubscribe.LLIIL);
                C38891fp.LJJIIJ(C76800UCe.LIZ, selectSubscribe.LLIILII);
            }
        }
        return C76800UCe.LIZ;
    }
}
