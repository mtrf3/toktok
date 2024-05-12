package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RL6 extends ProtoAdapter<RL7> {
    public RL6() {
        super(FieldEncoding.LENGTH_DELIMITED, RL7.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RL7 decode(ProtoReader protoReader) {
        RL7 rl7 = new RL7();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rl7.wait_time = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rl7.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rl7.image_url = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rl7;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RL7 rl7) {
        RL7 rl72 = rl7;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rl72.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(3, rl72.wait_time) + protoAdapter.encodedSizeWithTag(2, rl72.text) + protoAdapter.encodedSizeWithTag(1, rl72.image_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RL7 rl7) {
        RL7 rl72 = rl7;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rl72.image_url);
        protoAdapter.encodeWithTag(protoWriter, 2, rl72.text);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, rl72.wait_time);
        protoWriter.writeBytes(rl72.unknownFields());
    }
}
