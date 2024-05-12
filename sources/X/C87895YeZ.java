package X;

import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.YeZ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87895YeZ extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C87895YeZ LJLIL = new C87895YeZ();

    public C87895YeZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LJI = C212518Vr.LIZLLL;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(AdInteractiveAssem.class);
        reusedUiContentAssem.LIZJ = new AdInteractiveAssem();
        reusedUiContentAssem.LIZLLL = R.id.s7;
        FeedAdServiceImpl.LJJIJLIJ().LJIILLIIL();
        reusedUiContentAssem.LJ = R.layout.bjj;
        reusedUiContentAssem.LIZLLL(C8VK.LAZY);
        return C76800UCe.LIZ;
    }
}
