package emotes.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.List;

/* loaded from: classes6.dex */
public class EmoteListResult {

    @InterfaceC65349Pkn("emote_list")
    public List<EmoteModel> emoteList;

    @InterfaceC65349Pkn("exist")
    public Boolean exist;

    public List<EmoteModel> getEmoteList() {
        return this.emoteList;
    }

    public void setEmoteList(List<EmoteModel> list) {
        this.emoteList = list;
    }
}
