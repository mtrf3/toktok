package com.ss.android.ugc.aweme.request_combine.task;

import X.EE4;
import X.EFK;
import X.EJA;
import X.EJC;
import X.FKP;
import X.InterfaceC36076EDw;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestApiImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi;

/* loaded from: classes7.dex */
public final class FetchCombineSettingsTask extends BaseFetchCombineSettingsTask implements InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "FetchCombineSettingsTask";
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        return 2;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    public FetchCombineSettingsTask() {
        ISettingsRequestApi LIZJ = SettingsRequestApiImpl.LIZJ();
        if (LIZJ != null) {
            LIZJ.LIZ(EJA.UG_NEW, new EJC());
            LIZJ.LIZ(EJA.TABLET, new FKP());
        }
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }
}
