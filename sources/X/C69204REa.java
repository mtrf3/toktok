package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.REa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69204REa extends Message<C69204REa, RK0> {
    public static final ProtoAdapter<C69204REa> ADAPTER = new RDD();
    public String aweme_id;
    public Integer end;
    public String hashTagName;
    public String hashtag_id;
    public String hashtag_name;
    public Boolean is_commerce;
    public Integer line_idx;
    public Long question_id;
    public String sec_uid;
    public Integer start;
    public Integer sub_type;
    public String tag_id;
    public Integer type;
    public String user_id;

    public C69204REa() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69204REa, RK0> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69204REa, RK0> newBuilder2() {
        newBuilder2();
        return null;
    }
}
