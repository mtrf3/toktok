package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.HQk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44046HQk implements InterfaceC84897XTp {
    public final /* synthetic */ C73893SzJ<C43645HAz> LIZ;
    public final /* synthetic */ InterfaceC73573Su9<C44048HQm> LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ AVMusic LIZLLL;

    @Override // X.InterfaceC84897XTp
    public final void onStart() {
    }

    @Override // X.InterfaceC84897XTp
    public final void onProgress(int i) {
        this.LIZ.onNext(new C43645HAz("stage_download_music", i, null, 12));
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        C134225Oo.LIZ(LogLevel.LEVEL_INFO, "downloadMusic success");
        this.LIZ.onNext(new C43645HAz("stage_download_music", 100.0f, null, 12));
        this.LIZIZ.onNext(new C44048HQm((String) null, 0, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, this.LIZJ, 2, this.LIZLLL, musicFile, 0, (String) null, 25087));
        this.LIZIZ.onComplete();
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZIZ(Integer num, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("downloadMusic failed: errCode = ");
        LIZ.append(num);
        LIZ.append(", errMsg = ");
        LIZ.append(str);
        C134225Oo.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        InterfaceC73573Su9<C44048HQm> interfaceC73573Su9 = this.LIZIZ;
        String str2 = this.LIZJ;
        interfaceC73573Su9.onNext(new C44048HQm((String) null, 0, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, str2, 3, this.LIZLLL, (String) null, 105, str2, 4607));
        this.LIZIZ.onComplete();
    }

    public C44046HQk(C73893SzJ<C43645HAz> c73893SzJ, InterfaceC73573Su9<C44048HQm> interfaceC73573Su9, String str, AVMusic aVMusic) {
        this.LIZ = c73893SzJ;
        this.LIZIZ = interfaceC73573Su9;
        this.LIZJ = str;
        this.LIZLLL = aVMusic;
    }
}
