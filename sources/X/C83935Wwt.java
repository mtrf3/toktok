package X;

import com.ss.android.ugc.asve.context.PreviewSize;
import kotlin.jvm.internal.o;

/* renamed from: X.Wwt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83935Wwt extends F9E {
    public final Integer LJLIL;
    public final PreviewSize LJLILLLLZI;
    public final PreviewSize LJLJI;
    public final PreviewSize LJLJJI;
    public final C5T3 LJLJJL;
    public final EnumC84107Wzf LJLJJLL;
    public final Integer LJLJL;
    public final Integer LJLJLJ;
    public final Boolean LJLJLLL;
    public final Float LJLL;
    public final Integer LJLLI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI};
    }

    public C83935Wwt(Integer num, PreviewSize outputSize, PreviewSize previewSize, PreviewSize renderSize, C5T3 c5t3, EnumC84107Wzf fitMode, Integer num2, Integer num3, Boolean bool, Float f, Integer num4) {
        o.LJIIIZ(outputSize, "outputSize");
        o.LJIIIZ(previewSize, "previewSize");
        o.LJIIIZ(renderSize, "renderSize");
        o.LJIIIZ(fitMode, "fitMode");
        this.LJLIL = num;
        this.LJLILLLLZI = outputSize;
        this.LJLJI = previewSize;
        this.LJLJJI = renderSize;
        this.LJLJJL = c5t3;
        this.LJLJJLL = fitMode;
        this.LJLJL = num2;
        this.LJLJLJ = num3;
        this.LJLJLLL = bool;
        this.LJLL = f;
        this.LJLLI = num4;
    }
}
