package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KPY implements InterfaceC51676KPw {
    public static final KPY LIZ = new KPY();

    @Override // X.InterfaceC51676KPw
    public final boolean LIZ(Fragment detailFragment, Aweme currentAweme) {
        Object obj;
        InterfaceC224118qt interfaceC224118qt;
        DetailPageComponent lk;
        InterfaceC51679KPz interfaceC51679KPz;
        o.LJIIIZ(detailFragment, "detailFragment");
        o.LJIIIZ(currentAweme, "currentAweme");
        IDetailPageAbility LIZ2 = KQ1.LIZ(detailFragment);
        Object obj2 = null;
        if (LIZ2 != null && (lk = LIZ2.lk()) != null && (interfaceC51679KPz = lk.LLI) != null) {
            obj = interfaceC51679KPz.getViewModel();
        } else {
            obj = null;
        }
        if (!(obj instanceof InterfaceC224118qt) || (interfaceC224118qt = (InterfaceC224118qt) obj) == null) {
            return false;
        }
        List<Aweme> awemeList = interfaceC224118qt.getAwemeList();
        if (awemeList != null) {
            obj2 = ORZ.LLFII(awemeList);
        }
        return !o.LJ(obj2, currentAweme);
    }
}
