package X;

import android.app.Activity;
import android.app.Dialog;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("praise_guide_dialog")
/* renamed from: X.Ftr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40431Ftr extends AbstractC56325M8r<Dialog> {
    public static final C82802Wec LJLILLLLZI;
    public final AbstractC40428Fto LJLIL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 510;
    }

    static {
        new UgCommonServiceImpl();
        LJLILLLLZI = C82802Wec.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        Activity activity = this.LJLIL.LIZ;
        if (activity instanceof LifecycleOwner) {
            return C54081LKj.LIZ(activity, (LifecycleOwner) activity);
        }
        return null;
    }

    public C40431Ftr(AbstractC40428Fto abstractC40428Fto) {
        this.LJLIL = abstractC40428Fto;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        String str;
        String str2;
        o.LJIIIZ(context, "context");
        AbstractC40428Fto abstractC40428Fto = this.LJLIL;
        abstractC40428Fto.LIZLLL = abstractC40428Fto.LIZIZ();
        abstractC40428Fto.LIZJ("rating_show");
        C40413FtZ c40413FtZ = abstractC40428Fto.LIZJ;
        long currentTimeMillis = System.currentTimeMillis();
        c40413FtZ.LIZJ = currentTimeMillis;
        Keva keva = c40413FtZ.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        keva.storeLong(JBR.LJFF(LIZ, c40413FtZ.LIZIZ, "key_last_dialog_show_time", LIZ), currentTimeMillis);
        abstractC40428Fto.LIZJ.LIZJ(String.valueOf(EF7.LIZJ()));
        ImageView imageView = new ImageView(this.LJLIL.LIZ);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C82802Wec.LJIIJ(imageView, "043bab693d6e18590a1f8e3be293433f");
        C26227ARb LIZ2 = C3AW.LIZ(context.LIZ);
        C78685UuP.LJIJJ(LIZ2, imageView);
        C40429Ftp c40429Ftp = this.LJLIL.LIZLLL;
        String str3 = null;
        if (c40429Ftp != null) {
            str = c40429Ftp.LIZ;
        } else {
            str = null;
        }
        LIZ2.LJFF(str);
        C40429Ftp c40429Ftp2 = this.LJLIL.LIZLLL;
        if (c40429Ftp2 != null) {
            str2 = c40429Ftp2.LIZIZ;
        } else {
            str2 = null;
        }
        LIZ2.LIZIZ(str2);
        C40429Ftp c40429Ftp3 = this.LJLIL.LIZLLL;
        if (c40429Ftp3 != null) {
            str3 = c40429Ftp3.LIZJ;
        }
        C77117UOj.LJIL(LIZ2, str3, new AqS170S0100000_4(this, 970));
        UC0.LIZJ(LIZ2, new AqS172S0100000_6(this, 76));
        LIZ2.LJII = false;
        return LIZ2.LJI().LJ();
    }
}
