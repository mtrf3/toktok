package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69180RDc extends ProtoAdapter<C69214REk> {
    public C69180RDc() {
        super(FieldEncoding.LENGTH_DELIMITED, C69214REk.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69214REk decode(ProtoReader protoReader) {
        C69214REk c69214REk = new C69214REk();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69214REk.uri = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69214REk.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 3:
                        c69214REk.width = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c69214REk.height = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69214REk.url_key = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c69214REk.data_size = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        c69214REk.file_hash = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c69214REk.file_cs = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        c69214REk.player_access_key = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69214REk;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69214REk c69214REk) {
        C69214REk c69214REk2 = c69214REk;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(2, c69214REk2.url_list) + protoAdapter.encodedSizeWithTag(1, c69214REk2.uri);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return c69214REk2.unknownFields().size() + protoAdapter.encodedSizeWithTag(9, c69214REk2.player_access_key) + protoAdapter.encodedSizeWithTag(8, c69214REk2.file_cs) + protoAdapter.encodedSizeWithTag(7, c69214REk2.file_hash) + ProtoAdapter.INT64.encodedSizeWithTag(6, c69214REk2.data_size) + protoAdapter.encodedSizeWithTag(5, c69214REk2.url_key) + protoAdapter2.encodedSizeWithTag(4, c69214REk2.height) + protoAdapter2.encodedSizeWithTag(3, c69214REk2.width) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69214REk c69214REk) {
    }
}
