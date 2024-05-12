package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class ActivityIcon extends F9E {

    @InterfaceC65349Pkn("res_id")
    public final int resId;

    @InterfaceC65349Pkn("url")
    public final String url;

    @InterfaceC65349Pkn("url_model")
    public final UrlModel urlModel;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityIcon() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.urlModel, Integer.valueOf(this.resId), this.url};
    }

    public ActivityIcon(UrlModel urlModel, int i, String str) {
        this.urlModel = urlModel;
        this.resId = i;
        this.url = str;
    }

    public /* synthetic */ ActivityIcon(UrlModel urlModel, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : urlModel, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? null : str);
    }
}
