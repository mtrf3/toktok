package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.Pi4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65180Pi4<T extends Message<T, ?>> implements InterfaceC65016PfQ<TypedInput, T> {
    public final ProtoAdapter<T> LIZ;

    public C65180Pi4(ProtoAdapter<T> protoAdapter) {
        this.LIZ = protoAdapter;
    }

    @Override // X.InterfaceC65016PfQ
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final T LIZ(TypedInput typedInput) {
        try {
            return this.LIZ.decode(typedInput.in());
        } finally {
            typedInput.in().reset();
        }
    }
}
