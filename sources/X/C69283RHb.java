package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RHb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69283RHb extends ProtoAdapter<C69282RHa> {
    public C69283RHb() {
        super(FieldEncoding.LENGTH_DELIMITED, C69282RHa.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69282RHa decode(ProtoReader protoReader) {
        C69282RHa c69282RHa = new C69282RHa();
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
                                c69282RHa.pop_window = C69368RKi.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c69282RHa.url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69282RHa.btn_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69282RHa.module_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69282RHa;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69282RHa c69282RHa) {
        C69282RHa c69282RHa2 = c69282RHa;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c69282RHa2.module_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69282RHa2.unknownFields().size() + C69368RKi.ADAPTER.encodedSizeWithTag(4, c69282RHa2.pop_window) + protoAdapter.encodedSizeWithTag(3, c69282RHa2.url) + protoAdapter.encodedSizeWithTag(2, c69282RHa2.btn_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69282RHa c69282RHa) {
        C69282RHa c69282RHa2 = c69282RHa;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69282RHa2.module_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, c69282RHa2.btn_text);
        protoAdapter.encodeWithTag(protoWriter, 3, c69282RHa2.url);
        C69368RKi.ADAPTER.encodeWithTag(protoWriter, 4, c69282RHa2.pop_window);
        protoWriter.writeBytes(c69282RHa2.unknownFields());
    }
}
