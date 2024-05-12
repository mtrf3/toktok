package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V0R extends V0Q implements Serializable {
    public /* synthetic */ V0R(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // X.V0Q
    public boolean nextBoolean() {
        return V0Q.defaultRandom.nextBoolean();
    }

    @Override // X.V0Q
    public double nextDouble() {
        return V0Q.defaultRandom.nextDouble();
    }

    @Override // X.V0Q
    public float nextFloat() {
        return V0Q.defaultRandom.nextFloat();
    }

    @Override // X.V0Q
    public int nextInt() {
        return V0Q.defaultRandom.nextInt();
    }

    @Override // X.V0Q
    public long nextLong() {
        return V0Q.defaultRandom.nextLong();
    }

    public V0R() {
    }

    private final Object writeReplace() {
        return EBE.LJLIL;
    }

    @Override // X.V0Q
    public int nextBits(int i) {
        return V0Q.defaultRandom.nextBits(i);
    }

    @Override // X.V0Q
    public byte[] nextBytes(byte[] array) {
        o.LJIIIZ(array, "array");
        return V0Q.defaultRandom.nextBytes(array);
    }

    @Override // X.V0Q
    public double nextDouble(double d) {
        return V0Q.defaultRandom.nextDouble(d);
    }

    @Override // X.V0Q
    public int nextInt(int i) {
        return V0Q.defaultRandom.nextInt(i);
    }

    @Override // X.V0Q
    public long nextLong(long j) {
        return V0Q.defaultRandom.nextLong(j);
    }

    @Override // X.V0Q
    public byte[] nextBytes(int i) {
        return V0Q.defaultRandom.nextBytes(i);
    }

    @Override // X.V0Q
    public double nextDouble(double d, double d2) {
        return V0Q.defaultRandom.nextDouble(d, d2);
    }

    @Override // X.V0Q
    public int nextInt(int i, int i2) {
        return V0Q.defaultRandom.nextInt(i, i2);
    }

    @Override // X.V0Q
    public long nextLong(long j, long j2) {
        return V0Q.defaultRandom.nextLong(j, j2);
    }

    @Override // X.V0Q
    public byte[] nextBytes(byte[] array, int i, int i2) {
        o.LJIIIZ(array, "array");
        return V0Q.defaultRandom.nextBytes(array, i, i2);
    }
}
