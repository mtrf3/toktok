package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J8D extends J8E {
    public final HashMap<String, String> LJLILLLLZI;

    @Override // X.J8E
    public HashMap<String, String> buildParams() {
        return this.LJLILLLLZI;
    }

    public final HashMap<String, String> getInputParam() {
        return this.LJLILLLLZI;
    }

    public J8D(HashMap<String, String> inputParam) {
        o.LJIIIZ(inputParam, "inputParam");
        this.LJLILLLLZI = inputParam;
    }
}
