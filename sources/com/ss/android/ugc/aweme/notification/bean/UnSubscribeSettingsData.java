package com.ss.android.ugc.aweme.notification.bean;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UnSubscribeSettingsData {

    @InterfaceC65349Pkn("group")
    public final Integer group;

    @InterfaceC65349Pkn("is_unsubscribe")
    public final boolean isUnsubscribe;

    @InterfaceC65349Pkn("label")
    public final Integer label;

    @InterfaceC65349Pkn("label_title")
    public final String labelTitle;

    @InterfaceC65349Pkn("subscribe_prompt")
    public final String subscribePrompt;

    @InterfaceC65349Pkn("unsubscribe_prompt")
    public final String unsubscribePrompt;

    /* JADX WARN: Multi-variable type inference failed */
    public UnSubscribeSettingsData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnSubscribeSettingsData)) {
            return false;
        }
        UnSubscribeSettingsData unSubscribeSettingsData = (UnSubscribeSettingsData) obj;
        return o.LJ(this.group, unSubscribeSettingsData.group) && o.LJ(this.label, unSubscribeSettingsData.label) && o.LJ(this.labelTitle, unSubscribeSettingsData.labelTitle) && o.LJ(this.subscribePrompt, unSubscribeSettingsData.subscribePrompt) && o.LJ(this.unsubscribePrompt, unSubscribeSettingsData.unsubscribePrompt) && this.isUnsubscribe == unSubscribeSettingsData.isUnsubscribe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.group;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.label;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.labelTitle;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subscribePrompt;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unsubscribePrompt;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isUnsubscribe;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnSubscribeSettingsData(group=");
        LIZ.append(this.group);
        LIZ.append(", label=");
        LIZ.append(this.label);
        LIZ.append(", labelTitle=");
        LIZ.append(this.labelTitle);
        LIZ.append(", subscribePrompt=");
        LIZ.append(this.subscribePrompt);
        LIZ.append(", unsubscribePrompt=");
        LIZ.append(this.unsubscribePrompt);
        LIZ.append(", isUnsubscribe=");
        return C48339Iy7.LIZJ(LIZ, this.isUnsubscribe, ')', LIZ);
    }

    public static UnSubscribeSettingsData LIZ(UnSubscribeSettingsData unSubscribeSettingsData, boolean z) {
        return new UnSubscribeSettingsData(unSubscribeSettingsData.group, unSubscribeSettingsData.label, unSubscribeSettingsData.labelTitle, unSubscribeSettingsData.subscribePrompt, unSubscribeSettingsData.unsubscribePrompt, z);
    }

    public UnSubscribeSettingsData(Integer num, Integer num2, String str, String str2, String str3, boolean z) {
        this.group = num;
        this.label = num2;
        this.labelTitle = str;
        this.subscribePrompt = str2;
        this.unsubscribePrompt = str3;
        this.isUnsubscribe = z;
    }

    public /* synthetic */ UnSubscribeSettingsData(Integer num, Integer num2, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null, (i & 32) != 0 ? false : z);
    }
}
