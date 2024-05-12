package com.ss.android.ugc.aweme.homepage.ui.view.tab.top.xtab;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C16880lQ;
import X.C2MA;
import X.C2MJ;
import X.C34177DbB;
import X.C34K;
import X.C46420IJs;
import X.C56K;
import X.KL2;
import X.LB9;
import X.LLE;
import X.LO9;
import X.LOA;
import X.LOB;
import X.LOF;
import X.LOS;
import X.ORZ;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.XTabAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS172S0200000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class XTabPanelController implements IXTabPanelAbility, LLE, C2MJ, SelectedTabBackToOriginAbility {
    public final ActivityC45651qj LJLIL;
    public final LOS LJLILLLLZI;
    public int LJLJJI;
    public XTabAbility LJLJJL;
    public LO9 LJLJJLL;
    public List<C46420IJs> LJLJL;
    public Fragment LJLJLLL;
    public View LJLLI;
    public TuxIconView LJLLILLLL;
    public AqS175S0100000_9 LJLLJ;
    public LOF LJLLL;
    public View LJLLLL;
    public LOB LJZ;
    public final LB9 LJZI;
    public String LJLJI = "";
    public int LJLJLJ = -1;
    public List<String> LJLL = new ArrayList();
    public final Map<String, LO9> LJLLLLLL = new LinkedHashMap();
    public final Map<String, XTabAbility> LJLZ = new LinkedHashMap();
    public boolean LJZL = true;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility
    public final int F7() {
        int LIZ;
        XTabAbility xTabAbility = this.LJLJJL;
        if (xTabAbility != null) {
            LIZ = xTabAbility.F7();
        } else {
            LIZ = C34177DbB.LIZ();
        }
        if (LIZ <= 0) {
            return C34177DbB.LIZ();
        }
        return LIZ;
    }

    public final void LIZ() {
        AqS175S0100000_9 aqS175S0100000_9 = this.LJLLJ;
        if (aqS175S0100000_9 != null) {
            aqS175S0100000_9.invoke(Integer.valueOf(this.LJLJJI));
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility
    public final boolean YY() {
        ValueAnimator valueAnimator;
        LB9 lb9 = this.LJZI;
        if (lb9 == null) {
            return false;
        }
        ValueAnimator valueAnimator2 = lb9.LIZIZ;
        if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && ((valueAnimator = lb9.LIZJ) == null || !valueAnimator.isRunning())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility
    public final LOA getPanelStatus() {
        LO9 lo9 = (LO9) ((LinkedHashMap) this.LJLLLLLL).get(this.LJLJI);
        if (lo9 != null) {
            if (!lo9.LIZLLL()) {
                ValueAnimator valueAnimator = lo9.LJLJI;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    if (lo9.getHasMoveDown()) {
                        return LOA.MOVE_DOWN_AND_HIDE_ANIMATING;
                    }
                    return LOA.HIDE_ANIMATING;
                }
                return LOA.HIDE;
            }
            if (lo9.getHasMoveDown()) {
                ValueAnimator valueAnimator2 = lo9.LJLILLLLZI;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    return LOA.MOVE_DOWN_AND_SHOWING_ANIMATING;
                }
                ValueAnimator valueAnimator3 = lo9.LJLJI;
                if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                    return LOA.HIDE_ANIMATING;
                }
                return LOA.MOVE_DOWN_SHOWING;
            }
            ValueAnimator valueAnimator4 = lo9.LJLILLLLZI;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                return LOA.SHOWING_ANIMATING;
            }
            return LOA.SHOWING;
        }
        return LOA.HIDE;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility
    public final void hidePanel() {
        LO9 lo9 = this.LJLJJLL;
        if (lo9 != null) {
            lo9.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility
    public final boolean nf() {
        LO9 lo9 = (LO9) ((LinkedHashMap) this.LJLLLLLL).get(this.LJLJI);
        if (lo9 == null || lo9.getParent() == null || !lo9.LIZLLL()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility
    public final void Cw() {
        LO9 lo9;
        LIZ();
        LO9 lo92 = this.LJLJJLL;
        if (lo92 != null && lo92.getTopTabPos() == this.LJLJJI && (lo9 = this.LJLJJLL) != null && !lo9.getHasMoveDown()) {
            LOF lof = this.LJLLL;
            if (lof != null) {
                lof.LJJJJZ(true);
            }
            LO9 lo93 = this.LJLJJLL;
            if (lo93 != null) {
                lo93.LIZIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility
    public final void MG() {
        Integer num;
        LO9 lo9;
        LO9 lo92;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onContentPageScroll: ");
        LIZ.append(this.LJLJJLL);
        LIZ.append("  ");
        LO9 lo93 = this.LJLJJLL;
        if (lo93 != null) {
            num = Integer.valueOf(lo93.getTopTabPos());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append("  ");
        LIZ.append(this.LJLJJI);
        X1D.LIZIZ(LIZ);
        LO9 lo94 = this.LJLJJLL;
        if (lo94 != null && lo94.getTopTabPos() == this.LJLJJI && (lo9 = this.LJLJJLL) != null && lo9.getHasMoveDown() && (lo92 = this.LJLJJLL) != null) {
            lo92.LIZIZ();
        }
        LIZ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility
    public final void EH() {
        LIZ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility
    public final void Da(List<C46420IJs> list) {
        FeedFragment feedFragment;
        XTabAbility vl;
        List<C46420IJs> st;
        TuxIconView tuxIconView;
        List<C46420IJs> list2 = this.LJLJL;
        if ((list2 == null || list2.size() <= 1) && list.size() >= 2) {
            Fragment fragment = this.LJLJLLL;
            if (!(fragment instanceof FeedFragment) || (feedFragment = (FeedFragment) fragment) == null || (vl = feedFragment.vl()) == null || (st = vl.st()) == null || st.size() <= 1) {
                return;
            }
            View LJIIJJI = this.LJLILLLLZI.LJIIJJI(this.LJLJJI);
            if (LJIIJJI != null && (tuxIconView = (TuxIconView) LJIIJJI.findViewById(R.id.e6d)) != null) {
                tuxIconView.setAlpha(1.0f);
                tuxIconView.setTranslationX(0.0f);
                tuxIconView.setVisibility(0);
                tuxIconView.setIconWidth(LB9.LIZLLL);
                this.LJLILLLLZI.LIZIZ();
            }
        }
        this.LJLJL = list;
        LO9 lo9 = this.LJLJJLL;
        if (lo9 != null) {
            lo9.LJIIIZ(list);
        }
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility
    public final boolean nb0(int i) {
        List<C46420IJs> st;
        List<TopTabProtocol> topTabProtocolList = this.LJLILLLLZI.getTopTabProtocolList();
        if (topTabProtocolList == null || i < 0 || i >= topTabProtocolList.size()) {
            return false;
        }
        XTabAbility xTabAbility = this.LJLZ.get(((TopTabProtocol) ListProtector.get(topTabProtocolList, i)).getTag());
        if (xTabAbility == null || (st = xTabAbility.st()) == null || st.size() < 2) {
            return false;
        }
        return true;
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        MG();
    }

    public XTabPanelController(ActivityC45651qj activityC45651qj, LOS los) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = los;
        new ArrayList();
        C116694i1.LIZ(activityC45651qj).hv0(this);
        this.LJZI = new LB9(los);
    }

    public final void LIZIZ(int i, int i2) {
        View view;
        ViewGroup viewGroup;
        List<C46420IJs> list;
        boolean z;
        List<C46420IJs> list2;
        List<C46420IJs> list3;
        C46420IJs c46420IJs;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        TuxIconView tuxIconView;
        LO9 lo9;
        Fragment fragment = this.LJLJLLL;
        if (fragment != null) {
            view = fragment.getView();
        } else {
            view = null;
        }
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        XTabAbility xTabAbility = this.LJLJJL;
        if (xTabAbility == null || !xTabAbility.l20() || viewGroup == null || (list = this.LJLJL) == null || list.isEmpty()) {
            XTabAbility xTabAbility2 = this.LJLJJL;
            if (xTabAbility2 != null) {
                xTabAbility2.Ct0();
                return;
            }
            return;
        }
        if (viewGroup.findViewById(R.id.e6e) instanceof LO9) {
            View findViewById = viewGroup.findViewById(R.id.e6e);
            o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.ui.view.tab.top.xtab.XTabPanel");
            this.LJLJJLL = (LO9) findViewById;
            this.LJLLLL = viewGroup.findViewById(R.id.e6f);
            LO9 lo92 = this.LJLJJLL;
            if ((lo92 != null && lo92.LIZLLL()) || ((lo9 = this.LJLJJLL) != null && lo9.LIZJ())) {
                XTabAbility xTabAbility3 = this.LJLJJL;
                if (xTabAbility3 != null) {
                    xTabAbility3.Ct0();
                    return;
                }
                return;
            }
            LO9 lo93 = this.LJLJJLL;
            if (lo93 != null) {
                lo93.LJ(false);
            }
            LO9 lo94 = this.LJLJJLL;
            if (lo94 != null && lo94.LJII()) {
                XTabAbility xTabAbility4 = this.LJLJJL;
                if (xTabAbility4 != null) {
                    xTabAbility4.Al0(i2);
                    return;
                }
                return;
            }
            XTabAbility xTabAbility5 = this.LJLJJL;
            if (xTabAbility5 == null) {
                return;
            }
            xTabAbility5.Ct0();
            return;
        }
        List<C46420IJs> list4 = this.LJLJL;
        if (list4 == null || list4.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || (list2 = this.LJLJL) == null || list2.size() < 2) {
            XTabAbility xTabAbility6 = this.LJLJJL;
            if (xTabAbility6 != null) {
                xTabAbility6.Ct0();
            }
            TuxIconView tuxIconView2 = this.LJLLILLLL;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
                return;
            }
            return;
        }
        List<C46420IJs> list5 = this.LJLJL;
        if (list5 != null) {
            MainTabStrip.LLD.LIZLLL("start to create XTabPanel");
            View view2 = new View(this.LJLIL);
            view2.setId(R.id.e6f);
            view2.setVisibility(8);
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 206), view2);
            final C56K c56k = new C56K();
            final C56K c56k2 = new C56K();
            final int touchSlop = ViewConfiguration.getTouchSlop();
            final C34K c34k = new C34K();
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.589
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 2) {
                            int x = (int) (motionEvent.getX() - c56k.element);
                            int y = (int) (motionEvent.getY() - c56k2.element);
                            int abs = Math.abs(y);
                            int abs2 = Math.abs(x);
                            if ((y > 0 && abs > abs2 && abs > touchSlop) || (x > 0 && abs2 > abs && abs2 > touchSlop)) {
                                C34K.this.element = true;
                            }
                        }
                    } else {
                        C34K.this.element = false;
                        c56k.element = motionEvent.getX();
                        c56k2.element = motionEvent.getY();
                    }
                    return C34K.this.element;
                }
            });
            this.LJLLLL = view2;
            this.LJLLI = this.LJLILLLLZI.LJIIJJI(this.LJLJJI);
            LO9 lo95 = new LO9(this.LJLIL);
            lo95.LJIIIZ(list5);
            lo95.setSubTabClickListener(new AqS172S0200000_9(this, (XTabPanelController) list5, (List<C46420IJs>) 23));
            lo95.setClosePanelListener(new AqS159S0100000_9(this, 1067));
            lo95.setShowPanelListener(new AqS159S0100000_9(this, 1068));
            XTabAbility xTabAbility7 = this.LJLJJL;
            if (xTabAbility7 != null) {
                animatorSet = xTabAbility7.Wq();
            } else {
                animatorSet = null;
            }
            lo95.setShowAnimatorSet(animatorSet);
            XTabAbility xTabAbility8 = this.LJLJJL;
            if (xTabAbility8 != null) {
                animatorSet2 = xTabAbility8.je();
            } else {
                animatorSet2 = null;
            }
            lo95.setCloseAnimatorSet(animatorSet2);
            View view3 = this.LJLLI;
            if (view3 != null) {
                tuxIconView = (TuxIconView) view3.findViewById(R.id.e6d);
            } else {
                tuxIconView = null;
            }
            lo95.setTabIconView(tuxIconView);
            this.LJLLILLLL = lo95.getTabIconView();
            lo95.setId(R.id.e6e);
            lo95.setTopTabPos(this.LJLJJI);
            lo95.setTabAbility(this.LJLJJL);
            lo95.setFragment(this.LJLJLLL);
            this.LJLJJLL = lo95;
            this.LJLLLLLL.put(this.LJLJI, lo95);
        }
        XTabAbility xTabAbility9 = this.LJLJJL;
        if (xTabAbility9 != null) {
            xTabAbility9.getPanel();
        }
        if (this.LJLJJLL == null) {
            XTabAbility xTabAbility10 = this.LJLJJL;
            if (xTabAbility10 != null) {
                xTabAbility10.Ct0();
            }
            TuxIconView tuxIconView3 = this.LJLLILLLL;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(8);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(KL2.LJIIJJI(this.LJLIL), -1);
        layoutParams.gravity = 48;
        LO9 lo96 = this.LJLJJLL;
        if (lo96 != null) {
            lo96.setLayoutParams(layoutParams);
        }
        LO9 lo97 = this.LJLJJLL;
        if (lo97 != null) {
            if (lo97.getParent() == null) {
                viewGroup.addView(this.LJLLLL, new FrameLayout.LayoutParams(-1, -1));
                viewGroup.addView(lo97, layoutParams);
            }
            if (!((ArrayList) this.LJLL).contains(this.LJLJI) && i2 != 0 && i2 != 2) {
                this.LJLL = ORZ.LLIIJI(this.LJLJI, this.LJLL);
                lo97.LJ(true);
            } else {
                lo97.LJ(false);
                LOF lof = this.LJLLL;
                if (lof != null) {
                    lof.LJJJJZ(false);
                }
            }
            LB9 lb9 = this.LJZI;
            if (lb9 != null) {
                lb9.LIZ(this.LJLLILLLL, true);
            }
            if (i < 0 && (list3 = this.LJLJL) != null) {
                XTabAbility xTabAbility11 = this.LJLJJL;
                if (xTabAbility11 != null) {
                    c46420IJs = xTabAbility11.rL();
                } else {
                    c46420IJs = null;
                }
                list3.indexOf(c46420IJs);
            }
            LO9 lo98 = this.LJLJJLL;
            if (lo98 != null) {
                if (i < 0) {
                    lo98.LJI(0);
                } else if (lo98.LJLL != i) {
                    lo98.LJI(i);
                    lo98.LJLL = i;
                }
            }
            if (lo97.LJII()) {
                XTabAbility xTabAbility12 = this.LJLJJL;
                if (xTabAbility12 != null) {
                    xTabAbility12.Al0(i2);
                    return;
                }
                return;
            }
            XTabAbility xTabAbility13 = this.LJLJJL;
            if (xTabAbility13 != null) {
                xTabAbility13.Ct0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.xtab.XTabPanelController.LIZJ(int, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility
    public final void wh(Context context, C46420IJs xTabModel, int i) {
        int i2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(xTabModel, "xTabModel");
        List<C46420IJs> list = this.LJLJL;
        if (list != null) {
            i2 = list.indexOf(xTabModel);
        } else {
            i2 = 0;
        }
        LIZIZ(i2, i);
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        LO9 lo9;
        LIZ();
        LO9 lo92 = this.LJLJJLL;
        if (lo92 != null && lo92.getTopTabPos() == this.LJLJJI && (lo9 = this.LJLJJLL) != null && !lo9.getHasMoveDown()) {
            LOF lof = this.LJLLL;
            if (lof != null) {
                lof.LJJJJZ(true);
            }
            LO9 lo93 = this.LJLJJLL;
            if (lo93 != null) {
                lo93.LIZIZ();
            }
        }
    }
}
