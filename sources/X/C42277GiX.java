package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ExtractMusicChosenResultImpl$onChosenResult$extractTask$1", f = "ExtractMusicChosenResultImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GiX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42277GiX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C42294Gio LJLILLLLZI;
    public final /* synthetic */ MediaModel LJLJI;
    public final /* synthetic */ Intent LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42277GiX(C42294Gio c42294Gio, MediaModel mediaModel, Intent intent, InterfaceC67352kd<? super C42277GiX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c42294Gio;
        this.LJLJI = mediaModel;
        this.LJLJJI = intent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C42277GiX c42277GiX = new C42277GiX(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c42277GiX.LJLIL = obj;
        return c42277GiX;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        XKX.LIZIZ((InterfaceC70422pa) this.LJLIL, null, null, new C42296Giq(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
