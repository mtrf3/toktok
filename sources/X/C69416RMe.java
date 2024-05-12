package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RMe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69416RMe extends ProtoAdapter<C69417RMf> {
    public C69416RMe() {
        super(FieldEncoding.LENGTH_DELIMITED, C69417RMf.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69417RMf decode(ProtoReader protoReader) {
        C69417RMf c69417RMf = new C69417RMf();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69417RMf.mute_desc = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69417RMf.is_mute = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69417RMf;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69417RMf c69417RMf) {
        C69417RMf c69417RMf2 = c69417RMf;
        return c69417RMf2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, c69417RMf2.mute_desc) + ProtoAdapter.BOOL.encodedSizeWithTag(1, c69417RMf2.is_mute);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69417RMf c69417RMf) {
        C69417RMf c69417RMf2 = c69417RMf;
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c69417RMf2.is_mute);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c69417RMf2.mute_desc);
        protoWriter.writeBytes(c69417RMf2.unknownFields());
    }
}
