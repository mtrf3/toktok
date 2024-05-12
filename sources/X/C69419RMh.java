package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RMh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69419RMh extends ProtoAdapter<C69420RMi> {
    public C69419RMh() {
        super(FieldEncoding.LENGTH_DELIMITED, C69420RMi.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69420RMi decode(ProtoReader protoReader) {
        C69420RMi c69420RMi = new C69420RMi();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69420RMi.can_not_cached = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    c69420RMi.event_track = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69420RMi;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69420RMi c69420RMi) {
        C69420RMi c69420RMi2 = c69420RMi;
        return c69420RMi2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(2, c69420RMi2.can_not_cached) + ProtoAdapter.STRING.encodedSizeWithTag(1, c69420RMi2.event_track);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69420RMi c69420RMi) {
        C69420RMi c69420RMi2 = c69420RMi;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c69420RMi2.event_track);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c69420RMi2.can_not_cached);
        protoWriter.writeBytes(c69420RMi2.unknownFields());
    }
}
