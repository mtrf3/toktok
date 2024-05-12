package X;

import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.20f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C514520f extends AbstractC65781Prl implements InterfaceC88473Ynt<String, Boolean, Boolean, Long> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C514920j LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514520f(long j, C514920j c514920j) {
        super(3);
        this.LJLIL = j;
        this.LJLILLLLZI = c514920j;
    }

    @Override // X.InterfaceC88473Ynt
    public final Long invoke(String str, Boolean bool, Boolean bool2) {
        String targetKey = str;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        o.LJIIIZ(targetKey, "targetKey");
        long j = this.LJLIL;
        if (booleanValue) {
            j = this.LJLILLLLZI.LIZIZ.getLong(targetKey, j);
        } else if (!booleanValue2) {
            j = super/*X.1mf*/.getLong(targetKey, j);
        } else {
            String LJIIZILJ = this.LJLILLLLZI.LJIIZILJ(targetKey);
            if (this.LJLILLLLZI.LIZIZ.contains(LJIIZILJ)) {
                j = this.LJLILLLLZI.LIZIZ.getLong(LJIIZILJ, this.LJLIL);
                if (j != this.LJLIL) {
                    this.LJLILLLLZI.LJIJI(targetKey, Long.valueOf(j), new IDqS443S0100000(this.LJLILLLLZI, 25));
                }
            }
        }
        return Long.valueOf(j);
    }
}
