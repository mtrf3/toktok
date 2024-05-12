package com.ss.android.ugc.aweme.challenge.model;

import X.C07670Rv;
import X.C221108m2;
import X.C5H3;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChallengeDetailParam implements Serializable, IRouteArg {
    public static final Parcelable.Creator<ChallengeDetailParam> CREATOR = new Creator();
    public String awemeId;
    public String bannerId;
    public String challengeFrom;
    public int challengeType;
    public int clickReason;
    public final C5H3 enterFrom$delegate;
    public String enterpriseUid;
    public String extra_challenge_id;
    public String extra_cid;
    public String from;
    public String fromToken;
    public Integer isBundled;
    public String isCommerce;
    public boolean isHashTag;
    public String parentTagId;
    public String previewToken;
    public String processId;
    public String shootEnterFrom;
    public int showTabIndex;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<ChallengeDetailParam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeDetailParam createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ChallengeDetailParam(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeDetailParam[] newArray(int i) {
            return new ChallengeDetailParam[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam() {
        /*
            r21 = this;
            r1 = 0
            r3 = 0
            r19 = 262143(0x3ffff, float:3.6734E-40)
            r0 = r21
            r2 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r3
            r13 = r3
            r14 = r1
            r15 = r3
            r16 = r1
            r17 = r1
            r18 = r1
            r20 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22) {
        /*
            r21 = this;
            r2 = 0
            r3 = 0
            r19 = 262142(0x3fffe, float:3.67339E-40)
            r0 = r21
            r1 = r22
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r3
            r13 = r3
            r14 = r2
            r15 = r3
            r16 = r2
            r17 = r2
            r18 = r2
            r20 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22, java.lang.String r23) {
        /*
            r21 = this;
            r3 = 0
            r4 = 0
            r19 = 262140(0x3fffc, float:3.67336E-40)
            r1 = r22
            r2 = r23
            r0 = r21
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r3
            r13 = r3
            r14 = r4
            r15 = r3
            r16 = r4
            r17 = r4
            r18 = r4
            r20 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22, java.lang.String r23, int r24) {
        /*
            r21 = this;
            r4 = 0
            r12 = 0
            r19 = 262136(0x3fff8, float:3.67331E-40)
            r1 = r22
            r0 = r21
            r3 = r24
            r2 = r23
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r13 = r12
            r14 = r4
            r15 = r12
            r16 = r4
            r17 = r4
            r18 = r4
            r20 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25) {
        /*
            r21 = this;
            r5 = 0
            r12 = 0
            r19 = 262128(0x3fff0, float:3.6732E-40)
            r1 = r22
            r0 = r21
            r2 = r23
            r4 = r25
            r3 = r24
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r13 = r12
            r14 = r5
            r15 = r12
            r16 = r5
            r17 = r5
            r18 = r5
            r20 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26) {
        /*
            r21 = this;
            r6 = 0
            r12 = 0
            r19 = 262112(0x3ffe0, float:3.67297E-40)
            r1 = r22
            r0 = r21
            r2 = r23
            r3 = r24
            r5 = r26
            r4 = r25
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r13 = r12
            r14 = r6
            r15 = r12
            r16 = r6
            r17 = r6
            r18 = r6
            r20 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
        /*
            r21 = this;
            r7 = 0
            r12 = 0
            r19 = 262080(0x3ffc0, float:3.67252E-40)
            r5 = r26
            r1 = r22
            r6 = r27
            r0 = r21
            r2 = r23
            r3 = r24
            r4 = r25
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r13 = r12
            r14 = r7
            r15 = r12
            r16 = r7
            r17 = r7
            r18 = r7
            r20 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /*
            r21 = this;
            r8 = 0
            r12 = 0
            r19 = 262016(0x3ff80, float:3.67163E-40)
            r5 = r26
            r4 = r25
            r6 = r27
            r7 = r28
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r9 = r8
            r10 = r8
            r11 = r8
            r13 = r12
            r14 = r8
            r15 = r12
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.Integer r29) {
        /*
            r21 = this;
            r9 = 0
            r12 = 0
            r19 = 261888(0x3ff00, float:3.66983E-40)
            r5 = r26
            r4 = r25
            r3 = r24
            r7 = r28
            r0 = r21
            r8 = r29
            r1 = r22
            r6 = r27
            r2 = r23
            r10 = r9
            r11 = r9
            r13 = r12
            r14 = r9
            r15 = r12
            r16 = r9
            r17 = r9
            r18 = r9
            r20 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.Integer r29, java.lang.String r30) {
        /*
            r21 = this;
            r10 = 0
            r12 = 0
            r19 = 261632(0x3fe00, float:3.66625E-40)
            r5 = r26
            r4 = r25
            r3 = r24
            r2 = r23
            r8 = r29
            r1 = r22
            r9 = r30
            r7 = r28
            r0 = r21
            r6 = r27
            r11 = r10
            r13 = r12
            r14 = r10
            r15 = r12
            r16 = r10
            r17 = r10
            r18 = r10
            r20 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31) {
        /*
            r21 = this;
            r11 = 0
            r12 = 0
            r19 = 261120(0x3fc00, float:3.65907E-40)
            r5 = r26
            r4 = r25
            r3 = r24
            r2 = r23
            r0 = r21
            r9 = r30
            r10 = r31
            r8 = r29
            r1 = r22
            r7 = r28
            r6 = r27
            r13 = r12
            r14 = r11
            r15 = r12
            r16 = r11
            r17 = r11
            r18 = r11
            r20 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 260096, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeDetailParam(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33) {
        /*
            r21 = this;
            r13 = 0
            r14 = 0
            r19 = 258048(0x3f000, float:3.61602E-40)
            r5 = r26
            r4 = r25
            r3 = r24
            r2 = r23
            r0 = r21
            r1 = r22
            r6 = r27
            r11 = r32
            r12 = r33
            r10 = r31
            r9 = r30
            r8 = r29
            r7 = r28
            r15 = r13
            r16 = r14
            r17 = r14
            r18 = r14
            r20 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 253952, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 245760, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 229376, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, str11, null, 0 == true ? 1 : 0, 196608, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, str11, str12, null, 131072, 0 == true ? 1 : 0);
    }

    public static ChallengeDetailParam __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num2;
        String str7;
        String str8;
        Boolean bool;
        Integer num3;
        String str9;
        Integer num4;
        String str10;
        String str11;
        String str12;
        String str13 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("id")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("id"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("extra_challenge_from")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_challenge_from"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE"), Integer.class);
            if (num == null) {
                i += 4;
            }
        } else {
            i += 4;
            num = null;
        }
        if (bundle.containsKey("extra_parent_tag_id")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_parent_tag_id"), String.class);
        } else {
            i += 8;
            str3 = null;
        }
        if (bundle.containsKey("aweme_id")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("aweme_id"), String.class);
        } else {
            i += 16;
            str4 = null;
        }
        if (bundle.containsKey("shoot_enter_from")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("shoot_enter_from"), String.class);
        } else {
            i += 32;
            str5 = null;
        }
        if (bundle.containsKey("banner_id")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("banner_id"), String.class);
        } else {
            i += 64;
            str6 = null;
        }
        if (bundle.containsKey("is_bundled")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("is_bundled"), Integer.class);
        } else {
            i += 128;
            num2 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 256;
            str7 = null;
        }
        if (bundle.containsKey("cid")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("cid"), String.class);
        } else {
            i += 512;
            str8 = null;
        }
        if (bundle.containsKey("from_token")) {
            str13 = (String) RouteParser.INSTANCE.parse(bundle.get("from_token"), String.class);
        } else {
            i += 1024;
        }
        if (bundle.containsKey("extra_challenge_is_hashtag")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("extra_challenge_is_hashtag"), Boolean.class);
            if (bool == null) {
                i += 2048;
            }
        } else {
            i += 2048;
            bool = null;
        }
        if (bundle.containsKey("click_reason")) {
            num3 = (Integer) RouteParser.INSTANCE.parse(bundle.get("click_reason"), Integer.class);
            if (num3 == null) {
                i += 4096;
            }
        } else {
            i += 4096;
            num3 = null;
        }
        if (bundle.containsKey("extra_enterprise_challenge_uid")) {
            str9 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_enterprise_challenge_uid"), String.class);
        } else {
            i += FileUtils.BUFFER_SIZE;
            str9 = null;
        }
        if (bundle.containsKey("show_tab_index")) {
            num4 = (Integer) RouteParser.INSTANCE.parse(bundle.get("show_tab_index"), Integer.class);
            if (num4 == null) {
                i += 16384;
            }
        } else {
            i += 16384;
            num4 = null;
        }
        if (bundle.containsKey("is_commerce")) {
            str10 = (String) RouteParser.INSTANCE.parse(bundle.get("is_commerce"), String.class);
        } else {
            i += 32768;
            str10 = null;
        }
        if (bundle.containsKey("preview_token")) {
            str11 = (String) RouteParser.INSTANCE.parse(bundle.get("preview_token"), String.class);
        } else {
            i += 65536;
            str11 = null;
        }
        if (bundle.containsKey("process_id")) {
            str12 = (String) RouteParser.INSTANCE.parse(bundle.get("process_id"), String.class);
        } else {
            i += 131072;
            str12 = null;
        }
        return new ChallengeDetailParam(str, str2, num != null ? num.intValue() : 0, str3, str4, str5, str6, num2, str7, str8, str13, bool != null ? bool.booleanValue() : false, num3 != null ? num3.intValue() : 0, str9, num4 != null ? num4.intValue() : 0, str10, str11, str12, i, null);
    }

    public static /* synthetic */ ChallengeDetailParam copy$default(ChallengeDetailParam challengeDetailParam, String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12, String str13, int i4, Object obj) {
        String str14 = str3;
        int i5 = i;
        String str15 = str;
        String str16 = str2;
        String str17 = str7;
        Integer num2 = num;
        String str18 = str6;
        String str19 = str4;
        String str20 = str5;
        String str21 = str10;
        int i6 = i2;
        boolean z2 = z;
        String str22 = str8;
        String str23 = str9;
        String str24 = str13;
        String str25 = str12;
        int i7 = i3;
        String str26 = str11;
        if ((i4 & 1) != 0) {
            str15 = challengeDetailParam.extra_challenge_id;
        }
        if ((i4 & 2) != 0) {
            str16 = challengeDetailParam.challengeFrom;
        }
        if ((i4 & 4) != 0) {
            i5 = challengeDetailParam.challengeType;
        }
        if ((i4 & 8) != 0) {
            str14 = challengeDetailParam.parentTagId;
        }
        if ((i4 & 16) != 0) {
            str19 = challengeDetailParam.awemeId;
        }
        if ((i4 & 32) != 0) {
            str20 = challengeDetailParam.shootEnterFrom;
        }
        if ((i4 & 64) != 0) {
            str18 = challengeDetailParam.bannerId;
        }
        if ((i4 & 128) != 0) {
            num2 = challengeDetailParam.isBundled;
        }
        if ((i4 & 256) != 0) {
            str17 = challengeDetailParam.from;
        }
        if ((i4 & 512) != 0) {
            str22 = challengeDetailParam.extra_cid;
        }
        if ((i4 & 1024) != 0) {
            str23 = challengeDetailParam.fromToken;
        }
        if ((i4 & 2048) != 0) {
            z2 = challengeDetailParam.isHashTag;
        }
        if ((i4 & 4096) != 0) {
            i6 = challengeDetailParam.clickReason;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            str21 = challengeDetailParam.enterpriseUid;
        }
        if ((i4 & 16384) != 0) {
            i7 = challengeDetailParam.showTabIndex;
        }
        if ((32768 & i4) != 0) {
            str26 = challengeDetailParam.isCommerce;
        }
        if ((65536 & i4) != 0) {
            str25 = challengeDetailParam.previewToken;
        }
        if ((i4 & 131072) != 0) {
            str24 = challengeDetailParam.processId;
        }
        String str27 = str20;
        String str28 = str18;
        Integer num3 = num2;
        return challengeDetailParam.copy(str15, str16, i5, str14, str19, str27, str28, num3, str17, str22, str23, z2, i6, str21, i7, str26, str25, str24);
    }

    public final ChallengeDetailParam copy(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12, String str13) {
        return new ChallengeDetailParam(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, str11, str12, str13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeDetailParam)) {
            return false;
        }
        ChallengeDetailParam challengeDetailParam = (ChallengeDetailParam) obj;
        return o.LJ(this.extra_challenge_id, challengeDetailParam.extra_challenge_id) && o.LJ(this.challengeFrom, challengeDetailParam.challengeFrom) && this.challengeType == challengeDetailParam.challengeType && o.LJ(this.parentTagId, challengeDetailParam.parentTagId) && o.LJ(this.awemeId, challengeDetailParam.awemeId) && o.LJ(this.shootEnterFrom, challengeDetailParam.shootEnterFrom) && o.LJ(this.bannerId, challengeDetailParam.bannerId) && o.LJ(this.isBundled, challengeDetailParam.isBundled) && o.LJ(this.from, challengeDetailParam.from) && o.LJ(this.extra_cid, challengeDetailParam.extra_cid) && o.LJ(this.fromToken, challengeDetailParam.fromToken) && this.isHashTag == challengeDetailParam.isHashTag && this.clickReason == challengeDetailParam.clickReason && o.LJ(this.enterpriseUid, challengeDetailParam.enterpriseUid) && this.showTabIndex == challengeDetailParam.showTabIndex && o.LJ(this.isCommerce, challengeDetailParam.isCommerce) && o.LJ(this.previewToken, challengeDetailParam.previewToken) && o.LJ(this.processId, challengeDetailParam.processId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.extra_challenge_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.challengeFrom;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.challengeType) * 31;
        String str3 = this.parentTagId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.awemeId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.shootEnterFrom;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bannerId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.isBundled;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.from;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.extra_cid;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fromToken;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        boolean z = this.isHashTag;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode10 + i) * 31) + this.clickReason) * 31;
        String str10 = this.enterpriseUid;
        int hashCode11 = (((i2 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.showTabIndex) * 31;
        String str11 = this.isCommerce;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.previewToken;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.processId;
        return hashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeString(this.extra_challenge_id);
        out.writeString(this.challengeFrom);
        out.writeInt(this.challengeType);
        out.writeString(this.parentTagId);
        out.writeString(this.awemeId);
        out.writeString(this.shootEnterFrom);
        out.writeString(this.bannerId);
        Integer num = this.isBundled;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.from);
        out.writeString(this.extra_cid);
        out.writeString(this.fromToken);
        out.writeInt(this.isHashTag ? 1 : 0);
        out.writeInt(this.clickReason);
        out.writeString(this.enterpriseUid);
        out.writeInt(this.showTabIndex);
        out.writeString(this.isCommerce);
        out.writeString(this.previewToken);
        out.writeString(this.processId);
    }

    public final String getCid() {
        String str = this.extra_challenge_id;
        if (str == null || str.length() == 0) {
            return this.extra_cid;
        }
        return this.extra_challenge_id;
    }

    public final String getEnterFrom() {
        return (String) this.enterFrom$delegate.getValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChallengeDetailParam(extra_challenge_id=");
        sb.append(this.extra_challenge_id);
        sb.append(", challengeFrom=");
        sb.append(this.challengeFrom);
        sb.append(", challengeType=");
        sb.append(this.challengeType);
        sb.append(", parentTagId=");
        sb.append(this.parentTagId);
        sb.append(", awemeId=");
        sb.append(this.awemeId);
        sb.append(", shootEnterFrom=");
        sb.append(this.shootEnterFrom);
        sb.append(", bannerId=");
        sb.append(this.bannerId);
        sb.append(", isBundled=");
        sb.append(this.isBundled);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", extra_cid=");
        sb.append(this.extra_cid);
        sb.append(", fromToken=");
        sb.append(this.fromToken);
        sb.append(", isHashTag=");
        sb.append(this.isHashTag);
        sb.append(", clickReason=");
        sb.append(this.clickReason);
        sb.append(", enterpriseUid=");
        sb.append(this.enterpriseUid);
        sb.append(", showTabIndex=");
        sb.append(this.showTabIndex);
        sb.append(", isCommerce=");
        sb.append(this.isCommerce);
        sb.append(", previewToken=");
        sb.append(this.previewToken);
        sb.append(", processId=");
        return C07670Rv.LIZIZ(sb, this.processId, ')');
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getBannerId() {
        return this.bannerId;
    }

    public final String getChallengeFrom() {
        return this.challengeFrom;
    }

    public final int getChallengeType() {
        return this.challengeType;
    }

    public final int getClickReason() {
        return this.clickReason;
    }

    public final String getEnterpriseUid() {
        return this.enterpriseUid;
    }

    public final String getExtra_challenge_id() {
        return this.extra_challenge_id;
    }

    public final String getExtra_cid() {
        return this.extra_cid;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getFromToken() {
        return this.fromToken;
    }

    public final String getParentTagId() {
        return this.parentTagId;
    }

    public final String getPreviewToken() {
        return this.previewToken;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final int getShowTabIndex() {
        return this.showTabIndex;
    }

    public final Integer isBundled() {
        return this.isBundled;
    }

    public final String isCommerce() {
        return this.isCommerce;
    }

    public final boolean isHashTag() {
        return this.isHashTag;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setBannerId(String str) {
        this.bannerId = str;
    }

    public final void setBundled(Integer num) {
        this.isBundled = num;
    }

    public final void setChallengeFrom(String str) {
        this.challengeFrom = str;
    }

    public final void setChallengeType(int i) {
        this.challengeType = i;
    }

    public final void setCid(String str) {
        this.extra_challenge_id = str;
    }

    public final void setClickReason(int i) {
        this.clickReason = i;
    }

    public final void setCommerce(String str) {
        this.isCommerce = str;
    }

    public final void setEnterpriseUid(String str) {
        this.enterpriseUid = str;
    }

    public final void setExtra_challenge_id(String str) {
        this.extra_challenge_id = str;
    }

    public final void setExtra_cid(String str) {
        this.extra_cid = str;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public final void setFromToken(String str) {
        this.fromToken = str;
    }

    public final void setHashTag(boolean z) {
        this.isHashTag = z;
    }

    public final void setParentTagId(String str) {
        this.parentTagId = str;
    }

    public final void setPreviewToken(String str) {
        this.previewToken = str;
    }

    public final void setProcessId(String str) {
        this.processId = str;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public final void setShowTabIndex(int i) {
        this.showTabIndex = i;
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12, String str13) {
        this.extra_challenge_id = str;
        this.challengeFrom = str2;
        this.challengeType = i;
        this.parentTagId = str3;
        this.awemeId = str4;
        this.shootEnterFrom = str5;
        this.bannerId = str6;
        this.isBundled = num;
        this.from = str7;
        this.extra_cid = str8;
        this.fromToken = str9;
        this.isHashTag = z;
        this.clickReason = i2;
        this.enterpriseUid = str10;
        this.showTabIndex = i3;
        this.isCommerce = str11;
        this.previewToken = str12;
        this.processId = str13;
        this.enterFrom$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 64));
        if (TextUtils.equals(this.isCommerce, "1") || ujb.o.LJJJJIZL("true", this.isCommerce, true)) {
            CommerceChallengeServiceImpl.LIZIZ().LJIL(getCid());
        }
    }

    public /* synthetic */ ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12, String str13, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? "" : str6, (i4 & 128) != 0 ? 0 : num, (i4 & 256) != 0 ? "" : str7, (i4 & 512) != 0 ? "" : str8, (i4 & 1024) != 0 ? "" : str9, (i4 & 2048) != 0 ? false : z, (i4 & 4096) == 0 ? i2 : 0, (i4 & FileUtils.BUFFER_SIZE) != 0 ? "" : str10, (i4 & 16384) != 0 ? -1 : i3, (32768 & i4) != 0 ? null : str11, (65536 & i4) == 0 ? str12 : null, (i4 & 131072) == 0 ? str13 : "");
    }
}
