package com.ss.android.ugc.aweme.services.audio;

import X.F9E;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VcCreatorInfo extends F9E {
    public boolean hasVcCreatorVoice;
    public List<String> vcCreatorIdsList;
    public List<String> vcCreatorUserNameList;

    /* JADX WARN: Multi-variable type inference failed */
    public VcCreatorInfo() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VcCreatorInfo copy$default(VcCreatorInfo vcCreatorInfo, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = vcCreatorInfo.hasVcCreatorVoice;
        }
        if ((i & 2) != 0) {
            list = vcCreatorInfo.vcCreatorIdsList;
        }
        if ((i & 4) != 0) {
            list2 = vcCreatorInfo.vcCreatorUserNameList;
        }
        return vcCreatorInfo.copy(z, list, list2);
    }

    public final VcCreatorInfo copy(boolean z, List<String> vcCreatorIdsList, List<String> vcCreatorUserNameList) {
        o.LJIIIZ(vcCreatorIdsList, "vcCreatorIdsList");
        o.LJIIIZ(vcCreatorUserNameList, "vcCreatorUserNameList");
        return new VcCreatorInfo(z, vcCreatorIdsList, vcCreatorUserNameList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.hasVcCreatorVoice), this.vcCreatorIdsList, this.vcCreatorUserNameList};
    }

    public final boolean getHasVcCreatorVoice() {
        return this.hasVcCreatorVoice;
    }

    public final List<String> getVcCreatorIdsList() {
        return this.vcCreatorIdsList;
    }

    public final List<String> getVcCreatorUserNameList() {
        return this.vcCreatorUserNameList;
    }

    public final void setHasVcCreatorVoice(boolean z) {
        this.hasVcCreatorVoice = z;
    }

    public final void setVcCreatorIdsList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.vcCreatorIdsList = list;
    }

    public final void setVcCreatorUserNameList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.vcCreatorUserNameList = list;
    }

    public VcCreatorInfo(boolean z, List<String> vcCreatorIdsList, List<String> vcCreatorUserNameList) {
        o.LJIIIZ(vcCreatorIdsList, "vcCreatorIdsList");
        o.LJIIIZ(vcCreatorUserNameList, "vcCreatorUserNameList");
        this.hasVcCreatorVoice = z;
        this.vcCreatorIdsList = vcCreatorIdsList;
        this.vcCreatorUserNameList = vcCreatorUserNameList;
    }

    public /* synthetic */ VcCreatorInfo(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
