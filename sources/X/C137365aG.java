package X;

import com.ss.android.ugc.aweme.services.audio.VcCreatorInfo;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl$fetchAudioWatermarkInfo$1$vcResult$1", f = "AudioWatermarkServiceImpl.kt", l = {51}, m = "invokeSuspend")
/* renamed from: X.5aG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137365aG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super VcCreatorInfo>, Object> {
    public int LJLIL;
    public final /* synthetic */ AudioWatermarkServiceImpl LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137365aG(AudioWatermarkServiceImpl audioWatermarkServiceImpl, List<String> list, InterfaceC67352kd<? super C137365aG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = audioWatermarkServiceImpl;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137365aG(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            AudioWatermarkServiceImpl audioWatermarkServiceImpl = this.LJLILLLLZI;
            List<String> list = this.LJLJI;
            this.LJLIL = 1;
            obj = audioWatermarkServiceImpl.fetchVcCreatorInfoByIdList(list, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super VcCreatorInfo> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
