package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class ROE extends ProtoAdapter<ROD> {
    public ROE() {
        super(FieldEncoding.LENGTH_DELIMITED, ROD.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ROD decode(ProtoReader protoReader) {
        ROD rod = new ROD();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rod.progress_bar_num = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rod.item_id = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rod;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ROD rod) {
        ROD rod2 = rod;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return rod2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rod2.progress_bar_num) + protoAdapter.encodedSizeWithTag(1, rod2.item_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ROD rod) {
        ROD rod2 = rod;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, rod2.item_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rod2.progress_bar_num);
        protoWriter.writeBytes(rod2.unknownFields());
    }
}
