package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class ROS extends ProtoAdapter<ROT> {
    public ROS() {
        super(FieldEncoding.LENGTH_DELIMITED, ROT.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ROT decode(ProtoReader protoReader) {
        ROT rot = new ROT();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    rot.show_review_tab = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rot;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ROT rot) {
        ROT rot2 = rot;
        return rot2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(1, rot2.show_review_tab);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ROT rot) {
        ROT rot2 = rot;
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, rot2.show_review_tab);
        protoWriter.writeBytes(rot2.unknownFields());
    }
}
