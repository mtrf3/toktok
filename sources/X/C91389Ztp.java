package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ztp, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91389Ztp<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C91495ZvX LJLILLLLZI;
    public final /* synthetic */ C91391Ztr LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public C91389Ztp(String str, C91495ZvX c91495ZvX, C91391Ztr c91391Ztr, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = c91495ZvX;
        this.LJLJI = c91391Ztr;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String str;
        EnumC91181ZqT enumC91181ZqT;
        String json = (String) obj;
        o.LJIIIZ(json, "json");
        String str2 = this.LJLIL;
        String LJIIIIZZ = this.LJLILLLLZI.LJIIIIZZ();
        if (this.LJLJI.LIZLLL) {
            str = this.LJLJJI;
        } else {
            str = this.LJLILLLLZI.LJLJJL;
        }
        C91495ZvX c91495ZvX = this.LJLILLLLZI;
        boolean z = c91495ZvX.LJLJJLL;
        int type = c91495ZvX.LJLJL.getType();
        if (this.LJLJI.LIZLLL) {
            enumC91181ZqT = EnumC91181ZqT.VOD;
        } else {
            enumC91181ZqT = EnumC91181ZqT.SHUFFLE;
        }
        return C91086Zow.LIZIZ(z, str2, type, LJIIIIZZ, enumC91181ZqT.getType(), str, this.LJLJJL, json);
    }
}
