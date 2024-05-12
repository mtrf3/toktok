package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SLq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71950SLq extends SN1<BasePrivacySettingViewModel> {
    public final C62822Ol8 LJLLJ;

    public abstract String LLIIIZ();

    @Override // X.SN1
    public final boolean LLIIIJ(int i) {
        if (i != 1) {
            return false;
        }
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ().getClass();
        String LJFF = i0.LJFF("has_show_dialog_for_sug_", C71945SLl.LIZIZ());
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        if (((Keva) value).getBoolean(LJFF, false)) {
            return false;
        }
        C26227ARb LIZ = C3AW.LIZ(this.LJLIL);
        LIZ.LJ(R.string.p5k);
        LIZ.LIZ(R.string.p5j);
        UC0.LIZJ(LIZ, new AqS99S0101000_12(this, i, 16));
        LIZ.LJI().LIZLLL();
        Object value2 = this.LJLLJ.getValue();
        o.LJIIIIZZ(value2, "<get-keva>(...)");
        ((Keva) value2).storeBoolean(LJFF, true);
        String accountType = LLIIIZ();
        o.LJIIIZ(accountType, "accountType");
        C72028SOq LIZ2 = C71909SKb.LIZJ().LIZ();
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("account_type", accountType);
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "newBuilder()\n           …               .builder()", LIZ2, "account_auth_pop_up", map);
        return true;
    }

    @Override // X.SN1
    public final void LLIIIL(int i) {
        String str;
        super.LLIIIL(i);
        String accountType = LLIIIZ();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        o.LJIIIZ(accountType, "accountType");
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("account_type", accountType);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c71969SMj.LIZIZ("to_status", str);
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "newBuilder()\n           …               .builder()", LIZ, "account_auth_switch", map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC71950SLq(BasePrivacySettingViewModel viewModel, Context context, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(context, 1106));
    }
}
