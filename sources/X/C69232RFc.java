package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69232RFc extends Message<C69232RFc, C69356RJw> {
    public static final ProtoAdapter<C69232RFc> ADAPTER = new C69179RDb();
    public REV avatar_larger;
    public REV avatar_thumb;
    public Integer follow_status;
    public C69475ROl hit_task_info;
    public String nickname;
    public String sec_uid;
    public String signature;
    public Integer status;
    public String uid;
    public String unique_id;
    public Integer user_rate;

    public C69232RFc() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69232RFc, C69356RJw> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69232RFc, C69356RJw> newBuilder2() {
        newBuilder2();
        return null;
    }
}
