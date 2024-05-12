package X;

import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.assem.ChooseSearchMusicActionButtonAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SYC extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final SYC LJLIL = new SYC();

    public SYC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(ChooseSearchMusicActionButtonAssem.class);
        uiContentAssem.LJIIIIZZ = new ChooseSearchMusicActionButtonAssem();
        uiContentAssem.LJI = R.id.cwq;
        return C76800UCe.LIZ;
    }
}
