package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RF9 extends ProtoAdapter<C69276RGu> {
    public RF9() {
        super(FieldEncoding.LENGTH_DELIMITED, C69276RGu.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69276RGu decode(ProtoReader protoReader) {
        C69276RGu c69276RGu = new C69276RGu();
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
                                    c69276RGu.replace = RJX.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c69276RGu.content_scope = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69276RGu.biz_params = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69276RGu.conent_scope = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69276RGu.survey_key = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69276RGu;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69276RGu c69276RGu) {
        C69276RGu c69276RGu2 = c69276RGu;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69276RGu2.unknownFields().size() + RJX.ADAPTER.encodedSizeWithTag(5, c69276RGu2.replace) + protoAdapter.encodedSizeWithTag(4, c69276RGu2.content_scope) + protoAdapter.encodedSizeWithTag(3, c69276RGu2.biz_params) + protoAdapter.encodedSizeWithTag(2, c69276RGu2.conent_scope) + protoAdapter.encodedSizeWithTag(1, c69276RGu2.survey_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69276RGu c69276RGu) {
        C69276RGu c69276RGu2 = c69276RGu;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69276RGu2.survey_key);
        protoAdapter.encodeWithTag(protoWriter, 2, c69276RGu2.conent_scope);
        protoAdapter.encodeWithTag(protoWriter, 3, c69276RGu2.biz_params);
        protoAdapter.encodeWithTag(protoWriter, 4, c69276RGu2.content_scope);
        RJX.ADAPTER.encodeWithTag(protoWriter, 5, c69276RGu2.replace);
        protoWriter.writeBytes(c69276RGu2.unknownFields());
    }
}
