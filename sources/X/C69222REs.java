package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69222REs extends ProtoAdapter<C69278RGw> {
    public C69222REs() {
        super(FieldEncoding.LENGTH_DELIMITED, C69278RGw.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69278RGw decode(ProtoReader protoReader) {
        C69278RGw c69278RGw = new C69278RGw();
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
                                    c69278RGw.version = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c69278RGw.right = ProtoAdapter.FLOAT.decode(protoReader);
                            }
                        } else {
                            c69278RGw.left = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        c69278RGw.bottom = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                } else {
                    c69278RGw.top = ProtoAdapter.FLOAT.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69278RGw;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69278RGw c69278RGw) {
        C69278RGw c69278RGw2 = c69278RGw;
        ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
        return c69278RGw2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(5, c69278RGw2.version) + protoAdapter.encodedSizeWithTag(4, c69278RGw2.right) + protoAdapter.encodedSizeWithTag(3, c69278RGw2.left) + protoAdapter.encodedSizeWithTag(2, c69278RGw2.bottom) + protoAdapter.encodedSizeWithTag(1, c69278RGw2.top);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69278RGw c69278RGw) {
        C69278RGw c69278RGw2 = c69278RGw;
        ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
        protoAdapter.encodeWithTag(protoWriter, 1, c69278RGw2.top);
        protoAdapter.encodeWithTag(protoWriter, 2, c69278RGw2.bottom);
        protoAdapter.encodeWithTag(protoWriter, 3, c69278RGw2.left);
        protoAdapter.encodeWithTag(protoWriter, 4, c69278RGw2.right);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c69278RGw2.version);
        protoWriter.writeBytes(c69278RGw2.unknownFields());
    }
}
