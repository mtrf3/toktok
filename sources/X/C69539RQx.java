package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* renamed from: X.RQx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69539RQx extends Message<C69539RQx, C69540RQy> {
    public static final ProtoAdapter<C69539RQx> ADAPTER = new C69538RQw();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "ReportClientMetricsResponseBody{", '}');
    }

    public C69539RQx() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69539RQx, C69540RQy> newBuilder2() {
        C69540RQy c69540RQy = new C69540RQy();
        c69540RQy.addUnknownFields(unknownFields());
        return c69540RQy;
    }

    public C69539RQx(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
