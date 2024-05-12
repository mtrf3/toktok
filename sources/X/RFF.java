package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFF extends ProtoAdapter<C69271RGp> {
    public RFF() {
        super(FieldEncoding.LENGTH_DELIMITED, C69271RGp.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69271RGp decode(ProtoReader protoReader) {
        C69271RGp c69271RGp = new C69271RGp();
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
                                c69271RGp.label_thumb = C69214REk.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c69271RGp.label_large = C69214REk.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69271RGp.width = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69271RGp.height = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69271RGp;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69271RGp c69271RGp) {
        C69271RGp c69271RGp2 = c69271RGp;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, c69271RGp2.width) + protoAdapter.encodedSizeWithTag(1, c69271RGp2.height);
        ProtoAdapter<C69214REk> protoAdapter2 = C69214REk.ADAPTER;
        return c69271RGp2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(4, c69271RGp2.label_thumb) + protoAdapter2.encodedSizeWithTag(3, c69271RGp2.label_large) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69271RGp c69271RGp) {
    }
}
