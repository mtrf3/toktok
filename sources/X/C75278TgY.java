package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.AqS9S1210000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TgY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75278TgY implements InterfaceC88472Yns<InterfaceC72996Skq, C76800UCe> {
    public final /* synthetic */ MultiGuestSharedBgGuestViewModel LJLIL;
    public final /* synthetic */ LiveEffect LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC72996Skq interfaceC72996Skq) {
        InterfaceC72996Skq cb = interfaceC72996Skq;
        o.LJIIIZ(cb, "cb");
        cb.LIZ(C75289Tgj.LJLIL);
        cb.LIZLLL(new AqS9S1210000_13(this.LJLIL, this.LJLILLLLZI, this.LJLJJI, this.LJLJI, 1));
        cb.LIZIZ(C75290Tgk.LJLIL);
        cb.LIZJ(new AqS195S0100000_13(this.LJLIL, 6));
        return C76800UCe.LIZ;
    }

    public C75278TgY(MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, LiveEffect liveEffect, String str, boolean z) {
        this.LJLIL = multiGuestSharedBgGuestViewModel;
        this.LJLILLLLZI = liveEffect;
        this.LJLJI = z;
        this.LJLJJI = str;
    }
}
