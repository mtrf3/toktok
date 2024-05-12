package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U69 implements InterfaceC76768UAy<CreateChannelResult> {
    public final /* synthetic */ InterfaceC75414Tik<CreateChannelResult> LJLIL;
    public final /* synthetic */ U65 LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(CreateChannelResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createChannel success value=");
        LIZ.append(value);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<CreateChannelResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
        U8H LJFF = this.LJLILLLLZI.LJFF();
        U65 u65 = this.LJLILLLLZI;
        LinkUser.Builder builder = new LinkUser.Builder();
        builder.setRoomId(Long.valueOf(u65.LJLJJI.getId()));
        builder.setUserId(Long.valueOf(u65.LJLJJI.getOwnerUserId()));
        builder.setLinkMicId(u65.LJLJJL.LLZL().getLinkMicId());
        builder.setChannelId(Long.valueOf(u65.LJLJJL.LJJLI()));
        U8H.LJJLL(LJFF, builder.build(), null, false, 14);
    }

    public U69(InterfaceC75414Tik<CreateChannelResult> interfaceC75414Tik, U65 u65) {
        this.LJLIL = interfaceC75414Tik;
        this.LJLILLLLZI = u65;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(975);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createChannel fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        InterfaceC75414Tik<CreateChannelResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
