package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.powerpermissions.FakeFragment;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Nyf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61113Nyf implements InterfaceC88472Yns<ActivityC45651qj, C76800UCe> {
    public final /* synthetic */ C61112Nye LJLIL;
    public final /* synthetic */ C61101NyT LJLILLLLZI;
    public final /* synthetic */ String[] LJLJI;

    public final void LIZ(ActivityC45651qj innerActivity) {
        o.LJIIIZ(innerActivity, "innerActivity");
        if (innerActivity.getSupportFragmentManager().LJJJIL("PermissionFragment") == null) {
            FakeFragment fakeFragment = this.LJLIL.LIZJ;
            if (fakeFragment == null) {
                fakeFragment = new FakeFragment();
            }
            InterfaceC61107NyZ callback = this.LJLIL.LIZLLL;
            o.LJIIIZ(callback, "callback");
            fakeFragment.LJLILLLLZI = callback;
            C61101NyT dispatcher = this.LJLILLLLZI;
            o.LJIIIZ(dispatcher, "dispatcher");
            fakeFragment.LJLJJLL = dispatcher;
            C61101NyT c61101NyT = this.LJLILLLLZI;
            c61101NyT.getClass();
            c61101NyT.LIZLLL = new WeakReference<>(fakeFragment);
            C61112Nye c61112Nye = this.LJLIL;
            FragmentManager supportFragmentManager = innerActivity.getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LIZ.LJIIIIZZ(0, 1, fakeFragment, "PermissionFragment");
            if (c61112Nye.LIZJ == null) {
                LIZ.LJI();
                return;
            } else {
                LIZ.LJIILLIIL();
                return;
            }
        }
        C61112Nye c61112Nye2 = this.LJLIL;
        InterfaceC61107NyZ interfaceC61107NyZ = c61112Nye2.LIZLLL;
        C164906da[] c164906daArr = (C164906da[]) C17J.LJIJ(c61112Nye2.LIZIZ, C61898ORa.LJIILL(this.LJLJI)).toArray(new C164906da[0]);
        interfaceC61107NyZ.LIZIZ((C164906da[]) Arrays.copyOf(c164906daArr, c164906daArr.length));
        C17J.LJJJJLI(16);
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(ActivityC45651qj activityC45651qj) {
        LIZ(activityC45651qj);
        return C76800UCe.LIZ;
    }

    public C61113Nyf(C61112Nye c61112Nye, C61101NyT c61101NyT, String[] strArr) {
        this.LJLIL = c61112Nye;
        this.LJLILLLLZI = c61101NyT;
        this.LJLJI = strArr;
    }
}
