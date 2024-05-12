package webcast.im;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class CancelJoinGroupContent {

    @InterfaceC65349Pkn("leaver")
    public List<GroupPlayer> leaver = new ArrayList();

    @InterfaceC65349Pkn("operator")
    public GroupPlayer operator;

    @InterfaceC65349Pkn("type")
    public int type;
}
