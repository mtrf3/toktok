package X;

import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OwF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63511OwF extends ProtoAdapter<ModifyPropertyContent> {
    public C63511OwF() {
        super(FieldEncoding.LENGTH_DELIMITED, ModifyPropertyContent.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ModifyPropertyContent decode(ProtoReader protoReader) {
        C63512OwG c63512OwG = new C63512OwG();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c63512OwG.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c63512OwG.LJI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c63512OwG.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c63512OwG.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    try {
                        c63512OwG.LIZLLL = EnumC63258OsA.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        c63512OwG.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63512OwG.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ModifyPropertyContent modifyPropertyContent) {
        ModifyPropertyContent modifyPropertyContent2 = modifyPropertyContent;
        int encodedSizeWithTag = EnumC63258OsA.ADAPTER.encodedSizeWithTag(1, modifyPropertyContent2.operation);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return modifyPropertyContent2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, modifyPropertyContent2.idempotent_id) + protoAdapter.encodedSizeWithTag(3, modifyPropertyContent2.value) + protoAdapter.encodedSizeWithTag(2, modifyPropertyContent2.key) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ModifyPropertyContent modifyPropertyContent) {
        ModifyPropertyContent modifyPropertyContent2 = modifyPropertyContent;
        EnumC63258OsA.ADAPTER.encodeWithTag(protoWriter, 1, modifyPropertyContent2.operation);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, modifyPropertyContent2.key);
        protoAdapter.encodeWithTag(protoWriter, 3, modifyPropertyContent2.value);
        protoAdapter.encodeWithTag(protoWriter, 4, modifyPropertyContent2.idempotent_id);
        protoWriter.writeBytes(modifyPropertyContent2.unknownFields());
    }
}
