package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import com.ss.android.ugc.aweme.simkit.model.BaseResponse;
import com.ss.android.ugc.aweme.simkit.model.hwdec.PlayerTypeAbConfigV2;
import java.util.List;

/* loaded from: classes9.dex */
public class RateSettingsResponse<T extends PlayerTypeAbConfigV2> extends BaseResponse {

    @InterfaceC65349Pkn("adaptive_gear_group")
    public GearConfig adaptiveGearGroup;

    @InterfaceC65349Pkn("auto_biterate_curv")
    public AutoBitrateCurve autoBitrateCurve;

    @InterfaceC65349Pkn("auto_bitrate_params")
    public AutoBitrateSet autoBitrateSet;

    @InterfaceC65349Pkn("auto_bitrate_params_live")
    public AutoBitrateSet autoBitrateSetLive;

    @InterfaceC65349Pkn("auto_bitrate_params_music")
    public AutoBitrateSet autoBitrateSetMusic;

    @InterfaceC65349Pkn("bandwidth_map")
    public List<BandwidthSet> bandwidthSet;

    @InterfaceC65349Pkn("player_type_v2")
    public T decodeType;

    @InterfaceC65349Pkn("default_gear_group")
    public String defaultGearGroup;

    @InterfaceC65349Pkn("definition_gear_group")
    public GearConfig definitionGearGroup;

    @InterfaceC65349Pkn("flow_gear_group")
    public GearConfig flowGearGroup;

    @InterfaceC65349Pkn("gear_set")
    public List<GearSet> gearSet;

    public AutoBitrateSet getHighBitrateCurve() {
        AutoBitrateSet autoBitrateSet;
        AutoBitrateCurve autoBitrateCurve = this.autoBitrateCurve;
        if (autoBitrateCurve == null || (autoBitrateSet = autoBitrateCurve.highBitrateSet) == null) {
            return this.autoBitrateSet;
        }
        return autoBitrateSet;
    }

    public AutoBitrateSet getLowQltyCurv() {
        AutoBitrateCurve autoBitrateCurve = this.autoBitrateCurve;
        if (autoBitrateCurve == null) {
            return null;
        }
        return autoBitrateCurve.lowerQltyCurvParam;
    }

    public boolean isValid() {
        if (this.adaptiveGearGroup != null && (this.gearSet != null || this.bandwidthSet != null || this.autoBitrateSet != null)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.simkit.model.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RateSettingsResponse{flowGearGroup=");
        LIZ.append(this.flowGearGroup);
        LIZ.append(", adaptiveGearGroup=");
        LIZ.append(this.adaptiveGearGroup);
        LIZ.append(", defaultGearGroup='");
        Q89.LIZIZ(LIZ, this.defaultGearGroup, '\'', ", definitionGearGroup=");
        LIZ.append(this.definitionGearGroup);
        LIZ.append(", gearSet=");
        LIZ.append(this.gearSet);
        LIZ.append(", bandwidthSet=");
        LIZ.append(this.bandwidthSet);
        LIZ.append(", autoBitrateSet=");
        LIZ.append(this.autoBitrateSet);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public GearConfig getAdaptiveGearGroup() {
        return this.adaptiveGearGroup;
    }

    public AutoBitrateSet getAutoBitrateSet() {
        return this.autoBitrateSet;
    }

    public AutoBitrateSet getAutoBitrateSetLive() {
        return this.autoBitrateSetLive;
    }

    public AutoBitrateSet getAutoBitrateSetMusic() {
        return this.autoBitrateSetMusic;
    }

    public List<BandwidthSet> getBandwidthSet() {
        return this.bandwidthSet;
    }

    public PlayerTypeAbConfigV2 getDecodeType() {
        return this.decodeType;
    }

    public String getDefaultGearGroup() {
        return this.defaultGearGroup;
    }

    public GearConfig getDefinitionGearGroup() {
        return this.definitionGearGroup;
    }

    public GearConfig getFlowGearGroup() {
        return this.flowGearGroup;
    }

    public List<GearSet> getGearSet() {
        return this.gearSet;
    }

    public void setAdaptiveGearGroup(GearConfig gearConfig) {
        this.adaptiveGearGroup = gearConfig;
    }

    public void setAutoBitrateSet(AutoBitrateSet autoBitrateSet) {
        this.autoBitrateSet = autoBitrateSet;
    }

    public void setAutoBitrateSetLive(AutoBitrateSet autoBitrateSet) {
        this.autoBitrateSetLive = autoBitrateSet;
    }

    public void setAutoBitrateSetMusic(AutoBitrateSet autoBitrateSet) {
        this.autoBitrateSetMusic = autoBitrateSet;
    }

    public void setBandwidthSet(List<BandwidthSet> list) {
        this.bandwidthSet = list;
    }

    public void setDefaultGearGroup(String str) {
        this.defaultGearGroup = str;
    }

    public void setDefinitionGearGroup(GearConfig gearConfig) {
        this.definitionGearGroup = gearConfig;
    }

    public void setFlowGearGroup(GearConfig gearConfig) {
        this.flowGearGroup = gearConfig;
    }

    public void setGearSet(List<GearSet> list) {
        this.gearSet = list;
    }
}
