package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.OmE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62890OmE implements LEA {
    public static final C62890OmE LJLIL = new C62890OmE();

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 1 && i != 2 && i != 3) {
            return;
        }
        boolean LIZ = C62889OmD.LIZ();
        Boolean valueOf = Boolean.valueOf(LIZ);
        MutableLiveData<Boolean> mutableLiveData = C62889OmD.LIZLLL;
        if (!o.LJ(valueOf, mutableLiveData.getValue())) {
            mutableLiveData.setValue(Boolean.valueOf(LIZ));
            if (C35971E9v.LIZ()) {
                C10K.LIZJ(new CallableC40536FvY(LIZ));
            }
        }
        boolean LIZIZ = C62889OmD.LIZIZ();
        Boolean valueOf2 = Boolean.valueOf(LIZIZ);
        MutableLiveData<Boolean> mutableLiveData2 = C62889OmD.LJFF;
        if (o.LJ(valueOf2, mutableLiveData2.getValue())) {
            return;
        }
        mutableLiveData2.setValue(Boolean.valueOf(LIZIZ));
    }
}
