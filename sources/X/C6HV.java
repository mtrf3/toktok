package X;

import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.o;

/* renamed from: X.6HV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HV {
    public static final /* synthetic */ int LJFF = 0;
    public final int LIZ;
    public final boolean LIZIZ;
    public final VEEditor.SEEK_MODE LIZJ;
    public long LIZLLL;
    public final InterfaceC133865Ne LJ;

    static {
        new Object() { // from class: X.6HX
        };
    }

    public C6HV(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6HV(long j, VEEditor.SEEK_MODE seekMode, InterfaceC133865Ne interfaceC133865Ne) {
        this(3, true);
        o.LJIIIZ(seekMode, "seekMode");
        this.LIZLLL = j;
        this.LIZJ = seekMode;
        this.LJ = interfaceC133865Ne;
    }
}
