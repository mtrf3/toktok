package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class PartnershipInfo extends F9E {

    @InterfaceC65349Pkn("partnership_room")
    public Boolean partnershipRoom;

    @InterfaceC65349Pkn("promoting_room")
    public boolean promotingRoom;

    @InterfaceC65349Pkn("promoting_task_id")
    public String promotingTaskId;

    @InterfaceC65349Pkn("task_id_list")
    public List<String> taskIdList;

    @InterfaceC65349Pkn("show_task_id")
    public String showTaskId = "";

    @InterfaceC65349Pkn("promoting_drops_id")
    public String promotingDropsId = "";

    @InterfaceC65349Pkn("promoting_game_id")
    public String promotingGameId = "";

    @Override // X.F9E
    public final Object[] getObjects() {
        Boolean bool = this.partnershipRoom;
        String str = this.promotingTaskId;
        List<String> list = this.taskIdList;
        return new Object[]{bool, bool, str, str, list, list, list};
    }
}
