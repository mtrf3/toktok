package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69219REp extends ProtoAdapter<C69273RGr> {
    public C69219REp() {
        super(FieldEncoding.LENGTH_DELIMITED, C69273RGr.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69273RGr decode(ProtoReader protoReader) {
        C69273RGr c69273RGr = new C69273RGr();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    C1EW.LIZJ(protoReader, protoReader);
                                } else {
                                    c69273RGr.mixed_author = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c69273RGr.mixed_title = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69273RGr.title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69273RGr.author = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69273RGr.id = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69273RGr;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69273RGr c69273RGr) {
        C69273RGr c69273RGr2 = c69273RGr;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c69273RGr2.id);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69273RGr2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, c69273RGr2.mixed_author) + protoAdapter.encodedSizeWithTag(4, c69273RGr2.mixed_title) + protoAdapter.encodedSizeWithTag(3, c69273RGr2.title) + protoAdapter.encodedSizeWithTag(2, c69273RGr2.author) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69273RGr c69273RGr) {
        C69273RGr c69273RGr2 = c69273RGr;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c69273RGr2.id);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, c69273RGr2.author);
        protoAdapter.encodeWithTag(protoWriter, 3, c69273RGr2.title);
        protoAdapter.encodeWithTag(protoWriter, 4, c69273RGr2.mixed_title);
        protoAdapter.encodeWithTag(protoWriter, 5, c69273RGr2.mixed_author);
        protoWriter.writeBytes(c69273RGr2.unknownFields());
    }
}
