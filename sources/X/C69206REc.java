package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69206REc extends ProtoAdapter<C69258RGc> {
    public C69206REc() {
        super(FieldEncoding.LENGTH_DELIMITED, C69258RGc.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69258RGc decode(ProtoReader protoReader) {
        C69258RGc c69258RGc = new C69258RGc();
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
                                    c69258RGc.blur_like_action = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c69258RGc.blur_comment_action = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c69258RGc.disable_reaction = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c69258RGc.disable_comment = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    c69258RGc.disable_like = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69258RGc;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69258RGc c69258RGc) {
        C69258RGc c69258RGc2 = c69258RGc;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, c69258RGc2.disable_reaction) + protoAdapter.encodedSizeWithTag(2, c69258RGc2.disable_comment) + protoAdapter.encodedSizeWithTag(1, c69258RGc2.disable_like);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return c69258RGc2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(5, c69258RGc2.blur_like_action) + protoAdapter2.encodedSizeWithTag(4, c69258RGc2.blur_comment_action) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69258RGc c69258RGc) {
        C69258RGc c69258RGc2 = c69258RGc;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, c69258RGc2.disable_like);
        protoAdapter.encodeWithTag(protoWriter, 2, c69258RGc2.disable_comment);
        protoAdapter.encodeWithTag(protoWriter, 3, c69258RGc2.disable_reaction);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 4, c69258RGc2.blur_comment_action);
        protoAdapter2.encodeWithTag(protoWriter, 5, c69258RGc2.blur_like_action);
        protoWriter.writeBytes(c69258RGc2.unknownFields());
    }
}
