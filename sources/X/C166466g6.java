package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCAudioResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VoiceConversionApi;
import fjb.a;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.FetchHandler$handleData$2$1$asyncTask$1", f = "FetchHandler.kt", l = {64}, m = "invokeSuspend")
/* renamed from: X.6g6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166466g6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C166556gF>, Object> {
    public int LJLIL;
    public final /* synthetic */ OSZ<JSONArray, JSONArray> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C166466g6(OSZ<? extends JSONArray, ? extends JSONArray> osz, boolean z, InterfaceC67352kd<? super C166466g6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = osz;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C166466g6(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            JSONArray first = this.LJLILLLLZI.getFirst();
            JSONArray second = this.LJLILLLLZI.getSecond();
            boolean z2 = this.LJLJI;
            this.LJLIL = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            if (first.length() == 0) {
                Object c166556gF = new C166556gF();
                C3C5.m7constructorimpl(c166556gF);
                c84654XKg.resumeWith(c166556gF);
            } else if (second.length() == 0) {
                Object c166556gF2 = new C166556gF();
                C3C5.m7constructorimpl(c166556gF2);
                c84654XKg.resumeWith(c166556gF2);
            } else {
                VoiceConversionApi.Api api = (VoiceConversionApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, VoiceConversionApi.Api.class);
                Integer valueOf = Integer.valueOf(!z2 ? 1 : 0);
                Object value = C166586gI.LIZ.getValue();
                o.LJIIIIZZ(value, "<get-value>(...)");
                String str = (String) value;
                if (ujb.o.LJJJJJL(str)) {
                    str = null;
                }
                VCAudioResponse vCAudioResponse = api.downloadVoiceConversion(first, second, valueOf, str).execute().LIZIZ;
                o.LJIIIIZZ(vCAudioResponse, "api.downloadVoiceConvers… else 1).execute().body()");
                VCAudioResponse vCAudioResponse2 = vCAudioResponse;
                C166556gF c166556gF3 = new C166556gF();
                if (vCAudioResponse2.status_code != 0) {
                    z = false;
                }
                c166556gF3.LIZ = z;
                c166556gF3.LIZIZ = vCAudioResponse2;
                C3C5.m7constructorimpl(c166556gF3);
                c84654XKg.resumeWith(c166556gF3);
            }
            obj = c84654XKg.LIZ();
            if (obj == obj2) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C166556gF> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
