package Y;

import X.C188727au;
import X.C221018lt;
import X.C2ZZ;
import X.C47261Igj;
import X.C49603JdP;
import X.C53946LFe;
import X.C62685Oiv;
import X.C75792yF;
import X.C76800UCe;
import X.C78685UuP;
import X.C81553Hz;
import X.FMX;
import X.X1D;
import com.ss.android.ugc.aweme.detail.api.FeedPagination;
import com.ss.android.ugc.aweme.detail.api.FeedPaginationControl;
import com.ss.android.ugc.aweme.detail.api.UpvoteApi;
import com.ss.android.ugc.aweme.detail.api.UpvoteFeedListResponse;
import com.ss.android.ugc.aweme.detail.api.UpvoteFeedStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyGroupStruct;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyRspStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACallableS7S2100000_1 implements Callable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS7S2100000_1 aCallableS7S2100000_1) {
        Integer num;
        long j;
        FeedPagination feedPagination;
        ArrayList<UpvoteFeedStruct> arrayList;
        String pageControl = C75792yF.LIZJ(((C81553Hz) aCallableS7S2100000_1.l2).LJLIL);
        C62685Oiv c62685Oiv = C62685Oiv.LIZIZ;
        String viewedAids = C75792yF.LIZJ(c62685Oiv.LIZLLL(((C81553Hz) aCallableS7S2100000_1.l2).mListQueryType));
        String topTwoUpvotes = C75792yF.LIZJ(C47261Igj.LJJIJIIJI(aCallableS7S2100000_1.s0, aCallableS7S2100000_1.s1));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchUpvoteList, query type: ");
        LIZ.append(((C81553Hz) aCallableS7S2100000_1.l2).mListQueryType);
        LIZ.append(", feedPaginationControl: ");
        LIZ.append(pageControl);
        LIZ.append(", viewedAids: ");
        LIZ.append(viewedAids);
        LIZ.append(", topTwoUpvotes: ");
        LIZ.append(topTwoUpvotes);
        C221018lt.LJFF("InboxRepostList", X1D.LIZIZ(LIZ));
        UpvoteApi upvoteApi = UpvoteApi.LIZIZ;
        o.LJIIIIZZ(pageControl, "pageControl");
        o.LJIIIIZZ(viewedAids, "viewedAids");
        o.LJIIIIZZ(topTwoUpvotes, "topTwoUpvotes");
        UpvoteFeedListResponse upvoteFeedListResponse = upvoteApi.getUpvoteFeedList(pageControl, viewedAids, topTwoUpvotes).get();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("upvoteFeedListResponse: size: ");
        if (upvoteFeedListResponse != null && (arrayList = upvoteFeedListResponse.upvoteFeedList) != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        LIZ2.append(num);
        C221018lt.LJFF("InboxRepostList", X1D.LIZIZ(LIZ2));
        c62685Oiv.LJFF();
        FeedPaginationControl feedPaginationControl = ((C81553Hz) aCallableS7S2100000_1.l2).LJLIL;
        if (upvoteFeedListResponse != null && (feedPagination = upvoteFeedListResponse.pagination) != null) {
            j = feedPagination.getCursor();
        } else {
            j = 0;
        }
        feedPaginationControl.setCursor(j);
        return upvoteFeedListResponse;
    }

    public static final Object call$1(ACallableS7S2100000_1 aCallableS7S2100000_1) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", ((Aweme) aCallableS7S2100000_1.l2).getAid());
        c188727au.LJIIIZ("author_id", ((Aweme) aCallableS7S2100000_1.l2).getAuthorUid());
        c188727au.LJIIIZ("enter_from", aCallableS7S2100000_1.s0);
        c188727au.LJIIIZ("enter_method", aCallableS7S2100000_1.s1);
        String str2 = "1";
        if (!C53946LFe.LIZIZ().LJFF) {
            str = "1";
        } else {
            str = "3";
        }
        c188727au.LJIIIZ("pad_interface_orientation", str);
        c188727au.LIZLLL(0, "is_landscape_screen");
        if (!((Aweme) aCallableS7S2100000_1.l2).isPaidContent) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_collection_item", str2);
        FMX.LJIIL("click_video_speed", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS7S2100000_1 aCallableS7S2100000_1) {
        String str;
        Aweme aweme = (Aweme) aCallableS7S2100000_1.l2;
        Integer num = null;
        if (aweme == null) {
            return null;
        }
        String str2 = aCallableS7S2100000_1.s0;
        String str3 = aCallableS7S2100000_1.s1;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
        c188727au.LJIIIZ("enter_method", str3);
        if (C53946LFe.LIZIZ().LJFF) {
            str = "3";
        } else {
            str = "1";
        }
        c188727au.LJIIIZ("pad_interface_orientation", str);
        Video video = aweme.getVideo();
        if (video != null) {
            num = Integer.valueOf(video.getDuration());
        }
        c188727au.LJFF(num, "item_duration");
        FMX.LJIIL("video_speed_show", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS7S2100000_1 aCallableS7S2100000_1) {
        String str;
        int i;
        List list = (List) aCallableS7S2100000_1.l2;
        String str2 = aCallableS7S2100000_1.s0;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Aweme aweme = (Aweme) it.next();
            if (aweme.getAid().equals(str2) & C78685UuP.LJJJZ(aweme.getAid())) {
                if (i2 >= 0) {
                    List list2 = (List) aCallableS7S2100000_1.l2;
                    String str3 = aCallableS7S2100000_1.s1;
                    int i3 = 0;
                    for (Object obj : list2) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            Aweme aweme2 = (Aweme) obj;
                            if (str3 == null) {
                                str = "";
                            } else {
                                str = str3;
                            }
                            if (i3 == i2) {
                                i = 0;
                            } else if (i3 < i2) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                            C49603JdP.LJ(i, Math.abs(i3 - i2), aweme2, str);
                            i3 = i4;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
            } else {
                i2++;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS7S2100000_1 aCallableS7S2100000_1) {
        Long l;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", ((Aweme) aCallableS7S2100000_1.l2).getAid());
        c188727au.LJIIIZ("author_id", ((Aweme) aCallableS7S2100000_1.l2).getAuthorUid());
        Music music = ((Aweme) aCallableS7S2100000_1.l2).getMusic();
        if (music != null) {
            l = Long.valueOf(music.getId());
        } else {
            l = null;
        }
        c188727au.LJFF(l, "music_id");
        c188727au.LJIIIZ("enter_from", aCallableS7S2100000_1.s0);
        c188727au.LJIIIZ("enter_method", aCallableS7S2100000_1.s1);
        FMX.LJIIL("show_choose_dislike_reason", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS7S2100000_1 aCallableS7S2100000_1) {
        Long l;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", ((Aweme) aCallableS7S2100000_1.l2).getAid());
        c188727au.LJIIIZ("author_id", ((Aweme) aCallableS7S2100000_1.l2).getAuthorUid());
        Music music = ((Aweme) aCallableS7S2100000_1.l2).getMusic();
        if (music != null) {
            l = Long.valueOf(music.getId());
        } else {
            l = null;
        }
        c188727au.LJFF(l, "music_id");
        c188727au.LJIIIZ("enter_from", aCallableS7S2100000_1.s0);
        c188727au.LJIIIZ("enter_method", aCallableS7S2100000_1.s1);
        FMX.LJIIL("show_choose_dislike_reason_toast", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS7S2100000_1 aCallableS7S2100000_1) {
        String str;
        String str2;
        ConsistencyGroupStruct consistencyGroupStruct;
        ConsistencyRspStruct consistencyRspStruct = (ConsistencyRspStruct) C2ZZ.LJFF().get(aCallableS7S2100000_1.s0);
        if (consistencyRspStruct == null) {
            return null;
        }
        Aweme aweme = (Aweme) aCallableS7S2100000_1.l2;
        String str3 = aCallableS7S2100000_1.s1;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        long LJI = C2ZZ.LJI(str);
        HashMap<Long, ConsistencyGroupStruct> consistencyGroups = consistencyRspStruct.getConsistencyGroups();
        if (consistencyGroups != null && consistencyGroups.containsKey(Long.valueOf(LJI))) {
            HashMap<Long, ConsistencyGroupStruct> consistencyGroups2 = consistencyRspStruct.getConsistencyGroups();
            if (consistencyGroups2 != null && (consistencyGroupStruct = consistencyGroups2.get(Long.valueOf(LJI))) != null) {
                consistencyGroupStruct.setDeleteStage(4);
                consistencyGroupStruct.setDeleteReason(str3);
            }
            return C76800UCe.LIZ;
        }
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        ConsistencyGroupStruct LIZIZ = C2ZZ.LIZIZ(LJI, str2, str3);
        HashMap<Long, ConsistencyGroupStruct> consistencyGroups3 = consistencyRspStruct.getConsistencyGroups();
        if (consistencyGroups3 == null) {
            return null;
        }
        return consistencyGroups3.put(Long.valueOf(LJI), LIZIZ);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACallableS7S2100000_1(java.lang.String r2, com.ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 1: goto L10;
                case 2: goto L10;
                case 3: goto L5;
                case 4: goto L10;
                case 5: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r2
            r0.l2 = r3
            r0.s1 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l2 = r3
            r0.s0 = r2
            r0.s1 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS7S2100000_1.<init>(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int):void");
    }

    public ACallableS7S2100000_1(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
