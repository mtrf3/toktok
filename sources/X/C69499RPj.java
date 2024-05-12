package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RPj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69499RPj extends ProtoAdapter<C69500RPk> {
    public C69499RPj() {
        super(FieldEncoding.LENGTH_DELIMITED, C69500RPk.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69500RPk decode(ProtoReader protoReader) {
        C69500RPk c69500RPk = new C69500RPk();
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
                                c69500RPk.icon = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69500RPk.deprecated = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69500RPk.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69500RPk.schema = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69500RPk;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69500RPk c69500RPk) {
        C69500RPk c69500RPk2 = c69500RPk;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69500RPk2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, c69500RPk2.icon) + REV.ADAPTER.encodedSizeWithTag(3, c69500RPk2.deprecated) + protoAdapter.encodedSizeWithTag(2, c69500RPk2.text) + protoAdapter.encodedSizeWithTag(1, c69500RPk2.schema);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69500RPk c69500RPk) {
        C69500RPk c69500RPk2 = c69500RPk;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69500RPk2.schema);
        protoAdapter.encodeWithTag(protoWriter, 2, c69500RPk2.text);
        REV.ADAPTER.encodeWithTag(protoWriter, 3, c69500RPk2.deprecated);
        protoAdapter.encodeWithTag(protoWriter, 4, c69500RPk2.icon);
        protoWriter.writeBytes(c69500RPk2.unknownFields());
    }
}
