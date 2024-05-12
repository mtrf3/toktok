package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RF1 extends ProtoAdapter<RG8> {
    public RF1() {
        super(FieldEncoding.LENGTH_DELIMITED, RG8.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RG8 decode(ProtoReader protoReader) {
        RG8 rg8 = new RG8();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rg8.tagged_users.add(RF0.ADAPTER.decode(protoReader));
                        }
                    } else {
                        rg8.video_label_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rg8.interest_level = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rg8;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RG8 rg8) {
        RG8 rg82 = rg8;
        return rg82.unknownFields().size() + RF0.ADAPTER.asRepeated().encodedSizeWithTag(3, rg82.tagged_users) + ProtoAdapter.STRING.encodedSizeWithTag(2, rg82.video_label_text) + ProtoAdapter.INT32.encodedSizeWithTag(1, rg82.interest_level);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RG8 rg8) {
        RG8 rg82 = rg8;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rg82.interest_level);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rg82.video_label_text);
        RF0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, rg82.tagged_users);
        protoWriter.writeBytes(rg82.unknownFields());
    }
}
