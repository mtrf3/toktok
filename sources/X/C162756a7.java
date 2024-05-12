package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6a7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162756a7 {
    public final ActivityC45651qj LIZ;
    public final int LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final Bundle LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final InterfaceC88472Yns<InterfaceC65784Pro<C76800UCe>, C76800UCe> LJI;

    public C162756a7() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C162756a7)) {
            return false;
        }
        C162756a7 c162756a7 = (C162756a7) obj;
        return o.LJ(this.LIZ, c162756a7.LIZ) && this.LIZIZ == c162756a7.LIZIZ && o.LJ(this.LIZJ, c162756a7.LIZJ) && o.LJ(this.LIZLLL, c162756a7.LIZLLL) && this.LJ == c162756a7.LJ && this.LJFF == c162756a7.LJFF && o.LJ(this.LJI, c162756a7.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31)) * 31)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + (this.LJFF ? 1 : 0)) * 31;
        InterfaceC88472Yns<InterfaceC65784Pro<C76800UCe>, C76800UCe> interfaceC88472Yns = this.LJI;
        return i2 + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaveLocalConfig(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", saveType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", editModel=");
        LIZ.append(this.LIZJ);
        LIZ.append(", publishBundle=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", showToast=");
        LIZ.append(this.LJ);
        LIZ.append(", hasDynamicElements=");
        LIZ.append(this.LJFF);
        LIZ.append(", saveLocalPrepareTask=");
        return C249109q6.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C162756a7(ActivityC45651qj context, int i, VideoPublishEditModel editModel, Bundle bundle, boolean z, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = editModel;
        this.LIZLLL = bundle;
        this.LJ = true;
        this.LJFF = z;
        this.LJI = interfaceC88472Yns;
    }
}
