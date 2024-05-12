package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace.MusicReplaceApi;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace.handlers.MusicReplaceFetchHandler$handleData$2$startSeparateTask$1", f = "MusicReplaceFetchHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6Li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158866Li extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super BaseResponse>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ ArrayList<MatchDetailsV1> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158866Li(String str, ArrayList<MatchDetailsV1> arrayList, InterfaceC67352kd<? super C158866Li> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = arrayList;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C158866Li(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String vid = this.LJLIL;
        ArrayList<MatchDetailsV1> matchDetails = this.LJLILLLLZI;
        o.LJIIIZ(vid, "vid");
        o.LJIIIZ(matchDetails, "matchDetails");
        MusicReplaceApi.Api api = (MusicReplaceApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, MusicReplaceApi.Api.class);
        String matchDetailsParam = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), matchDetails);
        o.LJIIIIZZ(matchDetailsParam, "matchDetailsParam");
        BaseResponse baseResponse = api.startSeparateAudioTrack(vid, matchDetailsParam).execute().LIZIZ;
        o.LJIIIIZZ(baseResponse, "api.startSeparateAudioTr…lsParam).execute().body()");
        return baseResponse;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
