package com.ss.android.ugc.aweme.profile.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentAwareBannerSetting extends F9E implements Serializable {

    @InterfaceC65349Pkn("link_text")
    public final String awareBannerCtaButtonText;

    @InterfaceC65349Pkn("max_display_count")
    public final int awareBannerMaxDisplayCount;

    @InterfaceC65349Pkn("title_text")
    public final String awareBannerMessageText;

    @InterfaceC65349Pkn("schema_url")
    public final String awareBannerSchema;

    /* JADX WARN: Multi-variable type inference failed */
    public PaidContentAwareBannerSetting() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaidContentAwareBannerSetting copy$default(PaidContentAwareBannerSetting paidContentAwareBannerSetting, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paidContentAwareBannerSetting.awareBannerMessageText;
        }
        if ((i2 & 2) != 0) {
            str2 = paidContentAwareBannerSetting.awareBannerCtaButtonText;
        }
        if ((i2 & 4) != 0) {
            str3 = paidContentAwareBannerSetting.awareBannerSchema;
        }
        if ((i2 & 8) != 0) {
            i = paidContentAwareBannerSetting.awareBannerMaxDisplayCount;
        }
        return paidContentAwareBannerSetting.copy(str, str2, str3, i);
    }

    public final PaidContentAwareBannerSetting copy(String awareBannerMessageText, String awareBannerCtaButtonText, String awareBannerSchema, int i) {
        o.LJIIIZ(awareBannerMessageText, "awareBannerMessageText");
        o.LJIIIZ(awareBannerCtaButtonText, "awareBannerCtaButtonText");
        o.LJIIIZ(awareBannerSchema, "awareBannerSchema");
        return new PaidContentAwareBannerSetting(awareBannerMessageText, awareBannerCtaButtonText, awareBannerSchema, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.awareBannerMessageText, this.awareBannerCtaButtonText, this.awareBannerSchema, Integer.valueOf(this.awareBannerMaxDisplayCount)};
    }

    public final String getAwareBannerCtaButtonText() {
        return this.awareBannerCtaButtonText;
    }

    public final int getAwareBannerMaxDisplayCount() {
        return this.awareBannerMaxDisplayCount;
    }

    public final String getAwareBannerMessageText() {
        return this.awareBannerMessageText;
    }

    public final String getAwareBannerSchema() {
        return this.awareBannerSchema;
    }

    public PaidContentAwareBannerSetting(String str, String str2, String str3, int i) {
        HH1.LIZ(str, "awareBannerMessageText", str2, "awareBannerCtaButtonText", str3, "awareBannerSchema");
        this.awareBannerMessageText = str;
        this.awareBannerCtaButtonText = str2;
        this.awareBannerSchema = str3;
        this.awareBannerMaxDisplayCount = i;
    }

    public /* synthetic */ PaidContentAwareBannerSetting(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
