package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.AqS54S1200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TgZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75279TgZ implements InterfaceC88472Yns<InterfaceC72996Skq, C76800UCe> {
    public final /* synthetic */ LiveEffect LJLIL;
    public final /* synthetic */ MultiGuestSharedBgAnchorViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC72996Skq interfaceC72996Skq) {
        InterfaceC72996Skq cb = interfaceC72996Skq;
        o.LJIIIZ(cb, "cb");
        cb.LIZ(C75291Tgl.LJLIL);
        cb.LIZLLL(new AqS54S1200000_13(this.LJLILLLLZI, this.LJLIL, this.LJLJI, 4));
        cb.LIZIZ(C75292Tgm.LJLIL);
        cb.LIZJ(new AqS195S0100000_13(this.LJLILLLLZI, 30));
        return C76800UCe.LIZ;
    }

    public C75279TgZ(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, LiveEffect liveEffect, String str) {
        this.LJLIL = liveEffect;
        this.LJLILLLLZI = multiGuestSharedBgAnchorViewModel;
        this.LJLJI = str;
    }
}
