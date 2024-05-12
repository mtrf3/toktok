package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69198RDu extends ProtoAdapter<RGF> {
    public C69198RDu() {
        super(FieldEncoding.LENGTH_DELIMITED, RGF.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGF decode(ProtoReader protoReader) {
        RGF rgf = new RGF();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgf.entrance = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rgf.link = C69284RHc.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        rgf.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rgf.subtitle = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rgf.button_text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rgf.subscribed = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        rgf.product_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgf;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGF rgf) {
        RGF rgf2 = rgf;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rgf2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(7, rgf2.product_status) + ProtoAdapter.BOOL.encodedSizeWithTag(6, rgf2.subscribed) + protoAdapter.encodedSizeWithTag(5, rgf2.button_text) + protoAdapter.encodedSizeWithTag(4, rgf2.subtitle) + protoAdapter.encodedSizeWithTag(3, rgf2.title) + C69284RHc.ADAPTER.encodedSizeWithTag(2, rgf2.link) + protoAdapter.encodedSizeWithTag(1, rgf2.entrance);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGF rgf) {
        RGF rgf2 = rgf;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rgf2.entrance);
        C69284RHc.ADAPTER.encodeWithTag(protoWriter, 2, rgf2.link);
        protoAdapter.encodeWithTag(protoWriter, 3, rgf2.title);
        protoAdapter.encodeWithTag(protoWriter, 4, rgf2.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 5, rgf2.button_text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, rgf2.subscribed);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, rgf2.product_status);
        protoWriter.writeBytes(rgf2.unknownFields());
    }
}
