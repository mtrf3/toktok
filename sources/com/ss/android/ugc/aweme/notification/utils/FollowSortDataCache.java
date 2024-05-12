package com.ss.android.ugc.aweme.notification.utils;

import X.AnonymousClass028;
import X.C141335gf;
import X.C16880lQ;
import X.C221018lt;
import X.C3C5;
import X.C56717MNt;
import X.C76800UCe;
import X.HG3;
import X.RBX;
import X.X1D;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import defpackage.b0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowSortDataCache {
    public static final LinkedHashMap<String, Integer> LIZ = new LinkedHashMap<>();
    public static final int LIZIZ = C56717MNt.LIZ().getExposedCount();
    public static final int LIZJ = C56717MNt.LIZ().getSaveMaxCount();

    /* loaded from: classes10.dex */
    public static final class NidCountEntry {
        public final int count;
        public final String nid;

        public static /* synthetic */ NidCountEntry copy$default(NidCountEntry nidCountEntry, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = nidCountEntry.nid;
            }
            if ((i2 & 2) != 0) {
                i = nidCountEntry.count;
            }
            return nidCountEntry.copy(str, i);
        }

        public final NidCountEntry copy(String nid, int i) {
            o.LJIIIZ(nid, "nid");
            return new NidCountEntry(nid, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NidCountEntry)) {
                return false;
            }
            NidCountEntry nidCountEntry = (NidCountEntry) obj;
            return o.LJ(this.nid, nidCountEntry.nid) && this.count == nidCountEntry.count;
        }

        public int hashCode() {
            return (this.nid.hashCode() * 31) + this.count;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NidCountEntry(nid=");
            LIZ.append(this.nid);
            LIZ.append(", count=");
            return b0.LIZJ(LIZ, this.count, ')', LIZ);
        }

        public NidCountEntry(String nid, int i) {
            o.LJIIIZ(nid, "nid");
            this.nid = nid;
            this.count = i;
        }
    }

    public static void LIZIZ() {
        String string;
        try {
            if (LIZ.isEmpty() && (string = LIZJ().getString("inbox_new_follower_expose", "")) != null && string.length() != 0) {
                List<NidCountEntry> data = JsonParseUtils.LIZIZ(NidCountEntry.class, string);
                o.LJIIIIZZ(data, "data");
                for (NidCountEntry nidCountEntry : data) {
                    LIZ.put(nidCountEntry.nid, Integer.valueOf(nidCountEntry.count));
                }
            }
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                C221018lt.LIZJ("InboxDataCache", "fillNidCountMap error", LJFF);
            }
        }
    }

    public static Keva LIZJ() {
        String str;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        String LLLZ = C16880lQ.LLLZ("inbox_new_follower_sort_%s", Arrays.copyOf(new Object[]{str}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        Keva repo = Keva.getRepo(LLLZ);
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME_FORMAT.format(uid))");
        return repo;
    }

    public static void LIZ(String str) {
        Object LIZ2;
        LinkedHashMap<String, Integer> linkedHashMap;
        int intValue;
        LIZIZ();
        try {
            linkedHashMap = LIZ;
            if (linkedHashMap.size() >= LIZJ && linkedHashMap.entrySet().iterator().hasNext()) {
                linkedHashMap.remove(linkedHashMap.entrySet().iterator().next().getKey());
            }
            Integer num = linkedHashMap.get(str);
            if (num == null) {
                num = 0;
            }
            o.LJIIIIZZ(num, "maps[nid] ?: 0");
            intValue = num.intValue();
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (intValue >= LIZIZ) {
            return;
        }
        linkedHashMap.put(str, Integer.valueOf(intValue + 1));
        LIZ2 = C76800UCe.LIZ;
        C3C5.m7constructorimpl(LIZ2);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("InboxDataCache", "addExposeCount error", m10exceptionOrNullimpl);
        }
    }
}
