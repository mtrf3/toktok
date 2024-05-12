package X;

import Y.IDdS378S0100000_6;
import com.google.gson.m;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneTTSApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.5ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138875ch extends AbstractC29891Fh<InterfaceC138315bn> implements InterfaceC138315bn, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final InterfaceC138315bn LJLILLLLZI;

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC138315bn getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C138875ch(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
    }

    private final void LJJLIIIJILLIZJL(InterfaceC138465c2 interfaceC138465c2) {
        String str;
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ == null || (str = LJ.getUid()) == null) {
            str = "";
        }
        if (str.length() == 0) {
            interfaceC138465c2.LIZ(null, 103, "GetSpeakerInfoFromUid: uid is null");
            return;
        }
        IDdS378S0100000_6 iDdS378S0100000_6 = new IDdS378S0100000_6(interfaceC138465c2, 1);
        VoiceCloneTTSApi.Api api = (VoiceCloneTTSApi.Api) C60903NvH.LJIIJJI().getNetworkService().createRetrofit("https://sami-va.tiktokv.com", true, VoiceCloneTTSApi.Api.class);
        C48153Iv7 c48153Iv7 = new C48153Iv7();
        c48153Iv7.LJIIIZ = true;
        m mVar = new m();
        mVar.LJJIIZ("locale", "jp");
        mVar.LJJIIZ("uid", str);
        mVar.LJJIIJ("filter_text_content", 1);
        m mVar2 = new m();
        mVar2.LJJIIZ("arguments", mVar.toString());
        mVar2.LJJIIZ("apiName", "GetSpeakerInfoFromUid");
        m mVar3 = new m();
        mVar3.LJJIIZ("payload", mVar2.toString());
        api.getSpeakerInfoFromUid("BGJqbgQOfj", "VopBuild", mVar3, c48153Iv7).enqueue(iDdS378S0100000_6);
    }

    @Override // X.InterfaceC138315bn
    public void i60(VoiceCloneReadTextEffectBean bean) {
        o.LJIIIZ(bean, "bean");
        C86850Y6s.LIZIZ.LIZJ(C78688UuS.LJJIII(this), "voice_panel");
    }

    public final Object LJJLI(String speakerId, InterfaceC67352kd<? super OSJ<String, Integer, String>> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        IDdS378S0100000_6 iDdS378S0100000_6 = new IDdS378S0100000_6(c84654XKg, 0);
        o.LJIIIZ(speakerId, "speakerId");
        VoiceCloneTTSApi.Api api = (VoiceCloneTTSApi.Api) C60903NvH.LJIIJJI().getNetworkService().createRetrofit("https://sami-va.tiktokv.com", true, VoiceCloneTTSApi.Api.class);
        C48153Iv7 c48153Iv7 = new C48153Iv7();
        c48153Iv7.LJIIIZ = true;
        m mVar = new m();
        mVar.LJJIIZ("speaker_id", speakerId);
        m mVar2 = new m();
        mVar2.LJJIIZ("arguments", mVar.toString());
        mVar2.LJJIIZ("apiName", "GetLokiInfoFromSpeakerId");
        m mVar3 = new m();
        mVar3.LJJIIZ("payload", mVar2.toString());
        api.getLokiInfoFromSpeakerId("BGJqbgQOfj", "VopBuild", mVar3, c48153Iv7).enqueue(iDdS378S0100000_6);
        return c84654XKg.LIZ();
    }

    @Override // X.InterfaceC138315bn
    public void tu(final InterfaceC84497XEf effectPlatform, final InterfaceC138465c2 callback) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(callback, "callback");
        LJJLIIIJILLIZJL(new InterfaceC138465c2() { // from class: X.5c0
            @Override // X.InterfaceC138465c2
            public final void LIZ(TTSSpeakerInfo tTSSpeakerInfo, int i, String str) {
                String str2;
                Effect effect;
                UrlModel iconUrl;
                List<String> arrayList;
                com.ss.android.ugc.aweme.base.model.UrlModel avatarThumb;
                Effect effect2 = null;
                if (tTSSpeakerInfo != null) {
                    if (tTSSpeakerInfo.LIZ() && !tTSSpeakerInfo.LIZIZ()) {
                        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C138455c1(C138875ch.this, tTSSpeakerInfo, callback, effectPlatform, i, str, null), 3);
                        return;
                    }
                    effect2 = tTSSpeakerInfo.LIZIZ;
                }
                if (effect2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("is_voice_clone", true);
                    effect2.setExtra(jSONObject.toString());
                }
                if (tTSSpeakerInfo != null) {
                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = tTSSpeakerInfo.LIZ;
                    if (readTextEffectSpeakerExtra != null) {
                        String string = C78688UuS.LJJIII(C138875ch.this).getString(R.string.trm);
                        o.LJIIIIZZ(string, "context.getString(R.stri…fectsPanel_creators_link)");
                        readTextEffectSpeakerExtra.speakerName = string;
                    }
                    if (tTSSpeakerInfo != null) {
                        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = tTSSpeakerInfo.LIZ;
                        if (readTextEffectSpeakerExtra2 != null) {
                            if (tTSSpeakerInfo == null || (str2 = tTSSpeakerInfo.speakerId) == null) {
                                str2 = "";
                            }
                            readTextEffectSpeakerExtra2.speakreID = str2;
                        }
                        if (tTSSpeakerInfo != null && (effect = tTSSpeakerInfo.LIZIZ) != null && (iconUrl = effect.getIconUrl()) != null) {
                            C44423Hc3 LJ = C73098SmU.LJ();
                            if (LJ == null || (avatarThumb = LJ.getAvatarThumb()) == null || (arrayList = avatarThumb.getUrlList()) == null) {
                                arrayList = new ArrayList<>();
                            }
                            iconUrl.setUrlList(arrayList);
                        }
                    }
                }
                callback.LIZ(tTSSpeakerInfo, i, str);
                if (tTSSpeakerInfo == null || !tTSSpeakerInfo.LIZ() || !tTSSpeakerInfo.LIZIZ()) {
                    return;
                }
                C138875ch.this.LJJLIIIJJI(tTSSpeakerInfo.speakerId, "デフォルト", true);
            }
        });
    }

    public final Object LJJLIIIIJ(InterfaceC84497XEf interfaceC84497XEf, String str, InterfaceC67352kd<? super OSJ<? extends Effect, Integer, String>> interfaceC67352kd) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (str.length() == 0) {
            OSJ osj = new OSJ(null, new Integer(102), "effect id is null");
            C3C5.m7constructorimpl(osj);
            c84654XKg.resumeWith(osj);
        } else {
            interfaceC84497XEf.LIZLLL(str, C0JU.LIZ("panel", "speaking-voice"), new IFetchEffectListener() { // from class: X.5c4
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    InterfaceC67352kd<OSJ<? extends Effect, Integer, String>> interfaceC67352kd2 = c84654XKg;
                    OSJ osj2 = new OSJ(effect, 0, null);
                    C3C5.m7constructorimpl(osj2);
                    interfaceC67352kd2.resumeWith(osj2);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult e) {
                    o.LJIIIZ(e, "e");
                    InterfaceC67352kd<OSJ<? extends Effect, Integer, String>> interfaceC67352kd2 = c84654XKg;
                    OSJ osj2 = new OSJ(null, Integer.valueOf(e.getErrorCode()), e.getMsg());
                    C3C5.m7constructorimpl(osj2);
                    interfaceC67352kd2.resumeWith(osj2);
                }
            });
        }
        return c84654XKg.LIZ();
    }

    public final void LJJLIIIJJI(String str, String str2, boolean z) {
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C138035bL(str2, str, z, null), 3);
    }
}
