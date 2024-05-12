package X;

import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.TTSFragment$downloadAudio$1", f = "TTSFragment.kt", l = {701, 709}, m = "invokeSuspend")
/* renamed from: X.5aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137725aq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TTSFragment LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137725aq(TTSFragment tTSFragment, int i, int i2, String str, String str2, String str3, InterfaceC67352kd<? super C137725aq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = tTSFragment;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137725aq(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        File file;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    file = (File) obj;
                    if (file != null || !file.exists()) {
                        this.LJLILLLLZI.lm(this.LJLJI, this.LJLJJI, "");
                        return C76800UCe.LIZ;
                    }
                    int LIZIZ = HOH.LIZIZ(4, file.getAbsolutePath());
                    int i2 = this.LJLJJI;
                    TTSFragment tTSFragment = this.LJLILLLLZI;
                    if (i2 != tTSFragment.LLILII) {
                        return C76800UCe.LIZ;
                    }
                    int i3 = tTSFragment.LLIIII;
                    int i4 = this.LJLJI;
                    if (i3 != i4) {
                        tTSFragment.vm(i4, false);
                        return C76800UCe.LIZ;
                    }
                    String str2 = tTSFragment.LJZI;
                    if (str2 != null) {
                        tTSFragment.LLD.put(new C137695an(str2, this.LJLJJL), new OSZ<>(file, Integer.valueOf(LIZIZ)));
                        C136935Yz c136935Yz = (C136935Yz) this.LJLILLLLZI.LJLZ.getValue();
                        String absolutePath = file.getAbsolutePath();
                        o.LJIIIIZZ(absolutePath, "file.absolutePath");
                        c136935Yz.getClass();
                        c136935Yz.LIZ.add(absolutePath);
                        this.LJLILLLLZI.mm(this.LJLJJL, this.LJLJI, file, LIZIZ);
                        return C76800UCe.LIZ;
                    }
                    o.LJIJI("text");
                    throw null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            XIA xia = C78613UtF.LIZJ;
            C137765au c137765au = new C137765au(this.LJLJJLL, this.LJLJJL, this.LJLJL, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xia, c137765au, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        TextToSpeechApi.FetchTextAudioResponse fetchTextAudioResponse = (TextToSpeechApi.FetchTextAudioResponse) obj;
        TextToSpeechApi.TextAudioData data = fetchTextAudioResponse.getData();
        if (data != null) {
            str = data.getAudio();
        } else {
            str = null;
        }
        if (fetchTextAudioResponse.status_code != 0 || str == null) {
            this.LJLILLLLZI.lm(this.LJLJI, this.LJLJJI, fetchTextAudioResponse.message);
            return C76800UCe.LIZ;
        }
        XIA xia2 = C78613UtF.LIZJ;
        C137735ar c137735ar = new C137735ar(this.LJLILLLLZI, str, null);
        this.LJLIL = 2;
        obj = XKX.LJI(xia2, c137735ar, this);
        if (obj == enumC58928NAu) {
            return enumC58928NAu;
        }
        file = (File) obj;
        if (file != null) {
        }
        this.LJLILLLLZI.lm(this.LJLJI, this.LJLJJI, "");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
