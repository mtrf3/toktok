package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFD extends ProtoAdapter<RH5> {
    public RFD() {
        super(FieldEncoding.LENGTH_DELIMITED, RH5.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RH5 decode(ProtoReader protoReader) {
        RH5 rh5 = new RH5();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                C1EW.LIZJ(protoReader, protoReader);
                            } else {
                                rh5.friend_type_str = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rh5.rec_type = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rh5.relation_text_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rh5.recommend_type = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rh5;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RH5 rh5) {
        RH5 rh52 = rh5;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, rh52.recommend_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rh52.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rh52.friend_type_str) + protoAdapter.encodedSizeWithTag(3, rh52.rec_type) + protoAdapter.encodedSizeWithTag(2, rh52.relation_text_key) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RH5 rh5) {
        RH5 rh52 = rh5;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, rh52.recommend_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rh52.relation_text_key);
        protoAdapter.encodeWithTag(protoWriter, 3, rh52.rec_type);
        protoAdapter.encodeWithTag(protoWriter, 4, rh52.friend_type_str);
        protoWriter.writeBytes(rh52.unknownFields());
    }
}
