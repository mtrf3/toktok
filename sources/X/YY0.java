package X;

import com.bytedance.im.core.proto.TokenInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YY0 extends ProtoAdapter<TokenInfo> {
    public YY0() {
        super(FieldEncoding.LENGTH_DELIMITED, TokenInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final TokenInfo decode(ProtoReader protoReader) {
        C87559YXz c87559YXz = new C87559YXz();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    c87559YXz.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c87559YXz.LJII = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c87559YXz.LJI = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c87559YXz.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        try {
                            c87559YXz.LJ = EnumC87555YXv.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c87559YXz.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    c87559YXz.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c87559YXz.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(TokenInfo tokenInfo) {
        TokenInfo tokenInfo2 = tokenInfo;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, tokenInfo2.app_id) + EnumC87555YXv.ADAPTER.encodedSizeWithTag(2, tokenInfo2.type) + protoAdapter.encodedSizeWithTag(1, tokenInfo2.mark_id);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return tokenInfo2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(5, tokenInfo2.timestamp) + protoAdapter2.encodedSizeWithTag(4, tokenInfo2.user_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, TokenInfo tokenInfo) {
        TokenInfo tokenInfo2 = tokenInfo;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, tokenInfo2.mark_id);
        EnumC87555YXv.ADAPTER.encodeWithTag(protoWriter, 2, tokenInfo2.type);
        protoAdapter.encodeWithTag(protoWriter, 3, tokenInfo2.app_id);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 4, tokenInfo2.user_id);
        protoAdapter2.encodeWithTag(protoWriter, 5, tokenInfo2.timestamp);
        protoWriter.writeBytes(tokenInfo2.unknownFields());
    }
}
