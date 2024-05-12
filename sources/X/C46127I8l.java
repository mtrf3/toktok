package X;

import Y.AObjectS117S0200000_7;
import Y.AObjectS86S0100000_7;
import Y.AObserverS67S0300000_7;
import Y.AObserverS71S0200000_7;
import Y.AObserverS75S0100000_7;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS53S0400000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I8l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46127I8l implements InterfaceC135635Tz {
    public static final I40 LJLLJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public final I0N LJLIL;
    public final InterfaceC88472Yns<C46032I4u, C76800UCe> LJLILLLLZI;
    public final C164106cI LJLJI;
    public final C82622Wbi LJLJJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;
    public Effect LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public long LJLLI;
    public boolean LJLLILLLL;

    static {
        TBT tbt = new TBT(C46127I8l.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt};
        LJLLJ = new I40();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public final void LIZ(C164106cI c164106cI, Effect effect) {
        C46130I8o c46130I8o;
        o.LJIIIZ(effect, "effect");
        String str = (String) ORZ.LJLLLL(effect.getIconUrl().getUrlList());
        if (str != null) {
            long j = this.LJLLI;
            if (j > 0) {
                this.LJLLI = -1L;
                c46130I8o = new C46130I8o(j);
            } else {
                c46130I8o = null;
            }
            C78764Uvg.LJIIJ(c164106cI, str, -1, -1, Bitmap.Config.ARGB_8888, null, c46130I8o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C46127I8l(C29S c29s, LifecycleOwner owner, boolean z, I0N i0n, InterfaceC88472Yns<? super C46032I4u, C76800UCe> interfaceC88472Yns, ViewGroup viewGroup, C164106cI c164106cI, C164106cI c164106cI2, C164106cI c164106cI3, FrameLayout frameLayout, C82622Wbi diContainer, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C29901Fi LIZ;
        C29901Fi LIZIZ;
        InterfaceC74301TEb LJIIIIZZ;
        MutableLiveData LJIILL;
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = i0n;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = c164106cI3;
        this.LJLJJI = diContainer;
        this.LJLJJL = interfaceC65784Pro;
        C82632Wbs LJI = UCI.LJI(diContainer, I3X.class, null);
        this.LJLJLLL = "";
        this.LJLL = "";
        this.LJLLI = System.currentTimeMillis();
        C68322mC c68322mC = new C68322mC();
        if (z) {
            interfaceC88472Yns.invoke(new C46032I4u("show_delete_prop", null, 14));
        }
        if (c164106cI3 != null) {
            c164106cI3.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC46129I8n(this, c164106cI, z)));
        }
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new C46128I8m(this, c29s));
            if (c164106cI != null) {
                viewGroup.setOnTouchListener(new ViewOnTouchListenerC170476mZ(1.2f, 150L, c164106cI));
            }
        }
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(HNU.class, new AqS53S0400000_7(owner, viewGroup, this, c164106cI, 3));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, HNU.class);
            if (c0i6 != null) {
                HNU hnu = (HNU) c0i6;
                hnu.zu().observe(owner, new AObserverS71S0200000_7(this, c164106cI, 2));
                if (viewGroup != null) {
                    hnu.dc0(viewGroup);
                }
            }
        }
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(InterfaceC46131I8p.class, new AqS53S0400000_7(owner, viewGroup, this, frameLayout, 4));
        } else {
            C0I6 c0i62 = (C0I6) diContainer.LJIIIIZZ(null, InterfaceC46131I8p.class);
            if (c0i62 != null) {
                InterfaceC46131I8p interfaceC46131I8p = (InterfaceC46131I8p) c0i62;
                interfaceC46131I8p.ob().LIZLLL(owner, new AObjectS117S0200000_7(this, frameLayout, 5));
                if (viewGroup != null) {
                    interfaceC46131I8p.ye0(viewGroup);
                }
            }
        }
        if (i0n != null) {
            TEZ LLLLL = i0n.LLLLL();
            if (LLLLL != null && (LJIIIIZZ = LLLLL.LJIIIIZZ()) != null && (LJIILL = LJIIIIZZ.LJIILL()) != null) {
                LJIILL.observe(owner, new AObserverS67S0300000_7(this, c68322mC, c164106cI, 1));
            }
            LiveEvent<Boolean> sF = i0n.sF();
            if (sF != null) {
                sF.LIZLLL(owner, new AObjectS117S0200000_7(c164106cI2, this, 6));
            }
            LiveEvent<Boolean> V40 = i0n.V40();
            if (V40 != null) {
                V40.LIZLLL(owner, new AObjectS117S0200000_7(c164106cI, this, 7));
            }
            InterfaceC46134I8s SH = i0n.SH();
            if (SH != null && (LIZIZ = SH.LIZIZ()) != null) {
                LIZIZ.LIZLLL(owner, new AObjectS117S0200000_7(c164106cI, this, 8));
            }
            InterfaceC46134I8s SH2 = i0n.SH();
            if (SH2 != null && (LIZ = SH2.LIZ()) != null) {
                LIZ.LIZLLL(owner, new AObjectS86S0100000_7(this, 214));
            }
            LiveData<OSZ<Boolean, Boolean>> P40 = i0n.P40();
            if (P40 != null) {
                P40.observe(owner, new AObserverS75S0100000_7(this, 46));
            }
        }
        ((I3X) LJI.LIZ(this, LJLLL[0])).ck0().LIZLLL(owner, new AObjectS86S0100000_7(this, 215));
        if (z && i0n != null) {
            i0n.Sl(true, false);
        }
    }
}
