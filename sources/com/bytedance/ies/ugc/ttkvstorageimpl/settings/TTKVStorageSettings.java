package com.bytedance.ies.ugc.ttkvstorageimpl.settings;

import X.C52962KqU;
import X.C58096Mr6;
import com.bytedance.ies.ugc.ttkvstorageapi.IGetTTKVStorageSettings;

/* loaded from: classes10.dex */
public final class TTKVStorageSettings implements IGetTTKVStorageSettings {
    public static IGetTTKVStorageSettings LIZ() {
        Object LIZ = C58096Mr6.LIZ(IGetTTKVStorageSettings.class, false);
        if (LIZ != null) {
            return (IGetTTKVStorageSettings) LIZ;
        }
        if (C58096Mr6.LJJIIJZLJL == null) {
            synchronized (IGetTTKVStorageSettings.class) {
                if (C58096Mr6.LJJIIJZLJL == null) {
                    C58096Mr6.LJJIIJZLJL = new TTKVStorageSettings();
                }
            }
        }
        return C58096Mr6.LJJIIJZLJL;
    }

    @Override // com.bytedance.ies.ugc.ttkvstorageapi.IGetTTKVStorageSettings
    public final C52962KqU getSettings() {
        return (C52962KqU) C52962KqU.LJLJJL.getValue();
    }
}
