package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69218REo extends ProtoAdapter<RH1> {
    public C69218REo() {
        super(FieldEncoding.LENGTH_DELIMITED, RH1.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RH1 decode(ProtoReader protoReader) {
        RH1 rh1 = new RH1();
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
                                rh1.end = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            rh1.begin = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rh1.link = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rh1.query = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rh1;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RH1 rh1) {
        RH1 rh12 = rh1;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, rh12.link) + protoAdapter.encodedSizeWithTag(1, rh12.query);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return rh12.unknownFields().size() + protoAdapter2.encodedSizeWithTag(4, rh12.end) + protoAdapter2.encodedSizeWithTag(3, rh12.begin) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RH1 rh1) {
        RH1 rh12 = rh1;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rh12.query);
        protoAdapter.encodeWithTag(protoWriter, 2, rh12.link);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, rh12.begin);
        protoAdapter2.encodeWithTag(protoWriter, 4, rh12.end);
        protoWriter.writeBytes(rh12.unknownFields());
    }
}
