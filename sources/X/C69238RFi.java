package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RFi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69238RFi extends ProtoAdapter<RHU> {
    public C69238RFi() {
        super(FieldEncoding.LENGTH_DELIMITED, RHU.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHU decode(ProtoReader protoReader) {
        RHU rhu = new RHU();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhu.info = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rhu.word_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rhu.word = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhu;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHU rhu) {
        RHU rhu2 = rhu;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhu2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rhu2.info) + protoAdapter.encodedSizeWithTag(2, rhu2.word_id) + protoAdapter.encodedSizeWithTag(1, rhu2.word);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHU rhu) {
        RHU rhu2 = rhu;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rhu2.word);
        protoAdapter.encodeWithTag(protoWriter, 2, rhu2.word_id);
        protoAdapter.encodeWithTag(protoWriter, 3, rhu2.info);
        protoWriter.writeBytes(rhu2.unknownFields());
    }
}
