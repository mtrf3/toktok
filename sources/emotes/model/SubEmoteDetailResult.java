package emotes.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.livesdk.chatroom.api.PrivateEmoteDetail;

/* loaded from: classes6.dex */
public class SubEmoteDetailResult {

    @InterfaceC65349Pkn("current_emote_detail")
    public EmoteListResult currentEmoteDetail;

    @InterfaceC65349Pkn("current_status")
    public int currentState;

    @InterfaceC65349Pkn("emote_config")
    public EmoteConfig emoteConfig;

    @InterfaceC65349Pkn("emotes_show_style")
    public int emotesShowStyle;

    @InterfaceC65349Pkn("private_emote_detail")
    public PrivateEmoteDetail privateEmoteDetail;

    @InterfaceC65349Pkn("stable_emote_detail")
    public EmoteListResult stableEmoteDetail;

    public EmoteListResult getCurrentEmoteDetail() {
        return this.currentEmoteDetail;
    }

    public int getCurrentState() {
        return this.currentState;
    }

    public EmoteConfig getEmoteConfig() {
        return this.emoteConfig;
    }

    public EmoteListResult getStableEmoteDetail() {
        return this.stableEmoteDetail;
    }

    public void setCurrentEmoteDetail(EmoteListResult emoteListResult) {
        this.currentEmoteDetail = emoteListResult;
    }

    public void setCurrentState(int i) {
        this.currentState = i;
    }

    public void setEmoteConfig(EmoteConfig emoteConfig) {
        this.emoteConfig = emoteConfig;
    }

    public void setStableEmoteDetail(EmoteListResult emoteListResult) {
        this.stableEmoteDetail = emoteListResult;
    }
}
