package com.ss.android.ugc.aweme.inbox.cache;

import X.C0RN;
import X.C141335gf;
import X.C16880lQ;
import X.C221018lt;
import X.C35593Dy1;
import X.C36089EEj;
import X.C36093EEn;
import X.C3C5;
import X.C53432Ky4;
import X.C73318Sq2;
import X.C76800UCe;
import X.EE1;
import X.EEZ;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.MMI;
import X.MS5;
import X.X1D;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PreloadManager {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicReference<NoticeList> LIZJ = new AtomicReference<>(null);
    public static final C73318Sq2 LIZLLL = new C73318Sq2();
    public static final Handler LJ = new Handler(C16880lQ.LLJJJJ());
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final long LJI = ((Configuration) C35593Dy1.LIZIZ.getValue()).getBootFinishDelayTime();

    public static boolean LIZ() {
        boolean z = LIZIZ.get();
        if (z) {
            try {
                LIZLLL.LIZLLL();
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return z;
    }

    /* loaded from: classes7.dex */
    public static final class CachePreloadTask implements EE1 {
        public final NoticeList LJLIL;

        @Override // X.EEY
        public final String key() {
            return "PreloadManager$CachePreloadTask";
        }

        @Override // X.EEY
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.EEY
        public final /* synthetic */ String prefix() {
            return "task_";
        }

        @Override // X.EE1
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.EEY
        public final /* synthetic */ int targetProcess() {
            return C0RN.LIZ();
        }

        @Override // X.EEY
        public final /* synthetic */ List triggerOtherLegoComponents() {
            return null;
        }

        @Override // X.EEY
        public final /* synthetic */ EnumC36103EEx triggerType() {
            return C0RN.LIZIZ(this);
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }

        public CachePreloadTask(NoticeList noticeList) {
            this.LJLIL = noticeList;
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
            PreloadManager.LIZIZ(this.LJLIL);
        }
    }

    public static void LIZIZ(NoticeList noticeList) {
        if (!LJFF.get()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("boot finish has not exceeded ");
            LIZ2.append(LJI);
            LIZ2.append(" ms");
            C221018lt.LJFF("PreloadManager", X1D.LIZIZ(LIZ2));
            return;
        }
        MS5.LIZ(new AqS159S0100000_9(noticeList, 277));
    }

    public static final synchronized void LIZJ(NoticeList noticeList, int i) {
        synchronized (PreloadManager.class) {
            if (i == 1) {
                MMI.NOTICE_COUNT_TIMESTAMP.trackTime();
            }
            if (!C53432Ky4.LJ()) {
                C221018lt.LJFF("PreloadManager", "PreloadExperiment no hit, return");
                return;
            }
            if (i != 1) {
                if (i == 2) {
                    C221018lt.LJFF("PreloadManager", "PreloadManager#receive keep-alive");
                    if (!LIZ.get()) {
                        C221018lt.LJFF("PreloadManager", "not click inbox tab, receive notice count from keep-alive");
                        LIZJ.set(noticeList);
                    }
                }
            } else {
                C221018lt.LJFF("PreloadManager", "requestCacheIfNeed Start_UP");
                C36093EEn.LIZ.getClass();
                if (EEZ.LIZIZ() && LJFF.get()) {
                    C221018lt.LJFF("PreloadManager", "boot finish , request right now");
                    LIZIZ(noticeList);
                } else {
                    C221018lt.LJFF("PreloadManager", "boot finish not finished , request in future");
                    C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                    LJIIIZ.LIZIZ(new CachePreloadTask(noticeList), true);
                    LJIIIZ.LIZJ();
                }
            }
        }
    }
}
