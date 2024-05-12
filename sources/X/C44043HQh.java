package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.HQh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44043HQh extends AbstractC65781Prl implements InterfaceC88476Ynw<String, String, Long, String, String, String, C76800UCe> {
    public final /* synthetic */ InterfaceC73573Su9<C44048HQm> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C44044HQi LJLJI;
    public final /* synthetic */ C73893SzJ<C43645HAz> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44043HQh(C73433Srt c73433Srt, String str, C44044HQi c44044HQi, C73893SzJ c73893SzJ) {
        super(6);
        this.LJLIL = c73433Srt;
        this.LJLILLLLZI = str;
        this.LJLJI = c44044HQi;
        this.LJLJJI = c73893SzJ;
    }

    @Override // X.InterfaceC88476Ynw
    public final C76800UCe invoke(String str, String str2, Long l, String str3, String str4, String str5) {
        boolean z;
        String str6 = str;
        String str7 = str2;
        long longValue = l.longValue();
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request AutoCut template detail success: templateUrl = ");
        LIZ.append(str6);
        LIZ.append(", md5 = ");
        LIZ.append(str7);
        C134225Oo.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (str6 == null || str6.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str7 == null || str7.length() == 0) {
            C134225Oo.LIZ(LogLevel.LEVEL_ERROR, C0ON.LIZJ("Request AutoCut template detail failure: invalid data: templateUrl = ", str6, ", md5 = ", str7));
            InterfaceC73573Su9<C44048HQm> interfaceC73573Su9 = this.LJLIL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("templateId = ");
            YE1.LIZLLL(LIZ2, this.LJLILLLLZI, ", templateUrl = ", str6, ", md5 = ");
            LIZ2.append(str7);
            interfaceC73573Su9.onNext(new C44048HQm(this.LJLILLLLZI, 3, (NLETemplateModel) null, longValue, str6, str8, str9, str10, (String) null, 0, (AVMusic) null, (String) null, 106, X1D.LIZIZ(LIZ2), 7692));
            this.LJLIL.onComplete();
        } else if (this.LJLJI.LIZ == null) {
            C134225Oo.LIZ(LogLevel.LEVEL_ERROR, "Request AutoCut template detail failure: invalid activity");
            this.LJLIL.onNext(new C44048HQm(this.LJLILLLLZI, 3, (NLETemplateModel) null, longValue, str6, str8, str9, str10, (String) null, 0, (AVMusic) null, (String) null, 107, (String) null, 24076));
            this.LJLIL.onComplete();
        } else {
            this.LJLJJI.onNext(new C43645HAz("stage_fetch_template", 100.0f, null, 12));
            this.LJLJJI.onNext(new C43645HAz("stage_download_template", 0.0f, null, 12));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("start download template info: templateId = ");
            YE1.LIZLLL(LIZ3, this.LJLILLLLZI, ", templateUrl = ", str6, ", md5 = ");
            LIZ3.append(str7);
            C134225Oo.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ3));
            H82 h82 = H89.LIZ;
            if (h82 != null) {
                C44044HQi c44044HQi = this.LJLJI;
                Context context = c44044HQi.LIZ;
                int i = c44044HQi.LIZIZ;
                String str11 = this.LJLILLLLZI;
                h82.LIZ(context, true, i, str11, str6, str7, new C44047HQl(this.LJLJJI, this.LJLIL, str11, str6, str7, longValue, str8, str9, str10));
            }
        }
        return C76800UCe.LIZ;
    }
}
