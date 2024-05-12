package X;

import com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace.MusicReplaceApi;
import com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace.MusicReplaceResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace.handlers.MusicReplaceFetchHandler$handleData$2$startFetchTask$1", f = "MusicReplaceFetchHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6Lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158876Lj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super MusicReplaceResponse>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158876Lj(String str, InterfaceC67352kd<? super C158876Lj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C158876Lj(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String vid = this.LJLIL;
        o.LJIIIZ(vid, "vid");
        MusicReplaceResponse musicReplaceResponse = ((MusicReplaceApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, MusicReplaceApi.Api.class)).getSeparateAudioTrack(vid).execute().LIZIZ;
        o.LJIIIIZZ(musicReplaceResponse, "api.getSeparateAudioTrack(vid).execute().body()");
        return musicReplaceResponse;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super MusicReplaceResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
