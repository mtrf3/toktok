package X;

import Y.AObserverS58S0101000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS0S0103000_2;
import Y.IDCListenerS156S0100000_2;
import Y.IDCListenerS77S0000000_2;
import Y.IDObjectS384S0100000_2;
import Y.IDObserverS9S0101000;
import Y.IDTListenerS69S0000000_2;
import Y.IDiS266S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectState;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6lQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169766lQ extends WM7 implements InterfaceC143795kd {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 972));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C170146m2.LJLIL);

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

    public final C169786lS LLJILJIL() {
        return (C169786lS) this.LJLILLLLZI.getValue();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        C162626Zu c162626Zu;
        C169976ll c169976ll;
        super.onDestroyView();
        C169786lS LLJILJIL = LLJILJIL();
        InterfaceC153045zY interfaceC153045zY = LLJILJIL.LJJIFFI;
        if (interfaceC153045zY != null && (c169976ll = LLJILJIL.LJJIIJ) != null) {
            interfaceC153045zY.LLFF(c169976ll);
        }
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = LLJILJIL.LJIJJLI;
        if (viewOnTouchListenerC141755hL != null && (viewOnTouchListenerC141755hL.getAdapter() instanceof C162626Zu) && (c162626Zu = (C162626Zu) LLJILJIL.LJIJJLI.getAdapter()) != null) {
            C73411SrX c73411SrX = c162626Zu.LJLJL;
            o.LJI(c73411SrX);
            c73411SrX.dispose();
        }
        C170206m8 c170206m8 = LLJILJIL.LJJJJLI;
        if (c170206m8 != null) {
            InterfaceC84498XEg interfaceC84498XEg = (InterfaceC84498XEg) c170206m8.LIZ;
            if (interfaceC84498XEg != null) {
                interfaceC84498XEg.destroy();
            }
            c170206m8.LIZ = null;
        }
        C170226mA c170226mA = LLJILJIL.LJJIJIIJI;
        if (c170226mA != null) {
            c170226mA.LJLLILLLL.LJFF();
        }
    }

    @Override // X.WM7
    public final void onStart() {
        super.onStart();
        C169786lS LLJILJIL = LLJILJIL();
        RunnableC169906le runnableC169906le = LLJILJIL.LJJIIZ;
        if (runnableC169906le != null) {
            LLJILJIL.LJI.post(runnableC169906le);
        }
        RunnableC170016lp runnableC170016lp = LLJILJIL.LJJIIZI;
        if (runnableC170016lp != null) {
            LLJILJIL.LJI.post(runnableC170016lp);
        }
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        LLJILJIL().LJI.removeCallbacksAndMessages(null);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        int i;
        super.onActivityCreated(bundle);
        C169786lS LLJILJIL = LLJILJIL();
        LLJILJIL.getClass();
        LLJILJIL.LJJIJIL = (ActivityC45651qj) this.mActivity;
        LLJILJIL.LJII = this;
        LLJILJIL.LJJJLL = C163756bj.LIZIZ(this);
        LLJILJIL.LJJJJJ = new SafeHandler(this);
        LLJILJIL.LJI = new SafeHandler(LLJILJIL.LJII);
        LLJILJIL.LIZ = LLJILJIL.LJJJJL.LLLLIL();
        LLJILJIL.LJJJJIZL = LLJILJIL.LJJJJL.x7();
        LLJILJIL.LJJJJI = LLJILJIL.LJJJJL.C0();
        LLJILJIL.LJJIFFI = LLJILJIL.LJJJJL.LIZIZ().getValue();
        final C169786lS LLJILJIL2 = LLJILJIL();
        View findViewById = findViewById(R.id.jbj);
        LLJILJIL2.LJJIJ = findViewById;
        LLJILJIL2.LJIIIIZZ = (C169796lT) findViewById.findViewById(R.id.ct0);
        LLJILJIL2.LJIIIZ = (LinearLayout) LLJILJIL2.LJJIJ.findViewById(R.id.jkr);
        LLJILJIL2.LJIIJ = (FrameLayout) LLJILJIL2.LJJIJ.findViewById(R.id.bup);
        LLJILJIL2.LJIIJJI = (ImageView) LLJILJIL2.LJJIJ.findViewById(R.id.f8p);
        LLJILJIL2.LJIIL = (RelativeLayout) LLJILJIL2.LJJIJ.findViewById(R.id.j4r);
        LLJILJIL2.LJIILIIL = (TextView) LLJILJIL2.LJJIJ.findViewById(R.id.m63);
        LLJILJIL2.LJIILJJIL = (RelativeLayout) LLJILJIL2.LJJIJ.findViewById(R.id.csx);
        RelativeLayout relativeLayout = (RelativeLayout) LLJILJIL2.LJJIJ.findViewById(R.id.n9k);
        LLJILJIL2.LJIILL = (LinearLayout) LLJILJIL2.LJJIJ.findViewById(R.id.g82);
        LLJILJIL2.LJIILLIIL = (C42880GsG) LLJILJIL2.LJJIJ.findViewById(R.id.g8y);
        LLJILJIL2.LJIIZILJ = (TextView) LLJILJIL2.LJJIJ.findViewById(R.id.mij);
        LLJILJIL2.LJIJ = (TextView) LLJILJIL2.LJJIJ.findViewById(R.id.m1h);
        LLJILJIL2.LJIJI = (VWL) LLJILJIL2.LJJIJ.findViewById(R.id.ncx);
        LLJILJIL2.LJIJJ = (C80698Vlm) LLJILJIL2.LJJIJ.findViewById(R.id.kyt);
        LLJILJIL2.LJIL = (ViewOnTouchListenerC82857WfV) LLJILJIL2.LJJIJ.findViewById(R.id.n5k);
        if (!LLJILJIL2.LJJJJZ) {
            LLJILJIL2.LJIJJLI = (ViewOnTouchListenerC141755hL) LLJILJIL2.LJJIJ.findViewById(R.id.bbc);
        }
        LLJILJIL2.LJJIJ.setOnTouchListener(new IDTListenerS69S0000000_2(4));
        AbstractViewOnClickListenerC81978WFi abstractViewOnClickListenerC81978WFi = new AbstractViewOnClickListenerC81978WFi() { // from class: X.6lY
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractViewOnClickListenerC81978WFi
            public final void LIZ(View view) {
                C169786lS c169786lS = C169786lS.this;
                C5RT c5rt = (C5RT) c169786lS.LIZJ.getValue();
                if (c5rt != null && c5rt.LJI == 0) {
                    return;
                }
                int id = view.getId();
                if (id == R.id.f8p) {
                    c169786lS.LIZJ();
                    return;
                }
                if (id == R.id.m1h) {
                    if (c169786lS.LJJJI.equals(c169786lS.LJJJIL) && (c169786lS.LJ.getValue() == 0 || ((C5RV.LJI().equals(c169786lS.LJ.getValue()) && c169786lS.LJJIL == null) || ((C5RV) c169786lS.LJ.getValue()).equals(c169786lS.LJJIL)))) {
                        c169786lS.LJJJJ = 1;
                        c169786lS.LJIILIIL();
                        c169786lS.LJIJI();
                        return;
                    }
                    ActivityC45651qj activityC45651qj = c169786lS.LJJIJIL;
                    C170066lu c170066lu = new C170066lu(activityC45651qj);
                    c170066lu.LIZ = activityC45651qj.getString(R.string.exf);
                    IDCListenerS77S0000000_2 iDCListenerS77S0000000_2 = new IDCListenerS77S0000000_2(1);
                    c170066lu.LIZLLL = activityC45651qj.getString(R.string.cg_);
                    c170066lu.LJFF = iDCListenerS77S0000000_2;
                    IDCListenerS156S0100000_2 iDCListenerS156S0100000_2 = new IDCListenerS156S0100000_2(c169786lS, 17);
                    c170066lu.LIZJ = activityC45651qj.getString(R.string.exe);
                    c170066lu.LJ = iDCListenerS156S0100000_2;
                    new C172106pC(c170066lu).LIZ();
                    return;
                }
                if (id == R.id.mij) {
                    c169786lS.LJJJJ = 2;
                    c169786lS.LJIILIIL();
                    c169786lS.LJIJI();
                    c169786lS.LJIILLIIL();
                    return;
                }
                if (id != R.id.n9k) {
                    return;
                }
                InterfaceC153045zY interfaceC153045zY = c169786lS.LJJIFFI;
                if (interfaceC153045zY == null || interfaceC153045zY.getState() != VEEditor.VEState.STARTED) {
                    c169786lS.LIZJ();
                } else {
                    c169786lS.LJIIJ();
                }
            }
        };
        C16880lQ.LJIILLIIL(LLJILJIL2.LJIIJJI, abstractViewOnClickListenerC81978WFi);
        C16880lQ.LJIJ(relativeLayout, abstractViewOnClickListenerC81978WFi);
        C16880lQ.LJIJI(LLJILJIL2.LJIJ, abstractViewOnClickListenerC81978WFi);
        C16880lQ.LJIJI(LLJILJIL2.LJIIZILJ, abstractViewOnClickListenerC81978WFi);
        LLJILJIL2.LJJIIJZLJL = C07290Qj.LJIIL(AnonymousClass636.LJIIIIZZ(R.attr.e2, LLJILJIL2.LJJIJIL), 204);
        LLJILJIL2.LJJIJIL.obtainStyledAttributes(new int[]{R.attr.yo, R.attr.yp, R.attr.a50, R.attr.ag6, R.attr.aop, R.attr.b4e, R.attr.ba_, R.attr.baa}).recycle();
        LLJILJIL2.LJIIIIZZ.setVideoDuration(LLJILJIL2.LJJIFFI.LLIZLLLIL());
        LLJILJIL2.LJJ(0, false);
        LLJILJIL2.LJIIIIZZ.setNormalColor(0);
        LLJILJIL2.LJIIIIZZ.setOverlayColor(LLJILJIL2.LJJIIJZLJL);
        C42880GsG c42880GsG = LLJILJIL2.LJIILLIIL;
        if (c42880GsG != null) {
            C42881GsH LIZ = C42881GsH.LIZ(LLJILJIL2.LJJIJIL);
            LIZ.LJ = 1;
            c42880GsG.setBuilder(LIZ);
        }
        C170226mA c170226mA = new C170226mA(LLJILJIL2.LJJIJIL, LLJILJIL2.LJJIJIL.getSupportFragmentManager());
        LLJILJIL2.LJJIJIIJI = c170226mA;
        c170226mA.LJLLJ = !LLJILJIL2.LJIL();
        LLJILJIL2.LJIJI.setOffscreenPageLimit(1);
        LLJILJIL2.LJIJI.setNoScroll(true);
        C80698Vlm c80698Vlm = LLJILJIL2.LJIJJ;
        c80698Vlm.getClass();
        c80698Vlm.setTabMargin(C82852WfQ.LIZ().LJ);
        LLJILJIL2.LJIJJ.setDefaultAddTab(false);
        LLJILJIL2.LJIJJ.setupWithViewPager(LLJILJIL2.LJIJI);
        LLJILJIL2.LJIJI.clearOnPageChangeListeners();
        LLJILJIL2.LJIJI.addOnPageChangeListener(new C80699Vln(LLJILJIL2.LJIJJ));
        IDiS266S0100000_2 iDiS266S0100000_2 = new IDiS266S0100000_2(LLJILJIL2, 7);
        LLJILJIL2.LJJJJLL = iDiS266S0100000_2;
        LLJILJIL2.LJIJI.addOnPageChangeListener(iDiS266S0100000_2);
        C5SC.LJFF();
        LLJILJIL2.LJIJJ(true);
        if (LLJILJIL2.LJJJJLI == null) {
            LLJILJIL2.LJJJJLI = new C170206m8(1);
        }
        LLJILJIL2.LJJJJLI.LIZ(new IDObjectS384S0100000_2(LLJILJIL2, 8));
        LLJILJIL2.LJIIIIZZ();
        LLJILJIL2.LJIIJJI.setVisibility(0);
        int LIZJ = (int) KL2.LIZJ(LLJILJIL2.LJJIJIL, 28.0f);
        int LIZJ2 = (int) KL2.LIZJ(LLJILJIL2.LJJIJIL, 28.0f);
        int ceil = (int) Math.ceil((KL2.LJIIJJI(LLJILJIL2.LJJIJIL) - (Math.round(KL2.LIZJ(LLJILJIL2.LJJIJIL, 24.0f)) * 2)) / (LIZJ2 * 1.0f));
        if (C6WA.LIZ()) {
            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
        } else {
            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
        }
        LLJILJIL2.LJJI = new VEVideoCoverGeneratorImpl(LLJILJIL2.LJJIFFI, C78840Uwu.LJJIJIIJIL(LLJILJIL2.LJJIJ), ceil, get_frames_flags, "special_effects");
        LLJILJIL2.LJJIII = new WFB(LLJILJIL2.LJJI, LIZJ2, LIZJ, ceil);
        if (LLJILJIL2.LJJJJZ) {
            LLJILJIL2.LJII();
        } else {
            ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = LLJILJIL2.LJIJJLI;
            if (viewOnTouchListenerC141755hL != null) {
                viewOnTouchListenerC141755hL.LIZLLL();
                LLJILJIL2.LJIJJLI.setLayoutManager(new LinearLayoutManager(0, false));
                LLJILJIL2.LJIJJLI.post(new ARunnableS0S0103000_2(LLJILJIL2, ceil, LIZJ2, LIZJ, 1));
            }
        }
        LLJILJIL2.LJIIIIZZ.setOnCursorSeekListener(new InterfaceC170186m6() { // from class: X.6lf
            public VEEditor.VEState LIZ;

            @Override // X.InterfaceC170186m6
            public final void LIZ(int i2, int i3, int i4) {
                C5MM LIZLLL;
                C169786lS c169786lS = C169786lS.this;
                if (c169786lS.LJJIFFI != null && i3 == 1) {
                    C170036lr c170036lr = c169786lS.LJJII;
                    long j = i2;
                    long LIZ2 = c170036lr.LIZ(j);
                    if (i4 == 1) {
                        this.LIZ = C169786lS.this.LJJIFFI.getState();
                        LIZLLL = C5MM.LIZIZ(LIZ2);
                    } else if (i4 == 3) {
                        LIZLLL = C5MM.LIZIZ(LIZ2);
                    } else if (i4 == 2) {
                        LIZLLL = C5MM.LIZLLL(LIZ2);
                    } else {
                        throw new AssertionError();
                    }
                    C169786lS.this.LIZLLL.setValue(LIZLLL);
                    C169786lS c169786lS2 = C169786lS.this;
                    C170006lo c170006lo = c169786lS2.LJJIZ;
                    c170006lo.LIZIZ = LIZ2;
                    c170006lo.LIZJ = j;
                    if (i4 == 2 && this.LIZ == VEEditor.VEState.STARTED) {
                        c169786lS2.LJIIJ();
                        this.LIZ = null;
                    }
                }
            }
        });
        LLJILJIL2.LJJII = new C170036lr(LLJILJIL2);
        ReplayLiveData<C5RT> LJI = LLJILJIL2.LJJJJL.LJI();
        LLJILJIL2.LIZJ = LJI;
        LJI.observe(LLJILJIL2.LJII, new AObserverS58S0101000_2(1, LLJILJIL2, 10));
        LLJILJIL2.LJFF = LLJILJIL2.LJJJJL.LJIIIZ();
        MutableLiveData<C5MM> LJIIIIZZ = LLJILJIL2.LJJJJL.LJIIIIZZ();
        LLJILJIL2.LIZLLL = LJIIIIZZ;
        LJIIIIZZ.observe(LLJILJIL2.LJII, new IDObserverS9S0101000(1, LLJILJIL2, 10));
        StoredLiveData<C5RV> LJFF = LLJILJIL2.LJJJJL.LJFF();
        LLJILJIL2.LJ = LJFF;
        C5RV value = LJFF.getValue();
        if (value != null) {
            String str = value.LJLIL;
            str.getClass();
            switch (str.hashCode()) {
                case C61447O9r.LJIIJ:
                    if (str.equals("1")) {
                        i = 1;
                        EffectPointModel effectPointModel = new EffectPointModel();
                        LLJILJIL2.LJJIJL = effectPointModel;
                        effectPointModel.setType(2);
                        LLJILJIL2.LJJIJL.setCategory("time");
                        LLJILJIL2.LJJIJL.setStartPoint((int) value.LJLILLLLZI);
                        LLJILJIL2.LJJIJL.setEndPoint((int) value.LJLJI);
                        LLJILJIL2.LJJIJL.setUiStartPoint((int) value.LJLILLLLZI);
                        LLJILJIL2.LJJIJL.setUiEndPoint((int) value.LJLJI);
                        LLJILJIL2.LJJIJL.setKey(((EffectModel) ListProtector.get(C5SC.LJ(), i)).key);
                        LLJILJIL2.LJJIJL.setName(((EffectModel) ListProtector.get(C5SC.LJ(), i)).name);
                        break;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        i = 2;
                        EffectPointModel effectPointModel2 = new EffectPointModel();
                        LLJILJIL2.LJJIJL = effectPointModel2;
                        effectPointModel2.setType(2);
                        LLJILJIL2.LJJIJL.setCategory("time");
                        LLJILJIL2.LJJIJL.setStartPoint((int) value.LJLILLLLZI);
                        LLJILJIL2.LJJIJL.setEndPoint((int) value.LJLJI);
                        LLJILJIL2.LJJIJL.setUiStartPoint((int) value.LJLILLLLZI);
                        LLJILJIL2.LJJIJL.setUiEndPoint((int) value.LJLJI);
                        LLJILJIL2.LJJIJL.setKey(((EffectModel) ListProtector.get(C5SC.LJ(), i)).key);
                        LLJILJIL2.LJJIJL.setName(((EffectModel) ListProtector.get(C5SC.LJ(), i)).name);
                        break;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        i = 3;
                        EffectPointModel effectPointModel22 = new EffectPointModel();
                        LLJILJIL2.LJJIJL = effectPointModel22;
                        effectPointModel22.setType(2);
                        LLJILJIL2.LJJIJL.setCategory("time");
                        LLJILJIL2.LJJIJL.setStartPoint((int) value.LJLILLLLZI);
                        LLJILJIL2.LJJIJL.setEndPoint((int) value.LJLJI);
                        LLJILJIL2.LJJIJL.setUiStartPoint((int) value.LJLILLLLZI);
                        LLJILJIL2.LJJIJL.setUiEndPoint((int) value.LJLJI);
                        LLJILJIL2.LJJIJL.setKey(((EffectModel) ListProtector.get(C5SC.LJ(), i)).key);
                        LLJILJIL2.LJJIJL.setName(((EffectModel) ListProtector.get(C5SC.LJ(), i)).name);
                        break;
                    }
                    break;
            }
        }
        LLJILJIL2.LJJJJJL.jv0().observe(LLJILJIL2.LJII, new AObserverS58S0101000_2(1, LLJILJIL2, 11));
        ((LiveData) LLJILJIL2.LJJJJJL.LJLLJ.getValue()).observe(LLJILJIL2.LJII, new IDObserverS9S0101000(2, LLJILJIL2, 7));
        LLJILJIL2.LJJJJL.LIZ().observe(LLJILJIL2.LJII, new AObserverS58S0101000_2(1, LLJILJIL2, 19));
        LLJILJIL2.LJJJI = LLJILJIL2.LJJJJL.J7();
        LLJILJIL2.LJJJJJL.mv0().observe(LLJILJIL2.LJII, new AObserverS58S0101000_2(0, LLJILJIL2, 17));
        LLJILJIL2.LJIIJ();
        LLJILJIL().LJJJJJL.pv0().observe(this, new AObserverS70S0100000_2(this, 307));
        ((LiveData) LLJILJIL().LJJJJJL.LJLLL.getValue()).observe(this, new AObserverS70S0100000_2(this, 308));
        C73297Sph.LIZLLL(this, (JediViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.62G
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditEffectState) obj).getSetVideoLength();
            }
        }, new AqS184S0100000_2(this, 77));
        C73297Sph.LIZLLL(this, (JediViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.62H
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditEffectState) obj).getRegenerateReverseVideo();
            }
        }, new AqS184S0100000_2(this, 78));
        C73297Sph.LIZLLL(this, (JediViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.62F
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditEffectState) obj).getRefreshCoverEvent();
            }
        }, new AqS184S0100000_2(this, 79));
        C73297Sph.LIZLLL(this, (JediViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.62I
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditEffectState) obj).getUpdateEffectTime();
            }
        }, new AqS184S0100000_2(this, 76));
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cd4, viewGroup, false, "inflater.inflate(R.layou…effect, container, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
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
