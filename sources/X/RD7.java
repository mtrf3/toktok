package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RD7 extends ProtoAdapter<REL> {
    public RD7() {
        super(FieldEncoding.LENGTH_DELIMITED, REL.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final REL decode(ProtoReader protoReader) {
        REL rel = new REL();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rel.url_list = C69393RLh.ADAPTER.decode(protoReader);
                        break;
                    case 2:
                        rel.encoded_type = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rel.media_type = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rel.logo_type = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rel.definition = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rel.quality = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rel.quality_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rel.format = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        rel.width = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 10:
                        rel.height = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rel.bitrate = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 12:
                        rel.codec_type = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rel.size = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 14:
                        rel.fps = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 15:
                        rel.file_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        rel.file_hash = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 17:
                        rel.sub_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 18:
                        rel.bandwidth = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rel;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(REL rel) {
        REL rel2 = rel;
        int encodedSizeWithTag = C69393RLh.ADAPTER.encodedSizeWithTag(1, rel2.url_list);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(8, rel2.format) + protoAdapter.encodedSizeWithTag(7, rel2.quality_desc) + protoAdapter.encodedSizeWithTag(6, rel2.quality) + protoAdapter.encodedSizeWithTag(5, rel2.definition) + protoAdapter.encodedSizeWithTag(4, rel2.logo_type) + protoAdapter.encodedSizeWithTag(3, rel2.media_type) + protoAdapter.encodedSizeWithTag(2, rel2.encoded_type) + encodedSizeWithTag;
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return rel2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(18, rel2.bandwidth) + protoAdapter.encodedSizeWithTag(17, rel2.sub_info) + protoAdapter.encodedSizeWithTag(16, rel2.file_hash) + protoAdapter.encodedSizeWithTag(15, rel2.file_id) + protoAdapter2.encodedSizeWithTag(14, rel2.fps) + protoAdapter2.encodedSizeWithTag(13, rel2.size) + protoAdapter.encodedSizeWithTag(12, rel2.codec_type) + protoAdapter2.encodedSizeWithTag(11, rel2.bitrate) + protoAdapter2.encodedSizeWithTag(10, rel2.height) + protoAdapter2.encodedSizeWithTag(9, rel2.width) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, REL rel) {
        REL rel2 = rel;
        C69393RLh.ADAPTER.encodeWithTag(protoWriter, 1, rel2.url_list);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rel2.encoded_type);
        protoAdapter.encodeWithTag(protoWriter, 3, rel2.media_type);
        protoAdapter.encodeWithTag(protoWriter, 4, rel2.logo_type);
        protoAdapter.encodeWithTag(protoWriter, 5, rel2.definition);
        protoAdapter.encodeWithTag(protoWriter, 6, rel2.quality);
        protoAdapter.encodeWithTag(protoWriter, 7, rel2.quality_desc);
        protoAdapter.encodeWithTag(protoWriter, 8, rel2.format);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 9, rel2.width);
        protoAdapter2.encodeWithTag(protoWriter, 10, rel2.height);
        protoAdapter2.encodeWithTag(protoWriter, 11, rel2.bitrate);
        protoAdapter.encodeWithTag(protoWriter, 12, rel2.codec_type);
        protoAdapter2.encodeWithTag(protoWriter, 13, rel2.size);
        protoAdapter2.encodeWithTag(protoWriter, 14, rel2.fps);
        protoAdapter.encodeWithTag(protoWriter, 15, rel2.file_id);
        protoAdapter.encodeWithTag(protoWriter, 16, rel2.file_hash);
        protoAdapter.encodeWithTag(protoWriter, 17, rel2.sub_info);
        protoAdapter2.encodeWithTag(protoWriter, 18, rel2.bandwidth);
        protoWriter.writeBytes(rel2.unknownFields());
    }
}
