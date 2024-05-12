package X;

/* renamed from: X.PLf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64295PLf extends C64298PLi {
    public boolean LIZ;

    @Override // X.C64298PLi
    public final boolean LIZ(String str) {
        if (!this.LIZ && str.contains("android.os.Looper.loop")) {
            this.LIZ = true;
        }
        return !this.LIZ;
    }
}
