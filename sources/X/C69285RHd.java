package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RHd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69285RHd extends ProtoAdapter<C69284RHc> {
    public C69285RHd() {
        super(FieldEncoding.LENGTH_DELIMITED, C69284RHc.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69284RHc decode(ProtoReader protoReader) {
        C69284RHc c69284RHc = new C69284RHc();
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
                                c69284RHc.store_link = RNR.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c69284RHc.download_link = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69284RHc.deep_link = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69284RHc.app_link = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69284RHc;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69284RHc c69284RHc) {
        C69284RHc c69284RHc2 = c69284RHc;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69284RHc2.unknownFields().size() + RNR.ADAPTER.encodedSizeWithTag(4, c69284RHc2.store_link) + protoAdapter.encodedSizeWithTag(3, c69284RHc2.download_link) + protoAdapter.encodedSizeWithTag(2, c69284RHc2.deep_link) + protoAdapter.encodedSizeWithTag(1, c69284RHc2.app_link);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69284RHc c69284RHc) {
        C69284RHc c69284RHc2 = c69284RHc;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69284RHc2.app_link);
        protoAdapter.encodeWithTag(protoWriter, 2, c69284RHc2.deep_link);
        protoAdapter.encodeWithTag(protoWriter, 3, c69284RHc2.download_link);
        RNR.ADAPTER.encodeWithTag(protoWriter, 4, c69284RHc2.store_link);
        protoWriter.writeBytes(c69284RHc2.unknownFields());
    }
}
