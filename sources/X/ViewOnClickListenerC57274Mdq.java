package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Mdq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC57274Mdq implements View.OnClickListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ DialogC57275Mdr LJLILLLLZI;

    public ViewOnClickListenerC57274Mdq(String str, DialogC57275Mdr dialogC57275Mdr) {
        this.LJLIL = str;
        this.LJLILLLLZI = dialogC57275Mdr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LV0 lv0 = LV0.LJII;
        String str = this.LJLIL;
        Context context = this.LJLILLLLZI.getContext();
        o.LJIIIIZZ(context, "getContext()");
        lv0.getClass();
        LV0.LIZLLL(context, str);
        C54254LRa.LIZLLL = true;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "feed_popup");
        FMX.LJIIL("enter_activity_page", c188727au.LIZ);
        try {
            if (this.LJLILLLLZI.LJLILLLLZI) {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("toast_type", "coupon_fission");
                c188727au2.LJIIIZ("click_position", "start_now");
                FMX.LJIIL("toast_click", c188727au2.LIZ);
            }
        } catch (C158056If unused) {
        }
        this.LJLILLLLZI.dismiss();
    }
}
