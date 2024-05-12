package X;

import com.bytedance.android.live.network.response.BaseListResponse;
import com.squareup.wire.ProtoReader;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* renamed from: X.1EW, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1EW implements InterfaceC48038ItG {
    public static AbstractC73672Svk LIZ(AbstractC73672Svk abstractC73672Svk) {
        return abstractC73672Svk.LJII(new C62705OjF());
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return ((BaseListResponse) obj).data;
    }

    public static void LIZJ(ProtoReader protoReader, ProtoReader protoReader2) {
        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader2);
    }

    public static void LIZIZ(long j, long j2, LaneParams laneParams, String str) {
        laneParams.plusAssign(str, Long.valueOf(j - j2));
    }

    public static void LIZLLL(StringBuilder sb, String str, StringBuilder sb2, String str2) {
        sb.append(str);
        C0NB.LJ(str2, X1D.LIZIZ(sb2));
    }
}
