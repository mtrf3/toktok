package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RLd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69389RLd extends ProtoAdapter<C69390RLe> {
    public C69389RLd() {
        super(FieldEncoding.LENGTH_DELIMITED, C69390RLe.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69390RLe decode(ProtoReader protoReader) {
        C69390RLe c69390RLe = new C69390RLe();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69390RLe.size = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69390RLe.color = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69390RLe.text = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69390RLe;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69390RLe c69390RLe) {
        C69390RLe c69390RLe2 = c69390RLe;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69390RLe2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, c69390RLe2.size) + protoAdapter.encodedSizeWithTag(2, c69390RLe2.color) + protoAdapter.encodedSizeWithTag(1, c69390RLe2.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69390RLe c69390RLe) {
        C69390RLe c69390RLe2 = c69390RLe;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69390RLe2.text);
        protoAdapter.encodeWithTag(protoWriter, 2, c69390RLe2.color);
        protoAdapter.encodeWithTag(protoWriter, 3, c69390RLe2.size);
        protoWriter.writeBytes(c69390RLe2.unknownFields());
    }
}
