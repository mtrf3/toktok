package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69243RFn extends Message<C69243RFn, C69287RHf> {
    public static final ProtoAdapter<C69243RFn> ADAPTER = new C69189RDl();
    public String extra;
    public REV icon;
    public String id;
    public String log_extra;
    public String mp_url;
    public String open_url;
    public String title;
    public String title_tag;
    public Integer type;
    public String web_url;

    public C69243RFn() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69243RFn, C69287RHf> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69243RFn, C69287RHf> newBuilder2() {
        newBuilder2();
        return null;
    }
}
