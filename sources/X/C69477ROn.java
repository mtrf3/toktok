package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.ROn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69477ROn extends ProtoAdapter<C69478ROo> {
    public C69477ROn() {
        super(FieldEncoding.LENGTH_DELIMITED, C69478ROo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69478ROo decode(ProtoReader protoReader) {
        C69478ROo c69478ROo = new C69478ROo();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69478ROo.stickerContent = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69478ROo.micPermissionOn = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    c69478ROo.invitedToDuetUserIds.add(ProtoAdapter.STRING.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69478ROo;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69478ROo c69478ROo) {
        C69478ROo c69478ROo2 = c69478ROo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69478ROo2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, c69478ROo2.stickerContent) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c69478ROo2.micPermissionOn) + protoAdapter.asRepeated().encodedSizeWithTag(1, c69478ROo2.invitedToDuetUserIds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69478ROo c69478ROo) {
        C69478ROo c69478ROo2 = c69478ROo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c69478ROo2.invitedToDuetUserIds);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c69478ROo2.micPermissionOn);
        protoAdapter.encodeWithTag(protoWriter, 3, c69478ROo2.stickerContent);
        protoWriter.writeBytes(c69478ROo2.unknownFields());
    }
}
