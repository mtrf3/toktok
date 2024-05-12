package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RD1 extends Message<RD1, RK4> {
    public static final ProtoAdapter<RD1> ADAPTER = new C69166RCo();
    public REV avatar_large;
    public REV avatar_medium;
    public REV avatar_thumb;
    public List<String> children;
    public RDR commerce_sticker;
    public String desc;
    public String effect_id;
    public String extra;
    public REV icon_url;
    public String id;
    public Boolean is_favorite;
    public String name;
    public String owner_id;
    public String owner_nickname;
    public String sec_uid;
    public C69199RDv share_info;
    public List<String> tags;
    public Integer user_count;
    public Long vv_count;

    public RD1() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.children = C63685Oz3.LJIIIIZZ();
        this.tags = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RD1, RK4> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RD1, RK4> newBuilder2() {
        newBuilder2();
        return null;
    }
}
