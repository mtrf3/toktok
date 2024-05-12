package X;

import java.util.ArrayList;

/* renamed from: X.JfG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49718JfG<T> {
    public ArrayList<T> LIZIZ;
    public boolean LIZLLL;
    public ArrayList<T> LIZ = new ArrayList<>();
    public final C49734JfW<T> LIZJ = new C49734JfW<>();

    public final void LIZ() {
        if (this.LIZLLL) {
            this.LIZLLL = false;
            ArrayList<T> arrayList = this.LIZIZ;
            if (arrayList != null) {
                this.LIZ = arrayList;
                this.LIZJ.LIZ.clear();
                this.LIZJ.LIZIZ = 0;
            }
            this.LIZIZ = null;
            return;
        }
        throw new IllegalStateException("Iteration not started");
    }

    public final ArrayList<T> LIZIZ() {
        if (this.LIZLLL) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new ArrayList<>(this.LIZ);
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }
}
