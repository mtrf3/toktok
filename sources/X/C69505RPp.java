package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RPp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69505RPp extends ProtoAdapter<C69506RPq> {
    public C69505RPp() {
        super(FieldEncoding.LENGTH_DELIMITED, C69506RPq.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69506RPq decode(ProtoReader protoReader) {
        C69506RPq c69506RPq = new C69506RPq();
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
                                c69506RPq.head_icon = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69506RPq.tail_action = C69503RPn.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69506RPq.content = C69509RPt.ADAPTER.decode(protoReader);
                    }
                } else {
                    c69506RPq.deprecated = REV.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69506RPq;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69506RPq c69506RPq) {
        C69506RPq c69506RPq2 = c69506RPq;
        return c69506RPq2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(4, c69506RPq2.head_icon) + C69503RPn.ADAPTER.encodedSizeWithTag(3, c69506RPq2.tail_action) + C69509RPt.ADAPTER.encodedSizeWithTag(2, c69506RPq2.content) + REV.ADAPTER.encodedSizeWithTag(1, c69506RPq2.deprecated);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69506RPq c69506RPq) {
        C69506RPq c69506RPq2 = c69506RPq;
        REV.ADAPTER.encodeWithTag(protoWriter, 1, c69506RPq2.deprecated);
        C69509RPt.ADAPTER.encodeWithTag(protoWriter, 2, c69506RPq2.content);
        C69503RPn.ADAPTER.encodeWithTag(protoWriter, 3, c69506RPq2.tail_action);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, c69506RPq2.head_icon);
        protoWriter.writeBytes(c69506RPq2.unknownFields());
    }
}
