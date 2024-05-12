package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.Pi2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65178Pi2<T extends Message<T, ?>> implements InterfaceC65016PfQ<T, TypedOutput> {
    public static final C39745Fin LIZIZ = C39745Fin.LIZJ("application/x-protobuf");
    public final ProtoAdapter<T> LIZ;

    public C65178Pi2(ProtoAdapter<T> protoAdapter) {
        this.LIZ = protoAdapter;
    }

    @Override // X.InterfaceC65016PfQ
    public final TypedOutput LIZ(Object obj) {
        C64533PUj c64533PUj = new C64533PUj();
        this.LIZ.encode((PVU) c64533PUj, (C64533PUj) obj);
        return new TypedByteArray(LIZIZ.LIZIZ, c64533PUj.LLLLIIL(), new String[0]);
    }
}
