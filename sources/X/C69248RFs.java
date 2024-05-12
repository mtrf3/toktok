package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RFs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69248RFs extends ProtoAdapter<RHT> {
    public C69248RFs() {
        super(FieldEncoding.LENGTH_DELIMITED, RHT.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHT decode(ProtoReader protoReader) {
        RHT rht = new RHT();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rht.bitrate_image = REV.ADAPTER.decode(protoReader);
                    }
                } else {
                    rht.name = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rht;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHT rht) {
        RHT rht2 = rht;
        return rht2.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(2, rht2.bitrate_image) + ProtoAdapter.STRING.encodedSizeWithTag(1, rht2.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHT rht) {
        RHT rht2 = rht;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rht2.name);
        REV.ADAPTER.encodeWithTag(protoWriter, 2, rht2.bitrate_image);
        protoWriter.writeBytes(rht2.unknownFields());
    }
}
