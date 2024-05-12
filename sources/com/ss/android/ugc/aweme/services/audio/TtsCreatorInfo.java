package com.ss.android.ugc.aweme.services.audio;

import X.F9E;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TtsCreatorInfo extends F9E {
    public boolean hasTtsCreatorVoice;
    public List<String> ttsCreatorIdsList;
    public List<String> ttsCreatorUserNameList;

    /* JADX WARN: Multi-variable type inference failed */
    public TtsCreatorInfo() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TtsCreatorInfo copy$default(TtsCreatorInfo ttsCreatorInfo, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ttsCreatorInfo.hasTtsCreatorVoice;
        }
        if ((i & 2) != 0) {
            list = ttsCreatorInfo.ttsCreatorIdsList;
        }
        if ((i & 4) != 0) {
            list2 = ttsCreatorInfo.ttsCreatorUserNameList;
        }
        return ttsCreatorInfo.copy(z, list, list2);
    }

    public final TtsCreatorInfo copy(boolean z, List<String> ttsCreatorIdsList, List<String> ttsCreatorUserNameList) {
        o.LJIIIZ(ttsCreatorIdsList, "ttsCreatorIdsList");
        o.LJIIIZ(ttsCreatorUserNameList, "ttsCreatorUserNameList");
        return new TtsCreatorInfo(z, ttsCreatorIdsList, ttsCreatorUserNameList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.hasTtsCreatorVoice), this.ttsCreatorIdsList, this.ttsCreatorUserNameList};
    }

    public final boolean getHasTtsCreatorVoice() {
        return this.hasTtsCreatorVoice;
    }

    public final List<String> getTtsCreatorIdsList() {
        return this.ttsCreatorIdsList;
    }

    public final List<String> getTtsCreatorUserNameList() {
        return this.ttsCreatorUserNameList;
    }

    public final void setHasTtsCreatorVoice(boolean z) {
        this.hasTtsCreatorVoice = z;
    }

    public final void setTtsCreatorIdsList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.ttsCreatorIdsList = list;
    }

    public final void setTtsCreatorUserNameList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.ttsCreatorUserNameList = list;
    }

    public TtsCreatorInfo(boolean z, List<String> ttsCreatorIdsList, List<String> ttsCreatorUserNameList) {
        o.LJIIIZ(ttsCreatorIdsList, "ttsCreatorIdsList");
        o.LJIIIZ(ttsCreatorUserNameList, "ttsCreatorUserNameList");
        this.hasTtsCreatorVoice = z;
        this.ttsCreatorIdsList = ttsCreatorIdsList;
        this.ttsCreatorUserNameList = ttsCreatorUserNameList;
    }

    public /* synthetic */ TtsCreatorInfo(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
