package X;

import Y.AgS126S0100000_9;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.now.model.ItemLikeListPreview;
import com.ss.android.ugc.aweme.now.model.NowBatchReactionResponse;
import com.ss.android.ugc.aweme.now.model.NowWidgetFeedResponse;
import com.ss.android.ugc.aweme.now.net.INowWidgetApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCI {
    public static volatile MCK LIZ = new MCK(LIZ(), null, null, null, null, 126);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static boolean LIZ() {
        if (AV1.LJIILLIIL()) {
            MCT.LIZ("NowWidgetViewModel", "widget not enabled: kids mode");
            return false;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            MCT.LIZ("NowWidgetViewModel", "widget not enabled: not login");
            return false;
        }
        if (!MAN.LIZIZ.LIZLLL()) {
            MCT.LIZ("NowWidgetViewModel", "widget not enabled: exp not enabled");
            return false;
        }
        return true;
    }

    public static void LIZIZ(MCM mcm) {
        UrlModel urlModel = mcm.LIZIZ;
        if (urlModel == null) {
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LIZJ = mcm.LIZ;
        LJII.LJIJI = Bitmap.Config.ARGB_8888;
        LJII.LJIIIZ(new MCL(mcm));
    }

    public static void LJ(String src) {
        AbstractC73638SvC LJIILL;
        o.LJIIIZ(src, "src");
        AtomicBoolean atomicBoolean = LIZIZ;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("now widget update triggered, from: ");
        LIZ2.append(src);
        MCT.LIZIZ("NowWidgetViewModel", X1D.LIZIZ(LIZ2));
        if (!C48203Ivv.LJ(EF7.LIZIZ())) {
            atomicBoolean.set(false);
            return;
        }
        if (!LIZ()) {
            LJIILL = AbstractC73638SvC.LJIJ(new MCK(false, null, null, null, null, 127));
        } else {
            LJIILL = ((INowWidgetApi) C114354eF.LIZ.getValue()).fetchNowWidgetFeedInfoRx().LJJIIJ(T16.LIZ()).LJIILL(new InterfaceC48038ItG() { // from class: X.4eD
                @Override // X.InterfaceC48038ItG
                public final Object apply(Object obj) {
                    final String str;
                    UrlModel backImage;
                    NowWidgetFeedResponse nowWidgetFeedResponse = (NowWidgetFeedResponse) obj;
                    o.LJIIIZ(nowWidgetFeedResponse, "nowWidgetFeedResponse");
                    BaseResponse.ServerTimeExtra serverTimeExtra = nowWidgetFeedResponse.extra;
                    if (serverTimeExtra != null) {
                        str = serverTimeExtra.logid;
                    } else {
                        str = null;
                    }
                    final List<Aweme> nowInfo = nowWidgetFeedResponse.getNowInfo();
                    if (nowInfo.size() > 2) {
                        nowInfo = nowInfo.subList(0, 2);
                    }
                    ArrayList arrayList = new ArrayList(C32I.LJJL(nowInfo, 10));
                    Iterator<Aweme> it = nowInfo.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAid());
                    }
                    final ArrayList arrayList2 = new ArrayList(C32I.LJJL(nowInfo, 10));
                    for (Aweme aweme : nowInfo) {
                        if (MAN.LIZIZ.LJI()) {
                            NowPostInfo nowPostInfo = aweme.nowPostInfo;
                            if (nowPostInfo != null) {
                                backImage = nowPostInfo.getBackImage();
                            }
                            backImage = null;
                        } else {
                            NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
                            if (nowPostInfo2 == null || (backImage = nowPostInfo2.getFrontImage()) == null) {
                                NowPostInfo nowPostInfo3 = aweme.nowPostInfo;
                                if (nowPostInfo3 != null) {
                                    backImage = nowPostInfo3.getBackImage();
                                }
                                backImage = null;
                            }
                        }
                        arrayList2.add(backImage);
                    }
                    if ((!arrayList.isEmpty()) && nowWidgetFeedResponse.getNeedLoadInteractionInfo()) {
                        return ((INowWidgetApi) C114354eF.LIZ.getValue()).fetchBatchReactionList(ujb.o.LJJJJZ(ORZ.LLD(arrayList, ",", null, null, null, 62), " ", "", false), 5, true, 0, true, C75792yF.LIZJ(C113554cx.LJJL(new OSZ("need_comment", 1), new OSZ("now_reaction", 1))), EnumC114344eE.LIKE_LIST_SCENARIO_NOW_REACTION_AVATAR.getValue()).LJIJJLI(C78996UzQ.LJLJI).LJIJI(new InterfaceC48038ItG() { // from class: X.3Id
                            @Override // X.InterfaceC48038ItG
                            public final Object apply(Object obj2) {
                                NowBatchReactionResponse response = (NowBatchReactionResponse) obj2;
                                o.LJIIIZ(response, "response");
                                return new MCK(true, nowInfo, response.getItemLikeListPreviewList(), arrayList2, str, 80);
                            }
                        });
                    }
                    return AbstractC73638SvC.LJIJ(new MCK(true, nowInfo, null, arrayList2, str, 84));
                }
            });
        }
        LJIILL.LJJ(MCH.LJLIL);
    }

    public static C197267og LIZLLL(Aweme aweme, List listListPreviews) {
        Object obj;
        List<User> users;
        String str;
        o.LJIIIZ(listListPreviews, "listListPreviews");
        if (!C78996UzQ.LJJIIZI(aweme)) {
            return null;
        }
        Iterator it = listListPreviews.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                ItemLikeListPreview itemLikeListPreview = (ItemLikeListPreview) obj;
                String aid = itemLikeListPreview.getAid();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (o.LJ(aid, str) && itemLikeListPreview.getTotalCount() > 0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ItemLikeListPreview itemLikeListPreview2 = (ItemLikeListPreview) obj;
        if (itemLikeListPreview2 != null && (users = itemLikeListPreview2.getUsers()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(users, 10));
            Iterator<User> it2 = users.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getAvatarThumb());
            }
            if (!arrayList.isEmpty()) {
                return new C197267og(arrayList, (int) itemLikeListPreview2.getTotalCount());
            }
        }
        return null;
    }

    public static void LIZJ(Bitmap bitmap, int[] targetSize, boolean z, float f, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(bitmap, "<this>");
        o.LJIIIZ(targetSize, "targetSize");
        C10K LIZJ = C10K.LIZJ(new MCO(bitmap, targetSize, z, f));
        o.LJIIIIZZ(LIZJ, "Bitmap.process(targetSiz…und roundBitmap\n        }");
        o.LJIIIIZZ(LIZJ.LJ(new AgS126S0100000_9(interfaceC88472Yns, 14), C10K.LJIIIIZZ, null), "crossinline continuation… Task.UI_THREAD_EXECUTOR)");
    }
}
