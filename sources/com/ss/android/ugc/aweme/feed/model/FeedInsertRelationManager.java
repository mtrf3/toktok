package com.ss.android.ugc.aweme.feed.model;

import X.C38350F3i;
import X.C75792yF;
import X.C78983UzD;
import X.EnumC57366MfK;
import X.ORZ;
import X.X1D;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedInsertRelationManager {
    public static final FeedInsertRelationManager INSTANCE = new FeedInsertRelationManager();
    public static final Map<String, InsertRelation> insertRelations = new LinkedHashMap();

    public final String consume() {
        return consume$default(this, false, 1, null);
    }

    public final String consume(boolean z) {
        Map<String, InsertRelation> map = insertRelations;
        List LLJILJILJ = ORZ.LLJILJILJ(map.values());
        if (z) {
            map.clear();
        }
        String LIZJ = C75792yF.LIZJ(LLJILJILJ);
        o.LJIIIIZZ(LIZJ, "toJson(copy)");
        return LIZJ;
    }

    public final int consume(String aid) {
        o.LJIIIZ(aid, "aid");
        Map<String, InsertRelation> map = insertRelations;
        InsertRelation insertRelation = map.get(aid);
        if (insertRelation != null) {
            int i = insertRelation.followStatus;
            map.clear();
            return i;
        }
        return 0;
    }

    public final void appendMobParam(List<FriendsFeed> list, String str) {
        String str2 = "unknown";
        if (list == null || str == null) {
            return;
        }
        try {
            for (InsertRelation insertRelation : C75792yF.LIZLLL(InsertRelation[].class, str)) {
                for (FriendsFeed friendsFeed : list) {
                    Aweme aweme = friendsFeed.getAweme();
                    if (aweme != null && o.LJ(aweme.aid, insertRelation.awemeId)) {
                        Aweme aweme2 = friendsFeed.getAweme();
                        if (aweme2 != null) {
                            aweme2.appendMobParam("scene_type", EnumC57366MfK.PUSH.getType());
                        }
                        Aweme aweme3 = friendsFeed.getAweme();
                        if (aweme3 != null) {
                            aweme3.appendMobParam("previous_page", EnumC57366MfK.PUSH.getType());
                        }
                    }
                }
            }
        } catch (s e) {
            C78983UzD.LJIIZILJ(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("appendMobParam for 2tab fail JsonSyntaxException: ");
            String message = e.getMessage();
            if (message != null) {
                str2 = message;
            }
            LIZ.append(str2);
            X1D.LIZIZ(LIZ);
        } catch (Exception e2) {
            C78983UzD.LJIIZILJ(e2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("appendMobParam for 2tab fail exception: ");
            String message2 = e2.getMessage();
            if (message2 != null) {
                str2 = message2;
            }
            LIZ2.append(str2);
            X1D.LIZIZ(LIZ2);
        }
    }

    public final void put(ArrayList<String> aids, String insertRelation) {
        o.LJIIIZ(aids, "aids");
        o.LJIIIZ(insertRelation, "insertRelation");
        Iterator<String> it = aids.iterator();
        while (it.hasNext()) {
            INSTANCE.put(it.next(), insertRelation);
        }
    }

    public final void appendMobParam(FeedItemList feedItemList, String str) {
        List<Aweme> list;
        String str2 = "unknown";
        if (str == null) {
            return;
        }
        try {
            for (InsertRelation insertRelation : C75792yF.LIZLLL(InsertRelation[].class, str)) {
                if (feedItemList != null && (list = feedItemList.items) != null) {
                    for (Aweme aweme : list) {
                        if (o.LJ(aweme.aid, insertRelation.awemeId)) {
                            EnumC57366MfK enumC57366MfK = EnumC57366MfK.PUSH;
                            aweme.appendMobParam("scene_type", enumC57366MfK.getType());
                            aweme.appendMobParam("previous_page", enumC57366MfK.getType());
                        }
                    }
                }
            }
        } catch (s e) {
            C78983UzD.LJIIZILJ(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("appendMobParam for FYP fail JsonSyntaxException: ");
            String message = e.getMessage();
            if (message != null) {
                str2 = message;
            }
            LIZ.append(str2);
            X1D.LIZIZ(LIZ);
        } catch (Exception e2) {
            C78983UzD.LJIIZILJ(e2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("appendMobParam for FYP fail exception: ");
            String message2 = e2.getMessage();
            if (message2 != null) {
                str2 = message2;
            }
            LIZ2.append(str2);
            X1D.LIZIZ(LIZ2);
        }
    }

    public final void put(String aid, String insertRelation) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(insertRelation, "insertRelation");
        Integer LJJIL = C38350F3i.LJJIL(insertRelation);
        if (LJJIL != null) {
            insertRelations.put(aid, new InsertRelation(aid, LJJIL.intValue()));
        }
    }

    public final Aweme appendMobParam(Aweme aweme, int i) {
        if (i == 3 && aweme != null) {
            aweme.appendMobParam("scene_type", EnumC57366MfK.PUSH.getType());
            aweme.appendMobParam("previous_page", EnumC57366MfK.PUSH.getType());
        }
        return aweme;
    }

    public static /* synthetic */ String consume$default(FeedInsertRelationManager feedInsertRelationManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return feedInsertRelationManager.consume(z);
    }
}
