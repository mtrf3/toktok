package com.bytedance.android.livesdk.livesetting.subscription;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSubOnlyChatSetting_OptTypeAdapter extends TypeAdapter<LiveSubOnlyChatSetting> {
    public final Gson LIZ;

    public LiveSubOnlyChatSetting_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSubOnlyChatSetting read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSubOnlyChatSetting liveSubOnlyChatSetting = new LiveSubOnlyChatSetting(0, false, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1672660538) {
                    if (hashCode != -354159301) {
                        if (hashCode == 449890974 && LJJ.equals("animation_enable")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveSubOnlyChatSetting.setAnimationEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("on_live_switch_enable")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubOnlyChatSetting.setOnLiveSwitchEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("on_live_setting_switch_frequency_min")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveSubOnlyChatSetting.setOnLiveSwitchFrequencyMin(reader.LJIJI());
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveSubOnlyChatSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSubOnlyChatSetting liveSubOnlyChatSetting) {
        LiveSubOnlyChatSetting liveSubOnlyChatSetting2 = liveSubOnlyChatSetting;
        o.LJIIIZ(writer, "writer");
        if (liveSubOnlyChatSetting2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("on_live_setting_switch_frequency_min");
        writer.LJIJJ(Integer.valueOf(liveSubOnlyChatSetting2.getOnLiveSwitchFrequencyMin()));
        writer.LJI("on_live_switch_enable");
        writer.LJJIII(liveSubOnlyChatSetting2.getOnLiveSwitchEnable());
        writer.LJI("animation_enable");
        writer.LJJIII(liveSubOnlyChatSetting2.getAnimationEnable());
        writer.LJFF();
    }
}
