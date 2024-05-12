package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69223REt extends ProtoAdapter<C69279RGx> {
    public C69223REt() {
        super(FieldEncoding.LENGTH_DELIMITED, C69279RGx.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69279RGx decode(ProtoReader protoReader) {
        C69279RGx c69279RGx = new C69279RGx();
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
                                    c69279RGx.link_txt = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c69279RGx.link_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69279RGx.link_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c69279RGx.banner_txt = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69279RGx.banner_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69279RGx;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69279RGx c69279RGx) {
        C69279RGx c69279RGx2 = c69279RGx;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69279RGx2.banner_type);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return c69279RGx2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(5, c69279RGx2.link_txt) + protoAdapter2.encodedSizeWithTag(4, c69279RGx2.link_url) + protoAdapter.encodedSizeWithTag(3, c69279RGx2.link_type) + protoAdapter2.encodedSizeWithTag(2, c69279RGx2.banner_txt) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69279RGx c69279RGx) {
        C69279RGx c69279RGx2 = c69279RGx;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69279RGx2.banner_type);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, c69279RGx2.banner_txt);
        protoAdapter.encodeWithTag(protoWriter, 3, c69279RGx2.link_type);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69279RGx2.link_url);
        protoAdapter2.encodeWithTag(protoWriter, 5, c69279RGx2.link_txt);
        protoWriter.writeBytes(c69279RGx2.unknownFields());
    }
}
