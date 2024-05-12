package X;

import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Zhj, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90639Zhj implements InterfaceC90219Zax {
    public static final /* synthetic */ int LJIIJ = 0;
    public final C90827Zkl LIZJ;
    public final C90647Zhr LIZLLL;
    public final C90120ZYm LJ;
    public InterfaceC90656Zi0 LJFF;
    public final List<InterfaceC90123ZYp> LJI = new CopyOnWriteArrayList();
    public final List<AbstractC90122ZYo> LJII = new CopyOnWriteArrayList();
    public final java.util.Map<InterfaceC90124ZYq, C90130ZYw> LJIIIIZZ = new ConcurrentHashMap();
    public final java.util.Map<Long, C90130ZYw> LJIIIZ = new ConcurrentHashMap();
    public final Object LIZ = new Object();
    public final Handler LIZIZ = new HandlerC90301ZcH(C16880lQ.LLJJJJ());

    public final boolean LJJIII() {
        return this.LJFF != null;
    }

    public static AbstractC67744QiK LJIJJLI() {
        C90873ZlV c90873ZlV = new C90873ZlV();
        c90873ZlV.LIZ(new C90872ZlU(new Status(17, null, null)));
        return c90873ZlV;
    }

    public final long LIZJ() {
        long LJIILL;
        synchronized (this.LIZ) {
            QH7.LJ("Must be called from the main thread.");
            LJIILL = this.LIZJ.LJIILL();
        }
        return LJIILL;
    }

    public final MediaQueueItem LIZLLL() {
        QH7.LJ("Must be called from the main thread.");
        MediaStatus LJI = LJI();
        if (LJI == null) {
            return null;
        }
        return LJI.LJJJJZ(LJI.zzl);
    }

    public final MediaInfo LJ() {
        MediaInfo mediaInfo;
        synchronized (this.LIZ) {
            QH7.LJ("Must be called from the main thread.");
            MediaStatus mediaStatus = this.LIZJ.LJFF;
            if (mediaStatus == null) {
                mediaInfo = null;
            } else {
                mediaInfo = mediaStatus.zza;
            }
        }
        return mediaInfo;
    }

    public final C90120ZYm LJFF() {
        C90120ZYm c90120ZYm;
        synchronized (this.LIZ) {
            QH7.LJ("Must be called from the main thread.");
            c90120ZYm = this.LJ;
        }
        return c90120ZYm;
    }

    public final MediaStatus LJI() {
        MediaStatus mediaStatus;
        synchronized (this.LIZ) {
            QH7.LJ("Must be called from the main thread.");
            mediaStatus = this.LIZJ.LJFF;
        }
        return mediaStatus;
    }

    public final int LJII() {
        int i;
        synchronized (this.LIZ) {
            QH7.LJ("Must be called from the main thread.");
            MediaStatus LJI = LJI();
            if (LJI != null) {
                i = LJI.zze;
            } else {
                i = 1;
            }
        }
        return i;
    }

    public final long LJIIIIZZ() {
        MediaInfo mediaInfo;
        long j;
        synchronized (this.LIZ) {
            QH7.LJ("Must be called from the main thread.");
            MediaStatus mediaStatus = this.LIZJ.LJFF;
            if (mediaStatus != null && (mediaInfo = mediaStatus.zza) != null) {
                j = mediaInfo.zzg;
            }
            j = 0;
        }
        return j;
    }

    public final boolean LJIIIZ() {
        QH7.LJ("Must be called from the main thread.");
        if (LJIIJ() || LJJI() || LJIILJJIL() || LJIILIIL() || LJIIL()) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ() {
        QH7.LJ("Must be called from the main thread.");
        MediaStatus LJI = LJI();
        if (LJI != null && LJI.zze == 4) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJJI() {
        QH7.LJ("Must be called from the main thread.");
        MediaInfo LJ = LJ();
        if (LJ != null && LJ.zzd == 2) {
            return true;
        }
        return false;
    }

    public final boolean LJIIL() {
        QH7.LJ("Must be called from the main thread.");
        MediaStatus LJI = LJI();
        if (LJI != null && LJI.zzl != 0) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL() {
        int i;
        QH7.LJ("Must be called from the main thread.");
        MediaStatus LJI = LJI();
        if (LJI == null) {
            return false;
        }
        if (LJI.zze != 3) {
            if (!LJIIJJI()) {
                return false;
            }
            synchronized (this.LIZ) {
                QH7.LJ("Must be called from the main thread.");
                MediaStatus LJI2 = LJI();
                if (LJI2 != null) {
                    i = LJI2.zzf;
                } else {
                    i = 0;
                }
            }
            if (i != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean LJIILJJIL() {
        QH7.LJ("Must be called from the main thread.");
        MediaStatus LJI = LJI();
        if (LJI != null && LJI.zze == 2) {
            return true;
        }
        return false;
    }

    public final boolean LJIILL() {
        QH7.LJ("Must be called from the main thread.");
        MediaStatus LJI = LJI();
        if (LJI != null && LJI.zzr) {
            return true;
        }
        return false;
    }

    public final void LJIILLIIL() {
        QH7.LJ("Must be called from the main thread.");
        if (!LJJIII()) {
            LJIJJLI();
        } else {
            LJJIIJ(new C90922ZmI(this));
        }
    }

    public final void LJIIZILJ() {
        QH7.LJ("Must be called from the main thread.");
        if (!LJJIII()) {
            LJIJJLI();
        } else {
            LJJIIJ(new C90921ZmH(this));
        }
    }

    public final void LJIJJ() {
        QH7.LJ("Must be called from the main thread.");
        int LJII = LJII();
        if (LJII == 4 || LJII == 2) {
            QH7.LJ("Must be called from the main thread.");
            if (!LJJIII()) {
                LJIJJLI();
                return;
            } else {
                LJJIIJ(new C90928ZmO(this));
                return;
            }
        }
        QH7.LJ("Must be called from the main thread.");
        if (!LJJIII()) {
            LJIJJLI();
        } else {
            LJJIIJ(new C90930ZmQ(this));
        }
    }

    public final void LJIL() {
        InterfaceC90656Zi0 interfaceC90656Zi0 = this.LJFF;
        if (interfaceC90656Zi0 == null) {
            return;
        }
        QH7.LJ("Must be called from the main thread.");
        ((C90880Zlc) interfaceC90656Zi0).LJIIL(this.LIZJ.LIZIZ, this);
        QH7.LJ("Must be called from the main thread.");
        if (!LJJIII()) {
            LJIJJLI();
        } else {
            LJJIIJ(new C90916ZmC(this));
        }
    }

    public final boolean LJJI() {
        QH7.LJ("Must be called from the main thread.");
        MediaStatus LJI = LJI();
        if (LJI != null && LJI.zze == 5) {
            return true;
        }
        return false;
    }

    public final boolean LJJIFFI() {
        QH7.LJ("Must be called from the main thread.");
        if (!LJIIJJI()) {
            return true;
        }
        MediaStatus LJI = LJI();
        if (LJI != null && LJI.LJJJJZI(2L) && LJI.zzu != null) {
            return true;
        }
        return false;
    }

    public C90639Zhj(C90827Zkl c90827Zkl) {
        C90647Zhr c90647Zhr = new C90647Zhr(this);
        this.LIZLLL = c90647Zhr;
        this.LIZJ = c90827Zkl;
        c90827Zkl.LJII = new C90128ZYu(this);
        c90827Zkl.LIZJ = c90647Zhr;
        this.LJ = new C90120ZYm(this);
    }

    public static final void LJJIIJ(AbstractC90875ZlX abstractC90875ZlX) {
        try {
            abstractC90875ZlX.LJIILL();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            abstractC90875ZlX.LIZ(new C90874ZlW(new Status(2100, null, null)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        r2 = r3.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        if (r2 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        r6 = r2.LJJJLIIL(r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
    
        if ((r6 & 1) == 0) goto L44;
     */
    @Override // X.InterfaceC90219Zax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90639Zhj.LIZ(java.lang.String):void");
    }

    public final void LJIJ(InterfaceC90124ZYq interfaceC90124ZYq) {
        QH7.LJ("Must be called from the main thread.");
        C90130ZYw c90130ZYw = (C90130ZYw) ((ConcurrentHashMap) this.LJIIIIZZ).remove(interfaceC90124ZYq);
        if (c90130ZYw != null) {
            ((HashSet) c90130ZYw.LIZ).remove(interfaceC90124ZYq);
            if (!(!((HashSet) c90130ZYw.LIZ).isEmpty())) {
                ((ConcurrentHashMap) this.LJIIIZ).remove(Long.valueOf(c90130ZYw.LIZIZ));
                c90130ZYw.LJ.LIZIZ.removeCallbacks(c90130ZYw.LIZJ);
                c90130ZYw.LIZLLL = false;
            }
        }
    }

    public final void LJIJI(long j) {
        new ZWW();
        ZWY zwy = new ZWY(j, 0, null);
        QH7.LJ("Must be called from the main thread.");
        if (!LJJIII()) {
            LJIJJLI();
        } else {
            LJJIIJ(new C90931ZmR(this, zwy));
        }
    }

    public final void LJJ(C90880Zlc c90880Zlc) {
        final InterfaceC90219Zax interfaceC90219Zax;
        InterfaceC90656Zi0 interfaceC90656Zi0 = this.LJFF;
        if (interfaceC90656Zi0 == c90880Zlc) {
            return;
        }
        if (interfaceC90656Zi0 != null) {
            this.LIZJ.LJIILIIL();
            this.LJ.LIZJ();
            QH7.LJ("Must be called from the main thread.");
            final String str = this.LIZJ.LIZIZ;
            final C90880Zlc c90880Zlc2 = (C90880Zlc) interfaceC90656Zi0;
            if (!TextUtils.isEmpty(str)) {
                synchronized (c90880Zlc2.LJJIIJ) {
                    interfaceC90219Zax = (InterfaceC90219Zax) ((HashMap) c90880Zlc2.LJJIIJ).remove(str);
                }
                C67887Qkd c67887Qkd = new C67887Qkd();
                c67887Qkd.LIZ = new InterfaceC67935QlP() { // from class: X.ZgW
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC67935QlP
                    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                        C90880Zlc c90880Zlc3 = c90880Zlc2;
                        InterfaceC90219Zax interfaceC90219Zax2 = interfaceC90219Zax;
                        String str2 = str;
                        AbstractC67863QkF abstractC67863QkF = (AbstractC67863QkF) interfaceC67836Qjo;
                        C67649Qgn c67649Qgn = (C67649Qgn) obj;
                        boolean z = true;
                        if (c90880Zlc3.LJJIIZI == 1) {
                            z = false;
                        }
                        QH7.LJIIJ("Not active connection", z);
                        if (interfaceC90219Zax2 != null) {
                            C90232ZbA c90232ZbA = (C90232ZbA) abstractC67863QkF.LJJIIJ();
                            Parcel LJLJI = c90232ZbA.LJLJI();
                            LJLJI.writeString(str2);
                            c90232ZbA.LLZZJLIL(LJLJI, 12);
                        }
                        c67649Qgn.LIZIZ(null);
                    }
                };
                c67887Qkd.LIZLLL = 8414;
                c90880Zlc2.LIZLLL(1, c67887Qkd.LIZ());
                this.LIZLLL.LIZ = null;
                this.LIZIZ.removeCallbacksAndMessages(null);
            } else {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
        }
        this.LJFF = c90880Zlc;
        if (c90880Zlc != null) {
            this.LIZLLL.LIZ = c90880Zlc;
        }
    }

    public final void LJJII(java.util.Set<InterfaceC90124ZYq> set) {
        MediaInfo mediaInfo;
        HashSet hashSet = new HashSet(set);
        if (LJIILJJIL() || LJIILIIL() || LJIIJ() || LJJI()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC90124ZYq) it.next()).LIZ(LIZJ(), LJIIIIZZ());
            }
        } else {
            if (LJIIL()) {
                MediaQueueItem LIZLLL = LIZLLL();
                if (LIZLLL != null && (mediaInfo = LIZLLL.zzb) != null) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC90124ZYq) it2.next()).LIZ(0L, mediaInfo.zzg);
                    }
                    return;
                }
                return;
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ((InterfaceC90124ZYq) it3.next()).LIZ(0L, 0L);
            }
        }
    }

    public final void LIZIZ(InterfaceC90124ZYq interfaceC90124ZYq, long j) {
        QH7.LJ("Must be called from the main thread.");
        if (interfaceC90124ZYq == null || ((ConcurrentHashMap) this.LJIIIIZZ).containsKey(interfaceC90124ZYq)) {
            return;
        }
        java.util.Map<Long, C90130ZYw> map = this.LJIIIZ;
        Long valueOf = Long.valueOf(j);
        C90130ZYw c90130ZYw = (C90130ZYw) ((ConcurrentHashMap) map).get(valueOf);
        if (c90130ZYw == null) {
            c90130ZYw = new C90130ZYw(this, j);
            ((ConcurrentHashMap) this.LJIIIZ).put(valueOf, c90130ZYw);
        }
        ((HashSet) c90130ZYw.LIZ).add(interfaceC90124ZYq);
        ((ConcurrentHashMap) this.LJIIIIZZ).put(interfaceC90124ZYq, c90130ZYw);
        if (!LJIIIZ()) {
            return;
        }
        c90130ZYw.LJ.LIZIZ.removeCallbacks(c90130ZYw.LIZJ);
        c90130ZYw.LIZLLL = true;
        c90130ZYw.LJ.LIZIZ.postDelayed(c90130ZYw.LIZJ, c90130ZYw.LIZIZ);
    }
}
