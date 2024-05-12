package com.ss.android.ugc.tiktok.location_api.service;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopupSceneV2 {

    @InterfaceC65349Pkn("open_settings_text")
    public final String openSettingsText;

    @InterfaceC65349Pkn("popup_text")
    public final String popupText;

    @InterfaceC65349Pkn("popup_ui_type")
    public final int popupUIType;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("show_open_settings")
    public final int showOpenSetting;

    @InterfaceC65349Pkn("show_preinstructions")
    public final int showPreInstruction;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupSceneV2)) {
            return false;
        }
        PopupSceneV2 popupSceneV2 = (PopupSceneV2) obj;
        return o.LJ(this.scene, popupSceneV2.scene) && this.showPreInstruction == popupSceneV2.showPreInstruction && this.popupUIType == popupSceneV2.popupUIType && this.showOpenSetting == popupSceneV2.showOpenSetting && o.LJ(this.popupText, popupSceneV2.popupText) && o.LJ(this.openSettingsText, popupSceneV2.openSettingsText);
    }

    public final int hashCode() {
        String str = this.scene;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.showPreInstruction) * 31) + this.popupUIType) * 31) + this.showOpenSetting) * 31;
        String str2 = this.popupText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.openSettingsText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopupSceneV2(scene=");
        LIZ.append(this.scene);
        LIZ.append(", showPreInstruction=");
        LIZ.append(this.showPreInstruction);
        LIZ.append(", popupUIType=");
        LIZ.append(this.popupUIType);
        LIZ.append(", showOpenSetting=");
        LIZ.append(this.showOpenSetting);
        LIZ.append(", popupText=");
        LIZ.append(this.popupText);
        LIZ.append(", openSettingsText=");
        return q.LIZIZ(LIZ, this.openSettingsText, ')', LIZ);
    }

    public PopupSceneV2(String str, int i, int i2, int i3, String str2, String str3) {
        this.scene = str;
        this.showPreInstruction = i;
        this.popupUIType = i2;
        this.showOpenSetting = i3;
        this.popupText = str2;
        this.openSettingsText = str3;
    }
}
