package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.view.KaraokeSoundEffectAdapter$onBindViewHolder$1$1", f = "KaraokeSoundEffectAdapter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.29o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C538829o extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C40731in LJLIL;
    public final /* synthetic */ LiveEffect LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538829o(C40731in c40731in, LiveEffect liveEffect, InterfaceC67352kd<? super C538829o> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c40731in;
        this.LJLILLLLZI = liveEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C538829o(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        KaraokeViewModel karaokeViewModel = this.LJLIL.LJLJJI;
        if (karaokeViewModel != null) {
            karaokeViewModel.yv0(new C1KY(this.LJLILLLLZI));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
