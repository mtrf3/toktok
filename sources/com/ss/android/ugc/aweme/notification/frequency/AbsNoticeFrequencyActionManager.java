package com.ss.android.ugc.aweme.notification.frequency;

import X.C16880lQ;
import X.HG3;
import X.InterfaceC65349Pkn;
import X.InterfaceC68924R3g;
import X.X1D;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeFrequencyControlConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class AbsNoticeFrequencyActionManager {
    public final InterfaceC68924R3g LIZ;
    public final String LIZIZ;
    public final LinkedHashMap<String, NoticeFrequencyControlConfig> LIZJ;
    public volatile boolean LIZLLL;

    public abstract void LIZ();

    public abstract int LIZIZ();

    public abstract String LIZLLL();

    public final Keva LIZJ() {
        String str;
        User curUser = HG3.LJIILL().getCurUser();
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        String LLLZ = C16880lQ.LLLZ(this.LIZIZ, Arrays.copyOf(new Object[]{str}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        Keva repo = Keva.getRepo(LLLZ);
        o.LJIIIIZZ(repo, "getRepo(repoName.format(uid))");
        return repo;
    }

    public AbsNoticeFrequencyActionManager(InterfaceC68924R3g executor) {
        o.LJIIIZ(executor, "executor");
        this.LIZ = executor;
        this.LIZIZ = "inbox_notice_frequency_%s";
        this.LIZJ = new LinkedHashMap<>();
    }

    /* loaded from: classes12.dex */
    public static final class FrequencyLocalEntry {

        @InterfaceC65349Pkn("config")
        public final NoticeFrequencyControlConfig config;

        @InterfaceC65349Pkn("nid")
        public final String nid;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrequencyLocalEntry)) {
                return false;
            }
            FrequencyLocalEntry frequencyLocalEntry = (FrequencyLocalEntry) obj;
            return o.LJ(this.nid, frequencyLocalEntry.nid) && o.LJ(this.config, frequencyLocalEntry.config);
        }

        public final int hashCode() {
            return this.config.hashCode() + (this.nid.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FrequencyLocalEntry(nid=");
            LIZ.append(this.nid);
            LIZ.append(", config=");
            LIZ.append(this.config);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public FrequencyLocalEntry(String nid, NoticeFrequencyControlConfig config) {
            o.LJIIIZ(nid, "nid");
            o.LJIIIZ(config, "config");
            this.nid = nid;
            this.config = config;
        }
    }
}
