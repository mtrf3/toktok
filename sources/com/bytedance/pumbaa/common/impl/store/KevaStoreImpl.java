package com.bytedance.pumbaa.common.impl.store;

import X.InterfaceC66223Pyt;
import X.X1D;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.pumbaa.common.interfaces.IStore;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class KevaStoreImpl implements IStore {
    public final Map<String, InterfaceC66223Pyt> LIZ = new LinkedHashMap();

    @Override // com.bytedance.pumbaa.common.interfaces.IStore
    public final InterfaceC66223Pyt getRepo(String repoName, int i) {
        o.LJIIIZ(repoName, "repoName");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(repoName);
        LIZ.append('_');
        LIZ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ);
        InterfaceC66223Pyt interfaceC66223Pyt = (InterfaceC66223Pyt) ((LinkedHashMap) this.LIZ).get(LIZIZ);
        if (interfaceC66223Pyt == null) {
            final Keva keva = KevaImpl.getRepo(repoName, i);
            o.LJIIIIZZ(keva, "keva");
            InterfaceC66223Pyt interfaceC66223Pyt2 = new InterfaceC66223Pyt(keva) { // from class: X.9xx
                public final Keva LIZ;

                @Override // X.InterfaceC66223Pyt
                public final int LIZIZ() {
                    return this.LIZ.getInt("helios_pid", -1);
                }

                @Override // X.InterfaceC66223Pyt
                public final void clear() {
                    this.LIZ.clear();
                }

                @Override // X.InterfaceC66223Pyt
                public final java.util.Map<String, ?> getAll() {
                    return this.LIZ.getAll();
                }

                {
                    this.LIZ = keva;
                }

                @Override // X.InterfaceC66223Pyt
                public final void LIZ(int i2) {
                    this.LIZ.storeInt("helios_pid", i2);
                }

                @Override // X.InterfaceC66223Pyt
                public final long getLong(String key) {
                    o.LJIIIZ(key, "key");
                    return this.LIZ.getLong(key, 0L);
                }

                @Override // X.InterfaceC66223Pyt
                public final void remove(String key) {
                    o.LJIIIZ(key, "key");
                    this.LIZ.erase(key);
                }

                @Override // X.InterfaceC66223Pyt
                public final String getString(String key, String str) {
                    o.LJIIIZ(key, "key");
                    String string = this.LIZ.getString(key, str);
                    if (string != null) {
                        return string;
                    }
                    return str;
                }

                @Override // X.InterfaceC66223Pyt
                public final void putLong(String key, long j) {
                    o.LJIIIZ(key, "key");
                    this.LIZ.storeLong(key, j);
                }

                @Override // X.InterfaceC66223Pyt
                public final void putString(String key, String value) {
                    o.LJIIIZ(key, "key");
                    o.LJIIIZ(value, "value");
                    this.LIZ.storeString(key, value);
                }
            };
            ((LinkedHashMap) this.LIZ).get(LIZIZ);
            return interfaceC66223Pyt2;
        }
        return interfaceC66223Pyt;
    }
}
