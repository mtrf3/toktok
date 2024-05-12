package com.ss.android.ugc.aweme.qrcode;

import X.C38960FQu;
import X.C62086OYg;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class QRCodeDowngradeService implements IQRCodeService {
    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZ(UserQRCodeActivity context, String path) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZIZ(Context context, int i, boolean z) {
        o.LJIIIZ(context, "context");
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final C62086OYg LIZJ(View view, String fileName, boolean z) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(fileName, "fileName");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LJ(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final String LJFF() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final int LJI(String str) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LJII(String url, String appendPart, C38960FQu c38960FQu) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(appendPart, "appendPart");
    }
}
