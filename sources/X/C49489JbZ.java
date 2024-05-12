package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JbZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49489JbZ {
    public static final C49489JbZ LIZ = new C49489JbZ();
    public static final Gson LIZIZ = new Gson();

    public static String LIZLLL(List list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme = (Aweme) obj;
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(aweme.getAid());
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply {\n…   }\n        }.toString()");
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(Aweme aweme, JL9 jl9, EnterRoomConfig enterRoomConfig, InterfaceC50036JkO interfaceC50036JkO) {
        JQA jqa;
        EnterRoomConfig.RoomsData roomsData;
        String str;
        String str2;
        String str3;
        long j;
        if (jl9 == null || (jqa = jl9.LIZIZ) == null) {
            return;
        }
        boolean z = false;
        if (jqa.LJ.length() <= 0 || 1 == 0 || (roomsData = enterRoomConfig.mRoomsData) == null || (str = roomsData.enterFromMerge) == null || str.length() <= 0) {
            return;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        String str4 = jqa.LJ;
        long j2 = jl9.LIZLLL;
        List<? extends Aweme> list = jl9.LIZJ;
        if (list == null || list.isEmpty()) {
            str2 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Aweme> it = list.iterator();
            while (it.hasNext()) {
                User author = it.next().getAuthor();
                if (author != null) {
                    j = C78934UyQ.LJIILJJIL(author);
                } else {
                    j = 0;
                }
                arrayList.add(Long.valueOf(j));
            }
            str2 = ORZ.LLD(arrayList, ",", null, null, null, 62);
        }
        String str5 = jqa.LJFF;
        String str6 = jqa.LJII;
        SearchCardInfo searchCardInfo = jl9.LIZ;
        if (searchCardInfo == null || (str3 = searchCardInfo.alasrc) == null || str3.length() == 0) {
            z = true;
        }
        LiveOuterService.LJJJLL().LJIILL().LIZJ(LJIIIIZZ, enterRoomConfig, aweme, jl9.LIZJ, new C50032JkK(str4, j2, str2, str5, str6, interfaceC50036JkO, Boolean.valueOf(z), null), null);
    }

    public static void LIZ(long j, Context context, EnterRoomConfig config, String enterFrom, ArrayList arrayList, List list) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (Z9N.LIZIZ.LJJIJLIJ(enterFrom)) {
            C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
            java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("is_search_scene", "1"));
            c50654JuM.getClass();
            C50654JuM.LIZJ(LJJIIZI, true);
        }
        if (!((RBX) HG3.LJIILL()).isLogin() && C84763XOl.LJIIIIZZ() != null) {
            InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
            C78450Uqc c78450Uqc = new C78450Uqc();
            Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
            o.LJI(LJIIIIZZ2);
            c78450Uqc.LIZ = LJIIIIZZ2;
            c78450Uqc.LJ = new C49490Jba(context, j, config, arrayList, list);
            C40925G4j.LIZ(c78450Uqc, LJIIIIZZ);
        }
        LJ(j, context, config, enterFrom, arrayList, list);
    }

    public static void LIZIZ(Aweme currentRoom, JL9 jl9, InterfaceC50036JkO interfaceC50036JkO, EnterRoomConfig enterRoomConfig, String str, Context context) {
        long j;
        JQA jqa;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        InterfaceC28737BPp LJJJJZ;
        String str10;
        C50469JrN searchVideoModel;
        String groupId;
        C50433Jqn searchCommonModel;
        String enterFrom;
        o.LJIIIZ(currentRoom, "currentRoom");
        User author = currentRoom.getAuthor();
        if (author != null) {
            j = C78934UyQ.LJIILJJIL(author);
        } else {
            j = 0;
        }
        String str11 = null;
        if (jl9 != null) {
            jqa = jl9.LIZIZ;
        } else {
            jqa = null;
        }
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        if (jqa != null) {
            str2 = jqa.LJII;
        } else {
            str2 = null;
        }
        logData.search_id = str2;
        if (jqa != null) {
            str3 = jqa.LJ;
        } else {
            str3 = null;
        }
        logData.search_keyword = str3;
        if (jqa != null) {
            str4 = jqa.LIZJ;
        } else {
            str4 = null;
        }
        logData.search_type = str4;
        if (jqa != null) {
            str5 = jqa.LJIILJJIL;
        } else {
            str5 = null;
        }
        logData.search_result_id = str5;
        if (jqa != null) {
            str6 = jqa.LJII;
        } else {
            str6 = null;
        }
        logData.requestId = str6;
        if (author != null) {
            str7 = author.getUid();
        } else {
            str7 = null;
        }
        logData.anchorId = str7;
        enterRoomConfig.mLogData.list_item_id = String.valueOf(j);
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterMethod = "live_cell";
        if (jqa != null) {
            str8 = jqa.LJFF;
        } else {
            str8 = null;
        }
        roomsData.enterFromMerge = str8;
        C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
        ArrayMap arrayMap = new ArrayMap();
        if (C78685UuP.LJJJZ(enterRoomConfig.mLogData.search_id)) {
            arrayMap.put("search_id", enterRoomConfig.mLogData.search_id);
        }
        if (C78685UuP.LJJJZ(enterRoomConfig.mLogData.search_result_id)) {
            arrayMap.put("search_result_id", enterRoomConfig.mLogData.search_result_id);
        }
        C50652JuK.Companion.getClass();
        C50650JuI LIZJ = C50651JuJ.LIZJ();
        if (LIZJ != null && (searchCommonModel = LIZJ.getSearchCommonModel()) != null && (enterFrom = searchCommonModel.getEnterFrom()) != null) {
            arrayMap.put("search_entrance", enterFrom);
        }
        arrayMap.put("list_item_id", enterRoomConfig.mLogData.list_item_id);
        if (jqa != null) {
            str9 = jqa.LIZJ;
        } else {
            str9 = null;
        }
        String str12 = "";
        if (str9 == null) {
            str9 = "";
        }
        arrayMap.put("search_type", str9);
        arrayMap.put("is_search_scene", "1");
        C50650JuI LJII = C50651JuJ.LJII(C45804HyK.LJJIFFI(context));
        if (LJII != null && (searchVideoModel = LJII.getSearchVideoModel()) != null && (groupId = searchVideoModel.getGroupId()) != null) {
            str12 = groupId;
        }
        arrayMap.put("last_from_group_id", str12);
        c50654JuM.getClass();
        C50654JuM.LIZJ(arrayMap, false);
        enterRoomConfig.mRoomsData.followStatus = String.valueOf(C54740Le4.LIZIZ(author));
        LiveRoomStruct newLiveRoomData = currentRoom.getNewLiveRoomData();
        if (newLiveRoomData == null) {
            RoomFeedCellStruct roomFeedCellStruct = currentRoom.getRoomFeedCellStruct();
            if (roomFeedCellStruct != null) {
                newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData();
            } else {
                newLiveRoomData = null;
            }
        }
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        if (LJJIJIL != null && (LJJJJZ = LJJIJIL.LJJJJZ(str)) != null && !TextUtils.isEmpty(LJJJJZ.LJJIJ())) {
            String LJJIJ = LJJJJZ.LJJIJ();
            if (newLiveRoomData != null) {
                str10 = newLiveRoomData.getMultiStreamData();
            } else {
                str10 = null;
            }
            if (o.LJ(LJJIJ, str10) && LJJJJZ.isPlaying()) {
                LJJJJZ.LJIIIZ(false);
                EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
                if (newLiveRoomData != null) {
                    str11 = newLiveRoomData.getMultiStreamData();
                }
                streamData.sharePullStreamData = str11;
                enterRoomConfig.mRoomsData.warmUpPlayerTag = str;
            }
        }
        LIZJ(currentRoom, jl9, enterRoomConfig, interfaceC50036JkO);
    }

    public static void LJ(long j, Context context, EnterRoomConfig enterRoomConfig, String str, ArrayList arrayList, List list) {
        Context context2;
        C78461Uqn LJIILL = LiveOuterService.LJJJLL().LJIILL();
        String str2 = null;
        if (context != null) {
            context2 = C16880lQ.LLLLL(context);
        } else {
            context2 = null;
        }
        if (list != null) {
            try {
                str2 = GsonProtectorUtils.toJson(LIZIZ, list);
                o.LJIIIIZZ(str2, "{\n            GSON.toJson(this)\n        }");
            } catch (n unused) {
                str2 = "";
            }
        }
        LJIILL.LJIILIIL(context2, j, enterRoomConfig, str, arrayList, str2);
    }
}
