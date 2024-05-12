package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDD extends ProtoAdapter<C69204REa> {
    public RDD() {
        super(FieldEncoding.LENGTH_DELIMITED, C69204REa.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69204REa decode(ProtoReader protoReader) {
        C69204REa c69204REa = new C69204REa();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 23) {
                    switch (nextTag) {
                        case 1:
                            c69204REa.start = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c69204REa.end = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c69204REa.user_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c69204REa.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c69204REa.hashtag_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c69204REa.hashtag_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c69204REa.is_commerce = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c69204REa.hashTagName = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            c69204REa.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            c69204REa.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            c69204REa.sub_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 12:
                            c69204REa.question_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            c69204REa.line_idx = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            C1EW.LIZJ(protoReader, protoReader);
                            break;
                    }
                } else {
                    c69204REa.tag_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69204REa;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69204REa c69204REa) {
        C69204REa c69204REa2 = c69204REa;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, c69204REa2.end) + protoAdapter.encodedSizeWithTag(1, c69204REa2.start);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return c69204REa2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(23, c69204REa2.tag_id) + protoAdapter.encodedSizeWithTag(13, c69204REa2.line_idx) + ProtoAdapter.INT64.encodedSizeWithTag(12, c69204REa2.question_id) + protoAdapter.encodedSizeWithTag(11, c69204REa2.sub_type) + protoAdapter2.encodedSizeWithTag(10, c69204REa2.aweme_id) + protoAdapter2.encodedSizeWithTag(9, c69204REa2.sec_uid) + protoAdapter2.encodedSizeWithTag(8, c69204REa2.hashTagName) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c69204REa2.is_commerce) + protoAdapter2.encodedSizeWithTag(6, c69204REa2.hashtag_id) + protoAdapter2.encodedSizeWithTag(5, c69204REa2.hashtag_name) + protoAdapter.encodedSizeWithTag(4, c69204REa2.type) + protoAdapter2.encodedSizeWithTag(3, c69204REa2.user_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69204REa c69204REa) {
        C69204REa c69204REa2 = c69204REa;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69204REa2.start);
        protoAdapter.encodeWithTag(protoWriter, 2, c69204REa2.end);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, c69204REa2.user_id);
        protoAdapter.encodeWithTag(protoWriter, 4, c69204REa2.type);
        protoAdapter2.encodeWithTag(protoWriter, 5, c69204REa2.hashtag_name);
        protoAdapter2.encodeWithTag(protoWriter, 6, c69204REa2.hashtag_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, c69204REa2.is_commerce);
        protoAdapter2.encodeWithTag(protoWriter, 8, c69204REa2.hashTagName);
        protoAdapter2.encodeWithTag(protoWriter, 9, c69204REa2.sec_uid);
        protoAdapter2.encodeWithTag(protoWriter, 10, c69204REa2.aweme_id);
        protoAdapter.encodeWithTag(protoWriter, 11, c69204REa2.sub_type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, c69204REa2.question_id);
        protoAdapter.encodeWithTag(protoWriter, 13, c69204REa2.line_idx);
        protoAdapter2.encodeWithTag(protoWriter, 23, c69204REa2.tag_id);
        protoWriter.writeBytes(c69204REa2.unknownFields());
    }
}
