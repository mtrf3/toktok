package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114744es extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC114804ey, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C114744es(int i, int i2, long j, java.util.Map map, boolean z) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = map;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC114804ey interfaceC114804ey) {
        InterfaceC114804ey it = interfaceC114804ey;
        o.LJIIIZ(it, "it");
        String LJFF = C63312Ot2.LJFF(this.LJLIL);
        it.LIZJ(this.LJLILLLLZI, this.LJLJJI, LJFF, this.LJLJJL, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
