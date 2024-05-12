package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RMq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69428RMq extends ProtoAdapter<C69429RMr> {
    public C69428RMq() {
        super(FieldEncoding.LENGTH_DELIMITED, C69429RMr.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69429RMr decode(ProtoReader protoReader) {
        C69429RMr c69429RMr = new C69429RMr();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69429RMr.duration_ms = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c69429RMr.start_ms = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69429RMr;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69429RMr c69429RMr) {
        C69429RMr c69429RMr2 = c69429RMr;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return c69429RMr2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c69429RMr2.duration_ms) + protoAdapter.encodedSizeWithTag(1, c69429RMr2.start_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69429RMr c69429RMr) {
        C69429RMr c69429RMr2 = c69429RMr;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, c69429RMr2.start_ms);
        protoAdapter.encodeWithTag(protoWriter, 2, c69429RMr2.duration_ms);
        protoWriter.writeBytes(c69429RMr2.unknownFields());
    }
}
