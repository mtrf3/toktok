package webcast.api.referral;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class ComponentTask {

    @InterfaceC65349Pkn("order")
    public long order;

    @InterfaceC65349Pkn("target")
    public int target;

    @InterfaceC65349Pkn("task_component")
    public ComponentInfo taskComponent;

    @InterfaceC65349Pkn("task_scene")
    public String taskScene = "";

    @InterfaceC65349Pkn("reward_components")
    public List<ComponentInfo> rewardComponents = new ArrayList();
}
