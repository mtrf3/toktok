package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.websocket.internal.proto.Frame;

/* renamed from: X.QDi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66638QDi extends ProtoAdapter<Frame> {
    public C66638QDi() {
        super(FieldEncoding.LENGTH_DELIMITED, Frame.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Frame decode(ProtoReader protoReader) {
        C66639QDj c66639QDj = new C66639QDj();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c66639QDj.LIZLLL = ProtoAdapter.UINT64.decode(protoReader);
                        break;
                    case 2:
                        c66639QDj.LJ = ProtoAdapter.UINT64.decode(protoReader);
                        break;
                    case 3:
                        c66639QDj.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c66639QDj.LJI = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c66639QDj.LJII.add(C66640QDk.ADAPTER.decode(protoReader));
                        break;
                    case 6:
                        c66639QDj.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c66639QDj.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c66639QDj.LJIIJ = ProtoAdapter.BYTES.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c66639QDj.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c66639QDj.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Frame frame) {
        Frame frame2 = frame;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, frame2.logid) + protoAdapter.encodedSizeWithTag(1, frame2.seqid);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = C66640QDk.ADAPTER.asRepeated().encodedSizeWithTag(5, frame2.headers) + protoAdapter2.encodedSizeWithTag(4, frame2.method) + protoAdapter2.encodedSizeWithTag(3, frame2.service) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        return frame2.unknownFields().size() + ProtoAdapter.BYTES.encodedSizeWithTag(8, frame2.payload) + protoAdapter3.encodedSizeWithTag(7, frame2.payload_type) + protoAdapter3.encodedSizeWithTag(6, frame2.payload_encoding) + encodedSizeWithTag2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.QDj] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Frame redact(Frame frame) {
        ?? newBuilder2 = frame.newBuilder2();
        C63685Oz3.LJIIIZ(newBuilder2.LJII, C66640QDk.ADAPTER);
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Frame frame) {
        Frame frame2 = frame;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(protoWriter, 1, frame2.seqid);
        protoAdapter.encodeWithTag(protoWriter, 2, frame2.logid);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, frame2.service);
        protoAdapter2.encodeWithTag(protoWriter, 4, frame2.method);
        C66640QDk.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, frame2.headers);
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 6, frame2.payload_encoding);
        protoAdapter3.encodeWithTag(protoWriter, 7, frame2.payload_type);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 8, frame2.payload);
        protoWriter.writeBytes(frame2.unknownFields());
    }
}
