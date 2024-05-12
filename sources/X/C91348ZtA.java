package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtA, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91348ZtA extends LCY {
    @Override // X.LCY
    public final InterfaceC53908LDs LIZ(LCZ lcz, LCP lcp) {
        View view;
        Context context = lcp.LIZ;
        if (C26338AVi.LIZJ(context)) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            o.LJI(LJIJJ);
            view = C16970lZ.LIZLLL(LJIJJ, R.layout.bm);
        } else {
            Activity LJIJJ2 = C45804HyK.LJIJJ(context);
            o.LJI(LJIJJ2);
            view = C16970lZ.LIZLLL(LJIJJ2, R.layout.bl);
        }
        if (!SearchServiceImpl.LLLZI().LJJJI() || C52309Kfx.LIZ()) {
            view.setPadding((int) g0.LJIJJ(8), 0, (int) g0.LJIJJ(8), 0);
        }
        o.LJIIIIZZ(view, "view");
        return new C91349ZtB(view, lcp);
    }
}
