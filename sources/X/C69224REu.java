package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69224REu extends ProtoAdapter<RH6> {
    public C69224REu() {
        super(FieldEncoding.LENGTH_DELIMITED, RH6.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RH6 decode(ProtoReader protoReader) {
        RH6 rh6 = new RH6();
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
                                rh6.type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            rh6.color_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rh6.color = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rh6.text = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rh6;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RH6 rh6) {
        RH6 rh62 = rh6;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rh62.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(4, rh62.type) + protoAdapter.encodedSizeWithTag(3, rh62.color_text) + protoAdapter.encodedSizeWithTag(2, rh62.color) + protoAdapter.encodedSizeWithTag(1, rh62.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RH6 rh6) {
        RH6 rh62 = rh6;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rh62.text);
        protoAdapter.encodeWithTag(protoWriter, 2, rh62.color);
        protoAdapter.encodeWithTag(protoWriter, 3, rh62.color_text);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, rh62.type);
        protoWriter.writeBytes(rh62.unknownFields());
    }
}
