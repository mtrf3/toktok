package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RL3 extends ProtoAdapter<RL4> {
    public RL3() {
        super(FieldEncoding.LENGTH_DELIMITED, RL4.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RL4 decode(ProtoReader protoReader) {
        RL4 rl4 = new RL4();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rl4.icon = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        rl4.link = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rl4.keyword = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rl4;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RL4 rl4) {
        RL4 rl42 = rl4;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rl42.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(3, rl42.icon) + protoAdapter.encodedSizeWithTag(2, rl42.link) + protoAdapter.encodedSizeWithTag(1, rl42.keyword);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RL4 rl4) {
        RL4 rl42 = rl4;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rl42.keyword);
        protoAdapter.encodeWithTag(protoWriter, 2, rl42.link);
        REV.ADAPTER.encodeWithTag(protoWriter, 3, rl42.icon);
        protoWriter.writeBytes(rl42.unknownFields());
    }
}
