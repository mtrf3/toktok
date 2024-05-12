package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS54S0400000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Icc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47006Icc implements IXC {
    public final ITZ LIZ;
    public final C46999IcV LIZIZ;
    public C47007Icd LIZJ;
    public final C62822Ol8 LIZLLL;
    public final AqS158S0100000_8 LJ;
    public final int LJFF;
    public final ArrayList<InterfaceC47021Icr> LJI;
    public final ArrayList<InterfaceC47035Id5> LJII;
    public final ArrayList<InterfaceC47030Id0> LJIIIIZZ;
    public final C47002IcY LJIIIZ;

    @Override // X.IXC
    public final /* bridge */ /* synthetic */ IX7 LIZLLL() {
        return null;
    }

    @Override // X.IXC
    public final /* bridge */ /* synthetic */ IX7 LJIIIZ() {
        return null;
    }

    @Override // X.IXC
    public final void LJ() {
        C47002IcY c47002IcY = this.LJIIIZ;
        if (c47002IcY != null) {
            c47002IcY.LIZIZ(this);
        }
        C47002IcY c47002IcY2 = this.LJIIIZ;
        if (c47002IcY2 == null) {
            return;
        }
        c47002IcY2.LIZJ();
    }

    public final C47010Icg LJI() {
        return (C47010Icg) this.LIZLLL.getValue();
    }

    @Override // X.IXC
    public final void release() {
        C47007Icd c47007Icd = this.LIZJ;
        if (c47007Icd != null) {
            c47007Icd.LJFF();
        }
        this.LIZJ = null;
        Iterator<InterfaceC47021Icr> it = this.LJI.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        LJI().release();
        C47002IcY c47002IcY = this.LJIIIZ;
        if (c47002IcY != null) {
            c47002IcY.LIZ();
        }
        C47002IcY c47002IcY2 = this.LJIIIZ;
        if (c47002IcY2 == null) {
            return;
        }
        c47002IcY2.LJIIJJI = null;
        B93 b93 = C30591Hz.LJLIL;
        if (b93 == null) {
            return;
        }
        ((CopyOnWriteArrayList) ((B92) b93).LIZ).remove(c47002IcY2.LJIIIZ);
    }

    @Override // X.IXC
    public final void LJIIJ() {
        LJI().release();
    }

    @Override // X.IXC
    public final /* bridge */ /* synthetic */ IX7 LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.IXC
    public final void LIZ(ITX playerCreateCallback) {
        o.LJIIIZ(playerCreateCallback, "playerCreateCallback");
        Iterator<InterfaceC47030Id0> it = this.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(playerCreateCallback);
        }
        C47010Icg LJI = LJI();
        LJI.getClass();
        LJI.LJI = playerCreateCallback;
    }

    @Override // X.IXC
    public final void LJII(IWT iwt) {
        ((InterfaceC47030Id0) ORZ.LJLLJ(this.LJIIIIZZ)).LIZIZ(iwt);
    }

    @Override // X.IXC
    public final void setMute(boolean z) {
        C47007Icd c47007Icd;
        C47002IcY c47002IcY = this.LJIIIZ;
        if (c47002IcY != null) {
            c47002IcY.LIZJ = z;
        }
        if (!z) {
            C47007Icd c47007Icd2 = this.LIZJ;
            if ((c47007Icd2 == null || !c47007Icd2.LJFF.isPlaying()) && ((c47007Icd = this.LIZJ) == null || !c47007Icd.LJFF.isLoading())) {
                return;
            }
            LJ();
        }
    }

    public C47006Icc(ITZ playerType, C46999IcV playSessionConfig) {
        InterfaceC47034Id4 c47017Icn;
        o.LJIIIZ(playerType, "playerType");
        o.LJIIIZ(playSessionConfig, "playSessionConfig");
        this.LIZ = playerType;
        this.LIZIZ = playSessionConfig;
        this.LIZLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 535));
        this.LJ = new AqS158S0100000_8(this, 534);
        ArrayList<InterfaceC47021Icr> arrayList = new ArrayList<>();
        this.LJI = arrayList;
        ArrayList<InterfaceC47035Id5> arrayList2 = new ArrayList<>();
        this.LJII = arrayList2;
        ArrayList<InterfaceC47030Id0> arrayList3 = new ArrayList<>();
        this.LJIIIIZZ = arrayList3;
        String msg = o.LJIILLIIL(playSessionConfig, "init before | config: ");
        o.LJIIIZ(msg, "msg");
        if (playSessionConfig.LIZ) {
            playSessionConfig.LIZLLL = 1;
            playSessionConfig.LJ = 1;
        }
        int i = playSessionConfig.LIZLLL;
        if (i == 1) {
            if (playSessionConfig.LJ == 1 && playSessionConfig.LIZIZ) {
                playSessionConfig.LJFF = 0;
            }
        } else if (i < 1) {
            playSessionConfig.LIZLLL = 5;
        }
        int i2 = playSessionConfig.LJ;
        int i3 = playSessionConfig.LIZLLL;
        if (i2 > i3 || i2 < 1) {
            playSessionConfig.LJ = i3;
        }
        if (playSessionConfig.LIZIZ) {
            int i4 = playSessionConfig.LJFF;
            int i5 = playSessionConfig.LJ;
            if (i4 > i5) {
                playSessionConfig.LJFF = i5;
            }
        }
        int recyclerType = IZ8.LJJIL().getRecyclerType();
        if (recyclerType != 1) {
            if (recyclerType != 2) {
                if (recyclerType != 3) {
                    if (recyclerType != 4) {
                        if (playSessionConfig.LIZIZ) {
                            if (playSessionConfig.LJFF > 0) {
                                c47017Icn = new C47022Ics(playSessionConfig, LJI());
                            } else if (playSessionConfig.LJFF == 0) {
                                if (playSessionConfig.LIZJ) {
                                    c47017Icn = new C47016Icm(LJI());
                                } else {
                                    c47017Icn = new C47013Icj(LJI());
                                }
                            }
                        }
                        c47017Icn = new C47017Icn(LJI());
                    } else {
                        c47017Icn = new C47022Ics(playSessionConfig, LJI());
                    }
                } else {
                    c47017Icn = new C47016Icm(LJI());
                }
            } else {
                c47017Icn = new C47013Icj(LJI());
            }
        } else {
            c47017Icn = new C47017Icn(LJI());
        }
        int type = c47017Icn.type();
        this.LJFF = type;
        String msg2 = o.LJIILLIIL(Integer.valueOf(type), "use ");
        o.LJIIIZ(msg2, "msg");
        C47015Icl c47015Icl = new C47015Icl(c47017Icn);
        C47014Ick c47014Ick = new C47014Ick(playSessionConfig.LJI ? c47017Icn : new C47017Icn(LJI()));
        C47005Icb c47005Icb = new C47005Icb(playerType);
        arrayList.add(c47005Icb);
        arrayList.add(c47014Ick);
        arrayList.add(c47015Icl);
        arrayList2.add(c47005Icb);
        arrayList2.add(c47014Ick);
        arrayList3.add(c47005Icb);
        String msg3 = o.LJIILLIIL(playSessionConfig, "init after | config: ");
        o.LJIIIZ(msg3, "msg");
        this.LJIIIZ = new C47002IcY();
    }

    @Override // X.IXC
    public final void LIZJ(IX4 ix4, IVM prepareTimeInfoCallback) {
        String str;
        o.LJIIIZ(prepareTimeInfoCallback, "prepareTimeInfoCallback");
        Object[] objArr = new Object[1];
        String str2 = null;
        if (ix4 == null) {
            str = null;
        } else {
            str = ix4.LJIIIZ;
        }
        objArr[0] = str;
        SimRadar.keyScan("PlaySessionManagerV3", "prepareSession", objArr);
        if (ix4 == null) {
            return;
        }
        String msg = o.LJIILLIIL(C17N.LJJLIIIJ(ix4), "prepareSession | ");
        o.LJIIIZ(msg, "msg");
        if (!ix4.LJJ) {
            LJ();
        }
        C47007Icd c47007Icd = this.LIZJ;
        if (c47007Icd != null) {
            str2 = c47007Icd.LIZ;
        }
        if (TextUtils.equals(str2, ix4.LJIIIZ)) {
            return;
        }
        C17N.LJIIZILJ(this.LJII, new AqS139S0200000_8(ix4, prepareTimeInfoCallback, 30));
    }

    @Override // X.IXC
    public final void LJIIIIZZ(IX4 prepareData, IVM prepareTimeInfoCallback) {
        o.LJIIIZ(prepareData, "prepareData");
        o.LJIIIZ(prepareTimeInfoCallback, "prepareTimeInfoCallback");
        LIZJ(prepareData, prepareTimeInfoCallback);
    }

    @Override // X.IXC
    public final void LJFF(IX4 prepareData, OnUIPlayListener onUIPlayListener, IVM ivm) {
        o.LJIIIZ(prepareData, "prepareData");
        String msg = o.LJIILLIIL(C17N.LJJLIIIJ(prepareData), "startSession | ");
        o.LJIIIZ(msg, "msg");
        String msg2 = o.LJIILLIIL(this.LIZJ, "startSession before | current: ");
        o.LJIIIZ(msg2, "msg");
        SimRadar.keyScan("PlaySessionManagerV3", "startSession", prepareData.LJIIIZ);
        if (!prepareData.LJJ) {
            LJ();
        }
        C17N.LJIIZILJ(this.LJI, new AqS54S0400000_8(this, prepareData, onUIPlayListener, ivm, 2));
    }
}
