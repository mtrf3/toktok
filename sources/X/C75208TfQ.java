package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.TfQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75208TfQ extends C1CZ {
    public final /* synthetic */ MultiGuestEffectSwitchFragment LJLIL;

    public C75208TfQ(MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment) {
        this.LJLIL = multiGuestEffectSwitchFragment;
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        String str;
        boolean z;
        LiveData liveData;
        if (i < 0 || i >= this.LJLIL.vl().size()) {
            return;
        }
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = this.LJLIL;
        int i2 = multiGuestEffectSwitchFragment.LJZL;
        multiGuestEffectSwitchFragment.LJZL = ((C30785C6j) ListProtector.get(multiGuestEffectSwitchFragment.vl(), i)).LJLIL;
        MultiGuestEffectViewModel multiGuestEffectViewModel = this.LJLIL.LJLJLJ;
        if (multiGuestEffectViewModel != null && (liveData = (LiveData) multiGuestEffectViewModel.LJLLLL.getValue()) != null) {
            liveData.setValue(Integer.valueOf(this.LJLIL.LJZL));
        }
        C74964TbU c74964TbU = InterfaceC74965TbV.LIZLLL;
        c74964TbU.getClass();
        String str2 = "";
        if (C74964TbU.LIZ(i2)) {
            str = "beauty";
        } else if (!C74964TbU.LIZIZ(i2)) {
            str = "";
        } else {
            str = "props";
        }
        int i3 = this.LJLIL.LJZL;
        c74964TbU.getClass();
        if (C74964TbU.LIZ(i3)) {
            str2 = "beauty";
        } else if (C74964TbU.LIZIZ(i3)) {
            str2 = "props";
        }
        C74951TbH.LIZIZ(str, str2);
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment2 = this.LJLIL;
        InterfaceC75203TfL interfaceC75203TfL = multiGuestEffectSwitchFragment2.LJLZ;
        boolean z2 = false;
        if (interfaceC75203TfL != null) {
            interfaceC75203TfL.LIZLLL(multiGuestEffectSwitchFragment2.LJZL, false);
        }
        int i4 = ((C30785C6j) ListProtector.get(this.LJLIL.vl(), i)).LJLIL;
        c74964TbU.getClass();
        if (i4 == 1) {
            C29306Beo.LJJLJLI(this.LJLIL.LJLJL);
        } else {
            C29306Beo.LJI(this.LJLIL.LJLJL);
        }
        if (C74964TbU.LIZ(i2) && C74964TbU.LIZIZ(this.LJLIL.LJZL)) {
            MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment3 = this.LJLIL;
            C75422Tis c75422Tis = multiGuestEffectSwitchFragment3.LJZ;
            if (c75422Tis != null) {
                C76923UGx c76923UGx = multiGuestEffectSwitchFragment3.LJLILLLLZI;
                if (c76923UGx != null && c76923UGx.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c75422Tis.LJIIJ(z, this.LJLIL.Al());
            }
            InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ, "getService(T::class.java)");
            C0WU liveMultiGuestStickerLogManager = ((IEffectService) LIZ).getLiveMultiGuestStickerLogManager();
            if (liveMultiGuestStickerLogManager != null) {
                liveMultiGuestStickerLogManager.LJIIIIZZ(C51029K0z.LJIILIIL(this.LJLIL), "props");
            }
        }
        if (!C74964TbU.LIZIZ(i2) || !C74964TbU.LIZ(this.LJLIL.LJZL)) {
            return;
        }
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment4 = this.LJLIL;
        C75422Tis c75422Tis2 = multiGuestEffectSwitchFragment4.LJZ;
        if (c75422Tis2 != null) {
            C76923UGx c76923UGx2 = multiGuestEffectSwitchFragment4.LJLILLLLZI;
            if (c76923UGx2 != null && c76923UGx2.getVisibility() == 0) {
                z2 = true;
            }
            c75422Tis2.LJIIL(z2, this.LJLIL.Al());
        }
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
        C0WU liveMultiGuestStickerLogManager2 = ((IEffectService) LIZ2).getLiveMultiGuestStickerLogManager();
        if (liveMultiGuestStickerLogManager2 == null) {
            return;
        }
        liveMultiGuestStickerLogManager2.LJIIIIZZ(C51029K0z.LJIILIIL(this.LJLIL), "beauty");
    }
}
