package X;

import Y.ACListenerS22S0100000_2;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5YH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5YH extends AbstractC56012Ht<C5Y5, C5YC> {
    public ViewGroup LJLIL;
    public ViewGroup LJLILLLLZI;
    public C135055Rt LJLJI;
    public C135055Rt LJLJJI;
    public View LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public final C5YI LJLJLJ;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.5YI] */
    public C5YH() {
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(55));
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(46));
        this.LJLJLJ = new C5HC() { // from class: X.5YI
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i == 4) {
                    C5YH.this.getUiActions().LJLJI.invoke();
                    return true;
                }
                return false;
            }
        };
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.unRegisterActivityOnKeyDownListener(this.LJLJLJ);
        }
    }

    @Override // X.AbstractC56012Ht, X.WM7
    public final void onResume() {
        super.onResume();
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.unRegisterActivityOnKeyDownListener(this.LJLJLJ);
            LIZIZ.registerActivityOnKeyDownListener(this.LJLJLJ);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.jkb);
            o.LJIIIIZZ(findViewById, "volumeLayout.findViewById(R.id.seekBar1)");
            this.LJLJI = (C135055Rt) findViewById;
            ViewGroup viewGroup2 = this.LJLILLLLZI;
            if (viewGroup2 != null) {
                View findViewById2 = viewGroup2.findViewById(R.id.jkc);
                o.LJIIIIZZ(findViewById2, "volumeLayout.findViewById(R.id.seekBar2)");
                this.LJLJJI = (C135055Rt) findViewById2;
                C135055Rt c135055Rt = this.LJLJI;
                if (c135055Rt != null) {
                    c135055Rt.setDisplayPercent(true);
                    C135055Rt c135055Rt2 = this.LJLJJI;
                    if (c135055Rt2 != null) {
                        c135055Rt2.setDisplayPercent(true);
                        ViewGroup viewGroup3 = this.LJLILLLLZI;
                        if (viewGroup3 != null) {
                            View findViewById3 = viewGroup3.findViewById(R.id.mdg);
                            o.LJIIIIZZ(findViewById3, "volumeLayout.findViewById(R.id.tv_people)");
                            this.LJLJJLL = (TextView) findViewById3;
                            ViewGroup viewGroup4 = this.LJLILLLLZI;
                            if (viewGroup4 != null) {
                                View findViewById4 = viewGroup4.findViewById(R.id.mdh);
                                o.LJIIIIZZ(findViewById4, "volumeLayout.findViewById(R.id.tv_people2)");
                                this.LJLJL = (TextView) findViewById4;
                                ViewGroup viewGroup5 = this.LJLILLLLZI;
                                if (viewGroup5 != null) {
                                    View findViewById5 = viewGroup5.findViewById(R.id.f02);
                                    o.LJIIIIZZ(findViewById5, "volumeLayout.findViewByI…id.iv_change_volume_next)");
                                    this.LJLJJL = findViewById5;
                                    C135055Rt c135055Rt3 = this.LJLJI;
                                    if (c135055Rt3 != null) {
                                        AbstractC143275jn.LLF.getClass();
                                        float f = 100;
                                        c135055Rt3.setMax((int) (AbstractC143275jn.LLFII * f));
                                        C135055Rt c135055Rt4 = this.LJLJJI;
                                        if (c135055Rt4 != null) {
                                            c135055Rt4.setMax((int) (AbstractC143275jn.LLI * f));
                                            ViewGroup viewGroup6 = this.LJLIL;
                                            if (viewGroup6 != null) {
                                                C16880lQ.LJIIL(viewGroup6, new ACListenerS22S0100000_2(this, 60));
                                                C135055Rt c135055Rt5 = this.LJLJJI;
                                                if (c135055Rt5 != null) {
                                                    c135055Rt5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.5YF
                                                        @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                        public final void onStartTrackingTouch(SeekBar seekBar) {
                                                            o.LJIIIZ(seekBar, "seekBar");
                                                            ((C135055Rt) seekBar).LIZIZ();
                                                        }

                                                        @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                        public final void onStopTrackingTouch(SeekBar seekBar) {
                                                            o.LJIIIZ(seekBar, "seekBar");
                                                            C135055Rt c135055Rt6 = (C135055Rt) seekBar;
                                                            c135055Rt6.LIZIZ();
                                                            C5YH.this.getUiActions().LJLJJL.invoke(Integer.valueOf(c135055Rt6.getProgress()));
                                                        }

                                                        /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
                                                        
                                                            if (r5 != 0) goto L14;
                                                         */
                                                        @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                            To view partially-correct add '--show-bad-code' argument
                                                        */
                                                        public final void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
                                                            /*
                                                                r3 = this;
                                                                java.lang.String r0 = "seekBar"
                                                                kotlin.jvm.internal.o.LJIIIZ(r4, r0)
                                                                if (r6 == 0) goto L40
                                                                X.5YH r0 = X.C5YH.this
                                                                X.5Rt r0 = r0.LJLJJI
                                                                r2 = 0
                                                                java.lang.String r1 = "musicSeekBar"
                                                                if (r0 == 0) goto L45
                                                                int r0 = r0.getMax()
                                                                if (r5 == r0) goto L26
                                                                X.5YH r0 = X.C5YH.this
                                                                X.5Rt r0 = r0.LJLJJI
                                                                if (r0 == 0) goto L41
                                                                int r0 = r0.getMax()
                                                                int r0 = r0 / 2
                                                                if (r5 == r0) goto L26
                                                                if (r5 != 0) goto L2f
                                                            L26:
                                                                X.5YH r0 = X.C5YH.this
                                                                android.content.Context r0 = r0.getSceneContext()
                                                                X.AnonymousClass632.LIZIZ(r0)
                                                            L2f:
                                                                X.5YH r0 = X.C5YH.this
                                                                java.lang.Object r0 = r0.getUiActions()
                                                                X.5YC r0 = (X.C5YC) r0
                                                                X.Yns<java.lang.Integer, X.UCe> r1 = r0.LJLILLLLZI
                                                                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                                                                r1.invoke(r0)
                                                            L40:
                                                                return
                                                            L41:
                                                                kotlin.jvm.internal.o.LJIJI(r1)
                                                                throw r2
                                                            L45:
                                                                kotlin.jvm.internal.o.LJIJI(r1)
                                                                throw r2
                                                            */
                                                            throw new UnsupportedOperationException("Method not decompiled: X.C5YF.onProgressChanged(android.widget.SeekBar, int, boolean):void");
                                                        }
                                                    });
                                                    C135055Rt c135055Rt6 = this.LJLJI;
                                                    if (c135055Rt6 != null) {
                                                        c135055Rt6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.5YG
                                                            @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                            public final void onStartTrackingTouch(SeekBar seekBar) {
                                                                o.LJIIIZ(seekBar, "seekBar");
                                                                ((C135055Rt) seekBar).LIZIZ();
                                                            }

                                                            @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                            public final void onStopTrackingTouch(SeekBar seekBar) {
                                                                o.LJIIIZ(seekBar, "seekBar");
                                                                C135055Rt c135055Rt7 = (C135055Rt) seekBar;
                                                                c135055Rt7.LIZIZ();
                                                                C5YH.this.getUiActions().LJLJJI.invoke(Integer.valueOf(c135055Rt7.getProgress()));
                                                            }

                                                            /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
                                                            
                                                                if (r5 != 0) goto L14;
                                                             */
                                                            @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                To view partially-correct add '--show-bad-code' argument
                                                            */
                                                            public final void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
                                                                /*
                                                                    r3 = this;
                                                                    java.lang.String r0 = "seekBar"
                                                                    kotlin.jvm.internal.o.LJIIIZ(r4, r0)
                                                                    if (r6 == 0) goto L40
                                                                    X.5YH r0 = X.C5YH.this
                                                                    X.5Rt r0 = r0.LJLJI
                                                                    r2 = 0
                                                                    java.lang.String r1 = "voiceSeekBar"
                                                                    if (r0 == 0) goto L45
                                                                    int r0 = r0.getMax()
                                                                    if (r5 == r0) goto L26
                                                                    X.5YH r0 = X.C5YH.this
                                                                    X.5Rt r0 = r0.LJLJI
                                                                    if (r0 == 0) goto L41
                                                                    int r0 = r0.getMax()
                                                                    int r0 = r0 / 2
                                                                    if (r5 == r0) goto L26
                                                                    if (r5 != 0) goto L2f
                                                                L26:
                                                                    X.5YH r0 = X.C5YH.this
                                                                    android.content.Context r0 = r0.getSceneContext()
                                                                    X.AnonymousClass632.LIZIZ(r0)
                                                                L2f:
                                                                    X.5YH r0 = X.C5YH.this
                                                                    java.lang.Object r0 = r0.getUiActions()
                                                                    X.5YC r0 = (X.C5YC) r0
                                                                    X.Yns<java.lang.Integer, X.UCe> r1 = r0.LJLIL
                                                                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                                                                    r1.invoke(r0)
                                                                L40:
                                                                    return
                                                                L41:
                                                                    kotlin.jvm.internal.o.LJIJI(r1)
                                                                    throw r2
                                                                L45:
                                                                    kotlin.jvm.internal.o.LJIJI(r1)
                                                                    throw r2
                                                                */
                                                                throw new UnsupportedOperationException("Method not decompiled: X.C5YG.onProgressChanged(android.widget.SeekBar, int, boolean):void");
                                                            }
                                                        });
                                                        View view = this.LJLJJL;
                                                        if (view != null) {
                                                            C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 61), view);
                                                            ViewGroup viewGroup7 = this.LJLIL;
                                                            if (viewGroup7 != null) {
                                                                C16880lQ.LJIIL(viewGroup7, new ACListenerS22S0100000_2(this, 62));
                                                                ViewGroup viewGroup8 = this.LJLILLLLZI;
                                                                if (viewGroup8 != null) {
                                                                    C16880lQ.LJIIL(viewGroup8, new View.OnClickListener() { // from class: X.5YL
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view2) {
                                                                        }
                                                                    });
                                                                    AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5YJ
                                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                                        public final Object get(Object obj) {
                                                                            return Boolean.valueOf(((C5Y5) obj).LIZLLL);
                                                                        }
                                                                    }, null, new AqS168S0100000_2(this, 316), 2, null);
                                                                    AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Y9
                                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                                        public final Object get(Object obj) {
                                                                            return Boolean.valueOf(((C5Y5) obj).LJ);
                                                                        }
                                                                    }, null, new AqS168S0100000_2(this, 317), 2, null);
                                                                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5Y0
                                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                                        public final Object get(Object obj) {
                                                                            return ((C5Y5) obj).LJIIIIZZ;
                                                                        }
                                                                    }, null, new AqS168S0100000_2(this, 311), 2, null);
                                                                    AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Y4
                                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                                        public final Object get(Object obj) {
                                                                            return Integer.valueOf(((C5Y5) obj).LIZ);
                                                                        }
                                                                    }, null, new AqS168S0100000_2(this, 312), 2, null);
                                                                    AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Y2
                                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                                        public final Object get(Object obj) {
                                                                            return Integer.valueOf(((C5Y5) obj).LIZIZ);
                                                                        }
                                                                    }, null, new AqS168S0100000_2(this, 313), 2, null);
                                                                    AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Y6
                                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                                        public final Object get(Object obj) {
                                                                            return ((C5Y5) obj).LJI;
                                                                        }
                                                                    }, null, new AqS168S0100000_2(this, 314), 2, null);
                                                                    AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Y7
                                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                                        public final Object get(Object obj) {
                                                                            return ((C5Y5) obj).LJII;
                                                                        }
                                                                    }, null, new AqS168S0100000_2(this, 315), 2, null);
                                                                    return;
                                                                }
                                                                o.LJIJI("volumeLayout");
                                                                throw null;
                                                            }
                                                            o.LJIJI("parentLayout");
                                                            throw null;
                                                        }
                                                        o.LJIJI("changeVolumeNext");
                                                        throw null;
                                                    }
                                                    o.LJIJI("voiceSeekBar");
                                                    throw null;
                                                }
                                                o.LJIJI("musicSeekBar");
                                                throw null;
                                            }
                                            o.LJIJI("parentLayout");
                                            throw null;
                                        }
                                        o.LJIJI("musicSeekBar");
                                        throw null;
                                    }
                                    o.LJIJI("voiceSeekBar");
                                    throw null;
                                }
                                o.LJIJI("volumeLayout");
                                throw null;
                            }
                            o.LJIJI("volumeLayout");
                            throw null;
                        }
                        o.LJIJI("volumeLayout");
                        throw null;
                    }
                    o.LJIJI("musicSeekBar");
                    throw null;
                }
                o.LJIJI("voiceSeekBar");
                throw null;
            }
            o.LJIJI("volumeLayout");
            throw null;
        }
        o.LJIJI("volumeLayout");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ccx, viewGroup, false, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.LJLIL = viewGroup2;
        View findViewById = viewGroup2.findViewById(R.id.ne3);
        o.LJIIIIZZ(findViewById, "layout.findViewById(R.id.volume_layout)");
        this.LJLILLLLZI = (ViewGroup) findViewById;
        return viewGroup2;
    }
}
