package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69187RDj extends ProtoAdapter<RG5> {
    public C69187RDj() {
        super(FieldEncoding.LENGTH_DELIMITED, RG5.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RG5 decode(ProtoReader protoReader) {
        RG5 rg5 = new RG5();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rg5.lang = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rg5.language_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        rg5.language_code = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rg5.can_translate_realtime = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 5:
                        rg5.original_caption_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        rg5.is_burnin_caption = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        rg5.can_translate_realtime_skip_translation_lang_check = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rg5;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RG5 rg5) {
        RG5 rg52 = rg5;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, rg52.language_code) + ProtoAdapter.INT64.encodedSizeWithTag(2, rg52.language_id) + protoAdapter.encodedSizeWithTag(1, rg52.lang);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return rg52.unknownFields().size() + protoAdapter2.encodedSizeWithTag(7, rg52.can_translate_realtime_skip_translation_lang_check) + protoAdapter2.encodedSizeWithTag(6, rg52.is_burnin_caption) + ProtoAdapter.INT32.encodedSizeWithTag(5, rg52.original_caption_type) + protoAdapter2.encodedSizeWithTag(4, rg52.can_translate_realtime) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RG5 rg5) {
        RG5 rg52 = rg5;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rg52.lang);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, rg52.language_id);
        protoAdapter.encodeWithTag(protoWriter, 3, rg52.language_code);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 4, rg52.can_translate_realtime);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, rg52.original_caption_type);
        protoAdapter2.encodeWithTag(protoWriter, 6, rg52.is_burnin_caption);
        protoAdapter2.encodeWithTag(protoWriter, 7, rg52.can_translate_realtime_skip_translation_lang_check);
        protoWriter.writeBytes(rg52.unknownFields());
    }
}
