package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFC extends ProtoAdapter<RHH> {
    public RFC() {
        super(FieldEncoding.LENGTH_DELIMITED, RHH.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHH decode(ProtoReader protoReader) {
        RHH rhh = new RHH();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhh.full_synced = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        rhh.nickname = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rhh.platform_name = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhh;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHH rhh) {
        RHH rhh2 = rhh;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhh2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(3, rhh2.full_synced) + protoAdapter.encodedSizeWithTag(2, rhh2.nickname) + protoAdapter.encodedSizeWithTag(1, rhh2.platform_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHH rhh) {
        RHH rhh2 = rhh;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rhh2.platform_name);
        protoAdapter.encodeWithTag(protoWriter, 2, rhh2.nickname);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, rhh2.full_synced);
        protoWriter.writeBytes(rhh2.unknownFields());
    }
}
