package com.ss.android.ugc.aweme.rss.feed.models;

import X.F9E;
import X.InterfaceC87283bg;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RssFeedParam extends F9E implements IRouteArg, InterfaceC87283bg {
    public static final Parcelable.Creator<RssFeedParam> CREATOR = new Parcelable.Creator<RssFeedParam>() { // from class: X.4co
        @Override // android.os.Parcelable.Creator
        public final RssFeedParam createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new RssFeedParam(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RssFeedParam[] newArray(int i) {
            return new RssFeedParam[i];
        }
    };
    public final String enterFrom;
    public final String rssFeedUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public RssFeedParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static RssFeedParam __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("rss_url")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("rss_url"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("enter_from")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        return new RssFeedParam(str, str2, i, defaultConstructorMarker);
    }

    public static /* synthetic */ RssFeedParam copy$default(RssFeedParam rssFeedParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rssFeedParam.rssFeedUrl;
        }
        if ((i & 2) != 0) {
            str2 = rssFeedParam.enterFrom;
        }
        return rssFeedParam.copy(str, str2);
    }

    public final RssFeedParam copy(String rssFeedUrl, String enterFrom) {
        o.LJIIIZ(rssFeedUrl, "rssFeedUrl");
        o.LJIIIZ(enterFrom, "enterFrom");
        return new RssFeedParam(rssFeedUrl, enterFrom);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.rssFeedUrl, this.enterFrom};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.rssFeedUrl);
        out.writeString(this.enterFrom);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getRssFeedUrl() {
        return this.rssFeedUrl;
    }

    public RssFeedParam(String rssFeedUrl, String enterFrom) {
        o.LJIIIZ(rssFeedUrl, "rssFeedUrl");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.rssFeedUrl = rssFeedUrl;
        this.enterFrom = enterFrom;
    }

    public /* synthetic */ RssFeedParam(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
