package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RF0 extends Message<RF0, C69324RIq> {
    public static final ProtoAdapter<RF0> ADAPTER = new RDC();
    public REV avatar_168x168;
    public REV avatar_thumb;
    public String custom_verify;
    public String enterprise_verify_reason;
    public Integer follow_status;
    public Integer follower_status;
    public Integer interest_level;
    public Integer invitation_status;
    public Boolean is_business_account;
    public Integer is_private_account;
    public String nickname;
    public String uid;
    public String unique_id;

    public RF0() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RF0, C69324RIq> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RF0, C69324RIq> newBuilder2() {
        newBuilder2();
        return null;
    }
}
