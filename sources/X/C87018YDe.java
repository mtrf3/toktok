package X;

import com.bytedance.android.live.effect.api.OpenLiveGoalPanelChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.YDe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87018YDe extends AbstractC87017YDd {
    public final JSONObject LJLJJL = new JSONObject();

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC87019YDf interfaceC87019YDf = (InterfaceC87019YDf) xBaseParamModel;
        o.LJIIIZ(type, "type");
        this.LJLJJL.put("icon_url", interfaceC87019YDf.getIconURL());
        this.LJLJJL.put("goal_num", interfaceC87019YDf.getGoalNum());
        this.LJLJJL.put("cur_num", interfaceC87019YDf.getCurNum());
        this.LJLJJL.put("goal_str", interfaceC87019YDf.getGoalStr());
        this.LJLJJL.put("gift_icon_id", interfaceC87019YDf.getGiftIconId());
        this.LJLJJL.put("isAuditPass", interfaceC87019YDf.isAuditPass());
        this.LJLJJL.put("extra", interfaceC87019YDf.getExtra());
        this.LJLJJL.put("entrance", interfaceC87019YDf.getEntrance());
        this.LJLJJL.put("is_first_guide", interfaceC87019YDf.isFirstGuide());
        this.LJLJJL.put("setting_status", interfaceC87019YDf.getSettingStatus());
        this.LJLJJL.put("goal_type", interfaceC87019YDf.getGoalType());
        this.LJLJJL.put("stream_goal_id", interfaceC87019YDf.getStreamGoalId());
        this.LJLJJL.put("schema", interfaceC87019YDf.getSchema());
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC87022YDi.class, null), "");
        DataChannelGlobal.LJLJJI.tv0(OpenLiveGoalPanelChannel.class, this.LJLJJL);
    }
}
