package com.byted.cast.usbsource.usbcommon;

import X.X1D;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes29.dex */
public abstract class Transport {
    public BufferPool mInputBufferPool;
    public final Logger mLogger;
    public ByteBuffer mOutputBuffer;
    public ReaderThread rThread;
    public WriteThread wThread;
    public final Object mLock = new Object();
    public LinkedList<Data> sendList = new LinkedList<>();
    public final Object mLockSend = new Object();
    public final SparseArray<Callback> mServices = new SparseArray<>();
    public final TransportHandler mHandler = new TransportHandler();

    /* loaded from: classes29.dex */
    public interface Callback {
        void onMessageReceived(int i, int i2, ByteBuffer byteBuffer);
    }

    public abstract void flush();

    public abstract void ioClose();

    public abstract int ioRead(byte[] bArr, int i, int i2);

    public abstract void ioWrite(byte[] bArr, int i, int i2);

    public void close() {
        this.mLogger.log("close");
        WriteThread writeThread = this.wThread;
        if (writeThread != null) {
            writeThread.quit();
        }
        ReaderThread readerThread = this.rThread;
        if (readerThread != null) {
            readerThread.quit();
        }
        ioClose();
    }

    public void flushData() {
        this.mLogger.log("flushData ");
        synchronized (this.mLockSend) {
            LinkedList<Data> linkedList = this.sendList;
            if (linkedList != null) {
                linkedList.clear();
            }
        }
        try {
            flush();
        } catch (IOException e) {
            this.mLogger.logError(e.toString());
        }
    }

    public void startReading() {
        if (this.mOutputBuffer != null) {
            this.rThread = new ReaderThread();
            this.wThread = new WriteThread();
            this.rThread.start();
            this.wThread.start();
            return;
        }
        throw new IllegalStateException("Transport has been closed");
    }

    /* loaded from: classes29.dex */
    public final class ReaderThread extends PthreadThread {
        public volatile boolean mQuitting;

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
        
            r1 = r14.this$0.mLogger;
            r0 = X.X1D.LIZ();
            r0.append("Encountered invalid content size: ");
            r0.append(r3);
            r1.logError(X.X1D.LIZIZ(r0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
        
            r1 = r14.this$0.mLogger;
            r0 = X.X1D.LIZ();
            r0.append("Encountered invalid content size: ");
            r0.append(r3);
            r1.logError(X.X1D.LIZIZ(r0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0086, code lost:
        
            if (r7 != null) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void loop() {
            /*
                Method dump skipped, instructions count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.usbsource.usbcommon.Transport.ReaderThread.loop():void");
        }

        public void quit() {
            this.mQuitting = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com_byted_cast_usbsource_usbcommon_Transport$ReaderThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_usbsource_usbcommon_Transport$ReaderThread__run$___twin___() {
            loop();
        }

        public ReaderThread() {
            super("Accessory Display Transport");
        }

        public static void com_byted_cast_usbsource_usbcommon_Transport$ReaderThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ReaderThread readerThread) {
            boolean LIZ;
            try {
                readerThread.com_byted_cast_usbsource_usbcommon_Transport$ReaderThread__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* loaded from: classes29.dex */
    public final class WriteThread extends PthreadThread {
        public volatile boolean mQuitting;

        /* JADX WARN: Removed duplicated region for block: B:27:0x0110 A[Catch: Exception -> 0x0151, TryCatch #3 {Exception -> 0x0151, blocks: (B:16:0x0027, B:20:0x002d, B:21:0x0034, B:23:0x004f, B:25:0x010c, B:27:0x0110, B:28:0x0119, B:49:0x0128, B:51:0x012c, B:52:0x007d, B:54:0x008d, B:55:0x00c5), top: B:15:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0138 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0002 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void loop() {
            /*
                Method dump skipped, instructions count: 523
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.usbsource.usbcommon.Transport.WriteThread.loop():void");
        }

        public void quit() {
            this.mQuitting = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com_byted_cast_usbsource_usbcommon_Transport$WriteThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_usbsource_usbcommon_Transport$WriteThread__run$___twin___() {
            loop();
        }

        public WriteThread() {
            super("Accessory Display Transport");
        }

        public static void com_byted_cast_usbsource_usbcommon_Transport$WriteThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(WriteThread writeThread) {
            boolean LIZ;
            try {
                writeThread.com_byted_cast_usbsource_usbcommon_Transport$WriteThread__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public Logger getLogger() {
        return this.mLogger;
    }

    /* loaded from: classes29.dex */
    public final class TransportHandler extends Handler {
        public TransportHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == -1) {
                try {
                    Transport.this.dispatchMessageReceived(2, 6, null);
                    return;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
            ByteBuffer byteBuffer = (ByteBuffer) message.obj;
            try {
                try {
                    int limit = byteBuffer.limit();
                    while (byteBuffer.position() < limit) {
                        int i = byteBuffer.getShort() & 65535;
                        int i2 = 65535 & byteBuffer.getShort();
                        byteBuffer.getInt();
                        byteBuffer.getLong();
                        int i3 = byteBuffer.getInt();
                        if (i3 == 0) {
                            Transport.this.dispatchMessageReceived(i, i2, null);
                        } else {
                            int position = byteBuffer.position() + i3;
                            byteBuffer.limit(position);
                            Transport.this.dispatchMessageReceived(i, i2, byteBuffer);
                            byteBuffer.limit(limit);
                            byteBuffer.position(position);
                        }
                    }
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            } finally {
                Transport.this.mInputBufferPool.release(byteBuffer);
            }
        }
    }

    public static void checkMessageId(int i) {
        if (i >= 0 && i <= 65535) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("message id out of range: ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static void checkServiceId(int i) {
        if (i >= 0 && i <= 65535) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("service id out of range: ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public void unregisterService(int i) {
        checkServiceId(i);
        synchronized (this.mLock) {
            this.mServices.remove(i);
        }
    }

    public Transport(Logger logger, int i) {
        this.mLogger = logger;
        this.mOutputBuffer = ByteBuffer.allocate(i);
        this.mInputBufferPool = new BufferPool(i, 1048576, 8);
    }

    public void registerService(int i, Callback callback) {
        checkServiceId(i);
        if (callback != null) {
            synchronized (this.mLock) {
                this.mServices.put(i, callback);
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void dispatchMessageReceived(int i, int i2, ByteBuffer byteBuffer) {
        Callback callback;
        synchronized (this.mLock) {
            callback = this.mServices.get(i);
        }
        if (callback != null) {
            callback.onMessageReceived(i, i2, byteBuffer);
            return;
        }
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Discarding message ");
        LIZ.append(i2);
        LIZ.append(" for unregistered service ");
        LIZ.append(i);
        logger.log(X1D.LIZIZ(LIZ));
    }

    public boolean sendData(int i, int i2, int i3, long j, byte[] bArr, boolean z) {
        try {
            checkServiceId(i);
            checkMessageId(i2);
            synchronized (this.mLockSend) {
                if (z) {
                    if (this.sendList.size() > 100) {
                        Iterator<Data> it = this.sendList.iterator();
                        while (it.hasNext()) {
                            if (!it.next().keyData) {
                                it.remove();
                            }
                        }
                    }
                }
                this.sendList.add(new Data(i, i2, i3, j, bArr, z));
            }
            return true;
        } catch (IllegalArgumentException e) {
            this.mLogger.logError(e.toString());
            return false;
        }
    }

    /* loaded from: classes29.dex */
    public class Data {
        public int codectype;
        public ByteBuffer content;
        public boolean keyData;
        public long pts;
        public int service;
        public int what;

        public Data(int i, int i2, int i3, long j, byte[] bArr, boolean z) {
            this.service = i;
            this.what = i2;
            this.codectype = i3;
            this.pts = j;
            this.keyData = z;
            if (bArr != null) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                this.content = wrap;
                wrap.position(0);
            }
        }
    }
}
