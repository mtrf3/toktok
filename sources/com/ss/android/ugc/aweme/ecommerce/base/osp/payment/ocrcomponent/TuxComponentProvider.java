package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ocrcomponent;

import X.AnonymousClass027;
import X.C208788Hi;
import X.C25757A8z;
import X.C26029AJl;
import X.C42517GmP;
import X.C86319XuF;
import X.C86321XuH;
import X.InterfaceC208818Hl;
import X.InterfaceC42518GmQ;
import X.InterfaceC71484S3s;
import X.InterfaceC86320XuG;
import X.InterfaceC86816Y5k;
import X.LBW;
import X.LBX;
import X.Y6O;
import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import com.bytedance.pipo.ocr.view.component.IOcrComponent;
import com.google.android.play.core.assetpacks.r2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TuxComponentProvider implements IOcrComponent {
    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC208818Hl getButton(Context context) {
        o.LJIIIZ(context, "context");
        return new C208788Hi(context);
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC42518GmQ getDialog(Context context) {
        o.LJIIIZ(context, "context");
        return new C42517GmP(context);
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC86816Y5k getFormItem(Context context) {
        o.LJIIIZ(context, "context");
        return new C26029AJl(context);
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public Y6O getLoadingHUD(Context context) {
        o.LJIIIZ(context, "context");
        return new C25757A8z(context);
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC86320XuG getSheet(Context context) {
        o.LJIIIZ(context, "context");
        return new C86319XuF();
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public LBX getTextView(Context context) {
        o.LJIIIZ(context, "context");
        return new LBW(context);
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC71484S3s getToast(Context context) {
        o.LJIIIZ(context, "context");
        return new r2();
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public C86321XuH setThemeAndGetColors(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (AnonymousClass027.LJLIL == 2) {
            activity.setTheme(R.style.vp);
        } else {
            activity.setTheme(R.style.vt);
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.cl, typedValue, true);
        TypedValue typedValue2 = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.go, typedValue2, true);
        TypedValue typedValue3 = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.dv, typedValue3, true);
        return new C86321XuH(typedValue.data, typedValue2.data, typedValue3.data);
    }
}
