package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGP extends Message<RGP, C69337RJd> {
    public static final ProtoAdapter<RGP> ADAPTER = new REB();
    public String app_name;
    public String apple_id;
    public String download_url;
    public Integer fans_count;
    public String icon;
    public String name;
    public String open_url;
    public String package_name;

    public RGP() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGP, C69337RJd> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGP, C69337RJd> newBuilder2() {
        newBuilder2();
        return null;
    }
}
