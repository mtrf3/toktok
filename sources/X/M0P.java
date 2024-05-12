package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M0P extends AbstractC65781Prl implements InterfaceC88473Ynt<String, java.util.Map<String, ? extends Object>, Boolean, C76800UCe> {
    public final /* synthetic */ M1Y LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0P(long j, C56074Lza c56074Lza, boolean z) {
        super(3);
        this.LJLIL = c56074Lza;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, java.util.Map<String, ? extends Object> map, Boolean bool) {
        bool.booleanValue();
        o.LJIIIZ(map, "<anonymous parameter 1>");
        C56045Lz7.LJI(C56045Lz7.LIZ, EnumC56116M0q.STAGE_LYNX_FIRST_SCREEN.getStage(), System.currentTimeMillis() - C56090Lzq.LIZ, C56090Lzq.LIZJ, 20);
        this.LJLIL.LJJIIJZLJL(this.LJLJI, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
