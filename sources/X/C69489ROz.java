package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.ROz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69489ROz extends ProtoAdapter<RP0> {
    public C69489ROz() {
        super(FieldEncoding.LENGTH_DELIMITED, RP0.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RP0 decode(ProtoReader protoReader) {
        RP0 rp0 = new RP0();
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
                                rp0.end_time = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            rp0.start_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        rp0.edition_no = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rp0.uid = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rp0;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RP0 rp0) {
        RP0 rp02 = rp0;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, rp02.edition_no) + ProtoAdapter.STRING.encodedSizeWithTag(1, rp02.uid);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return rp02.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rp02.end_time) + protoAdapter.encodedSizeWithTag(3, rp02.start_time) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RP0 rp0) {
        RP0 rp02 = rp0;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rp02.uid);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, rp02.edition_no);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, rp02.start_time);
        protoAdapter.encodeWithTag(protoWriter, 4, rp02.end_time);
        protoWriter.writeBytes(rp02.unknownFields());
    }
}
