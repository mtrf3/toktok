package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFM extends ProtoAdapter<RH4> {
    public RFM() {
        super(FieldEncoding.LENGTH_DELIMITED, RH4.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RH4 decode(ProtoReader protoReader) {
        RH4 rh4 = new RH4();
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
                                rh4.share_toast = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            rh4.shop_toast = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rh4.original_list = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rh4.follow_toast = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rh4;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RH4 rh4) {
        RH4 rh42 = rh4;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rh42.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rh42.share_toast) + protoAdapter.encodedSizeWithTag(3, rh42.shop_toast) + protoAdapter.encodedSizeWithTag(2, rh42.original_list) + protoAdapter.encodedSizeWithTag(1, rh42.follow_toast);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RH4 rh4) {
        RH4 rh42 = rh4;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rh42.follow_toast);
        protoAdapter.encodeWithTag(protoWriter, 2, rh42.original_list);
        protoAdapter.encodeWithTag(protoWriter, 3, rh42.shop_toast);
        protoAdapter.encodeWithTag(protoWriter, 4, rh42.share_toast);
        protoWriter.writeBytes(rh42.unknownFields());
    }
}
