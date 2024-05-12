package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RPq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69506RPq extends Message<C69506RPq, C69507RPr> {
    public static final ProtoAdapter<C69506RPq> ADAPTER = new C69505RPp();
    public C69509RPt content;
    public REV deprecated;
    public String head_icon;
    public C69503RPn tail_action;

    public C69506RPq() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69506RPq, C69507RPr> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69506RPq, C69507RPr> newBuilder2() {
        newBuilder2();
        return null;
    }
}
