package X;

import android.app.Activity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import defpackage.g0;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS59S0201000_10;

/* renamed from: X.TPm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74598TPm extends AbstractC65781Prl implements InterfaceC88471Ynr<Long, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ MultiGuestV3GuestPresenter LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74598TPm(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, boolean z) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = multiGuestV3GuestPresenter;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Long l, Integer num) {
        Activity LJIILJJIL;
        Long l2 = l;
        int intValue = num.intValue();
        if (this.LJLIL) {
            this.LJLILLLLZI.showBeautySettingDialog(l2, intValue);
        } else {
            T t = this.LJLILLLLZI.mView;
            if (t != 0 && (LJIILJJIL = g0.LJIILJJIL(((InterfaceC31336CRo) t).getContext())) != null) {
                MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLILLLLZI;
                C74769TWb.LIZ(false, multiGuestV3GuestPresenter.mDataChannel, intValue, LJIILJJIL, l2, new AqS59S0201000_10(multiGuestV3GuestPresenter, l2, intValue, 0), new AqS163S0100000_13(this.LJLILLLLZI, 83));
            }
        }
        return C76800UCe.LIZ;
    }
}
