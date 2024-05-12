package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZ6 implements HZP, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final HXT LJLILLLLZI;
    public final InterfaceC65784Pro<C44297Ha1> LJLJI;

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.HZP
    public final I14 LIZ(C46193IAz stickerApiComponent) {
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        return new C44436HcG(this.LJLJI, (C29S) this.LJLIL.LJ(C29S.class, null), stickerApiComponent, (ShortVideoContext) this.LJLIL.LJ(ShortVideoContext.class, null), this.LJLILLLLZI, this.LJLIL);
    }

    public HZ6(C82622Wbi diContainer, HXT hxt, InterfaceC65784Pro<C44297Ha1> interfaceC65784Pro) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = hxt;
        this.LJLJI = interfaceC65784Pro;
    }
}
