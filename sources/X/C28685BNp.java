package X;

import Y.AfS36S0101000_5;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.BNp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28685BNp extends BNR {
    public final /* synthetic */ C28686BNq LJLJI;

    public static final void M(int i) {
        C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
        String str = c08680Vs.LJII;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "foru")) {
            i--;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_explore_no_more_show");
        LIZ.LJIJJ(Integer.valueOf(c08680Vs.LJII()), "has_banner");
        LIZ.LJIJJ(str, "tab_type");
        C78895Uxn.LIZIZ(LIZ, "end", "no_more_type", i, "show_num");
        LIZ.LJIJJ(c08680Vs.LJIIJJI, "landing_reason");
        LIZ.LJIJJ(C08660Vq.LIZ(), C08680Vs.LJIJ);
        LIZ.LJIJJ(Integer.valueOf(c08680Vs.LJFF()), C08680Vs.LJIIZILJ);
        LIZ.LJIJJ(c08680Vs.LIZIZ(), "entrance_type");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28685BNp(C28686BNq c28686BNq, View view) {
        super(view);
        this.LJLJI = c28686BNq;
    }

    @Override // X.BNR
    public final void bind(Object obj, int i) {
        M(i);
        C73893SzJ<Boolean> c73893SzJ = this.LJLJI.LL;
        if (c73893SzJ != null) {
            this.LJLILLLLZI.LIZ(c73893SzJ.LJJJJZI(new AfS36S0101000_5(i, this, 71)));
        }
    }
}
