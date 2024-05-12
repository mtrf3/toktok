package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RFj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69239RFj extends ProtoAdapter<RHI> {
    public C69239RFj() {
        super(FieldEncoding.LENGTH_DELIMITED, RHI.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHI decode(ProtoReader protoReader) {
        RHI rhi = new RHI();
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
                                rhi.original_sec_author_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rhi.original_item_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rhi.original_author_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rhi.original_author_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhi;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHI rhi) {
        RHI rhi2 = rhi;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhi2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rhi2.original_sec_author_id) + protoAdapter.encodedSizeWithTag(3, rhi2.original_item_id) + protoAdapter.encodedSizeWithTag(2, rhi2.original_author_name) + protoAdapter.encodedSizeWithTag(1, rhi2.original_author_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHI rhi) {
        RHI rhi2 = rhi;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rhi2.original_author_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rhi2.original_author_name);
        protoAdapter.encodeWithTag(protoWriter, 3, rhi2.original_item_id);
        protoAdapter.encodeWithTag(protoWriter, 4, rhi2.original_sec_author_id);
        protoWriter.writeBytes(rhi2.unknownFields());
    }
}
