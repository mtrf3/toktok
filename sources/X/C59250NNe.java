package X;

import android.text.TextUtils;

/* renamed from: X.NNe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59250NNe extends NNJ {
    @Override // X.NNJ
    public final boolean LIZIZ() {
        if (C38499F9b.LIZ.LIZIZ().openMiniApp(LIZJ(), LJI(), new C227898wz())) {
            return true;
        }
        return false;
    }

    @Override // X.NNJ
    public final boolean LIZ() {
        if (TextUtils.isEmpty(LJI())) {
            return false;
        }
        return C56209M4f.LIZ(LJI());
    }

    public final String LJI() {
        if (!TextUtils.isEmpty(LIZLLL().LIZLLL.LIZ)) {
            return LIZLLL().LIZLLL.LIZ;
        }
        return LIZLLL().LIZJ.LIZ;
    }
}
