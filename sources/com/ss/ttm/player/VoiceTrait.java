package com.ss.ttm.player;

import X.C47145Ier;
import X.C47146Ies;

/* loaded from: classes9.dex */
public abstract class VoiceTrait extends TraitObject {
    public abstract void audioClose();

    public abstract void audioFlush();

    public abstract int audioOpen(C47146Ies c47146Ies);

    public abstract void audioPause();

    public abstract void audioResume();

    public abstract int audioWrite(C47145Ier c47145Ier);

    public abstract int getLatency();
}
