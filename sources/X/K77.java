package X;

import Y.ACListenerS28S0100000_8;
import Y.IDDListenerS147S0100000_8;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.j;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS201S0200000_8;

@InterfaceC55642Lsc("search_middle_page_widget_guide_pop")
/* loaded from: classes9.dex */
public final class K77 extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    public K77(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        String LJJIFFI;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        C85999Xp5.LJFF(context.LIZJ());
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null) {
            final View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(LIZJ), R.layout.cit, null, false);
            TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.f0h);
            if (tuxIconView != null) {
                C16880lQ.LJJJ(tuxIconView, new ACListenerS28S0100000_8(LLLLIILL, 111));
            }
            SY4 sy4 = (SY4) LLLLIILL.findViewById(R.id.wf);
            if (sy4 != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
                c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                Context context2 = sy4.getContext();
                o.LJIIIIZZ(context2, "context");
                sy4.setBackground(c110614Vt.LIZ(context2));
                sy4.setTextColorRes(R.attr.dj);
                C16880lQ.LJIIJ(new IDaS201S0200000_8(sy4, LLLLIILL, 5), sy4);
            }
            TuxSheet tuxSheet = C249109q6.LIZ(0).LIZ;
            tuxSheet.LJLLI = LLLLIILL;
            tuxSheet.LJLIL = K78.LJLIL;
            tuxSheet.LL = false;
            tuxSheet.LJLILLLLZI = new IDDListenerS147S0100000_8(wrapper, 4);
            FragmentManager supportFragmentManager = LIZJ.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            tuxSheet.show(supportFragmentManager, "SearchWidgetGuideSheet");
            Keva LIZ = K76.LIZ();
            LIZ.storeLong("recent_show_time", System.currentTimeMillis());
            LIZ.storeInt("show_times", LIZ.getInt("show_times", 0) + 1);
            K76.LIZIZ("show");
            if (C26338AVi.LIZJ(LIZJ)) {
                C51134K5a.LIZ.getClass();
                j LJJIJ = C51134K5a.LIZ().LJJIJ("guide_image_1_RTL");
                if (LJJIJ == null) {
                    LJJIFFI = "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/search_ic_widget_guide_rtl.png";
                } else {
                    LJJIFFI = LJJIJ.LJJIFFI();
                    o.LJIIIIZZ(LJJIFFI, "result.asString");
                }
            } else {
                C51134K5a.LIZ.getClass();
                j LJJIJ2 = C51134K5a.LIZ().LJJIJ("guide_image_1");
                if (LJJIJ2 == null) {
                    LJJIFFI = "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/search_ic_widget_guide.png";
                } else {
                    LJJIFFI = LJJIJ2.LJJIFFI();
                    o.LJIIIIZZ(LJJIFFI, "result.asString");
                }
            }
            C1JX.LJIIIIZZ("use by url ", LJJIFFI);
            W5F LJIIIIZZ = W5U.LJIIIIZZ(LJJIFFI);
            LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_XY;
            LJIIIIZZ.LJIIIZ(new InterfaceC78660Uu0() { // from class: X.7t4
                @Override // X.InterfaceC78660Uu0
                public final void LIZ() {
                    C49133JQb.LIZ("SWGH", new Object[0]);
                }

                @Override // X.InterfaceC78660Uu0
                public final void onProgress(float f) {
                }

                @Override // X.InterfaceC78660Uu0
                public final void LIZIZ(Bitmap bitmap) {
                    C49133JQb.LIZ("SWGH", bitmap);
                    if (bitmap == null) {
                        return;
                    }
                    ((ImageView) LLLLIILL.findViewById(R.id.f43)).setImageBitmap(bitmap);
                }

                @Override // X.InterfaceC78660Uu0
                public final void onFailed(Throwable th) {
                    C49133JQb.LIZ("SWGH", new Object[0]);
                }
            });
        }
    }
}
