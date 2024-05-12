package X;

import android.widget.ImageView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TcP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75021TcP implements InterfaceC08180Tu {
    public final /* synthetic */ MultiGuestEffectSwitchFragment LIZ;

    @Override // X.InterfaceC08180Tu
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC08180Tu
    public final void LIZJ() {
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = this.LIZ;
        if (!((Boolean) multiGuestEffectSwitchFragment.LJLIL.LIZ(multiGuestEffectSwitchFragment, MultiGuestEffectSwitchFragment.LLIFFJFJJ[0])).booleanValue()) {
            InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ, "getService(T::class.java)");
            InterfaceC31991Nj multiGuestBeautyLogManager = ((IEffectService) LIZ).getMultiGuestBeautyLogManager();
            if (multiGuestBeautyLogManager != null) {
                java.util.Map<Long, C0W9> map = C42151l5.LIZIZ;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                linkedHashMap.clear();
                ((C42151l5) multiGuestBeautyLogManager).LIZLLL(false);
                linkedHashMap.clear();
                java.util.Map<Long, C0W9> map2 = C42151l5.LIZLLL;
                map.putAll(map2);
                ((LinkedHashMap) map2).clear();
                ((LinkedHashMap) C42151l5.LJ).clear();
                ((LinkedHashMap) C42151l5.LJFF).clear();
                ((LinkedHashMap) C42151l5.LJI).clear();
            }
        }
    }

    @Override // X.InterfaceC08180Tu
    public final C76923UGx LIZLLL() {
        C76923UGx c76923UGx = this.LIZ.LJLILLLLZI;
        if (c76923UGx == null) {
            return new C76923UGx(this.LIZ.getContext(), null);
        }
        return c76923UGx;
    }

    @Override // X.InterfaceC08180Tu
    public final C47121t6 LJ() {
        C47121t6 c47121t6 = this.LIZ.LJLJI;
        if (c47121t6 != null) {
            return c47121t6;
        }
        return new C47121t6(this.LIZ.getContext(), null);
    }

    @Override // X.InterfaceC08180Tu
    public final ImageView LJI() {
        return this.LIZ.LJLJJLL;
    }

    @Override // X.InterfaceC08180Tu
    public final java.util.Map<String, String> LJII() {
        return C77123UOp.LJJIIJZLJL();
    }

    @Override // X.InterfaceC08180Tu
    public final MultiGuestEffectSwitchFragment LJFF() {
        return this.LIZ;
    }

    public C75021TcP(MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment) {
        this.LIZ = multiGuestEffectSwitchFragment;
    }

    @Override // X.InterfaceC08180Tu
    public final void LIZ(boolean z) {
        float f;
        ImageView imageView = this.LIZ.LJLJJLL;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        ImageView imageView2 = this.LIZ.LJLJJLL;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            f = 0.75f;
        } else {
            f = 0.5f;
        }
        imageView2.setAlpha(f);
    }
}
