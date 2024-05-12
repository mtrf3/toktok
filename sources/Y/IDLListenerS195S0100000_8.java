package Y;

import X.C50222JnO;
import X.C61410O8g;
import X.C78847Ux1;
import X.UC7;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalDetailFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDLListenerS195S0100000_8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS195S0100000_8 iDLListenerS195S0100000_8) {
        ViewTreeObserver viewTreeObserver = ((MidAdCellComponent) iDLListenerS195S0100000_8.l0).u4().getViewTreeObserver();
        float measureText = ((MidAdCellComponent) iDLListenerS195S0100000_8.l0).u4().getPaint().measureText(((MidAdCellComponent) iDLListenerS195S0100000_8.l0).u4().getText().toString());
        viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS195S0100000_8);
        TuxTextView u4 = ((MidAdCellComponent) iDLListenerS195S0100000_8.l0).u4();
        ViewGroup.LayoutParams layoutParams = ((MidAdCellComponent) iDLListenerS195S0100000_8.l0).u4().getLayoutParams();
        layoutParams.width = ((int) measureText) + 5;
        u4.setLayoutParams(layoutParams);
        ((MidAdCellComponent) iDLListenerS195S0100000_8.l0).u4().setGravity(17);
    }

    public static final void onGlobalLayout$1(IDLListenerS195S0100000_8 iDLListenerS195S0100000_8) {
        boolean z;
        int i;
        SearchFeedbackOptionalDetailFragment searchFeedbackOptionalDetailFragment = (SearchFeedbackOptionalDetailFragment) iDLListenerS195S0100000_8.l0;
        if (searchFeedbackOptionalDetailFragment.getContext() == null) {
            return;
        }
        int LIZ = C61410O8g.LIZ(searchFeedbackOptionalDetailFragment.getContext());
        Rect rect = new Rect();
        View view = searchFeedbackOptionalDetailFragment.LJLIL;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
            Rect rect2 = new Rect();
            View view2 = searchFeedbackOptionalDetailFragment.LJLIL;
            if (view2 != null) {
                view2.getGlobalVisibleRect(rect2);
                int i2 = LIZ - rect.bottom;
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = (int) (LIZ * 0.73d);
                View view3 = searchFeedbackOptionalDetailFragment.LJLIL;
                if (view3 != null) {
                    View view4 = (View) view3.getParent();
                    if (view4 != null) {
                        i = view4.getHeight();
                    } else {
                        i = 0;
                    }
                    View view5 = searchFeedbackOptionalDetailFragment.LJLIL;
                    if (view5 != null) {
                        searchFeedbackOptionalDetailFragment.LJLJL = i - view5.getLayoutParams().height;
                        int i4 = i + i2;
                        if (i4 <= i3) {
                            i3 = i4;
                        }
                        if (i2 != searchFeedbackOptionalDetailFragment.LJLL) {
                            if (z) {
                                if (rect.bottom != rect2.bottom) {
                                    View view6 = searchFeedbackOptionalDetailFragment.LJLIL;
                                    if (view6 != null) {
                                        int paddingLeft = view6.getPaddingLeft();
                                        View view7 = searchFeedbackOptionalDetailFragment.LJLIL;
                                        if (view7 != null) {
                                            int paddingTop = view7.getPaddingTop();
                                            View view8 = searchFeedbackOptionalDetailFragment.LJLIL;
                                            if (view8 != null) {
                                                view6.setPadding(paddingLeft, paddingTop, view8.getPaddingRight(), i2);
                                                View view9 = searchFeedbackOptionalDetailFragment.LJLIL;
                                                if (view9 != null) {
                                                    view9.getLayoutParams().height = i3 - searchFeedbackOptionalDetailFragment.LJLJL;
                                                } else {
                                                    o.LJIJI("rootView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("rootView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("rootView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("rootView");
                                        throw null;
                                    }
                                } else {
                                    View view10 = searchFeedbackOptionalDetailFragment.LJLIL;
                                    if (view10 != null) {
                                        view10.getLayoutParams().height = (i3 - searchFeedbackOptionalDetailFragment.LJLJL) - i2;
                                    } else {
                                        o.LJIJI("rootView");
                                        throw null;
                                    }
                                }
                                SearchFeedbackOptionalDetailFragment.vl((int) C78847Ux1.LJJIFFI(12), searchFeedbackOptionalDetailFragment._$_findCachedViewById(R.id.jfl));
                                SearchFeedbackOptionalDetailFragment.vl((int) C78847Ux1.LJJIFFI(68), searchFeedbackOptionalDetailFragment._$_findCachedViewById(R.id.jfh));
                            } else {
                                View view11 = searchFeedbackOptionalDetailFragment.LJLIL;
                                if (view11 != null) {
                                    view11.getLayoutParams().height = searchFeedbackOptionalDetailFragment.LJLILLLLZI;
                                    View view12 = searchFeedbackOptionalDetailFragment.LJLIL;
                                    if (view12 != null) {
                                        int paddingLeft2 = view12.getPaddingLeft();
                                        View view13 = searchFeedbackOptionalDetailFragment.LJLIL;
                                        if (view13 != null) {
                                            int paddingTop2 = view13.getPaddingTop();
                                            View view14 = searchFeedbackOptionalDetailFragment.LJLIL;
                                            if (view14 != null) {
                                                view12.setPadding(paddingLeft2, paddingTop2, view14.getPaddingRight(), 0);
                                                SearchFeedbackOptionalDetailFragment.vl((int) C78847Ux1.LJJIFFI(46), searchFeedbackOptionalDetailFragment._$_findCachedViewById(R.id.jfl));
                                                SearchFeedbackOptionalDetailFragment.vl((int) C78847Ux1.LJJIFFI(105), searchFeedbackOptionalDetailFragment._$_findCachedViewById(R.id.jfh));
                                            } else {
                                                o.LJIJI("rootView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("rootView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("rootView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("rootView");
                                    throw null;
                                }
                            }
                            View view15 = searchFeedbackOptionalDetailFragment.LJLIL;
                            if (view15 != null) {
                                view15.requestLayout();
                            } else {
                                o.LJIJI("rootView");
                                throw null;
                            }
                        }
                        searchFeedbackOptionalDetailFragment.LJLL = i2;
                        return;
                    }
                    o.LJIJI("rootView");
                    throw null;
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    public static final void onGlobalLayout$2(IDLListenerS195S0100000_8 iDLListenerS195S0100000_8) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        int i3;
        View view;
        View view2;
        C50222JnO c50222JnO = (C50222JnO) iDLListenerS195S0100000_8.l0;
        SearchContainerHeaderVM searchContainerHeaderVM = c50222JnO.LJLJI;
        if (searchContainerHeaderVM != null && c50222JnO.LJLIL.getHeight() != 0) {
            View view3 = c50222JnO.getParent();
            while (true) {
                i = 0;
                layoutParams = null;
                if (view3 == 0 || ((view3 instanceof ViewGroup) && (view2 = view3) != null && view2.getId() == R.id.gzd)) {
                    break;
                } else {
                    view3 = view3.getParent();
                }
            }
            if ((view3 instanceof ViewGroup) && view3 != null) {
                i2 = view.getHeight();
            } else {
                i2 = 0;
            }
            UC7.LIZLLL("topHeightIncludeResearch = ", i2);
            searchContainerHeaderVM.LJLILLLLZI = i2;
            UC7.LIZLLL("updateRvTopPadding = ", i2);
            searchContainerHeaderVM.LJLLILLLL.setValue(Integer.valueOf(i2));
            int height = c50222JnO.getHeight();
            ViewGroup.LayoutParams layoutParams2 = c50222JnO.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams != null) {
                i3 = marginLayoutParams.bottomMargin;
            } else {
                i3 = 0;
            }
            int i4 = height + i3;
            ViewGroup.LayoutParams layoutParams3 = c50222JnO.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = layoutParams3;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams2 != null) {
                i = marginLayoutParams2.topMargin;
            }
            searchContainerHeaderVM.LLF = i4 + i;
            c50222JnO.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS195S0100000_8);
        }
    }

    public IDLListenerS195S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
