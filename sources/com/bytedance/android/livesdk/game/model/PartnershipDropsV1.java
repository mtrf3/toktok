package com.bytedance.android.livesdk.game.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class PartnershipDropsV1 {

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("game_id")
    public long gameId;

    @InterfaceC65349Pkn("join_status")
    public boolean joinStatus;

    @InterfaceC65349Pkn("reason_params")
    public ReasonParams reasonParams;

    @InterfaceC65349Pkn("reason_type_value")
    public int reasonTypeValue;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("started")
    public boolean started;

    @InterfaceC65349Pkn("started_time")
    public long startedTime;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("id")
    public String id = "";

    @InterfaceC65349Pkn("game_name")
    public String gameName = "";

    @InterfaceC65349Pkn("game_icon")
    public String gameIcon = "";

    @InterfaceC65349Pkn("reason_type")
    public String reasonType = "";

    @InterfaceC65349Pkn("gifts")
    public List<PartnershipDropsGift> gifts = new ArrayList();

    @InterfaceC65349Pkn("tasks")
    public List<PartnershipDropsTask> tasks = new ArrayList();

    @InterfaceC65349Pkn("game_id_str")
    public String gameIdStr = "";

    @InterfaceC65349Pkn("game_tag_id")
    public String gameTagId = "";

    @InterfaceC65349Pkn("cp_name")
    public String cpName = "";

    @InterfaceC65349Pkn("country")
    public List<String> country = new ArrayList();

    @InterfaceC65349Pkn("name")
    public String name = "";

    /* loaded from: classes17.dex */
    public static final class ReasonParams {

        @InterfaceC65349Pkn("excellent_creator_params")
        public ExcellentCreatorParams excellentCreatorParams;

        @InterfaceC65349Pkn("top_reward_params")
        public TopRewardsParams topRewardParams;

        /* loaded from: classes17.dex */
        public static final class ExcellentCreatorParams {

            @InterfaceC65349Pkn("game_name")
            public String gameName = "";
        }

        /* loaded from: classes17.dex */
        public static final class TopRewardsParams {

            @InterfaceC65349Pkn("event_name")
            public String eventName = "";

            @InterfaceC65349Pkn("rank")
            public int rank;
        }
    }
}
