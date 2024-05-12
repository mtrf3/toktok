package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RKd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69363RKd extends Message<C69363RKd, C69364RKe> {
    public static final ProtoAdapter<C69363RKd> ADAPTER = new C69362RKc();
    public String client_ai_upload_json_str;
    public String sati_param_for_pitaya;

    public C69363RKd() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69363RKd, C69364RKe> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69363RKd, C69364RKe> newBuilder2() {
        newBuilder2();
        return null;
    }
}
