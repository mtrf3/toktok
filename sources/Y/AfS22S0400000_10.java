package Y;

import X.C16880lQ;
import X.C40084FoG;
import X.C62089OYj;
import X.C62090OYk;
import X.C62091OYl;
import X.C62416Oea;
import X.C62463OfL;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.OYP;
import X.W5F;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS32S1300000_10;
import kotlin.jvm.internal.o;
import v82.IDdS502S0100000_10;

/* loaded from: classes11.dex */
public class AfS22S0400000_10 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS22S0400000_10 afS22S0400000_10, Object obj) {
        String str;
        String str2 = (String) obj;
        Bundle bundle = ((LiveSharePackage) afS22S0400000_10.l0).extras;
        Object obj2 = null;
        if (bundle != null) {
            str = bundle.getString("author_name");
        } else {
            str = null;
        }
        C62090OYk.LIZ = str;
        if (bundle != null) {
            obj2 = C16880lQ.LLJJIII(bundle, "video_cover");
        }
        o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
        C62090OYk.LIZIZ = (UrlModel) obj2;
        InterfaceC62225ObV channel = (InterfaceC62225ObV) afS22S0400000_10.l1;
        Context context = (Context) afS22S0400000_10.l2;
        AqS32S1300000_10 aqS32S1300000_10 = new AqS32S1300000_10(channel, (InterfaceC62225ObV) context, (Context) str2, (String) afS22S0400000_10.l3, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 3);
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C62089OYj c62089OYj = new C62089OYj(context);
        c62089OYj.LJLJJI = new C62091OYl(c62089OYj, context, aqS32S1300000_10);
        String str3 = C62090OYk.LIZ;
        UrlModel urlModel = C62090OYk.LIZIZ;
        c62089OYj.LJLILLLLZI = str3;
        c62089OYj.LJLJI = urlModel;
        if (str3 != null) {
            TextView textView = (TextView) c62089OYj.LIZ(R.id.fyr);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('@');
            LIZ.append(c62089OYj.LJLILLLLZI);
            textView.setText(X1D.LIZIZ(LIZ));
        }
        W5F LIZLLL = C40084FoG.LIZLLL(c62089OYj.LJLJI, "LiveShareCodeView");
        LIZLLL.LIZJ = c62089OYj.LJLIL;
        LIZLLL.LJIJI = Bitmap.Config.ARGB_8888;
        LIZLLL.LJIIIZ(new IDdS502S0100000_10(c62089OYj, 1));
    }

    public static final void accept$1(AfS22S0400000_10 afS22S0400000_10, Object obj) {
        String it = (String) obj;
        InterfaceC62225ObV interfaceC62225ObV = ((C62416Oea) afS22S0400000_10.l0).LIZ;
        o.LJIIIIZZ(it, "it");
        interfaceC62225ObV.LJIJ(new OYP(it, (String) null, 6), (Context) afS22S0400000_10.l1, null);
        C62463OfL c62463OfL = (C62463OfL) afS22S0400000_10.l2;
        c62463OfL.getClass();
        c62463OfL.LJLJI = "url_form";
        ((InterfaceC88472Yns) afS22S0400000_10.l3).invoke((C62463OfL) afS22S0400000_10.l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS22S0400000_10(Object obj, LiveSharePackage liveSharePackage, InterfaceC62225ObV interfaceC62225ObV, Context context, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = obj;
        this.l1 = liveSharePackage;
        this.l2 = interfaceC62225ObV;
        this.l3 = context;
    }
}
