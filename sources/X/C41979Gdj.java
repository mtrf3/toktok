package X;

import android.app.Activity;
import android.content.Intent;
import java.io.Serializable;

/* renamed from: X.Gdj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41979Gdj<T> implements InterfaceC15040iS {
    public final /* synthetic */ Intent LIZ;
    public final /* synthetic */ Activity LIZIZ;

    public C41979Gdj(Activity activity, Intent intent) {
        this.LIZ = intent;
        this.LIZIZ = activity;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Object obj) {
        this.LIZ.putExtra("challenge", (Serializable) C47261Igj.LJJIJ(obj));
        if (C41030G8k.LIZ()) {
            C42662Gok.LIZJ(this.LIZIZ, C16880lQ.LLJJIJI(this.LIZ), null);
        } else {
            C16880lQ.LIZIZ(this.LIZIZ, this.LIZ);
        }
        this.LIZIZ.finish();
    }
}
