package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePullPureAudioSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePullPureAudioSetting_PullPureAudioConfig_OptTypeAdapter extends TypeAdapter<LivePullPureAudioSetting.PullPureAudioConfig> {
    public final Gson LIZ;

    public LivePullPureAudioSetting_PullPureAudioConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePullPureAudioSetting.PullPureAudioConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePullPureAudioSetting.PullPureAudioConfig pullPureAudioConfig = new LivePullPureAudioSetting.PullPureAudioConfig(false, 0, 0L, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1298848381) {
                    if (hashCode != -928040776) {
                        if (hashCode == -927424212 && LJJ.equals("retry_delay")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                pullPureAudioConfig.setRetryDelay(reader.LJIJJ());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("retry_count")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            pullPureAudioConfig.setRetryCount(reader.LJIJI());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("enable")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        pullPureAudioConfig.setEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return pullPureAudioConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePullPureAudioSetting.PullPureAudioConfig pullPureAudioConfig) {
        LivePullPureAudioSetting.PullPureAudioConfig pullPureAudioConfig2 = pullPureAudioConfig;
        o.LJIIIZ(writer, "writer");
        if (pullPureAudioConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(pullPureAudioConfig2.getEnable());
        writer.LJI("retry_count");
        writer.LJIJJ(Integer.valueOf(pullPureAudioConfig2.getRetryCount()));
        writer.LJI("retry_delay");
        writer.LJIJ(pullPureAudioConfig2.getRetryDelay());
        writer.LJFF();
    }
}
