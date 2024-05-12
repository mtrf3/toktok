package X;

import Y.ACListenerS31S0101000_14;
import Y.ACListenerS34S0100000_14;
import Y.AObjectS89S0100000_14;
import Y.IDTListenerS122S0100000_14;
import Y.IDiS275S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.panel.CommentAndQuestionStickerPanelPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vxt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81449Vxt extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZL;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public List<String> LJLJI;
    public View LJLJJI;
    public ViewPager LJLJJL;
    public C80261Vej LJLJJLL;
    public View LJLJL;
    public C786436u LJLJLJ;
    public C81452Vxw LJLJLLL;
    public final List<CommentAndQuestionStickerPanelPageFragment> LJLL;
    public final C62822Ol8 LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public final C29901Fi<C76800UCe> LJLLLLLL;
    public InterfaceC45540Hu4 LJLZ;
    public final C81451Vxv LJZ;
    public boolean LJZI;

    static {
        TBT tbt = new TBT(C81449Vxt.class, "commentAndQuestionStickerPanelApi", "getCommentAndQuestionStickerPanelApi()Lcom/ss/android/ugc/aweme/panel/CommentAndQuestionStickerPanelApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJZL = new InterfaceC74236TBo[]{tbt};
    }

    public final void LLJJ() {
        List<CommentAndQuestionStickerPanelPageFragment> list = this.LJLL;
        ViewPager viewPager = this.LJLJJL;
        if (viewPager != null) {
            CommentAndQuestionStickerPanelPageFragment commentAndQuestionStickerPanelPageFragment = (CommentAndQuestionStickerPanelPageFragment) ListProtector.get(list, viewPager.getCurrentItem());
            C81455Vxz c81455Vxz = commentAndQuestionStickerPanelPageFragment.LJLLL;
            if (c81455Vxz != null) {
                c81455Vxz.LIZJ();
            }
            C81455Vxz c81455Vxz2 = commentAndQuestionStickerPanelPageFragment.LJLLI;
            if (c81455Vxz2 != null) {
                c81455Vxz2.LIZJ();
            }
            C81455Vxz c81455Vxz3 = commentAndQuestionStickerPanelPageFragment.LJLLILLLL;
            if (c81455Vxz3 != null) {
                c81455Vxz3.LIZJ();
            }
            C81455Vxz c81455Vxz4 = commentAndQuestionStickerPanelPageFragment.LJLLJ;
            if (c81455Vxz4 != null) {
                c81455Vxz4.LIZJ();
            }
            C81455Vxz c81455Vxz5 = commentAndQuestionStickerPanelPageFragment.LJLLLL;
            if (c81455Vxz5 != null) {
                c81455Vxz5.LIZJ();
            }
            if (LLJILJIL()) {
                LLJJI().DW("reply_panel", "click_plus");
                return;
            }
            return;
        }
        o.LJIJI("mPager");
        throw null;
    }

    public final InterfaceC81454Vxy LLJJI() {
        return (InterfaceC81454Vxy) this.LJLILLLLZI.LIZ(this, LJZL[0]);
    }

    public final boolean LLJILJIL() {
        if (C158166Iq.LIZIZ()) {
            C6IE c6ie = C6IE.RECORD_PAGE_PANEL;
            if (C6IG.LIZIZ(c6ie) && C158166Iq.LIZ() == 1 && LLJJI().getPanelType() == c6ie && C74216TAu.LIZIZ.LJIIIZ()) {
                return true;
            }
        }
        return false;
    }

    public final void LLJJIII() {
        if (I1R.LIZLLL()) {
            ViewPager viewPager = this.LJLJJL;
            if (viewPager != null) {
                viewPager.setCurrentItem(1);
            } else {
                o.LJIJI("mPager");
                throw null;
            }
        } else {
            ViewPager viewPager2 = this.LJLJJL;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(0);
            } else {
                o.LJIJI("mPager");
                throw null;
            }
        }
        ViewPager viewPager3 = this.LJLJJL;
        if (viewPager3 != null) {
            PagerAdapter adapter = viewPager3.getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.panel.CommentAndQuestionStickerPanelScene.CommentStickerPanelPageAdapter");
            adapter.notifyDataSetChanged();
            return;
        }
        o.LJIJI("mPager");
        throw null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C81449Vxt(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, InterfaceC81454Vxy.class, null);
        this.LJLL = new ArrayList();
        this.LJLLI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 674));
        this.LJLLL = Float.POSITIVE_INFINITY;
        this.LJLLLLLL = new C29901Fi<>();
        new C29901Fi();
        this.LJZ = new C81451Vxv(this);
        this.LJZI = true;
    }

    public final void LLJILJILJ(int i) {
        EnumC81464Vy8 enumC81464Vy8;
        InterfaceC81454Vxy LLJJI = LLJJI();
        ViewPager viewPager = this.LJLJJL;
        if (viewPager != null) {
            if (viewPager.getCurrentItem() == 0) {
                enumC81464Vy8 = EnumC81464Vy8.SUGGEST_TAB;
            } else {
                enumC81464Vy8 = EnumC81464Vy8.FAVORITE_TAB;
            }
            LLJJI.hk(enumC81464Vy8.getTabName(), LLJJI.iR(enumC81464Vy8) ? 1 : 0, i);
            return;
        }
        o.LJIJI("mPager");
        throw null;
    }

    public final void LLJJIJI(boolean z) {
        InterfaceC45540Hu4 interfaceC45540Hu4;
        InterfaceC45540Hu4 interfaceC45540Hu42;
        if (z) {
            LLJJIII();
            LLJILJILJ(1);
            WMH wmh = (WMH) this.mParentScene;
            if (wmh != null) {
                wmh.show(this);
            }
            if (!C52529KjV.LIZ() && (interfaceC45540Hu42 = this.LJLZ) != null) {
                interfaceC45540Hu42.registerActivityOnKeyDownListener(this.LJZ);
            }
        } else if (!C52529KjV.LIZ() && (interfaceC45540Hu4 = this.LJLZ) != null) {
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this.LJZ);
        }
        if (C52529KjV.LIZ()) {
            if (z) {
                LLJJ();
            }
        } else {
            C786436u c786436u = this.LJLJLJ;
            if (c786436u != null) {
                View view = this.LJLJJI;
                if (view != null) {
                    C170696mv.LIZIZ(c786436u, z, 593, view, 100, new OSZ("qa_panel_enter", "qa_panel_exit"), this.LJZI, new C81450Vxu(z, this));
                } else {
                    o.LJIJI("root");
                    throw null;
                }
            } else {
                o.LJIJI("insideView");
                throw null;
            }
        }
        this.LJZI = false;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        Object obj;
        View view;
        View view2;
        UrlModel avatarThumb;
        W5G w5g;
        TextView textView;
        super.onActivityCreated(bundle);
        LLJJI().ud0();
        View requireViewById = requireViewById(R.id.bm5);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.comment_sticker_viewpager)");
        this.LJLJJL = (ViewPager) requireViewById;
        View requireViewById2 = requireViewById(R.id.bm2);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.comment_sticker_panel_tabs)");
        this.LJLJJLL = (C80261Vej) requireViewById2;
        View requireViewById3 = requireViewById(R.id.bly);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.com…nt_sticker_panel_outside)");
        this.LJLJL = requireViewById3;
        View requireViewById4 = requireViewById(R.id.blx);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.comment_sticker_panel_inside)");
        this.LJLJLJ = (C786436u) requireViewById4;
        if (I1R.LIZLLL()) {
            this.LJLJI = LLJJI().TW();
        } else {
            this.LJLJI = LLJJI().XD();
        }
        View view3 = null;
        if (C58B.LIZ()) {
            C786436u c786436u = this.LJLJLJ;
            if (c786436u != null) {
                C110614Vt c110614Vt = new C110614Vt();
                float LJIIZILJ = C32151Nz.LJIIZILJ(12);
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.ed);
                c110614Vt.LJIIIIZZ = Float.valueOf(LJIIZILJ);
                c110614Vt.LJIIIZ = Float.valueOf(LJIIZILJ);
                Context requireSceneContext = requireSceneContext();
                o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                c786436u.setBackground(c110614Vt.LIZ(requireSceneContext));
            } else {
                o.LJIJI("insideView");
                throw null;
            }
        }
        List<String> list = this.LJLJI;
        if (list != null) {
            for (String tabTitle : list) {
                List<CommentAndQuestionStickerPanelPageFragment> list2 = this.LJLL;
                C82622Wbi diContainer = this.LJLIL;
                o.LJIIIZ(tabTitle, "tabTitle");
                o.LJIIIZ(diContainer, "diContainer");
                Bundle bundle2 = new Bundle();
                bundle2.putString("tabTitle", tabTitle);
                CommentAndQuestionStickerPanelPageFragment commentAndQuestionStickerPanelPageFragment = new CommentAndQuestionStickerPanelPageFragment();
                commentAndQuestionStickerPanelPageFragment.setArguments(bundle2);
                commentAndQuestionStickerPanelPageFragment.LJLIL = diContainer;
                ((ArrayList) list2).add(commentAndQuestionStickerPanelPageFragment);
            }
            ViewPager viewPager = this.LJLJJL;
            if (viewPager != null) {
                viewPager.setAdapter((PagerAdapter) this.LJLLI.getValue());
                ViewPager viewPager2 = this.LJLJJL;
                if (viewPager2 != null) {
                    Context requireSceneContext2 = requireSceneContext();
                    o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
                    viewPager2.setPageMargin((int) C74275TDb.LIZIZ(requireSceneContext2, 24.0f));
                    ViewPager viewPager3 = this.LJLJJL;
                    if (viewPager3 != null) {
                        if (this.LJLJI != null) {
                            viewPager3.setCurrentItem(r0.size() - 1);
                            LLJJI().bg(new AqS164S0100000_14(this, 481));
                            ViewPager viewPager4 = this.LJLJJL;
                            if (viewPager4 != null) {
                                viewPager4.addOnPageChangeListener(new IDiS275S0100000_14(this, 7));
                                if (LLJILJIL()) {
                                    C786436u c786436u2 = this.LJLJLJ;
                                    if (c786436u2 != null) {
                                        Activity activity = this.mActivity;
                                        if (activity != null) {
                                            C81452Vxw c81452Vxw = new C81452Vxw(activity);
                                            this.LJLJLLL = c81452Vxw;
                                            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(activity), R.layout.blt, c786436u2, false);
                                            c81452Vxw.LIZ = LLLLIILL;
                                            if (LLLLIILL != null && (textView = (TextView) LLLLIILL.findViewById(R.id.o3)) != null) {
                                                textView.setText(activity.getString(R.string.re));
                                            }
                                            View view4 = c81452Vxw.LIZ;
                                            if (view4 != null) {
                                                view3 = view4.findViewById(R.id.nz);
                                            }
                                            int LIZIZ = C04330Ez.LIZIZ(activity, R.color.c7);
                                            C72789ShV c72789ShV = new C72789ShV(KL2.LIZJ(activity, 1.0f), BlurMaskFilter.Blur.NORMAL, KL2.LIZJ(activity, 1.0f), AnonymousClass636.LJIIIIZZ(R.attr.d5, activity));
                                            if (view3 != null) {
                                                view3.setBackground(new C72788ShU(LIZIZ, c72789ShV));
                                            }
                                            c786436u2.addView(c81452Vxw.LIZ);
                                            C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
                                            if (currentUser != null && (avatarThumb = currentUser.getAvatarThumb()) != null) {
                                                C81452Vxw c81452Vxw2 = this.LJLJLLL;
                                                if (c81452Vxw2 != null) {
                                                    View view5 = c81452Vxw2.LIZ;
                                                    if (view5 != null) {
                                                        w5g = (W5G) view5.findViewById(R.id.ny);
                                                    } else {
                                                        w5g = null;
                                                    }
                                                    if (c81452Vxw2.LIZ != null) {
                                                        if (w5g != null) {
                                                            w5g.setVisibility(0);
                                                        }
                                                        C78764Uvg.LJI(w5g, avatarThumb, -1, -1);
                                                    } else if (w5g != null) {
                                                        w5g.setVisibility(8);
                                                    }
                                                    View findViewById = c786436u2.findViewById(R.id.nz);
                                                    o.LJIIIIZZ(findViewById, "view.findViewById(R.id.action_button_bg)");
                                                    C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 112), findViewById);
                                                } else {
                                                    o.LJIJI("buttonDelegate");
                                                    throw null;
                                                }
                                            }
                                        }
                                    } else {
                                        o.LJIJI("insideView");
                                        throw null;
                                    }
                                }
                                C80261Vej c80261Vej = this.LJLJJLL;
                                if (c80261Vej != null) {
                                    AqS145S0200000_14 aqS145S0200000_14 = new AqS145S0200000_14(c80261Vej, this, 47);
                                    List<String> list3 = this.LJLJI;
                                    if (list3 != null) {
                                        Iterator<String> it = list3.iterator();
                                        while (it.hasNext()) {
                                            c80261Vej.addTab((C78856UxA) aqS145S0200000_14.invoke(it.next()));
                                        }
                                        if (I1R.LIZLLL()) {
                                            C80261Vej c80261Vej2 = this.LJLJJLL;
                                            if (c80261Vej2 != null) {
                                                View childAt = c80261Vej2.getChildAt(0);
                                                o.LJII(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
                                                View childAt2 = ((ViewGroup) childAt).getChildAt(0);
                                                o.LJII(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
                                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                                                if (layoutParams != null) {
                                                    layoutParams.width = -2;
                                                    layoutParams.weight = 0.0f;
                                                }
                                                childAt2.setLayoutParams(layoutParams);
                                            } else {
                                                o.LJIJI("mTabs");
                                                throw null;
                                            }
                                        }
                                        List<String> list4 = this.LJLJI;
                                        if (list4 != null) {
                                            int size = list4.size();
                                            for (int i = 0; i < size; i++) {
                                                C80261Vej c80261Vej3 = this.LJLJJLL;
                                                if (c80261Vej3 != null) {
                                                    C78856UxA tabAt = c80261Vej3.getTabAt(i);
                                                    if (tabAt != null && (view2 = tabAt.LJFF) != null) {
                                                        obj = view2.getParent();
                                                    } else {
                                                        obj = null;
                                                    }
                                                    if ((obj instanceof View) && (view = (View) obj) != null) {
                                                        C16880lQ.LJIIJ(new ACListenerS31S0101000_14(i, this, 1), view);
                                                    }
                                                } else {
                                                    o.LJIJI("mTabs");
                                                    throw null;
                                                }
                                            }
                                            ViewPager viewPager5 = this.LJLJJL;
                                            if (viewPager5 != null) {
                                                C80261Vej c80261Vej4 = this.LJLJJLL;
                                                if (c80261Vej4 != null) {
                                                    viewPager5.addOnPageChangeListener(new C111134Xt(c80261Vej4));
                                                    C80261Vej c80261Vej5 = this.LJLJJLL;
                                                    if (c80261Vej5 != null) {
                                                        c80261Vej5.addOnTabSelectedListener((LHW) new C81411VxH(this));
                                                        LLJJI().U50().LIZLLL(this, new AObjectS89S0100000_14(this, 465));
                                                        LLJJI().vc(this);
                                                        if (C52529KjV.LIZ()) {
                                                            View view6 = this.LJLJL;
                                                            if (view6 != null) {
                                                                view6.setVisibility(8);
                                                            } else {
                                                                o.LJIJI("outSideView");
                                                                throw null;
                                                            }
                                                        } else {
                                                            View view7 = this.LJLJL;
                                                            if (view7 != null) {
                                                                view7.setOnTouchListener(new IDTListenerS122S0100000_14(this, 9));
                                                            } else {
                                                                o.LJIJI("outSideView");
                                                                throw null;
                                                            }
                                                        }
                                                        this.LJLZ = C163756bj.LIZIZ(this);
                                                        C786436u c786436u3 = this.LJLJLJ;
                                                        if (c786436u3 != null) {
                                                            c786436u3.setOnInterceptorHandler(new AqS180S0100000_14(this, 359));
                                                            return;
                                                        } else {
                                                            o.LJIJI("insideView");
                                                            throw null;
                                                        }
                                                    }
                                                    o.LJIJI("mTabs");
                                                    throw null;
                                                }
                                                o.LJIJI("mTabs");
                                                throw null;
                                            }
                                            o.LJIJI("mPager");
                                            throw null;
                                        }
                                        o.LJIJI("tabTitles");
                                        throw null;
                                    }
                                    o.LJIJI("tabTitles");
                                    throw null;
                                }
                                o.LJIJI("mTabs");
                                throw null;
                            }
                            o.LJIJI("mPager");
                            throw null;
                        }
                        o.LJIJI("tabTitles");
                        throw null;
                    }
                    o.LJIJI("mPager");
                    throw null;
                }
                o.LJIJI("mPager");
                throw null;
            }
            o.LJIJI("mPager");
            throw null;
        }
        o.LJIJI("tabTitles");
        throw null;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZ = FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.wd, viewGroup, false, "inflater.inflate(R.layou…ontent, container, false)");
        this.LJLJJI = LIZ;
        return LIZ;
    }
}
