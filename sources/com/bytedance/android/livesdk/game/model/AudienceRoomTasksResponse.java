package com.bytedance.android.livesdk.game.model;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AudienceRoomTasksResponse {

    @InterfaceC65349Pkn("downloaded_count")
    public long downloadedCount;

    @InterfaceC65349Pkn("drops_id")
    public String dropsId;

    @InterfaceC65349Pkn("game_tasks")
    public List<BriefGameTask> gameTasks;

    @InterfaceC65349Pkn("info")
    public UserInfo info;

    /* JADX WARN: Multi-variable type inference failed */
    public AudienceRoomTasksResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AudienceRoomTasksResponse(List<BriefGameTask> list) {
        this.gameTasks = list;
        this.dropsId = "";
    }

    public /* synthetic */ AudienceRoomTasksResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
