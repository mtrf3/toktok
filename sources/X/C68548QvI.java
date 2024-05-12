package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QvI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68548QvI implements Observer<EnumC68524Quu> {
    public final String LJLIL;

    public C68548QvI(String str) {
        this.LJLIL = str;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(EnumC68524Quu oclAvailableLiveData) {
        o.LJIIIZ(oclAvailableLiveData, "oclAvailableLiveData");
        List<BaseLoginMethod> LJ = C68517Qun.LIZ.LJ(R41.LIZIZ.LJFF().allUidList());
        if (oclAvailableLiveData != EnumC68524Quu.NOT_READY && (!LJ.isEmpty())) {
            String enterFrom = this.LJLIL;
            o.LJIIIZ(enterFrom, "enterFrom");
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_from", enterFrom);
            FMX.LJIIL("should_show_ocl", c35936E8m.LIZ);
        }
        C68517Qun.LIZLLL.removeObserver(this);
    }
}
