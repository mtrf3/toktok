package com.ss.android.ugc.aweme.qrcode.view;

import X.C16880lQ;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.qrcode.handler.IQRCodePermissionActivityStarter;

/* loaded from: classes11.dex */
public final class QRCodePermissionActivityStarter implements IQRCodePermissionActivityStarter {
    @Override // com.ss.android.ugc.aweme.qrcode.handler.IQRCodePermissionActivityStarter
    public final void LIZ(Context context, boolean z) {
        if (context == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - QRCodePermissionActivity.LJLJJI < 1000) {
            return;
        }
        QRCodePermissionActivity.LJLJJI = currentTimeMillis;
        Intent intent = new Intent(context, (Class<?>) QRCodePermissionActivity.class);
        intent.putExtra("finishAfterScan", false);
        intent.putExtra("page_from", 3);
        intent.putExtra("camera_only", z);
        C16880lQ.LIZJ(context, intent);
    }
}
