package com.bytedance.android.livesdk.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C76965UIn;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveRecommendAtEnd_OptTypeAdapter extends TypeAdapter<LiveRecommendAtEnd> {
    public final Gson LIZ;

    public LiveRecommendAtEnd_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRecommendAtEnd read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveRecommendAtEnd liveRecommendAtEnd = new LiveRecommendAtEnd();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1652592311:
                        if (!LJJ.equals("live_to_recommend_distance")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRecommendAtEnd.recommendDistance = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -698990538:
                        if (!LJJ.equals("enable_show_recommend")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRecommendAtEnd.enableShowRecommend = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -435062705:
                        if (!LJJ.equals("following_entrances")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ);
                            liveRecommendAtEnd.followingEntrances = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 355349285:
                        if (!LJJ.equals("recommend_button_show_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRecommendAtEnd.recommendButtonShowTime = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1179164155:
                        if (!LJJ.equals("delay_hide_guide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRecommendAtEnd.delayHideGuide = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1420970529:
                        if (!LJJ.equals("is_limit_player_width")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRecommendAtEnd.isLimitPlayerWidth = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1589113862:
                        if (!LJJ.equals("live_to_recommend_fail_style_is_new")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRecommendAtEnd.styleIsNew = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return liveRecommendAtEnd;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveRecommendAtEnd liveRecommendAtEnd) {
        LiveRecommendAtEnd liveRecommendAtEnd2 = liveRecommendAtEnd;
        o.LJIIIZ(writer, "writer");
        if (liveRecommendAtEnd2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_show_recommend");
        C79062V1e.LJFF(liveRecommendAtEnd2.enableShowRecommend, writer, "recommend_button_show_time");
        writer.LJIJ(liveRecommendAtEnd2.recommendButtonShowTime);
        writer.LJI("following_entrances");
        C65412Plo.LIZLLL(this.LIZ, writer, liveRecommendAtEnd2.followingEntrances, String.class);
        writer.LJI("is_limit_player_width");
        writer.LJJIII(liveRecommendAtEnd2.isLimitPlayerWidth);
        writer.LJI("live_to_recommend_distance");
        C76965UIn.LIZIZ(liveRecommendAtEnd2.recommendDistance, writer, "live_to_recommend_fail_style_is_new");
        writer.LJJIII(liveRecommendAtEnd2.styleIsNew);
        writer.LJI("delay_hide_guide");
        writer.LJJIII(liveRecommendAtEnd2.delayHideGuide);
        writer.LJFF();
    }
}
