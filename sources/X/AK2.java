package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AK2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str) {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return;
        }
        C82802Wec LIZIZ = UgCommonServiceImpl.LJIJ().LIZIZ();
        View inflate = View.inflate(context, R.layout.hq, null);
        C29701Eo c29701Eo = (C29701Eo) inflate.findViewById(R.id.e13);
        c29701Eo.setRepeatMode(1);
        c29701Eo.setRepeatCount(-1);
        LIZIZ.LJIIL(c29701Eo);
        C34K c34k = new C34K();
        SY4 sy4 = (SY4) inflate.findViewById(R.id.wf);
        if (C99W.LIZ) {
            sy4.getClass();
        }
        C16880lQ.LJJIZ(sy4, new MA3(inflate, context, c34k));
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS154S0100000_4(inflate, 1020));
        c235119Kp.LIZIZ(LIZJ);
        ASL asl = new ASL();
        asl.LIZ.LJLLI = inflate;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLL = c235119Kp;
        tuxSheet.LJLILLLLZI = new AK3(c34k, str, c29701Eo);
        FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "fragmentActivity.supportFragmentManager");
        tuxSheet.show(supportFragmentManager, "story_widget_guide");
        c29701Eo.playAnimation();
        FMX.LJIILL("story_widget_guide_show", new OSZ("notification_page", "enter_from"), new OSZ(str, "trigger_type"), new OSZ(1, "page"));
    }
}
