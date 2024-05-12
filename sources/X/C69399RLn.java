package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RLn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69399RLn extends ProtoAdapter<C69398RLm> {
    public C69399RLn() {
        super(FieldEncoding.LENGTH_DELIMITED, C69398RLm.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69398RLm decode(ProtoReader protoReader) {
        C69398RLm c69398RLm = new C69398RLm();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69398RLm.resolution_button = RNU.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69398RLm.explain = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69398RLm.reason = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69398RLm;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69398RLm c69398RLm) {
        C69398RLm c69398RLm2 = c69398RLm;
        return c69398RLm2.unknownFields().size() + RNU.ADAPTER.encodedSizeWithTag(3, c69398RLm2.resolution_button) + ProtoAdapter.STRING.encodedSizeWithTag(2, c69398RLm2.explain) + ProtoAdapter.INT32.encodedSizeWithTag(1, c69398RLm2.reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69398RLm c69398RLm) {
        C69398RLm c69398RLm2 = c69398RLm;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69398RLm2.reason);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c69398RLm2.explain);
        RNU.ADAPTER.encodeWithTag(protoWriter, 3, c69398RLm2.resolution_button);
        protoWriter.writeBytes(c69398RLm2.unknownFields());
    }
}
