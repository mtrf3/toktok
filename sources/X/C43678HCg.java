package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS2S0300200_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HCg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43678HCg implements HD7 {
    public final /* synthetic */ HD4 LIZ;
    public final /* synthetic */ ShortVideoContext LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;
    public final /* synthetic */ I4X LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJ;
    public final /* synthetic */ long LJFF;

    @Override // X.HD7
    public final void LIZIZ(String localPath, List<String> list) {
        InterfaceC88472Yns interfaceC88472Yns;
        o.LJIIIZ(localPath, "localPath");
        this.LIZ.LJI(this.LIZIZ);
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZJ.invoke();
        I4X i4x = this.LIZLLL;
        if (i4x != null && (interfaceC88472Yns = (InterfaceC88472Yns) i4x.LJLJI) != null && ((Boolean) interfaceC88472Yns.invoke(localPath)).booleanValue()) {
            this.LIZ.LJ();
            this.LJ.invoke(Boolean.TRUE);
        } else {
            H9T.LJII(this.LIZ.LIZJ(localPath, list, new ArrayList(), true, new AqS2S0300200_7(this.LIZ, (HD4) this.LIZIZ, (ShortVideoContext) this.LJFF, currentTimeMillis, (long) this.LJ, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 0)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43678HCg(HD4 hd4, ShortVideoContext shortVideoContext, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, I4X i4x, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, long j) {
        this.LIZ = hd4;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = interfaceC65784Pro;
        this.LIZLLL = i4x;
        this.LJ = interfaceC88472Yns;
        this.LJFF = j;
    }
}
