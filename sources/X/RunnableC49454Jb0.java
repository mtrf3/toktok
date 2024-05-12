package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.lynx.core.model.LynxDisplayImageUrl;
import com.ss.android.ugc.aweme.search.lynx.core.model.LynxImageUrl;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.CollectionLive;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.performance.core.model.SearchImageCommonRawData;
import com.ss.android.ugc.aweme.search.performance.core.model.SearchImageWikiRawData;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jb0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC49454Jb0 implements Runnable {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final List<? extends SearchMixFeed> LJLJI;

    public final void LIZ() {
        String str;
        SearchMixFeed searchMixFeed;
        Gson LIZ;
        String str2;
        List<LynxImageUrl> lynxImageUrl;
        List<String> list;
        Integer valueOf;
        String str3;
        Gson LIZ2;
        String str4;
        LynxDisplayImageUrl displayImageUrl;
        List<Aweme> awemeList;
        String str5;
        Product product;
        List<Aweme> list2;
        List<String> list3;
        List<String> list4;
        UrlModel urlModel;
        UrlModel avatarThumb;
        List<String> list5;
        UrlModel avatarThumb2;
        List<String> list6;
        List<String> list7;
        List<String> list8;
        Comment comment;
        User user;
        UrlModel avatarThumb3;
        User author;
        UrlModel avatarThumb4;
        Video video;
        UrlModel cover;
        int i = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        if (i > i2) {
            return;
        }
        while (true) {
            synchronized (this.LJLJI) {
                str = null;
                list8 = null;
                list8 = null;
                list8 = null;
                list8 = null;
                str = null;
                str = null;
                str = null;
                if ((!this.LJLJI.isEmpty()) && i < this.LJLJI.size()) {
                    searchMixFeed = this.LJLJI.get(i);
                } else {
                    searchMixFeed = null;
                }
            }
            if (searchMixFeed == null) {
                return;
            }
            SearchMixFeed searchMixFeed2 = searchMixFeed;
            int feedType = searchMixFeed2.getFeedType();
            if (feedType == 65280) {
                Aweme aweme = searchMixFeed2.getAweme();
                if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null) {
                    list6 = cover.getUrlList();
                } else {
                    list6 = null;
                }
                C49956Jj6.LIZIZ(LIZIZ(list6));
                Aweme aweme2 = searchMixFeed2.getAweme();
                if (aweme2 != null && (author = aweme2.getAuthor()) != null && (avatarThumb4 = author.getAvatarThumb()) != null) {
                    list7 = avatarThumb4.getUrlList();
                } else {
                    list7 = null;
                }
                C49956Jj6.LIZIZ(LIZIZ(list7));
                if (searchMixFeed2.getCommentList() != null && (!r0.isEmpty())) {
                    List<Comment> commentList = searchMixFeed2.getCommentList();
                    if (commentList != null && (comment = (Comment) ListProtector.get(commentList, 0)) != null && (user = comment.getUser()) != null && (avatarThumb3 = user.getAvatarThumb()) != null) {
                        list8 = avatarThumb3.getUrlList();
                    }
                    C49956Jj6.LIZIZ(LIZIZ(list8));
                }
            } else if (feedType == 65458) {
                List<SearchUser> list9 = searchMixFeed2.users;
                if (list9 != null) {
                    Iterator<SearchUser> it = list9.iterator();
                    while (it.hasNext()) {
                        User user2 = it.next().user;
                        if (user2 != null && (avatarThumb2 = user2.getAvatarThumb()) != null) {
                            list5 = avatarThumb2.getUrlList();
                        } else {
                            list5 = null;
                        }
                        C49956Jj6.LIZIZ(LIZIZ(list5));
                    }
                }
            } else if (feedType == 65456) {
                CollectionLive collectionLive = searchMixFeed2.collectionLive;
                if (collectionLive != null && (list2 = collectionLive.lives) != null) {
                    for (Aweme aweme3 : list2) {
                        User author2 = aweme3.getAuthor();
                        if (author2 != null && (avatarThumb = author2.getAvatarThumb()) != null) {
                            list3 = avatarThumb.getUrlList();
                        } else {
                            list3 = null;
                        }
                        C49956Jj6.LIZIZ(LIZIZ(list3));
                        User author3 = aweme3.getAuthor();
                        if (author3 != null && (urlModel = author3.roomCover) != null) {
                            list4 = urlModel.getUrlList();
                        } else {
                            list4 = null;
                        }
                        C49956Jj6.LIZIZ(LIZIZ(list4));
                    }
                }
            } else if (feedType == 65514) {
                DynamicPatch LJI = searchMixFeed2.LJI();
                if (LJI != null && (valueOf = Integer.valueOf(LJI.getOriginType())) != null) {
                    if (valueOf.intValue() == 9) {
                        DynamicPatch LJI2 = searchMixFeed2.LJI();
                        if (LJI2 != null && (awemeList = LJI2.getAwemeList()) != null) {
                            for (Aweme aweme4 : awemeList) {
                                o.LJIIIIZZ(aweme4.getProductsInfo(), "it.productsInfo");
                                if (!r1.isEmpty()) {
                                    List<Product> productsInfo = aweme4.getProductsInfo();
                                    if (productsInfo != null && (product = (Product) ListProtector.get(productsInfo, 0)) != null) {
                                        str5 = product.cover;
                                    } else {
                                        str5 = null;
                                    }
                                    C49956Jj6.LIZIZ(str5);
                                }
                            }
                        }
                    } else if (valueOf.intValue() == 998) {
                        DynamicPatch LJI3 = searchMixFeed2.LJI();
                        if (LJI3 != null) {
                            str3 = LJI3.getAlaSrc();
                        } else {
                            str3 = null;
                        }
                        if (o.LJ(str3, "wiki")) {
                            try {
                                GsonProvider LIZLLL = GsonHolder.LIZLLL();
                                Type type = new C49456Jb2().getType();
                                if (LIZLLL != null && (LIZ2 = LIZLLL.LIZ()) != null) {
                                    DynamicPatch LJI4 = searchMixFeed2.LJI();
                                    if (LJI4 != null) {
                                        str4 = LJI4.getRawData();
                                    } else {
                                        str4 = null;
                                    }
                                    SearchImageWikiRawData searchImageWikiRawData = (SearchImageWikiRawData) LIZ2.LJII(str4, type);
                                    if (searchImageWikiRawData != null && (displayImageUrl = searchImageWikiRawData.getDisplayImageUrl()) != null) {
                                        str = displayImageUrl.getImageUrl();
                                    }
                                }
                                C49956Jj6.LIZIZ(str);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                GsonProvider LIZLLL2 = GsonHolder.LIZLLL();
                Type type2 = new C49455Jb1().getType();
                if (LIZLLL2 != null && (LIZ = LIZLLL2.LIZ()) != null) {
                    DynamicPatch LJI5 = searchMixFeed.LJI();
                    if (LJI5 != null) {
                        str2 = LJI5.getRawData();
                    } else {
                        str2 = null;
                    }
                    SearchImageCommonRawData searchImageCommonRawData = (SearchImageCommonRawData) LIZ.LJII(str2, type2);
                    if (searchImageCommonRawData != null && (lynxImageUrl = searchImageCommonRawData.getLynxImageUrl()) != null) {
                        Iterator<LynxImageUrl> it2 = lynxImageUrl.iterator();
                        while (it2.hasNext()) {
                            UrlModel urlModel2 = it2.next().getUrlModel();
                            if (urlModel2 != null) {
                                list = urlModel2.getUrlList();
                            } else {
                                list = null;
                            }
                            C49956Jj6.LIZIZ(LIZIZ(list));
                        }
                    }
                }
            }
            if (i != i2) {
                i++;
            } else {
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static String LIZIZ(List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        return (String) ListProtector.get(list, 0);
    }

    public RunnableC49454Jb0(int i, int i2, List<? extends SearchMixFeed> list) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = list;
    }
}
