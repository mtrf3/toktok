package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZC implements JZF {
    public final /* synthetic */ JZD LIZ;
    public final /* synthetic */ InterfaceC50036JkO LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JZF
    public final void LIZ(Aweme aweme) {
        String str;
        long j;
        User author;
        JZD jzd = this.LIZ;
        C49820Jgu c49820Jgu = jzd.LJLJJLL;
        if (c49820Jgu != null) {
            C55457Lpd.LJLJJLL = c49820Jgu;
        }
        JQA jqa = jzd.LJLJL;
        ArrayList arrayList = null;
        if (jqa != null) {
            String str2 = jqa.LJII;
            String str3 = jqa.LJ;
            String str4 = jqa.LIZJ;
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.search_id = str2;
            logData.search_keyword = str3;
            logData.search_type = str4;
            logData.requestId = str2;
            if (aweme == null || (author = aweme.getAuthor()) == null || (str = author.getUid()) == null) {
                str = "";
            }
            logData.anchorId = str;
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterMethod = "live_cell_more";
            roomsData.enterFromMerge = "general_search";
            JZD jzd2 = this.LIZ;
            JQA jqa2 = jzd2.LJLJL;
            if (jqa2 != null) {
                C49820Jgu c49820Jgu2 = jzd2.LJLJJLL;
                if (c49820Jgu2 != null) {
                    j = ((SearchLiveList) c49820Jgu2.mData).cursor;
                } else {
                    j = 0;
                }
                List<SearchLiveStruct> data = jzd2.getData();
                if (data != null) {
                    arrayList = new ArrayList(C32I.LJJL(data, 10));
                    Iterator<SearchLiveStruct> it = data.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getLiveAweme());
                    }
                }
                JL9 jl9 = new JL9(null, jqa2, arrayList, j);
                C49489JbZ c49489JbZ = C49489JbZ.LIZ;
                InterfaceC50036JkO interfaceC50036JkO = this.LIZIZ;
                c49489JbZ.getClass();
                C49489JbZ.LIZJ(aweme, jl9, enterRoomConfig, interfaceC50036JkO);
                return;
            }
            o.LJIJI("itemMobParam");
            throw null;
        }
        o.LJIJI("itemMobParam");
        throw null;
    }

    public JZC(JZD jzd, InterfaceC50036JkO interfaceC50036JkO) {
        this.LIZ = jzd;
        this.LIZIZ = interfaceC50036JkO;
    }
}
