package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BadPhonesWatchLiveCommonUIConfig_OptTypeAdapter extends TypeAdapter<BadPhonesWatchLiveCommonUIConfig> {
    public final Gson LIZ;

    public BadPhonesWatchLiveCommonUIConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BadPhonesWatchLiveCommonUIConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        BadPhonesWatchLiveCommonUIConfig badPhonesWatchLiveCommonUIConfig = new BadPhonesWatchLiveCommonUIConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -330471441:
                        if (!LJJ.equals("disable_gauss_blurred")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            badPhonesWatchLiveCommonUIConfig.disableGaussBlurred = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -245253831:
                        if (!LJJ.equals("remove_bottom_shadow")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            badPhonesWatchLiveCommonUIConfig.removeBottomShadow = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 43466913:
                        if (!LJJ.equals("remove_insert_message_animation")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            badPhonesWatchLiveCommonUIConfig.removeInsertMessageAnimation = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 791485925:
                        if (!LJJ.equals("remove_top_shadow")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            badPhonesWatchLiveCommonUIConfig.removeTopShadow = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return badPhonesWatchLiveCommonUIConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, BadPhonesWatchLiveCommonUIConfig badPhonesWatchLiveCommonUIConfig) {
        BadPhonesWatchLiveCommonUIConfig badPhonesWatchLiveCommonUIConfig2 = badPhonesWatchLiveCommonUIConfig;
        o.LJIIIZ(writer, "writer");
        if (badPhonesWatchLiveCommonUIConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("remove_top_shadow");
        writer.LJJIII(badPhonesWatchLiveCommonUIConfig2.removeTopShadow);
        writer.LJI("remove_bottom_shadow");
        writer.LJJIII(badPhonesWatchLiveCommonUIConfig2.removeBottomShadow);
        writer.LJI("disable_gauss_blurred");
        writer.LJJIII(badPhonesWatchLiveCommonUIConfig2.disableGaussBlurred);
        writer.LJI("remove_insert_message_animation");
        writer.LJJIII(badPhonesWatchLiveCommonUIConfig2.removeInsertMessageAnimation);
        writer.LJFF();
    }
}
