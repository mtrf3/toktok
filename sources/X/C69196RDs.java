package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69196RDs extends ProtoAdapter<C69241RFl> {
    public C69196RDs() {
        super(FieldEncoding.LENGTH_DELIMITED, C69241RFl.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69241RFl decode(ProtoReader protoReader) {
        C69241RFl c69241RFl = new C69241RFl();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    if (nextTag != 7) {
                                        C1EW.LIZJ(protoReader, protoReader);
                                    } else {
                                        c69241RFl.extra = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c69241RFl.questions.add(C69252RFw.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c69241RFl.additional_content = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69241RFl.type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c69241RFl.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69241RFl.id = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69241RFl;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69241RFl c69241RFl) {
        C69241RFl c69241RFl2 = c69241RFl;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69241RFl2.id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return c69241RFl2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(7, c69241RFl2.extra) + C69252RFw.ADAPTER.asRepeated().encodedSizeWithTag(5, c69241RFl2.questions) + protoAdapter2.encodedSizeWithTag(4, c69241RFl2.additional_content) + protoAdapter.encodedSizeWithTag(3, c69241RFl2.type) + protoAdapter2.encodedSizeWithTag(2, c69241RFl2.name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69241RFl c69241RFl) {
        C69241RFl c69241RFl2 = c69241RFl;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69241RFl2.id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, c69241RFl2.name);
        protoAdapter.encodeWithTag(protoWriter, 3, c69241RFl2.type);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69241RFl2.additional_content);
        C69252RFw.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c69241RFl2.questions);
        protoAdapter2.encodeWithTag(protoWriter, 7, c69241RFl2.extra);
        protoWriter.writeBytes(c69241RFl2.unknownFields());
    }
}
