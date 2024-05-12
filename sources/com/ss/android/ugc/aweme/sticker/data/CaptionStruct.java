package com.ss.android.ugc.aweme.sticker.data;

import X.C78920UyC;
import X.EnumC1551166x;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CaptionStruct implements Serializable {

    @InterfaceC65349Pkn("audio_uri")
    public String audioUri;

    @InterfaceC65349Pkn("auto_captions")
    public List<AutocaptionType> autoCaptions;

    @InterfaceC65349Pkn("disable")
    public long disable;

    @InterfaceC65349Pkn("is_translatable")
    public Boolean isTranslatable;

    @InterfaceC65349Pkn("location")
    public int location;

    @InterfaceC65349Pkn("margin_bottom")
    public Integer marginBottom;

    @InterfaceC65349Pkn("margin_start")
    public Integer marginStart;

    @InterfaceC65349Pkn("margin_top")
    public Integer marginTop;

    @InterfaceC65349Pkn("select_lang")
    public String selectLang;

    @InterfaceC65349Pkn("src_lang")
    public String srcLanguage;

    @InterfaceC65349Pkn("task_id")
    public String taskId;

    @InterfaceC65349Pkn("utterances")
    public List<Utterance> utterances;

    @InterfaceC65349Pkn("video_width")
    public Integer videoWidth;

    public CaptionStruct() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptionStruct copy$default(CaptionStruct captionStruct, String str, List list, int i, List list2, String str2, long j, String str3, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = captionStruct.audioUri;
        }
        if ((i2 & 2) != 0) {
            list = captionStruct.utterances;
        }
        if ((i2 & 4) != 0) {
            i = captionStruct.location;
        }
        if ((i2 & 8) != 0) {
            list2 = captionStruct.autoCaptions;
        }
        if ((i2 & 16) != 0) {
            str2 = captionStruct.selectLang;
        }
        if ((i2 & 32) != 0) {
            j = captionStruct.disable;
        }
        if ((i2 & 64) != 0) {
            str3 = captionStruct.srcLanguage;
        }
        if ((i2 & 128) != 0) {
            bool = captionStruct.isTranslatable;
        }
        return captionStruct.copy(str, list, i, list2, str2, j, str3, bool);
    }

    public final CaptionStruct copy(String str, List<Utterance> list, int i, List<AutocaptionType> list2, String str2, long j, String str3, Boolean bool) {
        return new CaptionStruct(str, list, i, list2, str2, j, str3, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionStruct)) {
            return false;
        }
        CaptionStruct captionStruct = (CaptionStruct) obj;
        return o.LJ(this.audioUri, captionStruct.audioUri) && o.LJ(this.utterances, captionStruct.utterances) && this.location == captionStruct.location && o.LJ(this.autoCaptions, captionStruct.autoCaptions) && o.LJ(this.selectLang, captionStruct.selectLang) && this.disable == captionStruct.disable && o.LJ(this.srcLanguage, captionStruct.srcLanguage) && o.LJ(this.isTranslatable, captionStruct.isTranslatable);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.audioUri;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        List<Utterance> list = this.utterances;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.location) * 31;
        List<AutocaptionType> list2 = this.autoCaptions;
        if (list2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.selectLang;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.disable, (i4 + hashCode4) * 31, 31);
        String str3 = this.srcLanguage;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i5 = (LIZJ + hashCode5) * 31;
        Boolean bool = this.isTranslatable;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionStruct(audioUri=");
        LIZ.append(this.audioUri);
        LIZ.append(", utterances=");
        LIZ.append(this.utterances);
        LIZ.append(", location=");
        LIZ.append(this.location);
        LIZ.append(", autoCaptions=");
        LIZ.append(this.autoCaptions);
        LIZ.append(", selectLang=");
        LIZ.append(this.selectLang);
        LIZ.append(", disable=");
        LIZ.append(this.disable);
        LIZ.append(", srcLanguage=");
        LIZ.append(this.srcLanguage);
        LIZ.append(", isTranslatable=");
        return C78920UyC.LIZIZ(LIZ, this.isTranslatable, ')', LIZ);
    }

    public final String getAudioUri() {
        return this.audioUri;
    }

    public final List<AutocaptionType> getAutoCaptions() {
        return this.autoCaptions;
    }

    public final long getDisable() {
        return this.disable;
    }

    public final int getLocation() {
        return this.location;
    }

    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    public final Integer getMarginStart() {
        return this.marginStart;
    }

    public final Integer getMarginTop() {
        return this.marginTop;
    }

    public final String getSelectLang() {
        return this.selectLang;
    }

    public final String getSrcLanguage() {
        return this.srcLanguage;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final List<Utterance> getUtterances() {
        return this.utterances;
    }

    public final Integer getVideoWidth() {
        return this.videoWidth;
    }

    public final Boolean isTranslatable() {
        return this.isTranslatable;
    }

    public final void setAudioUri(String str) {
        this.audioUri = str;
    }

    public final void setAutoCaptions(List<AutocaptionType> list) {
        this.autoCaptions = list;
    }

    public final void setDisable(long j) {
        this.disable = j;
    }

    public final void setLocation(int i) {
        this.location = i;
    }

    public final void setMarginBottom(Integer num) {
        this.marginBottom = num;
    }

    public final void setMarginStart(Integer num) {
        this.marginStart = num;
    }

    public final void setMarginTop(Integer num) {
        this.marginTop = num;
    }

    public final void setSelectLang(String str) {
        this.selectLang = str;
    }

    public final void setSrcLanguage(String str) {
        this.srcLanguage = str;
    }

    public final void setTaskId(String str) {
        this.taskId = str;
    }

    public final void setTranslatable(Boolean bool) {
        this.isTranslatable = bool;
    }

    public final void setUtterances(List<Utterance> list) {
        this.utterances = list;
    }

    public final void setVideoWidth(Integer num) {
        this.videoWidth = num;
    }

    public CaptionStruct(String str, List<Utterance> list, int i, List<AutocaptionType> list2, String str2, long j, String str3, Boolean bool) {
        this.audioUri = str;
        this.utterances = list;
        this.location = i;
        this.autoCaptions = list2;
        this.selectLang = str2;
        this.disable = j;
        this.srcLanguage = str3;
        this.isTranslatable = bool;
        this.taskId = "";
    }

    public /* synthetic */ CaptionStruct(String str, List list, int i, List list2, String str2, long j, String str3, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, list, (i2 & 4) != 0 ? EnumC1551166x.LEFT_BOTTOM.getValue() : i, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? null : str3, (i2 & 128) == 0 ? bool : null);
    }
}
