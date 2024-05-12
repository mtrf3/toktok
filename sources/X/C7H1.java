package X;

import Y.AfS18S1100000_3;
import Y.AfS1S1100100_3;
import Y.AfS22S0110000_1;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.UpvotePreloadStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.model.UpvoteReasonRequest;
import defpackage.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.7H1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7H1 {
    public static final C7H1 LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;

    static {
        C7H1 c7h1 = new C7H1();
        LIZ = c7h1;
        LIZIZ = C221108m2.LIZIZ(C7H3.LJLIL);
        LIZJ = C221108m2.LIZIZ(C7H7.LJLIL);
        C42625Go9.LIZIZ(c7h1);
    }

    public static HashMap LIZLLL() {
        return (HashMap) LIZIZ.getValue();
    }

    public static final void LIZ(String aid) {
        UpvoteStruct LJIIIIZZ;
        o.LJIIIZ(aid, "aid");
        UpvoteList upvoteList = (UpvoteList) C7H2.LIZIZ().get(aid);
        if (upvoteList != null && (LJIIIIZZ = C1FP.LJIIIIZZ(upvoteList)) != null) {
            LJIIIIZZ.setText(null);
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            LJIIIIZZ.setTextExtra(c61878OQg);
            LJIIIIZZ.setImageList(c61878OQg);
            LJIIIIZZ.setCacheState(LJIIIIZZ.getRepostState());
        }
        LJ(aid, "unknown");
    }

    public static void LJFF(String aid) {
        List<UpvoteStruct> upvotes;
        String str;
        o.LJIIIZ(aid, "aid");
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        UpvoteList oldUpvoteList = (UpvoteList) C7H2.LIZIZ().get(aid);
        if (oldUpvoteList != null && (upvotes = oldUpvoteList.getUpvotes()) != null) {
            Iterator<UpvoteStruct> it = upvotes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UpvoteStruct next = it.next();
                User user = next.getUser();
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                if (o.LJ(str, curUser.getUid())) {
                    if (next != null) {
                        o.LJIIIIZZ(oldUpvoteList, "oldUpvoteList");
                        List LLJILJILJ = ORZ.LLJILJILJ(oldUpvoteList.getUpvotes());
                        ((ArrayList) LLJILJILJ).remove(next);
                        C7H2.LIZIZ().put(aid, UpvoteList.copy$default(oldUpvoteList, LLJILJILJ, 0L, false, oldUpvoteList.getTotal() - 1, null, 22, null));
                        C7H2.LJ.add(aid);
                    }
                }
            }
        }
        LJ(aid, "delete_success");
    }

    public static void LJIIJJI(String str) {
        UpvoteList LIZ2 = C7H2.LIZ(str);
        if (LIZ2 == null || LIZ2.getUpvotes().size() <= 20) {
            return;
        }
        C7H2.LJ(str, UpvoteList.copy$default(LIZ2, LIZ2.getUpvotes().subList(0, 20), 20L, true, 0L, null, 24, null), true, 20);
    }

    @QD3
    public final void onUserBlocked(C175046tw blockEvent) {
        String str;
        o.LJIIIZ(blockEvent, "blockEvent");
        User user = blockEvent.LJLIL;
        if (user == null || (str = user.getUid()) == null) {
            str = "";
        }
        ((HashSet) C7H2.LJFF.getValue()).add(str);
        java.util.Set entrySet = LIZLLL().entrySet();
        o.LJIIIIZZ(entrySet, "listeners.entries");
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Object key = ((Map.Entry) it.next()).getKey();
            o.LJIIIIZZ(key, "it.key");
            LJ((String) key, "unknown");
        }
    }

    public static void LJ(String str, String str2) {
        UpvoteList LIZ2 = C7H2.LIZ(str);
        List list = (List) LIZLLL().get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C7H8) it.next()).LIZ(str, LIZ2, str2);
            }
        }
    }

    public static void LJII(String aid, UpvoteStruct upvoteStruct) {
        o.LJIIIZ(aid, "aid");
        if (C7H2.LIZIZ().get(aid) != null) {
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            UpvoteList upvoteList = (UpvoteList) C7H2.LIZIZ().get(aid);
            Iterator<UpvoteStruct> it = upvoteList.getUpvotes().iterator();
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                UpvoteStruct next = it.next();
                User user = next.getUser();
                if (user != null) {
                    str = user.getUid();
                }
                if (o.LJ(str, curUserId)) {
                    if (next != null) {
                        int indexOf = upvoteList.getUpvotes().indexOf(next);
                        List LLJILJILJ = ORZ.LLJILJILJ(upvoteList.getUpvotes());
                        ListProtector.set(LLJILJILJ, indexOf, upvoteStruct);
                        C7H2.LIZIZ().put(aid, UpvoteList.copy$default(upvoteList, LLJILJILJ, 0L, false, 0L, null, 30, null));
                    }
                }
            }
        }
        LJ(aid, "publish_success");
    }

    public static void LJIIL(String aid, C7H8 listener) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(listener, "listener");
        List list = (List) LIZLLL().get(aid);
        if (list != null) {
            list.remove(listener);
            if (list.isEmpty()) {
                LIZLLL().remove(aid);
            }
        }
        if (LIZLLL().isEmpty()) {
            ((C73318Sq2) LIZJ.getValue()).LIZLLL();
        }
    }

    public static final void LJIILIIL(String aid, UpvoteCacheState upvoteCacheState) {
        UpvoteStruct LJIIIIZZ;
        o.LJIIIZ(aid, "aid");
        UpvoteList upvoteList = (UpvoteList) C7H2.LIZIZ().get(aid);
        if (upvoteList != null && (LJIIIIZZ = C1FP.LJIIIIZZ(upvoteList)) != null) {
            LJIIIIZZ.setRepostState(upvoteCacheState);
            String text = LJIIIIZZ.getText();
            if (text == null || text.length() == 0) {
                LJIIIIZZ.setCacheState(upvoteCacheState);
            }
        }
        LJ(aid, "unknown");
    }

    public static void LJIILJJIL(String aid, UpvoteCacheState upvoteCacheState) {
        Object obj;
        o.LJIIIZ(aid, "aid");
        if (C7H2.LIZIZ().get(aid) != null) {
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            Iterator<UpvoteStruct> it = ((UpvoteList) C7H2.LIZIZ().get(aid)).getUpvotes().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                UpvoteStruct next = it.next();
                User user = next.getUser();
                if (user != null) {
                    obj = user.getUid();
                }
                if (o.LJ(obj, curUserId)) {
                    obj = next;
                    break;
                }
            }
            UpvoteStruct upvoteStruct = (UpvoteStruct) obj;
            if (upvoteStruct != null) {
                upvoteStruct.setCacheState(upvoteCacheState);
                String text = upvoteStruct.getText();
                if (text == null || text.length() == 0) {
                    upvoteStruct.setRepostState(upvoteCacheState);
                }
            }
        }
        if (upvoteCacheState == UpvoteCacheState.PRE_REMOVE) {
            LJ(aid, "fake_delete_upvote");
        }
    }

    public static UpvoteList LJIIJ(Aweme aweme, C7H8 c7h8, C7KB c7kb) {
        boolean z;
        List LJJIJ;
        java.util.Map map;
        String aid = aweme.getAid();
        List list = (List) LIZLLL().get(aid);
        if (list == null) {
            list = new ArrayList();
        }
        if (!list.contains(c7h8)) {
            list.add(c7h8);
        }
        HashMap LIZLLL = LIZLLL();
        o.LJIIIIZZ(aid, "aid");
        LIZLLL.put(aid, list);
        UpvoteList LIZ2 = C7H2.LIZ(aid);
        if (LIZ2 == null) {
            UpvoteReason LIZJ2 = C7H2.LIZJ(aid);
            UpvotePreloadStruct upvotePreload = aweme.getUpvotePreload();
            if (upvotePreload != null && upvotePreload.getNeedPullUpvoteInfo()) {
                z = true;
            } else {
                z = false;
            }
            String str = (String) ((LinkedHashMap) C7H2.LIZLLL).get(aid);
            Object obj = ((LinkedHashMap) C7H2.LIZJ).get(aid);
            if (LIZJ2 == null) {
                if (!z && obj == null && (str == null || str.length() == 0)) {
                    return LIZ2;
                }
                LJJIJ = C61878OQg.INSTANCE;
            } else {
                LJJIJ = C47261Igj.LJJIJ(LIZJ2);
            }
            java.util.Map map2 = null;
            if (obj != null) {
                map = C51029K0z.LJJIIZI(new OSZ(aid, obj));
            } else {
                map = null;
            }
            if (str != null && str.length() != 0) {
                map2 = E2C.LIZJ(aid, str);
            }
            LIZIZ(C47261Igj.LJJIJ(aid), LJJIJ, map, map2, false, c7kb);
            return C7H2.LIZ(aid);
        }
        return LIZ2;
    }

    public static void LJIIIIZZ(String aid, UpvoteList upvoteList, boolean z, int i) {
        o.LJIIIZ(aid, "aid");
        if (upvoteList == null) {
            return;
        }
        C7H2.LJ(aid, upvoteList, z, i);
        L6F.LIZIZ.LIZLLL(L61.STORY, null, upvoteList.getUpvotes(), C115624gI.LJLIL);
        if (z) {
            LJ(aid, "refresh");
        } else {
            LJ(aid, "load_more");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0116, code lost:
    
        if (r3 == true) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(java.lang.String r36, java.lang.String r37, boolean r38, java.util.List r39, java.util.List r40) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7H1.LJI(java.lang.String, java.lang.String, boolean, java.util.List, java.util.List):void");
    }

    public static void LJIIIZ(List awemes, boolean z, java.util.Map map, boolean z2, C7KB c7kb) {
        Boolean bool;
        InteractPermission interactPermission;
        o.LJIIIZ(awemes, "awemes");
        if (!C7HX.LIZ()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : awemes) {
            Aweme aweme = (Aweme) obj;
            o.LJIIIZ(aweme, "aweme");
            String aid = aweme.getAid();
            if (aid != null && aid.length() != 0 && (interactPermission = aweme.getInteractPermission()) != null && interactPermission.getUpvote() == 0 && !aweme.isSubOnlyVideo() && !C54838Lfe.LJJI(aweme)) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Aweme aweme2 = (Aweme) it.next();
            UpvotePreloadStruct upvotePreload = aweme2.getUpvotePreload();
            if (upvotePreload != null) {
                bool = Boolean.valueOf(upvotePreload.getNeedPullUpvoteInfo());
            } else {
                bool = null;
            }
            UpvoteReason upvoteReason = aweme2.getUpvoteReason();
            String aid2 = aweme2.getAid();
            o.LJIIIIZZ(aid2, "enableAweme.aid");
            String str = (String) ((LinkedHashMap) C7H2.LIZLLL).get(aid2);
            if (z || o.LJ(bool, Boolean.TRUE) || upvoteReason != null || (str != null && str.length() != 0)) {
                String aid3 = aweme2.getAid();
                o.LJIIIIZZ(aid3, "enableAweme.aid");
                arrayList.add(aid3);
                if (upvoteReason != null) {
                    arrayList2.add(upvoteReason);
                    String aid4 = aweme2.getAid();
                    o.LJIIIIZZ(aid4, "enableAweme.aid");
                    ((ConcurrentHashMap) C7H2.LIZ.getValue()).put(aid4, upvoteReason);
                }
                if (str != null && str.length() != 0) {
                    String aid5 = aweme2.getAid();
                    o.LJIIIIZZ(aid5, "enableAweme.aid");
                    linkedHashMap.put(aid5, str);
                }
            }
        }
        if (map != null && !map.isEmpty()) {
            o.LJIIIZ(map, "map");
            C7H2.LIZJ.putAll(map);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        LIZIZ(arrayList, arrayList2, map, linkedHashMap, z2, c7kb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(List list, List list2, java.util.Map map, java.util.Map map2, boolean z, C7KB c7kb) {
        String str;
        String str2;
        Integer num = null;
        if (map != null) {
            str = C75792yF.LIZJ(map);
        } else {
            str = null;
        }
        if (map2 != null) {
            str2 = C75792yF.LIZJ(map2);
        } else {
            str2 = null;
        }
        List LLJILJILJ = ORZ.LLJILJILJ(list);
        Boolean bool = (Boolean) a.LJFF().LJFF().getValue();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        UpvoteApi upvoteApi = UpvoteApi.LIZIZ;
        String LIZJ2 = C75792yF.LIZJ(list);
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(C75792yF.LIZJ(g0.LJJJJ((UpvoteReason) it.next())));
        }
        String abstractCollection = arrayList.toString();
        if (c7kb != null) {
            num = Integer.valueOf(c7kb.getValue());
        }
        o.LJIIIIZZ(LIZJ2, "toJson(itemIds)");
        C78999UzT.LJFF(upvoteApi.getUpvoteBatchList(LIZJ2, abstractCollection, num, str, str2, booleanValue).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS22S0110000_1(LLJILJILJ, z, 0), new AfS22S0110000_1(LLJILJILJ, z, 1)), (C73318Sq2) LIZJ.getValue());
    }

    public static void LIZJ(String str, UpvoteReason upvoteReason, long j, String insertRepostId, C7KB c7kb, C7H0 c7h0) {
        UpvoteReasonRequest upvoteReasonRequest;
        o.LJIIIZ(insertRepostId, "insertRepostId");
        UpvoteApi upvoteApi = UpvoteApi.LIZIZ;
        Integer num = null;
        if (upvoteReason != null) {
            upvoteReasonRequest = g0.LJJJJ(upvoteReason);
        } else {
            upvoteReasonRequest = null;
        }
        String LIZJ2 = C75792yF.LIZJ(upvoteReasonRequest);
        if (c7kb != null) {
            num = Integer.valueOf(c7kb.getValue());
        }
        C78999UzT.LJFF(upvoteApi.getUpvoteList(str, j, 20, insertRepostId, LIZJ2, num).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS1S1100100_3(j, c7h0, str, 2), new AfS18S1100000_3(j, c7h0, str, 6)), (C73318Sq2) LIZJ.getValue());
    }
}
