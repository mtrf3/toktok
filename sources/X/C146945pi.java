package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5pi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146945pi extends WMH implements InterfaceC143795kd, InterfaceC150315v9, InterfaceC150395vH, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final C5H3 LJLILLLLZI;
    public InterfaceC152085y0 LJLJI;
    public AnonymousClass655 LJLJJI;
    public C6CQ LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public FrameLayout LJLL;
    public boolean LJLLI;
    public InterfaceC137115Zr LJLLILLLL;
    public final C5H3 LJLLJ;
    public InterfaceC146845pY LJLLL;
    public final C62822Ol8 LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;

    @Override // X.InterfaceC150315v9
    public final void LJI() {
    }

    @Override // X.InterfaceC150315v9
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.InterfaceC150315v9
    public final void LJLJJL() {
    }

    @Override // X.InterfaceC150395vH
    public final void O9(Effect effect, String str) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.InterfaceC150395vH
    public final void s1() {
    }

    @Override // X.InterfaceC150315v9
    public final boolean LJL() {
        List<C67P> LJZL;
        InterfaceC146845pY interfaceC146845pY = this.LJLLL;
        if (interfaceC146845pY == null || (LJZL = interfaceC146845pY.LJZL()) == null || LJZL.isEmpty()) {
            return false;
        }
        Iterator<C67P> it = LJZL.iterator();
        while (it.hasNext()) {
            TextStickerData data = it.next().getData();
            if (data != null && data.getHasReadTextAudio()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC150315v9
    public final List<TextStickerData> LJLLLL() {
        List<C67P> LJZL;
        InterfaceC146845pY interfaceC146845pY = this.LJLLL;
        if (interfaceC146845pY != null && (LJZL = interfaceC146845pY.LJZL()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJZL, 10));
            Iterator<C67P> it = LJZL.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().LJ());
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public final InterfaceC146925pg LLJILJIL() {
        return (InterfaceC146925pg) this.LJLLJ.getValue();
    }

    public final VideoPublishEditModel LLJILJILJ() {
        return (VideoPublishEditModel) this.LJLJJLL.getValue();
    }

    public final FTCEditStickerViewModel LLJJ() {
        return (FTCEditStickerViewModel) this.LJLJLLL.getValue();
    }

    public final void LLJJIII() {
        if (!this.LJLLLLLL) {
            this.LJLLLLLL = true;
            LLJILJIL().show();
            getEditPreviewApi().PM().observe(this, new AObserverS70S0100000_2(this, 318));
        }
    }

    @Override // X.InterfaceC150315v9
    public final boolean LLZZ() {
        InterfaceC146845pY interfaceC146845pY = this.LJLLL;
        if (interfaceC146845pY == null || !interfaceC146845pY.LJJL()) {
            return false;
        }
        return true;
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLILLLLZI.getValue();
    }

    public final void LLJJIJI() {
        OSZ<Integer, Integer> osz;
        VESize LLILZ;
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null && (LLILZ = value.LLILZ()) != null) {
            osz = new OSZ<>(Integer.valueOf(LLILZ.width), Integer.valueOf(LLILZ.height));
        } else {
            osz = null;
        }
        InterfaceC146845pY interfaceC146845pY = this.LJLLL;
        if (interfaceC146845pY != null) {
            interfaceC146845pY.LLILLIZIL(osz);
        }
    }

    @Override // X.InterfaceC150395vH
    public final void W3() {
        getEditPreviewApi().U2(false, false, false);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
        o.LJI(LJJLIIIJJI);
        return LJJLIIIJJI;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        InterfaceC146845pY interfaceC146845pY = this.LJLLL;
        if (interfaceC146845pY != null) {
            interfaceC146845pY.J6();
        }
        this.LJLLI = false;
    }

    public C146945pi(C82622Wbi rootIOCContainer) {
        o.LJIIIZ(rootIOCContainer, "rootIOCContainer");
        this.LJLIL = rootIOCContainer;
        this.LJLILLLLZI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1009));
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1007));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1008));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1010));
        this.LJLLJ = C269113v.LIZ(this, InterfaceC146925pg.class);
        this.LJLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1011));
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        C29901Fi<Boolean> o;
        C29901Fi<OSZ<Boolean, Boolean>> LLILLJJLI;
        C29901Fi<C76800UCe> LLZZZZ;
        super.onActivityCreated(bundle);
        C78688UuS.LJIIIZ(this, false, new AqS168S0100000_2(this, 627));
        C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 628));
        this.LJLLL = (InterfaceC146845pY) getDiContainer().LJ(InterfaceC146845pY.class, null);
        LLJJ().sH().observe(this, new AObserverS70S0100000_2(this, 320));
        LLJJ().yf0().observe(this, new AObserverS70S0100000_2(this, 322));
        LLJJ().A10().observe(this, new AObserverS70S0100000_2(this, 323));
        C73297Sph.LJIIJJI(this, LLJJ(), new TBT() { // from class: X.5pq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getPollTextAnimEvent();
            }
        }, new AqS184S0100000_2(this, 88));
        C73297Sph.LJIIJJI(this, LLJJ(), new TBT() { // from class: X.5pr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getPollTextLayoutEvent();
            }
        }, new AqS184S0100000_2(this, 89));
        C73156SnQ.LJIIIIZZ(this, LLJJ(), new TBT() { // from class: X.5pl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getPollingTopMargin();
            }
        }, new AqS184S0100000_2(this, 82));
        C73297Sph.LIZLLL(this, LLJJ(), new TBT() { // from class: X.5pn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getViewRenderStickerVisibleEvent();
            }
        }, new AqS184S0100000_2(this, 84));
        C73297Sph.LIZLLL(this, LLJJ(), new TBT() { // from class: X.5po
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getVideoLengthUpdateEvent();
            }
        }, new AqS184S0100000_2(this, 85));
        C73297Sph.LIZLLL(this, LLJJ(), new TBT() { // from class: X.5pm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getRefreshVideoSource();
            }
        }, new AqS184S0100000_2(this, 86));
        C73297Sph.LIZLLL(this, LLJJ(), new TBT() { // from class: X.5pp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getUpdateStickerTime();
            }
        }, new AqS184S0100000_2(this, 87));
        InterfaceC146845pY interfaceC146845pY = this.LJLLL;
        if (interfaceC146845pY != null && (LLZZZZ = interfaceC146845pY.LLZZZZ()) != null) {
            LLZZZZ.LIZLLL(this, new AObjectS84S0100000_2(this, 285));
        }
        LLJJ().N4().observe(this, new AObserverS70S0100000_2(this, 319));
        InterfaceC146845pY interfaceC146845pY2 = this.LJLLL;
        if (interfaceC146845pY2 != null) {
            interfaceC146845pY2.LJIIL(LLJJ().N4());
        }
        InterfaceC146845pY interfaceC146845pY3 = this.LJLLL;
        if (interfaceC146845pY3 != null && (LLILLJJLI = interfaceC146845pY3.LLILLJJLI()) != null) {
            LLILLJJLI.LIZLLL(this, new AObjectS84S0100000_2(this, 286));
        }
        InterfaceC146845pY interfaceC146845pY4 = this.LJLLL;
        if (interfaceC146845pY4 != null && (o = interfaceC146845pY4.o()) != null) {
            o.LIZLLL(this, new AObjectS84S0100000_2(this, 287));
        }
        getEditPreviewApi().PM().observe(this, new AObserverS70S0100000_2(this, 321));
        if (this.LJLJJL == null) {
            C6CQ c6cq = new C6CQ();
            this.LJLJJL = c6cq;
            add(R.id.ml_, c6cq, "StickerHintTextScene");
        }
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.l5i);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.text_sticker_layout_layer)");
        this.LJLL = (FrameLayout) requireViewById;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC150315v9
    public final C10K<C76800UCe> LLIIJLIL(InterfaceC153045zY interfaceC153045zY, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
        o.LJIIIZ(compileCallback, "compileCallback");
        C10K<C76800UCe> LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
        o.LJIIIIZZ(LJIIIZ, "forResult(Unit)");
        return LJIIIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r2 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C10K<X.C76800UCe> LLJJI(X.InterfaceC153045zY r9, X.InterfaceC137115Zr r10, X.InterfaceC88471Ynr<? super java.lang.String, ? super X.EnumC43649HBd, java.lang.String> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "compileCallback"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            X.5pY r0 = r8.LJLLL
            if (r0 == 0) goto L77
            boolean r1 = r0.LJJL()
            r0 = 1
            if (r1 != r0) goto L77
            if (r11 == 0) goto L1e
            java.lang.String r1 = "text_sticker"
            X.HBd r0 = X.EnumC43649HBd.TEXT_STICKER
            java.lang.Object r3 = r11.invoke(r1, r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L2a
        L1e:
            X.6nc r1 = X.C5YW.LIZIZ()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LLJILJILJ()
            java.lang.String r3 = X.C164746dK.LJIIIZ(r1, r0)
        L2a:
            X.5qN r0 = r10.LJLLL()
            int r4 = r0.LIZLLL()
            X.5qN r0 = r10.LJLLL()
            int r5 = r0.LJI()
            com.ss.android.vesdk.VESize r0 = r9.LLILZ()
            int r6 = r0.width
            com.ss.android.vesdk.VESize r0 = r9.LLILZ()
            int r7 = r0.height
            X.5pY r1 = r8.LJLLL
            if (r1 == 0) goto L59
            X.67j r2 = new X.67j
            r2.<init>(r3, r4, r5, r6, r7)
            android.widget.FrameLayout r0 = r8.LJLL
            if (r0 == 0) goto L83
            X.10K r2 = r1.mx(r2, r0)
            if (r2 != 0) goto L64
        L59:
            X.5pk<V> r0 = new java.util.concurrent.Callable() { // from class: X.5pk
                static {
                    /*
                        X.5pk r0 = new X.5pk
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.5pk<V>) X.5pk.LJLIL X.5pk
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC146965pk.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC146965pk.<init>():void");
                }

                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    /*
                        r1 = this;
                        X.OQg r0 = X.C61878OQg.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC146965pk.call():java.lang.Object");
                }
            }
            X.10K r2 = X.C10K.LIZ(r0)
            java.lang.String r0 = "call {\n                r…leResult>()\n            }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L64:
            Y.AgS107S0200000_2 r1 = new Y.AgS107S0200000_2
            r0 = 11
            r1.<init>(r9, r10, r0)
            X.10C r0 = X.C10K.LJIIIIZZ
            X.10K r1 = r2.LJIILLIIL(r1, r0)
            java.lang.String r0 = "editor: IASVEEditor,\n   …HREAD_EXECUTOR)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L76:
            return r1
        L77:
            X.UCe r0 = X.C76800UCe.LIZ
            X.10K r1 = X.C10K.LJIIIZ(r0)
            java.lang.String r0 = "{\n            Task.forResult(Unit)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L76
        L83:
            java.lang.String r0 = "textLayout"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146945pi.LLJJI(X.5zY, X.5Zr, X.Ynr):X.10K");
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cd7, viewGroup, false, "null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
