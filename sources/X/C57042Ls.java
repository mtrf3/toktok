package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57042Ls {
    public final String LIZ;
    public final InterfaceC65784Pro<String> LIZIZ;
    public Boolean LIZJ;
    public boolean LIZLLL = true;

    public final void LIZJ() {
        if (this.LIZLLL) {
            this.LIZLLL = false;
            InterfaceC65784Pro<String> interfaceC65784Pro = this.LIZIZ;
            if (interfaceC65784Pro != null && interfaceC65784Pro.invoke() != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[CreativeConditionBuilder#");
                LIZ.append(this.LIZ);
                LIZ.append(']');
                X1D.LIZIZ(LIZ);
            }
        }
    }

    public static boolean LIZIZ(C57042Ls c57042Ls) {
        Boolean bool = c57042Ls.LIZJ;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("final evaluated result: ");
            LIZ.append(booleanValue);
            X1D.LIZIZ(LIZ);
            c57042Ls.LIZJ();
            c57042Ls.LIZJ();
            return bool.booleanValue();
        }
        "plz call ConditionBuilder#or or ConditionBuilder#and before call build() method".toString();
        throw new IllegalArgumentException("plz call ConditionBuilder#or or ConditionBuilder#and before call build() method");
    }

    public C57042Ls(String str, InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LIZ = str;
        this.LIZIZ = interfaceC65784Pro;
    }

    public final void LIZ(String tag, InterfaceC65784Pro valueProvider) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(valueProvider, "valueProvider");
        if (this.LIZJ == null) {
            this.LIZJ = Boolean.TRUE;
        }
        boolean booleanValue = ((Boolean) valueProvider.invoke()).booleanValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(tag);
        LIZ.append(": ");
        LIZ.append(booleanValue);
        X1D.LIZIZ(LIZ);
        LIZJ();
        Boolean bool = this.LIZJ;
        if (bool != null) {
            this.LIZJ = Boolean.valueOf(bool.booleanValue() & booleanValue);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
