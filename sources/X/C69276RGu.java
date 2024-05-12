package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69276RGu extends Message<C69276RGu, C69314RIg> {
    public static final ProtoAdapter<C69276RGu> ADAPTER = new RF9();
    public String biz_params;
    public String conent_scope;
    public String content_scope;
    public RJX replace;
    public String survey_key;

    public C69276RGu() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69276RGu, C69314RIg> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69276RGu, C69314RIg> newBuilder2() {
        newBuilder2();
        return null;
    }
}
