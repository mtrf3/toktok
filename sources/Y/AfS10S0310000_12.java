package Y;

import X.EnumC74442TJm;
import X.InterfaceC64592gB;
import X.RTP;
import X.TJZ;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewModel;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState;
import java.util.List;
import kotlin.jvm.internal.AqS31S0210000_12;

/* loaded from: classes13.dex */
public class AfS10S0310000_12 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS10S0310000_12 afS10S0310000_12, Object obj) {
        ((TJZ) afS10S0310000_12.l0).LLLLZ((EnumC74442TJm) afS10S0310000_12.l2, (Effect) afS10S0310000_12.l1, !afS10S0310000_12.z3);
    }

    public static final void accept$1(AfS10S0310000_12 afS10S0310000_12, Object obj) {
        ((TJZ) afS10S0310000_12.l0).LLLLZ((EnumC74442TJm) afS10S0310000_12.l2, (Effect) afS10S0310000_12.l1, afS10S0310000_12.z3);
    }

    public static final void accept$2(AfS10S0310000_12 afS10S0310000_12, Object obj) {
        List list = (List) obj;
        if (((List) afS10S0310000_12.l0) == null || list.size() != ((List) afS10S0310000_12.l0).size() || afS10S0310000_12.z3) {
            ((NaviAvatarListViewModel) afS10S0310000_12.l1).setState(new AqS31S0210000_12(afS10S0310000_12.z3, (boolean) afS10S0310000_12.l2, (NaviAvatarListViewState) list, (List<RTP>) 6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS10S0310000_12(Object obj, List<RTP> list, boolean z, NaviAvatarListViewModel naviAvatarListViewModel, NaviAvatarListViewState naviAvatarListViewState) {
        this.$t = naviAvatarListViewState;
        this.l0 = obj;
        this.z3 = list;
        this.l1 = z;
        this.l2 = naviAvatarListViewModel;
    }
}
