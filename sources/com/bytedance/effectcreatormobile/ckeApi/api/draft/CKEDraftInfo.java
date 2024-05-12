package com.bytedance.effectcreatormobile.ckeapi.api.draft;

import X.C93470aRO;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class CKEDraftInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<CKEDraftInfo> CREATOR = new C93470aRO();
    public final String author;
    public String createTime;
    public String defaultIconPath;
    public String defaultName;
    public String draftID;
    public String draftPath;
    public EffectHint effectHint;
    public String effectId;
    public String effectPath;
    public int iconEdit;
    public String iconPath;
    public String modelId;
    public String name;
    public String platform;
    public String updateTime;
    public int versionCode;

    /* JADX WARN: Multi-variable type inference failed */
    public CKEDraftInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 65535);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.draftID, this.draftPath, this.effectPath, this.effectId, this.defaultIconPath, this.defaultName, this.iconPath, this.name, this.createTime, this.updateTime, this.modelId, this.author, Integer.valueOf(this.versionCode), this.platform, this.effectHint, Integer.valueOf(this.iconEdit)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.draftID);
        parcel.writeString(this.draftPath);
        parcel.writeString(this.effectPath);
        parcel.writeString(this.effectId);
        parcel.writeString(this.defaultIconPath);
        parcel.writeString(this.defaultName);
        parcel.writeString(this.iconPath);
        parcel.writeString(this.name);
        parcel.writeString(this.createTime);
        parcel.writeString(this.updateTime);
        parcel.writeString(this.modelId);
        parcel.writeString(this.author);
        parcel.writeInt(this.versionCode);
        parcel.writeString(this.platform);
        EffectHint effectHint = this.effectHint;
        if (effectHint != null) {
            parcel.writeInt(1);
            effectHint.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.iconEdit);
    }

    public static CKEDraftInfo L(CKEDraftInfo cKEDraftInfo, String str, int i) {
        String draftID;
        String draftPath;
        String effectPath;
        String defaultIconPath;
        String defaultName;
        String iconPath;
        String name;
        String createTime;
        String updateTime;
        String modelId;
        String author;
        int i2;
        String platform;
        EffectHint effectHint;
        int i3;
        String str2 = str;
        if ((i & 1) != 0) {
            draftID = cKEDraftInfo.draftID;
        } else {
            draftID = null;
        }
        if ((i & 2) != 0) {
            draftPath = cKEDraftInfo.draftPath;
        } else {
            draftPath = null;
        }
        if ((i & 4) != 0) {
            effectPath = cKEDraftInfo.effectPath;
        } else {
            effectPath = null;
        }
        if ((i & 8) != 0) {
            str2 = cKEDraftInfo.effectId;
        }
        if ((i & 16) != 0) {
            defaultIconPath = cKEDraftInfo.defaultIconPath;
        } else {
            defaultIconPath = null;
        }
        if ((i & 32) != 0) {
            defaultName = cKEDraftInfo.defaultName;
        } else {
            defaultName = null;
        }
        if ((i & 64) != 0) {
            iconPath = cKEDraftInfo.iconPath;
        } else {
            iconPath = null;
        }
        if ((i & 128) != 0) {
            name = cKEDraftInfo.name;
        } else {
            name = null;
        }
        if ((i & 256) != 0) {
            createTime = cKEDraftInfo.createTime;
        } else {
            createTime = null;
        }
        if ((i & 512) != 0) {
            updateTime = cKEDraftInfo.updateTime;
        } else {
            updateTime = null;
        }
        if ((i & 1024) != 0) {
            modelId = cKEDraftInfo.modelId;
        } else {
            modelId = null;
        }
        if ((i & 2048) != 0) {
            author = cKEDraftInfo.author;
        } else {
            author = null;
        }
        if ((i & 4096) != 0) {
            i2 = cKEDraftInfo.versionCode;
        } else {
            i2 = 0;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            platform = cKEDraftInfo.platform;
        } else {
            platform = null;
        }
        if ((i & 16384) != 0) {
            effectHint = cKEDraftInfo.effectHint;
        } else {
            effectHint = null;
        }
        if ((i & 32768) != 0) {
            i3 = cKEDraftInfo.iconEdit;
        } else {
            i3 = 0;
        }
        cKEDraftInfo.getClass();
        o.LJIIIZ(draftID, "draftID");
        o.LJIIIZ(draftPath, "draftPath");
        o.LJIIIZ(effectPath, "effectPath");
        String effectId = str2;
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(defaultIconPath, "defaultIconPath");
        o.LJIIIZ(defaultName, "defaultName");
        o.LJIIIZ(iconPath, "iconPath");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(createTime, "createTime");
        o.LJIIIZ(updateTime, "updateTime");
        o.LJIIIZ(modelId, "modelId");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(platform, "platform");
        int i4 = i2;
        String str3 = str2;
        return new CKEDraftInfo(draftID, draftPath, effectPath, str3, defaultIconPath, defaultName, iconPath, name, createTime, updateTime, modelId, author, i4, platform, effectHint, i3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CKEDraftInfo(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint r31, int r32, int r33) {
        /*
            r18 = this;
            r17 = r32
            r1 = r33
            r12 = r29
            r11 = r28
            r10 = r27
            r8 = r25
            r3 = r20
            r2 = r19
            r9 = r26
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r0 = r1 & 1
            if (r0 == 0) goto L2b
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L2b:
            r0 = r1 & 2
            java.lang.String r13 = ""
            if (r0 == 0) goto L32
            r3 = r13
        L32:
            r0 = r1 & 4
            if (r0 == 0) goto L38
            java.lang.String r4 = "effect"
        L38:
            r0 = r1 & 8
            if (r0 == 0) goto L3d
            r5 = r13
        L3d:
            r0 = r1 & 16
            if (r0 == 0) goto L42
            r6 = r13
        L42:
            r0 = r1 & 32
            if (r0 == 0) goto L47
            r7 = r13
        L47:
            r0 = r1 & 64
            if (r0 == 0) goto L4c
            r8 = r13
        L4c:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L51
            r9 = r13
        L51:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L56
            r10 = r13
        L56:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L5b
            r11 = r13
        L5b:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L60
            r12 = r13
        L60:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L85
        L64:
            r14 = 0
            r0 = r1 & 8192(0x2000, float:1.148E-41)
            r16 = 0
            if (r0 == 0) goto L82
            java.lang.String r15 = "Android"
        L6d:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L7f
        L71:
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L79
            r17 = 0
        L79:
            r1 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L7f:
            r16 = r31
            goto L71
        L82:
            r15 = r16
            goto L6d
        L85:
            r13 = r30
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint, int, int):void");
    }

    public CKEDraftInfo(String draftID, String draftPath, String effectPath, String effectId, String defaultIconPath, String defaultName, String iconPath, String name, String createTime, String updateTime, String modelId, String author, int i, String platform, EffectHint effectHint, int i2) {
        o.LJIIIZ(draftID, "draftID");
        o.LJIIIZ(draftPath, "draftPath");
        o.LJIIIZ(effectPath, "effectPath");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(defaultIconPath, "defaultIconPath");
        o.LJIIIZ(defaultName, "defaultName");
        o.LJIIIZ(iconPath, "iconPath");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(createTime, "createTime");
        o.LJIIIZ(updateTime, "updateTime");
        o.LJIIIZ(modelId, "modelId");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(platform, "platform");
        this.draftID = draftID;
        this.draftPath = draftPath;
        this.effectPath = effectPath;
        this.effectId = effectId;
        this.defaultIconPath = defaultIconPath;
        this.defaultName = defaultName;
        this.iconPath = iconPath;
        this.name = name;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.modelId = modelId;
        this.author = author;
        this.versionCode = i;
        this.platform = platform;
        this.effectHint = effectHint;
        this.iconEdit = i2;
    }
}
