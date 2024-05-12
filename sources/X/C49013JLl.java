package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JLl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49013JLl implements InterfaceC49000JKy, InterfaceC48999JKx, JMS {
    public final SearchMixFeed LJLIL;
    public final Aweme LJLILLLLZI;
    public final C48462J0g LJLJI = C87277YNd.LJJIFFI(new AqS174S0100000_8(this, 177));

    @Override // X.InterfaceC48999JKx
    public final String A() {
        String userCountDes;
        String totalUserDes;
        LiveRoomStruct newLiveRoomData;
        TopFrameSummary topFrameSummary;
        LiveRoomStruct newLiveRoomData2 = this.LJLILLLLZI.getNewLiveRoomData();
        if (newLiveRoomData2 != null && (totalUserDes = newLiveRoomData2.getTotalUserDes()) != null && (newLiveRoomData = this.LJLILLLLZI.getNewLiveRoomData()) != null && (topFrameSummary = newLiveRoomData.topFrameSummary) != null && topFrameSummary.getId() != 0) {
            return totalUserDes;
        }
        LiveRoomStruct newLiveRoomData3 = this.LJLILLLLZI.getNewLiveRoomData();
        if (newLiveRoomData3 != null && (userCountDes = newLiveRoomData3.getUserCountDes()) != null) {
            return userCountDes;
        }
        return "";
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
    }

    @Override // X.InterfaceC48999JKx
    public final boolean n() {
        return this.LJLILLLLZI.getIsLiveHasProduct();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchMixLiveCardRenderData(searchMixFeed=");
        LIZ.append(this.LJLIL);
        LIZ.append(", aweme=");
        return C770830u.LIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.JMS
    public final C48462J0g LLLF() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC49000JKy
    public final Aweme getAweme() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49013JLl)) {
            return false;
        }
        C49013JLl c49013JLl = (C49013JLl) obj;
        if (o.LJ(this.LJLIL, c49013JLl.LJLIL) && o.LJ(this.LJLILLLLZI, c49013JLl.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C49013JLl(SearchMixFeed searchMixFeed, Aweme aweme) {
        this.LJLIL = searchMixFeed;
        this.LJLILLLLZI = aweme;
    }
}
