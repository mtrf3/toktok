package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityPod;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxNoticePreviewWindowResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.MMg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56678MMg {
    public static final C56678MMg LIZ = new C56678MMg();
    public static final long LIZIZ;
    public static final long LIZJ;
    public static volatile C56680MMi LIZLLL;

    public static InboxNoticePreviewWindowResponse LJI() {
        Object LIZ2;
        InboxNoticePreviewWindowResponse inboxNoticePreviewWindowResponse;
        try {
            inboxNoticePreviewWindowResponse = LJ().LIZJ;
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (inboxNoticePreviewWindowResponse != null) {
            return inboxNoticePreviewWindowResponse;
        }
        String string = LJII().getString("preview_window_response", "");
        if (string != null && string.length() != 0) {
            InboxNoticePreviewWindowResponse inboxNoticePreviewWindowResponse2 = (InboxNoticePreviewWindowResponse) JsonParseUtils.LIZJ(InboxNoticePreviewWindowResponse.class, string);
            if (System.currentTimeMillis() - inboxNoticePreviewWindowResponse2.getCreateTime() < LIZIZ) {
                return inboxNoticePreviewWindowResponse2;
            }
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
            if (m10exceptionOrNullimpl != null) {
                C221018lt.LIZJ("InboxDataCache", "getPreviewWindowResponse error", m10exceptionOrNullimpl);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        long j;
        if (C53432Ky4.LIZ() == 2) {
            j = 86400000;
        } else {
            j = 604800000;
        }
        LIZIZ = j;
        LIZJ = 21600000L;
        LIZLLL = new C56680MMi(((RBX) HG3.LJIILL()).getCurUserId(), null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 126);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C56680MMi LJ() {
        if (!o.LJ(LIZLLL.LIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
            LIZLLL = new C56680MMi(((RBX) HG3.LJIILL()).getCurUserId(), null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 126);
        }
        return LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:6:0x000a, B:9:0x0013, B:11:0x0029, B:17:0x0036, B:19:0x005d, B:22:0x0067), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJFF() {
        /*
            java.lang.String r7 = "InboxDataCache"
            boolean r0 = X.C53364Kwy.LIZ()
            r10 = 0
            if (r0 != 0) goto La
            return r10
        La:
            X.MMi r0 = LJ()     // Catch: java.lang.Throwable -> L6e
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell> r0 = r0.LJI     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L13
            return r0
        L13:
            com.bytedance.keva.Keva r4 = LJII()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "inbox_entrance_list_data"
            java.lang.String r0 = ""
            java.lang.String r3 = r4.getString(r1, r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = "inbox_entrance_list_data_time"
            r1 = 0
            long r5 = r4.getLong(r0, r1)     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L32
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L30
            goto L32
        L30:
            r0 = 0
            goto L33
        L32:
            r0 = 1
        L33:
            if (r0 == 0) goto L36
            return r10
        L36:
            java.lang.Class<com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell> r0 = com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell.class
            java.util.List r9 = com.ss.android.ugc.aweme.utils.JsonParseUtils.LIZIZ(r0, r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.StringBuilder r8 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = "getInboxEntranceCellList maxAge="
            r8.append(r0)     // Catch: java.lang.Throwable -> L6e
            long r3 = X.C56678MMg.LIZIZ     // Catch: java.lang.Throwable -> L6e
            r8.append(r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = ",localTime ="
            r8.append(r0)     // Catch: java.lang.Throwable -> L6e
            r8.append(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = X.X1D.LIZIZ(r8)     // Catch: java.lang.Throwable -> L6e
            X.C221018lt.LJFF(r7, r0)     // Catch: java.lang.Throwable -> L6e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L6d
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6e
            long r1 = r1 - r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L67
            goto L6d
        L67:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L6e
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L6e
            goto L76
        L6d:
            return r9
        L6e:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L76:
            java.lang.Throwable r1 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r1 == 0) goto L81
            java.lang.String r0 = "getInboxEntranceCellList error"
            X.C221018lt.LIZJ(r7, r0, r1)
        L81:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56678MMg.LJFF():java.util.List");
    }

    public static void LIZJ() {
        Object LIZ2;
        try {
            LIZLLL = C56680MMi.LIZ(LJ(), null);
            LJII().erase("inbox_entrance_list_data");
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("InboxDataCache", "clearInboxEntrance error", m10exceptionOrNullimpl);
        }
    }

    public static Keva LJII() {
        String str;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        String LLLZ = C16880lQ.LLLZ("inbox_data_%s_repo_v2", Arrays.copyOf(new Object[]{str}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        Keva repo = Keva.getRepo(LLLZ);
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME_FORMAT.format(uid))");
        return repo;
    }

    public static SkylightDataResponse LJIIIIZZ() {
        if (!C53345Kwf.LIZ() && !L2P.LIZ()) {
            return null;
        }
        try {
            String string = LJII().getString("inbox_skylight_data", "");
            if (string != null && string.length() != 0) {
                return (SkylightDataResponse) JsonParseUtils.LIZJ(SkylightDataResponse.class, string);
            }
            return null;
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                C221018lt.LIZJ("InboxDataCache", "getSkylightData error", LJFF);
            }
            return null;
        }
    }

    public static long LJIIIZ() {
        Object LIZ2;
        long j;
        if (!C53345Kwf.LIZ() && !L2P.LIZ()) {
            return -1L;
        }
        try {
            j = LJII().getLong("inbox_skylight_data_time", 0L);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (System.currentTimeMillis() - j < LIZJ) {
            return j;
        }
        LIZ2 = C76800UCe.LIZ;
        C3C5.m7constructorimpl(LIZ2);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("InboxDataCache", "getSkylightDataSaveTime error", m10exceptionOrNullimpl);
        }
        return -1L;
    }

    public static void LJIIJJI() {
        Keva LJII = LJII();
        java.util.Map<String, ?> all = LJII.getAll();
        if (all != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                o.LJIIIIZZ(key, "it.key");
                if (ujb.o.LJJJLIIL(key, "key_live_notice_status_", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                LJII.storeInt((String) ((Map.Entry) it.next()).getKey(), 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        Keva LJII = LJII();
        long LJFF = EF7.LJFF();
        String LIZIZ2 = C85999Xp5.LIZIZ();
        if (LIZIZ2 == null) {
            LIZIZ2 = "";
        }
        long j = LJII.getLong("version", 0L);
        String string = LJII.getString("language", "");
        StringBuilder LIZJ2 = V10.LIZJ("repoVersion = ", j, ",curVersion= ");
        C65232Piu.LIZLLL(LIZJ2, LJFF, ",curLanguage= ", LIZIZ2);
        LIZJ2.append(",repoLanguage =");
        LIZJ2.append(string);
        C221018lt.LJFF("InboxDataCache", X1D.LIZIZ(LIZJ2));
        if (j <= 0 || LJFF != j || !o.LJ(LIZIZ2, string)) {
            LIZLLL = new C56680MMi(((RBX) HG3.LJIILL()).getCurUserId(), null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 126);
            C221018lt.LJFF("InboxDataCache", "checkRepoState clearData()");
            LIZIZ(this);
            LJII.storeLong("version", LJFF);
            LJII.storeString("language", LIZIZ2);
        }
    }

    public final void LJIIJ() {
        LIZ();
        if (!((RBX) HG3.LJIILL()).isLogin() || LJ().LJFF) {
            return;
        }
        C221018lt.LJFF("InboxDataCache", "loadBuffer");
        LIZLLL = new C56680MMi(((RBX) HG3.LJIILL()).getCurUserId(), LJI(), LIZLLL(EnumC56696MMy.FOLLOWER), true, LJFF(), 8);
    }

    public static void LIZIZ(C56678MMg c56678MMg) {
        c56678MMg.getClass();
        Keva LJII = LJII();
        java.util.Map<String, ?> all = LJII.getAll();
        o.LJIIIIZZ(all, "repo.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            entry.getValue();
            if (!C47261Igj.LJJIJIIJI("last_visit_activity_subpage", "last_visit_follower_subpage").contains(key)) {
                LJII.erase(key);
            }
        }
    }

    public static ActivityPod LIZLLL(EnumC56696MMy type) {
        Object LIZ2;
        ActivityPod activityPod;
        o.LJIIIZ(type, "type");
        try {
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (type == EnumC56696MMy.FOLLOWER && (activityPod = LJ().LJ) != null) {
            return activityPod;
        }
        String string = LJII().getString(type.name(), "");
        if (string != null && string.length() != 0) {
            ActivityPod activityPod2 = (ActivityPod) JsonParseUtils.LIZJ(ActivityPod.class, string);
            if (System.currentTimeMillis() - activityPod2.cacheTime < LIZIZ) {
                return activityPod2;
            }
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
            if (m10exceptionOrNullimpl != null) {
                C221018lt.LIZJ("InboxDataCache", "getActivityCacheData error", m10exceptionOrNullimpl);
            }
            return null;
        }
        return null;
    }

    public static void LJIIL(ActivityPod activityPod) {
        Object LIZ2;
        try {
            if (activityPod.dataType == EnumC56696MMy.FOLLOWER) {
                LJ().LJ = activityPod;
            }
            LJII().storeString(activityPod.dataType.name(), JsonParseUtils.LIZLLL(activityPod));
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("InboxDataCache", "storeActivityCacheData error", m10exceptionOrNullimpl);
        }
    }

    public static void LJIILIIL(List list) {
        Object LIZ2;
        try {
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (list == null) {
            C221018lt.LJFF("InboxDataCache", "data == null, storeInboxEntranceCellList return ");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(InboxEntranceCell.copy$default((InboxEntranceCell) it.next(), 0, 0, 0, null, 0L, false, false, 0, 0, 0, null, null, 0, null, null, 16383, null));
        }
        LIZLLL = C56680MMi.LIZ(LJ(), arrayList);
        Keva LJII = LJII();
        LJII.storeString("inbox_entrance_list_data", JsonParseUtils.LIZLLL(arrayList));
        LJII.storeLong("inbox_entrance_list_data_time", System.currentTimeMillis());
        LIZ2 = C76800UCe.LIZ;
        C3C5.m7constructorimpl(LIZ2);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("InboxDataCache", "storeInboxEntranceCellList error", m10exceptionOrNullimpl);
        }
    }

    public static void LJIILJJIL(Long l) {
        Object LIZ2;
        if (C53432Ky4.LJ() && l != null) {
            try {
                LJII().storeLong("inbox_entrance_list_data_time_server", l.longValue());
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
            if (m10exceptionOrNullimpl != null) {
                C221018lt.LIZJ("InboxDataCache", "saveInboxEntranceCellServerTime error", m10exceptionOrNullimpl);
            }
            C3C5.m6boximpl(LIZ2);
        }
    }
}
