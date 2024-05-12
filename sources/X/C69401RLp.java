package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RLp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69401RLp extends ProtoAdapter<C69402RLq> {
    public C69401RLp() {
        super(FieldEncoding.LENGTH_DELIMITED, C69402RLq.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69402RLq decode(ProtoReader protoReader) {
        C69402RLq c69402RLq = new C69402RLq();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69402RLq.location = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        c69402RLq.audio_uri = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69402RLq.utterances.add(C69253RFx.ADAPTER.decode(protoReader));
                        break;
                    case 4:
                        c69402RLq.auto_captions.add(C69405RLt.ADAPTER.decode(protoReader));
                        break;
                    case 5:
                        c69402RLq.disable = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c69402RLq.src_lang = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c69402RLq.position = RON.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69402RLq.appearance = RRT.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69402RLq.is_translatable = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 10:
                        c69402RLq.caption_lines = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69402RLq;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69402RLq c69402RLq) {
        C69402RLq c69402RLq2 = c69402RLq;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c69402RLq2.location);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = C69405RLt.ADAPTER.asRepeated().encodedSizeWithTag(4, c69402RLq2.auto_captions) + C69253RFx.ADAPTER.asRepeated().encodedSizeWithTag(3, c69402RLq2.utterances) + protoAdapter.encodedSizeWithTag(2, c69402RLq2.audio_uri) + encodedSizeWithTag;
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return c69402RLq2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(10, c69402RLq2.caption_lines) + ProtoAdapter.BOOL.encodedSizeWithTag(9, c69402RLq2.is_translatable) + RRT.ADAPTER.encodedSizeWithTag(8, c69402RLq2.appearance) + RON.ADAPTER.encodedSizeWithTag(7, c69402RLq2.position) + protoAdapter.encodedSizeWithTag(6, c69402RLq2.src_lang) + protoAdapter2.encodedSizeWithTag(5, c69402RLq2.disable) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69402RLq c69402RLq) {
        C69402RLq c69402RLq2 = c69402RLq;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69402RLq2.location);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, c69402RLq2.audio_uri);
        C69253RFx.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c69402RLq2.utterances);
        C69405RLt.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c69402RLq2.auto_captions);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 5, c69402RLq2.disable);
        protoAdapter.encodeWithTag(protoWriter, 6, c69402RLq2.src_lang);
        RON.ADAPTER.encodeWithTag(protoWriter, 7, c69402RLq2.position);
        RRT.ADAPTER.encodeWithTag(protoWriter, 8, c69402RLq2.appearance);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, c69402RLq2.is_translatable);
        protoAdapter2.encodeWithTag(protoWriter, 10, c69402RLq2.caption_lines);
        protoWriter.writeBytes(c69402RLq2.unknownFields());
    }
}
