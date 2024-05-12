package X;

import Y.ACListenerS39S0200000_4;
import android.app.Activity;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.AFd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25917AFd {
    public Activity LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1134));

    public static void LIZIZ(InterfaceC25921AFh interfaceC25921AFh) {
        interfaceC25921AFh.LIZIZ();
        String LIZLLL = interfaceC25921AFh.LIZLLL();
        if (LIZLLL != null) {
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("item_name", LIZLLL);
            interfaceC25921AFh.LJI();
            JSONObject LJ = c198517qh.LJ();
            C39398FdC.LIZ.getClass();
            C39398FdC.LIZIZ("click_setting_item", LJ);
        }
    }

    public final List<InterfaceC25921AFh> LIZ(Activity activity, List<? extends InterfaceC25921AFh> list) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        List<InterfaceC25921AFh> list2 = list;
        if (list == null) {
            list2 = (List) this.LIZIZ.getValue();
        }
        for (InterfaceC25921AFh interfaceC25921AFh : list2) {
            View findViewById = activity.findViewById(R.id.g61);
            o.LJIIIIZZ(findViewById, "activity.ll_setting_list");
            interfaceC25921AFh.LIZJ(findViewById).setVisibility(interfaceC25921AFh.getVisibility());
            View findViewById2 = activity.findViewById(R.id.g61);
            o.LJIIIIZZ(findViewById2, "activity.ll_setting_list");
            if (C6ZT.LIZ(interfaceC25921AFh.LIZJ(findViewById2))) {
                return list2;
            }
            View findViewById3 = activity.findViewById(R.id.g61);
            o.LJIIIIZZ(findViewById3, "activity.ll_setting_list");
            if (interfaceC25921AFh.LIZJ(findViewById3).getAccessory() instanceof AD5) {
                View findViewById4 = activity.findViewById(R.id.g61);
                o.LJIIIIZZ(findViewById4, "activity.ll_setting_list");
                AI9 accessory = interfaceC25921AFh.LIZJ(findViewById4).getAccessory();
                o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Label");
                AD5 ad5 = (AD5) accessory;
                C16880lQ.LJJJJI(ad5.LIZIZ, new ACListenerS39S0200000_4(this, interfaceC25921AFh, 78));
                ad5.LIZIZ.setText(interfaceC25921AFh.LJ());
            } else {
                View findViewById5 = activity.findViewById(R.id.g61);
                o.LJIIIIZZ(findViewById5, "activity.ll_setting_list");
                AI8 LIZJ = interfaceC25921AFh.LIZJ(findViewById5);
                AIF aif = new AIF(activity, null);
                aif.LJIILJJIL(new ACListenerS39S0200000_4(this, interfaceC25921AFh, 79));
                interfaceC25921AFh.LIZ();
                aif.LJIIL(new TuxTextView(activity, null, 6, 0));
                aif.LJIILL(false);
                LIZJ.setAccessory(aif);
            }
        }
        return list2;
    }
}
