package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69209REf extends ProtoAdapter<C69261RGf> {
    public C69209REf() {
        super(FieldEncoding.LENGTH_DELIMITED, C69261RGf.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69261RGf decode(ProtoReader protoReader) {
        C69261RGf c69261RGf = new C69261RGf();
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
                                    c69261RGf.digg_count = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c69261RGf.music_cover_url = REV.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c69261RGf.music_qrcode_url = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69261RGf.music_used_count = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69261RGf.music_count = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69261RGf;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69261RGf c69261RGf) {
        C69261RGf c69261RGf2 = c69261RGf;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, c69261RGf2.music_used_count) + protoAdapter.encodedSizeWithTag(1, c69261RGf2.music_count);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        return c69261RGf2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, c69261RGf2.digg_count) + protoAdapter2.encodedSizeWithTag(4, c69261RGf2.music_cover_url) + protoAdapter2.encodedSizeWithTag(3, c69261RGf2.music_qrcode_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69261RGf c69261RGf) {
        C69261RGf c69261RGf2 = c69261RGf;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69261RGf2.music_count);
        protoAdapter.encodeWithTag(protoWriter, 2, c69261RGf2.music_used_count);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, c69261RGf2.music_qrcode_url);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69261RGf2.music_cover_url);
        protoAdapter.encodeWithTag(protoWriter, 5, c69261RGf2.digg_count);
        protoWriter.writeBytes(c69261RGf2.unknownFields());
    }
}
