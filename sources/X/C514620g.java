package X;

import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.20g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C514620g extends AbstractC65781Prl implements InterfaceC88473Ynt<String, Boolean, Boolean, String> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C514920j LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514620g(C514920j c514920j, String str) {
        super(3);
        this.LJLIL = str;
        this.LJLILLLLZI = c514920j;
    }

    @Override // X.InterfaceC88473Ynt
    public final String invoke(String str, Boolean bool, Boolean bool2) {
        String string;
        String targetKey = str;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        o.LJIIIZ(targetKey, "targetKey");
        String str2 = this.LJLIL;
        if (booleanValue) {
            return this.LJLILLLLZI.LIZIZ.getString(targetKey, str2);
        }
        if (!booleanValue2) {
            string = super/*X.1mf*/.getString(targetKey, str2);
            return string;
        }
        String LJIIZILJ = this.LJLILLLLZI.LJIIZILJ(targetKey);
        if (!this.LJLILLLLZI.LIZIZ.contains(LJIIZILJ)) {
            return str2;
        }
        String string2 = this.LJLILLLLZI.LIZIZ.getString(LJIIZILJ, this.LJLIL);
        if (string2 == null) {
            return string2;
        }
        String str3 = this.LJLIL;
        C514920j c514920j = this.LJLILLLLZI;
        if (o.LJ(string2, str3)) {
            return string2;
        }
        c514920j.LJIJI(targetKey, string2, new IDqS443S0100000(c514920j, 26));
        return string2;
    }
}
