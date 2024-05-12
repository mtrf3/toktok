package com.ss.android.ugc.aweme.external;

import X.C0RN;
import X.C60903NvH;
import X.C78685UuP;
import X.C82543WaR;
import X.C84419XBf;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import X.H7B;
import X.ORY;
import X.X1D;
import X.XBE;
import android.content.Context;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class PreDownloadEffectModel implements EE1 {
    public final String[] LJLIL = {"tt_face_extra"};
    public final String[] LJLILLLLZI = {"asset://md5_error", "asset://not_found"};

    @Override // X.EEY
    public final String key() {
        return "PreDownloadEffectModel";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pre download effect model start ");
        FFL.LJIIIZ().getClass();
        LIZ.append(FFL.LJ(31744, "tools_enable_pre_download_face_model", true, false));
        H7B.LJ(X1D.LIZIZ(LIZ));
        FFL.LJIIIZ().getClass();
        if (!FFL.LJ(31744, "tools_enable_pre_download_face_model", true, false)) {
            return;
        }
        C60903NvH.LJIIJJI().initDownloadableModel();
        XBE.LJIIIIZZ.getClass();
        String findResourceUri = C84419XBf.LIZ().LIZLLL().findResourceUri(this.LJLIL[0]);
        if (findResourceUri == null) {
            findResourceUri = "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("pre download effect model path: ");
        LIZ2.append(findResourceUri);
        H7B.LJ(X1D.LIZIZ(LIZ2));
        if (C78685UuP.LJJJZ(findResourceUri) && (o.LJ(findResourceUri, "asset://not_initialized") || !ORY.LJJIJIIJIL(findResourceUri, this.LJLILLLLZI))) {
            return;
        }
        DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, this.LJLIL, new C82543WaR(this));
    }
}
