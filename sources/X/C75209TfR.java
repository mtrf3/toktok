package X;

import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TfR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75209TfR {
    public static MultiGuestEffectSwitchFragment LIZ(InterfaceC24140x8 interfaceC24140x8, InterfaceC75220Tfc interfaceC75220Tfc, boolean z, InterfaceC75203TfL interfaceC75203TfL, FrameLayout frameLayout, FrameLayout frameLayout2, Integer num, C75422Tis c75422Tis, int i, String eventPage, LiveEffect liveEffect, boolean z2) {
        C76923UGx c76923UGx;
        o.LJIIIZ(eventPage, "eventPage");
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = new MultiGuestEffectSwitchFragment();
        multiGuestEffectSwitchFragment.LL = interfaceC24140x8;
        multiGuestEffectSwitchFragment.LJLIL.LIZIZ(MultiGuestEffectSwitchFragment.LLIFFJFJJ[0], multiGuestEffectSwitchFragment, Boolean.valueOf(z));
        if (interfaceC75220Tfc != null) {
            c76923UGx = interfaceC75220Tfc.LIZJ();
        } else {
            c76923UGx = null;
        }
        multiGuestEffectSwitchFragment.LJLILLLLZI = c76923UGx;
        multiGuestEffectSwitchFragment.LJLLLLLL = interfaceC75220Tfc;
        multiGuestEffectSwitchFragment.LJLZ = interfaceC75203TfL;
        multiGuestEffectSwitchFragment.LJLL = frameLayout2;
        multiGuestEffectSwitchFragment.LJLJLLL = frameLayout;
        multiGuestEffectSwitchFragment.LJLLLL = num;
        multiGuestEffectSwitchFragment.LJZ = c75422Tis;
        multiGuestEffectSwitchFragment.LJLLI = i;
        multiGuestEffectSwitchFragment.LJLLJ = eventPage;
        multiGuestEffectSwitchFragment.LJZI = liveEffect;
        multiGuestEffectSwitchFragment.LLD = z2;
        return multiGuestEffectSwitchFragment;
    }
}
