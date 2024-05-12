package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V47 extends ProtoAdapter<C79128V3s> {
    public V47() {
        super(FieldEncoding.LENGTH_DELIMITED, C79128V3s.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79128V3s decode(ProtoReader protoReader) {
        V3X v3x = new V3X();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 2) {
                    if (nextTag != 100) {
                        if (nextTag != 101) {
                            switch (nextTag) {
                                case 4:
                                    v3x.LJ = V41.ADAPTER.decode(protoReader);
                                    break;
                                case 5:
                                    v3x.LJFF = C79134V3y.ADAPTER.decode(protoReader);
                                    break;
                                case 6:
                                    v3x.LJI = C79132V3w.ADAPTER.decode(protoReader);
                                    break;
                                case 7:
                                    v3x.LJII = V45.ADAPTER.decode(protoReader);
                                    break;
                                case 8:
                                    v3x.LJIIIIZZ = C79130V3u.ADAPTER.decode(protoReader);
                                    break;
                                case 9:
                                    v3x.LJIIIZ = C79131V3v.ADAPTER.decode(protoReader);
                                    break;
                                case 10:
                                    v3x.LJIIJ = V42.ADAPTER.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    v3x.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            v3x.LJIIL = V46.ADAPTER.decode(protoReader);
                        }
                    } else {
                        v3x.LJIIJJI = V4S.ADAPTER.decode(protoReader);
                    }
                } else {
                    v3x.LIZLLL = C79133V3x.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v3x.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79128V3s c79128V3s) {
        C79128V3s c79128V3s2 = c79128V3s;
        return c79128V3s2.unknownFields().size() + V46.ADAPTER.encodedSizeWithTag(101, c79128V3s2.dynamic_card) + V4S.ADAPTER.encodedSizeWithTag(100, c79128V3s2.common_msg_card) + V42.ADAPTER.encodedSizeWithTag(10, c79128V3s2.interactive_notice_card) + C79131V3v.ADAPTER.encodedSizeWithTag(9, c79128V3s2.bot_answer_card) + C79130V3u.ADAPTER.encodedSizeWithTag(8, c79128V3s2.portrait_card) + V45.ADAPTER.encodedSizeWithTag(7, c79128V3s2.sticker_card) + C79132V3w.ADAPTER.encodedSizeWithTag(6, c79128V3s2.info_card) + C79134V3y.ADAPTER.encodedSizeWithTag(5, c79128V3s2.video_card) + V41.ADAPTER.encodedSizeWithTag(4, c79128V3s2.picture_card) + C79133V3x.ADAPTER.encodedSizeWithTag(2, c79128V3s2.image_card);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.V3X] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C79128V3s redact(C79128V3s c79128V3s) {
        ?? newBuilder2 = c79128V3s.newBuilder2();
        C79133V3x c79133V3x = newBuilder2.LIZLLL;
        if (c79133V3x != null) {
            newBuilder2.LIZLLL = C79133V3x.ADAPTER.redact(c79133V3x);
        }
        V41 v41 = newBuilder2.LJ;
        if (v41 != null) {
            newBuilder2.LJ = V41.ADAPTER.redact(v41);
        }
        C79134V3y c79134V3y = newBuilder2.LJFF;
        if (c79134V3y != null) {
            newBuilder2.LJFF = C79134V3y.ADAPTER.redact(c79134V3y);
        }
        C79132V3w c79132V3w = newBuilder2.LJI;
        if (c79132V3w != null) {
            newBuilder2.LJI = C79132V3w.ADAPTER.redact(c79132V3w);
        }
        V45 v45 = newBuilder2.LJII;
        if (v45 != null) {
            newBuilder2.LJII = V45.ADAPTER.redact(v45);
        }
        C79130V3u c79130V3u = newBuilder2.LJIIIIZZ;
        if (c79130V3u != null) {
            newBuilder2.LJIIIIZZ = C79130V3u.ADAPTER.redact(c79130V3u);
        }
        C79131V3v c79131V3v = newBuilder2.LJIIIZ;
        if (c79131V3v != null) {
            newBuilder2.LJIIIZ = C79131V3v.ADAPTER.redact(c79131V3v);
        }
        V42 v42 = newBuilder2.LJIIJ;
        if (v42 != null) {
            newBuilder2.LJIIJ = V42.ADAPTER.redact(v42);
        }
        V4S v4s = newBuilder2.LJIIJJI;
        if (v4s != null) {
            newBuilder2.LJIIJJI = V4S.ADAPTER.redact(v4s);
        }
        V46 v46 = newBuilder2.LJIIL;
        if (v46 != null) {
            newBuilder2.LJIIL = V46.ADAPTER.redact(v46);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C79128V3s c79128V3s) {
        C79128V3s c79128V3s2 = c79128V3s;
        C79133V3x.ADAPTER.encodeWithTag(protoWriter, 2, c79128V3s2.image_card);
        V41.ADAPTER.encodeWithTag(protoWriter, 4, c79128V3s2.picture_card);
        C79134V3y.ADAPTER.encodeWithTag(protoWriter, 5, c79128V3s2.video_card);
        C79132V3w.ADAPTER.encodeWithTag(protoWriter, 6, c79128V3s2.info_card);
        V45.ADAPTER.encodeWithTag(protoWriter, 7, c79128V3s2.sticker_card);
        C79130V3u.ADAPTER.encodeWithTag(protoWriter, 8, c79128V3s2.portrait_card);
        C79131V3v.ADAPTER.encodeWithTag(protoWriter, 9, c79128V3s2.bot_answer_card);
        V42.ADAPTER.encodeWithTag(protoWriter, 10, c79128V3s2.interactive_notice_card);
        V4S.ADAPTER.encodeWithTag(protoWriter, 100, c79128V3s2.common_msg_card);
        V46.ADAPTER.encodeWithTag(protoWriter, 101, c79128V3s2.dynamic_card);
        protoWriter.writeBytes(c79128V3s2.unknownFields());
    }
}
