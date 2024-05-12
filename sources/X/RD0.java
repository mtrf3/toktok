package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RD0 extends ProtoAdapter<C69181RDd> {
    public RD0() {
        super(FieldEncoding.LENGTH_DELIMITED, C69181RDd.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69181RDd decode(ProtoReader protoReader) {
        C69181RDd c69181RDd = new C69181RDd();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69181RDd.has_original_audio = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        c69181RDd.enable_auto_caption = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c69181RDd.original_language_info = RG5.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        c69181RDd.caption_infos.add(C69216REm.ADAPTER.decode(protoReader));
                        break;
                    case 5:
                        c69181RDd.creator_edited_caption_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c69181RDd.vertical_positions.add(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 7:
                        c69181RDd.position = C69408RLw.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69181RDd.appearance = RD2.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69181RDd.hide_original_caption = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 10:
                        c69181RDd.captions_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69181RDd.no_caption_reason = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69181RDd;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69181RDd c69181RDd) {
        C69181RDd c69181RDd2 = c69181RDd;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c69181RDd2.unknownFields().size() + protoAdapter.encodedSizeWithTag(11, c69181RDd2.no_caption_reason) + protoAdapter.encodedSizeWithTag(10, c69181RDd2.captions_type) + ProtoAdapter.BOOL.encodedSizeWithTag(9, c69181RDd2.hide_original_caption) + RD2.ADAPTER.encodedSizeWithTag(8, c69181RDd2.appearance) + C69408RLw.ADAPTER.encodedSizeWithTag(7, c69181RDd2.position) + ProtoAdapter.FLOAT.asRepeated().encodedSizeWithTag(6, c69181RDd2.vertical_positions) + ProtoAdapter.INT64.encodedSizeWithTag(5, c69181RDd2.creator_edited_caption_id) + C69216REm.ADAPTER.asRepeated().encodedSizeWithTag(4, c69181RDd2.caption_infos) + RG5.ADAPTER.encodedSizeWithTag(3, c69181RDd2.original_language_info) + protoAdapter.encodedSizeWithTag(2, c69181RDd2.enable_auto_caption) + protoAdapter.encodedSizeWithTag(1, c69181RDd2.has_original_audio);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69181RDd c69181RDd) {
        C69181RDd c69181RDd2 = c69181RDd;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69181RDd2.has_original_audio);
        protoAdapter.encodeWithTag(protoWriter, 2, c69181RDd2.enable_auto_caption);
        RG5.ADAPTER.encodeWithTag(protoWriter, 3, c69181RDd2.original_language_info);
        C69216REm.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c69181RDd2.caption_infos);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c69181RDd2.creator_edited_caption_id);
        ProtoAdapter.FLOAT.asRepeated().encodeWithTag(protoWriter, 6, c69181RDd2.vertical_positions);
        C69408RLw.ADAPTER.encodeWithTag(protoWriter, 7, c69181RDd2.position);
        RD2.ADAPTER.encodeWithTag(protoWriter, 8, c69181RDd2.appearance);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, c69181RDd2.hide_original_caption);
        protoAdapter.encodeWithTag(protoWriter, 10, c69181RDd2.captions_type);
        protoAdapter.encodeWithTag(protoWriter, 11, c69181RDd2.no_caption_reason);
        protoWriter.writeBytes(c69181RDd2.unknownFields());
    }
}
