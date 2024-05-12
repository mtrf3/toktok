package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wl6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83204Wl6 implements InterfaceC83256Wlw {
    public final RelativeLayout LIZ;
    public final C8HN LIZIZ;
    public final ImageView LIZJ;
    public final Context LIZLLL;
    public final View LJ;
    public final C83232WlY LJFF;
    public final C83203Wl5 LJI;

    @Override // X.InterfaceC83256Wlw
    public final void LIZIZ() {
        if (this.LJI.LIZIZ() || !this.LJI.LIZ.LIZ()) {
            RelativeLayout rlClearContainer = this.LIZ;
            o.LJIIIIZZ(rlClearContainer, "rlClearContainer");
            rlClearContainer.setAlpha(0.5f);
            o.LJIIIIZZ(this.LIZ, "rlClearContainer");
            return;
        }
        RelativeLayout rlClearContainer2 = this.LIZ;
        o.LJIIIIZZ(rlClearContainer2, "rlClearContainer");
        rlClearContainer2.setAlpha(1.0f);
        RelativeLayout rlClearContainer3 = this.LIZ;
        o.LJIIIIZZ(rlClearContainer3, "rlClearContainer");
        rlClearContainer3.setContentDescription(this.LIZLLL.getString(R.string.byg));
    }

    public final void LJ() {
        C83222WlO c83222WlO;
        Boolean bool;
        C83222WlO c83222WlO2;
        ComposerBeauty composerBeauty;
        C83222WlO c83222WlO3;
        C83222WlO c83222WlO4;
        ComposerBeauty composerBeauty2;
        C83222WlO c83222WlO5;
        ComposerBeauty composerBeauty3;
        ComposerBeauty composerBeauty4;
        ComposerBeauty composerBeauty5;
        ComposerBeauty composerBeauty6;
        ComposerBeauty composerBeauty7;
        C83203Wl5 c83203Wl5 = this.LJI;
        c83203Wl5.getClass();
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(c83203Wl5, 307);
        Iterator<BeautyCategory> it = c83203Wl5.LIZ.M7().iterator();
        while (it.hasNext()) {
            for (ComposerBeauty composerBeauty8 : it.next().getBeautyList()) {
                AqS161S0200000_14 aqS161S0200000_14 = new AqS161S0200000_14(composerBeauty8, aqS180S0100000_14, 36);
                if (composerBeauty8.isBeautyMode()) {
                    List<ComposerBeauty> childList = composerBeauty8.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it2 = childList.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                            aqS161S0200000_14.LIZ$4();
                        }
                    }
                } else {
                    aqS161S0200000_14.LIZ$4();
                }
            }
        }
        C83203Wl5 c83203Wl52 = this.LJI;
        c83203Wl52.getClass();
        C81017Vqv c81017Vqv = new C81017Vqv();
        Iterator<BeautyComposerInfo> it3 = c83203Wl52.LIZ.z7().iterator();
        while (it3.hasNext()) {
            c81017Vqv.add(it3.next());
        }
        Iterator<T> it4 = c81017Vqv.iterator();
        while (true) {
            c83222WlO = null;
            composerBeauty3 = null;
            if (!it4.hasNext()) {
                break;
            }
            String str = ((BeautyComposerInfo) it4.next()).effectId;
            for (BeautyCategory hasBeautyModes : c83203Wl52.LIZ.M7()) {
                o.LJIIIZ(hasBeautyModes, "$this$hasBeautyModes");
                ComposerBeauty composerBeauty9 = (ComposerBeauty) ORZ.LJLLLL(hasBeautyModes.getBeautyList());
                if (composerBeauty9 != null && composerBeauty9.isBeautyMode()) {
                    Iterator<ComposerBeauty> it5 = hasBeautyModes.getBeautyList().iterator();
                    while (it5.hasNext()) {
                        List<ComposerBeauty> childList2 = it5.next().getChildList();
                        if (childList2 != null) {
                            Iterator<ComposerBeauty> it6 = childList2.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    composerBeauty7 = it6.next();
                                    if (o.LJ(composerBeauty7.getEffect().getEffectId(), str)) {
                                        break;
                                    }
                                } else {
                                    composerBeauty7 = null;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty10 = composerBeauty7;
                            if (composerBeauty10 != null) {
                                c83203Wl52.LJ(composerBeauty10, null);
                            }
                        }
                    }
                } else {
                    Iterator<ComposerBeauty> it7 = hasBeautyModes.getBeautyList().iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            composerBeauty6 = it7.next();
                            if (o.LJ(composerBeauty6.getEffect().getEffectId(), str)) {
                                break;
                            }
                        } else {
                            composerBeauty6 = null;
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty11 = composerBeauty6;
                    if (composerBeauty11 != null) {
                        c83203Wl52.LJ(composerBeauty11, null);
                    }
                }
            }
        }
        List<BeautyCategory> M7 = c83203Wl52.LIZ.M7();
        ArrayList arrayList = new ArrayList();
        for (BeautyCategory beautyCategory : M7) {
            if (beautyCategory.getBeautyCategoryExtra().getExclusive()) {
                arrayList.add(beautyCategory);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            BeautyCategory beautyCategory2 = (BeautyCategory) it8.next();
            Iterator<ComposerBeauty> it9 = beautyCategory2.getBeautyList().iterator();
            while (true) {
                if (it9.hasNext()) {
                    composerBeauty5 = it9.next();
                    ComposerBeauty composerBeauty12 = composerBeauty5;
                    if (composerBeauty12.getExtra().getDefault() && composerBeauty12.getEnable()) {
                        break;
                    }
                } else {
                    composerBeauty5 = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty13 = composerBeauty5;
            if (composerBeauty13 != null) {
                C83203Wl5.LIZJ(c83203Wl52, composerBeauty13, beautyCategory2.getBeautyList());
                c83203Wl52.LIZ.N7(composerBeauty13, new C83257Wlx(c83203Wl52));
            } else {
                List<ComposerBeauty> beautyList = beautyCategory2.getBeautyList();
                if (beautyList != null && !beautyList.isEmpty()) {
                    C83203Wl5.LIZJ(c83203Wl52, (ComposerBeauty) ListProtector.get(beautyList, 0), beautyCategory2.getBeautyList());
                    ComposerBeauty composerBeauty14 = (ComposerBeauty) ListProtector.get(beautyList, 0);
                    o.LJIIIZ(composerBeauty14, "composerBeauty");
                    c83203Wl52.LIZ.N7(composerBeauty14, new C83257Wlx(c83203Wl52));
                }
            }
        }
        AqS180S0100000_14 aqS180S0100000_142 = new AqS180S0100000_14(c83203Wl52, 302);
        for (BeautyCategory beautyCategory3 : c83203Wl52.LIZ.M7()) {
            c83203Wl52.LIZ.h8(beautyCategory3);
            List<ComposerBeauty> beautyList2 = beautyCategory3.getBeautyList();
            ArrayList arrayList2 = new ArrayList();
            for (ComposerBeauty composerBeauty15 : beautyList2) {
                if (composerBeauty15.isCollectionType()) {
                    arrayList2.add(composerBeauty15);
                }
            }
            Iterator it10 = arrayList2.iterator();
            while (it10.hasNext()) {
                aqS180S0100000_142.LIZ$26((ComposerBeauty) it10.next());
            }
        }
        C83203Wl5 c83203Wl53 = this.LJI;
        InterfaceC83247Wln interfaceC83247Wln = (InterfaceC83247Wln) c83203Wl53.LJ.LIZJ(InterfaceC83247Wln.class);
        AqS180S0100000_14 aqS180S0100000_143 = new AqS180S0100000_14(c83203Wl53, 303);
        if (interfaceC83247Wln != null) {
            bool = Boolean.valueOf(interfaceC83247Wln.LJI());
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            if (interfaceC83247Wln != null) {
                c83222WlO5 = interfaceC83247Wln.LJIIIIZZ();
            } else {
                c83222WlO5 = null;
            }
            Iterator<ComposerBeauty> it11 = c83222WlO5.LJLILLLLZI.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    break;
                }
                ComposerBeauty next = it11.next();
                if (interfaceC83247Wln != null) {
                    composerBeauty4 = interfaceC83247Wln.LJIIJ();
                } else {
                    composerBeauty4 = null;
                }
                if (o.LJ(next, composerBeauty4)) {
                    composerBeauty3 = next;
                    break;
                }
            }
            ComposerBeauty composerBeauty16 = composerBeauty3;
            if (composerBeauty16 != null) {
                aqS180S0100000_143.LIZ$27(composerBeauty16);
            }
        } else if (o.LJ(bool, Boolean.FALSE)) {
            if (interfaceC83247Wln != null) {
                c83222WlO2 = interfaceC83247Wln.LIZJ();
            } else {
                c83222WlO2 = null;
            }
            Iterator<ComposerBeauty> it12 = c83222WlO2.LJLILLLLZI.iterator();
            while (true) {
                if (it12.hasNext()) {
                    composerBeauty = it12.next();
                    if (interfaceC83247Wln != null) {
                        composerBeauty2 = interfaceC83247Wln.LJ();
                    } else {
                        composerBeauty2 = null;
                    }
                    if (o.LJ(composerBeauty, composerBeauty2)) {
                        break;
                    }
                } else {
                    composerBeauty = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty17 = composerBeauty;
            if (composerBeauty17 != null) {
                aqS180S0100000_143.LIZ$27(composerBeauty17);
                if (interfaceC83247Wln != null) {
                    c83222WlO3 = interfaceC83247Wln.LIZJ();
                } else {
                    c83222WlO3 = null;
                }
                int indexOf = c83222WlO3.LJLILLLLZI.indexOf(composerBeauty17);
                if (indexOf >= 0) {
                    if (interfaceC83247Wln != null) {
                        c83222WlO4 = interfaceC83247Wln.LIZJ();
                    } else {
                        c83222WlO4 = null;
                    }
                    if (indexOf < c83222WlO4.LJLILLLLZI.size()) {
                        if (interfaceC83247Wln != null) {
                            c83222WlO = interfaceC83247Wln.LIZJ();
                        }
                        c83222WlO.LJLLLLLL(composerBeauty17);
                    }
                }
            }
        }
        C83203Wl5 c83203Wl54 = this.LJI;
        c83203Wl54.LIZ.j8();
        c83203Wl54.LIZ.LIZJ(true);
        InterfaceC83247Wln interfaceC83247Wln2 = (InterfaceC83247Wln) c83203Wl54.LJ.LIZJ(InterfaceC83247Wln.class);
        if (interfaceC83247Wln2 != null) {
            interfaceC83247Wln2.LIZLLL(false);
        }
        LIZIZ();
        InterfaceC83197Wkz interfaceC83197Wkz = (InterfaceC83197Wkz) this.LJI.LJ.LIZJ(InterfaceC83197Wkz.class);
        if (interfaceC83197Wkz != null) {
            interfaceC83197Wkz.LIZJ();
        }
    }

    @Override // X.InterfaceC83256Wlw
    public final void LIZ(java.util.Map<ComposerBeauty, Float> map) {
        C83203Wl5 c83203Wl5 = this.LJI;
        c83203Wl5.getClass();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            C83104WjU.LJLIL.LIZ((ComposerBeauty) entry.getKey(), new AqS145S0200000_14(entry, c83203Wl5, 24));
        }
    }

    @Override // X.InterfaceC83256Wlw
    public final void LIZJ(boolean z) {
        C83203Wl5 c83203Wl5 = this.LJI;
        c83203Wl5.LIZ.I7(z, true);
        InterfaceC83247Wln interfaceC83247Wln = (InterfaceC83247Wln) c83203Wl5.LJ.LIZJ(InterfaceC83247Wln.class);
        if (interfaceC83247Wln != null) {
            interfaceC83247Wln.LIZLLL(false);
        }
    }

    @Override // X.InterfaceC83256Wlw
    public final void LIZLLL(List<ComposerBeauty> list) {
        C83203Wl5 c83203Wl5 = this.LJI;
        c83203Wl5.getClass();
        Iterator<ComposerBeauty> it = list.iterator();
        while (it.hasNext()) {
            C83103WjT.LJLIL.LIZ(it.next(), new AqS180S0100000_14(c83203Wl5, 304));
        }
        Iterator<ComposerBeauty> it2 = list.iterator();
        while (it2.hasNext()) {
            C83103WjT.LJLIL.LIZ(it2.next(), new AqS180S0100000_14(c83203Wl5, 305));
        }
        Iterator<ComposerBeauty> it3 = list.iterator();
        while (it3.hasNext()) {
            C83103WjT.LJLIL.LIZ(it3.next(), new AqS180S0100000_14(c83203Wl5, 306));
        }
    }

    public C83204Wl6(Context context, View view, C83232WlY viewConfig, C83203Wl5 c83203Wl5) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(viewConfig, "viewConfig");
        this.LIZLLL = context;
        this.LJ = view;
        this.LJFF = viewConfig;
        this.LJI = c83203Wl5;
        this.LIZ = (RelativeLayout) view.findViewById(R.id.j4e);
        this.LIZIZ = (C8HN) view.findViewById(R.id.m2p);
        this.LIZJ = (ImageView) view.findViewById(R.id.f0u);
    }
}
