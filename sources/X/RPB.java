package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RPB extends ProtoAdapter<RPC> {
    public RPB() {
        super(FieldEncoding.LENGTH_DELIMITED, RPC.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RPC decode(ProtoReader protoReader) {
        RPC rpc = new RPC();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 5) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rpc.business_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rpc.component_key = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rpc;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RPC rpc) {
        RPC rpc2 = rpc;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rpc2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, rpc2.business_id) + protoAdapter.encodedSizeWithTag(1, rpc2.component_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RPC rpc) {
        RPC rpc2 = rpc;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rpc2.component_key);
        protoAdapter.encodeWithTag(protoWriter, 5, rpc2.business_id);
        protoWriter.writeBytes(rpc2.unknownFields());
    }
}
