package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RPX extends ProtoAdapter<RPY> {
    public RPX() {
        super(FieldEncoding.LENGTH_DELIMITED, RPY.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RPY decode(ProtoReader protoReader) {
        RPY rpy = new RPY();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rpy.link_info = C69491RPb.ADAPTER.decode(protoReader);
                    }
                } else {
                    rpy.review_status = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rpy;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RPY rpy) {
        RPY rpy2 = rpy;
        return rpy2.unknownFields().size() + C69491RPb.ADAPTER.encodedSizeWithTag(2, rpy2.link_info) + ProtoAdapter.INT32.encodedSizeWithTag(1, rpy2.review_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RPY rpy) {
        RPY rpy2 = rpy;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rpy2.review_status);
        C69491RPb.ADAPTER.encodeWithTag(protoWriter, 2, rpy2.link_info);
        protoWriter.writeBytes(rpy2.unknownFields());
    }
}
