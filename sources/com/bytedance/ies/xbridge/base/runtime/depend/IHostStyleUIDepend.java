package com.bytedance.ies.xbridge.base.runtime.depend;

import X.C31926Cfy;
import X.C60991Nwh;
import X.C60995Nwl;
import X.C61338O5m;

/* loaded from: classes11.dex */
public interface IHostStyleUIDepend {
    public static final C60995Nwl Companion = C60995Nwl.LIZ;

    Boolean hideLoading(C60991Nwh c60991Nwh, C31926Cfy c31926Cfy);

    Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener);

    Boolean showDialog(DialogBuilder dialogBuilder);

    Boolean showLoading(C61338O5m c61338O5m, C31926Cfy c31926Cfy);

    Boolean showToast(ToastBuilder toastBuilder, C31926Cfy c31926Cfy);
}
