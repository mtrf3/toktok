package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TDu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74294TDu extends AbstractC82681Wcf<C74294TDu> {
    public final Context LIZJ;
    public View LIZLLL;

    @Override // X.AbstractC82681Wcf
    public final InterfaceC82683Wch LIZJ() {
        LJFF();
        this.LIZ.LJJIII = true;
        C86982YBu c86982YBu = new C86982YBu(this.LIZJ, null, 6);
        C74291TDr c74291TDr = new C74291TDr(this.LIZJ, null, 6);
        c74291TDr.setRadius(C32151Nz.LJIIZILJ(12));
        C86981YBt c86981YBt = new C86981YBt(-2);
        if (C63081OpJ.LJZI(this.LIZJ) || C63081OpJ.LJLLILLLL(this.LIZJ)) {
            c86981YBt.LJI = C86977YBp.LIZ(this.LIZIZ, "min(max(wrap_content,375dp),420dp)", "width2");
        } else {
            c86981YBt.LJI = C86977YBp.LIZ(this.LIZIZ, "min(max(wrap_content,220dp),screen.width-32dp)", "width2");
        }
        c86981YBt.LJII = C86977YBp.LIZ(this.LIZIZ, "min(wrap_content,screen.height-96dp)", "height2");
        c74291TDr.addView(this.LIZLLL);
        c86982YBu.addView(c74291TDr, c86981YBt);
        LIZLLL(c86982YBu);
        return super.LIZJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74294TDu(Context ctx) {
        super(ctx);
        o.LJIIIZ(ctx, "ctx");
        this.LIZJ = ctx;
        Integer LJII = C79045V0n.LJII(this.LIZIZ, new int[]{R.attr.tf, R.attr.tg, R.attr.th, R.attr.ti, R.attr.tj, R.attr.tk, R.attr.tl, R.attr.tm, R.attr.tn, R.attr.to}, 9);
        if (LJII != null) {
            LJIIIIZZ(LJII.intValue());
        }
        this.LIZ.LJIIIZ = true;
        LJIIJ(null, true);
    }
}
