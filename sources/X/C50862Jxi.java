package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.o;

/* renamed from: X.Jxi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50862Jxi<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = false;
    public final /* synthetic */ DynamicPatch LJLJI;
    public final /* synthetic */ C1HQ<String, Object> LJLJJI;

    public C50862Jxi(boolean z, DynamicPatch dynamicPatch, C1HQ c1hq) {
        this.LJLIL = z;
        this.LJLJI = dynamicPatch;
        this.LJLJJI = c1hq;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        C1HQ it = (C1HQ) obj;
        o.LJIIIZ(it, "it");
        if (!this.LJLIL && this.LJLILLLLZI && C78857UxB.LJJJIL(this.LJLJI.getRawData())) {
            TemplateData LJFF = TemplateData.LJFF(this.LJLJI.getRawData());
            C50859Jxf.LIZJ(LJFF, this.LJLJJI);
            return LJFF;
        }
        return TemplateData.LJ(it);
    }
}
