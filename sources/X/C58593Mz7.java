package X;

import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.image.AutoSizeImage;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomSparkReportConfig;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomFlattenUIImage;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomUIImage;
import java.util.LinkedHashMap;

/* renamed from: X.Mz7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58593Mz7 extends C40197Fq5 {
    public final /* synthetic */ String LIZLLL;

    @Override // X.C40197Fq5
    public final ShadowNode LIZJ() {
        return new AutoSizeImage();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58593Mz7(String str) {
        super("image", true);
        this.LIZLLL = str;
    }

    @Override // X.C40197Fq5
    public final LynxFlattenUI LIZIZ(VNU vnu) {
        EcomSparkReportConfig.LIZ.getClass();
        return new EcomFlattenUIImage(vnu, (String) ((LinkedHashMap) EcomSparkReportConfig.LIZJ).get(this.LIZLLL));
    }

    @Override // X.C40197Fq5
    public final LynxUI<?> LIZLLL(VNU vnu) {
        EcomSparkReportConfig.LIZ.getClass();
        return new EcomUIImage(vnu, (String) ((LinkedHashMap) EcomSparkReportConfig.LIZJ).get(this.LIZLLL));
    }
}
