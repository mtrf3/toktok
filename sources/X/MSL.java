package X;

import com.ss.android.ugc.aweme.notification.creator.assem.CreatorRecommendUserAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSL extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final MSL LJLIL = new MSL();

    public MSL() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(CreatorRecommendUserAssem.class);
        uiContentAssem.LJIIIIZZ = new CreatorRecommendUserAssem();
        uiContentAssem.LJI = R.id.bsj;
        return C76800UCe.LIZ;
    }
}
