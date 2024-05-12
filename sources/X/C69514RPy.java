package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RPy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69514RPy extends ProtoAdapter<C69515RPz> {
    public C69514RPy() {
        super(FieldEncoding.LENGTH_DELIMITED, C69515RPz.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69515RPz decode(ProtoReader protoReader) {
        C69515RPz c69515RPz = new C69515RPz();
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
                                c69515RPz.awemes.add(RCZ.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c69515RPz.has_more = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c69515RPz.status_msg = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69515RPz.status_code = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69515RPz;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69515RPz c69515RPz) {
        C69515RPz c69515RPz2 = c69515RPz;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c69515RPz2.unknownFields().size() + RCZ.ADAPTER.asRepeated().encodedSizeWithTag(4, c69515RPz2.awemes) + protoAdapter.encodedSizeWithTag(3, c69515RPz2.has_more) + ProtoAdapter.STRING.encodedSizeWithTag(2, c69515RPz2.status_msg) + protoAdapter.encodedSizeWithTag(1, c69515RPz2.status_code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69515RPz c69515RPz) {
        C69515RPz c69515RPz2 = c69515RPz;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69515RPz2.status_code);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c69515RPz2.status_msg);
        protoAdapter.encodeWithTag(protoWriter, 3, c69515RPz2.has_more);
        RCZ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c69515RPz2.awemes);
        protoWriter.writeBytes(c69515RPz2.unknownFields());
    }
}
