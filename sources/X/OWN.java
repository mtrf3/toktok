package X;

import Y.ACListenerS30S0100000_10;
import Y.IDDListenerS104S0200000_10;
import Y.IDTListenerS119S0100000_10;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OWN {
    public TuxSheet LIZ;

    public final void LIZ(Context context, boolean z, final String str, OWF owf) {
        o.LJIIIZ(context, "context");
        View inflate = View.inflate(context, R.layout.du1, null);
        ARV arv = (ARV) inflate.findViewById(R.id.hj7);
        C81239VuV c81239VuV = (C81239VuV) inflate.findViewById(R.id.k7t);
        View findViewById = inflate.findViewById(R.id.k7o);
        C1AH c1ah = (C1AH) inflate.findViewById(R.id.l16);
        View findViewById2 = inflate.findViewById(R.id.cdh);
        if ("samsung".equalsIgnoreCase(Build.BRAND) || "samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            c1ah.setVisibility(8);
            findViewById2.setVisibility(8);
        }
        arv.setChecked(C62016OVo.LIZ().getBoolean("keva_key_enable_double_tap_pause_video", false));
        c81239VuV.setProgress(C62016OVo.LIZ().getInt("keva_key_wallpaper_sound_slider_progress", 0));
        c81239VuV.setOnSeekBarChangeListener(new OWO(owf, this, str, c81239VuV));
        arv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.9Xq
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                OWN own = OWN.this;
                String str2 = str;
                own.getClass();
                C188727au c188727au = new C188727au();
                c188727au.LIZLLL(z2 ? 1 : 0, "action");
                c188727au.LJIIIZ("enter_from", str2);
                FMX.LJIIL("click_double_tap_to_pause_switch", c188727au.LIZ);
            }
        });
        if (findViewById.getVisibility() == 0 && z) {
            c81239VuV.setAlpha(0.75f);
            c81239VuV.setEnabled(false);
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.tu6);
            View findViewById3 = inflate.findViewById(R.id.gux);
            findViewById3.setOnTouchListener(new IDTListenerS119S0100000_10(c5s1, 8));
            findViewById3.setVisibility(0);
        }
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 121), inflate.findViewById(R.id.bfv));
        ASL asl = new ASL();
        asl.LIZ.LJLLI = inflate;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJLILLLLZI = new IDDListenerS104S0200000_10(arv, c81239VuV, 1);
        this.LIZ = tuxSheet;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJI(LJJIFFI);
        FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "context.fragmentActivity)!!.supportFragmentManager");
        tuxSheet.show(supportFragmentManager, "");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("wallpaper_preferences_dialog_show", c188727au.LIZ);
    }
}
