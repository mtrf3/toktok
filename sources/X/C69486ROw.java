package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.ROw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69486ROw extends ProtoAdapter<C69487ROx> {
    public C69486ROw() {
        super(FieldEncoding.LENGTH_DELIMITED, C69487ROx.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69487ROx decode(ProtoReader protoReader) {
        C69487ROx c69487ROx = new C69487ROx();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69487ROx.fatal_item_ids.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c69487ROx.logid = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69487ROx.now = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69487ROx;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69487ROx c69487ROx) {
        C69487ROx c69487ROx2 = c69487ROx;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c69487ROx2.now);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69487ROx2.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(3, c69487ROx2.fatal_item_ids) + protoAdapter.encodedSizeWithTag(2, c69487ROx2.logid) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69487ROx c69487ROx) {
    }
}
