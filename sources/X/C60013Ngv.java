package X;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.Ngv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60013Ngv extends ContentObserver {
    public final Context LIZ;
    public final AudioManager LIZIZ;
    public final UCH LIZJ;
    public final InterfaceC60000Ngi LIZLLL;
    public float LJ;

    public C60013Ngv(Handler handler, Context context, UCH uch, C59998Ngg c59998Ngg) {
        super(handler);
        this.LIZ = context;
        this.LIZIZ = (AudioManager) C16880lQ.LLILL(context, "audio");
        this.LIZJ = uch;
        this.LIZLLL = c59998Ngg;
    }

    public final float LIZ() {
        int streamVolume = this.LIZIZ.getStreamVolume(3);
        int LLLLLLZZ = C16880lQ.LLLLLLZZ(this.LIZIZ, 3);
        this.LIZJ.getClass();
        if (LLLLLLZZ <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / LLLLLLZZ;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public final void LIZIZ() {
        InterfaceC60000Ngi interfaceC60000Ngi = this.LIZLLL;
        float f = this.LJ;
        C59998Ngg c59998Ngg = (C59998Ngg) interfaceC60000Ngi;
        c59998Ngg.LIZ = f;
        if (c59998Ngg.LJ == null) {
            c59998Ngg.LJ = C60023Nh5.LIZJ;
        }
        Iterator it = Collections.unmodifiableCollection(c59998Ngg.LJ.LIZIZ).iterator();
        while (it.hasNext()) {
            AbstractC60015Ngx abstractC60015Ngx = ((C60014Ngw) it.next()).LJ;
            abstractC60015Ngx.getClass();
            C37137Ehp.LIZIZ(abstractC60015Ngx.LJFF(), "setDeviceVolume", Float.valueOf(f));
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float LIZ = LIZ();
        if (LIZ != this.LJ) {
            this.LJ = LIZ;
            LIZIZ();
        }
    }
}
