package com.ss.android.ugc.aweme.feed.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CaptionVideoPlayerItemModel implements Serializable {

    @InterfaceC65349Pkn("expire")
    public final long expire;

    @InterfaceC65349Pkn("format")
    public final String format;

    @InterfaceC65349Pkn("id")
    public final Integer id;

    @InterfaceC65349Pkn("language_id")
    public final int languageId;

    @InterfaceC65349Pkn("language")
    public final String languageName;

    @InterfaceC65349Pkn("sub_id")
    public final int subId;

    @InterfaceC65349Pkn("url")
    public final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CaptionVideoPlayerItemModel() {
        /*
            r11 = this;
            r1 = 0
            r3 = 0
            r5 = 0
            r9 = 127(0x7f, float:1.78E-43)
            r0 = r11
            r2 = r1
            r4 = r1
            r7 = r1
            r8 = r3
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.CaptionVideoPlayerItemModel.<init>():void");
    }

    public static /* synthetic */ CaptionVideoPlayerItemModel copy$default(CaptionVideoPlayerItemModel captionVideoPlayerItemModel, Integer num, String str, int i, String str2, long j, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = captionVideoPlayerItemModel.id;
        }
        if ((i3 & 2) != 0) {
            str = captionVideoPlayerItemModel.languageName;
        }
        if ((i3 & 4) != 0) {
            i = captionVideoPlayerItemModel.languageId;
        }
        if ((i3 & 8) != 0) {
            str2 = captionVideoPlayerItemModel.url;
        }
        if ((i3 & 16) != 0) {
            j = captionVideoPlayerItemModel.expire;
        }
        if ((i3 & 32) != 0) {
            str3 = captionVideoPlayerItemModel.format;
        }
        if ((i3 & 64) != 0) {
            i2 = captionVideoPlayerItemModel.subId;
        }
        return captionVideoPlayerItemModel.copy(num, str, i, str2, j, str3, i2);
    }

    public final CaptionVideoPlayerItemModel copy(Integer num, String languageName, int i, String url, long j, String str, int i2) {
        o.LJIIIZ(languageName, "languageName");
        o.LJIIIZ(url, "url");
        return new CaptionVideoPlayerItemModel(num, languageName, i, url, j, str, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionVideoPlayerItemModel)) {
            return false;
        }
        CaptionVideoPlayerItemModel captionVideoPlayerItemModel = (CaptionVideoPlayerItemModel) obj;
        return o.LJ(this.id, captionVideoPlayerItemModel.id) && o.LJ(this.languageName, captionVideoPlayerItemModel.languageName) && this.languageId == captionVideoPlayerItemModel.languageId && o.LJ(this.url, captionVideoPlayerItemModel.url) && this.expire == captionVideoPlayerItemModel.expire && o.LJ(this.format, captionVideoPlayerItemModel.format) && this.subId == captionVideoPlayerItemModel.subId;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.id;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.expire, C79062V1e.LJ(this.url, (C79062V1e.LJ(this.languageName, hashCode * 31, 31) + this.languageId) * 31, 31), 31);
        String str = this.format;
        if (str != null) {
            i = str.hashCode();
        }
        return ((LIZJ + i) * 31) + this.subId;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionVideoPlayerItemModel(id=");
        LIZ.append(this.id);
        LIZ.append(", languageName=");
        LIZ.append(this.languageName);
        LIZ.append(", languageId=");
        LIZ.append(this.languageId);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", expire=");
        LIZ.append(this.expire);
        LIZ.append(", format=");
        LIZ.append(this.format);
        LIZ.append(", subId=");
        return b0.LIZJ(LIZ, this.subId, ')', LIZ);
    }

    public final long getExpire() {
        return this.expire;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Integer getId() {
        return this.id;
    }

    public final int getLanguageId() {
        return this.languageId;
    }

    public final String getLanguageName() {
        return this.languageName;
    }

    public final int getSubId() {
        return this.subId;
    }

    public final String getUrl() {
        return this.url;
    }

    public CaptionVideoPlayerItemModel(Integer num, String languageName, int i, String url, long j, String str, int i2) {
        o.LJIIIZ(languageName, "languageName");
        o.LJIIIZ(url, "url");
        this.id = num;
        this.languageName = languageName;
        this.languageId = i;
        this.url = url;
        this.expire = j;
        this.format = str;
        this.subId = i2;
    }

    public /* synthetic */ CaptionVideoPlayerItemModel(Integer num, String str, int i, String str2, long j, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : num, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? 0L : j, (i3 & 32) == 0 ? str3 : "", (i3 & 64) == 0 ? i2 : -1);
    }
}
