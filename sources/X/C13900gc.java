package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.0gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13900gc {
    public C1TL LIZIZ;
    public C1TN LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public InterfaceC65784Pro<String> LIZ = C21F.LJLIL;
    public float LJFF = 0.5f;
    public int LJI = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    public EnumC13960gi LJII = EnumC13960gi.NORMAL;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1TL] */
    public final void LIZ(final InterfaceC88471Ynr<? super View, ? super String, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LIZIZ = new InterfaceC19530ph() { // from class: X.1TL
            @Override // X.InterfaceC19530ph
            public final void LIZ(View view, String itemID) {
                o.LJIIIZ(itemID, "itemID");
                callback.invoke(view, itemID);
            }
        };
    }

    public static void LIZIZ(C13900gc c13900gc, boolean z, float f, int i, int i2) {
        EnumC13960gi strategy;
        boolean z2 = false;
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) == 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            f = 0.5f;
        }
        if ((i2 & 8) != 0) {
            i = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        if ((i2 & 16) != 0) {
            strategy = EnumC13960gi.NORMAL;
        } else {
            strategy = null;
        }
        c13900gc.getClass();
        o.LJIIIZ(strategy, "strategy");
        c13900gc.LIZLLL = z;
        c13900gc.LJ = z2;
        c13900gc.LJFF = f;
        c13900gc.LJI = i;
        c13900gc.LJII = strategy;
    }
}
