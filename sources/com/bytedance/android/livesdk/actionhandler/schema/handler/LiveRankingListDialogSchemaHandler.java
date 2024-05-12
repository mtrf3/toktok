package com.bytedance.android.livesdk.actionhandler.schema.handler;

import X.BTV;
import X.C28826BTa;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import android.content.Context;
import com.bytedance.android.livesdk.dataChannel.AnchorRankEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveRankingListDialogSchemaHandler extends BTV<RankListSchemaModel> {
    public final List<String> LIZIZ = C47261Igj.LJJIJ("webcast_rank_dialog");

    /* loaded from: classes6.dex */
    public static final class RankListSchemaModel extends C28826BTa {

        @InterfaceC65349Pkn("rank_group_type")
        public String rankGroupType = "";

        @InterfaceC65349Pkn("select_rank_type")
        public String selectRankType = "";

        @InterfaceC65349Pkn("select_sub_rank_type")
        public String selectSubRankType = "";

        @InterfaceC65349Pkn("rank_period")
        public String rankPeriod = "";

        @InterfaceC65349Pkn("tab_infos")
        public String tabInfos = "";
    }

    @Override // X.BTV
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, Map map) {
        RankListSchemaModel rankListSchemaModel = (RankListSchemaModel) c28826BTa;
        o.LJIIIZ(context, "context");
        HashMap hashMap = new HashMap();
        hashMap.put("rank_group_type", rankListSchemaModel.rankGroupType);
        hashMap.put("select_rank_type", rankListSchemaModel.selectRankType);
        hashMap.put("select_sub_rank_type", rankListSchemaModel.selectSubRankType);
        hashMap.put("rank_period", rankListSchemaModel.rankPeriod);
        hashMap.put("tab_infos", rankListSchemaModel.tabInfos);
        DataChannelGlobal.LJLJJI.sv0(AnchorRankEvent.class, hashMap);
        return true;
    }
}
