package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RPx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69513RPx extends ProtoAdapter<C69512RPw> {
    public C69513RPx() {
        super(FieldEncoding.LENGTH_DELIMITED, C69512RPw.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69512RPw decode(ProtoReader protoReader) {
        C69512RPw c69512RPw = new C69512RPw();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                C1EW.LIZJ(protoReader, protoReader);
                            } else {
                                c69512RPw.action_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c69512RPw.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69512RPw.text_color = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69512RPw.body = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69512RPw;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69512RPw c69512RPw) {
        C69512RPw c69512RPw2 = c69512RPw;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69512RPw2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(4, c69512RPw2.action_type) + protoAdapter.encodedSizeWithTag(3, c69512RPw2.schema) + protoAdapter.encodedSizeWithTag(2, c69512RPw2.text_color) + protoAdapter.encodedSizeWithTag(1, c69512RPw2.body);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69512RPw c69512RPw) {
        C69512RPw c69512RPw2 = c69512RPw;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69512RPw2.body);
        protoAdapter.encodeWithTag(protoWriter, 2, c69512RPw2.text_color);
        protoAdapter.encodeWithTag(protoWriter, 3, c69512RPw2.schema);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c69512RPw2.action_type);
        protoWriter.writeBytes(c69512RPw2.unknownFields());
    }
}
