package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.setting.page.datasave.SpeedModeSettingImpl;
import com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.J8r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC48681J8r extends C25849ACn implements View.OnClickListener {
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;

    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        boolean z;
        String str = this.LJLJJL;
        String str2 = this.LJLJJLL;
        if (SpeedModeSettingImpl.LJFF().LJ() == EnumC48682J8s.ALLOW) {
            z = true;
        } else {
            z = false;
        }
        return new C25848ACm(z, str, this, false, null, null, null, str2, true, false, false, null, 62456);
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC48681J8r(Fragment fragment) {
        super(null);
        o.LJIIIZ(fragment, "fragment");
        String string = fragment.getString(R.string.cjb);
        o.LJIIIIZZ(string, "fragment.getString(R.str…cellular_speedmode_title)");
        this.LJLJJL = string;
        String string2 = fragment.getString(R.string.cja);
        o.LJIIIIZZ(string2, "fragment.getString(R.str….cellular_speedmode_desc)");
        this.LJLJJLL = string2;
        this.LJLJL = "speed_mode_on";
        this.LJLJLJ = "speed_mode_off";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EnumC48682J8s enumC48682J8s;
        LJIIL();
        boolean z = LJFF().LJZI;
        ISpeedModeSetting LJFF = SpeedModeSettingImpl.LJFF();
        if (z) {
            enumC48682J8s = EnumC48682J8s.ALLOW;
        } else {
            enumC48682J8s = EnumC48682J8s.NOT_ALLOW;
        }
        LJFF.LIZIZ(enumC48682J8s);
        SpeedModeServiceImpl.LJII().LIZIZ(z);
        if (z) {
            FMX.onEventV3(this.LJLJL);
        } else {
            FMX.onEventV3(this.LJLJLJ);
        }
    }
}
