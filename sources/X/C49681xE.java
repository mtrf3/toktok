package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {41, 44, C61447O9r.LJIIJ}, m = "forEachGesture")
/* renamed from: X.1xE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49681xE extends C3CS {
    public InterfaceC37501da LJLIL;
    public InterfaceC88471Ynr LJLILLLLZI;
    public MBA LJLJI;
    public /* synthetic */ Object LJLJJI;
    public int LJLJJL;

    public C49681xE(InterfaceC67352kd<? super C49681xE> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0UR.LIZIZ(null, null, this);
    }
}
