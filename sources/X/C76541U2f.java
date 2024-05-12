package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.U2f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76541U2f extends AbstractC76220Tvk<C124324uK> {
    public C47061t0 LJLIL;

    public C76541U2f(View view) {
        super(view);
    }

    @Override // X.AbstractC76220Tvk
    public final void L(int i, Object data) {
        String str;
        o.LJIIIZ(data, "data");
        this.LJLIL = (C47061t0) this.itemView.findViewById(R.id.fyy);
        if (C15380j0.LJIIZILJ()) {
            str = "ttlive_multi_guest_live_show_description_rtl.png";
        } else {
            str = "ttlive_multi_guest_live_show_description_ltr.png";
        }
        C15490jB.LJ(this.LJLIL, "tiktok_live_liveshow_resource_demand", str);
    }
}
