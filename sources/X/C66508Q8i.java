package X;

import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Q8i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66508Q8i extends ProtoAdapter<Frame> {
    public C66508Q8i() {
        super(FieldEncoding.LENGTH_DELIMITED, Frame.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Frame decode(ProtoReader protoReader) {
        C66510Q8k c66510Q8k = new C66510Q8k();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c66510Q8k.LIZLLL = ProtoAdapter.UINT64.decode(protoReader);
                        break;
                    case 2:
                        c66510Q8k.LJ = ProtoAdapter.UINT64.decode(protoReader);
                        break;
                    case 3:
                        c66510Q8k.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c66510Q8k.LJI = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c66510Q8k.LJII.add(C66507Q8h.ADAPTER.decode(protoReader));
                        break;
                    case 6:
                        c66510Q8k.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c66510Q8k.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c66510Q8k.LJIIJ = ProtoAdapter.BYTES.decode(protoReader);
                        break;
                    case 9:
                        c66510Q8k.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        c66510Q8k.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c66510Q8k.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c66510Q8k.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c66510Q8k.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Frame frame) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Frame frame2 = frame;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, frame2.logid) + protoAdapter.encodedSizeWithTag(1, frame2.seqid);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = C66507Q8h.ADAPTER.asRepeated().encodedSizeWithTag(5, frame2.headers) + protoAdapter2.encodedSizeWithTag(4, frame2.method) + protoAdapter2.encodedSizeWithTag(3, frame2.service) + encodedSizeWithTag;
        String str = frame2.payload_encoding;
        int i6 = 0;
        if (str != null) {
            i = ProtoAdapter.STRING.encodedSizeWithTag(6, str);
        } else {
            i = 0;
        }
        int i7 = encodedSizeWithTag2 + i;
        String str2 = frame2.payload_type;
        if (str2 != null) {
            i2 = ProtoAdapter.STRING.encodedSizeWithTag(7, str2);
        } else {
            i2 = 0;
        }
        int i8 = i7 + i2;
        C64537PUn c64537PUn = frame2.payload;
        if (c64537PUn != null) {
            i3 = ProtoAdapter.BYTES.encodedSizeWithTag(8, c64537PUn);
        } else {
            i3 = 0;
        }
        int i9 = i8 + i3;
        String str3 = frame2.logidnew;
        if (str3 != null) {
            i4 = ProtoAdapter.STRING.encodedSizeWithTag(9, str3);
        } else {
            i4 = 0;
        }
        int i10 = i9 + i4;
        String str4 = frame2.serverTiming;
        if (str4 != null) {
            i5 = ProtoAdapter.STRING.encodedSizeWithTag(10, str4);
        } else {
            i5 = 0;
        }
        int i11 = i10 + i5;
        String str5 = frame2.msgId;
        if (str5 != null) {
            i6 = ProtoAdapter.STRING.encodedSizeWithTag(11, str5);
        }
        return frame2.unknownFields().size() + i11 + i6;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Q8k, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Frame redact(Frame frame) {
        ?? newBuilder2 = frame.newBuilder2();
        C63685Oz3.LJIIIZ(newBuilder2.LJII, C66507Q8h.ADAPTER);
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
        if (frame2.headers != null) {
            C66507Q8h.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, frame2.headers);
        }
        String str = frame2.payload_encoding;
        if (str != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str);
        }
        String str2 = frame2.payload_type;
        if (str2 != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str2);
        }
        C64537PUn c64537PUn = frame2.payload;
        if (c64537PUn != null) {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 8, c64537PUn);
        }
        String str3 = frame2.logidnew;
        if (str3 != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, str3);
        }
        String str4 = frame2.serverTiming;
        if (str4 != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, str4);
        }
        String str5 = frame2.msgId;
        if (str5 != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, str5);
        }
        protoWriter.writeBytes(frame2.unknownFields());
    }
}
