package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RD6 extends ProtoAdapter<C69216REm> {
    public RD6() {
        super(FieldEncoding.LENGTH_DELIMITED, C69216REm.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69216REm decode(ProtoReader protoReader) {
        C69216REm c69216REm = new C69216REm();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69216REm.lang = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69216REm.language_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c69216REm.url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69216REm.expire = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        c69216REm.caption_format = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c69216REm.complaint_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        c69216REm.is_auto_generated = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 8:
                        c69216REm.sub_id = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        c69216REm.sub_version = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        c69216REm.cla_subtitle_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69216REm.translator_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 12:
                        c69216REm.language_code = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69216REm.is_original_caption = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69216REm;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69216REm c69216REm) {
        C69216REm c69216REm2 = c69216REm;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69216REm2.lang);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, c69216REm2.complaint_id) + protoAdapter.encodedSizeWithTag(5, c69216REm2.caption_format) + protoAdapter2.encodedSizeWithTag(4, c69216REm2.expire) + protoAdapter.encodedSizeWithTag(3, c69216REm2.url) + protoAdapter2.encodedSizeWithTag(2, c69216REm2.language_id) + encodedSizeWithTag;
        ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
        return c69216REm2.unknownFields().size() + protoAdapter3.encodedSizeWithTag(13, c69216REm2.is_original_caption) + protoAdapter.encodedSizeWithTag(12, c69216REm2.language_code) + protoAdapter2.encodedSizeWithTag(11, c69216REm2.translator_id) + protoAdapter2.encodedSizeWithTag(10, c69216REm2.cla_subtitle_id) + protoAdapter.encodedSizeWithTag(9, c69216REm2.sub_version) + ProtoAdapter.INT32.encodedSizeWithTag(8, c69216REm2.sub_id) + protoAdapter3.encodedSizeWithTag(7, c69216REm2.is_auto_generated) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69216REm c69216REm) {
        C69216REm c69216REm2 = c69216REm;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69216REm2.lang);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, c69216REm2.language_id);
        protoAdapter.encodeWithTag(protoWriter, 3, c69216REm2.url);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69216REm2.expire);
        protoAdapter.encodeWithTag(protoWriter, 5, c69216REm2.caption_format);
        protoAdapter2.encodeWithTag(protoWriter, 6, c69216REm2.complaint_id);
        ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 7, c69216REm2.is_auto_generated);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, c69216REm2.sub_id);
        protoAdapter.encodeWithTag(protoWriter, 9, c69216REm2.sub_version);
        protoAdapter2.encodeWithTag(protoWriter, 10, c69216REm2.cla_subtitle_id);
        protoAdapter2.encodeWithTag(protoWriter, 11, c69216REm2.translator_id);
        protoAdapter.encodeWithTag(protoWriter, 12, c69216REm2.language_code);
        protoAdapter3.encodeWithTag(protoWriter, 13, c69216REm2.is_original_caption);
        protoWriter.writeBytes(c69216REm2.unknownFields());
    }
}
