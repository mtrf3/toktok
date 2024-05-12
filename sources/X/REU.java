package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REU extends ProtoAdapter<C69270RGo> {
    public REU() {
        super(FieldEncoding.LENGTH_DELIMITED, C69270RGo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69270RGo decode(ProtoReader protoReader) {
        C69270RGo c69270RGo = new C69270RGo();
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
                                    c69270RGo.artist_name = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c69270RGo.duration = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c69270RGo.cover_medium = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69270RGo.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69270RGo.id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69270RGo;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69270RGo c69270RGo) {
        C69270RGo c69270RGo2 = c69270RGo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69270RGo2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, c69270RGo2.artist_name) + ProtoAdapter.INT64.encodedSizeWithTag(4, c69270RGo2.duration) + REV.ADAPTER.encodedSizeWithTag(3, c69270RGo2.cover_medium) + protoAdapter.encodedSizeWithTag(2, c69270RGo2.name) + protoAdapter.encodedSizeWithTag(1, c69270RGo2.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69270RGo c69270RGo) {
        C69270RGo c69270RGo2 = c69270RGo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69270RGo2.id);
        protoAdapter.encodeWithTag(protoWriter, 2, c69270RGo2.name);
        REV.ADAPTER.encodeWithTag(protoWriter, 3, c69270RGo2.cover_medium);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c69270RGo2.duration);
        protoAdapter.encodeWithTag(protoWriter, 5, c69270RGo2.artist_name);
        protoWriter.writeBytes(c69270RGo2.unknownFields());
    }
}
