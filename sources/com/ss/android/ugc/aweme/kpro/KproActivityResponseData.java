package com.ss.android.ugc.aweme.kpro;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.specact.api.MesEntraSetting;
import com.ss.android.ugc.aweme.specact.model.UniversalActivityVideoResource;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KproActivityResponseData {

    @InterfaceC65349Pkn("activity_video_resource")
    public final UniversalActivityVideoResource[] activityVideoResource;

    @InterfaceC65349Pkn("round_robin_interval")
    public final Long interval;

    @InterfaceC65349Pkn("notice")
    public final MesEntraSetting[] mesEntraSettings;

    @InterfaceC65349Pkn("popups")
    public final KproPopupSetting[] popupSettings;

    @InterfaceC65349Pkn("rand_time")
    public final Long randTime;

    /* JADX WARN: Multi-variable type inference failed */
    public KproActivityResponseData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KproActivityResponseData)) {
            return false;
        }
        KproActivityResponseData kproActivityResponseData = (KproActivityResponseData) obj;
        return o.LJ(this.interval, kproActivityResponseData.interval) && o.LJ(this.randTime, kproActivityResponseData.randTime) && o.LJ(this.popupSettings, kproActivityResponseData.popupSettings) && o.LJ(this.mesEntraSettings, kproActivityResponseData.mesEntraSettings) && o.LJ(this.activityVideoResource, kproActivityResponseData.activityVideoResource);
    }

    public final int hashCode() {
        Long l = this.interval;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.randTime;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        KproPopupSetting[] kproPopupSettingArr = this.popupSettings;
        int hashCode3 = (hashCode2 + (kproPopupSettingArr == null ? 0 : Arrays.hashCode(kproPopupSettingArr))) * 31;
        MesEntraSetting[] mesEntraSettingArr = this.mesEntraSettings;
        int hashCode4 = (hashCode3 + (mesEntraSettingArr == null ? 0 : Arrays.hashCode(mesEntraSettingArr))) * 31;
        UniversalActivityVideoResource[] universalActivityVideoResourceArr = this.activityVideoResource;
        return hashCode4 + (universalActivityVideoResourceArr != null ? Arrays.hashCode(universalActivityVideoResourceArr) : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KproActivityResponseData(interval=");
        LIZ.append(this.interval);
        LIZ.append(", randTime=");
        LIZ.append(this.randTime);
        LIZ.append(", popupSettings=");
        LIZ.append(Arrays.toString(this.popupSettings));
        LIZ.append(", mesEntraSettings=");
        LIZ.append(Arrays.toString(this.mesEntraSettings));
        LIZ.append(", activityVideoResource=");
        LIZ.append(Arrays.toString(this.activityVideoResource));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public KproActivityResponseData(Long l, Long l2, KproPopupSetting[] kproPopupSettingArr, MesEntraSetting[] mesEntraSettingArr, UniversalActivityVideoResource[] universalActivityVideoResourceArr) {
        this.interval = l;
        this.randTime = l2;
        this.popupSettings = kproPopupSettingArr;
        this.mesEntraSettings = mesEntraSettingArr;
        this.activityVideoResource = universalActivityVideoResourceArr;
    }

    public /* synthetic */ KproActivityResponseData(Long l, Long l2, KproPopupSetting[] kproPopupSettingArr, MesEntraSetting[] mesEntraSettingArr, UniversalActivityVideoResource[] universalActivityVideoResourceArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : kproPopupSettingArr, (i & 8) != 0 ? null : mesEntraSettingArr, (i & 16) == 0 ? universalActivityVideoResourceArr : null);
    }
}
