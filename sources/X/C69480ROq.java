package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.ROq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69480ROq extends ProtoAdapter<C69481ROr> {
    public C69480ROq() {
        super(FieldEncoding.LENGTH_DELIMITED, C69481ROr.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69481ROr decode(ProtoReader protoReader) {
        C69481ROr c69481ROr = new C69481ROr();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69481ROr.original_comment_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69481ROr.original_item_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69481ROr;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69481ROr c69481ROr) {
        C69481ROr c69481ROr2 = c69481ROr;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69481ROr2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c69481ROr2.original_comment_id) + protoAdapter.encodedSizeWithTag(1, c69481ROr2.original_item_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69481ROr c69481ROr) {
        C69481ROr c69481ROr2 = c69481ROr;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69481ROr2.original_item_id);
        protoAdapter.encodeWithTag(protoWriter, 2, c69481ROr2.original_comment_id);
        protoWriter.writeBytes(c69481ROr2.unknownFields());
    }
}
