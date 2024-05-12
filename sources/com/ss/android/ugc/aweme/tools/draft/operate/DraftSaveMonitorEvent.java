package com.ss.android.ugc.aweme.tools.draft.operate;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class DraftSaveMonitorEvent extends F9E {

    @InterfaceC65349Pkn("creation_id")
    public final String creationId;

    @InterfaceC65349Pkn("draft_aweme_type")
    public final int draftAwemeType;

    @InterfaceC65349Pkn("draft_scene")
    public final String draftScene;

    @InterfaceC65349Pkn("draft_version")
    public final int draftVersion;

    @InterfaceC65349Pkn("file_tree_info")
    public final String fileTreeInfo;

    @InterfaceC65349Pkn("save_draft_app_version")
    public final long saveDraftAppVersion;

    @InterfaceC65349Pkn("save_draft_time")
    public final String saveDraftTime;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.creationId, this.draftScene, Integer.valueOf(this.draftAwemeType), Integer.valueOf(this.draftVersion), this.saveDraftTime, Long.valueOf(this.saveDraftAppVersion), this.fileTreeInfo};
    }

    public DraftSaveMonitorEvent(String str, String str2, int i, int i2, String str3, long j, String str4) {
        C43588H8u.LIZLLL(str, "creationId", str2, "draftScene", str3, "saveDraftTime", str4, "fileTreeInfo");
        this.creationId = str;
        this.draftScene = str2;
        this.draftAwemeType = i;
        this.draftVersion = i2;
        this.saveDraftTime = str3;
        this.saveDraftAppVersion = j;
        this.fileTreeInfo = str4;
    }

    public /* synthetic */ DraftSaveMonitorEvent(String str, String str2, int i, int i2, String str3, long j, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, str3, j, (i3 & 64) == 0 ? str4 : "");
    }
}
