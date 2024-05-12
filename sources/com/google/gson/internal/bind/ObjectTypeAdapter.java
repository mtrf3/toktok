package com.google.gson.internal.bind;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.m;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {
    public static final u LIZIZ = new u() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.google.gson.u
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };
    public final Gson LIZ;

    /* loaded from: classes12.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] LIZ;

        static {
            int[] iArr = new int[EnumC65386PlO.values().length];
            LIZ = iArr;
            try {
                iArr[EnumC65386PlO.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[EnumC65386PlO.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZ[EnumC65386PlO.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LIZ[EnumC65386PlO.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LIZ[EnumC65386PlO.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LIZ[EnumC65386PlO.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ObjectTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(C65385PlN c65385PlN) {
        switch (a.LIZ[c65385PlN.LJJIJIL().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c65385PlN.LIZ();
                while (c65385PlN.LJIIJJI()) {
                    arrayList.add(read(c65385PlN));
                }
                c65385PlN.LJ();
                return arrayList;
            case 2:
                m mVar = new m();
                c65385PlN.LIZIZ();
                while (c65385PlN.LJIIJJI()) {
                    mVar.put(c65385PlN.LJJ(), read(c65385PlN));
                }
                c65385PlN.LJFF();
                return mVar;
            case 3:
                return c65385PlN.LJJIIZI();
            case 4:
                return Double.valueOf(c65385PlN.LJIJ());
            case 5:
                return Boolean.valueOf(c65385PlN.LJIILL());
            case 6:
                c65385PlN.LJJIIJ();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, Object obj) {
        if (obj == null) {
            c65403Plf.LJIIJJI();
            return;
        }
        TypeAdapter LJIIJ = this.LIZ.LJIIJ(obj.getClass());
        if (LJIIJ instanceof ObjectTypeAdapter) {
            c65403Plf.LIZJ();
            c65403Plf.LJFF();
        } else {
            LJIIJ.write(c65403Plf, obj);
        }
    }
}
