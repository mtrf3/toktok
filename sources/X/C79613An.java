package X;

import Y.IDeS153S0200000_15;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.data.api.ActivityStatusAPI;
import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3An, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79613An implements InterfaceC116174hB {
    public final C3B2 LIZ;
    public final ActivityStatusConfig LIZIZ;
    public final InterfaceC70422pa LIZJ;
    public final ActivityStatusAPI LIZLLL;
    public final C36G LJ;
    public final C98453th LJFF;
    public final List<ActivityStatus> LJI;
    public final CopyOnWriteArrayList<C79683Au> LJII;
    public final C79573Aj LJIIIIZZ;
    public final MutableLiveData<List<C116144h8>> LJIIIZ;
    public final XLL LJIIJ;
    public XKQ LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;

    @Override // X.InterfaceC116174hB
    public final List<C116144h8> LIZIZ() {
        C79593Al LIZJ = LIZJ(true);
        C98453th c98453th = this.LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("currentMUFActivityStatus size ");
        LIZ.append(LIZJ.LJLIL.size());
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        return LIZJ.LJLIL;
    }

    public final void LJFF() {
        boolean LJFF = this.LIZ.getSettings().LJFF();
        boolean z = C84763XOl.LJIIJJI;
        C98453th c98453th = this.LJFF;
        StringBuilder LJI = JBR.LJI("initPolling isPrerequisiteMet ", LJFF, ", hasPollingStart ");
        LJI.append(this.LJIIL);
        LJI.append(" hasEnterInboxPageBefore ");
        LJI.append(this.LJIILIIL);
        LJI.append(" isBackground ");
        LJI.append(z);
        c98453th.LJFF(X1D.LIZIZ(LJI));
        if (!LJFF || !this.LJIILIIL || z) {
            return;
        }
        synchronized (this) {
            if (this.LJIIL) {
                return;
            }
            this.LJIIL = true;
            this.LJFF.LJFF("startPolling");
            XKQ xkq = this.LJIIJJI;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            this.LJIIJJI = XKX.LIZLLL(this.LIZJ, C78613UtF.LIZJ, null, new C79623Ao(this, null), 2);
        }
    }

    @Override // X.InterfaceC116174hB
    public final /* bridge */ /* synthetic */ MutableLiveData LIZ() {
        return this.LJIIIZ;
    }

    public final C79593Al LIZJ(boolean z) {
        ArrayList arrayList;
        int i;
        synchronized (this) {
            List<ActivityStatus> list = this.LJI;
            arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (OUP.LJJII((ActivityStatus) next, null, null, 3)) {
                    arrayList.add(next);
                }
            }
        }
        C98453th c98453th = this.LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assembleIMUserPowerItemSync activeMUFStatusList size ");
        LIZ.append(arrayList.size());
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            IMUser LJIIJ = C80533Eb.LJIIJ(((ActivityStatus) it2.next()).userID, null);
            if (LJIIJ != null) {
                arrayList2.add(new C116144h8(LJIIJ, true, 12));
            }
        }
        this.LJFF.LJI("assembleIMUserPowerItemSync", arrayList2, C79663As.LJLIL);
        int size = arrayList2.size();
        if (arrayList2.isEmpty()) {
            i = 0;
        } else {
            Iterator it3 = arrayList2.iterator();
            i = 0;
            while (it3.hasNext()) {
                if (((C116144h8) it3.next()).LJLIL.getFollowStatus() == 2 && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        int size2 = arrayList.size();
        this.LJFF.LJFF("assembleIMUserPowerItemSync size " + arrayList2.size());
        return new C79593Al(z, size, i, size2, ORZ.LLILLL(arrayList2, this.LIZIZ.num_of_inbox_sky_light_status_limit_count));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79613An.LIZLLL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC67352kd<? super X.C76800UCe> r21) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79613An.LJ(X.2kd):java.lang.Object");
    }

    public final void LJI(boolean z) {
        C98453th c98453th = this.LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopPolling clearDisplayList ");
        LIZ.append(z);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        XKQ xkq = this.LJIIJJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJIIJJI = null;
        this.LJIIL = false;
        if (z) {
            synchronized (this) {
                ((ArrayList) this.LJI).clear();
                Iterator<C79683Au> it = this.LJII.iterator();
                while (it.hasNext()) {
                    C79683Au next = it.next();
                    next.LIZIZ.removeObserver(next.LIZLLL);
                }
                this.LJII.clear();
            }
            boolean LIZIZ = this.LJIIJ.LIZIZ(Boolean.FALSE);
            C98453th c98453th2 = this.LJFF;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stopPolling isEmitSuccess ");
            LIZ2.append(LIZIZ);
            c98453th2.LJFF(X1D.LIZIZ(LIZ2));
        }
    }

    @QD3
    public final void onPrivacyUserSettingsChange(C79723Ay event) {
        boolean z;
        o.LJIIIZ(event, "event");
        Integer M = event.LJLIL.M("activity_status");
        if (M == null || M.intValue() != 1) {
            z = false;
        } else {
            z = true;
        }
        C98453th c98453th = this.LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPrivacyUserSettingsChange isSwitchOn ");
        LIZ.append(z);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        if (z) {
            LJFF();
        } else {
            LJI(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.3Ag] */
    public C79613An(C3B2 activityStatusModel, ActivityStatusConfig activityStatusConfig, InterfaceC70422pa scope, ActivityStatusAPI activityStatusApi, C36G c36g, C98453th logger) {
        o.LJIIIZ(activityStatusModel, "activityStatusModel");
        o.LJIIIZ(activityStatusConfig, "activityStatusConfig");
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(activityStatusApi, "activityStatusApi");
        o.LJIIIZ(logger, "logger");
        this.LIZ = activityStatusModel;
        this.LIZIZ = activityStatusConfig;
        this.LIZJ = scope;
        this.LIZLLL = activityStatusApi;
        this.LJ = c36g;
        this.LJFF = logger;
        this.LJI = new ArrayList();
        this.LJII = new CopyOnWriteArrayList<>();
        this.LJIIIIZZ = C79573Aj.LJLIL;
        this.LJIIIZ = new MutableLiveData<>();
        XLL LIZ = C79853Bl.LIZ(0, 1, null, 5);
        this.LJIIJ = LIZ;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJIILIIL = C79673At.LIZJ;
        V1M.LJJIJIIJIL(new IDeS153S0200000_15(V1M.LJIIJJI(V1M.LJJJLZIJ(LIZ, new C64442fw(new C79513Ad(this, null), null))), new C79583Ak(this, null), 0), scope);
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(C84763XOl.LJI(), null, null, new AqS167S0100000_1(this, 4), 3), c73318Sq2);
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(new LEA() { // from class: X.3Ae
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                C98453th c98453th = C79613An.this.LJFF;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("account change type ");
                LIZ2.append(i);
                LIZ2.append(" success ");
                LIZ2.append(z);
                c98453th.LJFF(X1D.LIZIZ(LIZ2));
                if (!z) {
                    return;
                }
                if (ORY.LJJIJIIJIL(Integer.valueOf(i), new Integer[]{3, 2})) {
                    C79613An.this.LJI(true);
                    C36G c36g2 = C79613An.this.LJ;
                    c36g2.getClass();
                    C34B.LJI("MUFActivityStatusSortingManager", "reset");
                    synchronized (c36g2) {
                        c36g2.LIZ = false;
                        c36g2.LIZIZ = null;
                    }
                    return;
                }
                if (i == 1) {
                    C79613An.this.LJFF();
                }
            }
        });
        C79673At.LIZIZ.add(new InterfaceC79693Av() { // from class: X.3Af
            @Override // X.InterfaceC79693Av
            public final void LIZ(boolean z) {
                C79613An c79613An = C79613An.this;
                c79613An.LJIILIIL |= z;
                C98453th c98453th = c79613An.LJFF;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onInboxVisibilityChange visible ");
                LIZ2.append(z);
                c98453th.LJFF(X1D.LIZIZ(LIZ2));
                C79613An c79613An2 = C79613An.this;
                c79613An2.LJFF.LJFF("switchToInbox");
                c79613An2.LJFF();
            }
        });
        activityStatusModel.LJII(new InterfaceC79563Ai() { // from class: X.3Ag
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
            
                if (r2 != (-1)) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
            
                if (r11 != (-1)) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
            
                r1 = r13.LIZ;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
            
                monitor-enter(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
            
                ((java.util.ArrayList) r1.LJI).clear();
                ((java.util.ArrayList) r1.LJI).addAll(r8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
            
                monitor-exit(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
            
                r2 = r13.LIZ.LJFF;
                r1 = new java.lang.StringBuilder("onActivityStatusUpdate new activity status size ");
                r8 = (java.util.ArrayList) r8;
                r1.append(r8.size());
                r2.LJFF(r1.toString());
                r5 = r13.LIZ.LJIIJ.LIZIZ(java.lang.Boolean.TRUE);
                r13.LIZ.LJFF.LJFF("onActivityStatusUpdate isNotifyEmitSuccess " + r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
            
                if (r8.isEmpty() == false) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x010b, code lost:
            
                r13.LIZ.LJFF.LJFF("hasNewlyUpdateActivityStatus " + r4 + " online count " + r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
            
                if (r4 == false) goto L81;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x012a, code lost:
            
                r1 = r13.LIZ;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0130, code lost:
            
                if (r3 >= r1.LIZIZ.mufLocalManageLimit) goto L82;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0132, code lost:
            
                r1.LJFF.LJFF("restart polling");
                r2 = X.C772831o.LIZ();
                kotlin.jvm.internal.o.LJIIIZ(r2, "onEventV3");
                r2.LIZIZ("as_muf_compensate", new java.util.LinkedHashMap());
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x014d, code lost:
            
                r1 = r8.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0155, code lost:
            
                if (r1.hasNext() == false) goto L76;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0161, code lost:
            
                if (X.OUP.LJJII((com.ss.android.ugc.aweme.im.service.model.ActivityStatus) r1.next(), null, null, 3) == false) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0163, code lost:
            
                r3 = r3 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
            
                if (r3 < 0) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
            
                X.C47261Igj.LJJJJIZL();
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x016b, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x00ba, code lost:
            
                r4 = false;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC79563Ai
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.List<com.ss.android.ugc.aweme.im.service.model.ActivityStatus> r14) {
                /*
                    Method dump skipped, instructions count: 367
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C79543Ag.LIZ(java.util.List):void");
            }
        });
        C42625Go9.LIZIZ(this);
        LJFF();
        logger.LJFF("init");
    }
}
