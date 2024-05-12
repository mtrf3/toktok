package X;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.Qoq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68148Qoq implements InterfaceC68141Qoj {
    public Object LJLIL;

    public /* synthetic */ C68148Qoq() {
    }

    public /* synthetic */ C68148Qoq(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC68141Qoj
    public final void LIZ(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C68033Qmz c68033Qmz = ((C68241QqL) this.LJLIL).LJIIJJI;
            if (c68033Qmz != null) {
                c68033Qmz.LIZJ().LJFF.LIZIZ("_err", "AppId not known when logging event");
                return;
            }
            return;
        }
        ((C68241QqL) this.LJLIL).LIZIZ().LJIILIIL(new RunnableC68149Qor(this, str, bundle));
    }
}
