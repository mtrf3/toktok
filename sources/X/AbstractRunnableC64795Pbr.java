package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Pbr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractRunnableC64795Pbr implements Runnable {
    public long mInitialDelay;
    public long mLoopInterval;
    public EnumC64792Pbo mTaskType;
    public TimeUnit mTimeUnit;

    public boolean isLoop() {
        if (this.mLoopInterval > 0) {
            return true;
        }
        return false;
    }

    public AbstractRunnableC64795Pbr() {
        this.mTimeUnit = TimeUnit.MILLISECONDS;
    }

    public AbstractRunnableC64795Pbr(long j) {
        this.mTimeUnit = TimeUnit.MILLISECONDS;
        this.mLoopInterval = j;
    }

    public AbstractRunnableC64795Pbr(long j, long j2) {
        this(j2);
        this.mInitialDelay = j;
    }

    public AbstractRunnableC64795Pbr(long j, long j2, TimeUnit timeUnit) {
        this(j, j2);
        this.mTimeUnit = timeUnit;
    }
}
