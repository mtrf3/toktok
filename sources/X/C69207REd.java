package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69207REd extends ProtoAdapter<C69267RGl> {
    public C69207REd() {
        super(FieldEncoding.LENGTH_DELIMITED, C69267RGl.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69267RGl decode(ProtoReader protoReader) {
        C69267RGl c69267RGl = new C69267RGl();
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
                                c69267RGl.label_thumb = REV.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c69267RGl.label_large = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69267RGl.width = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69267RGl.height = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69267RGl;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69267RGl c69267RGl) {
        C69267RGl c69267RGl2 = c69267RGl;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, c69267RGl2.width) + protoAdapter.encodedSizeWithTag(1, c69267RGl2.height);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        return c69267RGl2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(4, c69267RGl2.label_thumb) + protoAdapter2.encodedSizeWithTag(3, c69267RGl2.label_large) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69267RGl c69267RGl) {
        C69267RGl c69267RGl2 = c69267RGl;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69267RGl2.height);
        protoAdapter.encodeWithTag(protoWriter, 2, c69267RGl2.width);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, c69267RGl2.label_large);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69267RGl2.label_thumb);
        protoWriter.writeBytes(c69267RGl2.unknownFields());
    }
}
