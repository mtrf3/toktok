package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RH8 extends Message<RH8, C69342RJi> {
    public static final ProtoAdapter<RH8> ADAPTER = new RFP();
    public String city_code;
    public String city_name;
    public String lat;
    public String lng;
    public String region_code;

    public RH8() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RH8, C69342RJi> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RH8, C69342RJi> newBuilder2() {
        newBuilder2();
        return null;
    }
}
