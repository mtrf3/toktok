package X;

import Y.ACListenerS34S0100000_14;
import Y.AObjectS86S0100000_7;
import Y.AObserverS75S0100000_7;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wdd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82741Wdd extends AbstractC56012Ht<C82750Wdm, C82746Wdi> implements G7O {
    public final C0IB<Boolean> LJLIL;
    public final ShortVideoContext LJLILLLLZI;
    public TuxIconView LJLJI;
    public TuxTextView LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public ViewGroup LJLJL;
    public FrameLayout LJLJLJ;
    public TuxTextView LJLJLLL;
    public TuxIconView LJLL;
    public TuxTextView LJLLI;
    public View LJLLILLLL;
    public ViewGroup LJLLJ;
    public C131905Fq LJLLL;
    public C46026I4o LJLLLL;
    public ViewGroup LJLLLLLL;
    public ViewGroup LJLZ;
    public TuxTextView LJZ;

    public boolean LLJILJILJ() {
        return false;
    }

    @Override // X.AbstractC56012Ht, X.WM7
    public final void onResume() {
        super.onResume();
    }

    public static final void LLJJ(C82741Wdd c82741Wdd) {
        int intValue;
        int LIZIZ;
        ViewGroup.LayoutParams layoutParams;
        if (V16.LJJJJZ(c82741Wdd.LJLILLLLZI)) {
            Context requireSceneContext = c82741Wdd.requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            intValue = C6IB.LIZJ(requireSceneContext) - ((int) C74275TDb.LIZ(104.0f));
            LIZIZ = C1549666i.LIZIZ();
        } else {
            intValue = c82741Wdd.getUiActions().LJI.invoke().intValue();
            LIZIZ = C1549666i.LIZIZ();
        }
        int i = intValue - LIZIZ;
        ViewGroup viewGroup = c82741Wdd.LJLZ;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.bottomMargin = i;
        }
        ViewGroup viewGroup2 = c82741Wdd.LJLZ;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setLayoutParams(layoutParams2);
    }

    public final void LLJILJIL(boolean z) {
        CharSequence charSequence;
        CharSequence text;
        CharSequence charSequence2;
        CharSequence text2;
        CharSequence charSequence3 = "";
        if (z) {
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                TuxTextView tuxTextView = this.LJLJLLL;
                if (tuxTextView != null) {
                    Resources resources = sceneContext.getResources();
                    if (resources == null || (charSequence2 = resources.getText(R.string.q4t)) == null) {
                        charSequence2 = "";
                    }
                    tuxTextView.setText(charSequence2);
                }
                TuxTextView tuxTextView2 = this.LJZ;
                if (tuxTextView2 == null) {
                    return;
                }
                Resources resources2 = sceneContext.getResources();
                if (resources2 != null && (text2 = resources2.getText(R.string.q4s)) != null) {
                    charSequence3 = text2;
                }
                tuxTextView2.setText(charSequence3);
                return;
            }
            return;
        }
        Context sceneContext2 = getSceneContext();
        if (sceneContext2 == null) {
            return;
        }
        TuxTextView tuxTextView3 = this.LJLJLLL;
        if (tuxTextView3 != null) {
            Resources resources3 = sceneContext2.getResources();
            if (resources3 == null || (charSequence = resources3.getText(R.string.q4r)) == null) {
                charSequence = "";
            }
            tuxTextView3.setText(charSequence);
        }
        TuxTextView tuxTextView4 = this.LJZ;
        if (tuxTextView4 == null) {
            return;
        }
        Resources resources4 = sceneContext2.getResources();
        if (resources4 != null && (text = resources4.getText(R.string.q4u)) != null) {
            charSequence3 = text;
        }
        tuxTextView4.setText(charSequence3);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public void onActivityCreated(Bundle bundle) {
        C46026I4o c46026I4o;
        super.onActivityCreated(bundle);
        this.LJLIL.LIZIZ(this, new AObjectS86S0100000_7(this, 102));
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Wdl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82750Wdm) obj).LIZ;
            }
        }, null, new AqS180S0100000_14(this, 169), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Wdj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C82750Wdm) obj).LIZLLL);
            }
        }, null, new AqS180S0100000_14(this, 170), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Wdk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C82750Wdm) obj).LJII);
            }
        }, null, new AqS173S0100000_7(this, 154), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Wdn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82750Wdm) obj).LJIIIIZZ;
            }
        }, null, new AqS173S0100000_7(this, 155), 2, null);
        if ((C44260HYq.LIZ() || C46029I4r.LIZ()) && (c46026I4o = this.LJLLLL) != null) {
            c46026I4o.LIZJ(C7MY.LIZIZ(40), O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
        }
        ((FirstPhotoViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(FirstPhotoViewModel.class)).LJLIL.observe(this, new AObserverS75S0100000_7(this, 31));
    }

    public void LLJJI(boolean z, boolean z2) {
        int i;
        C131905Fq c131905Fq;
        if (!z2) {
            ViewGroup viewGroup = this.LJLLJ;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            C131905Fq c131905Fq2 = this.LJLLL;
            if (c131905Fq2 == null) {
                return;
            }
            c131905Fq2.setNeedLinearBackground(false);
            return;
        }
        ViewGroup viewGroup2 = this.LJLLJ;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        if (z) {
            ViewGroup viewGroup3 = this.LJLLJ;
            if (viewGroup3 != null) {
                viewGroup3.setClickable(true);
            }
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                TuxTextView tuxTextView = this.LJLLI;
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(sceneContext.getResources().getColor(R.color.bc));
                }
                TuxTextView tuxTextView2 = this.LJLLI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(32);
                }
                C2068389v c2068389v = new C2068389v();
                if (LLJILJILJ()) {
                    i = R.raw.icon_now_setting;
                } else {
                    i = R.raw.icon_camera_fill;
                }
                c2068389v.LIZ = i;
                c2068389v.LJ = Integer.valueOf(R.attr.dj);
                TuxIconView tuxIconView = this.LJLL;
                if (tuxIconView != null) {
                    tuxIconView.setTuxIcon(c2068389v);
                }
                if (LLJILJILJ() || (c131905Fq = this.LJLLL) == null) {
                    return;
                }
                c131905Fq.setNeedLinearBackground(true);
                return;
            }
            return;
        }
        ViewGroup viewGroup4 = this.LJLLJ;
        if (viewGroup4 != null) {
            viewGroup4.setClickable(false);
        }
        Context sceneContext2 = getSceneContext();
        if (sceneContext2 == null) {
            return;
        }
        TuxTextView tuxTextView3 = this.LJLLI;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(sceneContext2.getResources().getColor(R.color.be));
        }
        TuxTextView tuxTextView4 = this.LJLLI;
        if (tuxTextView4 != null) {
            tuxTextView4.setTuxFont(31);
        }
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_tick_fill;
        c2068389v2.LJ = Integer.valueOf(R.attr.e8);
        TuxIconView tuxIconView2 = this.LJLL;
        if (tuxIconView2 != null) {
            tuxIconView2.setTuxIcon(c2068389v2);
        }
        C131905Fq c131905Fq3 = this.LJLLL;
        if (c131905Fq3 == null) {
            return;
        }
        c131905Fq3.setNeedLinearBackground(false);
    }

    public final void LLJJIII(boolean z, boolean z2, boolean z3) {
        int i;
        if (!z2) {
            ViewGroup viewGroup = this.LJLJL;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            FrameLayout frameLayout = this.LJLJLJ;
            if (frameLayout == null) {
                return;
            }
            frameLayout.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = this.LJLJL;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        if (z) {
            ViewGroup viewGroup3 = this.LJLJL;
            if (viewGroup3 != null) {
                viewGroup3.setClickable(true);
            }
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                TuxTextView tuxTextView = this.LJLJJI;
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(sceneContext.getResources().getColor(R.color.bc));
                }
                TuxTextView tuxTextView2 = this.LJLJJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(32);
                }
                C2068389v c2068389v = new C2068389v();
                if (LLJILJILJ()) {
                    i = R.raw.icon_now_setting;
                } else {
                    i = R.raw.icon_microphone_fill;
                }
                c2068389v.LIZ = i;
                c2068389v.LJ = Integer.valueOf(R.attr.dj);
                TuxIconView tuxIconView = this.LJLJI;
                if (tuxIconView != null) {
                    tuxIconView.setTuxIcon(c2068389v);
                }
            }
        } else {
            ViewGroup viewGroup4 = this.LJLJL;
            if (viewGroup4 != null) {
                viewGroup4.setClickable(false);
            }
            Context sceneContext2 = getSceneContext();
            if (sceneContext2 != null) {
                TuxTextView tuxTextView3 = this.LJLJJI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTextColor(sceneContext2.getResources().getColor(R.color.be));
                }
                TuxTextView tuxTextView4 = this.LJLJJI;
                if (tuxTextView4 != null) {
                    tuxTextView4.setTuxFont(31);
                }
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_tick_fill;
                c2068389v2.LJ = Integer.valueOf(R.attr.e8);
                TuxIconView tuxIconView2 = this.LJLJI;
                if (tuxIconView2 != null) {
                    tuxIconView2.setTuxIcon(c2068389v2);
                }
            }
        }
        if (z3) {
            FrameLayout frameLayout2 = this.LJLJLJ;
            if (frameLayout2 == null) {
                return;
            }
            frameLayout2.setVisibility(0);
            return;
        }
        FrameLayout frameLayout3 = this.LJLJLJ;
        if (frameLayout3 == null) {
            return;
        }
        frameLayout3.setVisibility(8);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        TuxIconView tuxIconView2;
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ce9, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = viewGroup2.findViewById(R.id.b2z);
        TuxTextView tuxTextView2 = null;
        if (findViewById instanceof TuxIconView) {
            tuxIconView = (TuxIconView) findViewById;
        } else {
            tuxIconView = null;
        }
        this.LJLL = tuxIconView;
        View findViewById2 = viewGroup2.findViewById(R.id.b30);
        if (findViewById2 instanceof TuxTextView) {
            tuxTextView = (TuxTextView) findViewById2;
        } else {
            tuxTextView = null;
        }
        this.LJLLI = tuxTextView;
        View findViewById3 = viewGroup2.findViewById(R.id.gii);
        if (findViewById3 instanceof TuxIconView) {
            tuxIconView2 = (TuxIconView) findViewById3;
        } else {
            tuxIconView2 = null;
        }
        this.LJLJI = tuxIconView2;
        View findViewById4 = viewGroup2.findViewById(R.id.gij);
        if (findViewById4 instanceof TuxTextView) {
            tuxTextView2 = (TuxTextView) findViewById4;
        }
        this.LJLJJI = tuxTextView2;
        this.LJLJJL = viewGroup2.findViewById(R.id.jxt);
        this.LJLJLJ = (FrameLayout) viewGroup2.findViewById(R.id.jxs);
        this.LJLJJLL = viewGroup2.findViewById(R.id.gjf);
        this.LJLLILLLL = viewGroup2.findViewById(R.id.hls);
        this.LJLLJ = (ViewGroup) viewGroup2.findViewById(R.id.b2y);
        this.LJLJL = (ViewGroup) viewGroup2.findViewById(R.id.gih);
        this.LJLLL = (C131905Fq) viewGroup2.findViewById(R.id.irl);
        this.LJLLLL = (C46026I4o) viewGroup2.findViewById(R.id.b06);
        this.LJLLLLLL = (ViewGroup) viewGroup2.findViewById(R.id.hlp);
        this.LJLZ = (ViewGroup) viewGroup2.findViewById(R.id.j5i);
        this.LJLJLLL = (TuxTextView) viewGroup2.findViewById(R.id.hmc);
        this.LJZ = (TuxTextView) viewGroup2.findViewById(R.id.hma);
        View view = this.LJLLILLLL;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 32), view);
        }
        ViewGroup viewGroup3 = this.LJLLJ;
        if (viewGroup3 != null) {
            C16880lQ.LJIIL(viewGroup3, new ACListenerS34S0100000_14(this, 33));
        }
        ViewGroup viewGroup4 = this.LJLJL;
        if (viewGroup4 != null) {
            C16880lQ.LJIIL(viewGroup4, new ACListenerS34S0100000_14(this, 34));
        }
        FrameLayout frameLayout = this.LJLJLJ;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS34S0100000_14(this, 35));
        }
        C46026I4o c46026I4o = this.LJLLLL;
        if (c46026I4o != null) {
            c46026I4o.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS34S0100000_14(this, 36)));
        }
        if (L1D.LIZIZ() || L1D.LIZ()) {
            C46026I4o c46026I4o2 = this.LJLLLL;
            if (c46026I4o2 != null) {
                C60942Nvu.LIZJ(49, c46026I4o2);
                ViewGroup.LayoutParams layoutParams = c46026I4o2.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = C7MY.LIZIZ(22);
                marginLayoutParams.height = -2;
            }
            C82740Wdc.LIZJ(this.LJLLLL);
        }
        C78923UyF.LJIILLIIL(this).LLJILJILJ(this, new C82745Wdh(this));
        return viewGroup2;
    }

    public C82741Wdd(C08610Vl<C82750Wdm> uiSceneStates, C82746Wdi uiSceneAction, C0IB<Boolean> relayoutEvent, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(uiSceneStates, "uiSceneStates");
        o.LJIIIZ(uiSceneAction, "uiSceneAction");
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLIL = relayoutEvent;
        this.LJLILLLLZI = shortVideoContext;
        setUiStates(uiSceneStates);
        setUiActions(uiSceneAction);
    }
}
