package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.TTSFragment$downloadAudio$1$file$1", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5ar, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137735ar extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super File>, Object> {
    public final /* synthetic */ TTSFragment LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137735ar(TTSFragment tTSFragment, String str, InterfaceC67352kd<? super C137735ar> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = tTSFragment;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137735ar(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        VideoPublishEditModel em = this.LJLIL.em();
        o.LJI(em);
        CreativeInfo creativeInfo = em.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "publishEditModel!!.creativeInfo");
        return C167496hl.LIZ(creativeInfo, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super File> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
