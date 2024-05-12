package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDL extends ProtoAdapter<REV> {
    public RDL() {
        super(FieldEncoding.LENGTH_DELIMITED, REV.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final REV decode(ProtoReader protoReader) {
        REV rev = new REV();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rev.uri = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rev.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 3:
                        rev.width = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        rev.height = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        rev.url_key = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rev.data_size = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        rev.file_hash = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rev.file_cs = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        rev.player_access_key = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        rev.file_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rev;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(REV rev) {
        REV rev2 = rev;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(2, rev2.url_list) + protoAdapter.encodedSizeWithTag(1, rev2.uri);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return rev2.unknownFields().size() + protoAdapter.encodedSizeWithTag(10, rev2.file_id) + protoAdapter.encodedSizeWithTag(9, rev2.player_access_key) + protoAdapter.encodedSizeWithTag(8, rev2.file_cs) + protoAdapter.encodedSizeWithTag(7, rev2.file_hash) + ProtoAdapter.INT64.encodedSizeWithTag(6, rev2.data_size) + protoAdapter.encodedSizeWithTag(5, rev2.url_key) + protoAdapter2.encodedSizeWithTag(4, rev2.height) + protoAdapter2.encodedSizeWithTag(3, rev2.width) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, REV rev) {
        REV rev2 = rev;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rev2.uri);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, rev2.url_list);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, rev2.width);
        protoAdapter2.encodeWithTag(protoWriter, 4, rev2.height);
        protoAdapter.encodeWithTag(protoWriter, 5, rev2.url_key);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, rev2.data_size);
        protoAdapter.encodeWithTag(protoWriter, 7, rev2.file_hash);
        protoAdapter.encodeWithTag(protoWriter, 8, rev2.file_cs);
        protoAdapter.encodeWithTag(protoWriter, 9, rev2.player_access_key);
        protoAdapter.encodeWithTag(protoWriter, 10, rev2.file_id);
        protoWriter.writeBytes(rev2.unknownFields());
    }
}
