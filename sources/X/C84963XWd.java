package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XWd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84963XWd extends XWY {
    @Override // X.XWY, X.XWR
    public final void LJFF() {
        super.LJFF();
        Context context = this.LIZJ.getContext();
        C73306Spq c73306Spq = new C73306Spq();
        String string = context.getString(R.string.pwo);
        o.LJIIIIZZ(string, "context.getString(R.stri…d_page_empty_state_title)");
        c73306Spq.LJFF = string;
        String string2 = context.getString(R.string.pwn);
        o.LJIIIIZZ(string2, "context.getString(R.stri…_empty_state_description)");
        c73306Spq.LJI = string2;
        this.LIZJ.setStatus(c73306Spq);
    }

    public C84963XWd(Context context, View view, XYV<?> xyv, InterfaceC191547fS interfaceC191547fS, C72H<XYM> c72h, int i) {
        super(context, view, xyv, interfaceC191547fS, c72h, i);
    }
}
