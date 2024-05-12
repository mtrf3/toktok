package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RMM extends ProtoAdapter<RMN> {
    public RMM() {
        super(FieldEncoding.LENGTH_DELIMITED, RMN.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RMN decode(ProtoReader protoReader) {
        RMN rmn = new RMN();
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
                                rmn.color_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rmn.color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rmn.label = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rmn.boost_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rmn;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RMN rmn) {
        RMN rmn2 = rmn;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, rmn2.boost_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rmn2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rmn2.color_text) + protoAdapter.encodedSizeWithTag(3, rmn2.color) + protoAdapter.encodedSizeWithTag(2, rmn2.label) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RMN rmn) {
        RMN rmn2 = rmn;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rmn2.boost_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rmn2.label);
        protoAdapter.encodeWithTag(protoWriter, 3, rmn2.color);
        protoAdapter.encodeWithTag(protoWriter, 4, rmn2.color_text);
        protoWriter.writeBytes(rmn2.unknownFields());
    }
}
