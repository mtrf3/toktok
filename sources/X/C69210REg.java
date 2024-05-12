package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69210REg extends ProtoAdapter<C69262RGg> {
    public C69210REg() {
        super(FieldEncoding.LENGTH_DELIMITED, C69262RGg.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69262RGg decode(ProtoReader protoReader) {
        C69262RGg c69262RGg = new C69262RGg();
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
                                    c69262RGg.fake_landscape_video_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c69262RGg.right = ProtoAdapter.FLOAT.decode(protoReader);
                            }
                        } else {
                            c69262RGg.left = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        c69262RGg.bottom = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                } else {
                    c69262RGg.top = ProtoAdapter.FLOAT.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69262RGg;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69262RGg c69262RGg) {
        C69262RGg c69262RGg2 = c69262RGg;
        ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
        return c69262RGg2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(5, c69262RGg2.fake_landscape_video_type) + protoAdapter.encodedSizeWithTag(4, c69262RGg2.right) + protoAdapter.encodedSizeWithTag(3, c69262RGg2.left) + protoAdapter.encodedSizeWithTag(2, c69262RGg2.bottom) + protoAdapter.encodedSizeWithTag(1, c69262RGg2.top);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69262RGg c69262RGg) {
        C69262RGg c69262RGg2 = c69262RGg;
        ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
        protoAdapter.encodeWithTag(protoWriter, 1, c69262RGg2.top);
        protoAdapter.encodeWithTag(protoWriter, 2, c69262RGg2.bottom);
        protoAdapter.encodeWithTag(protoWriter, 3, c69262RGg2.left);
        protoAdapter.encodeWithTag(protoWriter, 4, c69262RGg2.right);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, c69262RGg2.fake_landscape_video_type);
        protoWriter.writeBytes(c69262RGg2.unknownFields());
    }
}
