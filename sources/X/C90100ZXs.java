package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.ZXs, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90100ZXs {
    public ArrayList<String> LIZ;

    public final C90101ZXt LIZJ() {
        if (this.LIZ == null) {
            return C90101ZXt.LIZJ;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.LIZ);
        return new C90101ZXt(bundle, this.LIZ);
    }

    public C90100ZXs() {
    }

    public C90100ZXs(C90101ZXt c90101ZXt) {
        if (c90101ZXt != null) {
            c90101ZXt.LIZ();
            if (!c90101ZXt.LIZIZ.isEmpty()) {
                this.LIZ = new ArrayList<>(c90101ZXt.LIZIZ);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Collection collection) {
        if (collection != null) {
            if (!collection.isEmpty()) {
                for (Object obj : collection) {
                    if (obj != null) {
                        if (this.LIZ == null) {
                            this.LIZ = new ArrayList<>();
                        }
                        if (!this.LIZ.contains(obj)) {
                            this.LIZ.add(obj);
                        }
                    } else {
                        throw new IllegalArgumentException("category must not be null");
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("categories must not be null");
    }

    public final void LIZIZ(C90101ZXt c90101ZXt) {
        if (c90101ZXt != null) {
            c90101ZXt.LIZ();
            LIZ(c90101ZXt.LIZIZ);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
}
