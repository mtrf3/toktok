package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class EffectPreloadParams_OptTypeAdapter extends TypeAdapter<EffectPreloadParams> {
    public final Gson LIZ;

    public EffectPreloadParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final EffectPreloadParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        EffectPreloadParams effectPreloadParams = new EffectPreloadParams(false, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "live_effect_preloading_enter_room")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    effectPreloadParams.preloadOnEnter = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "live_effect_preloading_delay")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    effectPreloadParams.preloadDelay = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return effectPreloadParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, EffectPreloadParams effectPreloadParams) {
        EffectPreloadParams effectPreloadParams2 = effectPreloadParams;
        o.LJIIIZ(writer, "writer");
        if (effectPreloadParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_effect_preloading_enter_room");
        writer.LJJIII(effectPreloadParams2.preloadOnEnter);
        writer.LJI("live_effect_preloading_delay");
        writer.LJIJ(effectPreloadParams2.preloadDelay);
        writer.LJFF();
    }
}
