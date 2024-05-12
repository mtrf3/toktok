package com.bytedance.ies.xelement;

import X.AbstractC029409q;
import X.C0A2;
import X.C49613JdZ;
import X.EWS;
import X.VNA;
import X.VNL;
import X.VNU;
import X.VPD;
import X.VPY;
import X.VUN;
import X.VV8;
import X.VV9;
import X.VVA;
import X.VVB;
import X.VVC;
import X.VVD;
import X.VVE;
import X.VVF;
import X.VVH;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxScrollView extends AbsLynxUIScroll<VVF> {
    public final String LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public VV8 LJLLI;
    public LynxBounceView LJLLILLLL;
    public int LJLLJ;
    public VVH LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public int LJZI;
    public boolean LJZL;
    public int LL;
    public int LLD;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean canHaveFlattenChild() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    @VPD(name = "overflow-text")
    public final void overflowText(String text) {
        o.LJIIJ(text, "text");
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTap(boolean z) {
    }

    public final int LJJIIJ() {
        int i;
        int i2;
        int i3;
        VV8 vv8 = this.LJLLI;
        C0A2 c0a2 = null;
        if (vv8 != null) {
            C0A2 layoutManager = vv8.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                c0a2 = layoutManager;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0a2;
            int i4 = 0;
            if (linearLayoutManager == null || this.mChildren.size() == 0) {
                return 0;
            }
            int LLILL = linearLayoutManager.LLILL();
            if (LLILL >= 0 && LLILL < this.mChildren.size()) {
                View LJJIJIL = linearLayoutManager.LJJIJIL(LLILL);
                if (linearLayoutManager.LJIJJLI()) {
                    if (this.mLynxDirection == 2) {
                        int width = getWidth();
                        List<LynxBaseUI> list = this.mChildren;
                        Object obj = ListProtector.get(list, list.size() - 1);
                        o.LJFF(obj, "mChildren[mChildren.size - 1]");
                        int left = width - ((LynxBaseUI) obj).getLeft();
                        List<LynxBaseUI> list2 = this.mChildren;
                        Object obj2 = ListProtector.get(list2, list2.size() - 1);
                        o.LJFF(obj2, "mChildren[mChildren.size - 1]");
                        int i5 = left + ((LynxBaseUI) obj2).mMarginLeft + this.mPaddingLeft;
                        Object obj3 = ListProtector.get(this.mChildren, 0);
                        o.LJFF(obj3, "mChildren[0]");
                        int left2 = ((LynxBaseUI) obj3).getLeft();
                        Object obj4 = ListProtector.get(this.mChildren, LLILL);
                        o.LJFF(obj4, "mChildren[firstVisibleChild]");
                        int left3 = left2 - ((LynxBaseUI) obj4).getLeft();
                        Object obj5 = ListProtector.get(this.mChildren, 0);
                        o.LJFF(obj5, "mChildren[0]");
                        int width2 = ((LynxBaseUI) obj5).getWidth() + left3;
                        Object obj6 = ListProtector.get(this.mChildren, 0);
                        o.LJFF(obj6, "mChildren[0]");
                        int i6 = width2 + ((LynxBaseUI) obj6).mMarginRight + this.mPaddingRight;
                        if (LJJIJIL != null) {
                            i3 = getWidth() - LJJIJIL.getLeft();
                        } else {
                            i3 = 0;
                        }
                        int i7 = i6 - i3;
                        if ((i5 - getWidth()) - i7 <= this.LJLILLLLZI) {
                            i4 = 2;
                        }
                        if (i7 <= this.LJLJI) {
                            i4 |= 1;
                        }
                        this.LJZI = i7;
                    } else {
                        List<LynxBaseUI> list3 = this.mChildren;
                        Object obj7 = ListProtector.get(list3, list3.size() - 1);
                        o.LJFF(obj7, "mChildren[mChildren.size - 1]");
                        int left4 = ((LynxBaseUI) obj7).getLeft();
                        List<LynxBaseUI> list4 = this.mChildren;
                        Object obj8 = ListProtector.get(list4, list4.size() - 1);
                        o.LJFF(obj8, "mChildren[mChildren.size - 1]");
                        int width3 = ((LynxBaseUI) obj8).getWidth() + left4;
                        List<LynxBaseUI> list5 = this.mChildren;
                        Object obj9 = ListProtector.get(list5, list5.size() - 1);
                        o.LJFF(obj9, "mChildren[mChildren.size - 1]");
                        int i8 = width3 + ((LynxBaseUI) obj9).mMarginRight + this.mPaddingLeft;
                        Object obj10 = ListProtector.get(this.mChildren, LLILL);
                        o.LJFF(obj10, "mChildren[firstVisibleChild]");
                        int left5 = ((LynxBaseUI) obj10).getLeft();
                        if (LJJIJIL != null) {
                            i2 = LJJIJIL.getLeft();
                        } else {
                            i2 = 0;
                        }
                        int i9 = left5 - i2;
                        int width4 = (i8 - i9) - getWidth();
                        if (i9 <= this.LJLJI) {
                            i4 = 1;
                        }
                        if (width4 <= this.LJLILLLLZI) {
                            i4 |= 2;
                        }
                        this.LJZI = i9;
                    }
                } else if (linearLayoutManager.LJIL()) {
                    List<LynxBaseUI> list6 = this.mChildren;
                    Object obj11 = ListProtector.get(list6, list6.size() - 1);
                    o.LJFF(obj11, "mChildren[mChildren.size - 1]");
                    int top = ((LynxBaseUI) obj11).getTop();
                    List<LynxBaseUI> list7 = this.mChildren;
                    Object obj12 = ListProtector.get(list7, list7.size() - 1);
                    o.LJFF(obj12, "mChildren[mChildren.size - 1]");
                    int height = ((LynxBaseUI) obj12).getHeight() + top;
                    List<LynxBaseUI> list8 = this.mChildren;
                    Object obj13 = ListProtector.get(list8, list8.size() - 1);
                    o.LJFF(obj13, "mChildren[mChildren.size - 1]");
                    int i10 = height + ((LynxBaseUI) obj13).mMarginBottom + this.mPaddingBottom;
                    Object obj14 = ListProtector.get(this.mChildren, LLILL);
                    o.LJFF(obj14, "mChildren[firstVisibleChild]");
                    int top2 = ((LynxBaseUI) obj14).getTop();
                    if (LJJIJIL != null) {
                        i = LJJIJIL.getTop();
                    } else {
                        i = 0;
                    }
                    int i11 = top2 - i;
                    int height2 = (i10 - getHeight()) - i11;
                    if (i11 <= this.LJLJI) {
                        i4 = 1;
                    }
                    if (height2 <= this.LJLILLLLZI) {
                        i4 |= 2;
                    }
                    this.LJZI = i11;
                }
            }
            return i4;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        VV8 vv8 = this.LJLLI;
        if (vv8 != null) {
            return vv8.computeHorizontalScrollOffset();
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        VV8 vv8 = this.LJLLI;
        if (vv8 != null) {
            return vv8.computeVerticalScrollOffset();
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void measureChildren() {
        ViewGroup.LayoutParams layoutParams;
        Integer num;
        ViewGroup.LayoutParams layoutParams2;
        Integer num2;
        super.measureChildren();
        LynxBounceView lynxBounceView = this.LJLLILLLL;
        if (lynxBounceView != null) {
            lynxBounceView.measure();
        }
        View mBounceView = ((VVF) this.mView).getMBounceView();
        if (mBounceView != null && (layoutParams2 = mBounceView.getLayoutParams()) != null) {
            LynxBounceView lynxBounceView2 = this.LJLLILLLL;
            if (lynxBounceView2 != null) {
                num2 = Integer.valueOf(lynxBounceView2.getWidth());
            } else {
                num2 = null;
            }
            layoutParams2.width = num2.intValue();
        }
        View mBounceView2 = ((VVF) this.mView).getMBounceView();
        if (mBounceView2 != null && (layoutParams = mBounceView2.getLayoutParams()) != null) {
            LynxBounceView lynxBounceView3 = this.LJLLILLLL;
            if (lynxBounceView3 != null) {
                num = Integer.valueOf(lynxBounceView3.getHeight());
            } else {
                num = null;
            }
            layoutParams.height = num.intValue();
        }
        LynxBounceView lynxBounceView4 = this.LJLLILLLL;
        if (lynxBounceView4 != null) {
            lynxBounceView4.layout();
        }
        this.LL = getWidth();
        this.LLD = getHeight();
        if (!this.mChildren.isEmpty()) {
            VV8 vv8 = this.LJLLI;
            if (vv8 != null) {
                C0A2 layoutManager = vv8.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager) || layoutManager == null) {
                    o.LJIIZILJ();
                    throw null;
                }
                if (layoutManager.LJIJJLI()) {
                    if (this.mLynxDirection == 2) {
                        int width = getWidth();
                        Object obj = ListProtector.get(this.mChildren, r1.size() - 1);
                        o.LJFF(obj, "mChildren[mChildren.size - 1]");
                        int left = width - ((LynxBaseUI) obj).getLeft();
                        Object obj2 = ListProtector.get(this.mChildren, r1.size() - 1);
                        o.LJFF(obj2, "mChildren[mChildren.size - 1]");
                        this.LL = left + ((LynxBaseUI) obj2).mMarginLeft + this.mPaddingLeft;
                        return;
                    }
                    Object obj3 = ListProtector.get(this.mChildren, r1.size() - 1);
                    o.LJFF(obj3, "mChildren[mChildren.size - 1]");
                    int left2 = ((LynxBaseUI) obj3).getLeft();
                    Object obj4 = ListProtector.get(this.mChildren, r1.size() - 1);
                    o.LJFF(obj4, "mChildren[mChildren.size - 1]");
                    int width2 = ((LynxBaseUI) obj4).getWidth() + left2;
                    Object obj5 = ListProtector.get(this.mChildren, r1.size() - 1);
                    o.LJFF(obj5, "mChildren[mChildren.size - 1]");
                    this.LL = width2 + ((LynxBaseUI) obj5).mMarginRight + this.mPaddingLeft;
                    return;
                }
                if (!layoutManager.LJIL()) {
                    return;
                }
                Object obj6 = ListProtector.get(this.mChildren, r1.size() - 1);
                o.LJFF(obj6, "mChildren[mChildren.size - 1]");
                int top = ((LynxBaseUI) obj6).getTop();
                Object obj7 = ListProtector.get(this.mChildren, r1.size() - 1);
                o.LJFF(obj7, "mChildren[mChildren.size - 1]");
                int height = ((LynxBaseUI) obj7).getHeight() + top;
                Object obj8 = ListProtector.get(this.mChildren, r1.size() - 1);
                o.LJFF(obj8, "mChildren[mChildren.size - 1]");
                this.LLD = height + ((LynxBaseUI) obj8).mMarginBottom + this.mPaddingBottom;
                return;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        int i3 = this.mPaddingTop + this.mBorderTopWidth;
        int i4 = this.mPaddingBottom + this.mBorderBottomWidth;
        VV8 vv8 = this.LJLLI;
        if (vv8 != null) {
            vv8.setPadding(i, i3, i2, i4);
        } else {
            o.LJIJI("mRecyclerView");
            throw null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isCustomHittest() {
        return this.LJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxScrollView(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLIL = "LynxScrollView";
        this.LJZ = 1;
        this.LJZL = true;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJ(boolean z) {
        C0A2 c0a2 = null;
        if (z) {
            ((VVF) this.mView).setMScrollDirection(VVD.HORIZONTAL_RIGHT);
            VV8 vv8 = this.LJLLI;
            if (vv8 != null) {
                C0A2 layoutManager = vv8.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    c0a2 = layoutManager;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0a2;
                if (linearLayoutManager != null) {
                    linearLayoutManager.LLJJIII(0);
                    return;
                }
                return;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
        ((VVF) this.mView).setMScrollDirection(VVD.VERTICAL_BOTTOM);
        VV8 vv82 = this.LJLLI;
        if (vv82 != null) {
            C0A2 layoutManager2 = vv82.getLayoutManager();
            if (layoutManager2 instanceof LinearLayoutManager) {
                c0a2 = layoutManager2;
            }
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) c0a2;
            if (linearLayoutManager2 == null) {
                return;
            }
            linearLayoutManager2.LLJJIII(1);
            return;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJI(boolean z) {
        C0A2 c0a2 = null;
        if (!z) {
            ((VVF) this.mView).setMScrollDirection(VVD.HORIZONTAL_RIGHT);
            VV8 vv8 = this.LJLLI;
            if (vv8 != null) {
                C0A2 layoutManager = vv8.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    c0a2 = layoutManager;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0a2;
                if (linearLayoutManager != null) {
                    linearLayoutManager.LLJJIII(0);
                    return;
                }
                return;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
        ((VVF) this.mView).setMScrollDirection(VVD.VERTICAL_BOTTOM);
        VV8 vv82 = this.LJLLI;
        if (vv82 != null) {
            C0A2 layoutManager2 = vv82.getLayoutManager();
            if (layoutManager2 instanceof LinearLayoutManager) {
                c0a2 = layoutManager2;
            }
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) c0a2;
            if (linearLayoutManager2 == null) {
                return;
            }
            linearLayoutManager2.LLJJIII(1);
            return;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    public final boolean LJJII(int i) {
        VV8 vv8 = this.LJLLI;
        if (vv8 != null) {
            int computeHorizontalScrollRange = vv8.computeHorizontalScrollRange();
            VV8 vv82 = this.LJLLI;
            if (vv82 != null) {
                int computeVerticalScrollRange = vv82.computeVerticalScrollRange();
                if (computeHorizontalScrollRange > 0) {
                    VV8 vv83 = this.LJLLI;
                    if (vv83 != null) {
                        int computeHorizontalScrollOffset = i - vv83.computeHorizontalScrollOffset();
                        VV8 vv84 = this.LJLLI;
                        if (vv84 != null) {
                            vv84.scrollBy(computeHorizontalScrollOffset, 0);
                            return true;
                        }
                        o.LJIJI("mRecyclerView");
                        throw null;
                    }
                    o.LJIJI("mRecyclerView");
                    throw null;
                }
                if (computeVerticalScrollRange <= 0) {
                    return false;
                }
                VV8 vv85 = this.LJLLI;
                if (vv85 != null) {
                    int computeVerticalScrollOffset = i - vv85.computeVerticalScrollOffset();
                    VV8 vv86 = this.LJLLI;
                    if (vv86 != null) {
                        vv86.scrollBy(0, computeVerticalScrollOffset);
                        return true;
                    }
                    o.LJIJI("mRecyclerView");
                    throw null;
                }
                o.LJIJI("mRecyclerView");
                throw null;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIJ(context, "context");
        VVF vvf = new VVF(context);
        vvf.setOnScrollToEndListener(new VVC(this));
        vvf.setOnBounceScrollListener(new VVE(this));
        vvf.setMScrollDirection(VVD.VERTICAL_BOTTOM);
        VV8 vv8 = new VV8(context, this);
        vv8.setAdapter(new C49613JdZ(this));
        vv8.setLayoutDirection(0);
        VVA vva = new VVA(this, context);
        vva.LLJJIII(1);
        vv8.setLayoutManager(vva);
        vv8.LJIIJJI(new VV9(this));
        vv8.setClipToPadding(false);
        this.LJLLI = vv8;
        vvf.setMContentView(vv8);
        VV8 vv82 = this.LJLLI;
        if (vv82 != null) {
            vv82.setClipChildren(false);
            VV8 vv83 = this.LJLLI;
            if (vv83 != null) {
                VVH vvh = new VVH();
                this.LJLLL = vvh;
                vv83.LJIIJJI(vvh.LIZLLL);
                vvh.LIZJ = new VVB(vv83, vvh);
                ViewTreeObserver viewTreeObserver = vv83.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(vvh.LIZJ);
                }
                vvf.setClipChildren(false);
                return vvf;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    @VPD(defaultBoolean = true, name = "enable-load-more")
    public final void enableLoadMore(boolean z) {
        this.LJZL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        o.LJIIJ(lynxBaseUI, "lynxBaseUI");
        int indexOf = this.mChildren.indexOf(lynxBaseUI);
        if (this.mChildren.remove(lynxBaseUI)) {
            VV8 vv8 = this.LJLLI;
            if (vv8 != null) {
                AbstractC029409q adapter = vv8.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemRemoved(indexOf);
                    return;
                }
                return;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
    }

    @VPD(name = "scroll-to-id")
    public final void scrollToId(String id) {
        o.LJIIJ(id, "id");
        List<LynxBaseUI> mChildren = this.mChildren;
        o.LJFF(mChildren, "mChildren");
        for (LynxBaseUI lynxBaseUI : mChildren) {
            LynxBaseUI it = lynxBaseUI;
            o.LJFF(it, "it");
            if (o.LJ(it.mName, id)) {
                if (lynxBaseUI != null) {
                    int indexOf = this.mChildren.indexOf(lynxBaseUI);
                    VV8 vv8 = this.LJLLI;
                    if (vv8 != null) {
                        if (vv8.getAdapter() == null) {
                            return;
                        }
                        VV8 vv82 = this.LJLLI;
                        if (vv82 != null) {
                            AbstractC029409q adapter = vv82.getAdapter();
                            if (adapter != null) {
                                if (adapter.getItemCount() <= indexOf) {
                                    return;
                                }
                                VV8 vv83 = this.LJLLI;
                                if (vv83 != null) {
                                    vv83.LJLIL(indexOf);
                                    return;
                                } else {
                                    o.LJIJI("mRecyclerView");
                                    throw null;
                                }
                            }
                            o.LJIIZILJ();
                            throw null;
                        }
                        o.LJIJI("mRecyclerView");
                        throw null;
                    }
                    o.LJIJI("mRecyclerView");
                    throw null;
                }
                return;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void scrollToIndex(int i) {
        if (!LJJIFFI(i, false)) {
            this.LJLLLL = i;
        } else {
            this.LJLLLL = 0;
        }
    }

    @VPD(defaultBoolean = false, name = "bounce")
    public final void setBounces(boolean z) {
        ((VVF) this.mView).setMEnableBounce(z);
    }

    @VPD(name = "enable-custom-hittest")
    public final void setEnableCustomHittest(boolean z) {
        this.LJLL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJLJJLL = map.containsKey("scrolltolower");
            this.LJLJJL = map.containsKey("scrolltoupper");
            this.LJLJL = map.containsKey("scroll");
            this.LJLJJI = map.containsKey("scrolltobounce");
            this.LJLJLJ = map.containsKey("dragend");
        }
    }

    @VPD(name = "layout-direction")
    public final void setLayoutDirection(String direction) {
        o.LJIIJ(direction, "direction");
        if (o.LJ(direction, "ltr")) {
            VV8 vv8 = this.LJLLI;
            if (vv8 != null) {
                vv8.setLayoutDirection(0);
                return;
            } else {
                o.LJIJI("mRecyclerView");
                throw null;
            }
        }
        if (!o.LJ(direction, "rtl")) {
            return;
        }
        VV8 vv82 = this.LJLLI;
        if (vv82 != null) {
            vv82.setLayoutDirection(1);
        } else {
            o.LJIJI("mRecyclerView");
            throw null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setLowerThreshole(int i) {
        if (i < 0) {
            i = 0;
        }
        this.LJLILLLLZI = i;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        this.mLynxDirection = i;
        if (i == 2) {
            VV8 vv8 = this.LJLLI;
            if (vv8 != null) {
                vv8.setLayoutDirection(1);
                return;
            } else {
                o.LJIJI("mRecyclerView");
                throw null;
            }
        }
        VV8 vv82 = this.LJLLI;
        if (vv82 != null) {
            vv82.setLayoutDirection(0);
        } else {
            o.LJIJI("mRecyclerView");
            throw null;
        }
    }

    @VPD(defaultBoolean = false, name = "page-enable")
    public final void setPageEnable(boolean z) {
        this.LJLJLLL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollBarEnable(boolean z) {
        if (((VVF) this.mView).getMScrollDirection() == VVD.VERTICAL_BOTTOM || ((VVF) this.mView).getMScrollDirection() == VVD.VERTICAL_TOP) {
            VV8 vv8 = this.LJLLI;
            if (vv8 != null) {
                vv8.setVerticalScrollBarEnabled(z);
                return;
            } else {
                o.LJIJI("mRecyclerView");
                throw null;
            }
        }
        if (((VVF) this.mView).getMScrollDirection() == VVD.HORIZONTAL_LEFT || ((VVF) this.mView).getMScrollDirection() == VVD.HORIZONTAL_RIGHT) {
            VV8 vv82 = this.LJLLI;
            if (vv82 != null) {
                vv82.setHorizontalScrollBarEnabled(z);
            } else {
                o.LJIJI("mRecyclerView");
                throw null;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollLeft(int i) {
        this.LJLLLLLL = 0;
        if (!LJJII(i)) {
            this.LJLLLLLL = i;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTop(int i) {
        this.LJLLLLLL = 0;
        if (!LJJII(i)) {
            this.LJLLLLLL = i;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setUpperThreshole(int i) {
        if (i < 0) {
            i = 0;
        }
        this.LJLJI = i;
    }

    public final boolean LJJIFFI(int i, boolean z) {
        if (i < 0) {
            return false;
        }
        VV8 vv8 = this.LJLLI;
        C0A2 c0a2 = null;
        if (vv8 != null) {
            if (vv8.getAdapter() == null) {
                return false;
            }
            VV8 vv82 = this.LJLLI;
            if (vv82 != null) {
                AbstractC029409q adapter = vv82.getAdapter();
                if (adapter != null) {
                    if (adapter.getItemCount() <= i) {
                        return false;
                    }
                    if (z) {
                        VV8 vv83 = this.LJLLI;
                        if (vv83 != null) {
                            vv83.LJLIL(i);
                            return true;
                        }
                        o.LJIJI("mRecyclerView");
                        throw null;
                    }
                    VV8 vv84 = this.LJLLI;
                    if (vv84 != null) {
                        C0A2 layoutManager = vv84.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            c0a2 = layoutManager;
                        }
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0a2;
                        if (linearLayoutManager == null) {
                            return true;
                        }
                        linearLayoutManager.LJFF(i, 0);
                        return true;
                    }
                    o.LJIJI("mRecyclerView");
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final VPY hitTest(float f, float f2) {
        return super.hitTest(f, f2);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI child, int i) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxBounceView) {
            LynxBounceView lynxBounceView = (LynxBounceView) child;
            String str = lynxBounceView.LJLIL;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        ((VVF) this.mView).setMScrollDirection(VVD.VERTICAL_BOTTOM);
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        ((VVF) this.mView).setMScrollDirection(VVD.VERTICAL_TOP);
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        ((VVF) this.mView).setMScrollDirection(VVD.HORIZONTAL_LEFT);
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        ((VVF) this.mView).setMScrollDirection(VVD.HORIZONTAL_RIGHT);
                        break;
                    }
                    break;
            }
            this.LJLLILLLL = lynxBounceView;
            ((VVF) this.mView).setMBounceView(lynxBounceView.mView);
        } else if (child instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, child);
            VV8 vv8 = this.LJLLI;
            if (vv8 != null) {
                AbstractC029409q adapter = vv8.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemInserted(i);
                }
            } else {
                o.LJIJI("mRecyclerView");
                throw null;
            }
        }
        child.setParent(this);
    }

    @EWS
    public final void scrollToIndex(ReadableMap param, Callback callback) {
        o.LJIIJ(param, "param");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        try {
            if (LJJIFFI(param.getInt("index", 0), param.getBoolean("smooth", false))) {
                callback.invoke(0, javaOnlyMap);
            } else {
                callback.invoke(1, javaOnlyMap);
            }
        } catch (Throwable th) {
            javaOnlyMap.put("error", th.getMessage());
            callback.invoke(4, javaOnlyMap);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJIJJLI(LynxBaseUI target, boolean z, String block, String inline) {
        o.LJIIJ(target, "target");
        o.LJIIJ(block, "block");
        o.LJIIJ(inline, "inline");
        LJIL(target, z, block, inline, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.lynx.tasm.behavior.ui.LynxBaseUI r11, boolean r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxScrollView.LJIL(com.lynx.tasm.behavior.ui.LynxBaseUI, boolean, java.lang.String, java.lang.String, int):void");
    }

    public final void LJJIII(int i, int i2, int i3, int i4, String str) {
        VNL vnl;
        VUN vun = new VUN(getSign(), str);
        vun.LIZLLL(i, i2, this.LLD, this.LL, i - i3, i2 - i4);
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            vnl.LIZIZ(vun);
        }
    }
}
