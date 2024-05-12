package com.ss.android.ugc.aweme.creative.model;

import X.AnonymousClass636;
import X.C44727Hgx;
import X.C63A;
import X.C79062V1e;
import X.EnumC43998HOo;
import X.GPV;
import X.HJW;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoCutThemeData implements Parcelable {

    @InterfaceC65349Pkn("auto_cut_theme_music_cover")
    public final String coverUrl;

    @InterfaceC65349Pkn("auto_cut_theme_index")
    public int indexFromSource;

    @InterfaceC65349Pkn("auto_cut_is_preset_music")
    public final boolean isPreset;

    @InterfaceC65349Pkn("auto_cut_theme_music_buz_model")
    public final MusicBuzModel musicBuzModel;

    @InterfaceC65349Pkn("auto_cut_theme_music_id")
    public final String musicId;

    @InterfaceC65349Pkn("auto_cut_theme_music_name")
    public final String name;

    @InterfaceC65349Pkn("auto_cut_theme_author_name")
    public final String nickName;

    @InterfaceC65349Pkn("auto_cut_preload_urs_set")
    public Set<String> preloadUrsSet;

    @InterfaceC65349Pkn("auto_cut_theme_source")
    public final int source;

    @GPV
    public String templateData;

    @InterfaceC65349Pkn("auto_cut_theme_template_group_id")
    public String templateGroupId;

    @InterfaceC65349Pkn("auto_cut_theme_template_id")
    public final String templateId;

    @InterfaceC65349Pkn("auto_cut_theme_template_type")
    public int templateType;

    @InterfaceC65349Pkn("auto_cut_theme_template_url")
    public final String templateUrl;
    public static final C44727Hgx Companion = new C44727Hgx();
    public static final Parcelable.Creator<AutoCutThemeData> CREATOR = new HJW();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoCutThemeData() {
        /*
            r17 = this;
            r1 = 0
            r3 = 0
            r15 = 16383(0x3fff, float:2.2957E-41)
            r0 = r17
            r2 = r1
            r4 = r1
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r12 = r1
            r13 = r3
            r14 = r3
            r16 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.AutoCutThemeData.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutThemeData)) {
            return false;
        }
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) obj;
        return this.source == autoCutThemeData.source && this.indexFromSource == autoCutThemeData.indexFromSource && o.LJ(this.templateId, autoCutThemeData.templateId) && this.templateType == autoCutThemeData.templateType && o.LJ(this.nickName, autoCutThemeData.nickName) && o.LJ(this.templateUrl, autoCutThemeData.templateUrl) && o.LJ(this.templateData, autoCutThemeData.templateData) && o.LJ(this.musicId, autoCutThemeData.musicId) && o.LJ(this.coverUrl, autoCutThemeData.coverUrl) && o.LJ(this.name, autoCutThemeData.name) && o.LJ(this.musicBuzModel, autoCutThemeData.musicBuzModel) && this.isPreset == autoCutThemeData.isPreset && o.LJ(this.templateGroupId, autoCutThemeData.templateGroupId) && o.LJ(this.preloadUrsSet, autoCutThemeData.preloadUrsSet);
    }

    public final String toString() {
        return "AutoCutThemeData(source=" + this.source + ", indexFromSource=" + this.indexFromSource + ", templateId=" + this.templateId + ", templateType=" + this.templateType + ", nickName=" + this.nickName + ", templateUrl=" + this.templateUrl + ", templateData=" + this.templateData + ", musicId=" + this.musicId + ", coverUrl=" + this.coverUrl + ", name=" + this.name + ", musicBuzModel=" + this.musicBuzModel + ", isPreset=" + this.isPreset + ", templateGroupId=" + this.templateGroupId + ", preloadUrsSet=" + this.preloadUrsSet + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.source);
        out.writeInt(this.indexFromSource);
        out.writeString(this.templateId);
        out.writeInt(this.templateType);
        out.writeString(this.nickName);
        out.writeString(this.templateUrl);
        out.writeString(this.templateData);
        out.writeString(this.musicId);
        out.writeString(this.coverUrl);
        out.writeString(this.name);
        MusicBuzModel musicBuzModel = this.musicBuzModel;
        if (musicBuzModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            musicBuzModel.writeToParcel(out, i);
        }
        out.writeInt(this.isPreset ? 1 : 0);
        out.writeString(this.templateGroupId);
        Set<String> set = this.preloadUrsSet;
        if (set == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            out.writeString(it.next());
        }
    }

    public final C63A LIZ() {
        return AnonymousClass636.LJJ(this.source);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int LJ = (C79062V1e.LJ(this.templateId, ((this.source * 31) + this.indexFromSource) * 31, 31) + this.templateType) * 31;
        String str = this.nickName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.templateUrl, (LJ + hashCode) * 31, 31);
        String str2 = this.templateData;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LJ2 + hashCode2) * 31;
        String str3 = this.musicId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.coverUrl;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.name;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        MusicBuzModel musicBuzModel = this.musicBuzModel;
        if (musicBuzModel == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = musicBuzModel.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        boolean z = this.isPreset;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        String str6 = this.templateGroupId;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        Set<String> set = this.preloadUrsSet;
        if (set != null) {
            i = set.hashCode();
        }
        return i9 + i;
    }

    public AutoCutThemeData(int i, int i2, String templateId, int i3, String str, String templateUrl, String str2, String str3, String str4, String str5, MusicBuzModel musicBuzModel, boolean z, String str6, Set<String> set) {
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(templateUrl, "templateUrl");
        this.source = i;
        this.indexFromSource = i2;
        this.templateId = templateId;
        this.templateType = i3;
        this.nickName = str;
        this.templateUrl = templateUrl;
        this.templateData = str2;
        this.musicId = str3;
        this.coverUrl = str4;
        this.name = str5;
        this.musicBuzModel = musicBuzModel;
        this.isPreset = z;
        this.templateGroupId = str6;
        this.preloadUrsSet = set;
    }

    public /* synthetic */ AutoCutThemeData(int i, int i2, String str, int i3, String str2, String str3, String str4, String str5, String str6, String str7, MusicBuzModel musicBuzModel, boolean z, String str8, Set set, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C63A.AUTO_CUT.ordinal() : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? EnumC43998HOo.DESIGNER_FIXED_TEMPLATE.getValue() : i3, (i4 & 16) != 0 ? null : str2, (i4 & 32) == 0 ? str3 : "", (i4 & 64) != 0 ? null : str4, (i4 & 128) != 0 ? null : str5, (i4 & 256) != 0 ? null : str6, (i4 & 512) != 0 ? null : str7, (i4 & 1024) != 0 ? null : musicBuzModel, (i4 & 2048) != 0 ? false : z, (i4 & 4096) != 0 ? null : str8, (i4 & FileUtils.BUFFER_SIZE) == 0 ? set : null);
    }
}
