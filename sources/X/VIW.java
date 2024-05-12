package X;

import Y.ARunnableS10S0200100_14;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS3S1210000_14;
import Y.ARunnableS50S0100000_14;
import android.os.Handler;
import com.ss.android.ugc.aweme.cla.et.newet.PrefetchStatusDescTranslEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.s0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VIW implements C93Z {
    public static final ConcurrentHashMap<EnumC55203LlX, VIW> LJIJ = new ConcurrentHashMap<>();
    public final EnumSet<EnumC79500VIa> LIZ;
    public Aweme LJIIJ;
    public InterfaceC55235Lm3 LJIILJJIL;
    public final Handler LIZIZ = new Handler(C06M.LIZ("PrefetchTranslationsThread").getLooper());
    public final long LIZJ = 8000;
    public final C73318Sq2 LIZLLL = new C73318Sq2();
    public final HashMap<C99B, Runnable> LJ = new HashMap<>();
    public String LJFF = "";
    public final ConcurrentHashMap<Aweme, List<WeakReference<InterfaceC88472Yns<Aweme, C76800UCe>>>> LJI = new ConcurrentHashMap<>();
    public List<Aweme> LJII = new ArrayList();
    public final List<Aweme> LJIIIIZZ = new ArrayList();
    public final List<Aweme> LJIIIZ = new ArrayList();
    public final HashMap<Aweme, VIS> LJIIJJI = new HashMap<>();
    public final List<Aweme> LJIIL = new ArrayList();
    public final ARunnableS50S0100000_14 LJIILIIL = new ARunnableS50S0100000_14(this, 187);
    public final C62822Ol8 LJIILL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 348));
    public final C62822Ol8 LJIILLIIL = C221108m2.LIZIZ(C35626DyY.LJLIL);
    public final int LJIIZILJ = 1;

    public final C86714Y1m LJIIIIZZ() {
        return (C86714Y1m) this.LJIILL.getValue();
    }

    public VIW(EnumSet<EnumC79500VIa> enumSet) {
        this.LIZ = enumSet;
    }

    public static void LJIIJ(VIW viw) {
        viw.LIZIZ.removeCallbacks(viw.LJIILIIL);
        viw.LIZIZ.postDelayed(viw.LJIILIIL, 300L);
    }

    @Override // X.C93Z
    public final void LIZIZ(InterfaceC55235Lm3 interfaceC55235Lm3) {
        this.LJIILJJIL = interfaceC55235Lm3;
    }

    @Override // X.C93Z
    public final void LIZJ(C99B blockTag) {
        o.LJIIIZ(blockTag, "blockTag");
        this.LIZIZ.post(new ARunnableS33S0200000_14(blockTag, this, 70));
    }

    @Override // X.C93Z
    public final void LJFF(Aweme aweme) {
        this.LIZIZ.post(new ARunnableS33S0200000_14(aweme, this, 71));
    }

    @Override // X.C93Z
    public final void LJI(C99B blockTag) {
        o.LJIIIZ(blockTag, "blockTag");
        LJII(blockTag, 3000L);
    }

    @Override // X.C93Z
    public final void LIZLLL(Aweme aweme, C86189Xs9 listener) {
        o.LJIIIZ(listener, "listener");
        List<WeakReference<InterfaceC88472Yns<Aweme, C76800UCe>>> list = this.LJI.get(aweme);
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator<WeakReference<InterfaceC88472Yns<Aweme, C76800UCe>>> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next().get(), listener)) {
                    break;
                }
            } else {
                list.add(new WeakReference<>(listener));
                break;
            }
        }
        this.LJI.put(aweme, list);
    }

    @Override // X.C93Z
    public final void LJ(Aweme aweme, C86189Xs9 listener) {
        o.LJIIIZ(listener, "listener");
        List<WeakReference<InterfaceC88472Yns<Aweme, C76800UCe>>> list = this.LJI.get(aweme);
        if (list != null) {
            ORS.LJJLIL(new AqS167S0100000_1(listener, 321), list);
            if (list.size() == 0) {
                this.LJI.remove(aweme);
            }
        }
    }

    public final void LJII(C99B blockTag, long j) {
        o.LJIIIZ(blockTag, "blockTag");
        this.LIZIZ.post(new ARunnableS10S0200100_14(blockTag, this, j, 1));
    }

    @Override // X.C93Z
    public final void LIZ(String str, List incomingListOfAweme, boolean z) {
        o.LJIIIZ(incomingListOfAweme, "incomingListOfAweme");
        this.LIZIZ.post(new ARunnableS3S1210000_14(incomingListOfAweme, this, z, str, 2));
    }

    public final void LJIIIZ(Aweme aweme, ILP ilp, Integer num) {
        InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJIILJJIL;
        if (interfaceC55235Lm3 != null) {
            String str = this.LJFF;
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            Y2G.LIZIZ(interfaceC55235Lm3, PrefetchStatusDescTranslEvent.class, C47261Igj.LJJIJ(new InterfaceC60152Xr(str, aid, C2058886e.LIZJ(aweme), Y01.LIZIZ.LJJIIZI(), ilp.getStatus(), num) { // from class: X.2YU
                public final String LJLIL;
                public final String LJLILLLLZI;
                public final String LJLJI;
                public final String LJLJJI;
                public final String LJLJJL;
                public final Integer LJLJJLL;

                @Override // X.InterfaceC54035LIp
                public final boolean LLD() {
                    return true;
                }

                @Override // X.InterfaceC54035LIp
                public final java.util.Map<String, Object> LLLILZ() {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enter_from", this.LJLIL);
                    linkedHashMap.put("group_id", this.LJLILLLLZI);
                    linkedHashMap.put("desc_lang", this.LJLJI);
                    linkedHashMap.put("target_lang", this.LJLJJI);
                    linkedHashMap.put("status", this.LJLJJL);
                    linkedHashMap.put("duration", this.LJLJJLL);
                    return linkedHashMap;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2YU)) {
                        return false;
                    }
                    C2YU c2yu = (C2YU) obj;
                    return o.LJ(this.LJLIL, c2yu.LJLIL) && o.LJ(this.LJLILLLLZI, c2yu.LJLILLLLZI) && o.LJ(this.LJLJI, c2yu.LJLJI) && o.LJ(this.LJLJJI, c2yu.LJLJJI) && o.LJ(this.LJLJJL, c2yu.LJLJJL) && o.LJ(this.LJLJJLL, c2yu.LJLJJLL);
                }

                public final int hashCode() {
                    int hashCode;
                    int LJ = C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31), 31);
                    Integer num2 = this.LJLJJLL;
                    if (num2 == null) {
                        hashCode = 0;
                    } else {
                        hashCode = num2.hashCode();
                    }
                    return LJ + hashCode;
                }

                @Override // X.InterfaceC54035LIp
                public final java.util.Map<String, Object> LLJZ() {
                    return LLLILZ();
                }

                @Override // X.InterfaceC54035LIp
                public final java.util.Map<String, Object> LLLLIL() {
                    return C113554cx.LJJJLIIL();
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PrefetchDescParams(enterFrom=");
                    LIZ.append(this.LJLIL);
                    LIZ.append(", groupId=");
                    LIZ.append(this.LJLILLLLZI);
                    LIZ.append(", srcLang=");
                    LIZ.append(this.LJLJI);
                    LIZ.append(", targetLang=");
                    LIZ.append(this.LJLJJI);
                    LIZ.append(", status=");
                    LIZ.append(this.LJLJJL);
                    LIZ.append(", duration=");
                    return s0.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
                }

                {
                    HH1.LIZ(str, "enterFrom", r10, "targetLang", r11, "status");
                    this.LJLIL = str;
                    this.LJLILLLLZI = aid;
                    this.LJLJI = r9;
                    this.LJLJJI = r10;
                    this.LJLJJL = r11;
                    this.LJLJJLL = num;
                }
            }), true);
        }
    }
}
