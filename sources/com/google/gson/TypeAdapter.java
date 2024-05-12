package com.google.gson;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes12.dex */
public abstract class TypeAdapter<T> {
    public abstract T read(C65385PlN c65385PlN);

    public abstract void write(C65403Plf c65403Plf, T t);

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public final T read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                return (T) TypeAdapter.this.read(c65385PlN);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, T t) {
                if (t == null) {
                    c65403Plf.LJIIJJI();
                } else {
                    TypeAdapter.this.write(c65403Plf, t);
                }
            }
        };
    }

    public final T fromJson(Reader reader) {
        return read(new C65385PlN(reader));
    }

    public final T fromJsonTree(j jVar) {
        try {
            return read(new com.google.gson.internal.bind.a(jVar));
        } catch (IOException e) {
            throw new k(e);
        }
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final j toJsonTree(T t) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            write(bVar, t);
            return bVar.LJJIIJZLJL();
        } catch (IOException e) {
            throw new k(e);
        }
    }

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final void toJson(Writer writer, T t) {
        write(new C65403Plf(writer), t);
    }
}
