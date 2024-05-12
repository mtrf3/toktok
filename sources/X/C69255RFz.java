package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69255RFz extends Message<C69255RFz, RJR> {
    public static final ProtoAdapter<C69255RFz> ADAPTER = new RDZ();
    public REV avatar;
    public REV avatar_larger;
    public REV avatar_thumb;
    public Integer follow_status;
    public String nickname;
    public String remark_name;
    public String sec_uid;
    public Long uid;

    public C69255RFz() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69255RFz, RJR> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69255RFz, RJR> newBuilder2() {
        newBuilder2();
        return null;
    }
}
