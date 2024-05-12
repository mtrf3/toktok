package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneComponent$fetchVoiceCloneInfoWithLokiInfo$1$onCallback$1", f = "VoiceCloneComponent.kt", l = {193, 198}, m = "invokeSuspend")
/* renamed from: X.5c1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138455c1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C138875ch LJLILLLLZI;
    public final /* synthetic */ TTSSpeakerInfo LJLJI;
    public final /* synthetic */ InterfaceC138465c2 LJLJJI;
    public final /* synthetic */ InterfaceC84497XEf LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138455c1(C138875ch c138875ch, TTSSpeakerInfo tTSSpeakerInfo, InterfaceC138465c2 interfaceC138465c2, InterfaceC84497XEf interfaceC84497XEf, int i, String str, InterfaceC67352kd<? super C138455c1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c138875ch;
        this.LJLJI = tTSSpeakerInfo;
        this.LJLJJI = interfaceC138465c2;
        this.LJLJJL = interfaceC84497XEf;
        this.LJLJJLL = i;
        this.LJLJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C138455c1(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        OSJ osj;
        Effect effect;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception e) {
            this.LJLJJI.LIZ(null, 101, e.getMessage());
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
                osj = (OSJ) obj;
                effect = (Effect) osj.getFirst();
                if (effect == null && ((Number) osj.getSecond()).intValue() == 0) {
                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = (ReadTextEffectSpeakerExtra) C82891Wg3.LIZJ().LJI(effect.getExtra(), ReadTextEffectSpeakerExtra.class);
                    TTSSpeakerInfo tTSSpeakerInfo = this.LJLJI;
                    String string = C78688UuS.LJJIII(this.LJLILLLLZI).getString(R.string.trm);
                    o.LJIIIIZZ(string, "context.getString(R.stri…fectsPanel_creators_link)");
                    readTextEffectSpeakerExtra.getClass();
                    readTextEffectSpeakerExtra.speakerName = string;
                    tTSSpeakerInfo.getClass();
                    tTSSpeakerInfo.LIZ = readTextEffectSpeakerExtra;
                    TTSSpeakerInfo tTSSpeakerInfo2 = this.LJLJI;
                    tTSSpeakerInfo2.getClass();
                    tTSSpeakerInfo2.LIZIZ = effect;
                    this.LJLJJI.LIZ(this.LJLJI, this.LJLJJLL, this.LJLJL);
                } else {
                    this.LJLJJI.LIZ(null, ((Number) osj.getSecond()).intValue(), (String) osj.getThird());
                }
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C138875ch c138875ch = this.LJLILLLLZI;
            String str = this.LJLJI.speakerId;
            this.LJLIL = 1;
            obj = c138875ch.LJJLI(str, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        OSJ osj2 = (OSJ) obj;
        if (((CharSequence) osj2.getFirst()).length() == 0) {
            this.LJLJJI.LIZ(null, ((Number) osj2.getSecond()).intValue(), (String) osj2.getThird());
            return C76800UCe.LIZ;
        }
        C138875ch c138875ch2 = this.LJLILLLLZI;
        InterfaceC84497XEf interfaceC84497XEf = this.LJLJJL;
        String str2 = (String) osj2.getFirst();
        this.LJLIL = 2;
        obj = c138875ch2.LJJLIIIIJ(interfaceC84497XEf, str2, this);
        if (obj == enumC58928NAu) {
            return enumC58928NAu;
        }
        osj = (OSJ) obj;
        effect = (Effect) osj.getFirst();
        if (effect == null) {
        }
        this.LJLJJI.LIZ(null, ((Number) osj.getSecond()).intValue(), (String) osj.getThird());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
