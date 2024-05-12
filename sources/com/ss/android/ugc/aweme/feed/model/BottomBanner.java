package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BottomBanner extends F9E implements Serializable {

    @InterfaceC65349Pkn("need_use_author_nickname")
    public final boolean needUseAuthorNickName;

    @InterfaceC65349Pkn("recommend_text")
    public final String recommendText;

    @InterfaceC65349Pkn("show_button_color_seconds")
    public final int showButtonColorSeconds;

    @InterfaceC65349Pkn("version")
    public final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public BottomBanner() {
        this(0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BottomBanner copy$default(BottomBanner bottomBanner, int i, int i2, String str, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bottomBanner.showButtonColorSeconds;
        }
        if ((i3 & 2) != 0) {
            i2 = bottomBanner.version;
        }
        if ((i3 & 4) != 0) {
            str = bottomBanner.recommendText;
        }
        if ((i3 & 8) != 0) {
            z = bottomBanner.needUseAuthorNickName;
        }
        return bottomBanner.copy(i, i2, str, z);
    }

    public final BottomBanner copy(int i, int i2, String recommendText, boolean z) {
        o.LJIIIZ(recommendText, "recommendText");
        return new BottomBanner(i, i2, recommendText, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.showButtonColorSeconds), Integer.valueOf(this.version), this.recommendText, Boolean.valueOf(this.needUseAuthorNickName)};
    }

    public final boolean getNeedUseAuthorNickName() {
        return this.needUseAuthorNickName;
    }

    public final String getRecommendText() {
        return this.recommendText;
    }

    public final int getShowButtonColorSeconds() {
        return this.showButtonColorSeconds;
    }

    public final int getVersion() {
        return this.version;
    }

    public BottomBanner(int i, int i2, String recommendText, boolean z) {
        o.LJIIIZ(recommendText, "recommendText");
        this.showButtonColorSeconds = i;
        this.version = i2;
        this.recommendText = recommendText;
        this.needUseAuthorNickName = z;
    }

    public /* synthetic */ BottomBanner(int i, int i2, String str, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 2 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? false : z);
    }
}
