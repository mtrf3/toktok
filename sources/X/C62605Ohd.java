package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ohd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62605Ohd<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public C62605Ohd(String str, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        EnumC62617Ohp scene = C62619Ohr.LIZ(this.LJLIL, this.LJLILLLLZI);
        String platformId = this.LJLJI;
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(platformId, "platformId");
        return E7M.LIZ.getShareLinkShortenUel(scene.getNum(), platformId, it);
    }
}
