package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RDR extends Message<RDR, RK7> {
    public static final ProtoAdapter<RDR> ADAPTER = new RD4();
    public String ad_owner_id;
    public String ad_owner_name;
    public String challenge_id;
    public String detail_desc;
    public String detail_letters;
    public String detail_open_url;
    public String detail_web_url;
    public String detail_web_url_title;
    public Long expire_time;
    public String id;
    public String music_id;
    public REV publish_icon_url;
    public String publish_letters;
    public String publish_open_url;
    public String publish_web_url;
    public String publish_web_url_title;
    public String screen_desc;
    public REV screen_icon;
    public Boolean screen_switch;
    public RLP unlock_info;

    public RDR() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RDR, RK7> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RDR, RK7> newBuilder2() {
        newBuilder2();
        return null;
    }
}
