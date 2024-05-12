package X;

import Y.IDDListenerS21S0300000_1;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* renamed from: X.3yZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101473yZ implements C3WY {
    public final Context LJLIL;
    public final /* synthetic */ C3WQ LJLILLLLZI;
    public TuxSheet LJLJI;

    public final void LIZ() {
        this.LJLILLLLZI.LIZ();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLILLLLZI.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLILLLLZI.LLJILLL(c3wr);
    }

    public C101473yZ(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = new C3WQ();
    }

    public final void LIZIZ(EnumC101413yT style, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        o.LJIIIZ(style, "style");
        if (style != EnumC101413yT.U16 && (LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            ASL asl = new ASL();
            C101383yQ c101383yQ = new C101383yQ(this.LJLIL, style);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLI = c101383yQ;
            tuxSheet.LJLILLLLZI = new IDDListenerS21S0300000_1(interfaceC65784Pro, style, this, 0);
            this.LJLJI = tuxSheet;
            tuxSheet.show(supportFragmentManager, "ReadStatusSheet");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "chat");
            FMX.LJIIL("read_receipt_pop_up_show", c188727au.LIZ);
            C43J.LIZJ().storeInt(C43J.LIZ(), C43J.LIZJ().getInt(C43J.LIZ(), 0) + 1);
        }
    }
}
