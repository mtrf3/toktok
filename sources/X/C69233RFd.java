package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RFd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69233RFd extends ProtoAdapter<RGQ> {
    public C69233RFd() {
        super(FieldEncoding.LENGTH_DELIMITED, RGQ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGQ decode(ProtoReader protoReader) {
        RGQ rgq = new RGQ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rgq.followers.add(C69232RFc.ADAPTER.decode(protoReader));
                    }
                } else {
                    rgq.sprint = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgq;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGQ rgq) {
        RGQ rgq2 = rgq;
        return rgq2.unknownFields().size() + C69232RFc.ADAPTER.asRepeated().encodedSizeWithTag(2, rgq2.followers) + ProtoAdapter.INT32.encodedSizeWithTag(1, rgq2.sprint);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGQ rgq) {
        RGQ rgq2 = rgq;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rgq2.sprint);
        C69232RFc.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, rgq2.followers);
        protoWriter.writeBytes(rgq2.unknownFields());
    }
}
