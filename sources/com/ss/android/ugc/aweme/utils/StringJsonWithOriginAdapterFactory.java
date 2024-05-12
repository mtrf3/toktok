package com.ss.android.ugc.aweme.utils;

import X.C65385PlN;
import X.C65400Plc;
import X.C65402Ple;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class StringJsonWithOriginAdapterFactory implements u {

    /* loaded from: classes12.dex */
    public static final class Adapter<T> extends TypeAdapter<T> {
        public final Gson LIZ;
        public final TypeToken<T> LIZIZ;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final T read(C65385PlN inJson) {
            int i;
            o.LJIIIZ(inJson, "inJson");
            EnumC65386PlO LJJIJIL = inJson.LJJIJIL();
            if (LJJIJIL == null) {
                i = -1;
            } else {
                i = C65400Plc.LIZ[LJJIJIL.ordinal()];
            }
            if (i != 1) {
                if (i == 2) {
                    try {
                        String LJJIIZI = inJson.LJJIIZI();
                        T t = (T) this.LIZ.LJII(LJJIIZI, this.LIZIZ.getType());
                        if (t instanceof C65402Ple) {
                            ((C65402Ple) t).origin = LJJIIZI;
                        }
                        return t;
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            inJson.LJJIIJ();
            return null;
        }

        public Adapter(Gson gson, TypeToken<T> token) {
            o.LJIIIZ(gson, "gson");
            o.LJIIIZ(token, "token");
            this.LIZ = gson;
            this.LIZIZ = token;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf out, T t) {
            o.LJIIIZ(out, "out");
            try {
                if (t instanceof C65402Ple) {
                    out.LJJ(((C65402Ple) t).origin);
                } else {
                    out.LJJ(this.LIZ.LJIILL(t));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        return new Adapter(gson, type);
    }
}
