package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69234RFe extends Message<C69234RFe, RIU> {
    public static final ProtoAdapter<C69234RFe> ADAPTER = new C69192RDo();
    public String aweme_id;
    public Long collect_count;
    public Long comment_count;
    public Long digg_count;
    public Long download_count;
    public Long forward_count;
    public Integer lose_comment_count;
    public Integer lose_count;
    public Long play_count;
    public Long share_count;
    public Long whatsapp_share_count;

    public C69234RFe() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69234RFe, RIU> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69234RFe, RIU> newBuilder2() {
        newBuilder2();
        return null;
    }
}
