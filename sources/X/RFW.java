package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RFW extends Message<RFW, RIR> {
    public static final ProtoAdapter<RFW> ADAPTER = new RDN();
    public String category_meta;
    public String content;
    public String extra;
    public C69199RDv invite_share_info;
    public Long item_id;
    public Long question_id;
    public String sec_uid;
    public REV user_avatar;
    public Long user_id;
    public String username;

    public RFW() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFW, RIR> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFW, RIR> newBuilder2() {
        newBuilder2();
        return null;
    }
}
