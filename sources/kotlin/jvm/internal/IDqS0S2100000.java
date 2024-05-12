package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C0JV;
import X.C1B3;
import X.C22K;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceSourceFragment;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceWrongFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public class IDqS0S2100000 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS0S2100000 iDqS0S2100000) {
        FragmentManager supportFragmentManager;
        C0JV.LIZIZ(iDqS0S2100000.s0, iDqS0S2100000.s1);
        ActivityC45651qj mo49getActivity = ((GameDualDeviceSourceFragment) iDqS0S2100000.l2).mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            GameDualDeviceWrongFragment gameDualDeviceWrongFragment = new GameDualDeviceWrongFragment();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJ(gameDualDeviceWrongFragment, null, R.id.dm7);
            c1b3.LJI();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS0S2100000 iDqS0S2100000) {
        String string;
        string = super/*X.1mf*/.getString(iDqS0S2100000.s0, iDqS0S2100000.s1);
        return string;
    }

    public static final Object invoke$2(IDqS0S2100000 iDqS0S2100000) {
        super/*X.1mf*/.LIZIZ(iDqS0S2100000.s0, iDqS0S2100000.s1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S2100000(C22K c22k, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = c22k;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S2100000(String str, String str2, GameDualDeviceSourceFragment gameDualDeviceSourceFragment, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = gameDualDeviceSourceFragment;
    }
}
