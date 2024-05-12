package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public class MaskLayer {

    @InterfaceC65349Pkn("mask_layer_type")
    public int maskLayerType;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punishInfo;

    @InterfaceC65349Pkn("sub_title")
    public Text subTitle;

    @InterfaceC65349Pkn("title")
    public Text title;

    public String getMaskLayerTypeStr() {
        int i = this.maskLayerType;
        if (i == 1) {
            return "R2";
        }
        if (i == 2) {
            return "Game Age Restricted";
        }
        if (i == 3) {
            return "Game Disturbing Content";
        }
        return "Unknown";
    }

    public boolean isGameAgeRestrictedType() {
        if (this.maskLayerType == 2) {
            return true;
        }
        return false;
    }

    public boolean isGameDisturbingContentType() {
        if (this.maskLayerType == 3) {
            return true;
        }
        return false;
    }

    public boolean isGameLiveMask() {
        int i = this.maskLayerType;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isR2OrUnknownMask() {
        int i = this.maskLayerType;
        if (i == 1 || i == 0) {
            return true;
        }
        return false;
    }
}
