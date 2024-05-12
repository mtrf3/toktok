package com.ss.android.ugc.aweme.base;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ImageUrlModel {

    @InterfaceC65349Pkn("uri")
    public String mUri;

    @InterfaceC65349Pkn("url_list")
    public List<String> mUrls = new ArrayList();

    public final boolean LIZ() {
        List<String> list = this.mUrls;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageUrlModel{mUri='");
        Q89.LIZIZ(LIZ, this.mUri, '\'', ", mUrls=");
        return C1NE.LIZIZ(LIZ, this.mUrls, '}', LIZ);
    }

    public ImageUrlModel(String str, List<String> list) {
        this.mUri = str;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                this.mUrls.add(str2);
            }
        }
    }
}
