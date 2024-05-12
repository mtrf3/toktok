package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.Map;

/* loaded from: classes6.dex */
public class BarrageMessage extends CR6 {

    @InterfaceC65349Pkn("background")
    public ImageModel backGround;

    @InterfaceC65349Pkn("content")
    public Text content;

    @InterfaceC65349Pkn("display_config")
    public int displayConfig;

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("event")
    public BarrageEvent event;

    @InterfaceC65349Pkn("fans_level_param")
    public BarrageTypeFansLevelParam fansLevelParam;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("msg_type")
    public int msgType;

    @InterfaceC65349Pkn("right_icon")
    public ImageModel rightIcon;

    @InterfaceC65349Pkn("subscribe_gift_param")
    public BarrageTypeSubscribeGiftParam subscribeGiftParam;

    @InterfaceC65349Pkn("user_grade_param")
    public BarrageTypeUserGradeParam userGradeParam;

    /* loaded from: classes6.dex */
    public static class BarrageEvent {

        @InterfaceC65349Pkn("event_name")
        public String eventName;

        @InterfaceC65349Pkn("params")
        public Map<String, String> params;
    }

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    public BarrageMessage() {
        this.type = EnumC31509CYf.BARRAGE_MESSAGE;
    }
}
