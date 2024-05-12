package com.ss.android.ugc.aweme.topic.movie;

import X.AbstractC186347Ta;
import X.ActivityC45651qj;
import X.C186317Sx;
import X.C199427sA;
import X.C26045AKb;
import X.C58096Mr6;
import X.C7S3;
import X.C7S4;
import X.C7SH;
import X.C7T1;
import X.C7VQ;
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
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.MovieTokServiceImpl;
import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi;
import com.ss.android.ugc.aweme.topic.movie.favorite.MovieFavoritePage;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;

/* loaded from: classes4.dex */
public final class MovieTokServiceImpl implements IMovieTokService<C7S3, C7S4, C186317Sx, C7T1> {

    /* loaded from: classes4.dex */
    public static final class MovieFavoritePageData extends PowerViewPagerFragmentItem<MovieFavoritePage> {
        public static final Parcelable.Creator<MovieFavoritePageData> CREATOR = new Parcelable.Creator<MovieFavoritePageData>() { // from class: X.7SQ
            @Override // android.os.Parcelable.Creator
            public final MovieTokServiceImpl.MovieFavoritePageData createFromParcel(Parcel parcel) {
                o.LJIIIZ(parcel, "parcel");
                parcel.readInt();
                return new MovieTokServiceImpl.MovieFavoritePageData();
            }

            @Override // android.os.Parcelable.Creator
            public final MovieTokServiceImpl.MovieFavoritePageData[] newArray(int i) {
                return new MovieTokServiceImpl.MovieFavoritePageData[i];
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

    public static IMovieTokService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IMovieTokService.class, false);
        if (LIZ != null) {
            return (IMovieTokService) LIZ;
        }
        if (C58096Mr6.A7 == null) {
            synchronized (IMovieTokService.class) {
                if (C58096Mr6.A7 == null) {
                    C58096Mr6.A7 = new MovieTokServiceImpl();
                }
            }
        }
        return C58096Mr6.A7;
    }

    @Override // com.ss.android.ugc.aweme.topic.movie.IMovieTokService
    public final InterfaceC65462ha<XGX<C7S4>> LIZIZ(String movieId) {
        o.LJIIIZ(movieId, "movieId");
        MovieDetailApi.LIZ.getClass();
        return C199427sA.LIZIZ(movieId);
    }

    @Override // com.ss.android.ugc.aweme.topic.movie.IMovieTokService
    public final C7VQ LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        if (e1.LIZ(31744, "display_movietok_favorite_tab", true, false)) {
            return new MovieFavoritePage().vl(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.topic.movie.IMovieTokService
    public final InterfaceC65462ha<XGX<C7S3>> LIZLLL(String movieId) {
        o.LJIIIZ(movieId, "movieId");
        MovieDetailApi.LIZ.getClass();
        return C199427sA.LIZ(movieId);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.7SH] */
    @Override // com.ss.android.ugc.aweme.topic.movie.IMovieTokService
    public final C7SH LJ(final Context context) {
        o.LJIIIZ(context, "context");
        if (e1.LIZ(31744, "display_movietok_favorite_tab", true, false)) {
            return new AbstractC186347Ta(context) { // from class: X.7SH
                public final FavoriteTabItemV2 LJLILLLLZI;

                @Override // X.AbstractC186347Ta
                public final FavoriteTabItemV2 LIZ() {
                    return this.LJLILLLLZI;
                }

                {
                    MovieTokServiceImpl.MovieFavoritePageData movieFavoritePageData = new MovieTokServiceImpl.MovieFavoritePageData();
                    String string = context.getString(R.string.i9_, 0);
                    o.LJIIIIZZ(string, "context.getString(pageTitleRes, 0)");
                    this.LJLILLLLZI = new FavoriteTabItemV2(movieFavoritePageData, s.LJJZZIII(CardStruct.IStatusCode.DEFAULT, string), "movies", "movies");
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onCollectEvent(C184807Nc e) {
                    o.LJIIIZ(e, "e");
                    TopicRawInfo topicRawInfo = e.LJLIL;
                    if (topicRawInfo != null) {
                        Integer num = topicRawInfo.type;
                        int type = C7PR.MOVIE.getType();
                        if (num == null || num.intValue() != type) {
                            return;
                        }
                        if (e.LJLILLLLZI) {
                            LIZLLL(this.LJLIL);
                        } else {
                            LIZIZ(this.LJLIL);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.topic.movie.IMovieTokService
    public final boolean LIZ(int i, ActivityC45651qj activityC45651qj, List selectedMovieAnchorIds) {
        o.LJIIIZ(selectedMovieAnchorIds, "selectedMovieAnchorIds");
        if (selectedMovieAnchorIds.size() >= 5) {
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIZ(activityC45651qj.getResources().getString(R.string.i96, 5));
            c26045AKb.LJIIJ();
            return false;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "//topic/movie/search");
        buildRoute.withParam("selected_movie_max_count", Math.min(selectedMovieAnchorIds.size() + (10 - i), 5));
        buildRoute.withParam("selected_movie_ids", ORZ.LLD(selectedMovieAnchorIds, ",", null, null, null, 62));
        buildRoute.open();
        return true;
    }
}
