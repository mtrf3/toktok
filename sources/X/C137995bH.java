package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import fjb.a;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$downloadAudio$2", f = "TTSPanelUIComponent.kt", l = {805, 815}, m = "invokeSuspend")
/* renamed from: X.5bH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137995bH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C138075bP LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ ReadTextEffectBean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ String LJLLJ;
    public final /* synthetic */ boolean LJLLL;
    public final /* synthetic */ long LJLLLL;
    public final /* synthetic */ long LJLLLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137995bH(C138075bP c138075bP, int i, ReadTextEffectBean readTextEffectBean, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, long j2, long j3, InterfaceC67352kd<? super C137995bH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c138075bP;
        this.LJLJI = i;
        this.LJLJJI = readTextEffectBean;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = j;
        this.LJLJLJ = str3;
        this.LJLJLLL = str4;
        this.LJLL = str5;
        this.LJLLI = str6;
        this.LJLLILLLL = str7;
        this.LJLLJ = str8;
        this.LJLLL = z;
        this.LJLLLL = j2;
        this.LJLLLLLL = j3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137995bH(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, this.LJLLLLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        File file;
        String str2;
        boolean z;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    file = (File) obj2;
                    if (file != null || !file.exists()) {
                        this.LJLILLLLZI.LLIZ(this.LJLJI, "base64ToFile error", 100, this.LJLJJI);
                        return C76800UCe.LIZ;
                    }
                    int LIZIZ = HOH.LIZIZ(4, file.getAbsolutePath());
                    int i2 = this.LJLJI;
                    C138075bP c138075bP = this.LJLILLLLZI;
                    if (i2 != c138075bP.LLFFF) {
                        return C76800UCe.LIZ;
                    }
                    TextStickerData textStickerData = c138075bP.LLF;
                    if (textStickerData != null) {
                        long j = this.LJLJL;
                        String str3 = this.LJLJLJ;
                        String str4 = this.LJLJLLL;
                        String str5 = this.LJLL;
                        String str6 = this.LJLLI;
                        String str7 = this.LJLLILLLL;
                        String str8 = this.LJLLJ;
                        boolean z2 = this.LJLLL;
                        long j2 = this.LJLLLL;
                        long j3 = this.LJLLLLLL;
                        ReadTextEffectBean readTextEffectBean = this.LJLJJI;
                        String value = this.LJLJJLL;
                        c138075bP.LLILLL.LIZ.put("apply_duration", System.currentTimeMillis() - j);
                        c138075bP.LLILLL.LIZLLL();
                        textStickerData.setAudioTrackDuration(LIZIZ);
                        textStickerData.setAudioTrackFilePath(file.getAbsolutePath());
                        List<String> audioPathList = textStickerData.getAudioPathList();
                        String absolutePath = file.getAbsolutePath();
                        o.LJIIIIZZ(absolutePath, "file.absolutePath");
                        audioPathList.add(absolutePath);
                        TextStickerData textStickerData2 = c138075bP.LLF;
                        if (textStickerData2 != null) {
                            str2 = textStickerData2.getTextStr();
                        } else {
                            str2 = null;
                        }
                        textStickerData.setAudioText(str2);
                        textStickerData.setVoiceEffectId(str3);
                        textStickerData.setVoiceEffectIconUrl(str4);
                        textStickerData.setVoiceAnchorName(str5);
                        textStickerData.setVoiceEffectResourceId(str6);
                        textStickerData.setVoiceCreatorUserName(str7);
                        textStickerData.setVoiceCreatorUserId(str8);
                        textStickerData.setCreatorVoice(z2);
                        textStickerData.setTtsAnchorReleaseDate(j2);
                        textStickerData.setTtsReleaseDate(j3);
                        textStickerData.getTtsExtraMap().put("tts_tab_name", readTextEffectBean.category.name);
                        textStickerData.getTtsExtraMap().put("tts_tab_id", readTextEffectBean.category.id);
                        String speakerID = textStickerData.getSpeakerID();
                        if (speakerID != null) {
                            if (!o.LJ(value, speakerID)) {
                                c138075bP.Rl(speakerID, textStickerData);
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = true;
                        }
                        textStickerData.setSpeakerID(value);
                        c138075bP.LJZI(textStickerData, file, LIZIZ);
                        o.LJIIIZ(value, "value");
                        SpeakerCenter.LIZ.storeString("setLastVoice", value);
                        SpeakerCenter.LJIIJ(new SpeakerCenter.KevaSpeakerBean(str3, str4, str5, null, str8, str7, z2, j2, j3, 8, null));
                        c138075bP.LLLZLL(readTextEffectBean);
                        if (!c138075bP.LJZL) {
                            c138075bP.LJJZZI(C138015bJ.LJLIL);
                        }
                        c138075bP.LLLIIIL().LJJJJL();
                        c138075bP.LLLIIIL().xn(C78886Uxe.LJJI(textStickerData));
                        if (!c138075bP.LLIZLLLIL) {
                            c138075bP.LLLIIIL().k3();
                        }
                        if (z) {
                            textStickerData.getTtsHashTagIds().addAll(c138075bP.LLJJL(readTextEffectBean.effect));
                            C137935bB.LIZ(C86793Y4n.LJJIJIIJIL(c138075bP.LJLL), c138075bP.LLLLIL(), readTextEffectBean.effect);
                        }
                    }
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            int LIZ = C138025bK.LIZ();
            XIA xia = C78613UtF.LIZJ;
            C137855b3 c137855b3 = new C137855b3(this.LJLJJL, this.LJLJJLL, LIZ, this.LJLJJI, null);
            this.LJLIL = 1;
            obj2 = XKX.LJI(xia, c137855b3, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        TextToSpeechApi.FetchTextAudioResponse fetchTextAudioResponse = (TextToSpeechApi.FetchTextAudioResponse) obj2;
        TextToSpeechApi.TextAudioData data = fetchTextAudioResponse.getData();
        if (data != null) {
            str = data.getAudio();
        } else {
            str = null;
        }
        int i3 = fetchTextAudioResponse.status_code;
        if (i3 != 0 || str == null) {
            this.LJLILLLLZI.LLIZ(this.LJLJI, fetchTextAudioResponse.message, i3, this.LJLJJI);
            return C76800UCe.LIZ;
        }
        XIA xia2 = C78613UtF.LIZJ;
        C137865b4 c137865b4 = new C137865b4(this.LJLILLLLZI, str, null);
        this.LJLIL = 2;
        obj2 = XKX.LJI(xia2, c137865b4, this);
        if (obj2 == enumC58928NAu) {
            return enumC58928NAu;
        }
        file = (File) obj2;
        if (file != null) {
        }
        this.LJLILLLLZI.LLIZ(this.LJLJI, "base64ToFile error", 100, this.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
