package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69203RDz extends ProtoAdapter<C69252RFw> {
    public C69203RDz() {
        super(FieldEncoding.LENGTH_DELIMITED, C69252RFw.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69252RFw decode(ProtoReader protoReader) {
        C69252RFw c69252RFw = new C69252RFw();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    C1EW.LIZJ(protoReader, protoReader);
                                } else {
                                    c69252RFw.subtitle = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c69252RFw.options.add(C69241RFl.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c69252RFw.title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69252RFw.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69252RFw.id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69252RFw;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69252RFw c69252RFw) {
        C69252RFw c69252RFw2 = c69252RFw;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69252RFw2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, c69252RFw2.subtitle) + C69241RFl.ADAPTER.asRepeated().encodedSizeWithTag(4, c69252RFw2.options) + protoAdapter.encodedSizeWithTag(3, c69252RFw2.title) + ProtoAdapter.INT32.encodedSizeWithTag(2, c69252RFw2.type) + protoAdapter.encodedSizeWithTag(1, c69252RFw2.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69252RFw c69252RFw) {
        C69252RFw c69252RFw2 = c69252RFw;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69252RFw2.id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c69252RFw2.type);
        protoAdapter.encodeWithTag(protoWriter, 3, c69252RFw2.title);
        C69241RFl.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c69252RFw2.options);
        protoAdapter.encodeWithTag(protoWriter, 5, c69252RFw2.subtitle);
        protoWriter.writeBytes(c69252RFw2.unknownFields());
    }
}
