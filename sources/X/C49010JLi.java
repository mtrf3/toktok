package X;

import X.JNN;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchExtraStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchLiveStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.JLi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49010JLi<T extends JNN<T>> extends JNN<T> {
    public final JQA LJIIZILJ;

    @Override // X.JN4
    public final void LJIILL() {
        String event = this.LIZ;
        o.LJIIIIZZ(event, "event");
        LIZ(K02.LIZ(null, event, this.LIZLLL, this.LJIIZILJ));
    }

    public final void LJJIII(Integer num) {
        LJIIZILJ("aladdin_rank", String.valueOf(num));
    }

    public final void LJJIIJ(Integer num) {
        LJIIZILJ("has_product_window", String.valueOf(num));
    }

    public final void LJJIIJZLJL(String param) {
        o.LJIIIZ(param, "param");
        LJIIZILJ("is_aladdin", param);
    }

    public final void LJJIIZ(Aweme aweme) {
        String str;
        SearchExtraStruct searchExtraStruct;
        SearchLiveStruct searchLiveStruct;
        if (aweme != null && (searchExtraStruct = aweme.getSearchExtraStruct()) != null && (searchLiveStruct = searchExtraStruct.getSearchLiveStruct()) != null) {
            str = searchLiveStruct.getLiveCoverType();
        } else {
            str = null;
        }
        LJIIZILJ("live_cover_type", str);
    }

    public final void LJJIIZI(Aweme aweme) {
        LiveRoomStruct liveRoomStruct;
        String str;
        if (aweme != null) {
            liveRoomStruct = aweme.getNewLiveRoomData();
        } else {
            liveRoomStruct = null;
        }
        if (C44729Hgz.LJJIJL(liveRoomStruct)) {
            str = "vertical";
        } else {
            str = "horizontal";
        }
        LJIIZILJ("live_screen_type", str);
    }

    public C49010JLi(JQA jqa, String str) {
        super(str);
        this.LJIIZILJ = jqa;
    }
}
