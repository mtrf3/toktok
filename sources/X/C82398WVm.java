package X;

import Y.ARunnableS25S0300000_14;
import Y.ARunnableS33S0200000_14;
import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS1S0410000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WVm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82398WVm {
    public static final void LIZ(I0N cancelStickerViewSelected) {
        o.LJIIIZ(cancelStickerViewSelected, "$this$cancelStickerViewSelected");
        cancelStickerViewSelected.LLZL().LIZJ(J8V.LJFF());
    }

    public static final Effect LIZJ(InterfaceC82400WVo currentEffect) {
        o.LJIIIZ(currentEffect, "$this$currentEffect");
        return currentEffect.LLLLL().LLJJIJIIJIL();
    }

    public static final boolean LIZLLL(InterfaceC82400WVo isStickerViewShowing) {
        o.LJIIIZ(isStickerViewShowing, "$this$isStickerViewShowing");
        IDH LLLF = isStickerViewShowing.LLLF();
        if (LLLF != null && LLLF.isShowing()) {
            return true;
        }
        return false;
    }

    public static final void LJFF(InterfaceC82400WVo setCollectEffects, List<? extends Effect> list) {
        o.LJIIIZ(setCollectEffects, "$this$setCollectEffects");
        if (list != null) {
            setCollectEffects.LLLLL().LJJJJLL().LIZ().LJII(list);
        }
    }

    public static final void LJI(InterfaceC82400WVo currentEffect, Effect effect) {
        o.LJIIIZ(currentEffect, "$this$currentEffect");
        currentEffect.LLLZI().post(new ARunnableS33S0200000_14(effect, currentEffect, 78));
    }

    public static final void LJIIIIZZ(InterfaceC82400WVo submitEffectRequest, InterfaceC46243ICx<?> request) {
        o.LJIIIZ(submitEffectRequest, "$this$submitEffectRequest");
        o.LJIIIZ(request, "request");
        submitEffectRequest.LLZL().LIZJ(request);
    }

    public static final void LJII(I0N i0n, Effect effect, EnumC44267HYx enumC44267HYx) {
        i0n.LLLZI().post(new ARunnableS25S0300000_14(enumC44267HYx, i0n, effect, 21));
    }

    public static final void LIZIZ(InterfaceC82400WVo fetchEffectList2, List<String> effectIds, java.util.Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        o.LJIIIZ(fetchEffectList2, "$this$fetchEffectList2");
        o.LJIIIZ(effectIds, "effectIds");
        fetchEffectList2.LLLLL().LIZ(effectIds, map, iFetchEffectListByIdsListener);
    }

    public static void LJ(InterfaceC82400WVo pinStickers, List effects, boolean z, boolean z2, InterfaceC74398THu interfaceC74398THu, boolean z3, Bundle bundle, int i, int i2) {
        int i3;
        Effect effect;
        boolean z4;
        int i4;
        int i5;
        int i6;
        T42 I9;
        Bundle bundle2 = bundle;
        InterfaceC74398THu interfaceC74398THu2 = interfaceC74398THu;
        int i7 = i;
        if ((i2 & 16) != 0) {
            interfaceC74398THu2 = null;
        }
        if ((i2 & 32) != 0) {
            TEZ getPinIndex = pinStickers.LLLLL();
            o.LJIIIZ(getPinIndex, "$this$getPinIndex");
            i3 = C78866UxK.LJJIJ(getPinIndex);
        } else {
            i3 = 0;
        }
        if ((i2 & 128) != 0) {
            effect = (Effect) ORZ.LJLLLL(effects);
        } else {
            effect = null;
        }
        if ((i2 & 256) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i2 & 512) != 0) {
            z3 = false;
        }
        if ((i2 & 1024) != 0) {
            bundle2 = null;
        }
        if ((i2 & 2048) != 0) {
            i7 = 0;
        }
        o.LJIIIZ(pinStickers, "$this$pinStickers");
        o.LJIIIZ(effects, "effects");
        C82399WVn c82399WVn = new C82399WVn(pinStickers, null, effects, effect, z, null, interfaceC74398THu2);
        AqS1S0410000_14 aqS1S0410000_14 = new AqS1S0410000_14(pinStickers, null, effects, z, null, interfaceC74398THu2, 0);
        if (effects.isEmpty()) {
            return;
        }
        if (z) {
            pinStickers.LLLLL().LJJJ(new C74389THl(effects, i3, i7, 24));
        }
        if (!z2 || effect == null) {
            return;
        }
        IDH LLLF = pinStickers.LLLF();
        if (LLLF != null && (I9 = LLLF.I9()) != null) {
            I9.LIZ(new TD6(i3, effect));
        }
        IDH LLLF2 = pinStickers.LLLF();
        if (LLLF2 != null) {
            LLLF2.prepare();
        }
        pinStickers.LLLLL().LJJIIZ(i3);
        if (ID0.LJIIZILJ(effect)) {
            if (z3) {
                LIZIZ(pinStickers, C47261Igj.LJJIJ(effect.getEffectId()), null, new C82401WVp(c82399WVn, null));
                return;
            }
            InterfaceC46204IBk LLZL = pinStickers.LLZL();
            if (z) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            LLZL.LIZJ(J8V.LJI(effect, i6, EnumC44267HYx.MANUAL_SET, null, null, interfaceC74398THu2, null, 0, false, null, 484));
            return;
        }
        String parentId = effect.getParentId();
        if (parentId != null && parentId.length() != 0) {
            IDH LLLF3 = pinStickers.LLLF();
            if (LLLF3 != null) {
                LLLF3.prepare();
            }
            pinStickers.LLLLL().LJIIZILJ(effect);
        }
        if (!V3N.LJIILLIIL(effect)) {
            String parentId2 = effect.getParentId();
            if (parentId2 == null || parentId2.length() == 0) {
                InterfaceC46204IBk LLZL2 = pinStickers.LLZL();
                if (z) {
                    i5 = 1;
                } else {
                    i5 = -1;
                }
                LLZL2.LIZJ(J8V.LJI(effect, i5, EnumC44267HYx.MANUAL_SET, null, null, interfaceC74398THu2, null, 0, false, null, 484));
                return;
            }
            String parentId3 = effect.getParentId();
            o.LJI(parentId3);
            LIZIZ(pinStickers, C47261Igj.LJJIJ(parentId3), null, new C82402WVq(aqS1S0410000_14, null));
            return;
        }
        V3N.LJIILLIIL(effect);
        Bundle bundle3 = new Bundle();
        if (bundle2 != null) {
            bundle3.putAll(bundle2);
        }
        InterfaceC46204IBk LLZL3 = pinStickers.LLZL();
        if (z) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        LLZL3.LIZJ(J8V.LJI(effect, i4, EnumC44267HYx.MANUAL_SET, null, bundle3, interfaceC74398THu2, null, 0, z4, null, 356));
    }
}
