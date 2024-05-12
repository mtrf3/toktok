package com.ss.android.ugc.aweme.experiment;

import X.C78983UzD;
import X.FFL;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditEffectPanelSettings {
    public static final EditEffectSettingsModel LIZ;

    /* loaded from: classes3.dex */
    public static final class EditEffectSettingsModel {

        @InterfaceC65349Pkn("panel_column")
        public int panelColumn = 4;

        @InterfaceC65349Pkn("auto_download_line")
        public int autoDownloadLine = 2;

        @InterfaceC65349Pkn("pre_download_size_after_click")
        public int preDownloadSize = 3;
    }

    static {
        new EditEffectPanelSettings();
        LIZ = new EditEffectSettingsModel();
    }

    public static final EditEffectSettingsModel LIZ() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            EditEffectSettingsModel editEffectSettingsModel = LIZ;
            LJIIIZ.getClass();
            EditEffectSettingsModel editEffectSettingsModel2 = (EditEffectSettingsModel) FFL.LJIJ(true, "edit_effect_panel_config", 31744, EditEffectSettingsModel.class, editEffectSettingsModel);
            if (editEffectSettingsModel2 != null) {
                editEffectSettingsModel = editEffectSettingsModel2;
            }
            o.LJIIIIZZ(editEffectSettingsModel, "{\n            ABManager.…     ?: DEFAULT\n        }");
            return editEffectSettingsModel;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return LIZ;
        }
    }
}
