package X;

import Y.ACListenerS34S0100000_14;
import Y.ALAdapterS5S0110000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wl9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83207Wl9 extends FrameLayout implements GenericLifecycleObserver, InterfaceC82227WOx {
    public InterfaceC83144Wk8 LJLIL;
    public InterfaceC83246Wlm LJLILLLLZI;
    public InterfaceC83233WlZ LJLJI;
    public final View LJLJJI;
    public final View LJLJJL;
    public final TDX LJLJJLL;
    public final RelativeLayout LJLJL;
    public final C80700Vlo LJLJLJ;
    public final C8HP LJLJLLL;
    public final C73124Smu LJLL;
    public final RelativeLayout LJLLI;
    public final FrameLayout LJLLILLLL;
    public final TextView LJLLJ;
    public final C73124Smu LJLLL;
    public final C8HN LJLLLL;
    public final C81227VuJ LJLLLLLL;
    public final C81227VuJ LJLZ;
    public final LinearLayout LJZ;
    public final RelativeLayout LJZI;
    public final ViewGroup LJZL;
    public final C80371VgV LL;
    public final ImageView LLD;
    public final TextView LLF;
    public final TextView LLFF;
    public final C83222WlO LLFFF;
    public final C83222WlO LLFII;
    public ComposerBeauty LLFZ;
    public ComposerBeauty LLI;
    public boolean LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public ComposerBeauty LLIIII;
    public C83209WlB LLIIIILZ;
    public ViewGroup LLIIIJ;
    public final C83202Wl4 LLIIIL;
    public final C83199Wl1 LLIIIZ;
    public final java.util.Map<BeautyCategory, List<ComposerBeauty>> LLIIJI;
    public final AqS196S0100000_14 LLIIJLIL;
    public final AqS196S0100000_14 LLIIL;
    public InterfaceC83144Wk8 LLIILII;
    public boolean LLIILZL;
    public final InterfaceC83142Wk6 LLIIZ;
    public C83232WlY LLIL;

    private final C76800UCe getInitObserversOnce() {
        return (C76800UCe) this.LLII.getValue();
    }

    @Override // X.InterfaceC82227WOx
    public final void S5() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void setProgressbarColor(int i) {
    }

    public final void setProgressbarDrawable(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
    }

    public final C81227VuJ getPbProgressBar() {
        C81227VuJ pbProgressBar = this.LJLLLLLL;
        o.LJIIIIZZ(pbProgressBar, "pbProgressBar");
        return pbProgressBar;
    }

    public final ImageView getResetIcon() {
        ImageView ivClearIcon = this.LLD;
        o.LJIIIIZZ(ivClearIcon, "ivClearIcon");
        return ivClearIcon;
    }

    public final RelativeLayout getRlClearContainer() {
        RelativeLayout rlClearContainer = this.LJZI;
        o.LJIIIIZZ(rlClearContainer, "rlClearContainer");
        return rlClearContainer;
    }

    public final C81227VuJ getSecondPbProgressBar() {
        C81227VuJ secondPbProgressBar = this.LJLZ;
        o.LJIIIIZZ(secondPbProgressBar, "secondPbProgressBar");
        return secondPbProgressBar;
    }

    @Override // X.InterfaceC82227WOx
    public final void hide() {
        if (!this.LLIILZL) {
            return;
        }
        this.LLIILZL = false;
        C83209WlB c83209WlB = this.LLIIIILZ;
        if (c83209WlB != null) {
            c83209WlB.LIZJ(new C30461Hm());
        }
        InterfaceC83246Wlm interfaceC83246Wlm = this.LJLILLLLZI;
        if (interfaceC83246Wlm != null) {
            interfaceC83246Wlm.LIZLLL(this.LLIIII);
        }
        InterfaceC83144Wk8 interfaceC83144Wk8 = this.LLIILII;
        if (interfaceC83144Wk8 != null) {
            interfaceC83144Wk8.onDismiss();
        }
        InterfaceC83144Wk8 interfaceC83144Wk82 = this.LJLIL;
        if (interfaceC83144Wk82 != null) {
            interfaceC83144Wk82.onDismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
    
        if (r2 != null) goto L42;
     */
    @Override // X.InterfaceC82227WOx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83207Wl9.show():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getInitObserversOnce();
    }

    public final C83222WlO getAlbumAdapter() {
        return this.LLFII;
    }

    public final InterfaceC83246Wlm getBeautyBuried() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC83233WlZ getBeautyOnInteractListener() {
        return this.LJLJI;
    }

    public final InterfaceC83144Wk8 getBeautyViewListener() {
        return this.LJLIL;
    }

    public final C83222WlO getCategoryAdapter() {
        return this.LLFFF;
    }

    public ViewGroup getContainer() {
        return this.LLIIIJ;
    }

    public final ComposerBeauty getCurSelectAlbumBeauty() {
        return this.LLI;
    }

    public final ComposerBeauty getCurSelectBeauty() {
        return this.LLFZ;
    }

    public final InterfaceC83144Wk8 getOnBeautyViewListener() {
        return this.LLIILII;
    }

    public final C83202Wl4 getResetHelper() {
        return this.LLIIIL;
    }

    public final View getRoot() {
        return this.LJLJJI;
    }

    public final C83199Wl1 getSeekBarHelper() {
        return this.LLIIIZ;
    }

    public final InterfaceC83142Wk6 getSource() {
        return this.LLIIZ;
    }

    public final C80371VgV getSwEnableBeauty() {
        return this.LL;
    }

    public final TextView getTvFirstPbTitle() {
        return this.LLF;
    }

    public final TextView getTvSecondPbTitle() {
        return this.LLFF;
    }

    public final C83232WlY getViewConfig() {
        return this.LLIL;
    }

    private final void setTabItemAlign(int i) {
        if (i == 1) {
            C80700Vlo tbCategoryTab = this.LJLJLJ;
            o.LJIIIIZZ(tbCategoryTab, "tbCategoryTab");
            tbCategoryTab.setTabMode(1);
            C80700Vlo tbCategoryTab2 = this.LJLJLJ;
            o.LJIIIIZZ(tbCategoryTab2, "tbCategoryTab");
            ViewGroup.LayoutParams layoutParams = tbCategoryTab2.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                layoutParams2.leftMargin = (int) C74275TDb.LIZIZ(context, 76.0f);
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                layoutParams2.setMarginStart((int) C74275TDb.LIZIZ(context2, 76.0f));
                C80700Vlo tbCategoryTab3 = this.LJLJLJ;
                o.LJIIIIZZ(tbCategoryTab3, "tbCategoryTab");
                tbCategoryTab3.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        C80700Vlo tbCategoryTab4 = this.LJLJLJ;
        o.LJIIIIZZ(tbCategoryTab4, "tbCategoryTab");
        int i2 = 0;
        tbCategoryTab4.setTabMode(0);
        C80700Vlo tbCategoryTab5 = this.LJLJLJ;
        o.LJIIIIZZ(tbCategoryTab5, "tbCategoryTab");
        ViewGroup.LayoutParams layoutParams3 = tbCategoryTab5.getLayoutParams();
        if (layoutParams3 != null) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            if (this.LLIL.LIZLLL) {
                Context context3 = getContext();
                o.LJIIIIZZ(context3, "context");
                i2 = (int) C74275TDb.LIZIZ(context3, 56.0f);
            }
            layoutParams4.leftMargin = i2;
            layoutParams4.setMarginStart(i2);
            C80700Vlo tbCategoryTab6 = this.LJLJLJ;
            o.LJIIIIZZ(tbCategoryTab6, "tbCategoryTab");
            tbCategoryTab6.setLayoutParams(layoutParams4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public final void LIZ(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float LIZ;
        float f5;
        float f6;
        RelativeLayout relativeLayout = this.LJLJL;
        float[] fArr = new float[2];
        float f7 = 0.0f;
        if (z) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            f = -C83258Wly.LIZ(context);
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.0f;
        } else {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            f2 = -C83258Wly.LIZ(context2);
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "translationX", fArr);
        RelativeLayout relativeLayout2 = this.LJLJL;
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", fArr2);
        RelativeLayout relativeLayout3 = this.LJLLI;
        float[] fArr3 = new float[2];
        if (z) {
            LIZ = 0.0f;
        } else {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            LIZ = C83258Wly.LIZ(context3);
        }
        fArr3[0] = LIZ;
        if (z) {
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            f5 = C83258Wly.LIZ(context4);
        } else {
            f5 = 0.0f;
        }
        fArr3[1] = f5;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(relativeLayout3, "translationX", fArr3);
        RelativeLayout relativeLayout4 = this.LJLLI;
        float[] fArr4 = new float[2];
        if (z) {
            f6 = 1.0f;
        } else {
            f6 = 0.0f;
        }
        fArr4[0] = f6;
        if (!z) {
            f7 = 1.0f;
        }
        fArr4[1] = f7;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(relativeLayout4, "alpha", fArr4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.addListener(new ALAdapterS5S0110000_14(this, z, 0));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void LIZIZ(List<BeautyCategory> list) {
        BeautyCategory beautyCategory;
        C164456cr LJIIJJI;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        C73124Smu rvCategoryContent = this.LJLL;
        o.LJIIIIZZ(rvCategoryContent, "rvCategoryContent");
        rvCategoryContent.setLayoutManager(linearLayoutManager);
        C73124Smu rvCategoryContent2 = this.LJLL;
        o.LJIIIIZZ(rvCategoryContent2, "rvCategoryContent");
        rvCategoryContent2.setAdapter(this.LLFFF);
        C73124Smu rvCategoryContent3 = this.LJLL;
        o.LJIIIIZZ(rvCategoryContent3, "rvCategoryContent");
        AbstractC030109x itemAnimator = rvCategoryContent3.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJFF = 0L;
        }
        getContext();
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
        linearLayoutManager2.LLJJIII(0);
        C73124Smu rvAlbumContent = this.LJLLL;
        o.LJIIIIZZ(rvAlbumContent, "rvAlbumContent");
        rvAlbumContent.setLayoutManager(linearLayoutManager2);
        C73124Smu rvAlbumContent2 = this.LJLLL;
        o.LJIIIIZZ(rvAlbumContent2, "rvAlbumContent");
        rvAlbumContent2.setAdapter(this.LLFII);
        C73124Smu rvCategoryContent4 = this.LJLL;
        o.LJIIIIZZ(rvCategoryContent4, "rvCategoryContent");
        AbstractC030109x itemAnimator2 = rvCategoryContent4.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.LJFF = 0L;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BeautyCategory beautyCategory2 : list) {
            arrayList2.add(beautyCategory2.getCategoryResponse().getId());
            arrayList.add(beautyCategory2.getCategoryResponse().getName());
        }
        if (arrayList.size() <= 1) {
            this.LJLJLJ.setHideIndicatorView(true);
        } else {
            this.LJLJLJ.setHideIndicatorView(false);
        }
        if (list.size() > 4) {
            C8HP vTabDivider = this.LJLJLLL;
            o.LJIIIIZZ(vTabDivider, "vTabDivider");
            vTabDivider.setVisibility(0);
        } else {
            C8HP vTabDivider2 = this.LJLJLLL;
            o.LJIIIIZZ(vTabDivider2, "vTabDivider");
            vTabDivider2.setVisibility(8);
        }
        setTabItemAlign(list.size());
        this.LJLJLJ.LJIILJJIL();
        for (BeautyCategory beautyCategory3 : list) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            THN LIZ = C163486bI.LIZ(context);
            if (TextUtils.isEmpty(beautyCategory3.getCategoryResponse().getIcon_normal_url())) {
                LIZ.setText(beautyCategory3.getCategoryResponse().getName());
            } else {
                String icon_normal_url = beautyCategory3.getCategoryResponse().getIcon_normal_url();
                if (icon_normal_url != null) {
                    LIZ.setImage(icon_normal_url);
                }
            }
            C164456cr LJIIL = this.LJLJLJ.LJIIL();
            LJIIL.LIZLLL = LIZ;
            LJIIL.LIZIZ();
            C80686Vla c80686Vla = LJIIL.LJI;
            if (c80686Vla != null) {
                c80686Vla.setBackgroundColor(C04330Ez.LIZIZ(c80686Vla.getContext(), R.color.yi));
            }
            this.LJLJLJ.LIZLLL(LJIIL, false);
        }
        this.LJLJLJ.setOnTabClickListener(new C83220WlM(this, list, arrayList2));
        C80700Vlo c80700Vlo = this.LJLJLJ;
        C83215WlH c83215WlH = new C83215WlH(this, list, arrayList2);
        c80700Vlo.getClass();
        c80700Vlo.LLIIJLIL = c83215WlH;
        Iterator<BeautyCategory> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                beautyCategory = it.next();
                if (beautyCategory.getSelected()) {
                    break;
                }
            } else {
                beautyCategory = null;
                break;
            }
        }
        BeautyCategory beautyCategory4 = beautyCategory;
        if (beautyCategory4 != null && (LJIIJJI = this.LJLJLJ.LJIIJJI(list.indexOf(beautyCategory4))) != null) {
            LJIIJJI.LIZ();
            InterfaceC83233WlZ interfaceC83233WlZ = this.LJLJI;
            if (interfaceC83233WlZ != null) {
                interfaceC83233WlZ.LIZLLL(beautyCategory4);
            }
        }
        if (this.LLIIZ.S7().getHasTitle()) {
            this.LLIL.LJIIIIZZ.getClass();
            C80700Vlo tbCategoryTab = this.LJLJLJ;
            o.LJIIIIZZ(tbCategoryTab, "tbCategoryTab");
            tbCategoryTab.setVisibility(0);
        } else {
            C80700Vlo tbCategoryTab2 = this.LJLJLJ;
            o.LJIIIIZZ(tbCategoryTab2, "tbCategoryTab");
            tbCategoryTab2.setVisibility(4);
        }
        this.LLFFF.LJLJI = this.LLIIJLIL;
        this.LLFII.LJLJI = this.LLIIL;
        if (this.LLIFFJFJJ) {
            LIZJ(this, this.LLI, true, false, 20);
        } else {
            LIZJ(this, this.LLFZ, false, false, 22);
        }
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            LinearLayout rlSeekBarContainer = this.LJZ;
            o.LJIIIIZZ(rlSeekBarContainer, "rlSeekBarContainer");
            rlSeekBarContainer.setVisibility(0);
        } else {
            LinearLayout rlSeekBarContainer2 = this.LJZ;
            o.LJIIIIZZ(rlSeekBarContainer2, "rlSeekBarContainer");
            rlSeekBarContainer2.setVisibility(8);
        }
    }

    public final void setBeautyBuried(InterfaceC83246Wlm interfaceC83246Wlm) {
        this.LJLILLLLZI = interfaceC83246Wlm;
    }

    public final void setBeautyOnInteractListener(InterfaceC83233WlZ interfaceC83233WlZ) {
        this.LJLJI = interfaceC83233WlZ;
    }

    public final void setBeautyShowDot(ComposerBeauty composerBeauty) {
        if (this.LLIL.LIZLLL) {
            C80371VgV swEnableBeauty = this.LL;
            o.LJIIIIZZ(swEnableBeauty, "swEnableBeauty");
            if (!swEnableBeauty.LJLJLJ) {
                return;
            }
        }
        this.LLIIZ.X7(composerBeauty);
    }

    public final void setBeautyViewListener(InterfaceC83144Wk8 interfaceC83144Wk8) {
        this.LJLIL = interfaceC83144Wk8;
        if (interfaceC83144Wk8 != null) {
            C80371VgV swEnableBeauty = this.LL;
            o.LJIIIIZZ(swEnableBeauty, "swEnableBeauty");
            interfaceC83144Wk8.LIZJ(swEnableBeauty.LJLJLJ);
        }
    }

    @Override // X.InterfaceC82227WOx
    public void setContainer(ViewGroup value) {
        o.LJIIIZ(value, "value");
        this.LLIIIJ = value;
        this.LLIIIILZ = new C83209WlB(value, this, this.LJLJJI);
    }

    public final void setCurSelectAlbumBeauty(ComposerBeauty beauty) {
        o.LJIIIZ(beauty, "beauty");
        this.LLI = beauty;
    }

    public final void setCurSelectBeauty(ComposerBeauty beauty) {
        o.LJIIIZ(beauty, "beauty");
        this.LLFZ = beauty;
    }

    public void setListener(InterfaceC83144Wk8 interfaceC83144Wk8) {
        this.LLIILII = interfaceC83144Wk8;
    }

    public final void setOnBeautyViewListener(InterfaceC83144Wk8 interfaceC83144Wk8) {
        this.LLIILII = interfaceC83144Wk8;
    }

    public void setOnInteractListener(InterfaceC83233WlZ interfaceC83233WlZ) {
        this.LJLJI = interfaceC83233WlZ;
    }

    public final void setShow(boolean z) {
        this.LLIILZL = z;
    }

    public final void setViewConfig(C83232WlY c83232WlY) {
        o.LJIIIZ(c83232WlY, "<set-?>");
        this.LLIL = c83232WlY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83207Wl9(Context context, InterfaceC83142Wk6 source, C83232WlY viewConfig) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(viewConfig, "viewConfig");
        this.LLIIZ = source;
        this.LLIL = viewConfig;
        this.LJLJI = viewConfig.LJ;
        int i = viewConfig.LJFF.LIZ;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i == 0 ? R.layout.jy : i, this, true);
        o.LJIIIIZZ(LLLLIILL, "viewConfig.let {\n       …outRes, this, true)\n    }");
        this.LJLJJI = LLLLIILL;
        View outsideTouch = LLLLIILL.findViewById(R.id.n20);
        this.LJLJJL = outsideTouch;
        this.LJLJJLL = (TDX) LLLLIILL.findViewById(R.id.dd3);
        this.LJLJL = (RelativeLayout) LLLLIILL.findViewById(R.id.j4d);
        this.LJLJLJ = (C80700Vlo) LLLLIILL.findViewById(R.id.lba);
        this.LJLJLLL = (C8HP) LLLLIILL.findViewById(R.id.n1z);
        C73124Smu rvCategoryContent = (C73124Smu) LLLLIILL.findViewById(R.id.j9n);
        this.LJLL = rvCategoryContent;
        RelativeLayout rlAlbumContainer = (RelativeLayout) LLLLIILL.findViewById(R.id.j4b);
        this.LJLLI = rlAlbumContainer;
        this.LJLLILLLL = (FrameLayout) LLLLIILL.findViewById(R.id.dd1);
        this.LJLLJ = (TextView) LLLLIILL.findViewById(R.id.m2n);
        C73124Smu rvAlbumContent = (C73124Smu) LLLLIILL.findViewById(R.id.j9l);
        this.LJLLL = rvAlbumContent;
        this.LJLLLL = (C8HN) LLLLIILL.findViewById(R.id.m2p);
        this.LJLLLLLL = (C81227VuJ) LLLLIILL.findViewById(R.id.hjp);
        this.LJLZ = (C81227VuJ) LLLLIILL.findViewById(R.id.hjq);
        this.LJZ = (LinearLayout) LLLLIILL.findViewById(R.id.j4g);
        this.LJZI = (RelativeLayout) LLLLIILL.findViewById(R.id.j4e);
        this.LJZL = (ViewGroup) LLLLIILL.findViewById(R.id.dd2);
        this.LL = (C80371VgV) LLLLIILL.findViewById(R.id.d_e);
        this.LLD = (ImageView) LLLLIILL.findViewById(R.id.f0u);
        View findViewById = LLLLIILL.findViewById(R.id.mje);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.tv_seek_bar_title_first)");
        this.LLF = (TextView) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.mjf);
        o.LJIIIIZZ(findViewById2, "root.findViewById(R.id.tv_seek_bar_title_second)");
        this.LLFF = (TextView) findViewById2;
        C83232WlY c83232WlY = this.LLIL;
        o.LJIIIIZZ(rvCategoryContent, "rvCategoryContent");
        this.LLFFF = new C83222WlO(c83232WlY, rvCategoryContent);
        C83232WlY c83232WlY2 = this.LLIL;
        o.LJIIIIZZ(rvAlbumContent, "rvAlbumContent");
        this.LLFII = new C83222WlO(c83232WlY2, rvAlbumContent);
        this.LLII = C221108m2.LIZIZ(new AqS161S0200000_14(this, context, 21));
        this.LLIIIJ = new FrameLayout(context);
        this.LLIIIL = new C83202Wl4(source, this);
        this.LLIIIZ = new C83199Wl1(source, this);
        this.LLIIJI = new LinkedHashMap();
        this.LLIIJLIL = new AqS196S0100000_14(this, 23);
        this.LLIIL = new AqS196S0100000_14(this, 22);
        o.LJIIIIZZ(rlAlbumContainer, "rlAlbumContainer");
        rlAlbumContainer.setAlpha(0.0f);
        rlAlbumContainer.setTranslationX(C83258Wly.LIZ(context));
        if (this.LLIL.LIZIZ) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 48), outsideTouch);
        } else {
            o.LJIIIIZZ(outsideTouch, "outsideTouch");
            outsideTouch.setClickable(false);
        }
    }

    public static void LIZJ(C83207Wl9 c83207Wl9, ComposerBeauty composerBeauty, boolean z, boolean z2, int i) {
        boolean z3;
        ComposerBeauty composerBeauty2;
        boolean z4;
        boolean z5;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 16) != 0) {
            composerBeauty2 = composerBeauty;
        } else {
            composerBeauty2 = null;
        }
        if (z3) {
            InterfaceC83246Wlm interfaceC83246Wlm = c83207Wl9.LJLILLLLZI;
            if (interfaceC83246Wlm != null) {
                interfaceC83246Wlm.LIZLLL(c83207Wl9.LLIIII);
            }
            c83207Wl9.LLIIII = composerBeauty2;
        }
        if (composerBeauty == null) {
            c83207Wl9.LIZLLL(false);
            return;
        }
        if (z) {
            Iterator<ComposerBeauty> it = c83207Wl9.LLFII.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                ComposerBeauty next = it.next();
                if (o.LJ(next, composerBeauty) && next.getEnable()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                next.setSelected(z5);
            }
        } else {
            Iterator<ComposerBeauty> it2 = c83207Wl9.LLFFF.LJLILLLLZI.iterator();
            while (it2.hasNext()) {
                ComposerBeauty next2 = it2.next();
                if (o.LJ(next2, composerBeauty) && next2.getEnable()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                next2.setSelected(z4);
            }
        }
        if (composerBeauty.isCollectionType()) {
            c83207Wl9.LIZLLL(false);
            return;
        }
        if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
            c83207Wl9.LIZLLL(false);
        } else {
            c83207Wl9.LIZLLL(true);
        }
        if (C1DH.LJIJ(composerBeauty)) {
            c83207Wl9.LLI = composerBeauty;
        } else {
            c83207Wl9.LLFZ = composerBeauty;
        }
        c83207Wl9.LLIIIZ.LIZJ();
        C81227VuJ secondPbProgressBar = c83207Wl9.LJLZ;
        o.LJIIIIZZ(secondPbProgressBar, "secondPbProgressBar");
        secondPbProgressBar.setVisibility(8);
        c83207Wl9.LLIIIZ.LIZLLL(composerBeauty, z2, true);
        c83207Wl9.LLIIIL.LIZ();
    }
}
