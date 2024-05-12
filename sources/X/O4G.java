package X;

import android.os.FileObserver;

/* loaded from: classes11.dex */
public final class O4G extends FileObserver {
    public final /* synthetic */ O47 LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEvent: event=");
        LIZ.append(i);
        LIZ.append(",path=");
        LIZ.append(str);
        C39930Flm.LIZ("MemoryManager", X1D.LIZIZ(LIZ));
        if (i == 512 || i == 1024) {
            C39930Flm.LIZ("MemoryManager", "onEvent: delete");
            this.LIZ.LIZ(this.LIZIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O4G(O47 o47, String str, String str2) {
        super(str2, 1536);
        this.LIZ = o47;
        this.LIZIZ = str;
    }
}
