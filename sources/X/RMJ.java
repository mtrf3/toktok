package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RMJ extends ProtoAdapter<RMK> {
    public RMJ() {
        super(FieldEncoding.LENGTH_DELIMITED, RMK.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RMK decode(ProtoReader protoReader) {
        RMK rmk = new RMK();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rmk.latest_unread_video_created_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rmk.unread_count = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rmk;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RMK rmk) {
        RMK rmk2 = rmk;
        return rmk2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(2, rmk2.latest_unread_video_created_time) + ProtoAdapter.INT32.encodedSizeWithTag(1, rmk2.unread_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RMK rmk) {
        RMK rmk2 = rmk;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rmk2.unread_count);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, rmk2.latest_unread_video_created_time);
        protoWriter.writeBytes(rmk2.unknownFields());
    }
}
