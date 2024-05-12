package X;

import com.bytedance.ttnet.TTNetInit;

/* renamed from: X.Pai, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64724Pai extends RunnableC39007FSp {
    public final /* synthetic */ String LJLJJL;

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            TTNetInit.onClientIPChanged(this.LJLJJL);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64724Pai(String str) {
        super((Object) null);
        this.LJLJJL = str;
    }
}
