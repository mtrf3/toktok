package com.ss.ttm.player;

import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class AJMediaCodecFrame implements Cloneable {
    public ByteBuffer data;
    public int flags;
    public int index;
    public long pts = -269488145;
    public int size;

    public final Object clone() {
        try {
            return (AJMediaCodecFrame) super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }
}
