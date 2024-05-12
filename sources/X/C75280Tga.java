package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS129S0300000_13;
import kotlin.jvm.internal.AqS58S0400000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tga, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75280Tga implements InterfaceC88472Yns<InterfaceC72996Skq, C76800UCe> {
    public final /* synthetic */ LiveEffect LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ MultiGuestSharedBgAnchorViewModel LJLJI;
    public final /* synthetic */ Context LJLJJI;

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC72996Skq interfaceC72996Skq) {
        InterfaceC72996Skq cb = interfaceC72996Skq;
        o.LJIIIZ(cb, "cb");
        cb.LIZ(C75293Tgn.LJLIL);
        cb.LIZLLL(new AqS58S0400000_13(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, 4));
        cb.LIZJ(new AqS129S0300000_13(this.LJLJI, this.LJLJJI, this.LJLILLLLZI, 3));
        return C76800UCe.LIZ;
    }

    public C75280Tga(LiveEffect liveEffect, DataChannel dataChannel, MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, Context context) {
        this.LJLIL = liveEffect;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = multiGuestSharedBgAnchorViewModel;
        this.LJLJJI = context;
    }
}
