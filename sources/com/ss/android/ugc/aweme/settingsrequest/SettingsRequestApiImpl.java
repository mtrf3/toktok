package com.ss.android.ugc.aweme.settingsrequest;

import X.C58096Mr6;
import X.EE1;
import X.EJ8;
import X.EJ9;
import X.EJA;
import X.EUH;
import X.EUJ;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi;
import com.ss.android.ugc.aweme.settingsrequest.task.SettingsReaderInitTask;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SettingsRequestApiImpl implements ISettingsRequestApi {
    public static ISettingsRequestApi LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ISettingsRequestApi.class, false);
        if (LIZ != null) {
            return (ISettingsRequestApi) LIZ;
        }
        if (C58096Mr6.H6 == null) {
            synchronized (ISettingsRequestApi.class) {
                if (C58096Mr6.H6 == null) {
                    C58096Mr6.H6 = new SettingsRequestApiImpl();
                }
            }
        }
        return C58096Mr6.H6;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi
    public final EE1 LIZIZ() {
        return new SettingsReaderInitTask();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi
    public final void LJFF(EUJ euj) {
        EUH.LIZJ(euj, false);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi
    public final void LIZ(EJA type, EJ9 ej9) {
        o.LJIIIZ(type, "type");
        EJ8.LIZ.put(type, ej9);
    }
}
