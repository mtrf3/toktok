package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.List;

/* renamed from: X.LyT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56005LyT implements InterfaceC70769Rq1 {
    public final /* synthetic */ C55954Lxe LJLIL;

    public C56005LyT(C55954Lxe c55954Lxe) {
        this.LJLIL = c55954Lxe;
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toolPanel Image: release image for ");
        LIZ.append(this.LJLIL.LJLIL.getTitle());
        LIZ.append(" with ");
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        CK3.LIZIZ(LIZ, str, LIZ, 3);
    }

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toolPanel Image: onIntermediateImageSet image for ");
        LIZ.append(this.LJLIL.LJLIL.getTitle());
        LIZ.append(" with ");
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        CK3.LIZIZ(LIZ, str, LIZ, 3);
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
        String str;
        if (th != null) {
            th.printStackTrace();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toolPanel Image: onIntermediateImageFailed for ");
        LIZ.append(this.LJLIL.LJLIL.getTitle());
        LIZ.append(" with ");
        String str2 = "";
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(" for reason ");
        if (th != null) {
            str2 = V0N.LJJIJL(th);
        }
        CK3.LIZIZ(LIZ, str2, LIZ, 3);
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toolPanel Image: start loading image for ");
        LIZ.append(this.LJLIL.LJLIL.getTitle());
        LIZ.append(" with ");
        List<String> list = this.LJLIL.LJLIL.getImageUrls().LIZ;
        if (list != null) {
            str = (String) ORZ.LJLLLL(list);
        } else {
            str = null;
        }
        CK3.LIZIZ(LIZ, str, LIZ, 3);
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        String str;
        if (th != null) {
            th.printStackTrace();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toolPanel Image: load failed for ");
        LIZ.append(this.LJLIL.LJLIL.getTitle());
        LIZ.append(" with ");
        String str2 = "";
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(", reason ");
        if (th != null) {
            str2 = V0N.LJJIJL(th);
        }
        CK3.LIZIZ(LIZ, str2, LIZ, 3);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toolPanel Image: load complete for ");
        LIZ.append(this.LJLIL.LJLIL.getTitle());
        LIZ.append(" with ");
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        CK3.LIZIZ(LIZ, str, LIZ, 3);
    }
}
