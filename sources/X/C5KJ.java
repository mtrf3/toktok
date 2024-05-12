package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.5KJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KJ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int[] LJLJJLL;
    public final /* synthetic */ int[] LJLJL;
    public final /* synthetic */ C5KI LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5KJ(String str, C132485Hw c132485Hw, Context context, String str2, String str3, int[] iArr, int[] iArr2, C5KI c5ki) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = c132485Hw;
        this.LJLJI = context;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = iArr;
        this.LJLJL = iArr2;
        this.LJLJLJ = c5ki;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLIL.length() > 0 && C44687HgJ.LIZIZ(this.LJLIL)) {
            H78.LJI("TemplateProducer pre-resize wait -> success");
            this.LJLILLLLZI.invoke(this.LJLIL);
        } else {
            H78.LJI("TemplateProducer pre-resize wait -> fail -> retry");
            Context context = this.LJLJI;
            String inputPath = this.LJLJJI;
            o.LJIIIIZZ(inputPath, "inputPath");
            C145765no.LIZIZ(1080, 1080, context, this.LJLJLJ, inputPath, this.LJLIL, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        }
        return C76800UCe.LIZ;
    }
}
