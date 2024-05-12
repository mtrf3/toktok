package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.HtL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45495HtL extends F9E implements Serializable {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;

    public static /* synthetic */ C45495HtL copy$default(C45495HtL c45495HtL, boolean z, boolean z2, int i, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c45495HtL.LJLIL;
        }
        if ((i2 & 2) != 0) {
            z2 = c45495HtL.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            i = c45495HtL.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z3 = c45495HtL.LJLJJI;
        }
        return c45495HtL.copy(z, z2, i, z3);
    }

    public final C45495HtL copy(boolean z, boolean z2, int i, boolean z3) {
        return new C45495HtL(z, z2, i, z3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public final boolean isFailed() {
        if (this.LJLIL && this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public final boolean isLoading() {
        if (!this.LJLIL && this.LJLJI != 0) {
            return true;
        }
        return false;
    }

    public final boolean isSucceed() {
        if (this.LJLIL && !this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public final boolean notDownloaded() {
        if (!this.LJLIL && this.LJLJI == 0) {
            return true;
        }
        return false;
    }

    public final boolean getLastDownloadFailed() {
        return this.LJLJJI;
    }

    public final int getProgress() {
        return this.LJLJI;
    }

    public final boolean isComplete() {
        return this.LJLIL;
    }

    public final boolean isFail() {
        return this.LJLILLLLZI;
    }

    public final void setComplete(boolean z) {
        this.LJLIL = z;
    }

    public final void setFail(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setLastDownloadFailed(boolean z) {
        this.LJLJJI = z;
    }

    public final void setProgress(int i) {
        this.LJLJI = i;
    }

    public C45495HtL(boolean z, boolean z2, int i, boolean z3) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = i;
        this.LJLJJI = z3;
    }

    public /* synthetic */ C45495HtL(boolean z, boolean z2, int i, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, (i2 & 8) != 0 ? false : z3);
    }
}
