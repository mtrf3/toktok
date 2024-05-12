package X;

import com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.SpeechToSongHelper$startPrepareSpeechToSong$1", f = "SpeechToSongHelper.kt", l = {171}, m = "invokeSuspend")
/* renamed from: X.6gd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166796gd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C166736gX LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C166866gk LJLJJI;
    public final /* synthetic */ OnSpeechToSongPrepareListener LJLJJL;
    public final /* synthetic */ C166926gq LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166796gd(C166736gX c166736gX, String str, C166866gk c166866gk, OnSpeechToSongPrepareListener onSpeechToSongPrepareListener, C166926gq c166926gq, InterfaceC67352kd<? super C166796gd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c166736gX;
        this.LJLJI = str;
        this.LJLJJI = c166866gk;
        this.LJLJJL = onSpeechToSongPrepareListener;
        this.LJLJJLL = c166926gq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C166796gd(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
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
            XIC xic = C78613UtF.LIZ;
            C166786gc c166786gc = new C166786gc(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, null);
            this.LJLIL = 1;
            if (XKX.LJI(xic, c166786gc, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
