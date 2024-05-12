package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.QVc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67100QVc extends ProtoAdapter<C67098QVa> {
    public final ProtoAdapter<java.util.Map<Integer, C64537PUn>> LJ;

    public C67100QVc() {
        super(FieldEncoding.LENGTH_DELIMITED, C67098QVa.class);
        this.LJ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.BYTES);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C67098QVa decode(ProtoReader protoReader) {
        C67110QVm c67110QVm = new C67110QVm();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    if (nextTag != 255) {
                                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                        c67110QVm.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c67110QVm.LJIIIIZZ.putAll(this.LJ.decode(protoReader));
                                    }
                                } else {
                                    try {
                                        c67110QVm.LJII = QVF.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        c67110QVm.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c67110QVm.LJI = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c67110QVm.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c67110QVm.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    try {
                        c67110QVm.LIZLLL = EnumC67117QVt.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        c67110QVm.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c67110QVm.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C67098QVa c67098QVa) {
        C67098QVa c67098QVa2 = c67098QVa;
        int encodedSizeWithTag = EnumC67117QVt.ADAPTER.encodedSizeWithTag(1, c67098QVa2.version);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c67098QVa2.unknownFields().size() + this.LJ.encodedSizeWithTag(255, c67098QVa2.infos) + QVF.ADAPTER.encodedSizeWithTag(5, c67098QVa2.ctrl) + ProtoAdapter.INT64.encodedSizeWithTag(4, c67098QVa2.ts) + protoAdapter.encodedSizeWithTag(3, c67098QVa2.did) + protoAdapter.encodedSizeWithTag(2, c67098QVa2.uid) + encodedSizeWithTag;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, X.QVm] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C67098QVa redact(C67098QVa c67098QVa) {
        ?? newBuilder2 = c67098QVa.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C67098QVa c67098QVa) {
        C67098QVa c67098QVa2 = c67098QVa;
        EnumC67117QVt.ADAPTER.encodeWithTag(protoWriter, 1, c67098QVa2.version);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, c67098QVa2.uid);
        protoAdapter.encodeWithTag(protoWriter, 3, c67098QVa2.did);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c67098QVa2.ts);
        QVF.ADAPTER.encodeWithTag(protoWriter, 5, c67098QVa2.ctrl);
        this.LJ.encodeWithTag(protoWriter, 255, c67098QVa2.infos);
        protoWriter.writeBytes(c67098QVa2.unknownFields());
    }
}
