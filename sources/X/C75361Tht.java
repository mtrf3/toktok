package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Tht, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75361Tht extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ C47061t0 LIZIZ;
    public final /* synthetic */ C75357Thp LIZJ;
    public final /* synthetic */ ImageModel LIZLLL;

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        C47061t0 c47061t0 = this.LIZIZ;
        if (c47061t0 != null && c47061t0.getId() == R.id.hb4) {
            this.LIZJ.LJLL = false;
        } else {
            C47061t0 c47061t02 = this.LIZIZ;
            if (c47061t02 != null && c47061t02.getId() == R.id.i1g) {
                this.LIZJ.LJLLILLLL = false;
            }
        }
        C76175Tv1.LIZ.LIZ(40008, String.valueOf(th), null);
    }

    public C75361Tht(C47061t0 c47061t0, C75357Thp c75357Thp, ImageModel imageModel) {
        this.LIZIZ = c47061t0;
        this.LIZJ = c75357Thp;
        this.LIZLLL = imageModel;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        C47061t0 c47061t0 = this.LIZIZ;
        boolean z = true;
        if (c47061t0 != null && c47061t0.getId() == R.id.hb4) {
            C75357Thp c75357Thp = this.LIZJ;
            if (obj == null || this.LIZLLL == null) {
                z = false;
            }
            c75357Thp.LJLL = z;
            return;
        }
        C47061t0 c47061t02 = this.LIZIZ;
        if (c47061t02 == null || c47061t02.getId() != R.id.i1g) {
            return;
        }
        C75357Thp c75357Thp2 = this.LIZJ;
        if (obj == null || this.LIZLLL == null) {
            z = false;
        }
        c75357Thp2.LJLLILLLL = z;
    }
}
