package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDZ extends ProtoAdapter<C69255RFz> {
    public RDZ() {
        super(FieldEncoding.LENGTH_DELIMITED, C69255RFz.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69255RFz decode(ProtoReader protoReader) {
        C69255RFz c69255RFz = new C69255RFz();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69255RFz.uid = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        c69255RFz.avatar = REV.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        c69255RFz.nickname = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69255RFz.remark_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c69255RFz.avatar_larger = REV.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69255RFz.avatar_thumb = REV.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c69255RFz.follow_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        c69255RFz.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69255RFz;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69255RFz c69255RFz) {
        C69255RFz c69255RFz2 = c69255RFz;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c69255RFz2.uid);
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, c69255RFz2.avatar) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return c69255RFz2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(8, c69255RFz2.sec_uid) + ProtoAdapter.INT32.encodedSizeWithTag(7, c69255RFz2.follow_status) + protoAdapter.encodedSizeWithTag(6, c69255RFz2.avatar_thumb) + protoAdapter.encodedSizeWithTag(5, c69255RFz2.avatar_larger) + protoAdapter2.encodedSizeWithTag(4, c69255RFz2.remark_name) + protoAdapter2.encodedSizeWithTag(3, c69255RFz2.nickname) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69255RFz c69255RFz) {
        C69255RFz c69255RFz2 = c69255RFz;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c69255RFz2.uid);
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, c69255RFz2.avatar);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, c69255RFz2.nickname);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69255RFz2.remark_name);
        protoAdapter.encodeWithTag(protoWriter, 5, c69255RFz2.avatar_larger);
        protoAdapter.encodeWithTag(protoWriter, 6, c69255RFz2.avatar_thumb);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, c69255RFz2.follow_status);
        protoAdapter2.encodeWithTag(protoWriter, 8, c69255RFz2.sec_uid);
        protoWriter.writeBytes(c69255RFz2.unknownFields());
    }
}
