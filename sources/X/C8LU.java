package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.api.component.AdComponentServiceImpl;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.NewReportWarnBottomBarAssem;
import com.ss.android.ugc.feed.platform.cell.interact.info.SentinelSpaceTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8LU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LU {
    public static final java.util.Set<String> LJI;
    public static final java.util.Set<String> LJII;
    public static final String LJIIIIZZ;
    public static final String LJIIIZ;
    public final int LIZ = C8ON.LIZ();
    public final int LIZIZ = C8ON.LIZIZ();
    public final java.util.Map<String, Integer> LIZJ = new LinkedHashMap();
    public final LinkedHashMap<String, C78915Uy7> LIZLLL = new LinkedHashMap<>();
    public final boolean LJ;
    public final boolean LJFF;

    static {
        java.util.Set<String> LJIIIIZZ2;
        String str;
        C65776Prg LIZJ;
        if (!C52552Kjs.LIZ()) {
            LJIIIIZZ2 = C77275UUl.LJIIIIZZ(C16880lQ.LJLLILLLL(VideoMusicTitleAssem.class), C16880lQ.LJLLILLLL(VideoMusicTitleRefactorAssem.class), C16880lQ.LJLLILLLL(NewReportWarnBottomBarAssem.class), "native_ad_bottom_label_view");
        } else {
            LJIIIIZZ2 = C77275UUl.LJIIIIZZ(C16880lQ.LJLLILLLL(NewReportWarnBottomBarAssem.class), "native_ad_bottom_label_view");
        }
        LJI = LJIIIIZZ2;
        String[] strArr = new String[12];
        strArr[0] = "story_uploading_bar";
        strArr[1] = C16880lQ.LJLLILLLL(InteractBottomBannerComponent.class);
        strArr[2] = "download_progress_view";
        strArr[3] = "ad4ad_label";
        strArr[4] = "ad_product_tile_view_stub";
        strArr[5] = C16880lQ.LJLLILLLL(FeedBottomButtonContainer.class);
        strArr[6] = C16880lQ.LJLLILLLL(VideoTagContainer.class);
        strArr[7] = "intro_ll_padding";
        strArr[8] = "ad4ad_button";
        IAdComponentService LIZLLL = AdComponentServiceImpl.LIZLLL();
        String str2 = null;
        if (LIZLLL != null && (LIZJ = LIZLLL.LIZJ()) != null) {
            str = C16880lQ.LJLLILLLL(C39557Ffl.LIZ(LIZJ));
        } else {
            str = null;
        }
        strArr[9] = str;
        strArr[10] = "ad_bottom_area_layout";
        InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LJIILL = C55723Ltv.LIZIZ.LJIJ().LJIILL();
        if (LJIILL != null) {
            str2 = C16880lQ.LJLLILLLL(C39557Ffl.LIZ(LJIILL));
        }
        strArr[11] = str2;
        java.util.Set<String> LJ = C77275UUl.LJ(strArr);
        if (C52552Kjs.LIZ()) {
            LJ.add(C16880lQ.LJLLILLLL(SentinelSpaceTrigger.class));
        }
        LJII = LJ;
        String LJLLILLLL = C16880lQ.LJLLILLLL(FeedBottomButtonContainer.class);
        o.LJII(LJLLILLLL, "null cannot be cast to non-null type kotlin.String");
        LJIIIIZZ = LJLLILLLL;
        String LJLLILLLL2 = C16880lQ.LJLLILLLL(VideoTagContainer.class);
        o.LJII(LJLLILLLL2, "null cannot be cast to non-null type kotlin.String");
        LJIIIZ = LJLLILLLL2;
    }

    public C8LU(boolean z, boolean z2) {
        this.LJ = true;
        this.LJFF = true;
        this.LJ = z;
        this.LJFF = z2;
    }

    public static int LIZJ(int i, ViewGroup viewGroup) {
        int i2;
        int i3;
        View childAt;
        int childCount = viewGroup.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt2 = viewGroup.getChildAt(i4);
            if (childAt2.getTag(R.id.bpt) instanceof Integer) {
                Object tag = childAt2.getTag(R.id.bpt);
                o.LJII(tag, "null cannot be cast to non-null type kotlin.Int");
                i2 = ((Integer) tag).intValue();
            } else {
                i2 = 0;
            }
            i4++;
            if (i4 < childCount && (childAt = viewGroup.getChildAt(i4)) != null && (childAt.getTag(R.id.bpt) instanceof Integer)) {
                Object tag2 = childAt.getTag(R.id.bpt);
                o.LJII(tag2, "null cannot be cast to non-null type kotlin.Int");
                i3 = ((Integer) tag2).intValue();
            } else {
                i3 = i4;
            }
            if (i2 >= 0 && i3 >= 0 && i >= i2 && i <= i3) {
                return i4;
            }
        }
        return -1;
    }

    public final void LIZLLL(View view, ReusedUIAssem ins) {
        o.LJIIIZ(ins, "ins");
        ViewGroup viewGroup = (ViewGroup) view;
        String cls = ins.getClass().toString();
        o.LJIIIIZZ(cls, "ins.javaClass.toString()");
        if (this.LIZJ.containsKey(cls)) {
            View containerView = ins.getContainerView();
            Object tag = containerView.getTag(R.id.bpt);
            int i = -1;
            if (tag != null) {
                if (tag instanceof Integer) {
                    i = ((Number) tag).intValue();
                }
                if (i == 0) {
                    LIZ(viewGroup, containerView, i, LJI.contains(cls), LJII.contains(C16880lQ.LJLLILLLL(ins.getClass())), null);
                    this.LIZJ.remove(cls);
                }
            }
            LIZ(viewGroup, containerView, LIZJ(i, viewGroup), LJI.contains(cls), LJII.contains(C16880lQ.LJLLILLLL(ins.getClass())), null);
            this.LIZJ.remove(cls);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.widget.LinearLayout, X.8hq, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r15v3, types: [android.widget.LinearLayout, X.8hq, android.view.View, android.view.ViewGroup] */
    public final View LIZIZ(int i, ViewGroup containerView, ReusedUIAssem<? extends C3C8> instance, RootCellCommonAbility rootCellCommonAbility) {
        int childCount;
        C218518hr c218518hr;
        int i2;
        View V8;
        String LJLLILLLL;
        o.LJIIIZ(containerView, "containerView");
        o.LJIIIZ(instance, "instance");
        if (containerView.getId() == R.id.eps) {
            if (instance instanceof BaseCellPlaceHolderComponent) {
                LJLLILLLL = ((BaseCellPlaceHolderComponent) instance).LL;
            } else {
                LJLLILLLL = C16880lQ.LJLLILLLL(instance.getClass());
            }
            o.LJIIIIZZ(LJLLILLLL, "if (instance is BaseCell…ame\n                    }");
            if (C214128am.LIZ() && C8LT.LIZ.contains(LJLLILLLL)) {
                childCount = containerView.indexOfChild(containerView.findViewById(R.id.epw));
            } else if (C8MS.LIZ() && C8LT.LIZ.contains(LJLLILLLL)) {
                childCount = containerView.indexOfChild(containerView.findViewById(R.id.ept));
            } else if (C2301991r.LIZ() && C8LT.LIZIZ.contains(LJLLILLLL)) {
                childCount = containerView.indexOfChild(containerView.findViewById(R.id.epu));
            } else if (C226128u8.LIZ() && C8LT.LIZJ.contains(LJLLILLLL)) {
                childCount = containerView.indexOfChild(containerView.findViewById(R.id.epv));
            } else {
                childCount = containerView.getChildCount();
            }
        } else {
            childCount = containerView.getChildCount();
        }
        int i3 = childCount + i;
        Integer num = null;
        if (instance instanceof BaseCellPlaceHolderComponent) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(instance.getClass().toString());
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent = (BaseCellPlaceHolderComponent) instance;
            LIZ.append(baseCellPlaceHolderComponent.LL);
            this.LIZLLL.put(X1D.LIZIZ(LIZ), new C78915Uy7());
            if (rootCellCommonAbility != null && (V8 = rootCellCommonAbility.V8(baseCellPlaceHolderComponent.LL, false)) != null) {
                V8.setTag(R.id.bpt, Integer.valueOf(i3));
                if (LJII.contains(baseCellPlaceHolderComponent.LL)) {
                    LIZ(containerView, V8, -1, false, true, null);
                } else {
                    LIZ(containerView, V8, -1, LJI.contains(baseCellPlaceHolderComponent.LL), false, null);
                }
                return V8;
            }
            return new View(containerView.getContext());
        }
        String cls = instance.getClass().toString();
        o.LJIIIIZZ(cls, "instance.javaClass.toString()");
        this.LIZLLL.put(cls, new C78915Uy7());
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        String LJLLILLLL2 = C16880lQ.LJLLILLLL(instance.getClass());
        String str = LJIIIIZZ;
        int i4 = -1;
        if (o.LJ(str, LJLLILLLL2)) {
            ?? c218508hq = new C218508hq(context, null);
            c218508hq.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            c218508hq.setOrientation(1);
            c218508hq.setClipChildren(false);
            c218508hq.setClipToPadding(false);
            c218518hr = c218508hq;
        } else if (o.LJ(LJIIIZ, LJLLILLLL2)) {
            ?? c218508hq2 = new C218508hq(context, null);
            c218508hq2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            c218508hq2.setOrientation(0);
            c218508hq2.setClipChildren(false);
            c218508hq2.setClipToPadding(false);
            c218518hr = c218508hq2;
        } else {
            c218518hr = new C218518hr(context, null);
        }
        if (!this.LJ) {
            i4 = -2;
        }
        c218518hr.setLayoutParams(new ViewGroup.MarginLayoutParams(i4, -2));
        if (instance instanceof BaseContainer) {
            if (o.LJ(C16880lQ.LJLLILLLL(instance.getClass()), str)) {
                i2 = R.id.bpu;
            } else {
                i2 = R.id.bpv;
            }
        } else {
            i2 = R.id.bpt;
        }
        c218518hr.setId(i2);
        c218518hr.setVisibility(8);
        c218518hr.setTag(R.id.bpt, Integer.valueOf(i3));
        if (instance instanceof BaseCellTriggerComponent) {
            java.util.Map<String, Integer> map = this.LIZJ;
            String cls2 = instance.getClass().toString();
            o.LJIIIIZZ(cls2, "instance.javaClass.toString()");
            map.put(cls2, Integer.valueOf(i3));
        } else {
            boolean contains = LJI.contains(C16880lQ.LJLLILLLL(instance.getClass()));
            boolean contains2 = LJII.contains(C16880lQ.LJLLILLLL(instance.getClass()));
            String LJLLILLLL3 = C16880lQ.LJLLILLLL(instance.getClass());
            if (((Number) C52689Km5.LIZ.getValue()).intValue() != 0 && o.LJ(LJLLILLLL3, C16880lQ.LJLLILLLL(VideoAuthorInfoRelationAssem.class))) {
                num = AnonymousClass391.LIZJ(6);
            }
            LIZ(containerView, c218518hr, -1, contains, contains2, num);
        }
        return c218518hr;
    }

    public final void LIZ(ViewGroup viewGroup, View view, int i, boolean z, boolean z2, Integer num) {
        boolean z3;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (viewGroup.getId() == R.id.eps) {
            Object tag = view.getTag(R.id.bpt);
            o.LJII(tag, "null cannot be cast to non-null type kotlin.Int");
            viewGroup.addView(view, LIZJ(((Integer) tag).intValue(), viewGroup));
        } else if (i >= 0) {
            viewGroup.addView(view, i);
        } else {
            viewGroup.addView(view);
        }
        if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            i2 = this.LIZIZ;
        } else {
            i2 = this.LIZ;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (z3) {
                int marginStart = marginLayoutParams.getMarginStart();
                int i3 = marginLayoutParams.topMargin;
                int i4 = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = i3;
                marginLayoutParams.setMarginEnd(i2);
                marginLayoutParams.bottomMargin = i4;
                return;
            }
            if (!this.LJFF || z2) {
                return;
            }
            if (num != null) {
                i2 = num.intValue();
            }
            int marginStart2 = marginLayoutParams.getMarginStart();
            int i5 = marginLayoutParams.topMargin;
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(marginStart2);
            marginLayoutParams.topMargin = i5;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i2;
        }
    }
}
