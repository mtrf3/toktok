package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RPg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69496RPg extends ProtoAdapter<C69497RPh> {
    public C69496RPg() {
        super(FieldEncoding.LENGTH_DELIMITED, C69497RPh.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69497RPh decode(ProtoReader protoReader) {
        C69497RPh c69497RPh = new C69497RPh();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69497RPh.original_aweme_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        c69497RPh.stitch_trim_start_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c69497RPh.stitch_trim_end_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        c69497RPh.root_aweme_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c69497RPh.parent_aweme_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c69497RPh.is_restitch = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69497RPh;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69497RPh c69497RPh) {
        C69497RPh c69497RPh2 = c69497RPh;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, c69497RPh2.stitch_trim_end_time) + protoAdapter.encodedSizeWithTag(2, c69497RPh2.stitch_trim_start_time) + protoAdapter.encodedSizeWithTag(1, c69497RPh2.original_aweme_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return c69497RPh2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(6, c69497RPh2.is_restitch) + protoAdapter2.encodedSizeWithTag(5, c69497RPh2.parent_aweme_id) + protoAdapter2.encodedSizeWithTag(4, c69497RPh2.root_aweme_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69497RPh c69497RPh) {
        C69497RPh c69497RPh2 = c69497RPh;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, c69497RPh2.original_aweme_id);
        protoAdapter.encodeWithTag(protoWriter, 2, c69497RPh2.stitch_trim_start_time);
        protoAdapter.encodeWithTag(protoWriter, 3, c69497RPh2.stitch_trim_end_time);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, c69497RPh2.root_aweme_id);
        protoAdapter2.encodeWithTag(protoWriter, 5, c69497RPh2.parent_aweme_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, c69497RPh2.is_restitch);
        protoWriter.writeBytes(c69497RPh2.unknownFields());
    }
}
