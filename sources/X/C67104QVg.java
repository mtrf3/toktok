package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.QVg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67104QVg extends ProtoAdapter<C67103QVf> {
    public C67104QVg() {
        super(FieldEncoding.LENGTH_DELIMITED, C67103QVf.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C67103QVf decode(ProtoReader protoReader) {
        C67113QVp c67113QVp = new C67113QVp();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c67113QVp.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c67113QVp.LJI = ProtoAdapter.BYTES.decode(protoReader);
                            }
                        } else {
                            c67113QVp.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c67113QVp.LJ = EnumC68499QuV.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c67113QVp.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    c67113QVp.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c67113QVp.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C67103QVf c67103QVf) {
        C67103QVf c67103QVf2 = c67103QVf;
        return c67103QVf2.unknownFields().size() + ProtoAdapter.BYTES.encodedSizeWithTag(4, c67103QVf2.data) + ProtoAdapter.STRING.encodedSizeWithTag(3, c67103QVf2.md5) + EnumC68499QuV.ADAPTER.encodedSizeWithTag(2, c67103QVf2.consume_type) + ProtoAdapter.INT32.encodedSizeWithTag(1, c67103QVf2.business);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, X.QVp] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C67103QVf redact(C67103QVf c67103QVf) {
        ?? newBuilder2 = c67103QVf.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C67103QVf c67103QVf) {
        C67103QVf c67103QVf2 = c67103QVf;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c67103QVf2.business);
        EnumC68499QuV.ADAPTER.encodeWithTag(protoWriter, 2, c67103QVf2.consume_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c67103QVf2.md5);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, c67103QVf2.data);
        protoWriter.writeBytes(c67103QVf2.unknownFields());
    }
}
