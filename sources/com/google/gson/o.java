package com.google.gson;

import X.C38302F1m;
import X.C65385PlN;
import X.EnumC65386PlO;
import X.X1D;
import java.io.IOException;
import java.io.StringReader;

/* loaded from: classes12.dex */
public final class o {
    public static j LIZ(String str) {
        try {
            C65385PlN c65385PlN = new C65385PlN(new StringReader(str));
            j LIZIZ = LIZIZ(c65385PlN);
            LIZIZ.getClass();
            if (!(LIZIZ instanceof l) && c65385PlN.LJJIJIL() != EnumC65386PlO.END_DOCUMENT) {
                throw new s("Did not consume the entire document.");
            }
            return LIZIZ;
        } catch (C38302F1m e) {
            throw new s(e);
        } catch (IOException e2) {
            throw new k(e2);
        } catch (NumberFormatException e3) {
            throw new s(e3);
        }
    }

    public static j LIZIZ(C65385PlN c65385PlN) {
        boolean z = c65385PlN.LJLILLLLZI;
        c65385PlN.LJLILLLLZI = true;
        try {
            try {
                try {
                    return com.google.gson.internal.p.LIZ(c65385PlN);
                } catch (StackOverflowError e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Failed parsing JSON source: ");
                    LIZ.append(c65385PlN);
                    LIZ.append(" to Json");
                    throw new n(X1D.LIZIZ(LIZ), e);
                }
            } catch (OutOfMemoryError e2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Failed parsing JSON source: ");
                LIZ2.append(c65385PlN);
                LIZ2.append(" to Json");
                throw new n(X1D.LIZIZ(LIZ2), e2);
            }
        } finally {
            c65385PlN.LJLILLLLZI = z;
        }
    }
}
