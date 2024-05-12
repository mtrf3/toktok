package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveStarCommentSchemaConfig_Config_OptTypeAdapter extends TypeAdapter<LiveStarCommentSchemaConfig.Config> {
    public LiveStarCommentSchemaConfig_Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveStarCommentSchemaConfig.Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveStarCommentSchemaConfig.Config config = new LiveStarCommentSchemaConfig.Config(null, null, null, null, null, null, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2068700286:
                        if (!LJJ.equals("star_comment_purchase_page_bubble_faq")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            config.bubblePageFaq = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -2029968697:
                        if (!LJJ.equals("star_comment_history")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            config.starCommentHistory = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -610645127:
                        if (!LJJ.equals("star_comment_anchor_faq")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            config.starCommentAnchorFaq = LJJIIZI3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -438077318:
                        if (!LJJ.equals("star_comment_terms")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI4 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI4, "reader.nextString()");
                            config.starCommentTerms = LJJIIZI4;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 493071368:
                        if (!LJJ.equals("star_comment_audience_faq")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI5 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI5, "reader.nextString()");
                            config.starCommentAudienceFaq = LJJIIZI5;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 797321143:
                        if (!LJJ.equals("anchor_settings_scheme")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI6 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI6, "reader.nextString()");
                            config.anchor_settings_scheme = LJJIIZI6;
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveStarCommentSchemaConfig.Config config) {
        LiveStarCommentSchemaConfig.Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("anchor_settings_scheme");
        writer.LJJ(config2.anchor_settings_scheme);
        writer.LJI("star_comment_history");
        writer.LJJ(config2.starCommentHistory);
        writer.LJI("star_comment_anchor_faq");
        writer.LJJ(config2.starCommentAnchorFaq);
        writer.LJI("star_comment_audience_faq");
        writer.LJJ(config2.starCommentAudienceFaq);
        writer.LJI("star_comment_purchase_page_bubble_faq");
        writer.LJJ(config2.bubblePageFaq);
        writer.LJI("star_comment_terms");
        writer.LJJ(config2.starCommentTerms);
        writer.LJFF();
    }
}
