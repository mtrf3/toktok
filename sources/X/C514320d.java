package X;

import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.20d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C514320d extends AbstractC65781Prl implements InterfaceC88473Ynt<String, Boolean, Boolean, Boolean> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C514920j LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514320d(C514920j c514920j, boolean z) {
        super(3);
        this.LJLIL = z;
        this.LJLILLLLZI = c514920j;
    }

    @Override // X.InterfaceC88473Ynt
    public final Boolean invoke(String str, Boolean bool, Boolean bool2) {
        String targetKey = str;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        o.LJIIIZ(targetKey, "targetKey");
        boolean z = this.LJLIL;
        if (booleanValue) {
            z = this.LJLILLLLZI.LIZIZ.getBoolean(targetKey, z);
        } else if (!booleanValue2) {
            z = super/*X.1mf*/.getBoolean(targetKey, z);
        } else {
            String LJIIZILJ = this.LJLILLLLZI.LJIIZILJ(targetKey);
            if (this.LJLILLLLZI.LIZIZ.contains(LJIIZILJ) && (z = this.LJLILLLLZI.LIZIZ.getBoolean(LJIIZILJ, this.LJLIL)) != this.LJLIL) {
                this.LJLILLLLZI.LJIJI(targetKey, Boolean.valueOf(z), new IDqS443S0100000(this.LJLILLLLZI, 22));
            }
        }
        return Boolean.valueOf(z);
    }
}
