package X;

import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.GrG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42818GrG<T> implements InterfaceC115714gR {
    public static final C42818GrG<T> LJLIL = new C42818GrG<>();

    @Override // X.InterfaceC115714gR
    public final void LIZ(InterfaceC116954iR<? super RecommendHashtagResponse> it) {
        o.LJIIIZ(it, "it");
        it.onError(new RuntimeException("time out"));
    }
}
