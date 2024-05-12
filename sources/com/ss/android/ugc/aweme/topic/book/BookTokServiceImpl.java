package com.ss.android.ugc.aweme.topic.book;

import X.AbstractC186347Ta;
import X.AbstractC186377Td;
import X.ActivityC45651qj;
import X.C185457Pp;
import X.C185467Pq;
import X.C185527Pw;
import X.C186307Sw;
import X.C199417s9;
import X.C26045AKb;
import X.C58096Mr6;
import X.C7SF;
import X.C7SG;
import X.C7T0;
import X.InterfaceC65462ha;
import X.ORZ;
import X.XGX;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.topic.book.BookTokServiceImpl;
import com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailApi;
import com.ss.android.ugc.aweme.topic.book.favorite.BookCollectionListPage;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class BookTokServiceImpl implements IBookTokService<C185457Pp, C185467Pq, C186307Sw, C7T0> {

    /* loaded from: classes4.dex */
    public static final class BookCollectionListPageFragmentData extends PowerViewPagerFragmentItem<BookCollectionListPage> {
        public static final Parcelable.Creator<BookCollectionListPageFragmentData> CREATOR = new Parcelable.Creator<BookCollectionListPageFragmentData>() { // from class: X.7SP
            @Override // android.os.Parcelable.Creator
            public final BookTokServiceImpl.BookCollectionListPageFragmentData createFromParcel(Parcel parcel) {
                o.LJIIIZ(parcel, "parcel");
                parcel.readInt();
                return new BookTokServiceImpl.BookCollectionListPageFragmentData();
            }

            @Override // android.os.Parcelable.Creator
            public final BookTokServiceImpl.BookCollectionListPageFragmentData[] newArray(int i) {
                return new BookTokServiceImpl.BookCollectionListPageFragmentData[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeInt(1);
        }
    }

    public static IBookTokService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IBookTokService.class, false);
        if (LIZ != null) {
            return (IBookTokService) LIZ;
        }
        if (C58096Mr6.z7 == null) {
            synchronized (IBookTokService.class) {
                if (C58096Mr6.z7 == null) {
                    C58096Mr6.z7 = new BookTokServiceImpl();
                }
            }
        }
        return C58096Mr6.z7;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.7SG] */
    @Override // com.ss.android.ugc.aweme.topic.book.IBookTokService
    public final C7SG LIZ(final Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        if (C7SF.LIZ()) {
            return new AbstractC186347Ta(ctx) { // from class: X.7SG
                public final FavoriteTabItemV2 LJLILLLLZI;

                @Override // X.AbstractC186347Ta
                public final FavoriteTabItemV2 LIZ() {
                    return this.LJLILLLLZI;
                }

                {
                    BookTokServiceImpl.BookCollectionListPageFragmentData bookCollectionListPageFragmentData = new BookTokServiceImpl.BookCollectionListPageFragmentData();
                    String string = ctx.getString(R.string.ccu);
                    o.LJIIIIZZ(string, "ctx.getString(R.string.b…favorite_tab_title_books)");
                    this.LJLILLLLZI = new FavoriteTabItemV2(bookCollectionListPageFragmentData, string, "books", "books");
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onCollectBookEvent(C184807Nc e) {
                    o.LJIIIZ(e, "e");
                    TopicRawInfo topicRawInfo = e.LJLIL;
                    if (topicRawInfo != null) {
                        Integer num = topicRawInfo.type;
                        int type = C7PR.BOOK.getType();
                        if (num != null && num.intValue() == type && e.LJLILLLLZI) {
                            LIZLLL(this.LJLIL);
                            return;
                        }
                    }
                    LIZIZ(this.LJLIL);
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.topic.book.IBookTokService
    public final InterfaceC65462ha<XGX<C185467Pq>> LIZJ(String bookId) {
        o.LJIIIZ(bookId, "bookId");
        BookDetailApi.LIZ.getClass();
        return C199417s9.LIZIZ(bookId);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.7Pw] */
    @Override // com.ss.android.ugc.aweme.topic.book.IBookTokService
    public final C185527Pw LIZLLL(final Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        if (!C7SF.LIZ()) {
            return null;
        }
        final BookCollectionListPage bookCollectionListPage = new BookCollectionListPage();
        if (!C7SF.LIZ()) {
            return null;
        }
        return new AbstractC186377Td(ctx, bookCollectionListPage) { // from class: X.7Pw
            public final C213218Yj LJLILLLLZI;

            @Override // X.AbstractC186377Td
            public final C213218Yj LIZ() {
                return this.LJLILLLLZI;
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onCollectBookEvent(C184807Nc e) {
                o.LJIIIZ(e, "e");
                TopicRawInfo topicRawInfo = e.LJLIL;
                if (topicRawInfo != null) {
                    Integer num = topicRawInfo.type;
                    int type = C7PR.BOOK.getType();
                    if (num != null && num.intValue() == type && e.LJLILLLLZI) {
                        LJFF(this.LJLIL);
                        return;
                    }
                }
                LIZIZ(this.LJLIL);
            }

            {
                String string = ctx.getString(R.string.ccu);
                o.LJIIIIZZ(string, "ctx.getString(R.string.b…favorite_tab_title_books)");
                String str = "books";
                this.LJLILLLLZI = new C213218Yj(bookCollectionListPage, string, str, str);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.topic.book.IBookTokService
    public final InterfaceC65462ha<XGX<C185457Pp>> LJ(String bookId) {
        o.LJIIIZ(bookId, "bookId");
        BookDetailApi.LIZ.getClass();
        return C199417s9.LIZ(bookId);
    }

    @Override // com.ss.android.ugc.aweme.topic.book.IBookTokService
    public final boolean LIZIZ(int i, ActivityC45651qj activityC45651qj, List selectedBookAnchorIds) {
        o.LJIIIZ(selectedBookAnchorIds, "selectedBookAnchorIds");
        if (selectedBookAnchorIds.size() >= 5) {
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIZ(activityC45651qj.getResources().getQuantityString(R.plurals.bm, 5, 5));
            c26045AKb.LJIIJ();
            return false;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "//topic/book/search");
        buildRoute.withParam("selected_book_max_count", Math.min(selectedBookAnchorIds.size() + (10 - i), 5));
        buildRoute.withParam("selected_book_ids", ORZ.LLD(selectedBookAnchorIds, ",", null, null, null, 62));
        buildRoute.open();
        return true;
    }
}
