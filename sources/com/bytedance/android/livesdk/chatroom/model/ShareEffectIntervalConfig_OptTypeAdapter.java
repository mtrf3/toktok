package com.bytedance.android.livesdk.chatroom.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ShareEffectIntervalConfig_OptTypeAdapter extends TypeAdapter<ShareEffectIntervalConfig> {
    public final Gson LIZ;

    public ShareEffectIntervalConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ShareEffectIntervalConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ShareEffectIntervalConfig shareEffectIntervalConfig = new ShareEffectIntervalConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1951342448) {
                    if (hashCode != -687538913) {
                        if (hashCode == -201824416 && LJJ.equals("live_show_share_effect")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                shareEffectIntervalConfig.showShareEffect = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("live_show_share_effect_interval_audience")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            shareEffectIntervalConfig.audienceInterval = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("live_show_share_effect_interval_anchor")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        shareEffectIntervalConfig.anchorInterval = reader.LJIJI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return shareEffectIntervalConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ShareEffectIntervalConfig shareEffectIntervalConfig) {
        ShareEffectIntervalConfig shareEffectIntervalConfig2 = shareEffectIntervalConfig;
        o.LJIIIZ(writer, "writer");
        if (shareEffectIntervalConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_show_share_effect_interval_anchor");
        C79062V1e.LJFF(shareEffectIntervalConfig2.anchorInterval, writer, "live_show_share_effect_interval_audience");
        C79062V1e.LJFF(shareEffectIntervalConfig2.audienceInterval, writer, "live_show_share_effect");
        writer.LJJIII(shareEffectIntervalConfig2.showShareEffect);
        writer.LJFF();
    }
}
