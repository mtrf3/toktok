package X;

import Y.ALAdapterS5S0110000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.zhiliaoapp.musically.R;
import djb.IDaS27S0000000_14;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import ujb.s;

/* renamed from: X.WlC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83210WlC implements InterfaceC83247Wln {
    public final C64962gm LIZ;
    public final RelativeLayout LIZIZ;
    public final C73124Smu LIZJ;
    public final LinearLayout LIZLLL;
    public final FrameLayout LJ;
    public final RelativeLayout LJFF;
    public final FrameLayout LJI;
    public final TextView LJII;
    public final C73124Smu LJIIIIZZ;
    public ComposerBeauty LJIIIZ;
    public ComposerBeauty LJIIJ;
    public boolean LJIIJJI;
    public C83224WlQ LJIIL;
    public final java.util.Map<BeautyCategory, List<ComposerBeauty>> LJIILIIL;
    public final C83222WlO LJIILJJIL;
    public final C83222WlO LJIILL;
    public final Context LJIILLIIL;
    public final View LJIIZILJ;
    public final C83232WlY LJIJ;
    public final C83216WlI LJIJI;

    @Override // X.InterfaceC83247Wln
    public final void LIZ() {
    }

    @Override // X.InterfaceC83247Wln
    public final boolean LJII() {
        if (!this.LJIJ.LJI.LJJI) {
            return true;
        }
        java.util.Set<BeautyCategory> keySet = ((LinkedHashMap) this.LJIILIIL).keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return true;
        }
        for (BeautyCategory beautyCategory : keySet) {
            C83216WlI c83216WlI = this.LJIJI;
            String categoryId = beautyCategory.getCategoryResponse().getId();
            boolean z = this.LJIJ.LJIIJJI;
            c83216WlI.getClass();
            o.LJIIIZ(categoryId, "categoryId");
            if (!c83216WlI.LIZ.LJFF(categoryId, z)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC83247Wln
    public final void LJIIIZ() {
        InterfaceC83246Wlm interfaceC83246Wlm;
        if (!this.LJIJ.LJI.LJJI) {
            return;
        }
        this.LJIILJJIL.LJZI(true);
        this.LJIILJJIL.notifyDataSetChanged();
        for (BeautyCategory beautyCategory : ((LinkedHashMap) this.LJIILIIL).keySet()) {
            C83216WlI c83216WlI = this.LJIJI;
            String categoryId = beautyCategory.getCategoryResponse().getId();
            c83216WlI.getClass();
            o.LJIIIZ(categoryId, "categoryId");
            c83216WlI.LIZ.LJ(categoryId, true);
        }
        C83216WlI c83216WlI2 = this.LJIJI;
        c83216WlI2.getClass();
        C68249QqT c68249QqT = c83216WlI2.LIZLLL;
        if (c68249QqT != null && (interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT.LIZ) != null) {
            interfaceC83246Wlm.LIZIZ("auto");
        }
    }

    @Override // X.InterfaceC83247Wln
    public final C83222WlO LIZJ() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC83247Wln
    public final ComposerBeauty LJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC83247Wln
    public final boolean LJI() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC83247Wln
    public final C83222WlO LJIIIIZZ() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC83247Wln
    public final ComposerBeauty LJIIJ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC83247Wln
    public final void LIZIZ(ComposerBeauty composerBeauty) {
        this.LJIIJ = composerBeauty;
    }

    @Override // X.InterfaceC83247Wln
    public final void LIZLLL(boolean z) {
        C83222WlO c83222WlO;
        Integer num;
        Integer num2;
        C83224WlQ c83224WlQ = this.LJIIL;
        if (c83224WlQ != null) {
            Drawable drawable = null;
            if (this.LJIJI.LIZ.LIZ()) {
                Context context = c83224WlQ.getContext();
                OSZ<Integer, ? extends Drawable> osz = this.LJIJ.LJI.LJIL;
                if (osz != null) {
                    num2 = osz.getFirst();
                } else {
                    num2 = null;
                }
                o.LJI(num2);
                c83224WlQ.setText(context.getString(num2.intValue()));
                C72790ShW imageView = c83224WlQ.getImageView();
                OSZ<Integer, ? extends Drawable> osz2 = this.LJIJ.LJI.LJIL;
                if (osz2 != null) {
                    drawable = osz2.getSecond();
                }
                imageView.setImageDrawable(drawable);
            } else {
                Context context2 = c83224WlQ.getContext();
                OSZ<Integer, ? extends Drawable> osz3 = this.LJIJ.LJI.LJJ;
                if (osz3 != null) {
                    num = osz3.getFirst();
                } else {
                    num = null;
                }
                o.LJI(num);
                c83224WlQ.setText(context2.getString(num.intValue()));
                C72790ShW imageView2 = c83224WlQ.getImageView();
                OSZ<Integer, ? extends Drawable> osz4 = this.LJIJ.LJI.LJJ;
                if (osz4 != null) {
                    drawable = osz4.getSecond();
                }
                imageView2.setImageDrawable(drawable);
            }
        }
        if (z && (c83222WlO = this.LJIILJJIL) != null) {
            c83222WlO.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC83247Wln
    public final void LJFF(ComposerBeauty composerBeauty) {
        this.LJIIIZ = composerBeauty;
    }

    @Override // X.InterfaceC83247Wln
    public final void LJIIJJI(BeautyCategory beautyCategory) {
        ComposerBeauty composerBeauty;
        int i;
        if (this.LJIJ.LJI.LJIILIIL) {
            LinearLayout rlBeautySwitchButtonLayout = this.LIZLLL;
            o.LJIIIIZZ(rlBeautySwitchButtonLayout, "rlBeautySwitchButtonLayout");
            if (s.LJJJLZIJ(beautyCategory.getCategoryResponse().getKey(), "beauty", false)) {
                i = 0;
            } else {
                i = 8;
            }
            rlBeautySwitchButtonLayout.setVisibility(i);
        }
        if (s.LJJJLZIJ(beautyCategory.getCategoryResponse().getKey(), "beauty", false)) {
            this.LJIJ.LJI.LJIIIIZZ = R.color.dz;
        } else {
            this.LJIJ.LJI.LJIIIIZZ = R.color.el;
        }
        C83222WlO.LJLZ(this.LJIILJJIL, beautyCategory.getBeautyList());
        Iterator<ComposerBeauty> it = this.LJIILJJIL.LJLILLLLZI.iterator();
        while (true) {
            if (it.hasNext()) {
                composerBeauty = it.next();
                if (composerBeauty.getSelected()) {
                    break;
                }
            } else {
                composerBeauty = null;
                break;
            }
        }
        LJIILIIL(this, composerBeauty, false, false, 30);
    }

    public final void LJIIL(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float LIZ;
        float f5;
        float f6;
        RelativeLayout relativeLayout = this.LIZIZ;
        float[] fArr = new float[2];
        float f7 = 0.0f;
        if (z) {
            f = -C83258Wly.LIZ(this.LJIILLIIL);
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = -C83258Wly.LIZ(this.LJIILLIIL);
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "translationX", fArr);
        RelativeLayout relativeLayout2 = this.LIZIZ;
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
        RelativeLayout relativeLayout3 = this.LJFF;
        float[] fArr3 = new float[2];
        if (z) {
            LIZ = 0.0f;
        } else {
            LIZ = C83258Wly.LIZ(this.LJIILLIIL);
        }
        fArr3[0] = LIZ;
        if (z) {
            f5 = C83258Wly.LIZ(this.LJIILLIIL);
        } else {
            f5 = 0.0f;
        }
        fArr3[1] = f5;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(relativeLayout3, "translationX", fArr3);
        RelativeLayout relativeLayout4 = this.LJFF;
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
        animatorSet.addListener(new ALAdapterS5S0110000_14(this, z, 1));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void LJIILJJIL(boolean z) {
        InterfaceC83246Wlm interfaceC83246Wlm;
        InterfaceC83246Wlm interfaceC83246Wlm2;
        this.LJIJI.LIZ.LIZJ(!z);
        if (z) {
            C68249QqT c68249QqT = this.LJIJI.LIZLLL;
            if (c68249QqT != null && (interfaceC83246Wlm2 = (InterfaceC83246Wlm) c68249QqT.LIZ) != null) {
                interfaceC83246Wlm2.LJIIIIZZ("off");
            }
            this.LJIJI.LIZJ(false);
            this.LJIJI.LIZ.s7();
            InterfaceC83144Wk8 interfaceC83144Wk8 = this.LJIJI.LIZJ;
            if (interfaceC83144Wk8 != null) {
                interfaceC83144Wk8.LIZJ(false);
            }
            ComposerBeauty v7 = this.LJIJI.LIZ.v7();
            if (v7 != null) {
                this.LJIJI.LIZLLL(v7, true);
            }
        } else {
            C68249QqT c68249QqT2 = this.LJIJI.LIZLLL;
            if (c68249QqT2 != null && (interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT2.LIZ) != null) {
                interfaceC83246Wlm.LJIIIIZZ("on");
            }
            InterfaceC83144Wk8 interfaceC83144Wk82 = this.LJIJI.LIZJ;
            if (interfaceC83144Wk82 != null) {
                interfaceC83144Wk82.LIZJ(true);
            }
            this.LJIJI.LIZ.I7(false, true);
            if (this.LJIJI.LIZ.LIZ()) {
                XKX.LIZLLL(this.LIZ, EXU.LIZ, null, new C83212WlE(this, null), 2);
            }
        }
        InterfaceC83256Wlw interfaceC83256Wlw = (InterfaceC83256Wlw) this.LJIJI.LJ.LIZJ(InterfaceC83256Wlw.class);
        if (interfaceC83256Wlw != null) {
            interfaceC83256Wlw.LIZIZ();
        }
        LIZLLL(true);
    }

    public final void LJIILL(ComposerBeauty composerBeauty) {
        InterfaceC83197Wkz interfaceC83197Wkz;
        o.LJIIIZ(composerBeauty, "composerBeauty");
        if (this.LJIJ.LIZLLL && (interfaceC83197Wkz = (InterfaceC83197Wkz) this.LJIJI.LJ.LIZJ(InterfaceC83197Wkz.class)) != null && !interfaceC83197Wkz.LIZLLL()) {
            return;
        }
        C83216WlI c83216WlI = this.LJIJI;
        c83216WlI.getClass();
        c83216WlI.LIZ.X7(composerBeauty);
    }

    public C83210WlC(Context context, View view, C83232WlY viewConfig, C83216WlI c83216WlI) {
        C83211WlD c83211WlD;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(viewConfig, "viewConfig");
        this.LJIILLIIL = context;
        this.LJIIZILJ = view;
        this.LJIJ = viewConfig;
        this.LJIJI = c83216WlI;
        this.LIZ = C48841JEv.LIZ(EXU.LIZ.plus(C79146V4k.LJIILIIL()).plus(new IDaS27S0000000_14(CoroutineExceptionHandler.LJJJJIZL, 0)));
        this.LIZIZ = (RelativeLayout) view.findViewById(R.id.j4d);
        C73124Smu rvCategoryContent = (C73124Smu) view.findViewById(R.id.j9n);
        this.LIZJ = rvCategoryContent;
        this.LIZLLL = (LinearLayout) view.findViewById(R.id.j9s);
        this.LJ = (FrameLayout) view.findViewById(R.id.j9r);
        this.LJFF = (RelativeLayout) view.findViewById(R.id.j4b);
        this.LJI = (FrameLayout) view.findViewById(R.id.dd1);
        this.LJII = (TextView) view.findViewById(R.id.m2n);
        C73124Smu rvAlbumContent = (C73124Smu) view.findViewById(R.id.j9l);
        this.LJIIIIZZ = rvAlbumContent;
        this.LJIILIIL = new LinkedHashMap();
        o.LJIIIIZZ(rvCategoryContent, "rvCategoryContent");
        C83222WlO c83222WlO = new C83222WlO(viewConfig, rvCategoryContent);
        c83222WlO.LJLJI = new AqS196S0100000_14(this, 32);
        c83222WlO.LJLJJI = new AqS164S0100000_14(this, 295);
        if (viewConfig.LJI.LJJI) {
            c83211WlD = new C83211WlD(c83222WlO, this);
        } else {
            c83211WlD = null;
        }
        c83222WlO.LJLJJL = c83211WlD;
        c83222WlO.LJLJJLL = viewConfig.LJI.LJJI ? new AqS180S0100000_14(this, 308) : null;
        this.LJIILJJIL = c83222WlO;
        o.LJIIIIZZ(rvAlbumContent, "rvAlbumContent");
        C83222WlO c83222WlO2 = new C83222WlO(viewConfig, rvAlbumContent);
        c83222WlO2.LJLJI = new AqS196S0100000_14(this, 33);
        this.LJIILL = c83222WlO2;
    }

    public static void LJIILIIL(C83210WlC c83210WlC, ComposerBeauty composerBeauty, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4;
        boolean z5;
        C68249QqT c68249QqT;
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
        ComposerBeauty composerBeauty2 = null;
        if ((i & 16) != 0) {
            composerBeauty2 = composerBeauty;
        }
        if (z3 && (c68249QqT = c83210WlC.LJIJI.LIZLLL) != null) {
            InterfaceC83246Wlm interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT.LIZ;
            if (interfaceC83246Wlm != null) {
                interfaceC83246Wlm.LIZLLL((ComposerBeauty) c68249QqT.LIZIZ);
            }
            c68249QqT.LIZIZ = composerBeauty2;
        }
        if (composerBeauty == null) {
            c83210WlC.LJIJI.LIZJ(false);
            return;
        }
        if (z) {
            Iterator<ComposerBeauty> it = c83210WlC.LJIILL.LJLILLLLZI.iterator();
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
            Iterator<ComposerBeauty> it2 = c83210WlC.LJIILJJIL.LJLILLLLZI.iterator();
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
            c83210WlC.LJIJI.LIZJ(false);
            return;
        }
        if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
            c83210WlC.LJIJI.LIZJ(false);
        } else {
            c83210WlC.LJIJI.LIZJ(true);
        }
        if (C1DH.LJIJ(composerBeauty)) {
            c83210WlC.LJIIJ = composerBeauty;
        } else {
            c83210WlC.LJIIIZ = composerBeauty;
        }
        if (C1DH.LJJII(composerBeauty)) {
            java.util.Map<BeautyCategory, List<ComposerBeauty>> map = c83210WlC.LJIILIIL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (o.LJ(((BeautyCategory) entry.getKey()).getCategoryResponse().getId(), composerBeauty.getCategoryId())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List list = (List) ORZ.LJLLL(linkedHashMap.values());
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!((ComposerBeauty) obj).getExtra().isNone()) {
                        arrayList.add(obj);
                    }
                }
                C83216WlI c83216WlI = c83210WlC.LJIJI;
                c83216WlI.getClass();
                InterfaceC83256Wlw interfaceC83256Wlw = (InterfaceC83256Wlw) c83216WlI.LJ.LIZJ(InterfaceC83256Wlw.class);
                if (interfaceC83256Wlw != null) {
                    interfaceC83256Wlw.LIZLLL(arrayList);
                }
            }
        } else {
            c83210WlC.LJIJI.LIZLLL(composerBeauty, z2);
        }
        InterfaceC83256Wlw interfaceC83256Wlw2 = (InterfaceC83256Wlw) c83210WlC.LJIJI.LJ.LIZJ(InterfaceC83256Wlw.class);
        if (interfaceC83256Wlw2 == null) {
            return;
        }
        interfaceC83256Wlw2.LIZIZ();
    }
}
