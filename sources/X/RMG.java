package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RMG extends ProtoAdapter<RMH> {
    public RMG() {
        super(FieldEncoding.LENGTH_DELIMITED, RMH.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RMH decode(ProtoReader protoReader) {
        RMH rmh = new RMH();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rmh.group_release_date = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rmh.is_new_release_song = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rmh;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RMH rmh) {
        RMH rmh2 = rmh;
        return rmh2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(2, rmh2.group_release_date) + ProtoAdapter.BOOL.encodedSizeWithTag(1, rmh2.is_new_release_song);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RMH rmh) {
        RMH rmh2 = rmh;
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, rmh2.is_new_release_song);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, rmh2.group_release_date);
        protoWriter.writeBytes(rmh2.unknownFields());
    }
}
