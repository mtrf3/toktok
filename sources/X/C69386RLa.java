package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RLa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69386RLa extends ProtoAdapter<C69387RLb> {
    public C69386RLa() {
        super(FieldEncoding.LENGTH_DELIMITED, C69387RLb.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69387RLb decode(ProtoReader protoReader) {
        C69387RLb c69387RLb = new C69387RLb();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69387RLb.tag_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69387RLb.related_tag = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69387RLb.content = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69387RLb;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69387RLb c69387RLb) {
        C69387RLb c69387RLb2 = c69387RLb;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69387RLb2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, c69387RLb2.tag_name) + protoAdapter.encodedSizeWithTag(2, c69387RLb2.related_tag) + protoAdapter.encodedSizeWithTag(1, c69387RLb2.content);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69387RLb c69387RLb) {
        C69387RLb c69387RLb2 = c69387RLb;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69387RLb2.content);
        protoAdapter.encodeWithTag(protoWriter, 2, c69387RLb2.related_tag);
        protoAdapter.encodeWithTag(protoWriter, 3, c69387RLb2.tag_name);
        protoWriter.writeBytes(c69387RLb2.unknownFields());
    }
}
