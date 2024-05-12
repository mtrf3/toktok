package X;

import Y.IDhS105S0100000_12;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.popularfeed.repo.PopularFeedApi;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lgy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54920Lgy implements InterfaceC54892LgW {
    public final /* synthetic */ C54894LgY LJLIL;

    public C54920Lgy(C54894LgY c54894LgY) {
        this.LJLIL = c54894LgY;
    }

    @Override // X.InterfaceC54892LgW
    public final FeedItemList LJIIIIZZ(C55671Lt5 c55671Lt5, Integer num, String str, Integer num2, String str2, String str3) {
        String str4;
        C48153Iv7 c48153Iv7;
        String str5;
        List<Aweme> items;
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIZ("popular");
        PopularFeedApi popularFeedApi = PopularFeedApi.LIZIZ;
        Integer valueOf = Integer.valueOf(C47497IkX.LIZJ());
        Integer num3 = c55671Lt5.LIZLLL;
        Integer num4 = c55671Lt5.LJI;
        if (c55671Lt5.LJIILIIL) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        String str6 = c55671Lt5.LJII;
        C48153Iv7 c48153Iv72 = new C48153Iv7();
        this.LJLIL.getClass();
        if (FXL.LIZ() && !TextUtils.isEmpty(C39099FWd.LIZ())) {
            c48153Iv7 = new C48153Iv7();
            c48153Iv7.LJIILLIIL = true;
        } else {
            c48153Iv7 = null;
        }
        this.LJLIL.getClass();
        if (FXL.LIZ() && !TextUtils.isEmpty(C39099FWd.LIZ())) {
            str5 = C39099FWd.LIZ();
        } else {
            str5 = "";
        }
        FeedItemList itemList = popularFeedApi.fetchPopularFeedList(valueOf, num3, num4, num, str4, str6, c48153Iv72, c48153Iv7, str5, str, num2, str2, str3, "").get().LIZJ(new IDhS105S0100000_12(c55671Lt5, 8));
        if (itemList != null && (items = itemList.getItems()) != null) {
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LIZIZ("popular", items);
            itemList.items = items;
        }
        o.LJIIIIZZ(itemList, "itemList");
        return itemList;
    }
}
