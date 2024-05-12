package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RCz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69177RCz extends Message<C69177RCz, RKA> {
    public static final ProtoAdapter<C69177RCz> ADAPTER = new C69163RCl();
    public C69165RCn author;
    public String aweme_id;
    public Integer aweme_type;
    public Long create_time;
    public String desc_language;
    public Integer distribute_type;
    public String extra;
    public String group_id;
    public List<C69271RGp> image_infos;
    public Boolean is_vr;
    public List<C69266RGk> long_video;
    public C69173RCv music;
    public RMQ statistics;
    public ROK status;
    public String take_down_desc;
    public Integer take_down_reason;
    public Integer user_digged;
    public C69174RCw video;

    public C69177RCz() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.image_infos = C63685Oz3.LJIIIIZZ();
        this.long_video = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69177RCz, RKA> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69177RCz, RKA> newBuilder2() {
        newBuilder2();
        return null;
    }
}
