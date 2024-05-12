package X;

import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PoiReTagBottomBarAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OMO extends AbstractC65781Prl implements InterfaceC88471Ynr<PoiReTagBottomBarAssem, C43I<? extends Integer>, C76800UCe> {
    public static final OMO LJLIL = new OMO();

    public OMO() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(PoiReTagBottomBarAssem poiReTagBottomBarAssem, C43I<? extends Integer> c43i) {
        PoiReTagBottomBarAssem selectSubscribe = poiReTagBottomBarAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIII = true;
            selectSubscribe.LLIIIJ = false;
            if (C78915Uy7.LJJI(selectSubscribe.LLIFFJFJJ)) {
                selectSubscribe.LLIIIL.invoke();
            } else {
                ViewGroup viewGroup = selectSubscribe.LLFII;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
