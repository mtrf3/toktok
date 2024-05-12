package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFE extends ProtoAdapter<RHQ> {
    public RFE() {
        super(FieldEncoding.LENGTH_DELIMITED, RHQ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHQ decode(ProtoReader protoReader) {
        RHQ rhq = new RHQ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhq.avatar_medium = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        rhq.nickname = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rhq.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhq;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHQ rhq) {
        RHQ rhq2 = rhq;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhq2.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(3, rhq2.avatar_medium) + protoAdapter.encodedSizeWithTag(2, rhq2.nickname) + protoAdapter.encodedSizeWithTag(1, rhq2.sec_uid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHQ rhq) {
        RHQ rhq2 = rhq;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rhq2.sec_uid);
        protoAdapter.encodeWithTag(protoWriter, 2, rhq2.nickname);
        REV.ADAPTER.encodeWithTag(protoWriter, 3, rhq2.avatar_medium);
        protoWriter.writeBytes(rhq2.unknownFields());
    }
}
