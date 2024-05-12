package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.HQl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44047HQl implements InterfaceC172786qI {
    public final /* synthetic */ C73893SzJ<C43645HAz> LIZ;
    public final /* synthetic */ InterfaceC73573Su9<C44048HQm> LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ long LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ String LJII;
    public final /* synthetic */ String LJIIIIZZ;

    @Override // X.InterfaceC172786qI
    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
    }

    @Override // X.InterfaceC172786qI
    public final void onProgress(float f) {
        this.LIZ.onNext(new C43645HAz("stage_download_template", f * 100, null, 12));
    }

    @Override // X.InterfaceC172786qI
    public final void onSuccess(NLETemplateModel nLETemplateModel) {
        if (nLETemplateModel == null) {
            InterfaceC73573Su9<C44048HQm> interfaceC73573Su9 = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("templateId = ");
            LIZ.append(this.LIZJ);
            LIZ.append(", templateUrl = ");
            LIZ.append(this.LIZLLL);
            LIZ.append(", md5 = ");
            LIZ.append(this.LJ);
            interfaceC73573Su9.onNext(new C44048HQm(this.LIZJ, 3, (NLETemplateModel) null, this.LJFF, this.LIZLLL, this.LJI, this.LJII, this.LJIIIIZZ, (String) null, 0, (AVMusic) null, (String) null, 108, X1D.LIZIZ(LIZ), 7692));
            this.LIZIZ.onComplete();
            return;
        }
        this.LIZ.onNext(new C43645HAz("stage_download_template", 100.0f, nLETemplateModel, 8));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Download template success: ");
        LIZ2.append(nLETemplateModel);
        C134225Oo.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
        this.LIZIZ.onNext(new C44048HQm(this.LIZJ, 2, nLETemplateModel, this.LJFF, this.LIZLLL, this.LJI, this.LJII, this.LJIIIIZZ, (String) null, 0, (AVMusic) null, (String) null, 0, (String) null, 32264));
        this.LIZIZ.onComplete();
    }

    @Override // X.InterfaceC172786qI
    public final void onError(int i, String str) {
        this.LIZIZ.onNext(new C44048HQm(this.LIZJ, 3, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (AVMusic) null, (String) null, i, str, 8188));
        this.LIZIZ.onComplete();
    }

    public C44047HQl(C73893SzJ<C43645HAz> c73893SzJ, InterfaceC73573Su9<C44048HQm> interfaceC73573Su9, String str, String str2, String str3, long j, String str4, String str5, String str6) {
        this.LIZ = c73893SzJ;
        this.LIZIZ = interfaceC73573Su9;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = j;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
    }
}
