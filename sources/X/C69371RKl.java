package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RKl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69371RKl extends ProtoAdapter<C69372RKm> {
    public C69371RKl() {
        super(FieldEncoding.LENGTH_DELIMITED, C69372RKm.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69372RKm decode(ProtoReader protoReader) {
        C69372RKm c69372RKm = new C69372RKm();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69372RKm.type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c69372RKm.icon = REV.ADAPTER.decode(protoReader);
                    }
                } else {
                    c69372RKm.content = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69372RKm;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69372RKm c69372RKm) {
        C69372RKm c69372RKm2 = c69372RKm;
        return c69372RKm2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(3, c69372RKm2.type) + REV.ADAPTER.encodedSizeWithTag(2, c69372RKm2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(1, c69372RKm2.content);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69372RKm c69372RKm) {
        C69372RKm c69372RKm2 = c69372RKm;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c69372RKm2.content);
        REV.ADAPTER.encodeWithTag(protoWriter, 2, c69372RKm2.icon);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c69372RKm2.type);
        protoWriter.writeBytes(c69372RKm2.unknownFields());
    }
}
