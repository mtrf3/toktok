package X;

import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Owq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63548Owq extends ProtoAdapter<ReferencedMessageInfo> {
    public C63548Owq() {
        super(FieldEncoding.LENGTH_DELIMITED, ReferencedMessageInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ReferencedMessageInfo decode(ProtoReader protoReader) {
        C63547Owp c63547Owp = new C63547Owp();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c63547Owp.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c63547Owp.LJI = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c63547Owp.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c63547Owp.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c63547Owp.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63547Owp.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ReferencedMessageInfo referencedMessageInfo) {
        ReferencedMessageInfo referencedMessageInfo2 = referencedMessageInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return referencedMessageInfo2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, referencedMessageInfo2.root_message_conv_index) + protoAdapter.encodedSizeWithTag(3, referencedMessageInfo2.root_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, referencedMessageInfo2.hint) + protoAdapter.encodedSizeWithTag(1, referencedMessageInfo2.referenced_message_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ReferencedMessageInfo referencedMessageInfo) {
        ReferencedMessageInfo referencedMessageInfo2 = referencedMessageInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, referencedMessageInfo2.referenced_message_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, referencedMessageInfo2.hint);
        protoAdapter.encodeWithTag(protoWriter, 3, referencedMessageInfo2.root_message_id);
        protoAdapter.encodeWithTag(protoWriter, 4, referencedMessageInfo2.root_message_conv_index);
        protoWriter.writeBytes(referencedMessageInfo2.unknownFields());
    }
}
