package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public abstract class NQZ implements InterfaceC58572Mym {
    public static final /* synthetic */ NQZ[] LJLIL;
    public static final NQZ PROGRESS_15S;
    public static final NQZ PROGRESS_2S;
    public static final NQZ PROGRESS_6S;

    public NQZ() {
        throw null;
    }

    public static NQZ valueOf(String str) {
        return (NQZ) V0N.LJJJ(NQZ.class, str);
    }

    public static NQZ[] values() {
        return (NQZ[]) LJLIL.clone();
    }

    @Override // X.InterfaceC58572Mym
    public abstract /* synthetic */ String label(boolean z);

    @Override // X.InterfaceC58572Mym
    public abstract /* synthetic */ boolean valid(long j, long j2);

    static {
        NQZ nqz = new NQZ() { // from class: X.NQr
            @Override // X.NQZ, X.InterfaceC58572Mym
            public final String label(boolean z) {
                return z ? "view_2s" : "play_2s";
            }

            @Override // X.NQZ, X.InterfaceC58572Mym
            public final boolean valid(long j, long j2) {
                if (j >= getLength() && j2 >= getLength()) {
                    return true;
                }
                return false;
            }
        };
        PROGRESS_2S = nqz;
        NQZ nqz2 = new NQZ() { // from class: X.NQs
            @Override // X.NQZ, X.InterfaceC58572Mym
            public final String label(boolean z) {
                return z ? "view_6s" : "play_6s";
            }

            @Override // X.NQZ, X.InterfaceC58572Mym
            public final boolean valid(long j, long j2) {
                if (j >= getLength() && j2 >= getLength()) {
                    return true;
                }
                return false;
            }
        };
        PROGRESS_6S = nqz2;
        NQZ nqz3 = new NQZ() { // from class: X.NQq
            @Override // X.NQZ, X.InterfaceC58572Mym
            public final String label(boolean z) {
                return z ? "view_15s" : "play_15s";
            }

            @Override // X.NQZ, X.InterfaceC58572Mym
            public final boolean valid(long j, long j2) {
                if (j >= getLength() && j2 >= getLength()) {
                    return true;
                }
                return false;
            }
        };
        PROGRESS_15S = nqz3;
        LJLIL = new NQZ[]{nqz, nqz2, nqz3};
    }

    public final long getLength() {
        int i = NQY.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 2000L;
                }
                throw new C162476Zf();
            }
            return LivePlayEnforceIntervalSetting.DEFAULT;
        }
        return 6000L;
    }

    public NQZ(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
