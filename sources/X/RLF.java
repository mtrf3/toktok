package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RLF extends ProtoAdapter<RLG> {
    public RLF() {
        super(FieldEncoding.LENGTH_DELIMITED, RLG.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RLG decode(ProtoReader protoReader) {
        RLG rlg = new RLG();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rlg.status = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rlg.hashtag_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rlg.hashtag_name = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rlg;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RLG rlg) {
        RLG rlg2 = rlg;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rlg2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(3, rlg2.status) + protoAdapter.encodedSizeWithTag(2, rlg2.hashtag_id) + protoAdapter.encodedSizeWithTag(1, rlg2.hashtag_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RLG rlg) {
        RLG rlg2 = rlg;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rlg2.hashtag_name);
        protoAdapter.encodeWithTag(protoWriter, 2, rlg2.hashtag_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, rlg2.status);
        protoWriter.writeBytes(rlg2.unknownFields());
    }
}
