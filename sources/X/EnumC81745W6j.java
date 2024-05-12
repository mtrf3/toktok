package X;

/* renamed from: X.W6j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC81745W6j {
    OnCloseToDalvikHeapLimit(0.5d),
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackground(1.0d),
    OnAppBackgrounded(1.0d);

    public final double LJLIL;

    public double getSuggestedTrimRatio() {
        return this.LJLIL;
    }

    EnumC81745W6j(double d) {
        this.LJLIL = d;
    }
}
