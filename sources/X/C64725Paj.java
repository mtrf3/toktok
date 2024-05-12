package X;

import com.bytedance.ttnet.TTNetInit;
import java.util.List;

/* renamed from: X.Paj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64725Paj extends RunnableC39007FSp {
    public final /* synthetic */ List LJLJJL;
    public final /* synthetic */ List LJLJJLL;

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            TTNetInit.onPublicIPsChanged(this.LJLJJL, this.LJLJJLL);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64725Paj(List list, List list2) {
        super((Object) null);
        this.LJLJJL = list;
        this.LJLJJLL = list2;
    }
}
