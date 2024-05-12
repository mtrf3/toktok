package com.bytedance.android.live_settings;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.X1D;
import com.bytedance.android.live_settings.gson.AdapterFactoryInitializer;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.n;
import com.google.gson.u;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class NormalGson {
    public static Gson gson;
    public static Gson optGson;

    /* renamed from: com.bytedance.android.live_settings.NormalGson$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[EnumC65386PlO.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[EnumC65386PlO.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[EnumC65386PlO.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static AdapterFactoryInitializer getLiveAdapterFactoryInitializer() {
        try {
            Object newInstance = Class.forName("com.bytedance.android.live.settings.initializer.TypeAdapterFactoryInitializer").newInstance();
            if (newInstance instanceof AdapterFactoryInitializer) {
                return (AdapterFactoryInitializer) newInstance;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static synchronized Gson singleton() {
        Gson gson2;
        synchronized (NormalGson.class) {
            if (gson == null) {
                e eVar = new e();
                eVar.LJIIL = false;
                AnonymousClass1 anonymousClass1 = null;
                eVar.LIZIZ(new BooleanTypeAdapter(anonymousClass1), Boolean.class);
                eVar.LIZIZ(new BooleanTypeAdapter(anonymousClass1), Boolean.TYPE);
                gson = eVar.LIZ();
            }
            gson2 = gson;
        }
        return gson2;
    }

    public static synchronized Gson singletonOpt() {
        synchronized (NormalGson.class) {
            Gson gson2 = optGson;
            if (gson2 != null) {
                return gson2;
            }
            e eVar = new e();
            eVar.LJIIL = false;
            AnonymousClass1 anonymousClass1 = null;
            eVar.LIZIZ(new BooleanTypeAdapter(anonymousClass1), Boolean.class);
            eVar.LIZIZ(new BooleanTypeAdapter(anonymousClass1), Boolean.TYPE);
            AdapterFactoryInitializer liveAdapterFactoryInitializer = getLiveAdapterFactoryInitializer();
            if (liveAdapterFactoryInitializer != null) {
                Iterator<u> it = liveAdapterFactoryInitializer.getAdapterFactories().iterator();
                while (it.hasNext()) {
                    eVar.LIZJ(it.next());
                }
            }
            Gson LIZ = eVar.LIZ();
            optGson = LIZ;
            return LIZ;
        }
    }

    /* loaded from: classes12.dex */
    public static class BooleanTypeAdapter extends TypeAdapter<Boolean> {
        public BooleanTypeAdapter() {
        }

        public /* synthetic */ BooleanTypeAdapter(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Boolean read(C65385PlN c65385PlN) {
            EnumC65386PlO LJJIJIL = c65385PlN.LJJIJIL();
            int i = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[LJJIJIL.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    if (c65385PlN.LJIJI() == 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Expected BOOLEAN or NUMBER but was ");
                LIZ.append(LJJIJIL);
                throw new n(X1D.LIZIZ(LIZ));
            }
            return Boolean.valueOf(c65385PlN.LJIILL());
        }

        @Override // com.google.gson.TypeAdapter
        public void write(C65403Plf c65403Plf, Boolean bool) {
            if (bool == null) {
                c65403Plf.LJIIJJI();
            } else {
                c65403Plf.LJIJI(bool);
            }
        }
    }
}
