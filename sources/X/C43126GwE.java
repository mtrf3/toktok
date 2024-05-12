package X;

import Y.IDDListenerS146S0100000_7;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GwE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43126GwE extends AbstractC43127GwF {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        FragmentManager supportFragmentManager;
        InterfaceC43128GwG interfaceC43128GwG = (InterfaceC43128GwG) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String title = interfaceC43128GwG.getTitle();
        String content = interfaceC43128GwG.getContent();
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setText(content);
            tuxTextView.setTuxFont(31);
            tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(23)), C7MY.LIZIZ(23), C7MY.LIZIZ(23), O6R.LJJIIZ(C32151Nz.LJIIZILJ(99)));
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                ASL asl = new ASL();
                C235119Kp c235119Kp = new C235119Kp();
                c235119Kp.LIZLLL = true;
                C9KF c9kf = new C9KF();
                c9kf.LIZ(title);
                c235119Kp.LIZJ = c9kf;
                C234529Ii c234529Ii = new C234529Ii();
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_x_mark_fill_small;
                c2068389v.LJ = Integer.valueOf(R.attr.go);
                c2068389v.LIZIZ = C7MY.LIZIZ(24);
                c2068389v.LIZJ = C7MY.LIZIZ(24);
                c234529Ii.LIZ(c2068389v);
                c234529Ii.LIZIZ(new AqS157S0100000_7(tuxTextView, 458));
                c235119Kp.LIZIZ(c234529Ii);
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLL = c235119Kp;
                tuxSheet.LJLLI = tuxTextView;
                tuxSheet.LJLILLLLZI = new IDDListenerS146S0100000_7(c37356ElM, 9);
                tuxSheet.show(supportFragmentManager, this.LJLILLLLZI);
            }
        }
    }
}
