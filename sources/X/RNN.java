package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RNN extends ProtoAdapter<RNO> {
    public RNN() {
        super(FieldEncoding.LENGTH_DELIMITED, RNO.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RNO decode(ProtoReader protoReader) {
        RNO rno = new RNO();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rno.body = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rno.title = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rno;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RNO rno) {
        RNO rno2 = rno;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rno2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rno2.body) + protoAdapter.encodedSizeWithTag(1, rno2.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RNO rno) {
        RNO rno2 = rno;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rno2.title);
        protoAdapter.encodeWithTag(protoWriter, 2, rno2.body);
        protoWriter.writeBytes(rno2.unknownFields());
    }
}
