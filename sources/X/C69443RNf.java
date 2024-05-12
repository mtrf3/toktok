package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RNf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69443RNf extends ProtoAdapter<C69444RNg> {
    public C69443RNf() {
        super(FieldEncoding.LENGTH_DELIMITED, C69444RNg.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69444RNg decode(ProtoReader protoReader) {
        C69444RNg c69444RNg = new C69444RNg();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    c69444RNg.apple_music_token = C69441RNd.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69444RNg;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69444RNg c69444RNg) {
        C69444RNg c69444RNg2 = c69444RNg;
        return c69444RNg2.unknownFields().size() + C69441RNd.ADAPTER.encodedSizeWithTag(1, c69444RNg2.apple_music_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69444RNg c69444RNg) {
        C69444RNg c69444RNg2 = c69444RNg;
        C69441RNd.ADAPTER.encodeWithTag(protoWriter, 1, c69444RNg2.apple_music_token);
        protoWriter.writeBytes(c69444RNg2.unknownFields());
    }
}
