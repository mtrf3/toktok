package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import X.C71230RxS;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ShortTouch implements Parcelable {
    public static final Parcelable.Creator<ShortTouch> CREATOR = new C71230RxS();

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("preview_setting")
    public final ShortTouchPreviewSetting previewSetting;

    @InterfaceC65349Pkn("schema")
    public final String uri;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }
}
