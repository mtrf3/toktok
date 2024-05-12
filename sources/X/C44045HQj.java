package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.HQj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44045HQj implements InterfaceC84907XTz {
    public final /* synthetic */ InterfaceC73573Su9<C44048HQm> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C44044HQi LIZJ;
    public final /* synthetic */ C73893SzJ<C43645HAz> LIZLLL;

    @Override // X.InterfaceC84907XTz
    public final void LIZ(Exception exc) {
        String str;
        C134225Oo.LIZ(LogLevel.LEVEL_INFO, "start requestMusic: onLoadMusicFail");
        InterfaceC73573Su9<C44048HQm> interfaceC73573Su9 = this.LIZ;
        String str2 = this.LIZIZ;
        if (exc != null) {
            str = C78963Uyt.LJIJJ(exc);
        } else {
            str = null;
        }
        interfaceC73573Su9.onNext(new C44048HQm((String) null, 0, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, str2, 3, (AVMusic) null, (String) null, 102, str, 6655));
        this.LIZ.onComplete();
    }

    @Override // X.InterfaceC84907XTz
    public final void LIZIZ(AVMusic aVMusic) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start requestMusic: onLoadMusicSuccess: ");
        if (aVMusic != null) {
            str = aVMusic.getMusicId();
        } else {
            str = null;
        }
        LIZ.append(str);
        C134225Oo.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (aVMusic == null) {
            InterfaceC73573Su9<C44048HQm> interfaceC73573Su9 = this.LIZ;
            String str2 = this.LIZIZ;
            interfaceC73573Su9.onNext(new C44048HQm((String) null, 0, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, str2, 3, (AVMusic) null, (String) null, 103, str2, 6655));
            this.LIZ.onComplete();
            return;
        }
        if (this.LIZJ.LIZ == null) {
            this.LIZ.onNext(new C44048HQm((String) null, 0, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, this.LIZIZ, 3, (AVMusic) null, (String) null, 104, (String) null, 23039));
            this.LIZ.onComplete();
        } else {
            this.LIZLLL.onNext(new C43645HAz("stage_fetch_music", 100.0f, null, 12));
            this.LIZLLL.onNext(new C43645HAz("stage_download_music", 0.0f, null, 12));
            C134225Oo.LIZ(LogLevel.LEVEL_INFO, "start downloadMusic");
            C78934UyQ.LJLIL.getMusicService().LJIILL(this.LIZJ.LIZ, aVMusic, 0, false, new C44046HQk(this.LIZLLL, this.LIZ, this.LIZIZ, aVMusic));
        }
    }

    public C44045HQj(C73433Srt c73433Srt, String str, C44044HQi c44044HQi, C73893SzJ c73893SzJ) {
        this.LIZ = c73433Srt;
        this.LIZIZ = str;
        this.LIZJ = c44044HQi;
        this.LIZLLL = c73893SzJ;
    }
}
