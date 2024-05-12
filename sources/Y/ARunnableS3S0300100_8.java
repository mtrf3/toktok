package Y;

import X.ASL;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C2MA;
import X.C48684J8u;
import X.C51029K0z;
import X.C82544WaS;
import X.FMX;
import X.IDP;
import X.IT4;
import X.InterfaceC48685J8v;
import X.OSZ;
import android.app.Activity;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.setting.page.datasave.SpeedModeSettingImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public class ARunnableS3S0300100_8 implements Runnable {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bud, ((Activity) this.l0).getLayoutInflater(), null);
        String string = ((Activity) this.l0).getString(R.string.cj8);
        o.LJIIIIZZ(string, "activity.getString(R.string.cellular_popup_desc)");
        int LJJLIIIJL = s.LJJLIIIJL(string, "[", 0, false, 6);
        int i = -1;
        if (LJJLIIIJL != -1) {
            String charSequence = s.LJJZ(LJJLIIIJL, LJJLIIIJL + 1, string).toString();
            int LJJLIIJ = s.LJJLIIJ(charSequence, "]", 6);
            if (LJJLIIJ != -1) {
                charSequence = s.LJJZ(LJJLIIJ, LJJLIIJ + 1, charSequence).toString();
            }
            StyleSpan styleSpan = new StyleSpan(1);
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(styleSpan, LJJLIIIJL, LJJLIIJ, 18);
            ((TextView) LLLZIIL.findViewById(R.id.k_b)).setText(spannableString);
        } else {
            ((TextView) LLLZIIL.findViewById(R.id.k_b)).setText(string);
        }
        View findViewById = LLLZIIL.findViewById(R.id.b09);
        View findViewById2 = LLLZIIL.findViewById(R.id.axl);
        long currentTimeMillis = System.currentTimeMillis();
        INetworkStateService createINetworkStateServicebyMonsterPlugin = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);
        if (createINetworkStateServicebyMonsterPlugin != null) {
            i = createINetworkStateServicebyMonsterPlugin.getEffectiveConnectionType();
        }
        ASL asl = new ASL();
        asl.LIZ.LJLLI = LLLZIIL;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLJI = false;
        tuxSheet.LLD = false;
        tuxSheet.LL = false;
        tuxSheet.LJLLJ = true;
        C16880lQ.LJIIJ(new ACListenerS1S0301100_8(tuxSheet, (InterfaceC48685J8v) this.l2, currentTimeMillis, (SpeedModeSettingImpl) this.l1, i, 0), findViewById2);
        C16880lQ.LJIIJ(new ACListenerS1S0301100_8(tuxSheet, (InterfaceC48685J8v) this.l2, currentTimeMillis, (SpeedModeSettingImpl) this.l1, i, 1), findViewById);
        FragmentManager supportFragmentManager = ((ActivityC45651qj) ((Activity) this.l0)).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        tuxSheet.show(supportFragmentManager, ((SpeedModeSettingImpl) this.l1).LIZ);
        SpeedModeSettingImpl speedModeSettingImpl = (SpeedModeSettingImpl) this.l1;
        FMX.LJIIL(speedModeSettingImpl.LJFF, C51029K0z.LJJIIZI(new OSZ(speedModeSettingImpl.LJI, String.valueOf(i))));
        C82544WaS.LIZLLL(this.j3, new ARunnableS44S0100000_8(tuxSheet, 152));
    }

    public static final void run$0(ARunnableS3S0300100_8 aRunnableS3S0300100_8) {
        boolean LIZ;
        try {
            ((IDP) aRunnableS3S0300100_8.l2).LJLIIIL((IT4) aRunnableS3S0300100_8.l0, (C2MA) aRunnableS3S0300100_8.l1, aRunnableS3S0300100_8.j3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0300100_8 aRunnableS3S0300100_8) {
        boolean LIZ;
        try {
            aRunnableS3S0300100_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S0300100_8(Activity activity, SpeedModeSettingImpl speedModeSettingImpl, C48684J8u c48684J8u, int i) {
        this.$t = i;
        this.l0 = activity;
        this.l1 = speedModeSettingImpl;
        this.j3 = 5000L;
        this.l2 = c48684J8u;
    }

    public ARunnableS3S0300100_8(IDP idp, IT4 it4, C2MA c2ma, long j, long j2, int i) {
        this.$t = i;
        this.l2 = idp;
        this.l0 = it4;
        this.l1 = c2ma;
        this.j3 = j2;
    }
}
