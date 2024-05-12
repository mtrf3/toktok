package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class AqS10S1201000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS10S1201000_8 aqS10S1201000_8, Object obj) {
        String str;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("search_position", "tag_user");
        String str2 = "";
        sendEventTrackingAsync.put("new_sug_session_id", "");
        String str3 = aqS10S1201000_8.s0;
        if (str3 != null) {
            str2 = str3;
        }
        sendEventTrackingAsync.put("impr_id", str2);
        sendEventTrackingAsync.put("raw_query", ((VideoTagSearchListViewModel) aqS10S1201000_8.l1).LJLJJLL);
        sendEventTrackingAsync.put("sug_user_id", ((SearchSugEntity) aqS10S1201000_8.l2).sugExtraInfo.getUserId());
        sendEventTrackingAsync.put("user_tag", ((SearchSugEntity) aqS10S1201000_8.l2).sugExtraInfo.getUserRelationType());
        int i = aqS10S1201000_8.i3;
        if (i < 0) {
            i = 0;
        }
        sendEventTrackingAsync.put("words_position", i);
        Word word = ((SearchSugEntity) aqS10S1201000_8.l2).mWord;
        String str4 = null;
        if (word != null) {
            str = word.getWordSource();
        } else {
            str = null;
        }
        sendEventTrackingAsync.put("words_source", str);
        Word word2 = ((SearchSugEntity) aqS10S1201000_8.l2).mWord;
        if (word2 != null) {
            str4 = word2.getId();
        }
        sendEventTrackingAsync.put("group_id", str4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS10S1201000_8 aqS10S1201000_8, Object obj) {
        String str;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("search_position", "tag_user");
        String str2 = "";
        sendEventTrackingAsync.put("new_sug_session_id", "");
        String str3 = aqS10S1201000_8.s0;
        if (str3 != null) {
            str2 = str3;
        }
        sendEventTrackingAsync.put("impr_id", str2);
        sendEventTrackingAsync.put("raw_query", ((VideoTagSearchListViewModel) aqS10S1201000_8.l1).LJLJJLL);
        sendEventTrackingAsync.put("sug_user_id", ((SearchSugEntity) aqS10S1201000_8.l2).sugExtraInfo.getUserId());
        sendEventTrackingAsync.put("user_tag", ((SearchSugEntity) aqS10S1201000_8.l2).sugExtraInfo.getUserRelationType());
        int i = aqS10S1201000_8.i3;
        if (i < 0) {
            i = 0;
        }
        sendEventTrackingAsync.put("words_position", i);
        Word word = ((SearchSugEntity) aqS10S1201000_8.l2).mWord;
        String str4 = null;
        if (word != null) {
            str = word.getWordSource();
        } else {
            str = null;
        }
        sendEventTrackingAsync.put("words_source", str);
        Word word2 = ((SearchSugEntity) aqS10S1201000_8.l2).mWord;
        if (word2 != null) {
            str4 = word2.getId();
        }
        sendEventTrackingAsync.put("group_id", str4);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S1201000_8(String str, VideoTagSearchListViewModel videoTagSearchListViewModel, SearchSugEntity searchSugEntity, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = videoTagSearchListViewModel;
        this.l2 = searchSugEntity;
        this.i3 = i;
    }
}
