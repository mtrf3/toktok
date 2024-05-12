package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C47959Irz;
import X.C72433Sbl;
import X.C76800UCe;
import X.InterfaceC65349Pkn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InnerPushUITemplate implements Serializable {
    public int LJLIL;
    public transient InterfaceC88472Yns<? super C72433Sbl, C76800UCe> LJLILLLLZI;
    public transient InterfaceC88471Ynr<? super C72433Sbl, ? super C72433Sbl, C76800UCe> LJLJI;
    public final transient List<Integer> LJLJJI;
    public transient Drawable LJLJJL;
    public CharSequence LJLJJLL;
    public transient int LJLJL;
    public transient Drawable LJLJLJ;
    public transient List<Bitmap> LJLJLLL;
    public transient Bitmap LJLL;
    public transient Bitmap LJLLI;
    public transient Bitmap LJLLILLLL;

    @InterfaceC65349Pkn("avatar_breath")
    public final Boolean avatarBreath;

    @InterfaceC65349Pkn("avatar_drawable")
    public final List<Drawable> avatarDrawables;

    @InterfaceC65349Pkn("avatar_image_border_width")
    public final float avatarImageBorderWidth;

    @InterfaceC65349Pkn("avatar_image_height")
    public final int avatarImageHeight;

    @InterfaceC65349Pkn("avatar_image_radius")
    public final float avatarImageRadius;

    @InterfaceC65349Pkn("avatar_image_width")
    public final int avatarImageWidth;

    @InterfaceC65349Pkn("avatar_right_label_height")
    public int avatarRightLabelHeight;

    @InterfaceC65349Pkn("avatar_right_label_url")
    public final String avatarRightLabelUrl;

    @InterfaceC65349Pkn("avatar_right_label_width")
    public int avatarRightLabelWidth;

    @InterfaceC65349Pkn("avatar_ring")
    public final int avatarRing;

    @InterfaceC65349Pkn("avatar_schema_url")
    public final String avatarSchema;

    @InterfaceC65349Pkn("avatar_urls")
    public List<String> avatarUrls;

    @InterfaceC65349Pkn("bottom_button_text")
    public final String bottomBtnText;

    @InterfaceC65349Pkn("bottom_schema_url")
    public final String bottomSchemaUrl;

    @InterfaceC65349Pkn("bottom_type")
    public int bottomType;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("content_limit_lines")
    public int contentLimitLines;

    @InterfaceC65349Pkn("from_users")
    public final List<User> fromUsers;

    @InterfaceC65349Pkn("global_radius")
    public int globalRadius;

    @InterfaceC65349Pkn("global_schema_url")
    public String globalSchemaUrl;

    @InterfaceC65349Pkn("left_type")
    public final Integer leftType;

    @InterfaceC65349Pkn("middle_alignment")
    public int middleAlignment;

    @InterfaceC65349Pkn("middle_schema_url")
    public final String middleSchemaUrl;

    @InterfaceC65349Pkn("right_button_text")
    public String rightBtnText;

    @InterfaceC65349Pkn("right_image_border_width")
    public final float rightImageBorderWidth;

    @InterfaceC65349Pkn("right_image_height")
    public int rightImageHeight;

    @InterfaceC65349Pkn("right_image_radius")
    public int rightImageRadius;

    @InterfaceC65349Pkn("right_image_url")
    public String rightImageUrl;

    @InterfaceC65349Pkn("right_image_width")
    public int rightImageWidth;

    @InterfaceC65349Pkn("right_schema_url")
    public final String rightSchemaUrl;

    @InterfaceC65349Pkn("right_type")
    public int rightType;

    @InterfaceC65349Pkn("second_avatar_urls")
    public List<String> secondAvatarUrls;

    @InterfaceC65349Pkn("tag_text")
    public String tagText;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("top_image_height")
    public int topImageHeight;

    @InterfaceC65349Pkn("top_image_radius")
    public int topImageRadius;

    @InterfaceC65349Pkn("top_image_url")
    public String topImageUrl;

    @InterfaceC65349Pkn("top_image_width")
    public int topImageWidth;

    @InterfaceC65349Pkn("top_schema_url")
    public final String topSchemaUrl;

    @InterfaceC65349Pkn("top_type")
    public int topType;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InnerPushUITemplate() {
        /*
            r56 = this;
            r1 = 0
            r2 = 0
            r17 = 0
            r53 = -1
            r54 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r56
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r2
            r14 = r2
            r15 = r1
            r16 = r1
            r18 = r17
            r19 = r2
            r20 = r1
            r21 = r1
            r22 = r2
            r23 = r2
            r24 = r2
            r25 = r1
            r26 = r1
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r1
            r32 = r2
            r33 = r1
            r34 = r2
            r35 = r2
            r36 = r1
            r37 = r1
            r38 = r1
            r39 = r1
            r40 = r2
            r41 = r2
            r42 = r17
            r43 = r1
            r44 = r2
            r45 = r2
            r46 = r2
            r47 = r1
            r48 = r2
            r49 = r2
            r50 = r2
            r51 = r2
            r52 = r2
            r55 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate.<init>():void");
    }

    public static /* synthetic */ InnerPushUITemplate copy$default(InnerPushUITemplate innerPushUITemplate, int i, String str, int i2, int i3, int i4, int i5, String str2, List list, List list2, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr, List list3, List list4, String str3, int i6, int i7, float f, float f2, String str4, int i8, int i9, Drawable drawable, Integer num, Boolean bool, int i10, int i11, String str5, String str6, String str7, CharSequence charSequence, int i12, String str8, int i13, String str9, String str10, int i14, int i15, int i16, int i17, Drawable drawable2, String str11, float f3, int i18, String str12, String str13, String str14, int i19, List list5, List list6, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i20, int i21, Object obj) {
        List list7 = list2;
        List list8 = list;
        String str15 = str2;
        String str16 = str;
        int i22 = i;
        int i23 = i2;
        int i24 = i3;
        int i25 = i4;
        int i26 = i5;
        Bitmap bitmap4 = bitmap2;
        Bitmap bitmap5 = bitmap;
        List list9 = list6;
        int i27 = i19;
        String str17 = str14;
        String str18 = str13;
        int i28 = i10;
        List list10 = list5;
        Boolean bool2 = bool;
        Integer num2 = num;
        int i29 = i8;
        String str19 = str11;
        String str20 = str4;
        List list11 = list3;
        int i30 = i7;
        Drawable drawable3 = drawable;
        String str21 = str9;
        List list12 = list4;
        float f4 = f;
        InterfaceC88471Ynr interfaceC88471Ynr2 = interfaceC88471Ynr;
        int i31 = i15;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        Bitmap bitmap6 = bitmap3;
        int i32 = i11;
        String str22 = str5;
        int i33 = i16;
        String str23 = str6;
        String str24 = str7;
        CharSequence charSequence2 = charSequence;
        float f5 = f3;
        int i34 = i12;
        String str25 = str8;
        int i35 = i13;
        String str26 = str3;
        String str27 = str10;
        int i36 = i6;
        int i37 = i14;
        int i38 = i17;
        float f6 = f2;
        Drawable drawable4 = drawable2;
        int i39 = i18;
        int i40 = i9;
        String str28 = str12;
        if ((i20 & 1) != 0) {
            i22 = innerPushUITemplate.topType;
        }
        if ((i20 & 2) != 0) {
            str16 = innerPushUITemplate.topImageUrl;
        }
        if ((i20 & 4) != 0) {
            i23 = innerPushUITemplate.LJLIL;
        }
        if ((i20 & 8) != 0) {
            i24 = innerPushUITemplate.topImageWidth;
        }
        if ((i20 & 16) != 0) {
            i25 = innerPushUITemplate.topImageHeight;
        }
        if ((i20 & 32) != 0) {
            i26 = innerPushUITemplate.topImageRadius;
        }
        if ((i20 & 64) != 0) {
            str15 = innerPushUITemplate.topSchemaUrl;
        }
        if ((i20 & 128) != 0) {
            list8 = innerPushUITemplate.avatarUrls;
        }
        if ((i20 & 256) != 0) {
            list7 = innerPushUITemplate.secondAvatarUrls;
        }
        if ((i20 & 512) != 0) {
            interfaceC88472Yns2 = innerPushUITemplate.LJLILLLLZI;
        }
        if ((i20 & 1024) != 0) {
            interfaceC88471Ynr2 = innerPushUITemplate.LJLJI;
        }
        if ((i20 & 2048) != 0) {
            list11 = innerPushUITemplate.LJLJJI;
        }
        if ((i20 & 4096) != 0) {
            list12 = innerPushUITemplate.avatarDrawables;
        }
        if ((i20 & FileUtils.BUFFER_SIZE) != 0) {
            str26 = innerPushUITemplate.avatarSchema;
        }
        if ((i20 & 16384) != 0) {
            i36 = innerPushUITemplate.avatarImageWidth;
        }
        if ((i20 & 32768) != 0) {
            i30 = innerPushUITemplate.avatarImageHeight;
        }
        if ((i20 & 65536) != 0) {
            f4 = innerPushUITemplate.avatarImageRadius;
        }
        if ((i20 & 131072) != 0) {
            f6 = innerPushUITemplate.avatarImageBorderWidth;
        }
        if ((i20 & 262144) != 0) {
            str20 = innerPushUITemplate.avatarRightLabelUrl;
        }
        if ((i20 & 524288) != 0) {
            i29 = innerPushUITemplate.avatarRightLabelWidth;
        }
        if ((1048576 & i20) != 0) {
            i40 = innerPushUITemplate.avatarRightLabelHeight;
        }
        if ((2097152 & i20) != 0) {
            drawable3 = innerPushUITemplate.LJLJJL;
        }
        if ((4194304 & i20) != 0) {
            num2 = innerPushUITemplate.leftType;
        }
        if ((8388608 & i20) != 0) {
            bool2 = innerPushUITemplate.avatarBreath;
        }
        if ((16777216 & i20) != 0) {
            i28 = innerPushUITemplate.avatarRing;
        }
        if ((33554432 & i20) != 0) {
            i32 = innerPushUITemplate.middleAlignment;
        }
        if ((67108864 & i20) != 0) {
            str22 = innerPushUITemplate.title;
        }
        if ((134217728 & i20) != 0) {
            str23 = innerPushUITemplate.tagText;
        }
        if ((268435456 & i20) != 0) {
            str24 = innerPushUITemplate.content;
        }
        if ((536870912 & i20) != 0) {
            charSequence2 = innerPushUITemplate.LJLJJLL;
        }
        if ((1073741824 & i20) != 0) {
            i34 = innerPushUITemplate.contentLimitLines;
        }
        if ((i20 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            str25 = innerPushUITemplate.middleSchemaUrl;
        }
        if ((i21 & 1) != 0) {
            i35 = innerPushUITemplate.rightType;
        }
        if ((i21 & 2) != 0) {
            str21 = innerPushUITemplate.rightBtnText;
        }
        if ((i21 & 4) != 0) {
            str27 = innerPushUITemplate.rightImageUrl;
        }
        if ((i21 & 8) != 0) {
            i37 = innerPushUITemplate.rightImageWidth;
        }
        if ((i21 & 16) != 0) {
            i31 = innerPushUITemplate.rightImageHeight;
        }
        if ((i21 & 32) != 0) {
            i33 = innerPushUITemplate.rightImageRadius;
        }
        if ((i21 & 64) != 0) {
            i38 = innerPushUITemplate.LJLJL;
        }
        if ((i21 & 128) != 0) {
            drawable4 = innerPushUITemplate.LJLJLJ;
        }
        if ((i21 & 256) != 0) {
            str19 = innerPushUITemplate.rightSchemaUrl;
        }
        if ((i21 & 512) != 0) {
            f5 = innerPushUITemplate.rightImageBorderWidth;
        }
        if ((i21 & 1024) != 0) {
            i39 = innerPushUITemplate.bottomType;
        }
        if ((i21 & 2048) != 0) {
            str28 = innerPushUITemplate.bottomBtnText;
        }
        if ((i21 & 4096) != 0) {
            str18 = innerPushUITemplate.bottomSchemaUrl;
        }
        if ((i21 & FileUtils.BUFFER_SIZE) != 0) {
            str17 = innerPushUITemplate.globalSchemaUrl;
        }
        if ((i21 & 16384) != 0) {
            i27 = innerPushUITemplate.globalRadius;
        }
        if ((i21 & 32768) != 0) {
            list10 = innerPushUITemplate.fromUsers;
        }
        if ((i21 & 65536) != 0) {
            list9 = innerPushUITemplate.LJLJLLL;
        }
        if ((i21 & 131072) != 0) {
            bitmap5 = innerPushUITemplate.LJLL;
        }
        if ((i21 & 262144) != 0) {
            bitmap4 = innerPushUITemplate.LJLLI;
        }
        if ((i21 & 524288) != 0) {
            bitmap6 = innerPushUITemplate.LJLLILLLL;
        }
        return innerPushUITemplate.copy(i22, str16, i23, i24, i25, i26, str15, list8, list7, interfaceC88472Yns2, interfaceC88471Ynr2, list11, list12, str26, i36, i30, f4, f6, str20, i29, i40, drawable3, num2, bool2, i28, i32, str22, str23, str24, charSequence2, i34, str25, i35, str21, str27, i37, i31, i33, i38, drawable4, str19, f5, i39, str28, str18, str17, i27, list10, list9, bitmap5, bitmap4, bitmap6);
    }

    public final InnerPushUITemplate copy(int i, String str, int i2, int i3, int i4, int i5, String str2, List<String> list, List<String> list2, InterfaceC88472Yns<? super C72433Sbl, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C72433Sbl, ? super C72433Sbl, C76800UCe> interfaceC88471Ynr, List<Integer> list3, List<? extends Drawable> list4, String str3, int i6, int i7, float f, float f2, String str4, int i8, int i9, Drawable drawable, Integer num, Boolean bool, int i10, int i11, String str5, String str6, String str7, CharSequence charSequence, int i12, String str8, int i13, String str9, String str10, int i14, int i15, int i16, int i17, Drawable drawable2, String str11, float f3, int i18, String str12, String str13, String str14, int i19, List<? extends User> list5, List<Bitmap> list6, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        return new InnerPushUITemplate(i, str, i2, i3, i4, i5, str2, list, list2, interfaceC88472Yns, interfaceC88471Ynr, list3, list4, str3, i6, i7, f, f2, str4, i8, i9, drawable, num, bool, i10, i11, str5, str6, str7, charSequence, i12, str8, i13, str9, str10, i14, i15, i16, i17, drawable2, str11, f3, i18, str12, str13, str14, i19, list5, list6, bitmap, bitmap2, bitmap3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerPushUITemplate)) {
            return false;
        }
        InnerPushUITemplate innerPushUITemplate = (InnerPushUITemplate) obj;
        return this.topType == innerPushUITemplate.topType && o.LJ(this.topImageUrl, innerPushUITemplate.topImageUrl) && this.LJLIL == innerPushUITemplate.LJLIL && this.topImageWidth == innerPushUITemplate.topImageWidth && this.topImageHeight == innerPushUITemplate.topImageHeight && this.topImageRadius == innerPushUITemplate.topImageRadius && o.LJ(this.topSchemaUrl, innerPushUITemplate.topSchemaUrl) && o.LJ(this.avatarUrls, innerPushUITemplate.avatarUrls) && o.LJ(this.secondAvatarUrls, innerPushUITemplate.secondAvatarUrls) && o.LJ(this.LJLILLLLZI, innerPushUITemplate.LJLILLLLZI) && o.LJ(this.LJLJI, innerPushUITemplate.LJLJI) && o.LJ(this.LJLJJI, innerPushUITemplate.LJLJJI) && o.LJ(this.avatarDrawables, innerPushUITemplate.avatarDrawables) && o.LJ(this.avatarSchema, innerPushUITemplate.avatarSchema) && this.avatarImageWidth == innerPushUITemplate.avatarImageWidth && this.avatarImageHeight == innerPushUITemplate.avatarImageHeight && Float.compare(this.avatarImageRadius, innerPushUITemplate.avatarImageRadius) == 0 && Float.compare(this.avatarImageBorderWidth, innerPushUITemplate.avatarImageBorderWidth) == 0 && o.LJ(this.avatarRightLabelUrl, innerPushUITemplate.avatarRightLabelUrl) && this.avatarRightLabelWidth == innerPushUITemplate.avatarRightLabelWidth && this.avatarRightLabelHeight == innerPushUITemplate.avatarRightLabelHeight && o.LJ(this.LJLJJL, innerPushUITemplate.LJLJJL) && o.LJ(this.leftType, innerPushUITemplate.leftType) && o.LJ(this.avatarBreath, innerPushUITemplate.avatarBreath) && this.avatarRing == innerPushUITemplate.avatarRing && this.middleAlignment == innerPushUITemplate.middleAlignment && o.LJ(this.title, innerPushUITemplate.title) && o.LJ(this.tagText, innerPushUITemplate.tagText) && o.LJ(this.content, innerPushUITemplate.content) && o.LJ(this.LJLJJLL, innerPushUITemplate.LJLJJLL) && this.contentLimitLines == innerPushUITemplate.contentLimitLines && o.LJ(this.middleSchemaUrl, innerPushUITemplate.middleSchemaUrl) && this.rightType == innerPushUITemplate.rightType && o.LJ(this.rightBtnText, innerPushUITemplate.rightBtnText) && o.LJ(this.rightImageUrl, innerPushUITemplate.rightImageUrl) && this.rightImageWidth == innerPushUITemplate.rightImageWidth && this.rightImageHeight == innerPushUITemplate.rightImageHeight && this.rightImageRadius == innerPushUITemplate.rightImageRadius && this.LJLJL == innerPushUITemplate.LJLJL && o.LJ(this.LJLJLJ, innerPushUITemplate.LJLJLJ) && o.LJ(this.rightSchemaUrl, innerPushUITemplate.rightSchemaUrl) && Float.compare(this.rightImageBorderWidth, innerPushUITemplate.rightImageBorderWidth) == 0 && this.bottomType == innerPushUITemplate.bottomType && o.LJ(this.bottomBtnText, innerPushUITemplate.bottomBtnText) && o.LJ(this.bottomSchemaUrl, innerPushUITemplate.bottomSchemaUrl) && o.LJ(this.globalSchemaUrl, innerPushUITemplate.globalSchemaUrl) && this.globalRadius == innerPushUITemplate.globalRadius && o.LJ(this.fromUsers, innerPushUITemplate.fromUsers) && o.LJ(this.LJLJLLL, innerPushUITemplate.LJLJLLL) && o.LJ(this.LJLL, innerPushUITemplate.LJLL) && o.LJ(this.LJLLI, innerPushUITemplate.LJLLI) && o.LJ(this.LJLLILLLL, innerPushUITemplate.LJLLILLLL);
    }

    public String toString() {
        return "InnerPushUITemplate(topType=" + this.topType + ", topImageUrl=" + this.topImageUrl + ", topImageRes=" + this.LJLIL + ", topImageWidth=" + this.topImageWidth + ", topImageHeight=" + this.topImageHeight + ", topImageRadius=" + this.topImageRadius + ", topSchemaUrl=" + this.topSchemaUrl + ", avatarUrls=" + this.avatarUrls + ", secondAvatarUrls=" + this.secondAvatarUrls + ", singleAvatarLoadFunction=" + this.LJLILLLLZI + ", multiAvatarsLoadFunction=" + this.LJLJI + ", avatarResIds=" + this.LJLJJI + ", avatarDrawables=" + this.avatarDrawables + ", avatarSchema=" + this.avatarSchema + ", avatarImageWidth=" + this.avatarImageWidth + ", avatarImageHeight=" + this.avatarImageHeight + ", avatarImageRadius=" + this.avatarImageRadius + ", avatarImageBorderWidth=" + this.avatarImageBorderWidth + ", avatarRightLabelUrl=" + this.avatarRightLabelUrl + ", avatarRightLabelWidth=" + this.avatarRightLabelWidth + ", avatarRightLabelHeight=" + this.avatarRightLabelHeight + ", avatarRightLabelDrawable=" + this.LJLJJL + ", leftType=" + this.leftType + ", avatarBreath=" + this.avatarBreath + ", avatarRing=" + this.avatarRing + ", middleAlignment=" + this.middleAlignment + ", title=" + this.title + ", tagText=" + this.tagText + ", content=" + this.content + ", contentChar=" + ((Object) this.LJLJJLL) + ", contentLimitLines=" + this.contentLimitLines + ", middleSchemaUrl=" + this.middleSchemaUrl + ", rightType=" + this.rightType + ", rightBtnText=" + this.rightBtnText + ", rightImageUrl=" + this.rightImageUrl + ", rightImageWidth=" + this.rightImageWidth + ", rightImageHeight=" + this.rightImageHeight + ", rightImageRadius=" + this.rightImageRadius + ", rightImageResId=" + this.LJLJL + ", rightImageDrawable=" + this.LJLJLJ + ", rightSchemaUrl=" + this.rightSchemaUrl + ", rightImageBorderWidth=" + this.rightImageBorderWidth + ", bottomType=" + this.bottomType + ", bottomBtnText=" + this.bottomBtnText + ", bottomSchemaUrl=" + this.bottomSchemaUrl + ", globalSchemaUrl=" + this.globalSchemaUrl + ", globalRadius=" + this.globalRadius + ", fromUsers=" + this.fromUsers + ", preloadAvatar=" + this.LJLJLLL + ", preloadLabelImage=" + this.LJLL + ", preloadRightImage=" + this.LJLLI + ", preloadTopImage=" + this.LJLLILLLL + ')';
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int i = this.topType * 31;
        String str = this.topImageUrl;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (((((((((i + hashCode) * 31) + this.LJLIL) * 31) + this.topImageWidth) * 31) + this.topImageHeight) * 31) + this.topImageRadius) * 31;
        String str2 = this.topSchemaUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        List<String> list = this.avatarUrls;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        List<String> list2 = this.secondAvatarUrls;
        if (list2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list2.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        InterfaceC88472Yns<? super C72433Sbl, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = interfaceC88472Yns.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        InterfaceC88471Ynr<? super C72433Sbl, ? super C72433Sbl, C76800UCe> interfaceC88471Ynr = this.LJLJI;
        if (interfaceC88471Ynr == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = interfaceC88471Ynr.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        List<Integer> list3 = this.LJLJJI;
        if (list3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list3.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        List<Drawable> list4 = this.avatarDrawables;
        if (list4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list4.hashCode();
        }
        int i10 = (i9 + hashCode8) * 31;
        String str3 = this.avatarSchema;
        if (str3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str3.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.avatarImageBorderWidth, C47959Irz.LIZIZ(this.avatarImageRadius, (((((i10 + hashCode9) * 31) + this.avatarImageWidth) * 31) + this.avatarImageHeight) * 31, 31), 31);
        String str4 = this.avatarRightLabelUrl;
        if (str4 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str4.hashCode();
        }
        int i11 = (((((LIZIZ + hashCode10) * 31) + this.avatarRightLabelWidth) * 31) + this.avatarRightLabelHeight) * 31;
        Drawable drawable = this.LJLJJL;
        if (drawable == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = drawable.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Integer num = this.leftType;
        if (num == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        Boolean bool = this.avatarBreath;
        if (bool == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = bool.hashCode();
        }
        int i14 = (((((i13 + hashCode13) * 31) + this.avatarRing) * 31) + this.middleAlignment) * 31;
        String str5 = this.title;
        if (str5 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str5.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        String str6 = this.tagText;
        if (str6 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str6.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        String str7 = this.content;
        if (str7 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str7.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        CharSequence charSequence = this.LJLJJLL;
        if (charSequence == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = charSequence.hashCode();
        }
        int i18 = (((i17 + hashCode17) * 31) + this.contentLimitLines) * 31;
        String str8 = this.middleSchemaUrl;
        if (str8 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str8.hashCode();
        }
        int i19 = (((i18 + hashCode18) * 31) + this.rightType) * 31;
        String str9 = this.rightBtnText;
        if (str9 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str9.hashCode();
        }
        int i20 = (i19 + hashCode19) * 31;
        String str10 = this.rightImageUrl;
        if (str10 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str10.hashCode();
        }
        int i21 = (((((((((i20 + hashCode20) * 31) + this.rightImageWidth) * 31) + this.rightImageHeight) * 31) + this.rightImageRadius) * 31) + this.LJLJL) * 31;
        Drawable drawable2 = this.LJLJLJ;
        if (drawable2 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = drawable2.hashCode();
        }
        int i22 = (i21 + hashCode21) * 31;
        String str11 = this.rightSchemaUrl;
        if (str11 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = str11.hashCode();
        }
        int LIZIZ2 = (C47959Irz.LIZIZ(this.rightImageBorderWidth, (i22 + hashCode22) * 31, 31) + this.bottomType) * 31;
        String str12 = this.bottomBtnText;
        if (str12 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = str12.hashCode();
        }
        int i23 = (LIZIZ2 + hashCode23) * 31;
        String str13 = this.bottomSchemaUrl;
        if (str13 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = str13.hashCode();
        }
        int i24 = (i23 + hashCode24) * 31;
        String str14 = this.globalSchemaUrl;
        if (str14 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = str14.hashCode();
        }
        int i25 = (((i24 + hashCode25) * 31) + this.globalRadius) * 31;
        List<User> list5 = this.fromUsers;
        if (list5 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = list5.hashCode();
        }
        int i26 = (i25 + hashCode26) * 31;
        List<Bitmap> list6 = this.LJLJLLL;
        if (list6 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = list6.hashCode();
        }
        int i27 = (i26 + hashCode27) * 31;
        Bitmap bitmap = this.LJLL;
        if (bitmap == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = bitmap.hashCode();
        }
        int i28 = (i27 + hashCode28) * 31;
        Bitmap bitmap2 = this.LJLLI;
        if (bitmap2 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = bitmap2.hashCode();
        }
        int i29 = (i28 + hashCode29) * 31;
        Bitmap bitmap3 = this.LJLLILLLL;
        if (bitmap3 != null) {
            i2 = bitmap3.hashCode();
        }
        return i29 + i2;
    }

    public final Boolean getAvatarBreath() {
        return this.avatarBreath;
    }

    public final List<Drawable> getAvatarDrawables() {
        return this.avatarDrawables;
    }

    public final float getAvatarImageBorderWidth() {
        return this.avatarImageBorderWidth;
    }

    public final int getAvatarImageHeight() {
        return this.avatarImageHeight;
    }

    public final float getAvatarImageRadius() {
        return this.avatarImageRadius;
    }

    public final int getAvatarImageWidth() {
        return this.avatarImageWidth;
    }

    public final List<Integer> getAvatarResIds() {
        return this.LJLJJI;
    }

    public final Drawable getAvatarRightLabelDrawable() {
        return this.LJLJJL;
    }

    public final int getAvatarRightLabelHeight() {
        return this.avatarRightLabelHeight;
    }

    public final String getAvatarRightLabelUrl() {
        return this.avatarRightLabelUrl;
    }

    public final int getAvatarRightLabelWidth() {
        return this.avatarRightLabelWidth;
    }

    public final int getAvatarRing() {
        return this.avatarRing;
    }

    public final String getAvatarSchema() {
        return this.avatarSchema;
    }

    public final List<String> getAvatarUrls() {
        return this.avatarUrls;
    }

    public final String getBottomBtnText() {
        return this.bottomBtnText;
    }

    public final String getBottomSchemaUrl() {
        return this.bottomSchemaUrl;
    }

    public final int getBottomType() {
        return this.bottomType;
    }

    public final String getContent() {
        return this.content;
    }

    public final CharSequence getContentChar() {
        return this.LJLJJLL;
    }

    public final int getContentLimitLines() {
        return this.contentLimitLines;
    }

    public final List<User> getFromUsers() {
        return this.fromUsers;
    }

    public final int getGlobalRadius() {
        return this.globalRadius;
    }

    public final String getGlobalSchemaUrl() {
        return this.globalSchemaUrl;
    }

    public final Integer getLeftType() {
        return this.leftType;
    }

    public final int getMiddleAlignment() {
        return this.middleAlignment;
    }

    public final String getMiddleSchemaUrl() {
        return this.middleSchemaUrl;
    }

    public final InterfaceC88471Ynr<C72433Sbl, C72433Sbl, C76800UCe> getMultiAvatarsLoadFunction() {
        return this.LJLJI;
    }

    public final List<Bitmap> getPreloadAvatar() {
        return this.LJLJLLL;
    }

    public final Bitmap getPreloadLabelImage() {
        return this.LJLL;
    }

    public final Bitmap getPreloadRightImage() {
        return this.LJLLI;
    }

    public final Bitmap getPreloadTopImage() {
        return this.LJLLILLLL;
    }

    public final String getRightBtnText() {
        return this.rightBtnText;
    }

    public final float getRightImageBorderWidth() {
        return this.rightImageBorderWidth;
    }

    public final Drawable getRightImageDrawable() {
        return this.LJLJLJ;
    }

    public final int getRightImageHeight() {
        return this.rightImageHeight;
    }

    public final int getRightImageRadius() {
        return this.rightImageRadius;
    }

    public final int getRightImageResId() {
        return this.LJLJL;
    }

    public final String getRightImageUrl() {
        return this.rightImageUrl;
    }

    public final int getRightImageWidth() {
        return this.rightImageWidth;
    }

    public final String getRightSchemaUrl() {
        return this.rightSchemaUrl;
    }

    public final int getRightType() {
        return this.rightType;
    }

    public final List<String> getSecondAvatarUrls() {
        return this.secondAvatarUrls;
    }

    public final InterfaceC88472Yns<C72433Sbl, C76800UCe> getSingleAvatarLoadFunction() {
        return this.LJLILLLLZI;
    }

    public final String getTagText() {
        return this.tagText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTopImageHeight() {
        return this.topImageHeight;
    }

    public final int getTopImageRadius() {
        return this.topImageRadius;
    }

    public final int getTopImageRes() {
        return this.LJLIL;
    }

    public final String getTopImageUrl() {
        return this.topImageUrl;
    }

    public final int getTopImageWidth() {
        return this.topImageWidth;
    }

    public final String getTopSchemaUrl() {
        return this.topSchemaUrl;
    }

    public final int getTopType() {
        return this.topType;
    }

    public final void setAvatarRightLabelDrawable(Drawable drawable) {
        this.LJLJJL = drawable;
    }

    public final void setAvatarRightLabelHeight(int i) {
        this.avatarRightLabelHeight = i;
    }

    public final void setAvatarRightLabelWidth(int i) {
        this.avatarRightLabelWidth = i;
    }

    public final void setAvatarUrls(List<String> list) {
        this.avatarUrls = list;
    }

    public final void setBottomType(int i) {
        this.bottomType = i;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setContentChar(CharSequence charSequence) {
        this.LJLJJLL = charSequence;
    }

    public final void setContentLimitLines(int i) {
        this.contentLimitLines = i;
    }

    public final void setGlobalRadius(int i) {
        this.globalRadius = i;
    }

    public final void setGlobalSchemaUrl(String str) {
        this.globalSchemaUrl = str;
    }

    public final void setMiddleAlignment(int i) {
        this.middleAlignment = i;
    }

    public final void setMultiAvatarsLoadFunction(InterfaceC88471Ynr<? super C72433Sbl, ? super C72433Sbl, C76800UCe> interfaceC88471Ynr) {
        this.LJLJI = interfaceC88471Ynr;
    }

    public final void setPreloadAvatar(List<Bitmap> list) {
        this.LJLJLLL = list;
    }

    public final void setPreloadLabelImage(Bitmap bitmap) {
        this.LJLL = bitmap;
    }

    public final void setPreloadRightImage(Bitmap bitmap) {
        this.LJLLI = bitmap;
    }

    public final void setPreloadTopImage(Bitmap bitmap) {
        this.LJLLILLLL = bitmap;
    }

    public final void setRightBtnText(String str) {
        this.rightBtnText = str;
    }

    public final void setRightImageDrawable(Drawable drawable) {
        this.LJLJLJ = drawable;
    }

    public final void setRightImageHeight(int i) {
        this.rightImageHeight = i;
    }

    public final void setRightImageRadius(int i) {
        this.rightImageRadius = i;
    }

    public final void setRightImageResId(int i) {
        this.LJLJL = i;
    }

    public final void setRightImageUrl(String str) {
        this.rightImageUrl = str;
    }

    public final void setRightImageWidth(int i) {
        this.rightImageWidth = i;
    }

    public final void setRightType(int i) {
        this.rightType = i;
    }

    public final void setSecondAvatarUrls(List<String> list) {
        this.secondAvatarUrls = list;
    }

    public final void setSingleAvatarLoadFunction(InterfaceC88472Yns<? super C72433Sbl, C76800UCe> interfaceC88472Yns) {
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    public final void setTagText(String str) {
        this.tagText = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTopImageHeight(int i) {
        this.topImageHeight = i;
    }

    public final void setTopImageRadius(int i) {
        this.topImageRadius = i;
    }

    public final void setTopImageRes(int i) {
        this.LJLIL = i;
    }

    public final void setTopImageUrl(String str) {
        this.topImageUrl = str;
    }

    public final void setTopImageWidth(int i) {
        this.topImageWidth = i;
    }

    public final void setTopType(int i) {
        this.topType = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InnerPushUITemplate(int i, String str, int i2, int i3, int i4, int i5, String str2, List<String> list, List<String> list2, InterfaceC88472Yns<? super C72433Sbl, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C72433Sbl, ? super C72433Sbl, C76800UCe> interfaceC88471Ynr, List<Integer> list3, List<? extends Drawable> list4, String str3, int i6, int i7, float f, float f2, String str4, int i8, int i9, Drawable drawable, Integer num, Boolean bool, int i10, int i11, String str5, String str6, String str7, CharSequence charSequence, int i12, String str8, int i13, String str9, String str10, int i14, int i15, int i16, int i17, Drawable drawable2, String str11, float f3, int i18, String str12, String str13, String str14, int i19, List<? extends User> list5, List<Bitmap> list6, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        this.topType = i;
        this.topImageUrl = str;
        this.LJLIL = i2;
        this.topImageWidth = i3;
        this.topImageHeight = i4;
        this.topImageRadius = i5;
        this.topSchemaUrl = str2;
        this.avatarUrls = list;
        this.secondAvatarUrls = list2;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = list3;
        this.avatarDrawables = list4;
        this.avatarSchema = str3;
        this.avatarImageWidth = i6;
        this.avatarImageHeight = i7;
        this.avatarImageRadius = f;
        this.avatarImageBorderWidth = f2;
        this.avatarRightLabelUrl = str4;
        this.avatarRightLabelWidth = i8;
        this.avatarRightLabelHeight = i9;
        this.LJLJJL = drawable;
        this.leftType = num;
        this.avatarBreath = bool;
        this.avatarRing = i10;
        this.middleAlignment = i11;
        this.title = str5;
        this.tagText = str6;
        this.content = str7;
        this.LJLJJLL = charSequence;
        this.contentLimitLines = i12;
        this.middleSchemaUrl = str8;
        this.rightType = i13;
        this.rightBtnText = str9;
        this.rightImageUrl = str10;
        this.rightImageWidth = i14;
        this.rightImageHeight = i15;
        this.rightImageRadius = i16;
        this.LJLJL = i17;
        this.LJLJLJ = drawable2;
        this.rightSchemaUrl = str11;
        this.rightImageBorderWidth = f3;
        this.bottomType = i18;
        this.bottomBtnText = str12;
        this.bottomSchemaUrl = str13;
        this.globalSchemaUrl = str14;
        this.globalRadius = i19;
        this.fromUsers = list5;
        this.LJLJLLL = list6;
        this.LJLL = bitmap;
        this.LJLLI = bitmap2;
        this.LJLLILLLL = bitmap3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ InnerPushUITemplate(int r60, java.lang.String r61, int r62, int r63, int r64, int r65, java.lang.String r66, java.util.List r67, java.util.List r68, X.InterfaceC88472Yns r69, X.InterfaceC88471Ynr r70, java.util.List r71, java.util.List r72, java.lang.String r73, int r74, int r75, float r76, float r77, java.lang.String r78, int r79, int r80, android.graphics.drawable.Drawable r81, java.lang.Integer r82, java.lang.Boolean r83, int r84, int r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, java.lang.CharSequence r89, int r90, java.lang.String r91, int r92, java.lang.String r93, java.lang.String r94, int r95, int r96, int r97, int r98, android.graphics.drawable.Drawable r99, java.lang.String r100, float r101, int r102, java.lang.String r103, java.lang.String r104, java.lang.String r105, int r106, java.util.List r107, java.util.List r108, android.graphics.Bitmap r109, android.graphics.Bitmap r110, android.graphics.Bitmap r111, int r112, int r113, kotlin.jvm.internal.DefaultConstructorMarker r114) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate.<init>(int, java.lang.String, int, int, int, int, java.lang.String, java.util.List, java.util.List, X.Yns, X.Ynr, java.util.List, java.util.List, java.lang.String, int, int, float, float, java.lang.String, int, int, android.graphics.drawable.Drawable, java.lang.Integer, java.lang.Boolean, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, int, java.lang.String, int, java.lang.String, java.lang.String, int, int, int, int, android.graphics.drawable.Drawable, java.lang.String, float, int, java.lang.String, java.lang.String, java.lang.String, int, java.util.List, java.util.List, android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
