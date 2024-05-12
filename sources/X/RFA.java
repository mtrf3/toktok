package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFA extends ProtoAdapter<C69277RGv> {
    public RFA() {
        super(FieldEncoding.LENGTH_DELIMITED, C69277RGv.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69277RGv decode(ProtoReader protoReader) {
        C69277RGv c69277RGv = new C69277RGv();
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
                                    c69277RGv.hd = REV.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c69277RGv.large = REV.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c69277RGv.medium = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69277RGv.thumbnail = REV.ADAPTER.decode(protoReader);
                    }
                } else {
                    c69277RGv.thumb = REV.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69277RGv;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69277RGv c69277RGv) {
        C69277RGv c69277RGv2 = c69277RGv;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        return c69277RGv2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, c69277RGv2.hd) + protoAdapter.encodedSizeWithTag(4, c69277RGv2.large) + protoAdapter.encodedSizeWithTag(3, c69277RGv2.medium) + protoAdapter.encodedSizeWithTag(2, c69277RGv2.thumbnail) + protoAdapter.encodedSizeWithTag(1, c69277RGv2.thumb);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69277RGv c69277RGv) {
        C69277RGv c69277RGv2 = c69277RGv;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, c69277RGv2.thumb);
        protoAdapter.encodeWithTag(protoWriter, 2, c69277RGv2.thumbnail);
        protoAdapter.encodeWithTag(protoWriter, 3, c69277RGv2.medium);
        protoAdapter.encodeWithTag(protoWriter, 4, c69277RGv2.large);
        protoAdapter.encodeWithTag(protoWriter, 5, c69277RGv2.hd);
        protoWriter.writeBytes(c69277RGv2.unknownFields());
    }
}
