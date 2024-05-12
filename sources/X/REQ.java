package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REQ extends ProtoAdapter<C69259RGd> {
    public REQ() {
        super(FieldEncoding.LENGTH_DELIMITED, C69259RGd.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69259RGd decode(ProtoReader protoReader) {
        C69259RGd c69259RGd = new C69259RGd();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 6) {
                                    C1EW.LIZJ(protoReader, protoReader);
                                } else {
                                    c69259RGd.should_show = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c69259RGd.url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69259RGd.description = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69259RGd.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69259RGd.id = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69259RGd;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69259RGd c69259RGd) {
        C69259RGd c69259RGd2 = c69259RGd;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c69259RGd2.id);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69259RGd2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(6, c69259RGd2.should_show) + protoAdapter.encodedSizeWithTag(4, c69259RGd2.url) + protoAdapter.encodedSizeWithTag(3, c69259RGd2.description) + protoAdapter.encodedSizeWithTag(2, c69259RGd2.name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69259RGd c69259RGd) {
        C69259RGd c69259RGd2 = c69259RGd;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c69259RGd2.id);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, c69259RGd2.name);
        protoAdapter.encodeWithTag(protoWriter, 3, c69259RGd2.description);
        protoAdapter.encodeWithTag(protoWriter, 4, c69259RGd2.url);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, c69259RGd2.should_show);
        protoWriter.writeBytes(c69259RGd2.unknownFields());
    }
}
