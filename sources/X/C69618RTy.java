package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RTy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69618RTy extends ProtoAdapter<RU0> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public C69618RTy() {
        super(FieldEncoding.LENGTH_DELIMITED, RU0.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RU0 decode(ProtoReader protoReader) {
        C69619RTz c69619RTz = new C69619RTz();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69619RTz.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c69619RTz.LJ.putAll(this.LJ.decode(protoReader));
                    }
                } else {
                    c69619RTz.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69619RTz.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RU0 ru0) {
        RU0 ru02 = ru0;
        return ru02.unknownFields().size() + this.LJ.encodedSizeWithTag(2, ru02.extra) + ProtoAdapter.STRING.encodedSizeWithTag(1, ru02.resource_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RU0 redact(RU0 ru0) {
        Message.Builder<RU0, C69619RTz> newBuilder2 = ru0.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RU0 ru0) {
        RU0 ru02 = ru0;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ru02.resource_id);
        this.LJ.encodeWithTag(protoWriter, 2, ru02.extra);
        protoWriter.writeBytes(ru02.unknownFields());
    }
}
