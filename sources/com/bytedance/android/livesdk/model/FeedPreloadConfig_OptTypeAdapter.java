package com.bytedance.android.livesdk.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FeedPreloadConfig_OptTypeAdapter extends TypeAdapter<FeedPreloadConfig> {
    public FeedPreloadConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final FeedPreloadConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        FeedPreloadConfig feedPreloadConfig = new FeedPreloadConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1905898415:
                        if (!LJJ.equals("live_feed_preload_in_room")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            feedPreloadConfig.feedPreloadInRoom = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1852482623:
                        if (!LJJ.equals("live_feed_preload_new_feed")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            feedPreloadConfig.feedPreloadNewFeed = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 478721140:
                        if (!LJJ.equals("live_feed_preload_style_one")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            feedPreloadConfig.feedPreloadStyleOne = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 478726234:
                        if (!LJJ.equals("live_feed_preload_style_two")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            feedPreloadConfig.feedPreloadStyleTwo = reader.LJIJI();
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
        return feedPreloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, FeedPreloadConfig feedPreloadConfig) {
        FeedPreloadConfig feedPreloadConfig2 = feedPreloadConfig;
        o.LJIIIZ(writer, "writer");
        if (feedPreloadConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_feed_preload_style_one");
        C79062V1e.LJFF(feedPreloadConfig2.feedPreloadStyleOne, writer, "live_feed_preload_style_two");
        C79062V1e.LJFF(feedPreloadConfig2.feedPreloadStyleTwo, writer, "live_feed_preload_in_room");
        C79062V1e.LJFF(feedPreloadConfig2.feedPreloadInRoom, writer, "live_feed_preload_new_feed");
        C77339UWx.LJFF(feedPreloadConfig2.feedPreloadNewFeed, writer);
    }
}
