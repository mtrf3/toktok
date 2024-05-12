package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RLy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69410RLy extends ProtoAdapter<C69411RLz> {
    public C69410RLy() {
        super(FieldEncoding.LENGTH_DELIMITED, C69411RLz.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69411RLz decode(ProtoReader protoReader) {
        C69411RLz c69411RLz = new C69411RLz();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69411RLz.url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69411RLz.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69411RLz.place_holder = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69411RLz;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69411RLz c69411RLz) {
        C69411RLz c69411RLz2 = c69411RLz;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69411RLz2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, c69411RLz2.url) + protoAdapter.encodedSizeWithTag(2, c69411RLz2.text) + protoAdapter.encodedSizeWithTag(1, c69411RLz2.place_holder);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69411RLz c69411RLz) {
        C69411RLz c69411RLz2 = c69411RLz;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69411RLz2.place_holder);
        protoAdapter.encodeWithTag(protoWriter, 2, c69411RLz2.text);
        protoAdapter.encodeWithTag(protoWriter, 3, c69411RLz2.url);
        protoWriter.writeBytes(c69411RLz2.unknownFields());
    }
}
