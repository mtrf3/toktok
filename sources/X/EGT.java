package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioViewModel$fetchData$1$1$onDownloadSuccess$2$1", f = "ReuseAudioViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EGT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Integer>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EGT(String str, InterfaceC67352kd<? super EGT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EGT(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C141335gf.LIZJ(obj);
        Integer duration = AVExternalServiceImpl.LIZ().vesdkService().getAudioFileInfo(this.LJLIL).getDuration();
        if (duration != null) {
            i = duration.intValue();
        } else {
            i = 0;
        }
        return new Integer(i);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
