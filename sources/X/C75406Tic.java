package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multihost.biz.statemanager.MultiHostSessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tic, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75406Tic {
    public LinkStatusViewModel LIZ;
    public InterfaceC88472Yns<? super List<UserState>, C76800UCe> LIZIZ;

    public final UserState LIZIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        LinkStatusViewModel linkStatusViewModel = this.LIZ;
        if (linkStatusViewModel != null) {
            return linkStatusViewModel.fx(linkMicId);
        }
        return null;
    }

    public final void LIZ(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        int i;
        LinkStatusViewModel linkStatusViewModel = this.LIZ;
        if (linkStatusViewModel != null) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            linkStatusViewModel.Jv(i, interfaceC88472Yns);
        }
    }

    public final void LIZJ(Fragment fragment, MultiHostSessionAbility multiHostSessionAbility) {
        C65776Prg LIZ = C65352Pkq.LIZ(LinkStatusViewModel.class);
        this.LIZ = (LinkStatusViewModel) C73994T2g.LJJIIJ(new AqS154S0100000_4(LIZ, 1168), C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C78926UyI.LJJIIJZLJL(fragment, false), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, false), C78926UyI.LJIILLIIL(fragment, false), C75089TdV.INSTANCE, LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onAttach new VM ");
        LIZ2.append(this.LIZ);
        UC0.LJJIZ(X1D.LIZIZ(LIZ2), "ViewModel");
        UC0.LJII(C55230Lly.LIZJ(fragment, "linkMicScope"), multiHostSessionAbility, ISessionAbility.class);
        LinkStatusViewModel linkStatusViewModel = this.LIZ;
        if (linkStatusViewModel != null) {
            linkStatusViewModel.kv0(C55230Lly.LIZJ(fragment, "linkMicScope"));
        }
        LinkStatusViewModel linkStatusViewModel2 = this.LIZ;
        if (linkStatusViewModel2 != null) {
            C75405Tib c75405Tib = new TBT() { // from class: X.Tib
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C75814TpC) obj).LJLJI;
                }
            };
            C56412MCa c56412MCa = new C56412MCa();
            c56412MCa.LIZ(new AqS195S0100000_13(this, 63));
            linkStatusViewModel2.CQ(c75405Tib, c56412MCa, new C75407Tid(this));
        }
    }
}
