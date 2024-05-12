package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAnimationDegrade_OptTypeAdapter extends TypeAdapter<LiveAnimationDegrade> {
    public final Gson LIZ;

    public LiveAnimationDegrade_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAnimationDegrade read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveAnimationDegrade liveAnimationDegrade = new LiveAnimationDegrade();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1355524800) {
                    if (hashCode != 748406846) {
                        if (hashCode == 1971770645 && LJJ.equals("enable_mini_toplive")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveAnimationDegrade.enableMiniTopLives = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("enable_entrance_anim")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveAnimationDegrade.enableEntranceAnim = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("enable_guide")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveAnimationDegrade.enableGuide = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveAnimationDegrade;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveAnimationDegrade liveAnimationDegrade) {
        LiveAnimationDegrade liveAnimationDegrade2 = liveAnimationDegrade;
        o.LJIIIZ(writer, "writer");
        if (liveAnimationDegrade2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_guide");
        writer.LJJIII(liveAnimationDegrade2.enableGuide);
        writer.LJI("enable_mini_toplive");
        writer.LJJIII(liveAnimationDegrade2.enableMiniTopLives);
        writer.LJI("enable_entrance_anim");
        writer.LJJIII(liveAnimationDegrade2.enableEntranceAnim);
        writer.LJFF();
    }
}
