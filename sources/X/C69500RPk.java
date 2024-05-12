package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RPk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69500RPk extends Message<C69500RPk, C69501RPl> {
    public static final ProtoAdapter<C69500RPk> ADAPTER = new C69499RPj();
    public REV deprecated;
    public String icon;
    public String schema;
    public String text;

    public C69500RPk() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69500RPk, C69501RPl> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69500RPk, C69501RPl> newBuilder2() {
        newBuilder2();
        return null;
    }
}
