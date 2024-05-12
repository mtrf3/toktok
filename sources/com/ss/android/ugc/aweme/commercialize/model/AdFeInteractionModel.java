package com.ss.android.ugc.aweme.commercialize.model;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdFeInteractionModel implements Serializable {
    public boolean LJLIL;

    @InterfaceC65349Pkn("duration_time")
    public final int durationTime;

    @InterfaceC65349Pkn("frontend_data")
    public final Object frontendData;

    @InterfaceC65349Pkn("gecko_channel")
    public final List<String> geckoChannel;

    @InterfaceC65349Pkn("hide_time")
    public final long hideTime;

    @InterfaceC65349Pkn("interaction_type")
    public final int interactionType;

    @InterfaceC65349Pkn("lynx_url")
    public final String lynxUrl;

    @InterfaceC65349Pkn("show_time")
    public final int showTime;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdFeInteractionModel copy$default(AdFeInteractionModel adFeInteractionModel, int i, int i2, int i3, List list, String str, Object obj, long j, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            i = adFeInteractionModel.interactionType;
        }
        if ((i4 & 2) != 0) {
            i2 = adFeInteractionModel.showTime;
        }
        if ((i4 & 4) != 0) {
            i3 = adFeInteractionModel.durationTime;
        }
        if ((i4 & 8) != 0) {
            list = adFeInteractionModel.geckoChannel;
        }
        if ((i4 & 16) != 0) {
            str = adFeInteractionModel.lynxUrl;
        }
        if ((i4 & 32) != 0) {
            obj = adFeInteractionModel.frontendData;
        }
        if ((i4 & 64) != 0) {
            j = adFeInteractionModel.hideTime;
        }
        return adFeInteractionModel.copy(i, i2, i3, list, str, obj, j);
    }

    public final AdFeInteractionModel copy(int i, int i2, int i3, List<String> list, String str, Object obj, long j) {
        return new AdFeInteractionModel(i, i2, i3, list, str, obj, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdFeInteractionModel)) {
            return false;
        }
        AdFeInteractionModel adFeInteractionModel = (AdFeInteractionModel) obj;
        return this.interactionType == adFeInteractionModel.interactionType && this.showTime == adFeInteractionModel.showTime && this.durationTime == adFeInteractionModel.durationTime && o.LJ(this.geckoChannel, adFeInteractionModel.geckoChannel) && o.LJ(this.lynxUrl, adFeInteractionModel.lynxUrl) && o.LJ(this.frontendData, adFeInteractionModel.frontendData) && this.hideTime == adFeInteractionModel.hideTime;
    }

    public int hashCode() {
        int i = ((((this.interactionType * 31) + this.showTime) * 31) + this.durationTime) * 31;
        List<String> list = this.geckoChannel;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.lynxUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.frontendData;
        return C16880lQ.LLJIJIL(this.hideTime) + ((hashCode2 + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdFeInteractionModel(interactionType=");
        LIZ.append(this.interactionType);
        LIZ.append(", showTime=");
        LIZ.append(this.showTime);
        LIZ.append(", durationTime=");
        LIZ.append(this.durationTime);
        LIZ.append(", geckoChannel=");
        LIZ.append(this.geckoChannel);
        LIZ.append(", lynxUrl=");
        LIZ.append(this.lynxUrl);
        LIZ.append(", frontendData=");
        LIZ.append(this.frontendData);
        LIZ.append(", hideTime=");
        return C47135Ieh.LIZIZ(LIZ, this.hideTime, ')', LIZ);
    }

    public final int getDurationTime() {
        return this.durationTime;
    }

    public final Object getFrontendData() {
        return this.frontendData;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final long getHideTime() {
        return this.hideTime;
    }

    public final int getInteractionType() {
        return this.interactionType;
    }

    public final String getLynxUrl() {
        return this.lynxUrl;
    }

    public final int getShowTime() {
        return this.showTime;
    }

    public final boolean isInteractivity() {
        return this.LJLIL;
    }

    public final void setInteractivity(boolean z) {
        this.LJLIL = z;
    }

    public AdFeInteractionModel(int i, int i2, int i3, List<String> list, String str, Object obj, long j) {
        this.interactionType = i;
        this.showTime = i2;
        this.durationTime = i3;
        this.geckoChannel = list;
        this.lynxUrl = str;
        this.frontendData = obj;
        this.hideTime = j;
    }
}
