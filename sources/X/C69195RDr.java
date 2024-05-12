package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69195RDr extends ProtoAdapter<C69249RFt> {
    public C69195RDr() {
        super(FieldEncoding.LENGTH_DELIMITED, C69249RFt.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69249RFt decode(ProtoReader protoReader) {
        C69249RFt c69249RFt = new C69249RFt();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69249RFt.words.add(RHU.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        c69249RFt.icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        c69249RFt.scene = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69249RFt.hint_text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c69249RFt.extra_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c69249RFt.qrec_virtual_enable = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69249RFt;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69249RFt c69249RFt) {
        C69249RFt c69249RFt2 = c69249RFt;
        int encodedSizeWithTag = REV.ADAPTER.encodedSizeWithTag(2, c69249RFt2.icon_url) + RHU.ADAPTER.asRepeated().encodedSizeWithTag(1, c69249RFt2.words);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69249RFt2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, c69249RFt2.qrec_virtual_enable) + protoAdapter.encodedSizeWithTag(5, c69249RFt2.extra_info) + protoAdapter.encodedSizeWithTag(4, c69249RFt2.hint_text) + protoAdapter.encodedSizeWithTag(3, c69249RFt2.scene) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69249RFt c69249RFt) {
        C69249RFt c69249RFt2 = c69249RFt;
        RHU.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c69249RFt2.words);
        REV.ADAPTER.encodeWithTag(protoWriter, 2, c69249RFt2.icon_url);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, c69249RFt2.scene);
        protoAdapter.encodeWithTag(protoWriter, 4, c69249RFt2.hint_text);
        protoAdapter.encodeWithTag(protoWriter, 5, c69249RFt2.extra_info);
        protoAdapter.encodeWithTag(protoWriter, 6, c69249RFt2.qrec_virtual_enable);
        protoWriter.writeBytes(c69249RFt2.unknownFields());
    }
}
