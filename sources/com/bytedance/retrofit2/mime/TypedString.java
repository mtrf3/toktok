package com.bytedance.retrofit2.mime;

import X.X1D;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public class TypedString extends TypedByteArray {
    @Override // com.bytedance.retrofit2.mime.TypedByteArray
    public String toString() {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TypedString[");
            LIZ.append(new String(getBytes(), "UTF-8"));
            LIZ.append("]");
            return X1D.LIZIZ(LIZ);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("Must be able to decode UTF-8");
        }
    }

    public TypedString(String str) {
        super("text/plain; charset=UTF-8", convertToBytes(str), new String[0]);
    }

    public static byte[] convertToBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
