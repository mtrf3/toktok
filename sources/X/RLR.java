package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RLR extends ProtoAdapter<RLS> {
    public RLR() {
        super(FieldEncoding.LENGTH_DELIMITED, RLS.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RLS decode(ProtoReader protoReader) {
        RLS rls = new RLS();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rls.trans_bg_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rls.enter_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rls.process_text = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rls;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RLS rls) {
        RLS rls2 = rls;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rls2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rls2.trans_bg_text) + protoAdapter.encodedSizeWithTag(2, rls2.enter_text) + protoAdapter.encodedSizeWithTag(1, rls2.process_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RLS rls) {
        RLS rls2 = rls;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rls2.process_text);
        protoAdapter.encodeWithTag(protoWriter, 2, rls2.enter_text);
        protoAdapter.encodeWithTag(protoWriter, 3, rls2.trans_bg_text);
        protoWriter.writeBytes(rls2.unknownFields());
    }
}
