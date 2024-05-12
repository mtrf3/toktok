package X;

import Y.AfS54S0100000_2;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.audio.tts.base.model.TTSAudioParam;
import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5c5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138495c5 extends AbstractC29891Fh<InterfaceC138185ba> implements InterfaceC138185ba, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC138605cG LJLILLLLZI;
    public final C138595cF LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC138185ba LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public long LJLJLLL;

    static {
        TBT tbt = new TBT(C138495c5.class, "textStickerNewApi", "getTextStickerNewApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextStickerNewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt};
    }

    private final TextToSpeechApi LJJLI() {
        return (TextToSpeechApi) this.LJLJLJ.getValue();
    }

    private final C73318Sq2 LJJLIIIJILLIZJL() {
        return (C73318Sq2) this.LJLJL.getValue();
    }

    private final InterfaceC139045cy LJJLIIIJJI() {
        return (InterfaceC139045cy) this.LJLJJI.LIZ(this, LJLL[0]);
    }

    @Override // X.InterfaceC138185ba
    public void LJJJJL() {
        this.LJLILLLLZI.LJJJJL();
    }

    public final CreativeInfo LJJLIIIIJ() {
        return (CreativeInfo) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC138185ba
    public void k3() {
        this.LJLILLLLZI.k3();
    }

    @Override // X.InterfaceC138185ba
    public void i0() {
        LJJLIIIJILLIZJL().LIZLLL();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC138185ba getApiComponent() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LJJLIIIJLLLLLLLZ(InterfaceC138565cC<TTSAudioParam, TextStickerData> interfaceC138565cC) {
        C138655cL aw;
        InterfaceC139045cy LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null && (aw = LJJLIIIJJI.aw()) != null) {
            TextStickerData data = interfaceC138565cC.LIZ();
            o.LJIIIZ(data, "data");
            aw.LJIILJJIL(C137045Zk.LIZJ(data, true, null));
        }
    }

    @Override // X.InterfaceC138185ba
    public void xn(InterfaceC138565cC<TTSAudioParam, TextStickerData> dataProxy) {
        o.LJIIIZ(dataProxy, "dataProxy");
        TTSAudioParam proxy = dataProxy.getProxy();
        if (proxy.nleUuid.length() > 0) {
            this.LJLILLLLZI.m3(proxy.nleUuid);
        }
        if (proxy.audioTrackFilePath != null) {
            C122004qa c122004qa = new C122004qa(EnumC122254qz.TEXT_SPEAK);
            c122004qa.LIZ = proxy.audioTrackFilePath;
            c122004qa.LIZJ = 0L;
            c122004qa.LIZLLL = proxy.audioTrackDuration;
            c122004qa.LJ = proxy.startTime;
            c122004qa.LJFF = -2L;
            c122004qa.LJI = C138585cE.LIZ * 1.0f;
            this.LJLILLLLZI.l3(c122004qa);
            String str = c122004qa.LIZIZ;
            if (str == null) {
                str = "";
            }
            proxy.nleUuid = str;
            proxy.hasReadTextAudio = true;
        }
        dataProxy.LIZIZ(proxy);
        LJJLIIIJLLLLLLLZ(dataProxy);
    }

    public C138495c5(C82622Wbi diContainer, InterfaceC138605cG editorAbility, C138595cF initParam) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(editorAbility, "editorAbility");
        o.LJIIIZ(initParam, "initParam");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = editorAbility;
        this.LJLJI = initParam;
        this.LJLJJI = UCI.LJII(getDiContainer(), InterfaceC139045cy.class, null);
        this.LJLJJL = this;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 334));
        this.LJLJL = C221108m2.LIZIZ(C138555cB.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(C138545cA.LJLIL);
    }

    @Override // X.InterfaceC138185ba
    public void Rz(final InterfaceC138565cC<TTSAudioParam, TextStickerData> dataProxy, final String text, String str, final InterfaceC138295bl callback) {
        o.LJIIIZ(dataProxy, "dataProxy");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(callback, "callback");
        if (!C60903NvH.LJIIJJI().getAccountService().isLogin() || C1DG.LJIIIIZZ()) {
            return;
        }
        this.LJLJLLL = System.currentTimeMillis();
        final C138115bT c138115bT = new C138115bT();
        c138115bT.LJ();
        c138115bT.LIZ(LJJLIIIIJ().getCreationId());
        c138115bT.LIZ.put("feature_name", "apply_tts_effect");
        c138115bT.LJFF("tts_phrase1");
        int LIZ = C138025bK.LIZ();
        TextToSpeechApi.Api api = (TextToSpeechApi.Api) LJJLI().LIZ.getValue();
        LJJLI().getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("text_speaker", str);
        }
        C48153Iv7 c48153Iv7 = new C48153Iv7();
        c48153Iv7.LIZLLL = 30000L;
        c48153Iv7.LIZJ = 30000L;
        c48153Iv7.LJ = 30000L;
        LJJLIIIJILLIZJL().LIZ(api.requestAudio(text, LIZ, hashMap, c48153Iv7).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.5bU
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                TextToSpeechApi.FetchTextAudioResponse fetchTextAudioResponse = (TextToSpeechApi.FetchTextAudioResponse) obj;
                C138115bT c138115bT2 = C138115bT.this;
                c138115bT2.LIZ.put("apply_duration", System.currentTimeMillis() - this.LJLJLLL);
                if (fetchTextAudioResponse.status_code == 0 && fetchTextAudioResponse.getData() != null) {
                    String audio = fetchTextAudioResponse.getData().getAudio();
                    if (audio != null) {
                        C138495c5 c138495c5 = this;
                        InterfaceC138565cC<TTSAudioParam, TextStickerData> interfaceC138565cC = dataProxy;
                        String str2 = text;
                        InterfaceC138295bl interfaceC138295bl = callback;
                        if (audio.length() > 0) {
                            c138495c5.LJJLIIIJJIZ(c138495c5.LJJLIIIIJ(), interfaceC138565cC, str2, audio, interfaceC138295bl);
                        }
                    }
                } else if (fetchTextAudioResponse.status_code != 0) {
                    callback.LIZ(fetchTextAudioResponse.message);
                    C138115bT.this.LIZIZ(C1DH.LJJJIL(new C138355br().LIZ(fetchTextAudioResponse.status_code)));
                    C138115bT c138115bT3 = C138115bT.this;
                    String str3 = fetchTextAudioResponse.message;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c138115bT3.LIZ.put("error_msg", str3);
                }
                C138115bT.this.LIZLLL();
            }
        }, new AfS54S0100000_2(callback, 2)));
    }

    public final void LJJLIIIJJIZ(final CreativeInfo creativeInfo, final InterfaceC138565cC<TTSAudioParam, TextStickerData> interfaceC138565cC, final String str, final String str2, final InterfaceC138295bl interfaceC138295bl) {
        final TTSAudioParam proxy = interfaceC138565cC.getProxy();
        LJJLIIIJILLIZJL().LIZ(AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.5c6
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<TTSAudioParam> interfaceC73573Su9) {
                File LIZ = C167496hl.LIZ(CreativeInfo.this, str2);
                if (LIZ != null && LIZ.exists()) {
                    int LIZIZ = HOH.LIZIZ(4, LIZ.getAbsolutePath());
                    TTSAudioParam tTSAudioParam = proxy;
                    tTSAudioParam.audioTrackDuration = LIZIZ;
                    tTSAudioParam.audioTrackFilePath = LIZ.getAbsolutePath();
                    List<String> list = proxy.audioPathList;
                    String absolutePath = LIZ.getAbsolutePath();
                    o.LJIIIIZZ(absolutePath, "file.absolutePath");
                    list.add(absolutePath);
                    proxy.audioText = str;
                    if (!interfaceC73573Su9.isDisposed()) {
                        interfaceC73573Su9.onNext(proxy);
                        interfaceC73573Su9.onComplete();
                        return;
                    }
                    return;
                }
                interfaceC73573Su9.tryOnError(new IllegalStateException("File not exists"));
            }
        }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new InterfaceC64592gB() { // from class: X.5bm
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                interfaceC138565cC.LIZIZ(proxy);
                this.LJJLIIIJLLLLLLLZ(interfaceC138565cC);
                interfaceC138295bl.LIZIZ(interfaceC138565cC);
            }
        }));
    }
}
