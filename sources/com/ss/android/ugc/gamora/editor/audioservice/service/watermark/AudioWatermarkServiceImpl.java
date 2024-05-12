package com.ss.android.ugc.gamora.editor.audioservice.service.watermark;

import X.C137345aE;
import X.C34K;
import X.C3C5;
import X.C48841JEv;
import X.C58096Mr6;
import X.C60903NvH;
import X.C68322mC;
import X.C76800UCe;
import X.C78555UsJ;
import X.C78613UtF;
import X.C84488XDw;
import X.C84654XKg;
import X.H2V;
import X.InterfaceC67352kd;
import X.InterfaceC84498XEg;
import X.InterfaceC88472Yns;
import X.XKX;
import android.app.Application;
import com.ss.android.ugc.aweme.services.audio.AudioWatermarkInfo;
import com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService;
import com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo;
import com.ss.android.ugc.aweme.services.audio.VcCreatorInfo;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AudioWatermarkServiceImpl implements IAudioWatermarkService {
    public InterfaceC84498XEg LIZ;

    public static IAudioWatermarkService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IAudioWatermarkService.class, false);
        if (LIZ != null) {
            return (IAudioWatermarkService) LIZ;
        }
        if (C58096Mr6.y8 == null) {
            synchronized (IAudioWatermarkService.class) {
                if (C58096Mr6.y8 == null) {
                    C58096Mr6.y8 = new AudioWatermarkServiceImpl();
                }
            }
        }
        return C58096Mr6.y8;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService
    public final boolean enbaleAudioWatermarkTTSVC() {
        return ((Boolean) H2V.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService
    public final Object fetchTtsCreatorInfoByIdList(List<String> list, InterfaceC67352kd<? super TtsCreatorInfo> interfaceC67352kd) {
        if (this.LIZ == null) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            InterfaceC84498XEg LIZ = C84488XDw.LIZ(application, null);
            C60903NvH.LJIIJJI().initDownloadableModel();
            this.LIZ = LIZ;
        }
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (list == null || list.isEmpty()) {
            C3C5.m7constructorimpl(null);
            c84654XKg.resumeWith(null);
        } else {
            InterfaceC84498XEg interfaceC84498XEg = this.LIZ;
            if (interfaceC84498XEg != null) {
                interfaceC84498XEg.LJ(list, false, null, new IFetchEffectListListener() { // from class: X.5aB
                    public boolean LIZ;
                    public final List<String> LIZIZ = new ArrayList();
                    public final List<String> LIZJ = new ArrayList();

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        Exception exc;
                        if (exceptionResult != null) {
                            exc = exceptionResult.getException();
                        } else {
                            exc = null;
                        }
                        String.valueOf(exc);
                        InterfaceC67352kd<TtsCreatorInfo> interfaceC67352kd2 = c84654XKg;
                        C3C5.m7constructorimpl(null);
                        interfaceC67352kd2.resumeWith(null);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(List<Effect> list2) {
                        String str;
                        String str2;
                        List<Effect> list3 = list2;
                        if (list3 != null) {
                            Iterator<Effect> it = list3.iterator();
                            while (it.hasNext()) {
                                ReadTextEffectBean LJIIIZ = C77412UZs.LJIIIZ(it.next());
                                String str3 = "";
                                if (LJIIIZ != null) {
                                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = LJIIIZ.mSpeaker;
                                    if (readTextEffectSpeakerExtra == null || (str = readTextEffectSpeakerExtra.voiceCreatorUserId) == null) {
                                        str = "";
                                        if (LJIIIZ != null) {
                                        }
                                    }
                                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = LJIIIZ.mSpeaker;
                                    if (readTextEffectSpeakerExtra2 != null && (str2 = readTextEffectSpeakerExtra2.voiceCreatorUserName) != null) {
                                        str3 = str2;
                                    }
                                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra3 = LJIIIZ.mSpeaker;
                                    if (readTextEffectSpeakerExtra3 != null && readTextEffectSpeakerExtra3.isCreatorVoice) {
                                        this.LIZ = true;
                                        ((ArrayList) this.LIZJ).add(str3);
                                        ((ArrayList) this.LIZIZ).add(str);
                                    }
                                }
                            }
                        }
                        InterfaceC67352kd<TtsCreatorInfo> interfaceC67352kd2 = c84654XKg;
                        TtsCreatorInfo ttsCreatorInfo = new TtsCreatorInfo(this.LIZ, this.LIZIZ, this.LIZJ);
                        C3C5.m7constructorimpl(ttsCreatorInfo);
                        interfaceC67352kd2.resumeWith(ttsCreatorInfo);
                    }
                });
            }
        }
        return c84654XKg.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService
    public final Object fetchVcCreatorInfoByIdList(List<String> list, InterfaceC67352kd<? super VcCreatorInfo> interfaceC67352kd) {
        if (this.LIZ == null) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            InterfaceC84498XEg LIZ = C84488XDw.LIZ(application, null);
            C60903NvH.LJIIJJI().initDownloadableModel();
            this.LIZ = LIZ;
        }
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (list == null || list.isEmpty()) {
            C3C5.m7constructorimpl(null);
            c84654XKg.resumeWith(null);
        } else {
            InterfaceC84498XEg interfaceC84498XEg = this.LIZ;
            if (interfaceC84498XEg != null) {
                interfaceC84498XEg.LJ(list, false, null, new IFetchEffectListListener() { // from class: X.5aC
                    public boolean LIZ;
                    public final List<String> LIZIZ = new ArrayList();
                    public final List<String> LIZJ = new ArrayList();

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        Exception exc;
                        if (exceptionResult != null) {
                            exc = exceptionResult.getException();
                        } else {
                            exc = null;
                        }
                        String.valueOf(exc);
                        InterfaceC67352kd<VcCreatorInfo> interfaceC67352kd2 = c84654XKg;
                        C3C5.m7constructorimpl(null);
                        interfaceC67352kd2.resumeWith(null);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(List<Effect> list2) {
                        String extra;
                        List<Effect> list3 = list2;
                        if (list3 != null) {
                            for (Effect effect : list3) {
                                String LJJLI = OUP.LJJLI(effect);
                                String LJJLIIIIJ = OUP.LJJLIIIIJ(effect);
                                boolean z = false;
                                try {
                                    extra = effect.getExtra();
                                } catch (JSONException unused) {
                                }
                                if (extra != null) {
                                    z = new JSONObject(extra).optBoolean("vc_is_creator", false);
                                    if (z) {
                                        this.LIZ = true;
                                        ((ArrayList) this.LIZIZ).add(LJJLI);
                                        ((ArrayList) this.LIZJ).add(LJJLIIIIJ);
                                    }
                                }
                            }
                        }
                        InterfaceC67352kd<VcCreatorInfo> interfaceC67352kd2 = c84654XKg;
                        VcCreatorInfo vcCreatorInfo = new VcCreatorInfo(this.LIZ, this.LIZIZ, this.LIZJ);
                        C3C5.m7constructorimpl(vcCreatorInfo);
                        interfaceC67352kd2.resumeWith(vcCreatorInfo);
                    }
                });
            }
        }
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService
    public final void fetchAudioWatermarkInfo(List<String> ttsEffectIds, List<String> vcEffectIds, InterfaceC88472Yns<? super AudioWatermarkInfo, C76800UCe> callback) {
        o.LJIIIZ(ttsEffectIds, "ttsEffectIds");
        o.LJIIIZ(vcEffectIds, "vcEffectIds");
        o.LJIIIZ(callback, "callback");
        C34K c34k = new C34K();
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = new ArrayList();
        C68322mC c68322mC3 = new C68322mC();
        c68322mC3.element = new ArrayList();
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C137345aE(this, ttsEffectIds, vcEffectIds, c34k, c68322mC2, c68322mC3, c68322mC, callback, null), 3);
    }
}
