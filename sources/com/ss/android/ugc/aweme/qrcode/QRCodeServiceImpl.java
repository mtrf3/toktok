package com.ss.android.ugc.aweme.qrcode;

import X.C10K;
import X.C16880lQ;
import X.C38960FQu;
import X.C39800Fjg;
import X.C42601Gnl;
import X.C45804HyK;
import X.C57541Mi9;
import X.C58096Mr6;
import X.C62086OYg;
import X.C62166OaY;
import X.C66462jC;
import X.C66580QBc;
import X.InterfaceC62173Oaf;
import Y.ACallableS111S0100000_8;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity;
import defpackage.a1;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class QRCodeServiceImpl implements IQRCodeService {
    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZLLL() {
        File LIZIZ;
        File LIZIZ2;
        if (C66462jC.LIZIZ(0) != null && (LIZIZ2 = C66462jC.LIZIZ(0)) != null && LIZIZ2.exists()) {
            C10K.LIZJ(new ACallableS111S0100000_8(LIZIZ2, 1));
        }
        if (C66462jC.LIZIZ(1) != null && (LIZIZ = C66462jC.LIZIZ(1)) != null && LIZIZ.exists()) {
            C10K.LIZJ(new ACallableS111S0100000_8(LIZIZ, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final String LJFF() {
        return "qrcode";
    }

    public static IQRCodeService LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(IQRCodeService.class, false);
        if (LIZ != null) {
            return (IQRCodeService) LIZ;
        }
        if (C58096Mr6.l4 == null) {
            synchronized (IQRCodeService.class) {
                if (C58096Mr6.l4 == null) {
                    C58096Mr6.l4 = new QRCodeServiceImpl();
                }
            }
        }
        return C58096Mr6.l4;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LJ(Context context) {
        o.LJIIIZ(context, "context");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - QRCodePermissionActivity.LJLJJI < 1000) {
            return;
        }
        QRCodePermissionActivity.LJLJJI = currentTimeMillis;
        Intent intent = new Intent(context, (Class<?>) QRCodePermissionActivity.class);
        intent.putExtra("finishAfterScan", false);
        intent.putExtra("page_from", -1);
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final int LJI(String str) {
        return C45804HyK.LJJIIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZ(UserQRCodeActivity context, String path) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        if (TextUtils.isEmpty(path)) {
            return;
        }
        File file = new File(path);
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        context.sendBroadcast(intent);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZIZ(Context context, int i, boolean z) {
        o.LJIIIZ(context, "context");
        QRCodePermissionActivity.LLFZ(context, z, i);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final C62086OYg LIZJ(View view, String fileName, boolean z) {
        String str;
        Bitmap createBitmap;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(fileName, "fileName");
        if (z) {
            String LJIILL = C66580QBc.LJIILL(view.getContext());
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            if (view.getDrawingCache() != null && (createBitmap = Bitmap.createBitmap(view.getDrawingCache())) != null) {
                view.setDrawingCacheEnabled(false);
                if (BitmapUtils.saveBitmapToSD(createBitmap, LJIILL, fileName)) {
                    str = a1.LJ(LJIILL, "/", fileName);
                    return new C62086OYg(null, str, z);
                }
            }
            str = null;
            return new C62086OYg(null, str, z);
        }
        return new C62086OYg(C42601Gnl.LIZ(view.getContext(), view, fileName), null, z);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LJII(String url, String appendPart, C38960FQu c38960FQu) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(appendPart, "appendPart");
        if (TextUtils.isEmpty(url)) {
            return;
        }
        ((C57541Mi9) ((InterfaceC62173Oaf) new C62166OaY(new C57541Mi9(), new C39800Fjg(url, appendPart, c38960FQu)).LJLILLLLZI)).LIZ(url);
    }
}
