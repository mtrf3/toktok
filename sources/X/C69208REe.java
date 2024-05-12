package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69208REe extends ProtoAdapter<C69280RGy> {
    public C69208REe() {
        super(FieldEncoding.LENGTH_DELIMITED, C69280RGy.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69280RGy decode(ProtoReader protoReader) {
        C69280RGy c69280RGy = new C69280RGy();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69280RGy.action_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c69280RGy.schema = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69280RGy.icon = REV.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69280RGy;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69280RGy c69280RGy) {
        C69280RGy c69280RGy2 = c69280RGy;
        return c69280RGy2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(3, c69280RGy2.action_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c69280RGy2.schema) + REV.ADAPTER.encodedSizeWithTag(1, c69280RGy2.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69280RGy c69280RGy) {
        C69280RGy c69280RGy2 = c69280RGy;
        REV.ADAPTER.encodeWithTag(protoWriter, 1, c69280RGy2.icon);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c69280RGy2.schema);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c69280RGy2.action_type);
        protoWriter.writeBytes(c69280RGy2.unknownFields());
    }
}
