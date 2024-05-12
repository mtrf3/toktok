package webcast.api.battle;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;

/* loaded from: classes14.dex */
public final class BattleAwardItemCardResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("card_type")
        public int cardType;

        @InterfaceC65349Pkn("critical_strike_card")
        public CriticalStrikeCardInfo criticalStrikeCard;

        @InterfaceC65349Pkn("smoke_card")
        public SmokeCardInfo smokeCard;
    }
}
