package X;

import fjb.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.utils.VideoModeUtils$resizeBitmapForVideoMode$1$1", f = "VideoModeUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Gfo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42108Gfo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ OSZ<Integer, Integer> LJLJJL;
    public final /* synthetic */ ConcurrentHashMap<String, Integer> LJLJJLL;
    public final /* synthetic */ ConcurrentHashMap<String, String> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42108Gfo(String str, int i, String str2, int i2, OSZ<Integer, Integer> osz, ConcurrentHashMap<String, Integer> concurrentHashMap, ConcurrentHashMap<String, String> concurrentHashMap2, InterfaceC67352kd<? super C42108Gfo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = str2;
        this.LJLJJI = i2;
        this.LJLJJL = osz;
        this.LJLJJLL = concurrentHashMap;
        this.LJLJL = concurrentHashMap2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42108Gfo(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(C43075GvP.LIZ(".bmp"));
        String LIZIZ = X1D.LIZIZ(LIZ);
        String path = this.LJLJI;
        o.LJIIIIZZ(path, "path");
        String LJ = C42111Gfr.LJ(C42111Gfr.LIZ(this.LJLJJI, path, LIZIZ, this.LJLJJL), this.LJLJI, LIZIZ);
        if (LJ == null) {
            ConcurrentHashMap<String, Integer> concurrentHashMap = this.LJLJJLL;
            String path2 = this.LJLJI;
            o.LJIIIIZZ(path2, "path");
            concurrentHashMap.put(path2, new Integer(this.LJLILLLLZI));
        } else {
            ConcurrentHashMap<String, String> concurrentHashMap2 = this.LJLJL;
            String path3 = this.LJLJI;
            o.LJIIIIZZ(path3, "path");
            concurrentHashMap2.put(path3, LJ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
