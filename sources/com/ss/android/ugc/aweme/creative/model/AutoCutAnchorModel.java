package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.H67;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoCutAnchorModel implements Parcelable {
    public static final Parcelable.Creator<AutoCutAnchorModel> CREATOR = new H67();

    @InterfaceC65349Pkn("autocut_anchor_content")
    public final String content;

    @InterfaceC65349Pkn("autocut_anchor_extra")
    public final String extra;

    @InterfaceC65349Pkn("autocut_anchor_language")
    public final String language;

    @InterfaceC65349Pkn("autocut_anchor_media_list")
    public final List<AutoCutMediaModel> mediaList;

    @InterfaceC65349Pkn("autocut_anchor_music")
    public MusicBuzModel music;

    @InterfaceC65349Pkn("autocut_anchor_music_id")
    public final String musicId;

    @GPV
    public String nleData;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("autocut_recommend_nlemodel_data_path")
    public String nleDataPath;

    @InterfaceC65349Pkn("autocut_recommend_nlemodel_data_version")
    public int nleDataVersion;

    @GPV
    public final String templateGroupId;

    @InterfaceC65349Pkn("autocut_anchor_template_id")
    public final String templateId;

    @GPV
    public String templateZipPath;

    @InterfaceC65349Pkn("autocut_anchor_thumbnail_url")
    public final String thumbnailUrl;

    @InterfaceC65349Pkn("autocut_anchor_url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoCutAnchorModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.templateId);
        out.writeString(this.musicId);
        MusicBuzModel musicBuzModel = this.music;
        if (musicBuzModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            musicBuzModel.writeToParcel(out, i);
        }
        out.writeString(this.url);
        out.writeString(this.language);
        out.writeString(this.extra);
        out.writeString(this.thumbnailUrl);
        out.writeString(this.content);
        out.writeString(this.templateZipPath);
        Iterator LIZJ = UC7.LIZJ(this.mediaList, out);
        while (LIZJ.hasNext()) {
            ((AutoCutMediaModel) LIZJ.next()).writeToParcel(out, i);
        }
        out.writeString(this.nleData);
        out.writeString(this.nleDataPath);
        out.writeInt(this.nleDataVersion);
        out.writeString(this.templateGroupId);
    }

    public AutoCutAnchorModel(String str, String str2, MusicBuzModel musicBuzModel, String str3, String str4, String str5, String str6, String str7, String str8, List<AutoCutMediaModel> mediaList, String str9, String str10, int i, String str11) {
        o.LJIIIZ(mediaList, "mediaList");
        this.templateId = str;
        this.musicId = str2;
        this.music = musicBuzModel;
        this.url = str3;
        this.language = str4;
        this.extra = str5;
        this.thumbnailUrl = str6;
        this.content = str7;
        this.templateZipPath = str8;
        this.mediaList = mediaList;
        this.nleData = str9;
        this.nleDataPath = str10;
        this.nleDataVersion = i;
        this.templateGroupId = str11;
    }

    public /* synthetic */ AutoCutAnchorModel(String str, String str2, MusicBuzModel musicBuzModel, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, int i, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : musicBuzModel, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? new ArrayList() : list, (i2 & 1024) != 0 ? null : str9, (i2 & 2048) != 0 ? null : str10, (i2 & 4096) != 0 ? 0 : i, (i2 & FileUtils.BUFFER_SIZE) == 0 ? str11 : null);
    }
}
