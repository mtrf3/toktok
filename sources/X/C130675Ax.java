package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130675Ax extends C5B4<C130545Ak> implements LifecycleOwner {
    public static final int LJLJL;
    public static final float LJLJLJ;
    public static final float LJLJLLL;
    public static final float LJLL;
    public static final float LJLLI;
    public static final float LJLLILLLL;
    public static final float LJLLJ;
    public final C130545Ak LJLJJI;
    public String LJLJJL;
    public final C62822Ol8 LJLJJLL;

    static {
        new C67502ks();
        LJLJL = C134845Qy.LIZ(1.0f);
        LJLJLJ = C134845Qy.LIZ(4.0f);
        LJLJLLL = C134845Qy.LIZ(2.0f);
        LJLL = C134845Qy.LIZ(8.0f);
        LJLLI = C134845Qy.LIZ(8.0f);
        LJLLILLLL = C134845Qy.LIZ(12.0f);
        LJLLJ = C134845Qy.LIZ(13.0f);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LJLJJLL.getValue();
    }

    @Override // X.C5B4
    public final /* bridge */ /* synthetic */ C130545Ak LIZ() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130675Ax(C29S activity) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        this.LJLJJI = new C130545Ak(this.LJLIL);
        this.LJLJJL = "";
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 888));
    }

    @Override // X.C5B4, X.C5A5
    public final void setSegment(NLETrackSlot slot) {
        o.LJIIIZ(slot, "slot");
        String newExtra = slot.getExtra("audio_stick_points");
        if (!o.LJ(newExtra, this.LJLJJL)) {
            o.LJIIIIZZ(newExtra, "newExtra");
            this.LJLJJI.setAllStickPoints(C67502ks.LIZ(newExtra));
            this.LJLJJL = newExtra;
        }
        super.setSegment(slot);
    }
}
