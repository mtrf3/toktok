package com.ss.android.ugc.aweme.creative.model;

import X.C61878OQg;
import X.GL6;
import X.GPV;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChangeAvatarModel implements Parcelable {
    public static final Parcelable.Creator<ChangeAvatarModel> CREATOR = new GL6();

    @InterfaceC65349Pkn("ai_vatar_mode")
    public String aiVatarMode;

    @InterfaceC65349Pkn("origin_avatar")
    public AvatarUpdateInfoStruct avatarStruct;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("avatar_cover_path")
    public String coverPath;

    @InterfaceC65349Pkn("first_enter_edit")
    public boolean firstEnterEdit;

    @InterfaceC65349Pkn("is_from_ai_vatar")
    public boolean isFromAiVatar;

    @InterfaceC65349Pkn("is_change_avatar")
    public boolean isFromChangeAvatar;

    @GPV
    public boolean isSingletonRecover;

    @InterfaceC65349Pkn("new_avatar_url")
    public String newAvatarUrl;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("origin_path")
    public String originPath;

    @GPV
    public String publishEnterMethod;

    @InterfaceC65349Pkn("realEnterMethod")
    public String realEnterMethod;

    @GPV
    public List<String> stickerIds;

    public ChangeAvatarModel() {
        this(false, false, null, null, false, false, null, null, null, null, null, null, 4095, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isFromChangeAvatar ? 1 : 0);
        out.writeInt(this.isFromAiVatar ? 1 : 0);
        out.writeString(this.aiVatarMode);
        out.writeString(this.realEnterMethod);
        out.writeInt(this.isSingletonRecover ? 1 : 0);
        out.writeInt(this.firstEnterEdit ? 1 : 0);
        out.writeString(this.originPath);
        this.avatarStruct.writeToParcel(out, i);
        out.writeString(this.newAvatarUrl);
        out.writeString(this.coverPath);
        out.writeStringList(this.stickerIds);
        out.writeString(this.publishEnterMethod);
    }

    public ChangeAvatarModel(boolean z, boolean z2, String aiVatarMode, String realEnterMethod, boolean z3, boolean z4, String originPath, AvatarUpdateInfoStruct avatarStruct, String newAvatarUrl, String coverPath, List<String> stickerIds, String str) {
        o.LJIIIZ(aiVatarMode, "aiVatarMode");
        o.LJIIIZ(realEnterMethod, "realEnterMethod");
        o.LJIIIZ(originPath, "originPath");
        o.LJIIIZ(avatarStruct, "avatarStruct");
        o.LJIIIZ(newAvatarUrl, "newAvatarUrl");
        o.LJIIIZ(coverPath, "coverPath");
        o.LJIIIZ(stickerIds, "stickerIds");
        this.isFromChangeAvatar = z;
        this.isFromAiVatar = z2;
        this.aiVatarMode = aiVatarMode;
        this.realEnterMethod = realEnterMethod;
        this.isSingletonRecover = z3;
        this.firstEnterEdit = z4;
        this.originPath = originPath;
        this.avatarStruct = avatarStruct;
        this.newAvatarUrl = newAvatarUrl;
        this.coverPath = coverPath;
        this.stickerIds = stickerIds;
        this.publishEnterMethod = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeAvatarModel(boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, String str3, AvatarUpdateInfoStruct avatarUpdateInfoStruct, String str4, String str5, List list, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) == 0 ? z3 : false, (i & 32) != 0 ? true : z4, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? new AvatarUpdateInfoStruct(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : avatarUpdateInfoStruct, (i & 256) != 0 ? "" : str4, (i & 512) == 0 ? str5 : "", (i & 1024) != 0 ? C61878OQg.INSTANCE : list, (i & 2048) == 0 ? str6 : null);
    }
}
