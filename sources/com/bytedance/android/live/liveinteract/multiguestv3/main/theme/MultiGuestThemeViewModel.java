package com.bytedance.android.live.liveinteract.multiguestv3.main.theme;

import X.C56412MCa;
import X.C74987Tbr;
import X.C75231Tfn;
import X.C75247Tg3;
import X.C75248Tg4;
import X.C78886Uxe;
import X.C81185Vtd;
import X.C8E;
import X.EnumC75250Tg6;
import X.InterfaceC55235Lm3;
import X.InterfaceC75579TlP;
import X.InterfaceC88472Yns;
import X.TBV;
import X.TV3;
import X.U8H;
import X.UC0;
import X.X1D;
import android.graphics.Rect;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.VideoBelowBackgroundUpdateEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS16S1400000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestThemeViewModel extends AssemViewModel<C75247Tg3> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C75247Tg3 defaultState() {
        return new C75247Tg3(null, null, null, 0, null);
    }

    public final void gv0(InterfaceC55235Lm3 interfaceC55235Lm3) {
        C74987Tbr.LIZ("multi_guest_theme", "onCreate");
        iv0(this, new TBV() { // from class: X.Tg2
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C75247Tg3) obj).LJLJI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C75247Tg3) obj).LJLJI = (String) obj2;
            }
        }, null, C75231Tfn.LJLIL, 6);
        iv0(this, new TBV() { // from class: X.Tg5
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C75247Tg3) obj).LJLJJI);
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C75247Tg3) obj).LJLJJI = ((Number) obj2).intValue();
            }
        }, null, C75248Tg4.LJLIL, 6);
    }

    public final void hv0(InterfaceC55235Lm3 interfaceC55235Lm3) {
        InterfaceC75579TlP LJJJIL;
        C74987Tbr.LIZ("multi_guest_theme", "onDestroy");
        if (TV3.LIZJ() && ((LJJJIL = C78886Uxe.LJJJIL(C8E.LJ())) == null || !((U8H) LJJJIL).LJJIL())) {
            DataChannelGlobal.LJLJJI.sv0(VideoBelowBackgroundUpdateEvent.class, "");
        }
        onCleared();
    }

    public final void jv0(String str, boolean z) {
        Integer num;
        EnumC75250Tg6 enumC75250Tg6;
        Rect rect;
        String str2 = str;
        Integer num2 = null;
        if (z) {
            num2 = Integer.valueOf(ColorProtector.parseColor("#33FFFFFF"));
            num = Integer.valueOf(R.drawable.d4d);
            enumC75250Tg6 = EnumC75250Tg6.DIVIDER_TYPE_SHARED_BG;
            rect = new Rect(0, 0, C81185Vtd.LIZLLL(), C81185Vtd.LIZIZ());
        } else {
            num = null;
            enumC75250Tg6 = EnumC75250Tg6.DIVIDER_TYPE_NORMAL;
            str2 = null;
            rect = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSharedBg sharedBgEnable=");
        LIZ.append(z);
        LIZ.append(", emptyMaskBackgroundColor=");
        LIZ.append(num2);
        LIZ.append(", dividerType=");
        LIZ.append(enumC75250Tg6);
        LIZ.append(", playerBgFilePath=");
        LIZ.append(str2);
        LIZ.append(", playerForegroundClipRect=");
        LIZ.append(rect);
        C74987Tbr.LIZJ("multi_guest_theme", X1D.LIZIZ(LIZ));
        setState(new AqS16S1400000_13(enumC75250Tg6, num2, num, str2, rect, 0));
    }

    public static void iv0(MultiGuestThemeViewModel multiGuestThemeViewModel, TBV prop1, LifecycleOwner lifecycleOwner, InterfaceC88472Yns subscriber, int i) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if ((i & 4) != 0) {
            lifecycleOwner2 = null;
        }
        multiGuestThemeViewModel.getClass();
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(subscriber, "subscriber");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select state Subscribe [");
        LIZ.append(prop1);
        LIZ.append("] ");
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "StateSubscriber");
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZIZ(true);
        AssemViewModel.selectSubscribe$default(multiGuestThemeViewModel, prop1, c56412MCa, lifecycleOwner2, null, subscriber, 8, null);
    }
}
