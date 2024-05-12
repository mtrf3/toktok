package X;

import kotlin.jvm.internal.AqS0S0010100_9;

/* renamed from: X.Lzr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56091Lzr extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ M1Y LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56091Lzr(long j, C56074Lza c56074Lza, boolean z) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = z;
        this.LJLJI = c56074Lza;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        boolean z = this.LJLILLLLZI;
        c56045Lz7.getClass();
        C76542zS.LIZJ("rd_tiktokec_mall_lynx_create_dur", new AqS0S0010100_9(currentTimeMillis, z, 2));
        C56045Lz7.LJI(c56045Lz7, EnumC56116M0q.STAGE_LYNX_LOAD_SUCCESS.getStage(), System.currentTimeMillis() - C56090Lzq.LIZ, C56090Lzq.LIZJ, 20);
        this.LJLJI.LJJJJJL();
        return C76800UCe.LIZ;
    }
}
