package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveBannerDegrade_OptTypeAdapter extends TypeAdapter<LiveBannerDegrade> {
    public final Gson LIZ;

    public LiveBannerDegrade_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBannerDegrade read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveBannerDegrade liveBannerDegrade = new LiveBannerDegrade();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != 766946664) {
                    if (hashCode != 1267835235) {
                        if (hashCode == 1770596241 && LJJ.equals("enable_recycle_webview")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveBannerDegrade.enableRecycleWebview = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("delay_load_banner_time")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveBannerDegrade.delayLoadBannerTime = reader.LJIJJ();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("enable_banner")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveBannerDegrade.enableBanner = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveBannerDegrade;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveBannerDegrade liveBannerDegrade) {
        LiveBannerDegrade liveBannerDegrade2 = liveBannerDegrade;
        o.LJIIIZ(writer, "writer");
        if (liveBannerDegrade2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_banner");
        writer.LJJIII(liveBannerDegrade2.enableBanner);
        writer.LJI("enable_recycle_webview");
        writer.LJJIII(liveBannerDegrade2.enableRecycleWebview);
        writer.LJI("delay_load_banner_time");
        writer.LJIJ(liveBannerDegrade2.delayLoadBannerTime);
        writer.LJFF();
    }
}
