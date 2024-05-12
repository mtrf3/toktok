package X;

import com.bytedance.im.core.proto.InputStatusNotify;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63739Ozv extends ProtoAdapter<InputStatusNotify> {
    public C63739Ozv() {
        super(FieldEncoding.LENGTH_DELIMITED, InputStatusNotify.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final InputStatusNotify decode(ProtoReader protoReader) {
        C63740Ozw c63740Ozw = new C63740Ozw();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    if (nextTag != 10) {
                                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                        c63740Ozw.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c63740Ozw.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    try {
                                        c63740Ozw.LJII = EnumC63669Oyn.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        c63740Ozw.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                try {
                                    c63740Ozw.LJI = EnumC63506OwA.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    c63740Ozw.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            }
                        } else {
                            c63740Ozw.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c63740Ozw.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c63740Ozw.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63740Ozw.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(InputStatusNotify inputStatusNotify) {
        InputStatusNotify inputStatusNotify2 = inputStatusNotify;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return inputStatusNotify2.unknownFields().size() + protoAdapter.encodedSizeWithTag(10, inputStatusNotify2.create_time) + EnumC63669Oyn.ADAPTER.encodedSizeWithTag(5, inputStatusNotify2.input_status) + EnumC63506OwA.ADAPTER.encodedSizeWithTag(4, inputStatusNotify2.conversation_type) + protoAdapter.encodedSizeWithTag(3, inputStatusNotify2.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, inputStatusNotify2.conversation_id) + protoAdapter.encodedSizeWithTag(1, inputStatusNotify2.sender);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, InputStatusNotify inputStatusNotify) {
        InputStatusNotify inputStatusNotify2 = inputStatusNotify;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, inputStatusNotify2.sender);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, inputStatusNotify2.conversation_id);
        protoAdapter.encodeWithTag(protoWriter, 3, inputStatusNotify2.conversation_short_id);
        EnumC63506OwA.ADAPTER.encodeWithTag(protoWriter, 4, inputStatusNotify2.conversation_type);
        EnumC63669Oyn.ADAPTER.encodeWithTag(protoWriter, 5, inputStatusNotify2.input_status);
        protoAdapter.encodeWithTag(protoWriter, 10, inputStatusNotify2.create_time);
        protoWriter.writeBytes(inputStatusNotify2.unknownFields());
    }
}
