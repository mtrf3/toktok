package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RNc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69440RNc extends ProtoAdapter<C69441RNd> {
    public C69440RNc() {
        super(FieldEncoding.LENGTH_DELIMITED, C69441RNd.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69441RNd decode(ProtoReader protoReader) {
        C69441RNd c69441RNd = new C69441RNd();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69441RNd.user_token = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69441RNd.developer_token = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69441RNd;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69441RNd c69441RNd) {
        C69441RNd c69441RNd2 = c69441RNd;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69441RNd2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c69441RNd2.user_token) + protoAdapter.encodedSizeWithTag(1, c69441RNd2.developer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69441RNd c69441RNd) {
        C69441RNd c69441RNd2 = c69441RNd;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69441RNd2.developer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, c69441RNd2.user_token);
        protoWriter.writeBytes(c69441RNd2.unknownFields());
    }
}
