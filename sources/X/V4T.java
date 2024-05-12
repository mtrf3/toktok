package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4T extends ProtoAdapter<V4S> {
    public final ProtoAdapter<java.util.Map<String, RUF>> LJ;
    public final ProtoAdapter<java.util.Map<String, C79135V3z>> LJFF;
    public final ProtoAdapter<java.util.Map<String, C63714OzW>> LJI;
    public final ProtoAdapter<java.util.Map<String, C79141V4f>> LJII;
    public final ProtoAdapter<java.util.Map<String, V43>> LJIIIIZZ;
    public final ProtoAdapter<java.util.Map<String, C79129V3t>> LJIIIZ;
    public final ProtoAdapter<java.util.Map<String, C79135V3z>> LJIIJ;
    public final ProtoAdapter<java.util.Map<String, V43>> LJIIJJI;
    public final ProtoAdapter<java.util.Map<String, C79129V3t>> LJIIL;

    public V4T() {
        super(FieldEncoding.LENGTH_DELIMITED, V4S.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, RUF.ADAPTER);
        ProtoAdapter<C79135V3z> protoAdapter2 = C79135V3z.ADAPTER;
        this.LJFF = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter2);
        this.LJI = ProtoAdapter.newMapAdapter(protoAdapter, C63714OzW.ADAPTER);
        this.LJII = ProtoAdapter.newMapAdapter(protoAdapter, C79141V4f.ADAPTER);
        ProtoAdapter<V43> protoAdapter3 = V43.ADAPTER;
        this.LJIIIIZZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter3);
        ProtoAdapter<C79129V3t> protoAdapter4 = C79129V3t.ADAPTER;
        this.LJIIIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter4);
        this.LJIIJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter2);
        this.LJIIJJI = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter3);
        this.LJIIL = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter4);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V4S decode(ProtoReader protoReader) {
        C79144V4i c79144V4i = new C79144V4i();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c79144V4i.LIZLLL.putAll(this.LJ.decode(protoReader));
                        break;
                    case 2:
                        c79144V4i.LJ.putAll(this.LJFF.decode(protoReader));
                        break;
                    case 3:
                        c79144V4i.LJFF.putAll(this.LJI.decode(protoReader));
                        break;
                    case 4:
                        c79144V4i.LJI.putAll(this.LJII.decode(protoReader));
                        break;
                    case 5:
                        c79144V4i.LJII.putAll(this.LJIIIIZZ.decode(protoReader));
                        break;
                    case 6:
                        c79144V4i.LJIIIIZZ.putAll(this.LJIIIZ.decode(protoReader));
                        break;
                    case 7:
                        c79144V4i.LJIIIZ = V4Q.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c79144V4i.LJIIJ = V4L.ADAPTER.decode(protoReader);
                        break;
                    default:
                        switch (nextTag) {
                            case 100:
                                c79144V4i.LJIIJJI.putAll(this.LJIIJ.decode(protoReader));
                                break;
                            case 101:
                                c79144V4i.LJIIL.putAll(this.LJIIJJI.decode(protoReader));
                                break;
                            case 102:
                                c79144V4i.LJIILIIL.putAll(this.LJIIL.decode(protoReader));
                                break;
                            default:
                                switch (nextTag) {
                                    case 200:
                                        c79144V4i.LJIILJJIL = ProtoAdapter.BYTES.decode(protoReader);
                                        break;
                                    case 201:
                                        c79144V4i.LJIILL = RU2.ADAPTER.decode(protoReader);
                                        break;
                                    case 202:
                                        c79144V4i.LJIILLIIL = RUB.ADAPTER.decode(protoReader);
                                        break;
                                    default:
                                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                        c79144V4i.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        break;
                                }
                        }
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79144V4i.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V4S v4s) {
        V4S v4s2 = v4s;
        return v4s2.unknownFields().size() + RUB.ADAPTER.encodedSizeWithTag(202, v4s2.resp_base) + RU2.ADAPTER.encodedSizeWithTag(201, v4s2.req_base) + ProtoAdapter.BYTES.encodedSizeWithTag(200, v4s2.extra_content) + this.LJIIL.encodedSizeWithTag(102, v4s2.business_user_map) + this.LJIIJJI.encodedSizeWithTag(101, v4s2.business_video_map) + this.LJIIJ.encodedSizeWithTag(100, v4s2.business_image_map) + V4L.ADAPTER.encodedSizeWithTag(8, v4s2.preview_hint) + V4Q.ADAPTER.encodedSizeWithTag(7, v4s2.fallback_info) + this.LJIIIZ.encodedSizeWithTag(6, v4s2.user_map) + this.LJIIIIZZ.encodedSizeWithTag(5, v4s2.video_map) + this.LJII.encodedSizeWithTag(4, v4s2.button_map) + this.LJI.encodedSizeWithTag(3, v4s2.link_map) + this.LJFF.encodedSizeWithTag(2, v4s2.image_map) + this.LJ.encodedSizeWithTag(1, v4s2.text_map);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.V4i] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V4S redact(V4S v4s) {
        ?? newBuilder2 = v4s.newBuilder2();
        C63685Oz3.LJIIJ(newBuilder2.LIZLLL, RUF.ADAPTER);
        java.util.Map<String, C79135V3z> map = newBuilder2.LJ;
        ProtoAdapter<C79135V3z> protoAdapter = C79135V3z.ADAPTER;
        C63685Oz3.LJIIJ(map, protoAdapter);
        C63685Oz3.LJIIJ(newBuilder2.LJFF, C63714OzW.ADAPTER);
        C63685Oz3.LJIIJ(newBuilder2.LJI, C79141V4f.ADAPTER);
        java.util.Map<String, V43> map2 = newBuilder2.LJII;
        ProtoAdapter<V43> protoAdapter2 = V43.ADAPTER;
        C63685Oz3.LJIIJ(map2, protoAdapter2);
        java.util.Map<String, C79129V3t> map3 = newBuilder2.LJIIIIZZ;
        ProtoAdapter<C79129V3t> protoAdapter3 = C79129V3t.ADAPTER;
        C63685Oz3.LJIIJ(map3, protoAdapter3);
        V4Q v4q = newBuilder2.LJIIIZ;
        if (v4q != null) {
            newBuilder2.LJIIIZ = V4Q.ADAPTER.redact(v4q);
        }
        V4L v4l = newBuilder2.LJIIJ;
        if (v4l != null) {
            newBuilder2.LJIIJ = V4L.ADAPTER.redact(v4l);
        }
        C63685Oz3.LJIIJ(newBuilder2.LJIIJJI, protoAdapter);
        C63685Oz3.LJIIJ(newBuilder2.LJIIL, protoAdapter2);
        C63685Oz3.LJIIJ(newBuilder2.LJIILIIL, protoAdapter3);
        RU2 ru2 = newBuilder2.LJIILL;
        if (ru2 != null) {
            newBuilder2.LJIILL = RU2.ADAPTER.redact(ru2);
        }
        RUB rub = newBuilder2.LJIILLIIL;
        if (rub != null) {
            newBuilder2.LJIILLIIL = RUB.ADAPTER.redact(rub);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V4S v4s) {
        V4S v4s2 = v4s;
        this.LJ.encodeWithTag(protoWriter, 1, v4s2.text_map);
        this.LJFF.encodeWithTag(protoWriter, 2, v4s2.image_map);
        this.LJI.encodeWithTag(protoWriter, 3, v4s2.link_map);
        this.LJII.encodeWithTag(protoWriter, 4, v4s2.button_map);
        this.LJIIIIZZ.encodeWithTag(protoWriter, 5, v4s2.video_map);
        this.LJIIIZ.encodeWithTag(protoWriter, 6, v4s2.user_map);
        V4Q.ADAPTER.encodeWithTag(protoWriter, 7, v4s2.fallback_info);
        V4L.ADAPTER.encodeWithTag(protoWriter, 8, v4s2.preview_hint);
        this.LJIIJ.encodeWithTag(protoWriter, 100, v4s2.business_image_map);
        this.LJIIJJI.encodeWithTag(protoWriter, 101, v4s2.business_video_map);
        this.LJIIL.encodeWithTag(protoWriter, 102, v4s2.business_user_map);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 200, v4s2.extra_content);
        RU2.ADAPTER.encodeWithTag(protoWriter, 201, v4s2.req_base);
        RUB.ADAPTER.encodeWithTag(protoWriter, 202, v4s2.resp_base);
        protoWriter.writeBytes(v4s2.unknownFields());
    }
}
