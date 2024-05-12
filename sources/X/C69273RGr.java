package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69273RGr extends Message<C69273RGr, C69301RHt> {
    public static final ProtoAdapter<C69273RGr> ADAPTER = new C69219REp();
    public String author;
    public Long id;
    public String mixed_author;
    public String mixed_title;
    public String title;

    public C69273RGr() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69273RGr, C69301RHt> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69273RGr, C69301RHt> newBuilder2() {
        newBuilder2();
        return null;
    }
}
