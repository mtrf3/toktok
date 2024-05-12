package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFK extends ProtoAdapter<RH2> {
    public RFK() {
        super(FieldEncoding.LENGTH_DELIMITED, RH2.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RH2 decode(ProtoReader protoReader) {
        RH2 rh2 = new RH2();
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
                                rh2.can_show_comment = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            rh2.can_comment = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        rh2.can_share = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    rh2.can_forward = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rh2;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RH2 rh2) {
        RH2 rh22 = rh2;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        return rh22.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rh22.can_show_comment) + protoAdapter.encodedSizeWithTag(3, rh22.can_comment) + protoAdapter.encodedSizeWithTag(2, rh22.can_share) + protoAdapter.encodedSizeWithTag(1, rh22.can_forward);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RH2 rh2) {
        RH2 rh22 = rh2;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, rh22.can_forward);
        protoAdapter.encodeWithTag(protoWriter, 2, rh22.can_share);
        protoAdapter.encodeWithTag(protoWriter, 3, rh22.can_comment);
        protoAdapter.encodeWithTag(protoWriter, 4, rh22.can_show_comment);
        protoWriter.writeBytes(rh22.unknownFields());
    }
}
