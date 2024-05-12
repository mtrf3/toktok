package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RGG extends ProtoAdapter<C69281RGz> {
    public RGG() {
        super(FieldEncoding.LENGTH_DELIMITED, C69281RGz.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69281RGz decode(ProtoReader protoReader) {
        C69281RGz c69281RGz = new C69281RGz();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 9) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69281RGz.vip_verification_schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69281RGz.brand = RGF.ADAPTER.decode(protoReader);
                    }
                } else {
                    c69281RGz.product = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69281RGz;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69281RGz c69281RGz) {
        C69281RGz c69281RGz2 = c69281RGz;
        return c69281RGz2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(9, c69281RGz2.vip_verification_schema) + RGF.ADAPTER.encodedSizeWithTag(2, c69281RGz2.brand) + ProtoAdapter.INT32.encodedSizeWithTag(1, c69281RGz2.product);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69281RGz c69281RGz) {
        C69281RGz c69281RGz2 = c69281RGz;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69281RGz2.product);
        RGF.ADAPTER.encodeWithTag(protoWriter, 2, c69281RGz2.brand);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, c69281RGz2.vip_verification_schema);
        protoWriter.writeBytes(c69281RGz2.unknownFields());
    }
}
