package X;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.Condition;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeFrequencyControlConfig;
import com.ss.android.ugc.aweme.notification.frequency.AbsNoticeFrequencyActionManager;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.R3h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68925R3h implements InterfaceC68935R3r, InterfaceC68936R3s {
    public static final C68925R3h LIZ = new C68925R3h();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C68933R3p.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C69272nj.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C68928R3k.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C68927R3j.LJLIL);
    public static volatile boolean LJFF;

    public static java.util.Map LIZLLL() {
        return (java.util.Map) LJ.getValue();
    }

    public static final void LJ() {
        if (!LJFF) {
            C221018lt.LJFF("NoticeFrequencyManager", "startScroll");
            LJFF = true;
            for (Map.Entry entry : LIZLLL().entrySet()) {
                if (entry.getValue() instanceof InterfaceC68936R3s) {
                    C68926R3i c68926R3i = (C68926R3i) entry.getValue();
                    c68926R3i.LJFF = true;
                    HandlerC68929R3l handlerC68929R3l = c68926R3i.LJ;
                    if (handlerC68929R3l != null) {
                        handlerC68929R3l.removeMessages(1);
                    }
                }
            }
        }
    }

    public static final void LJFF() {
        if (LJFF) {
            C221018lt.LJFF("NoticeFrequencyManager", "stopScroll");
            LJFF = false;
            for (Map.Entry entry : LIZLLL().entrySet()) {
                if (entry.getValue() instanceof InterfaceC68936R3s) {
                    C68926R3i c68926R3i = (C68926R3i) entry.getValue();
                    c68926R3i.LJFF = false;
                    c68926R3i.LIZ(true);
                }
            }
        }
    }

    public static final void LIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("afterRefresh position: ");
        LIZ2.append(str);
        C221018lt.LJFF("NoticeFrequencyManager", X1D.LIZIZ(LIZ2));
        for (Map.Entry entry : LIZLLL().entrySet()) {
            if (entry.getValue() instanceof InterfaceC68935R3r) {
                entry.getValue().getClass();
            }
        }
    }

    public static final void LIZIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("enterPageAction position: ");
        LIZ2.append(str);
        C221018lt.LJFF("NoticeFrequencyManager", X1D.LIZIZ(LIZ2));
        for (Map.Entry entry : LIZLLL().entrySet()) {
            if (entry.getValue() instanceof InterfaceC68935R3r) {
                C68926R3i c68926R3i = (C68926R3i) entry.getValue();
                c68926R3i.getClass();
                c68926R3i.LJI = str;
                HandlerThread handlerThread = new HandlerThread("ReportThread");
                c68926R3i.LIZLLL = handlerThread;
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                o.LJIIIIZZ(looper, "it.looper");
                c68926R3i.LJ = new HandlerC68929R3l(looper, new AqS161S0100000_11(c68926R3i, 51));
            }
        }
    }

    public static final void LIZJ(String str) {
        Object LIZ2;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("exitPageAction position: ");
        LIZ3.append(str);
        C221018lt.LJFF("NoticeFrequencyManager", X1D.LIZIZ(LIZ3));
        for (Map.Entry entry : LIZLLL().entrySet()) {
            if (entry.getValue() instanceof InterfaceC68935R3r) {
                C68926R3i c68926R3i = (C68926R3i) entry.getValue();
                c68926R3i.getClass();
                c68926R3i.LIZ(true);
                HandlerThread handlerThread = c68926R3i.LIZLLL;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                c68926R3i.LIZLLL = null;
                c68926R3i.LJ = null;
            }
        }
        Iterator it = ((java.util.Map) LIZLLL.getValue()).entrySet().iterator();
        while (it.hasNext()) {
            AbsNoticeFrequencyActionManager absNoticeFrequencyActionManager = (AbsNoticeFrequencyActionManager) ((Map.Entry) it.next()).getValue();
            absNoticeFrequencyActionManager.getClass();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("NoticeFrequencyManager(");
            absNoticeFrequencyActionManager.LIZ();
            LIZ4.append("Read");
            LIZ4.append(')');
            C221018lt.LJFF(X1D.LIZIZ(LIZ4), "clearCache Frequency");
            try {
                Keva LIZJ2 = absNoticeFrequencyActionManager.LIZJ();
                if (!absNoticeFrequencyActionManager.LIZJ.isEmpty()) {
                    String LIZLLL2 = absNoticeFrequencyActionManager.LIZLLL();
                    LinkedHashMap<String, NoticeFrequencyControlConfig> linkedHashMap = absNoticeFrequencyActionManager.LIZJ;
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry<String, NoticeFrequencyControlConfig> entry2 : linkedHashMap.entrySet()) {
                        arrayList.add(new AbsNoticeFrequencyActionManager.FrequencyLocalEntry(entry2.getKey(), entry2.getValue()));
                    }
                    LIZJ2.storeString(LIZLLL2, JsonParseUtils.LIZLLL(arrayList));
                }
                absNoticeFrequencyActionManager.LIZJ.clear();
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
            if (m10exceptionOrNullimpl != null) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("NoticeFrequencyManager(");
                absNoticeFrequencyActionManager.LIZ();
                LIZ5.append("Read");
                LIZ5.append(')');
                C221018lt.LIZJ(X1D.LIZIZ(LIZ5), "storeNidCountMap error", m10exceptionOrNullimpl);
            }
            absNoticeFrequencyActionManager.LIZLLL = false;
        }
    }

    public static void LJI(BaseNotice baseNotice) {
        List<NoticeFrequencyControlConfig> list;
        NoticeFrequencyControlConfig noticeFrequencyControlConfig;
        AbsNoticeFrequencyActionManager absNoticeFrequencyActionManager;
        NoticeFrequencyControlConfig noticeFrequencyControlConfig2;
        if (baseNotice == null || (list = baseNotice.noticeFrequencyList) == null || list.isEmpty() || ((java.util.Map) LIZLLL.getValue()).get(2) == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("triggerFrequencyAction Action: ");
        LIZ2.append(2);
        C221018lt.LJFF("NoticeFrequencyManager", X1D.LIZIZ(LIZ2));
        List<NoticeFrequencyControlConfig> list2 = baseNotice.noticeFrequencyList;
        o.LJIIIIZZ(list2, "it.noticeFrequencyList");
        Iterator<NoticeFrequencyControlConfig> it = list2.iterator();
        do {
            noticeFrequencyControlConfig = null;
            if (!it.hasNext()) {
                break;
            } else {
                noticeFrequencyControlConfig = it.next();
            }
        } while (noticeFrequencyControlConfig.userAction != 2);
        NoticeFrequencyControlConfig noticeFrequencyControlConfig3 = noticeFrequencyControlConfig;
        if (noticeFrequencyControlConfig3 == null || (absNoticeFrequencyActionManager = (AbsNoticeFrequencyActionManager) ((java.util.Map) LIZLLL.getValue()).get(2)) == null) {
            return;
        }
        String str = baseNotice.nid;
        o.LJIIIIZZ(str, "notice.nid");
        if (!absNoticeFrequencyActionManager.LIZLLL) {
            try {
                if (absNoticeFrequencyActionManager.LIZJ.isEmpty()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("NoticeFrequencyManager(");
                    absNoticeFrequencyActionManager.LIZ();
                    LIZ3.append("Read");
                    LIZ3.append(')');
                    String LIZIZ2 = X1D.LIZIZ(LIZ3);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("initFrequencyMap From: ");
                    LIZ4.append(absNoticeFrequencyActionManager.LIZLLL());
                    C221018lt.LJFF(LIZIZ2, X1D.LIZIZ(LIZ4));
                    String string = absNoticeFrequencyActionManager.LIZJ().getString(absNoticeFrequencyActionManager.LIZLLL(), "");
                    if (string != null && string.length() != 0) {
                        List<AbsNoticeFrequencyActionManager.FrequencyLocalEntry> data = JsonParseUtils.LIZIZ(AbsNoticeFrequencyActionManager.FrequencyLocalEntry.class, string);
                        o.LJIIIIZZ(data, "data");
                        for (AbsNoticeFrequencyActionManager.FrequencyLocalEntry frequencyLocalEntry : data) {
                            String str2 = frequencyLocalEntry.nid;
                            if (str2 != null && (noticeFrequencyControlConfig2 = frequencyLocalEntry.config) != null) {
                                absNoticeFrequencyActionManager.LIZJ.put(str2, noticeFrequencyControlConfig2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Throwable LJFF2 = AnonymousClass028.LJFF(th);
                if (LJFF2 != null) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("NoticeFrequencyManager(");
                    absNoticeFrequencyActionManager.LIZ();
                    LIZ5.append("Read");
                    LIZ5.append(')');
                    C221018lt.LIZJ(X1D.LIZIZ(LIZ5), "Init Local FrequencyMap error", LJFF2);
                }
            }
            absNoticeFrequencyActionManager.LIZLLL = true;
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("NoticeFrequencyManager(");
        absNoticeFrequencyActionManager.LIZ();
        LIZ6.append("Read");
        LIZ6.append(')');
        String LIZIZ3 = X1D.LIZIZ(LIZ6);
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("registerNotice + ");
        LIZ7.append(str);
        C221018lt.LIZ(LIZIZ3, X1D.LIZIZ(LIZ7));
        NoticeFrequencyControlConfig noticeFrequencyControlConfig4 = absNoticeFrequencyActionManager.LIZJ.get(str);
        LinkedHashMap<String, NoticeFrequencyControlConfig> linkedHashMap = absNoticeFrequencyActionManager.LIZJ;
        if (linkedHashMap.size() >= absNoticeFrequencyActionManager.LIZIZ() && linkedHashMap.entrySet().iterator().hasNext() && noticeFrequencyControlConfig4 == null) {
            linkedHashMap.remove(linkedHashMap.entrySet().iterator().next().getKey());
        }
        LinkedHashMap<String, NoticeFrequencyControlConfig> linkedHashMap2 = absNoticeFrequencyActionManager.LIZJ;
        if (noticeFrequencyControlConfig4 != null) {
            noticeFrequencyControlConfig3.condition.LJLIL = noticeFrequencyControlConfig4.condition.LJLIL;
        }
        linkedHashMap2.put(str, noticeFrequencyControlConfig3);
        NoticeFrequencyControlConfig noticeFrequencyControlConfig5 = absNoticeFrequencyActionManager.LIZJ.get(baseNotice.nid);
        if (noticeFrequencyControlConfig5 == null) {
            return;
        }
        Condition condition = noticeFrequencyControlConfig5.condition;
        int i = condition.LJLIL + 1;
        condition.LJLIL = i;
        if (i < condition.threshold) {
            return;
        }
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("NoticeFrequencyManager(");
        absNoticeFrequencyActionManager.LIZ();
        LIZ8.append("Read");
        LIZ8.append(')');
        String LIZIZ4 = X1D.LIZIZ(LIZ8);
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append("executeNoticeBehavior  behavior: ");
        LIZ9.append(noticeFrequencyControlConfig5.behavior.action);
        C221018lt.LJFF(LIZIZ4, X1D.LIZIZ(LIZ9));
        absNoticeFrequencyActionManager.LIZ.LIZ(baseNotice, noticeFrequencyControlConfig5);
    }
}
