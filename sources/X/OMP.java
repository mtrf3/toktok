package X;

import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PoiReTagBottomBarAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OMP extends AbstractC65781Prl implements InterfaceC88471Ynr<PoiReTagBottomBarAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final OMP LJLIL = new OMP();

    public OMP() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(PoiReTagBottomBarAssem poiReTagBottomBarAssem, C43I<? extends C195357lb> c43i) {
        PoiReTagBottomBarAssem selectSubscribe = poiReTagBottomBarAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIII = false;
            ViewGroup viewGroup = selectSubscribe.LLFII;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                EBF.LIZ();
            }
        }
        return C76800UCe.LIZ;
    }
}
