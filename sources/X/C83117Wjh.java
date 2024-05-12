package X;

import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wjh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83117Wjh implements InterfaceC83112Wjc {
    public boolean LIZ;
    public String LIZIZ;
    public final InterfaceC83142Wk6 LIZJ;
    public final InterfaceC83159WkN LIZLLL;

    @Override // X.InterfaceC83112Wjc
    public final BeautyCategory LIZIZ() {
        return this.LIZJ.LIZIZ();
    }

    @Override // X.InterfaceC83112Wjc
    public final SafeMutableLiveData<List<BeautyComposerInfo>> LIZLLL() {
        if (!this.LIZ) {
            return new SafeMutableLiveData<>();
        }
        return this.LIZJ.LIZLLL();
    }

    @Override // X.InterfaceC83112Wjc
    public final boolean LLJILJILJ() {
        return this.LIZLLL.LLJILJILJ();
    }

    @Override // X.InterfaceC83112Wjc
    public final void U5() {
        this.LIZJ.P7();
    }

    @Override // X.InterfaceC83112Wjc
    public final boolean g7() {
        return this.LIZLLL.LIZ();
    }

    @Override // X.InterfaceC83112Wjc
    public final SafeMutableLiveData<List<BeautyComposerInfo>> h7() {
        if (!this.LIZ) {
            return new SafeMutableLiveData<>();
        }
        return this.LIZJ.W7();
    }

    @Override // X.InterfaceC83112Wjc
    public final InterfaceC83142Wk6 f7() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC83112Wjc
    public final boolean i7() {
        return this.LIZ;
    }

    @Override // X.InterfaceC83112Wjc
    public final void K(boolean z, ILU gender) {
        o.LJIIIZ(gender, "gender");
        if (!this.LIZ) {
            return;
        }
        if (this.LIZLLL.LJIIJJI() >= 3) {
            gender = ILU.FEMALE;
        }
        if (gender != ILU.CUR) {
            this.LIZJ.o7(z, gender);
        } else {
            InterfaceC83142Wk6 interfaceC83142Wk6 = this.LIZJ;
            interfaceC83142Wk6.o7(z, interfaceC83142Wk6.w7());
        }
    }

    public C83117Wjh(String key, C83146WkA c83146WkA, InterfaceC83159WkN interfaceC83159WkN) {
        o.LJIIIZ(key, "key");
        this.LIZJ = c83146WkA;
        this.LIZLLL = interfaceC83159WkN;
        this.LIZIZ = key;
    }
}
