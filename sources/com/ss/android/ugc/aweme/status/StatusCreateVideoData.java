package com.ss.android.ugc.aweme.status;

import X.C43572H8e;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StatusCreateVideoData implements Parcelable, Serializable {
    public static final C43572H8e CREATOR = new C43572H8e();

    @InterfaceC65349Pkn("status_background_selected_from")
    public String bgFrom;

    @InterfaceC65349Pkn("status_background_height")
    public int bgHeight;

    @InterfaceC65349Pkn("bg_id")
    public String bgId;

    @InterfaceC65349Pkn("bg_path")
    public String bgPath;

    @InterfaceC65349Pkn("status_background_size")
    public int bgSize;

    @InterfaceC65349Pkn("status_background_src_image")
    public String bgSrcImage;

    @InterfaceC65349Pkn("status_background_width")
    public int bgWidth;

    @InterfaceC65349Pkn("effect_id")
    public String effectId;

    @InterfaceC65349Pkn("effect_path")
    public String effectPath;

    @InterfaceC65349Pkn("status_music_ids")
    public List<String> musicIds;

    @InterfaceC65349Pkn("music_path")
    public String musicPath;

    @InterfaceC65349Pkn("key_status_type")
    public int statusType;

    @InterfaceC65349Pkn("status_template_text")
    public String templateText;

    @InterfaceC65349Pkn("status_user_text")
    public String userText;

    @InterfaceC65349Pkn("status_video_cover")
    public String videoCoverImgPath;

    @InterfaceC65349Pkn("status_video_cover_starttime")
    public int videoCoverStartTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StatusCreateVideoData() {
        this.statusType = -1;
        this.bgPath = "";
        this.bgId = "";
        this.bgFrom = "template";
        this.bgSrcImage = "";
        this.musicPath = "";
        this.effectPath = "";
        this.effectId = "";
        this.musicIds = new ArrayList();
        this.templateText = "";
        this.userText = "";
    }

    public final String getBgFrom() {
        return this.bgFrom;
    }

    public final int getBgHeight() {
        return this.bgHeight;
    }

    public final String getBgId() {
        return this.bgId;
    }

    public final String getBgPath() {
        return this.bgPath;
    }

    public final int getBgSize() {
        return this.bgSize;
    }

    public final String getBgSrcImage() {
        return this.bgSrcImage;
    }

    public final int getBgWidth() {
        return this.bgWidth;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectPath() {
        return this.effectPath;
    }

    public final List<String> getMusicIds() {
        return this.musicIds;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getStatusType() {
        return this.statusType;
    }

    public final String getTemplateText() {
        return this.templateText;
    }

    public final String getUserText() {
        return this.userText;
    }

    public final String getVideoCoverImgPath() {
        return this.videoCoverImgPath;
    }

    public final int getVideoCoverStartTime() {
        return this.videoCoverStartTime;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusCreateVideoData(Parcel parcel) {
        this();
        o.LJIIIZ(parcel, "parcel");
        this.statusType = parcel.readInt();
        String readString = parcel.readString();
        this.bgPath = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        this.bgId = readString2 == null ? "" : readString2;
        String readString3 = parcel.readString();
        this.bgFrom = readString3 == null ? "" : readString3;
        this.bgSize = parcel.readInt();
        this.bgWidth = parcel.readInt();
        this.bgHeight = parcel.readInt();
        String readString4 = parcel.readString();
        o.LJI(readString4);
        this.bgSrcImage = readString4;
        String readString5 = parcel.readString();
        this.musicPath = readString5 == null ? "" : readString5;
        String readString6 = parcel.readString();
        this.effectPath = readString6 == null ? "" : readString6;
        String readString7 = parcel.readString();
        this.effectId = readString7 == null ? "" : readString7;
        List<String> list = this.musicIds;
        o.LJII(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        parcel.readList(list, String.class.getClassLoader());
        String readString8 = parcel.readString();
        this.videoCoverImgPath = readString8 == null ? "" : readString8;
        this.videoCoverStartTime = parcel.readInt();
        String readString9 = parcel.readString();
        this.templateText = readString9 == null ? "" : readString9;
        String readString10 = parcel.readString();
        this.userText = readString10 != null ? readString10 : "";
    }

    public final void setBgFrom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.bgFrom = str;
    }

    public final void setBgHeight(int i) {
        this.bgHeight = i;
    }

    public final void setBgId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.bgId = str;
    }

    public final void setBgPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.bgPath = str;
    }

    public final void setBgSize(int i) {
        this.bgSize = i;
    }

    public final void setBgSrcImage(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.bgSrcImage = str;
    }

    public final void setBgWidth(int i) {
        this.bgWidth = i;
    }

    public final void setEffectId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.effectId = str;
    }

    public final void setEffectPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.effectPath = str;
    }

    public final void setMusicIds(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.musicIds = list;
    }

    public final void setMusicPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.musicPath = str;
    }

    public final void setStatusType(int i) {
        this.statusType = i;
    }

    public final void setTemplateText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.templateText = str;
    }

    public final void setUserText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.userText = str;
    }

    public final void setVideoCoverImgPath(String str) {
        this.videoCoverImgPath = str;
    }

    public final void setVideoCoverStartTime(int i) {
        this.videoCoverStartTime = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeInt(this.statusType);
        dest.writeString(this.bgPath);
        dest.writeString(this.bgId);
        dest.writeString(this.bgFrom);
        dest.writeInt(this.bgSize);
        dest.writeInt(this.bgWidth);
        dest.writeInt(this.bgHeight);
        dest.writeString(this.bgSrcImage);
        dest.writeString(this.musicPath);
        dest.writeString(this.effectPath);
        dest.writeString(this.effectId);
        List<String> list = this.musicIds;
        o.LJII(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        dest.writeList(list);
        dest.writeString(this.videoCoverImgPath);
        dest.writeInt(this.videoCoverStartTime);
        dest.writeString(this.templateText);
        dest.writeString(this.userText);
    }
}
