package com.ss.android.ugc.aweme.services.audio;

import X.F9E;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioWatermarkInfo extends F9E {
    public boolean isContainCreatorVoice;
    public List<String> ttsCreatorIdsList;
    public List<String> vcCreatorIdsList;
    public String watermarkText;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioWatermarkInfo() {
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioWatermarkInfo copy$default(AudioWatermarkInfo audioWatermarkInfo, boolean z, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = audioWatermarkInfo.isContainCreatorVoice;
        }
        if ((i & 2) != 0) {
            str = audioWatermarkInfo.watermarkText;
        }
        if ((i & 4) != 0) {
            list = audioWatermarkInfo.ttsCreatorIdsList;
        }
        if ((i & 8) != 0) {
            list2 = audioWatermarkInfo.vcCreatorIdsList;
        }
        return audioWatermarkInfo.copy(z, str, list, list2);
    }

    public final AudioWatermarkInfo copy(boolean z, String watermarkText, List<String> ttsCreatorIdsList, List<String> vcCreatorIdsList) {
        o.LJIIIZ(watermarkText, "watermarkText");
        o.LJIIIZ(ttsCreatorIdsList, "ttsCreatorIdsList");
        o.LJIIIZ(vcCreatorIdsList, "vcCreatorIdsList");
        return new AudioWatermarkInfo(z, watermarkText, ttsCreatorIdsList, vcCreatorIdsList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isContainCreatorVoice), this.watermarkText, this.ttsCreatorIdsList, this.vcCreatorIdsList};
    }

    public final List<String> getTtsCreatorIdsList() {
        return this.ttsCreatorIdsList;
    }

    public final List<String> getVcCreatorIdsList() {
        return this.vcCreatorIdsList;
    }

    public final String getWatermarkText() {
        return this.watermarkText;
    }

    public final boolean isContainCreatorVoice() {
        return this.isContainCreatorVoice;
    }

    public final void setContainCreatorVoice(boolean z) {
        this.isContainCreatorVoice = z;
    }

    public final void setTtsCreatorIdsList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.ttsCreatorIdsList = list;
    }

    public final void setVcCreatorIdsList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.vcCreatorIdsList = list;
    }

    public final void setWatermarkText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.watermarkText = str;
    }

    public AudioWatermarkInfo(boolean z, String watermarkText, List<String> ttsCreatorIdsList, List<String> vcCreatorIdsList) {
        o.LJIIIZ(watermarkText, "watermarkText");
        o.LJIIIZ(ttsCreatorIdsList, "ttsCreatorIdsList");
        o.LJIIIZ(vcCreatorIdsList, "vcCreatorIdsList");
        this.isContainCreatorVoice = z;
        this.watermarkText = watermarkText;
        this.ttsCreatorIdsList = ttsCreatorIdsList;
        this.vcCreatorIdsList = vcCreatorIdsList;
    }

    public /* synthetic */ AudioWatermarkInfo(boolean z, String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? new ArrayList() : list2);
    }
}
