package X;

import android.content.Context;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.choosemusic.localmusic.LocalMusicProvider$Companion$scanLocalMusicTask$1$2", f = "LocalMusicProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.HMu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43952HMu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ ArrayList<MusicModel> LJLILLLLZI;
    public final /* synthetic */ InterfaceC43955HMx LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43952HMu(Context context, ArrayList<MusicModel> arrayList, InterfaceC43955HMx interfaceC43955HMx, InterfaceC67352kd<? super C43952HMu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = context;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = interfaceC43955HMx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43952HMu(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IAVInfoService infoService = AVExternalServiceImpl.LIZ().abilityService().infoService();
        Context context = this.LJLIL;
        ArrayList<MusicModel> arrayList = this.LJLILLLLZI;
        infoService.audioLegal(context, arrayList, new C43951HMt(arrayList), new C43953HMv(this.LJLJI));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
