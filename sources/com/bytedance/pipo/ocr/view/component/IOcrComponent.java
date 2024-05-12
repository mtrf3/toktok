package com.bytedance.pipo.ocr.view.component;

import X.C86321XuH;
import X.InterfaceC208818Hl;
import X.InterfaceC42518GmQ;
import X.InterfaceC71484S3s;
import X.InterfaceC86320XuG;
import X.InterfaceC86816Y5k;
import X.LBX;
import X.Y6O;
import android.app.Activity;
import android.content.Context;

/* loaded from: classes16.dex */
public interface IOcrComponent {
    InterfaceC208818Hl getButton(Context context);

    InterfaceC42518GmQ getDialog(Context context);

    InterfaceC86816Y5k getFormItem(Context context);

    Y6O getLoadingHUD(Context context);

    InterfaceC86320XuG getSheet(Context context);

    LBX getTextView(Context context);

    InterfaceC71484S3s getToast(Context context);

    C86321XuH setThemeAndGetColors(Activity activity);
}
