package com.bytedance.android.live.effect.karaoke.viewmodels;

import X.AbstractC07650Rt;
import X.AbstractC07660Ru;
import X.AnonymousClass010;
import X.AnonymousClass011;
import X.BWZ;
import X.BYI;
import X.BZI;
import X.C07560Rk;
import X.C07570Rl;
import X.C07580Rm;
import X.C07600Ro;
import X.C0EV;
import X.C0EY;
import X.C0NB;
import X.C15380j0;
import X.C1KV;
import X.C1L9;
import X.C1LI;
import X.C1LJ;
import X.C1LK;
import X.C1LN;
import X.C21180sM;
import X.C221108m2;
import X.C23080vQ;
import X.C279917z;
import X.C28787BRn;
import X.C29306Beo;
import X.C29551Dz;
import X.C2AX;
import X.C2AY;
import X.C2AZ;
import X.C2C4;
import X.C2C6;
import X.C2C9;
import X.C2CA;
import X.C30545Byn;
import X.C31181Kg;
import X.C46391rv;
import X.C46401rw;
import X.C48951w3;
import X.C54002Aa;
import X.C54432Br;
import X.C54472Bv;
import X.C54992Dv;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78613UtF;
import X.C78934UyQ;
import X.C79853Bl;
import X.EnumC07520Rg;
import X.EnumC07530Rh;
import X.EnumC58928NAu;
import X.InterfaceC21020s6;
import X.InterfaceC30442Bx8;
import X.InterfaceC67352kd;
import X.InterfaceC68342mE;
import X.ORZ;
import X.OSZ;
import X.UFE;
import X.X1D;
import X.XK4;
import X.XKQ;
import X.XKX;
import X.XLL;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class KaraokeViewModel extends ViewModel {
    public final C0EV LJLIL;
    public final XK4 LJLILLLLZI = C78934UyQ.LIZJ(Integer.MAX_VALUE, null, 6);
    public final XLL LJLJI;
    public final XLL LJLJJI;
    public final C07560Rk LJLJJL;
    public final C07600Ro LJLJJLL;
    public final C07570Rl LJLJL;
    public final C07580Rm LJLJLJ;
    public volatile int LJLJLLL;
    public final ConcurrentHashMap<Long, OSZ<Integer, Integer>> LJLL;
    public volatile long LJLLI;
    public volatile String LJLLILLLL;
    public XKQ LJLLJ;
    public final ConcurrentHashSet<Long> LJLLL;
    public final ConcurrentHashSet<String> LJLLLL;
    public final CopyOnWriteArrayList<InterfaceC68342mE<Boolean>> LJLLLLLL;
    public boolean LJLZ;
    public double LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public volatile boolean LL;
    public boolean LLD;
    public final C1KV LLF;
    public final C62822Ol8 LLFF;
    public final C23080vQ LLFFF;
    public InterfaceC21020s6 LLFII;
    public boolean LLFZ;

    public final void Bv0() {
        Iterator<OSZ<Long, Integer>> it = this.LLFFF.LIZJ().iterator();
        while (it.hasNext()) {
            this.LJLIL.LJJIII(it.next().getFirst().longValue(), AnonymousClass010.ADDING);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update Adding status ");
        LIZ.append(this.LLFFF.LIZJ());
        C0NB.LIZIZ("KaraokeViewModel", X1D.LIZIZ(LIZ));
    }

    public final void Fv0() {
        AnonymousClass011 anonymousClass011;
        List<C279917z> list;
        C0EY LJIIJ = this.LJLIL.LJIIJ(-999L);
        if (LJIIJ != null && (list = LJIIJ.LIZJ) != null) {
            anonymousClass011 = (AnonymousClass011) ORZ.LJLLLL(list);
        } else {
            anonymousClass011 = null;
        }
        boolean z = nv0().LIZJ;
        if (anonymousClass011 == null) {
            this.LJLIL.LJIJJLI();
            return;
        }
        if (z) {
            this.LJLIL.LJJIIJ(anonymousClass011.LIZ, C46391rv.LJLIL);
            return;
        }
        C0EV c0ev = this.LJLIL;
        long j = anonymousClass011.LIZ;
        c0ev.LJIJJLI();
        c0ev.LJJIIJ(j, C46401rw.LJLIL);
    }

    public final C29551Dz nv0() {
        return (C29551Dz) this.LLFF.getValue();
    }

    public final C1LN Cv0() {
        EnumC07520Rg enumC07520Rg;
        EnumC07530Rh enumC07530Rh;
        C279917z LIZJ = nv0().LIZJ();
        Boolean LIZJ2 = InterfaceC30442Bx8.E3.LIZJ();
        o.LJIIIIZZ(LIZJ2, "KARAOKE_LYRICS_SWITCH.value");
        if (LIZJ2.booleanValue()) {
            enumC07520Rg = EnumC07520Rg.OPEN;
        } else {
            enumC07520Rg = EnumC07520Rg.CLOSE;
        }
        Boolean LIZJ3 = InterfaceC30442Bx8.F3.LIZJ();
        o.LJIIIIZZ(LIZJ3, "KARAOKE_ORIGINAL_SWITCH.value");
        if (LIZJ3.booleanValue()) {
            enumC07530Rh = EnumC07530Rh.OPEN;
        } else {
            enumC07530Rh = EnumC07530Rh.CLOSE;
        }
        if (LIZJ != null) {
            int i = LIZJ.LJIIIZ.LJ;
            if (i != 3 && i != 2) {
                enumC07520Rg = EnumC07520Rg.FORBID_CLOSE;
            }
            if (LIZJ.LJII.LIZIZ.length() == 0) {
                enumC07530Rh = EnumC07530Rh.FORBID_CLOSE;
            }
        }
        C1LN c1ln = new C1LN(enumC07520Rg, enumC07530Rh, this.LJZ);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2C9(this, c1ln, null), 3);
        return c1ln;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        boolean z;
        super.onCleared();
        C0NB.LIZIZ("KaraokeViewModel#OnCliear", "onClear!!!");
        if (this.LJLIL.LJIILIIL()) {
            C279917z LIZJ = nv0().LIZJ();
            if (LIZJ != null) {
                long j = LIZJ.LIZ;
                String LJFF = LIZJ.LJFF();
                if (!ujb.o.LJJJJJL(LIZJ.LJII.LIZIZ)) {
                    Boolean LIZJ2 = InterfaceC30442Bx8.F3.LIZJ();
                    o.LJIIIIZZ(LIZJ2, "KARAOKE_ORIGINAL_SWITCH.value");
                    if (LIZJ2.booleanValue()) {
                        z = true;
                        C21180sM.LJIIJ(j, nv0().LIZLLL / 1000, LJFF, z, false);
                    }
                }
                z = false;
                C21180sM.LJIIJ(j, nv0().LIZLLL / 1000, LJFF, z, false);
            }
            if (C21180sM.LIZJ != -1) {
                long currentTimeMillis = System.currentTimeMillis() - C21180sM.LIZJ;
                BZI LIZ = C28787BRn.LIZ("livesdk_live_karaoke_floating_panel_use_time");
                LIZ.LJIIZILJ();
                LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C21180sM.LIZIZ)) ? 1 : 0), "is_live_take_default");
                UFE.LIZIZ((int) (currentTimeMillis / 1000), LIZ, "use_time");
            }
        }
        C23080vQ c23080vQ = this.LLFFF;
        c23080vQ.getClass();
        InterfaceC30442Bx8.z3.LIZ(c23080vQ.LIZIZ.toList());
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
    }

    public final void pause() {
        if (nv0().LIZIZ) {
            this.LLD = true;
        }
        nv0().LJ();
    }

    public KaraokeViewModel(C0EV c0ev) {
        this.LJLIL = c0ev;
        XLL LIZ = C79853Bl.LIZ(0, 30, null, 4);
        this.LJLJI = LIZ;
        this.LJLJJI = C79853Bl.LIZ(0, 30, null, 4);
        C07560Rk c07560Rk = new C07560Rk(LIZ);
        this.LJLJJL = c07560Rk;
        this.LJLJJLL = new C07600Ro(c07560Rk);
        this.LJLJL = new C07570Rl(c07560Rk, ViewModelKt.getViewModelScope(this), c0ev, new IDqS420S0100000(this, 46));
        C07580Rm c07580Rm = new C07580Rm(c07560Rk, ViewModelKt.getViewModelScope(this), c0ev);
        c07580Rm.LJI = new IDqS420S0100000(this, 47);
        this.LJLJLJ = c07580Rm;
        this.LJLJLLL = c0ev.LJIILIIL() ? 1 : 0;
        this.LJLL = new ConcurrentHashMap<>();
        this.LJLLI = -996L;
        this.LJLLL = new ConcurrentHashSet<>();
        this.LJLLLL = new ConcurrentHashSet<>();
        this.LJLLLLLL = new CopyOnWriteArrayList<>();
        this.LJLZ = true;
        this.LLF = new C1KV(0);
        this.LLFF = C221108m2.LIZIZ(new IDqS420S0100000(this, 48));
        this.LLFFF = new C23080vQ();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C54472Bv(this, null), 3);
        if (c0ev.LIZ == 1) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            Object mv0 = dataChannelGlobal.mv0(C54992Dv.class);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LiveStream: ");
            LIZ2.append(mv0 != null);
            C0NB.LIZIZ("KaraokeViewModel#LiveStreamListener", X1D.LIZIZ(LIZ2));
            dataChannelGlobal.pv0(LiveStreamGlobalChannel.class, this, new IDqS416S0100000(this, 158));
        }
    }

    public final void Dv0(boolean z) {
        this.LL = z;
        if (z) {
            BYI.LIZJ(BWZ.KARAOKE);
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2AZ(this, null), 3);
        } else {
            BYI.LIZLLL(BWZ.KARAOKE);
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C54002Aa(this, null), 3);
        }
    }

    public final void Ev0(List<C279917z> newPlayList) {
        Long l;
        Long l2;
        IAudioFilterManager iAudioFilterManager;
        o.LJIIIZ(newPlayList, "newPlayList");
        C29551Dz nv0 = nv0();
        IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(this, 61);
        nv0.getClass();
        C279917z LIZJ = nv0.LIZJ();
        nv0.LIZ.clear();
        nv0.LIZ.addAll(newPlayList);
        C279917z LIZJ2 = nv0.LIZJ();
        String str = null;
        if (LIZJ2 != null) {
            l = Long.valueOf(LIZJ2.LIZ);
        } else {
            l = null;
        }
        if (LIZJ != null) {
            l2 = Long.valueOf(LIZJ.LIZ);
        } else {
            l2 = null;
        }
        if (!o.LJ(l, l2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Auto Play CurSong: ");
            if (LIZJ2 != null) {
                str = LIZJ2.LIZJ;
            }
            LIZ.append(str);
            LIZ.append(", notifier: ");
            LIZ.append(true);
            C0NB.LIZIZ("KaraokeSongListManager", X1D.LIZIZ(LIZ));
            if (LIZJ2 == null) {
                iDqS416S0100000.invoke(C1LI.LIZ);
                if (nv0.LIZIZ && (iAudioFilterManager = nv0.LIZLLL().LIZ) != null) {
                    iAudioFilterManager.pause();
                }
                nv0.LIZJ = false;
                nv0.LIZIZ(false);
            } else {
                iDqS416S0100000.invoke(new C1LK(LIZJ2));
                nv0.LJFF(0, true);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SongList Size after Update: ");
        LIZ2.append(nv0().LIZ.size());
        C0NB.LIZIZ("KaraokeViewModel", X1D.LIZIZ(LIZ2));
        if (nv0().LIZ.size() < 10 && this.LJLIL.LJIIJJI(-999L)) {
            C0NB.LIZIZ("KaraokeViewModel", "Auto Fetch More Queue SongList");
            yv0(new C31181Kg(-999L, true, false));
        }
    }

    public final void Gv0(long j) {
        this.LJLLI = j;
        C07580Rm c07580Rm = this.LJLJLJ;
        c07580Rm.LJFF = j;
        if (j == -998 && c07580Rm.LIZLLL != 0) {
            c07580Rm.LJ += c07580Rm.LIZLLL;
            c07580Rm.LIZLLL = 0L;
            XKX.LIZLLL(c07580Rm.LIZIZ, C78613UtF.LIZJ, null, new C54432Br(c07580Rm, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x001b, LOOP:0: B:15:0x002d->B:22:0x0058, LOOP_END, TryCatch #0 {all -> 0x001b, blocks: (B:12:0x001e, B:14:0x002b, B:16:0x002f, B:18:0x003d, B:26:0x005b, B:28:0x006e, B:22:0x0058), top: B:11:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[EDGE_INSN: B:23:0x0055->B:24:0x0055 BREAK  A[LOOP:0: B:15:0x002d->B:22:0x0058], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe gv0(com.bytedance.android.livesdkapi.depend.model.LiveEffect r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.unzipPath
            int r0 = r0.length()
            r6 = 0
            if (r0 != 0) goto L72
            r0 = 1
        La:
            if (r0 == 0) goto L1e
            X.1Dz r0 = r7.nv0()
            com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager r1 = r0.LIZ()
            if (r1 == 0) goto L1b
            java.lang.String r0 = ""
            r1.setTuningParams(r0)
        L1b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1e:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r8.unzipPath     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            java.io.File[] r5 = r1.listFiles()     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L1b
            int r4 = r5.length     // Catch: java.lang.Throwable -> L1b
            r2 = 0
        L2d:
            if (r2 >= r4) goto L50
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r3.getName()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "config.json"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L52
            java.lang.String r1 = r3.getName()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "it.name"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = ".json"
            boolean r0 = ujb.o.LJJJJ(r1, r0, r6)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L52
            r0 = 1
            goto L53
        L50:
            r3 = 0
            goto L55
        L52:
            r0 = 0
        L53:
            if (r0 == 0) goto L58
        L55:
            if (r3 == 0) goto L1b
            goto L5b
        L58:
            int r2 = r2 + 1
            goto L2d
        L5b:
            X.1Dz r2 = r7.nv0()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "it.absolutePath"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L1b
            com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager r0 = r2.LIZ()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1b
            r0.setTuningParams(r1)     // Catch: java.lang.Throwable -> L1b
            goto L1b
        L72:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.gv0(com.bytedance.android.livesdkapi.depend.model.LiveEffect):X.UCe");
    }

    public final void hv0(C279917z c279917z) {
        if (!this.LJZL) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C2CA(this, null), 2);
            this.LJZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            IAudioFilterManager LIZ = nv0().LIZ();
            if (LIZ != null) {
                LIZ.setPitchShift(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            }
            if (!this.LJZI) {
                if (!C30545Byn.LIZIZ() && !C30545Byn.LIZJ()) {
                    String LJIILJJIL = C15380j0.LJIILJJIL(R.string.jvg);
                    o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_LI…VEhostPage_earphoneToast)");
                    jv0(new C1L9(LJIILJJIL, "pm_mt_LIVEKaraoke_LIVEhostPage_earphoneToast"));
                }
                this.LJZI = true;
            }
            int i = c279917z.LJIIIZ.LJ;
            if (i == 3 || i == 2) {
                return;
            }
            String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.jvu);
            o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_LI…VEhostPage_noLyricsToast)");
            jv0(new C1L9(LJIILJJIL2, "pm_mt_LIVEKaraoke_LIVEhostPage_noLyricsToast"));
        }
    }

    public final void jv0(AbstractC07660Ru abstractC07660Ru) {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C2AX(this, abstractC07660Ru, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lv0(X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C47281tM
            if (r0 == 0) goto Lbd
            r7 = r12
            X.1tM r7 = (X.C47281tM) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbd
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r1 = r7.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r8 = 0
            r5 = 5
            r9 = 4
            r10 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L30
            if (r0 == r3) goto Lcc
            if (r0 == r10) goto L9a
            if (r0 == r9) goto Lad
            if (r0 != r5) goto Lc4
            X.C141335gf.LIZJ(r1)
        L2d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L30:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r4 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
            goto L48
        L36:
            X.C141335gf.LIZJ(r1)
            X.0EV r1 = r11.LJLIL
            r7.LJLIL = r11
            r7.LJLJJI = r2
            r0 = 0
            java.lang.Object r1 = r1.LJI(r0, r7)
            if (r1 != r6) goto L47
            return r6
        L47:
            r4 = r11
        L48:
            X.0EY r1 = (X.C0EY) r1
            if (r1 != 0) goto L59
            X.1Ky r0 = new X.AbstractC07660Ru() { // from class: X.1Ky
                static {
                    /*
                        X.1Ky r0 = new X.1Ky
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.1Ky) X.1Ky.LIZ X.1Ky
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C31361Ky.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C31361Ky.<init>():void");
                }
            }
            r7.LJLIL = r8
            r7.LJLJJI = r3
            java.lang.Object r0 = r4.iv0(r0, r7)
            if (r0 != r6) goto Lcf
            return r6
        L59:
            java.util.List<X.17z> r0 = r1.LIZJ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L65
            r4.LJZL = r2
        L65:
            java.util.List<X.17z> r0 = r1.LIZJ
            r4.Ev0(r0)
            X.1Dz r0 = r4.nv0()
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto L9f
            X.1Dz r0 = r4.nv0()
            r0.LJ()
            X.1LQ r3 = new X.1LQ
            X.0Rr r2 = X.EnumC07630Rr.PAUSE
            X.1Dz r0 = r4.nv0()
            X.17z r0 = r0.LIZJ()
            if (r0 == 0) goto L97
            long r0 = r0.LIZ
        L89:
            r3.<init>(r2, r0)
            r7.LJLIL = r4
            r7.LJLJJI = r10
            java.lang.Object r0 = r4.iv0(r3, r7)
            if (r0 != r6) goto L9f
            return r6
        L97:
            r0 = -1
            goto L89
        L9a:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r4 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L9f:
            r4.Fv0()
            r7.LJLIL = r4
            r7.LJLJJI = r9
            java.lang.Object r0 = r4.sv0(r7)
            if (r0 != r6) goto Lb2
            return r6
        Lad:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r4 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        Lb2:
            r7.LJLIL = r8
            r7.LJLJJI = r5
            X.1LN r0 = r4.Cv0()
            if (r0 != r6) goto L2d
            return r6
        Lbd:
            X.1tM r7 = new X.1tM
            r7.<init>(r11, r12)
            goto L12
        Lc4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lcc:
            X.C141335gf.LIZJ(r1)
        Lcf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.lv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mv0(X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C47291tN
            if (r0 == 0) goto L50
            r6 = r8
            X.1tN r6 = (X.C47291tN) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r5 = r6.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L26
            if (r0 != r3) goto L56
            X.C141335gf.LIZJ(r5)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r2 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
            goto L3d
        L2c:
            X.C141335gf.LIZJ(r5)
            X.0EV r0 = r7.LJLIL
            r6.LJLIL = r7
            r6.LJLJJI = r1
            java.lang.Object r5 = r0.LJIIIZ(r6)
            if (r5 != r4) goto L3c
            return r4
        L3c:
            r2 = r7
        L3d:
            java.util.List r5 = (java.util.List) r5
            X.1LP r1 = new X.1LP
            r1.<init>(r5)
            r0 = 0
            r6.LJLIL = r0
            r6.LJLJJI = r3
            java.lang.Object r0 = r2.iv0(r1, r6)
            if (r0 != r4) goto L23
            return r4
        L50:
            X.1tN r6 = new X.1tN
            r6.<init>(r7, r8)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.mv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pv0(X.InterfaceC67352kd<? super X.C76800UCe> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C47311tP
            if (r0 == 0) goto L3c
            r4 = r6
            X.1tP r4 = (X.C47311tP) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L42
            X.C141335gf.LIZJ(r1)
        L20:
            X.BWZ r0 = X.BWZ.KARAOKE
            X.BYI.LIZJ(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            r5.LJLJLLL = r2
            X.1LJ r1 = new X.1LJ
            r0 = 0
            r1.<init>(r0)
            r4.LJLJI = r2
            java.lang.Object r0 = r5.iv0(r1, r4)
            if (r0 != r3) goto L20
            return r3
        L3c:
            X.1tP r4 = new X.1tP
            r4.<init>(r5, r6)
            goto L12
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.pv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[LOOP:0: B:12:0x002d->B:14:0x0033, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object qv0(X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.qv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sv0(X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C47341tS
            if (r0 == 0) goto L8b
            r6 = r11
            X.1tS r6 = (X.C47341tS) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r7 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 == r4) goto L23
            if (r0 == r3) goto L23
            if (r0 != r7) goto L91
        L23:
            X.C141335gf.LIZJ(r1)
        L26:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L29:
            X.C141335gf.LIZJ(r1)
            long r0 = r10.LJLLI
            r8 = -997(0xfffffffffffffc1b, double:NaN)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L57
            java.lang.String r2 = r10.LJLLILLLL
            if (r2 == 0) goto L26
            X.0EV r0 = r10.LJLIL
            r0.getClass()
            X.0M6<java.lang.String, X.0EY> r0 = r0.LJIIIIZZ
            java.lang.Object r0 = r0.LIZIZ(r2)
            X.0EY r0 = (X.C0EY) r0
            if (r0 == 0) goto L26
            X.1LR r1 = new X.1LR
            java.util.List<X.17z> r0 = r0.LIZJ
            r1.<init>(r2, r0)
            r6.LJLJI = r4
            java.lang.Object r0 = r10.iv0(r1, r6)
            if (r0 != r5) goto L26
            return r5
        L57:
            X.0EV r2 = r10.LJLIL
            long r0 = r10.LJLLI
            X.0EY r4 = r2.LJIIJ(r0)
            if (r4 == 0) goto L26
            java.util.List<X.17z> r0 = r4.LIZJ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L79
            X.1L3 r2 = new X.1L3
            long r0 = r10.LJLLI
            r2.<init>(r0)
            r6.LJLJI = r3
            java.lang.Object r0 = r10.iv0(r2, r6)
            if (r0 != r5) goto L26
            return r5
        L79:
            X.1LT r3 = new X.1LT
            long r1 = r10.LJLLI
            java.util.List<X.17z> r0 = r4.LIZJ
            r3.<init>(r1, r0)
            r6.LJLJI = r7
            java.lang.Object r0 = r10.iv0(r3, r6)
            if (r0 != r5) goto L26
            return r5
        L8b:
            X.1tS r6 = new X.1tS
            r6.<init>(r10, r11)
            goto L12
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.sv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wv0(X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C47371tV
            if (r0 == 0) goto L47
            r5 = r7
            X.1tV r5 = (X.C47371tV) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r4 = r5.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L4d
            java.lang.Object r1 = r5.LJLILLLLZI
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L24:
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<java.lang.String> r0 = r0.LJLLLL
            r0.remove(r1)
        L29:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2c:
            X.C141335gf.LIZJ(r4)
            java.lang.String r1 = r6.LJLLILLLL
            if (r1 == 0) goto L29
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<java.lang.String> r0 = r6.LJLLLL
            r0.add(r1)
            r5.LJLIL = r6
            r5.LJLILLLLZI = r1
            r5.LJLJJL = r2
            X.UCe r0 = r6.xv0(r1, r2)
            if (r0 != r3) goto L45
            return r3
        L45:
            r0 = r6
            goto L24
        L47:
            X.1tV r5 = new X.1tV
            r5.<init>(r6, r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.wv0(X.2kd):java.lang.Object");
    }

    public final void yv0(AbstractC07650Rt action) {
        o.LJIIIZ(action, "action");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2AY(this, action, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Av0(X.AbstractC07650Rt r8, X.InterfaceC67352kd<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C47381tW
            if (r0 == 0) goto L74
            r5 = r9
            X.1tW r5 = (X.C47381tW) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r6 = 1
            if (r0 == 0) goto L23
            if (r0 != r6) goto L7a
            X.C141335gf.LIZJ(r1)
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.String r3 = r8.LIZ()
            boolean r0 = ujb.o.LJJJJJL(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L44
            X.1KV r0 = r7.LLF
            r0.getClass()
            java.lang.Object r0 = r0.LJLIL
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L44
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L44:
            X.1KV r2 = r7.LLF
            r2.getClass()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Interceptor: register: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C0NB.LIZ(r0)
            java.lang.Object r2 = r2.LJLIL
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
            r5.LJLJI = r6
            java.lang.Object r0 = r7.zv0(r8, r5)
            if (r0 != r4) goto L20
            return r4
        L74:
            X.1tW r5 = new X.1tW
            r5.<init>(r7, r9)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.Av0(X.0Rt, X.2kd):java.lang.Object");
    }

    public final Object iv0(AbstractC07660Ru abstractC07660Ru, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LIZ = this.LJLJJL.LIZ(abstractC07660Ru, interfaceC67352kd);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(X.C279917z r13, X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.kv0(X.17z, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object rv0(boolean r11, X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C47331tR
            if (r0 == 0) goto L83
            r3 = r12
            X.1tR r3 = (X.C47331tR) r3
            int r2 = r3.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r3.LJLJJI = r2
        L12:
            java.lang.Object r9 = r3.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJI
            r8 = 0
            r6 = 4
            r7 = 3
            r5 = 2
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 == r1) goto L91
            if (r0 == r5) goto La8
            if (r0 == r7) goto L2e
            if (r0 != r6) goto L89
            X.C141335gf.LIZJ(r9)
        L2b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2e:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r3.LJLIL
            X.C141335gf.LIZJ(r9)
            goto L76
        L34:
            X.C141335gf.LIZJ(r9)
            r10.LL = r11
            if (r11 == 0) goto L48
            X.0EV r0 = r10.LJLIL
            r3.LJLIL = r10
            r3.LJLJJI = r1
            java.lang.Object r0 = r0.LJI(r8, r3)
            if (r0 != r2) goto L97
            return r2
        L48:
            r10.LJLJLLL = r8
            X.0EV r5 = r10.LJLIL
            java.util.List<X.015> r0 = r5.LJFF
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.0EY> r0 = r5.LJ
            r0.clear()
            X.0M6<java.lang.String, X.0EY> r1 = r5.LJIIIIZZ
            r0 = -1
            r1.LJIIIIZZ(r0)
            r5.LJIL()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.OSZ<java.lang.Integer, java.lang.Integer>> r0 = r10.LJLL
            r0.clear()
            X.0Ro r1 = r10.LJLJJLL
            X.1ka r0 = X.C41841ka.LIZ
            r3.LJLIL = r10
            r3.LJLJJI = r7
            java.lang.Object r0 = r1.LIZ(r0, r3)
            if (r0 != r2) goto L75
            return r2
        L75:
            r1 = r10
        L76:
            X.1LL r0 = X.C1LL.LIZ
            r3.LJLIL = r4
            r3.LJLJJI = r6
            java.lang.Object r0 = r1.iv0(r0, r3)
            if (r0 != r2) goto L2b
            return r2
        L83:
            X.1tR r3 = new X.1tR
            r3.<init>(r10, r12)
            goto L12
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L91:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r3.LJLIL
            X.C141335gf.LIZJ(r9)
            goto L98
        L97:
            r1 = r10
        L98:
            X.1LJ r0 = new X.1LJ
            r0.<init>(r8)
            r3.LJLIL = r4
            r3.LJLJJI = r5
            java.lang.Object r0 = r1.iv0(r0, r3)
            if (r0 != r2) goto Lab
            return r2
        La8:
            X.C141335gf.LIZJ(r9)
        Lab:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.rv0(boolean, X.2kd):java.lang.Object");
    }

    public final Object tv0(boolean z, C48951w3 c48951w3) {
        Object obj;
        if (this.LJLIL.LJIILIIL()) {
            if (z && this.LL && (!((CopyOnWriteArrayList) this.LJLIL.LJFF).isEmpty())) {
                obj = iv0(new C1LJ(false), c48951w3);
                if (obj != EnumC58928NAu.COROUTINE_SUSPENDED) {
                    obj = C76800UCe.LIZ;
                }
            } else {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C2C4(z, this, null), 2);
                obj = C76800UCe.LIZ;
            }
            if (obj == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return obj;
            }
            return C76800UCe.LIZ;
        }
        Object rv0 = rv0(z, c48951w3);
        if (rv0 == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return rv0;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uv0(boolean r9, X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C47351tT
            if (r0 == 0) goto L74
            r7 = r10
            X.1tT r7 = (X.C47351tT) r7
            int r2 = r7.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r7.LJLJJL = r2
        L12:
            java.lang.Object r1 = r7.LJLJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJL
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 == r3) goto L29
            if (r0 == r4) goto L82
            if (r0 != r5) goto L7a
            X.C141335gf.LIZJ(r1)
        L26:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L29:
            boolean r9 = r7.LJLILLLLZI
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r2 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
            goto L4e
        L31:
            X.C141335gf.LIZJ(r1)
            X.0EV r0 = r8.LJLIL
            boolean r0 = r0.LJIILIIL()
            if (r0 == 0) goto L4b
            X.0EV r0 = r8.LJLIL
            r7.LJLIL = r8
            r7.LJLILLLLZI = r9
            r7.LJLJJL = r3
            java.lang.Object r1 = r0.LJJII(r4, r7, r9)
            if (r1 != r6) goto L4d
            return r6
        L4b:
            r2 = r8
            goto L54
        L4d:
            r2 = r8
        L4e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = r1.booleanValue()
        L54:
            r1 = 0
            if (r3 == 0) goto L67
            X.1LE r0 = new X.1LE
            r0.<init>(r9)
            r7.LJLIL = r1
            r7.LJLJJL = r4
            java.lang.Object r0 = r2.iv0(r0, r7)
            if (r0 != r6) goto L85
            return r6
        L67:
            X.1LY r0 = X.C1LY.LIZ
            r7.LJLIL = r1
            r7.LJLJJL = r5
            java.lang.Object r0 = r2.iv0(r0, r7)
            if (r0 != r6) goto L26
            return r6
        L74:
            X.1tT r7 = new X.1tT
            r7.<init>(r8, r10)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L82:
            X.C141335gf.LIZJ(r1)
        L85:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.uv0(boolean, X.2kd):java.lang.Object");
    }

    public final C76800UCe xv0(String str, boolean z) {
        Boolean bool;
        XKQ xkq;
        this.LJLLILLLL = str;
        XKQ xkq2 = this.LJLLJ;
        if (xkq2 != null) {
            bool = Boolean.valueOf(xkq2.isActive());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && (xkq = this.LJLLJ) != null) {
            xkq.LIZIZ(null);
        }
        this.LJLLJ = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C2C6(str, this, z, null), 2);
        return C76800UCe.LIZ;
    }

    public final Object zv0(AbstractC07650Rt abstractC07650Rt, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendAction: ");
        LIZ.append(abstractC07650Rt);
        C0NB.LIZIZ("KaraokeViewModel", X1D.LIZIZ(LIZ));
        Object LJIIIZ = this.LJLILLLLZI.LJIIIZ(abstractC07650Rt, interfaceC67352kd);
        if (LJIIIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIIZ;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vv0(X.EnumC23060vO r11, X.C279917z r12, X.InterfaceC67352kd<? super java.lang.Boolean> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C47361tU
            if (r0 == 0) goto La0
            r5 = r13
            X.1tU r5 = (X.C47361tU) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La0
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r9 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r2 = 1
            r6 = 0
            r7 = 4
            r8 = 3
            r3 = 2
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L36
            if (r0 == r3) goto L98
            if (r0 == r8) goto L30
            if (r0 != r7) goto La7
            X.C141335gf.LIZJ(r9)
        L2a:
            r2 = 0
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L30:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r5.LJLIL
            X.C141335gf.LIZJ(r9)
            goto L6a
        L36:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r5.LJLIL
            X.C141335gf.LIZJ(r9)
            goto L85
        L3c:
            X.C141335gf.LIZJ(r9)
            boolean r0 = r10.LL
            if (r0 != 0) goto L46
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L46:
            int[] r1 = X.C05860Kw.LIZ
            int r0 = r11.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L77
            if (r0 == r3) goto L55
            if (r0 != r8) goto Laf
            goto L2a
        L55:
            X.0EV r3 = r10.LJLIL
            long r1 = r12.LIZ
            X.010 r0 = X.AnonymousClass010.UN_ADD
            r3.LJJIII(r1, r0)
            r5.LJLIL = r10
            r5.LJLJJL = r8
            java.lang.Object r0 = r10.sv0(r5)
            if (r0 != r4) goto L69
            return r4
        L69:
            r1 = r10
        L6a:
            X.1LY r0 = X.C1LY.LIZ
            r5.LJLIL = r6
            r5.LJLJJL = r7
            java.lang.Object r0 = r1.iv0(r0, r5)
            if (r0 != r4) goto L2a
            return r4
        L77:
            X.0EV r0 = r10.LJLIL
            r5.LJLIL = r10
            r5.LJLJJL = r2
            java.lang.Object r9 = r0.LIZIZ(r12, r5)
            if (r9 != r4) goto L84
            return r4
        L84:
            r0 = r10
        L85:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r1 = r9.booleanValue()
            r5.LJLIL = r6
            r5.LJLILLLLZI = r1
            r5.LJLJJL = r3
            java.lang.Object r0 = r0.sv0(r5)
            if (r0 != r4) goto L9d
            return r4
        L98:
            boolean r1 = r5.LJLILLLLZI
            X.C141335gf.LIZJ(r9)
        L9d:
            if (r1 == 0) goto L2a
            goto L2b
        La0:
            X.1tU r5 = new X.1tU
            r5.<init>(r10, r13)
            goto L12
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laf:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.vv0(X.0vO, X.17z, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ov0(X.EnumC07640Rs r10, java.lang.String r11, long r12, boolean r14, X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.ov0(X.0Rs, java.lang.String, long, boolean, X.2kd):java.lang.Object");
    }
}
