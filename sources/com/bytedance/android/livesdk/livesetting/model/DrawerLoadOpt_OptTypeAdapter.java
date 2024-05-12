package com.bytedance.android.livesdk.livesetting.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawerLoadOpt_OptTypeAdapter extends TypeAdapter<DrawerLoadOpt> {
    public final Gson LIZ;

    public DrawerLoadOpt_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final DrawerLoadOpt read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        DrawerLoadOpt drawerLoadOpt = new DrawerLoadOpt();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1230308670:
                        if (!LJJ.equals(" tt_live_drawer_load_opt_delay_preload_ui_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            drawerLoadOpt.delayUIDuration = reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1202670276:
                        if (!LJJ.equals("tt_live_drawer_load_opt_preloading_game_data")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            drawerLoadOpt.isPreLoadingGameData = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -639276660:
                        if (!LJJ.equals("tt_live_drawer_load_opt_preloading_foru_ui")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            drawerLoadOpt.isPreLoadingForuUI = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -195282484:
                        if (!LJJ.equals("tt_live_drawer_load_opt_delay_preload_data_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            drawerLoadOpt.delayDataDuration = reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -165057374:
                        if (!LJJ.equals("tt_live_drawer_load_opt_preloading_foru_data")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            drawerLoadOpt.isPreLoadingForuData = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -157675354:
                        if (!LJJ.equals("tt_live_drawer_load_opt_preloading_game_ui")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            drawerLoadOpt.isPreLoadingGameUI = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 688631619:
                        if (!LJJ.equals("tt_live_drawer_load_opt_default_landing_game")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            drawerLoadOpt.isLandingGame = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return drawerLoadOpt;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, DrawerLoadOpt drawerLoadOpt) {
        DrawerLoadOpt drawerLoadOpt2 = drawerLoadOpt;
        o.LJIIIZ(writer, "writer");
        if (drawerLoadOpt2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("tt_live_drawer_load_opt_default_landing_game");
        writer.LJJIII(drawerLoadOpt2.isLandingGame);
        writer.LJI("tt_live_drawer_load_opt_preloading_game_data");
        writer.LJJIII(drawerLoadOpt2.isPreLoadingGameData);
        writer.LJI("tt_live_drawer_load_opt_preloading_foru_data");
        writer.LJJIII(drawerLoadOpt2.isPreLoadingForuData);
        writer.LJI("tt_live_drawer_load_opt_preloading_game_ui");
        writer.LJJIII(drawerLoadOpt2.isPreLoadingGameUI);
        writer.LJI("tt_live_drawer_load_opt_preloading_foru_ui");
        writer.LJJIII(drawerLoadOpt2.isPreLoadingForuUI);
        writer.LJI("tt_live_drawer_load_opt_delay_preload_data_duration");
        writer.LJIILL(drawerLoadOpt2.delayDataDuration);
        writer.LJI(" tt_live_drawer_load_opt_delay_preload_ui_duration");
        writer.LJIILL(drawerLoadOpt2.delayUIDuration);
        writer.LJFF();
    }
}
