package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class MGetABInfosResp {

    @InterfaceC65349Pkn("common_resp")
    public LinkMicCommonResp commonResp;

    @InterfaceC65349Pkn("infos")
    public List<ABInfos> infos = new ArrayList();
}
