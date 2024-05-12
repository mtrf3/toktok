package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import kotlin.jvm.internal.AqS1S0210100_3;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$handleDiggClickFailed$1", f = "VideoDiggVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7C1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7C1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ VideoDiggVM LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7C1(VideoDiggVM videoDiggVM, Aweme aweme, InterfaceC67352kd<? super C7C1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoDiggVM;
        this.LJLILLLLZI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7C1(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        VideoDiggVM videoDiggVM = this.LJLIL;
        if (!videoDiggVM.LJLL) {
            videoDiggVM.LJLJLLL++;
            z = true;
        } else {
            z = false;
            videoDiggVM.LJLJLLL--;
        }
        long xv0 = videoDiggVM.xv0(this.LJLILLLLZI, z);
        VideoDiggVM videoDiggVM2 = this.LJLIL;
        videoDiggVM2.setState(new AqS1S0210100_3(videoDiggVM2, xv0, this.LJLILLLLZI, z, 0));
        String aid = this.LJLILLLLZI.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        C2U8.LIZ(new AnonymousClass799(aid, xv0, z ? 1 : 0, C79N.ICON));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
