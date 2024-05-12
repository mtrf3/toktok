package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyFragment;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.smallitem.LiveSmallSubItemBeautyFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyPanelMemoryOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0xN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24290xN {
    public final LiveSmallItemBeautyViewModel LIZ;
    public final DataChannel LIZIZ;
    public Fragment LIZJ;
    public final C43961o0 LIZLLL;
    public final C35701ag LJ;
    public final ViewGroup LJFF;
    public final C76923UGx LJI;
    public final ImageView LJII;
    public final TextView LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final InterfaceC31981Ni LJIIJJI;
    public final Integer LJIIL;
    public LiveEffect LJIILIIL;
    public LiveSmallSubItemBeautyFragment LJIILJJIL;
    public C260810q LJIILL;
    public String LJIILLIIL;
    public final java.util.Map<String, LiveEffect> LJIIZILJ;
    public final List<String> LJIJ;
    public final List<C1QC> LJIJI;

    public final LiveEffect LIZ() {
        C1QC c1qc;
        List<Object> list;
        Iterator<C1QC> it = this.LJIJI.iterator();
        while (true) {
            if (it.hasNext()) {
                c1qc = it.next();
                if (o.LJ(c1qc.LJLIL, this.LJIILLIIL)) {
                    break;
                }
            } else {
                c1qc = null;
                break;
            }
        }
        C1QC c1qc2 = c1qc;
        if (c1qc2 == null || (list = c1qc2.LJLILLLLZI) == null) {
            return null;
        }
        return (LiveEffect) ORZ.LJLLLLLL(C78880UxY.LJJIJ(list), list);
    }

    public final void LIZJ() {
        LifecycleCoroutineScope lifecycleScope;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.lv0(this.LIZJ, OnLiveEffectSelectedEvent.class, new IDqS416S0100000(this, 304));
        }
        Fragment fragment = this.LIZJ;
        if (fragment != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new C2GJ(this, null), 3);
        }
    }

    public final void LJFF() {
        LiveEffect liveEffect = this.LJIILIIL;
        if (liveEffect != null) {
            if (liveEffect.isNone()) {
                C29306Beo.LJI(this.LJI);
            } else {
                C29306Beo.LJJLJLI(this.LJI);
                LJIIJ(liveEffect, true);
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C29306Beo.LJI(this.LJI);
    }

    public final void LJI() {
        Object obj;
        Fragment fragment;
        C37281dE c37281dE;
        LiveSmallItemBeautyFragment liveSmallItemBeautyFragment;
        int i;
        int i2;
        List<LiveEffect> LJIIIIZZ = this.LJIIJJI.LJIIIIZZ(this.LJIIIZ);
        ArrayList arrayList = new ArrayList();
        for (LiveEffect liveEffect : LJIIIIZZ) {
            LiveEffect liveEffect2 = liveEffect;
            if (o.LJ(liveEffect2.effectPanelName, this.LJIILLIIL) && !C78880UxY.LJJL(liveEffect2)) {
                arrayList.add(liveEffect);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            LiveEffect liveEffect3 = (LiveEffect) it.next();
            InterfaceC31981Ni interfaceC31981Ni = this.LJIIJJI;
            String str = this.LJIIIZ;
            LiveEffect.ComposerConfig smallItemConfig = liveEffect3.getSmallItemConfig();
            if (smallItemConfig != null) {
                i = smallItemConfig.LIZIZ;
            } else {
                i = 0;
            }
            interfaceC31981Ni.LJIIJJI(i, liveEffect3, str);
            if (liveEffect3.isExclusive) {
                this.LJIIJJI.LJIILL(liveEffect3, this.LJIIIZ);
            }
            String resourceId = liveEffect3.getResourceId();
            LiveEffect liveEffect4 = this.LJIILIIL;
            if (liveEffect4 != null) {
                obj = liveEffect4.getResourceId();
            }
            if (o.LJ(resourceId, obj)) {
                C76923UGx c76923UGx = this.LJI;
                LiveEffect.ComposerConfig smallItemConfig2 = liveEffect3.getSmallItemConfig();
                if (smallItemConfig2 != null) {
                    i2 = smallItemConfig2.LIZIZ;
                } else {
                    i2 = 0;
                }
                c76923UGx.setPercent(i2);
            }
        }
        LJII(true);
        C43961o0 c43961o0 = this.LIZLLL;
        if (c43961o0 != null) {
            fragment = c43961o0.LJLL;
        } else {
            fragment = null;
        }
        if ((fragment instanceof LiveSmallItemBeautyFragment) && (liveSmallItemBeautyFragment = (LiveSmallItemBeautyFragment) fragment) != null) {
            liveSmallItemBeautyFragment.LJLILLLLZI.reset();
        }
        C35701ag c35701ag = this.LJ;
        if (c35701ag != null) {
            obj = c35701ag.LJLLILLLL;
        }
        if ((obj instanceof C37281dE) && (c37281dE = (C37281dE) obj) != null) {
            c37281dE.LJI.reset();
        }
        if (!((LinkedHashMap) this.LJIIZILJ).values().contains(this.LJIILIIL)) {
            this.LJIILIIL = (LiveEffect) ((LinkedHashMap) this.LJIIZILJ).get(this.LJIILLIIL);
        }
    }

    public final float LIZIZ(LiveEffect liveEffect) {
        String str;
        Integer num;
        InterfaceC31981Ni interfaceC31981Ni = this.LJIIJJI;
        String resourceId = liveEffect.getResourceId();
        LiveEffect.ComposerConfig smallItemConfig = liveEffect.getSmallItemConfig();
        if (smallItemConfig == null || (str = smallItemConfig.tag) == null) {
            str = "";
        }
        Float LJFF = interfaceC31981Ni.LJFF(resourceId, str);
        if (LJFF == null) {
            LiveEffect.ComposerConfig smallItemConfig2 = liveEffect.getSmallItemConfig();
            if (smallItemConfig2 != null) {
                num = Integer.valueOf(smallItemConfig2.LIZIZ);
            } else {
                num = null;
            }
            o.LJI(num);
            LJFF = Float.valueOf(C12920f2.LIZLLL(liveEffect, num.intValue()));
        }
        return LJFF.floatValue();
    }

    public final void LIZLLL(String str) {
        Boolean bool;
        this.LJIILLIIL = str;
        LiveEffect liveEffect = (LiveEffect) ((LinkedHashMap) this.LJIIZILJ).get(str);
        if (liveEffect == null) {
            liveEffect = LIZ();
        }
        LJIIIIZZ(liveEffect);
        LJIIJ(this.LJIILIIL, false);
        LiveEffect liveEffect2 = this.LJIILIIL;
        if (liveEffect2 != null) {
            bool = Boolean.valueOf(liveEffect2.isSubItem());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C29306Beo.LJI(this.LJI);
        }
    }

    public final void LJ(int i) {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLZLLLL;
        if (C29306Beo.LJIILLIIL(c48459J0d.LIZJ())) {
            c48459J0d.LIZ(Boolean.TRUE);
        }
        LJIIIZ(this.LJIILIIL, i);
        LiveEffect liveEffect = this.LJIILIIL;
        if (liveEffect != null) {
            this.LJIIJJI.LJIIJJI(i, liveEffect, this.LJIIIZ);
        }
    }

    public final void LJII(boolean z) {
        String str;
        Fragment fragment;
        LiveSmallItemBeautyFragment liveSmallItemBeautyFragment;
        LiveEffect liveEffect;
        Object obj;
        LiveEffect liveEffect2;
        LiveEffect liveEffect3 = this.LJIILIIL;
        if (liveEffect3 != null && (str = liveEffect3.effectPanelKey) != null && ujb.o.LJJJLIIL(str, "beauty", false)) {
            C43961o0 c43961o0 = this.LIZLLL;
            C37281dE c37281dE = null;
            if (c43961o0 != null) {
                fragment = c43961o0.LJLL;
            } else {
                fragment = null;
            }
            if (fragment instanceof LiveSmallItemBeautyFragment) {
                liveSmallItemBeautyFragment = (LiveSmallItemBeautyFragment) fragment;
            } else {
                liveSmallItemBeautyFragment = null;
            }
            if (z) {
                if (liveSmallItemBeautyFragment != null) {
                    liveSmallItemBeautyFragment.LJLILLLLZI.notifyDataSetChanged();
                }
            } else if (liveSmallItemBeautyFragment != null && (liveEffect = this.LJIILIIL) != null) {
                liveSmallItemBeautyFragment.LJLILLLLZI.LLILLIZIL(liveEffect);
            }
            C35701ag c35701ag = this.LJ;
            if (c35701ag != null) {
                obj = c35701ag.LJLLILLLL;
            } else {
                obj = null;
            }
            if (obj instanceof C37281dE) {
                c37281dE = (C37281dE) obj;
            }
            if (z) {
                if (c37281dE != null) {
                    c37281dE.LJI.notifyDataSetChanged();
                }
            } else {
                if (c37281dE == null || (liveEffect2 = this.LJIILIIL) == null) {
                    return;
                }
                c37281dE.LJI.LLILLIZIL(liveEffect2);
            }
        }
    }

    public final void LJIIIIZZ(LiveEffect liveEffect) {
        LiveEffect liveEffect2;
        Boolean bool;
        if (liveEffect == null || (liveEffect2 = C78880UxY.LJJJIL(liveEffect, this.LJIIJJI, this.LJIIIZ)) == null) {
            liveEffect2 = liveEffect;
        }
        this.LJIILIIL = liveEffect2;
        InterfaceC30442Bx8.LJJIIJZLJL.LIZ(Boolean.valueOf(C78880UxY.LJJL(liveEffect2)));
        if (liveEffect != null) {
            bool = Boolean.valueOf(liveEffect.isSubItem());
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool)) {
            this.LJIIZILJ.put(this.LJIILLIIL, liveEffect);
        }
    }

    public final void LJIIIZ(LiveEffect liveEffect, int i) {
        if (liveEffect == null || !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            return;
        }
        String str = "";
        for (LiveEffect.ComposerConfig composerConfig : liveEffect.composerConfigList) {
            StringBuilder LIZJ = b1.LIZJ(str, "name: ");
            LIZJ.append(composerConfig.tag);
            LIZJ.append("\nlokiMax: ");
            LIZJ.append(composerConfig.maxValue);
            LIZJ.append("\nlokiMin: ");
            LIZJ.append(composerConfig.minValue);
            LIZJ.append("\nlokiDefault: ");
            LIZJ.append(composerConfig.defaultValue);
            LIZJ.append("\nuiMax:");
            LIZJ.append(composerConfig.LIZJ);
            LIZJ.append("\nuiMin: ");
            LIZJ.append(composerConfig.LIZLLL);
            LIZJ.append("\nuiDefault: ");
            C15890jp.LIZIZ(LIZJ, composerConfig.LIZIZ, "\ncurrentUIValue: ", i, "\ncurrentEffectValue: ");
            LIZJ.append(C12920f2.LIZJ(composerConfig, i));
            LIZJ.append('\n');
            str = X1D.LIZIZ(LIZJ);
        }
        this.LJIIIIZZ.setText(str);
    }

    public final void LJIIJ(LiveEffect liveEffect, boolean z) {
        int i;
        int i2;
        if (liveEffect == null || liveEffect.getSmallItemConfig() == null) {
            C29306Beo.LJI(this.LJI);
            if (!C78880UxY.LJJL(liveEffect)) {
                return;
            }
        }
        if (!C78880UxY.LJJL(liveEffect) && liveEffect != null) {
            C29306Beo.LJJLJLI(this.LJI);
            this.LJI.setPercent(C12920f2.LIZIZ(liveEffect, LIZIZ(liveEffect)));
            LiveEffect.ComposerConfig smallItemConfig = liveEffect.getSmallItemConfig();
            if (smallItemConfig != null && smallItemConfig.doubleDirection) {
                C76923UGx c76923UGx = this.LJI;
                LiveEffect.ComposerConfig smallItemConfig2 = liveEffect.getSmallItemConfig();
                if (smallItemConfig2 != null) {
                    i2 = smallItemConfig2.LIZIZ;
                } else {
                    i2 = 0;
                }
                c76923UGx.LIZJ(50, -50, i2, false);
            } else {
                C76923UGx c76923UGx2 = this.LJI;
                LiveEffect.ComposerConfig smallItemConfig3 = liveEffect.getSmallItemConfig();
                if (smallItemConfig3 != null) {
                    i = smallItemConfig3.LIZIZ;
                } else {
                    i = 0;
                }
                c76923UGx2.LIZJ(100, 0, i, true);
            }
            LJIIIZ(liveEffect, C12920f2.LIZIZ(liveEffect, LIZIZ(liveEffect)));
        }
        if (z) {
            this.LJIIJJI.LIZIZ(liveEffect, this.LJIIIZ);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C24290xN(com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel r15, com.bytedance.ies.sdk.datachannel.DataChannel r16, androidx.fragment.app.Fragment r17, X.C43961o0 r18, X.C35701ag r19, android.view.ViewGroup r20, X.C76923UGx r21, android.widget.ImageView r22, X.C47121t6 r23) {
        /*
            r14 = this;
            java.lang.String r10 = X.C0TY.LIZLLL
            java.lang.String r0 = "SMALL_ITEM_BEAUTY_PANEL"
            kotlin.jvm.internal.o.LJIIIIZZ(r10, r0)
            r11 = 2131377011(0x7f0a3b73, float:1.8374214E38)
            X.1lw r12 = X.C12890ez.LIZ()
            r13 = 0
            r5 = r19
            r4 = r18
            r3 = r17
            r2 = r16
            r8 = r22
            r1 = r15
            r9 = r23
            r7 = r21
            r0 = r14
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24290xN.<init>(com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel, com.bytedance.ies.sdk.datachannel.DataChannel, androidx.fragment.app.Fragment, X.1o0, X.1ag, android.view.ViewGroup, X.UGx, android.widget.ImageView, X.1t6):void");
    }

    public C24290xN(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, DataChannel dataChannel, Fragment fragment, C43961o0 c43961o0, C35701ag c35701ag, ViewGroup viewGroup, C76923UGx c76923UGx, ImageView imageView, TextView textView, String effectPanelName, int i, InterfaceC31981Ni composerManager, Integer num) {
        o.LJIIIZ(effectPanelName, "effectPanelName");
        o.LJIIIZ(composerManager, "composerManager");
        this.LIZ = liveSmallItemBeautyViewModel;
        this.LIZIZ = dataChannel;
        this.LIZJ = fragment;
        this.LIZLLL = c43961o0;
        this.LJ = c35701ag;
        this.LJFF = viewGroup;
        this.LJI = c76923UGx;
        this.LJII = imageView;
        this.LJIIIIZZ = textView;
        this.LJIIIZ = effectPanelName;
        this.LJIIJ = i;
        this.LJIIJJI = composerManager;
        this.LJIIL = num;
        this.LJIIZILJ = new LinkedHashMap();
        this.LJIJ = new ArrayList();
        this.LJIJI = new ArrayList();
        if (!BeautyPanelMemoryOptSetting.INSTANCE.enable() || !o.LJ(effectPanelName, C0TY.LIZLLL)) {
            LIZJ();
        }
    }
}
