package com.ss.ttlivestreamer.core.utils;

import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class ByteBufferUtils {
    public static ByteBuffer clone(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        allocate.flip();
        return allocate;
    }
}
