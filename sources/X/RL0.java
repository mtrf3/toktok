package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RL0 extends ProtoAdapter<RL1> {
    public RL0() {
        super(FieldEncoding.LENGTH_DELIMITED, RL1.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RL1 decode(ProtoReader protoReader) {
        RL1 rl1 = new RL1();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rl1.action = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rl1.icon = REV.ADAPTER.decode(protoReader);
                    }
                } else {
                    rl1.text = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rl1;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RL1 rl1) {
        RL1 rl12 = rl1;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rl12.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rl12.action) + REV.ADAPTER.encodedSizeWithTag(2, rl12.icon) + protoAdapter.encodedSizeWithTag(1, rl12.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RL1 rl1) {
        RL1 rl12 = rl1;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rl12.text);
        REV.ADAPTER.encodeWithTag(protoWriter, 2, rl12.icon);
        protoAdapter.encodeWithTag(protoWriter, 3, rl12.action);
        protoWriter.writeBytes(rl12.unknownFields());
    }
}
