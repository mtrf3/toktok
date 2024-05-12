package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RMt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69431RMt extends ProtoAdapter<C69432RMu> {
    public C69431RMt() {
        super(FieldEncoding.LENGTH_DELIMITED, C69432RMu.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69432RMu decode(ProtoReader protoReader) {
        C69432RMu c69432RMu = new C69432RMu();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69432RMu.life_story_blocked = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    c69432RMu.life_story_block = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69432RMu;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69432RMu c69432RMu) {
        C69432RMu c69432RMu2 = c69432RMu;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        return c69432RMu2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c69432RMu2.life_story_blocked) + protoAdapter.encodedSizeWithTag(1, c69432RMu2.life_story_block);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69432RMu c69432RMu) {
        C69432RMu c69432RMu2 = c69432RMu;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, c69432RMu2.life_story_block);
        protoAdapter.encodeWithTag(protoWriter, 2, c69432RMu2.life_story_blocked);
        protoWriter.writeBytes(c69432RMu2.unknownFields());
    }
}
