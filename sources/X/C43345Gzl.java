package X;

import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Gzl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43345Gzl extends AbstractC65781Prl implements InterfaceC88471Ynr<ImageSynthesisResult, Integer, C76800UCe> {
    public final /* synthetic */ C43344Gzk LJLIL;
    public final /* synthetic */ C56K LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ InterfaceC43351Gzr LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43345Gzl(C43344Gzk c43344Gzk, C56K c56k, float f, C87618Ya6 c87618Ya6) {
        super(2);
        this.LJLIL = c43344Gzk;
        this.LJLILLLLZI = c56k;
        this.LJLJI = f;
        this.LJLJJI = c87618Ya6;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(ImageSynthesisResult imageSynthesisResult, Integer num) {
        num.intValue();
        o.LJIIIZ(imageSynthesisResult, "<anonymous parameter 0>");
        if (!this.LJLIL.LJIILIIL) {
            C56K c56k = this.LJLILLLLZI;
            float f = c56k.element + this.LJLJI;
            c56k.element = f;
            this.LJLJJI.LIZJ(new C41855Gbj(f / 100.0f), EnumC43531H6p.OUTER);
        }
        return C76800UCe.LIZ;
    }
}
