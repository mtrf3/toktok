package com.ss.android.ugc.aweme.sticker.image;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes8.dex */
public final class TemplateItem {

    @InterfaceC65349Pkn("app_id")
    public Integer appID;

    @InterfaceC65349Pkn("cover")
    public TemplateCover cover;

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("height")
    public Integer height;

    @InterfaceC65349Pkn("md5")
    public String md5;

    @InterfaceC65349Pkn("media_id")
    public Long mediaId;

    @InterfaceC65349Pkn("provider")
    public Integer provider;

    @InterfaceC65349Pkn("region_key")
    public String regionKey;

    @InterfaceC65349Pkn("tags")
    public List<String> tags;

    @InterfaceC65349Pkn("template_id")
    public Long templateID;

    @InterfaceC65349Pkn("TemplateUri")
    public String templateUri;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("type")
    public Integer type;

    @InterfaceC65349Pkn("width")
    public Integer width;

    public TemplateItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public TemplateItem(Long l, Integer num, String str, Integer num2, Long l2, String str2, String str3, Integer num3, Integer num4, String str4, String str5, TemplateCover templateCover, List<String> list, String str6, Integer num5) {
        this.templateID = l;
        this.appID = num;
        this.regionKey = str;
        this.type = num2;
        this.mediaId = l2;
        this.title = str2;
        this.desc = str3;
        this.width = num3;
        this.height = num4;
        this.md5 = str4;
        this.templateUri = str5;
        this.cover = templateCover;
        this.tags = list;
        this.extra = str6;
        this.provider = num5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TemplateItem(java.lang.Long r20, java.lang.Integer r21, java.lang.String r22, java.lang.Integer r23, java.lang.Long r24, java.lang.String r25, java.lang.String r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.String r29, java.lang.String r30, com.ss.android.ugc.aweme.sticker.image.TemplateCover r31, java.util.List r32, java.lang.String r33, java.lang.Integer r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r1 = r35
            r18 = r34
            r16 = r32
            r15 = r31
            r14 = r30
            r13 = r29
            r12 = r28
            r11 = r27
            r5 = r21
            r4 = r20
            r6 = r22
            r7 = r23
            r9 = r25
            r10 = r26
            r0 = r1 & 1
            r2 = -1
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            if (r0 == 0) goto L27
            r4 = r8
        L27:
            r0 = r1 & 2
            r2 = -1
            if (r0 == 0) goto L30
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
        L30:
            r0 = r1 & 4
            java.lang.String r17 = ""
            if (r0 == 0) goto L38
            r6 = r17
        L38:
            r0 = r1 & 8
            if (r0 == 0) goto L40
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
        L40:
            r0 = r1 & 16
            if (r0 == 0) goto L8a
        L44:
            r0 = r1 & 32
            if (r0 == 0) goto L4a
            r9 = r17
        L4a:
            r0 = r1 & 64
            if (r0 == 0) goto L50
            r10 = r17
        L50:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L58
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
        L58:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L60
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
        L60:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L66
            r13 = r17
        L66:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L6c
            r14 = r17
        L6c:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L71
            r15 = 0
        L71:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L77
            X.OQg r16 = X.C61878OQg.INSTANCE
        L77:
            r0 = r1 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L87
        L7b:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L81
            r18 = 0
        L81:
            r3 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L87:
            r17 = r33
            goto L7b
        L8a:
            r8 = r24
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.image.TemplateItem.<init>(java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.sticker.image.TemplateCover, java.util.List, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
