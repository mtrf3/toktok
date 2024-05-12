package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ois, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62682Ois {
    public static C43169Gwv LIZ = null;
    public static String LIZIZ = null;
    public static String LIZJ = null;
    public static String LIZLLL = "";
    public static final Long LJ = Long.valueOf(System.currentTimeMillis());
    public static int LJFF = -1;
    public static String LJI = "";

    public static void LIZ(String enterFrom, int i, String str, int i2, Aweme aweme, String str2) {
        int i3;
        int i4;
        String str3;
        User author;
        int i5 = -1;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            i4 = author.getFollowStatus();
            i3 = author.getFollowerStatus();
        } else {
            i3 = -1;
            i4 = -1;
        }
        if (LIZ == null) {
            LIZ = new C43169Gwv();
        }
        C62683Oit c62683Oit = new C62683Oit();
        c62683Oit.LIZ = str;
        c62683Oit.LIZJ = 1;
        c62683Oit.LJIIIIZZ = i4;
        c62683Oit.LJIIIZ = i3;
        c62683Oit.LJ = i2;
        if (aweme != null && aweme.isForwardAweme() && aweme.getForwardItem() != null) {
            c62683Oit.LJIIJ = aweme.getForwardItem().getAid();
            c62683Oit.LJIIJJI = aweme.getForwardItem().getAuthorUid();
            c62683Oit.LJIIL = aweme.getForwardItem().getFollowStatus();
            c62683Oit.LJIJ = aweme.getForwardItem().getAuthor().getFollowerStatus();
            c62683Oit.LJIJI = false;
        }
        if (!TextUtils.isEmpty(LIZIZ) && !TextUtils.isEmpty(LIZJ)) {
            String preItemId = LIZIZ;
            o.LJIIIZ(preItemId, "preItemId");
            c62683Oit.LJIJJ = preItemId;
            String preItemPlaytime = LIZJ;
            o.LJIIIZ(preItemPlaytime, "preItemPlaytime");
            c62683Oit.LJIJJLI = preItemPlaytime;
            if (!TextUtils.isEmpty(LIZLLL)) {
                String preHotSentence = LIZLLL;
                o.LJIIIZ(preHotSentence, "preHotSentence");
                c62683Oit.LJIL = preHotSentence;
            }
        }
        o.LJIIIZ(enterFrom, "enterFrom");
        c62683Oit.LJJIIZI = enterFrom;
        if (TcmServiceImpl.LJIJI().LJIIJ(aweme, enterFrom)) {
            c62683Oit.LJJIJIIJIL = 1;
        } else {
            c62683Oit.LJJIJIIJIL = 0;
        }
        LIZIZ = str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 7) {
                    if (i != 9) {
                        if (i != 22) {
                            if (i != 27) {
                                if (i != 31) {
                                    if (i != 39) {
                                        if (i != 5000) {
                                            if (i != 8000) {
                                                if (i != 33) {
                                                    if (i != 34) {
                                                        if (i != 1000) {
                                                            if (i != 1001) {
                                                                if (i != 2000) {
                                                                    if (i != 2001) {
                                                                        if (i != 3002) {
                                                                            if (i != 3003) {
                                                                                if (i != 4000) {
                                                                                    if (i == 4001) {
                                                                                        i5 = 8;
                                                                                    }
                                                                                } else {
                                                                                    i5 = 6;
                                                                                }
                                                                            } else {
                                                                                i5 = 9;
                                                                            }
                                                                        } else {
                                                                            i5 = 5;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i5 = 4;
                                                        }
                                                        i5 = 3;
                                                    } else {
                                                        i5 = 200;
                                                    }
                                                } else {
                                                    i5 = 11;
                                                }
                                            } else {
                                                i5 = 20;
                                            }
                                        } else {
                                            i5 = 7;
                                        }
                                    } else {
                                        i5 = 201;
                                    }
                                } else {
                                    i5 = 199;
                                }
                            } else {
                                i5 = 12;
                            }
                        } else {
                            i5 = 10;
                        }
                    } else {
                        i5 = 22;
                    }
                } else {
                    i5 = 2;
                }
            } else {
                i5 = 1;
            }
        } else {
            if (aweme != null && ((!aweme.getIsTikTokStory() && aweme.getAwemeType() != 40) || !aweme.getAuthorUid().equalsIgnoreCase(LJI))) {
                c62683Oit.LJIILJJIL = LJFF;
                c62683Oit.LJIILIIL = aweme.getAwemePosition();
                LJFF = aweme.getAwemePosition();
                JSONObject LIZ2 = RequestIdService.LJ().LIZ(0, aweme);
                if (LIZ2 == null) {
                    str3 = "";
                } else {
                    str3 = LIZ2.optString("order");
                }
                c62683Oit.LJIILL = str3;
                c62683Oit.LJIILLIIL = str2;
                c62683Oit.LJIIZILJ = LJ.longValue();
                String itemSource = aweme.getItemDistributeSource();
                o.LJIIIZ(itemSource, "itemSource");
                c62683Oit.LJJIJIL = itemSource;
                c62683Oit.LJJIJL = aweme.getItemSourceCategory();
                c62683Oit.LJJIJLIJ = aweme.isAd() ? 1 : 0;
                if (aweme.getIsTikTokStory() || aweme.getAwemeType() == 40) {
                    LJI = aweme.getAuthorUid();
                } else {
                    LJI = "";
                }
            }
            i5 = 0;
        }
        c62683Oit.LJFF = i5;
        LIZ.sendRequest(c62683Oit.LIZ());
        if (aweme != null) {
            C54029LIj c54029LIj = C54029LIj.LIZIZ;
            if (c54029LIj.LJJIZ() && ((RBX) HG3.LJIILL()).isLogin()) {
                c54029LIj.onAwemeRead(i, aweme);
            }
            if (i5 == 201) {
                C62685Oiv.LIZIZ.LIZIZ(aweme.getAid());
            }
        }
        if (C7ZT.LIZJ() && aweme != null && ((RBX) HG3.LJIILL()).isLogin()) {
            String authorId = aweme.getAuthorUid();
            String aid = aweme.getAid();
            o.LJIIIZ(authorId, "authorId");
            o.LJIIIZ(aid, "aid");
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            if (curUserId == null) {
                return;
            }
            if (!o.LJ(curUserId, C2P8.LIZ)) {
                C2P8.LIZ = curUserId;
                ((LinkedHashMap) C2P8.LIZIZ).clear();
            }
            java.util.Map<String, List<String>> map = C2P8.LIZIZ;
            if (map.containsKey(authorId)) {
                List list = (List) ((LinkedHashMap) map).get(authorId);
                if (list == null) {
                    return;
                }
                list.add(aid);
                return;
            }
            map.put(authorId, C47261Igj.LJJIJIL(aid));
        }
    }
}
