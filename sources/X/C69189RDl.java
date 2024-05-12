package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69189RDl extends ProtoAdapter<C69243RFn> {
    public C69189RDl() {
        super(FieldEncoding.LENGTH_DELIMITED, C69243RFn.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69243RFn decode(ProtoReader protoReader) {
        C69243RFn c69243RFn = new C69243RFn();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 99) {
                    if (nextTag != 100) {
                        switch (nextTag) {
                            case 1:
                                c69243RFn.type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                c69243RFn.id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c69243RFn.icon = REV.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c69243RFn.title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c69243RFn.open_url = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c69243RFn.web_url = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c69243RFn.mp_url = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                c69243RFn.title_tag = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                C1EW.LIZJ(protoReader, protoReader);
                                break;
                        }
                    } else {
                        c69243RFn.log_extra = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69243RFn.extra = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69243RFn;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69243RFn c69243RFn) {
        C69243RFn c69243RFn2 = c69243RFn;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c69243RFn2.type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69243RFn2.unknownFields().size() + protoAdapter.encodedSizeWithTag(100, c69243RFn2.log_extra) + protoAdapter.encodedSizeWithTag(99, c69243RFn2.extra) + protoAdapter.encodedSizeWithTag(8, c69243RFn2.title_tag) + protoAdapter.encodedSizeWithTag(7, c69243RFn2.mp_url) + protoAdapter.encodedSizeWithTag(6, c69243RFn2.web_url) + protoAdapter.encodedSizeWithTag(5, c69243RFn2.open_url) + protoAdapter.encodedSizeWithTag(4, c69243RFn2.title) + REV.ADAPTER.encodedSizeWithTag(3, c69243RFn2.icon) + protoAdapter.encodedSizeWithTag(2, c69243RFn2.id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69243RFn c69243RFn) {
        C69243RFn c69243RFn2 = c69243RFn;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69243RFn2.type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, c69243RFn2.id);
        REV.ADAPTER.encodeWithTag(protoWriter, 3, c69243RFn2.icon);
        protoAdapter.encodeWithTag(protoWriter, 4, c69243RFn2.title);
        protoAdapter.encodeWithTag(protoWriter, 5, c69243RFn2.open_url);
        protoAdapter.encodeWithTag(protoWriter, 6, c69243RFn2.web_url);
        protoAdapter.encodeWithTag(protoWriter, 7, c69243RFn2.mp_url);
        protoAdapter.encodeWithTag(protoWriter, 8, c69243RFn2.title_tag);
        protoAdapter.encodeWithTag(protoWriter, 99, c69243RFn2.extra);
        protoAdapter.encodeWithTag(protoWriter, 100, c69243RFn2.log_extra);
        protoWriter.writeBytes(c69243RFn2.unknownFields());
    }
}
