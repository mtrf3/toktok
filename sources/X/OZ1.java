package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.qrcode.IQRCodeService;
import com.ss.android.ugc.aweme.qrcode.QRCodeServiceImpl;
import com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZ1 implements IQRCodeService {
    public static final OZ1 LIZIZ = new OZ1();
    public final /* synthetic */ IQRCodeService LIZ = QRCodeServiceImpl.LJIIIIZZ();

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZ(UserQRCodeActivity context, String path) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        this.LIZ.LIZ(context, path);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZIZ(Context context, int i, boolean z) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZIZ(context, i, z);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final C62086OYg LIZJ(View view, String fileName, boolean z) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(fileName, "fileName");
        return this.LIZ.LIZJ(view, fileName, z);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LJ(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJ(context);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final String LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final int LJI(String str) {
        return this.LIZ.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LJII(String url, String appendPart, C38960FQu c38960FQu) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(appendPart, "appendPart");
        this.LIZ.LJII(url, appendPart, c38960FQu);
    }
}
