package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RES extends ProtoAdapter<RGJ> {
    public RES() {
        super(FieldEncoding.LENGTH_DELIMITED, RGJ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGJ decode(ProtoReader protoReader) {
        RGJ rgj = new RGJ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            switch (nextTag) {
                                case 10:
                                    rgj.is_official = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                    rgj.viewer_count = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 12:
                                    rgj.chat_disabled = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                    rgj.story_style_version = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                default:
                                    C1EW.LIZJ(protoReader, protoReader);
                                    break;
                            }
                        } else {
                            rgj.total_comments = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        rgj.viewed = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    rgj.expired_at = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgj;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGJ rgj) {
        RGJ rgj2 = rgj;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rgj2.expired_at);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return rgj2.unknownFields().size() + protoAdapter.encodedSizeWithTag(13, rgj2.story_style_version) + protoAdapter2.encodedSizeWithTag(12, rgj2.chat_disabled) + protoAdapter.encodedSizeWithTag(11, rgj2.viewer_count) + protoAdapter2.encodedSizeWithTag(10, rgj2.is_official) + protoAdapter.encodedSizeWithTag(3, rgj2.total_comments) + protoAdapter2.encodedSizeWithTag(2, rgj2.viewed) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGJ rgj) {
        RGJ rgj2 = rgj;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, rgj2.expired_at);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 2, rgj2.viewed);
        protoAdapter.encodeWithTag(protoWriter, 3, rgj2.total_comments);
        protoAdapter2.encodeWithTag(protoWriter, 10, rgj2.is_official);
        protoAdapter.encodeWithTag(protoWriter, 11, rgj2.viewer_count);
        protoAdapter2.encodeWithTag(protoWriter, 12, rgj2.chat_disabled);
        protoAdapter.encodeWithTag(protoWriter, 13, rgj2.story_style_version);
        protoWriter.writeBytes(rgj2.unknownFields());
    }
}
