package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model.MusicRecognitionResult;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model.SongInfo;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.MusicSearchResult;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.VoiceSearchResponse;
import com.ss.android.ugc.aweme.service.ISearchDebugService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aeU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94282aeU implements SpeechEngine.SpeechListener {
    public SpeechEngine LIZ;
    public InterfaceC93851aXX LIZIZ;

    public final void LIZ(int i) {
        SpeechEngine speechEngine = this.LIZ;
        if (speechEngine != null) {
            speechEngine.sendDirective(2001, "", C93757aW1.LIZ(i));
        }
        SpeechEngine speechEngine2 = this.LIZ;
        if (speechEngine2 != null) {
            speechEngine2.setListener(null);
            speechEngine2.destroyEngine();
        }
        this.LIZ = null;
        this.LIZIZ = null;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine.SpeechListener
    public final void onSpeechMessage(int i, byte[] bArr, int i2) {
        String str;
        InterfaceC93851aXX interfaceC93851aXX;
        String str2;
        if (bArr != null) {
            new String(bArr, PVC.LIZ);
        }
        if (o.LJ(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE)) {
            if (bArr != null) {
                str2 = new String(bArr, PVC.LIZ);
            } else {
                str2 = null;
            }
            ((ISearchDebugService) ServiceManager.get().getService(ISearchDebugService.class)).LIZIZ(String.valueOf(str2));
        }
        if (i != 1003) {
            if (i != 1204) {
                if (i != 1801 || (interfaceC93851aXX = this.LIZIZ) == null) {
                    return;
                }
                interfaceC93851aXX.cp0();
                return;
            }
            if (bArr == null) {
                InterfaceC93851aXX interfaceC93851aXX2 = this.LIZIZ;
                if (interfaceC93851aXX2 != null) {
                    interfaceC93851aXX2.onError();
                }
            } else {
                try {
                    MusicSearchResult musicSearchResult = ((VoiceSearchResponse) GsonHolder.LIZLLL().LIZ().LJI(new String(bArr, PVC.LIZ), VoiceSearchResponse.class)).musicResult;
                    if (musicSearchResult != null && (str = musicSearchResult.songResult) != null) {
                        SongInfo songInfo = (SongInfo) ORZ.LJLLLLLL(0, ((MusicRecognitionResult) GsonHolder.LIZLLL().LIZ().LJI(str, MusicRecognitionResult.class)).songInfo);
                        if (songInfo != null) {
                            InterfaceC93851aXX interfaceC93851aXX3 = this.LIZIZ;
                            if (interfaceC93851aXX3 != null) {
                                interfaceC93851aXX3.m50(songInfo.songId, songInfo.songName, songInfo.artistName);
                            }
                        } else {
                            InterfaceC93851aXX interfaceC93851aXX4 = this.LIZIZ;
                            if (interfaceC93851aXX4 != null) {
                                interfaceC93851aXX4.v();
                            }
                        }
                    }
                } catch (Exception unused) {
                    InterfaceC93851aXX interfaceC93851aXX5 = this.LIZIZ;
                    if (interfaceC93851aXX5 != null) {
                        interfaceC93851aXX5.onError();
                    }
                }
            }
            C2VQ.LIZIZ(new IDqS423S0100000_42(this, 127), 0L);
            return;
        }
        InterfaceC93851aXX interfaceC93851aXX6 = this.LIZIZ;
        if (interfaceC93851aXX6 != null) {
            interfaceC93851aXX6.onError();
        }
        C2VQ.LIZIZ(new IDqS423S0100000_42(this, 128), 0L);
    }
}
