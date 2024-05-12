package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RD9 extends ProtoAdapter<RD8> {
    public RD9() {
        super(FieldEncoding.LENGTH_DELIMITED, RD8.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RD8 decode(ProtoReader protoReader) {
        RD8 rd8 = new RD8();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rd8.type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        rd8.index = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        rd8.is_non_global = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 4:
                        rd8.track_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rd8.attr = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rd8.vote_info = RFT.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        rd8.text_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rd8.mention_info = C69274RGs.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        rd8.hashtag_info = RLG.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        rd8.countdown_info = RGL.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rd8.auto_video_caption_info = C69402RLq.ADAPTER.decode(protoReader);
                        break;
                    case 12:
                        rd8.duet_with_me = C69478ROo.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 14:
                        rd8.question_info = RFW.ADAPTER.decode(protoReader);
                        break;
                    case 15:
                        rd8.text_sticker_info = RGM.ADAPTER.decode(protoReader);
                        break;
                    case 17:
                        rd8.video_share_info = RHI.ADAPTER.decode(protoReader);
                        break;
                    case 18:
                        rd8.nature_info = RPR.ADAPTER.decode(protoReader);
                        break;
                    case 19:
                        rd8.poi_info = RO7.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        rd8.nature_classification_sticker_info = C69340RJg.ADAPTER.decode(protoReader);
                        break;
                    case 21:
                        rd8.material_index = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 22:
                        rd8.add_yours_sticker = REW.ADAPTER.decode(protoReader);
                        break;
                    case 23:
                        rd8.comment_post_sticker = C69481ROr.ADAPTER.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rd8;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RD8 rd8) {
        RD8 rd82 = rd8;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(3, rd82.is_non_global) + protoAdapter.encodedSizeWithTag(2, rd82.index) + protoAdapter.encodedSizeWithTag(1, rd82.type);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return rd82.unknownFields().size() + C69481ROr.ADAPTER.encodedSizeWithTag(23, rd82.comment_post_sticker) + REW.ADAPTER.encodedSizeWithTag(22, rd82.add_yours_sticker) + protoAdapter.encodedSizeWithTag(21, rd82.material_index) + C69340RJg.ADAPTER.encodedSizeWithTag(20, rd82.nature_classification_sticker_info) + RO7.ADAPTER.encodedSizeWithTag(19, rd82.poi_info) + RPR.ADAPTER.encodedSizeWithTag(18, rd82.nature_info) + RHI.ADAPTER.encodedSizeWithTag(17, rd82.video_share_info) + RGM.ADAPTER.encodedSizeWithTag(15, rd82.text_sticker_info) + RFW.ADAPTER.encodedSizeWithTag(14, rd82.question_info) + C69478ROo.ADAPTER.encodedSizeWithTag(12, rd82.duet_with_me) + C69402RLq.ADAPTER.encodedSizeWithTag(11, rd82.auto_video_caption_info) + RGL.ADAPTER.encodedSizeWithTag(10, rd82.countdown_info) + RLG.ADAPTER.encodedSizeWithTag(9, rd82.hashtag_info) + C69274RGs.ADAPTER.encodedSizeWithTag(8, rd82.mention_info) + protoAdapter2.encodedSizeWithTag(7, rd82.text_info) + RFT.ADAPTER.encodedSizeWithTag(6, rd82.vote_info) + protoAdapter2.encodedSizeWithTag(5, rd82.attr) + protoAdapter2.encodedSizeWithTag(4, rd82.track_info) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RD8 rd8) {
        RD8 rd82 = rd8;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rd82.type);
        protoAdapter.encodeWithTag(protoWriter, 2, rd82.index);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, rd82.is_non_global);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, rd82.track_info);
        protoAdapter2.encodeWithTag(protoWriter, 5, rd82.attr);
        RFT.ADAPTER.encodeWithTag(protoWriter, 6, rd82.vote_info);
        protoAdapter2.encodeWithTag(protoWriter, 7, rd82.text_info);
        C69274RGs.ADAPTER.encodeWithTag(protoWriter, 8, rd82.mention_info);
        RLG.ADAPTER.encodeWithTag(protoWriter, 9, rd82.hashtag_info);
        RGL.ADAPTER.encodeWithTag(protoWriter, 10, rd82.countdown_info);
        C69402RLq.ADAPTER.encodeWithTag(protoWriter, 11, rd82.auto_video_caption_info);
        C69478ROo.ADAPTER.encodeWithTag(protoWriter, 12, rd82.duet_with_me);
        RFW.ADAPTER.encodeWithTag(protoWriter, 14, rd82.question_info);
        RGM.ADAPTER.encodeWithTag(protoWriter, 15, rd82.text_sticker_info);
        RHI.ADAPTER.encodeWithTag(protoWriter, 17, rd82.video_share_info);
        RPR.ADAPTER.encodeWithTag(protoWriter, 18, rd82.nature_info);
        RO7.ADAPTER.encodeWithTag(protoWriter, 19, rd82.poi_info);
        C69340RJg.ADAPTER.encodeWithTag(protoWriter, 20, rd82.nature_classification_sticker_info);
        protoAdapter.encodeWithTag(protoWriter, 21, rd82.material_index);
        REW.ADAPTER.encodeWithTag(protoWriter, 22, rd82.add_yours_sticker);
        C69481ROr.ADAPTER.encodeWithTag(protoWriter, 23, rd82.comment_post_sticker);
        protoWriter.writeBytes(rd82.unknownFields());
    }
}
