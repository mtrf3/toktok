package com.bytedance.keva;

import X.C16880lQ;
import X.V0N;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes16.dex */
public class KevaAsyncWriter extends KevaFuture {
    public static final long MAIN_THREAD_ID = C16880lQ.LLJJJJ().getThread().getId();
    public static final Map<String, Boolean> sIgnoreMap;
    public static final CopyOnWriteArrayList<OnFlushListener> sListeners;
    public static final Keva sWalFlagKeva;
    public final LinkedHashMap<String, AsyncWriteObject> mMap;
    public volatile boolean mNeedClear;
    public final ReentrantReadWriteLock mReentrantReadWriteLock;
    public volatile Stage mStage;
    public final Object mSyncLock;
    public volatile boolean mWalCheckReady;
    public final OnFlushListener onFlushListener;

    /* loaded from: classes16.dex */
    public interface OnFlushListener {
        void onFlush();
    }

    @Override // com.bytedance.keva.KevaFuture
    public void initTask(Callable<KevaImpl> callable) {
    }

    public void onFlushImpl() {
        boolean z;
        synchronized (this) {
            int i = AnonymousClass4.$SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage[this.mStage.ordinal()];
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.mStage = Stage.FLUSH;
                z = false;
            } else {
                this.mStage = Stage.FLUSH;
                z = true;
            }
            if (z) {
                commitWAL();
            } else {
                checkRepoAllReady();
            }
        }
    }

    /* renamed from: com.bytedance.keva.KevaAsyncWriter$4, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type;
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage;

        static {
            int[] iArr = new int[AsyncWriteObject.Type.values().length];
            $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type = iArr;
            try {
                iArr[AsyncWriteObject.Type.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.BYTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.BYTES_JUST_DISK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING_JUST_DISK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING_SET_JUST_DISK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING_ARRAY_JUST_DISK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr2 = new int[Stage.values().length];
            $SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage = iArr2;
            try {
                iArr2[Stage.FLUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage[Stage.SYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage[Stage.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage[Stage.LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private void commit() {
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (this.mMap.isEmpty()) {
                return;
            }
            refreshToDisk();
            try {
                this.mReentrantReadWriteLock.writeLock().lock();
                this.mMap.clear();
            } finally {
                this.mReentrantReadWriteLock.writeLock().unlock();
            }
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    private void deleteWalFlag() {
        sWalFlagKeva.erase(this.mName);
    }

    private boolean isAllReady() {
        if (this.mStage == Stage.SYNC) {
            return true;
        }
        return false;
    }

    public static void onFlush() {
        Iterator<OnFlushListener> it = sListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlush();
        }
    }

    private void refreshToDisk() {
        if (this.mNeedClear) {
            super.clear();
            this.mNeedClear = false;
        }
        for (String str : this.mMap.keySet()) {
            AsyncWriteObject asyncWriteObject = this.mMap.get(str);
            if (asyncWriteObject != null) {
                if (asyncWriteObject.action == AsyncWriteObject.Action.ERASE) {
                    super.erase(str);
                } else {
                    switch (AnonymousClass4.$SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[asyncWriteObject.type.ordinal()]) {
                        case 1:
                            super.storeDouble(str, ((Double) asyncWriteObject.value).doubleValue());
                            break;
                        case 2:
                            super.storeLong(str, ((Long) asyncWriteObject.value).longValue());
                            break;
                        case 3:
                            super.storeInt(str, ((Integer) asyncWriteObject.value).intValue());
                            break;
                        case 4:
                            super.storeFloat(str, ((Float) asyncWriteObject.value).floatValue());
                            break;
                        case 5:
                            super.storeBytes(str, (byte[]) asyncWriteObject.value);
                            break;
                        case 6:
                            super.storeString(str, (String) asyncWriteObject.value);
                            break;
                        case 7:
                            super.storeStringArray(str, (String[]) asyncWriteObject.value);
                            break;
                        case 8:
                            super.storeBoolean(str, ((Boolean) asyncWriteObject.value).booleanValue());
                            break;
                        case 9:
                            super.storeStringSet(str, (Set) asyncWriteObject.value);
                            break;
                        case 10:
                            super.storeBytesJustDisk(str, (byte[]) asyncWriteObject.value);
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            super.storeStringJustDisk(str, (String) asyncWriteObject.value);
                            break;
                        case 12:
                            super.storeStringSetJustDisk(str, (Set) asyncWriteObject.value);
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            super.storeStringArrayJustDisk(str, (String[]) asyncWriteObject.value);
                            break;
                    }
                }
            }
        }
    }

    private boolean shouldAsyncWrite() {
        if (this.mStage == Stage.LOADING && MAIN_THREAD_ID == C16880lQ.LLLLIIIILLL().getId()) {
            if (this.mWalCheckReady) {
                return true;
            }
            this.mWalCheckReady = true;
            Keva keva = sWalFlagKeva;
            if (keva.getBoolean(this.mName, false)) {
                sIgnoreMap.put(this.mName, Boolean.TRUE);
                KevaImpl.sMonitor.reportWarning(8, this.mName, "", "", "the last async write action is not work correct");
                return true;
            }
            keva.storeBoolean(this.mName, true);
            return true;
        }
        return false;
    }

    private boolean shouldReadFromMem() {
        if (this.mStage == Stage.LOADING) {
            return true;
        }
        return false;
    }

    public static void uploadFailedStatistics() {
        final Set<Map.Entry<String, ?>> entrySet = sWalFlagKeva.getAll().entrySet();
        if (entrySet.size() == 0) {
            return;
        }
        KevaImpl.sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaAsyncWriter.1
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_keva_KevaAsyncWriter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_keva_KevaAsyncWriter$1__run$___twin___() {
                StringBuilder sb = new StringBuilder();
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    String str = (String) ((Map.Entry) it.next()).getKey();
                    Map<String, Boolean> map = KevaAsyncWriter.sIgnoreMap;
                    Boolean bool = map.get(str);
                    if (bool == null || !bool.booleanValue()) {
                        sb.setLength(0);
                        sb.append("fileName = ");
                        sb.append(str);
                        KevaAsyncWriter.sWalFlagKeva.erase(str);
                        KevaImpl.sMonitor.reportWarning(6, str, "", "", sb.toString());
                        map.remove(str);
                    }
                }
            }

            public static void com_bytedance_keva_KevaAsyncWriter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_bytedance_keva_KevaAsyncWriter$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    static {
        KevaPrivateImpl kevaPrivateImpl = new KevaPrivateImpl("wal", null, 0);
        sWalFlagKeva = kevaPrivateImpl;
        sListeners = new CopyOnWriteArrayList<>();
        sIgnoreMap = new ConcurrentHashMap();
        kevaPrivateImpl.init(false);
        uploadFailedStatistics();
    }

    private void checkRepoAllReady() {
        if (isAllReady()) {
            return;
        }
        synchronized (this.mSyncLock) {
            while (!isAllReady()) {
                try {
                    this.mSyncLock.wait();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void setFinalState() {
        deleteWalFlag();
        this.mStage = Stage.SYNC;
        synchronized (this.mSyncLock) {
            this.mSyncLock.notifyAll();
        }
        unregisterOnFlushListener(this.onFlushListener);
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void clear() {
        if (isAllReady()) {
            super.clear();
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.clear();
                this.mNeedClear = true;
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.clear();
            }
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    public void commitWAL() {
        commit();
        setFinalState();
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public int count() {
        checkRepoAllReady();
        return super.count();
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void dump() {
        checkRepoAllReady();
        super.dump();
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        checkRepoAllReady();
        return super.getAll();
    }

    @Override // com.bytedance.keva.KevaFuture
    public void onRepoLoad() {
        super.onRepoLoad();
        this.mStage = Stage.LOAD;
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (this.mMap.isEmpty()) {
                setFinalState();
            } else {
                this.mReentrantReadWriteLock.readLock().unlock();
                KevaImpl.sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaAsyncWriter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bytedance_keva_KevaAsyncWriter$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bytedance_keva_KevaAsyncWriter$3__run$___twin___() {
                        KevaAsyncWriter.this.commitWAL();
                    }

                    public static void com_bytedance_keva_KevaAsyncWriter$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                        boolean LIZ;
                        try {
                            anonymousClass3.com_bytedance_keva_KevaAsyncWriter$3__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    /* loaded from: classes16.dex */
    public static class AsyncWriteObject {
        public final Action action;
        public final Type type;
        public final Object value;

        /* loaded from: classes16.dex */
        public enum Action {
            INSERT,
            ERASE,
            CLEAR;

            public static Action valueOf(String str) {
                return (Action) V0N.LJJJ(Action.class, str);
            }
        }

        /* loaded from: classes16.dex */
        public enum Type {
            INT,
            DOUBLE,
            LONG,
            FLOAT,
            BOOLEAN,
            STRING,
            BYTES,
            STRING_SET,
            STRING_ARRAY,
            BYTES_JUST_DISK,
            STRING_ARRAY_JUST_DISK,
            STRING_JUST_DISK,
            STRING_SET_JUST_DISK;

            public static Type valueOf(String str) {
                return (Type) V0N.LJJJ(Type.class, str);
            }
        }

        public AsyncWriteObject(Type type, Action action, Object obj) {
            this.type = type;
            this.action = action;
            this.value = obj;
        }
    }

    /* loaded from: classes16.dex */
    public enum Stage {
        LOADING,
        LOAD,
        FLUSH,
        SYNC;

        public static Stage valueOf(String str) {
            return (Stage) V0N.LJJJ(Stage.class, str);
        }
    }

    public static void registerOnFlushListener(OnFlushListener onFlushListener) {
        sListeners.add(onFlushListener);
    }

    public static void unregisterOnFlushListener(OnFlushListener onFlushListener) {
        sListeners.remove(onFlushListener);
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void erase(String str) {
        if (isAllReady()) {
            super.erase(str);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(null, AsyncWriteObject.Action.ERASE, null));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.erase(str);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getBoolean(str, z);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.BOOLEAN) {
                return ((Boolean) asyncWriteObject.value).booleanValue();
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getBoolean(str, z);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getBytes(str, bArr);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.BYTES) {
                return (byte[]) asyncWriteObject.value;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getBytes(str, bArr);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getBytesJustDisk(str, bArr);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.BYTES_JUST_DISK) {
                return (byte[]) asyncWriteObject.value;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getBytesJustDisk(str, bArr);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getDouble(str, d);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.DOUBLE) {
                return ((Double) asyncWriteObject.value).doubleValue();
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getDouble(str, d);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getFloat(str, f);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.FLOAT) {
                return ((Float) asyncWriteObject.value).floatValue();
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getFloat(str, f);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getInt(str, i);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.INT) {
                return ((Integer) asyncWriteObject.value).intValue();
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getInt(str, i);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            super.getLong(str, j);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.LONG) {
                return ((Long) asyncWriteObject.value).longValue();
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getLong(str, j);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getString(str, str2);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING) {
                return (String) asyncWriteObject.value;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getString(str, str2);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getStringArray(str, strArr);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING_ARRAY) {
                return (String[]) asyncWriteObject.value;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getStringArray(str, strArr);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getStringArrayJustDisk(str, strArr);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING_ARRAY_JUST_DISK) {
                return (String[]) asyncWriteObject.value;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getStringArrayJustDisk(str, strArr);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getStringJustDisk(str, str2);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING_JUST_DISK) {
                return (String) asyncWriteObject.value;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getStringJustDisk(str, str2);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getStringSet(str, set);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING_SET) {
                return (Set) asyncWriteObject.value;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getStringSet(str, set);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getStringSetJustDisk(str, set);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING_SET_JUST_DISK) {
                return (Set) asyncWriteObject.value;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getStringSetJustDisk(str, set);
        } finally {
            this.mReentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        if (isAllReady()) {
            super.storeBoolean(str, z);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.BOOLEAN, AsyncWriteObject.Action.INSERT, Boolean.valueOf(z)));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeBoolean(str, z);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        if (isAllReady()) {
            super.storeBytes(str, bArr);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.BYTES, AsyncWriteObject.Action.INSERT, bArr));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeBytes(str, bArr);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        if (isAllReady()) {
            super.storeBytesJustDisk(str, bArr);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.BYTES_JUST_DISK, AsyncWriteObject.Action.INSERT, bArr));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeBytesJustDisk(str, bArr);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        if (isAllReady()) {
            super.storeDouble(str, d);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.DOUBLE, AsyncWriteObject.Action.INSERT, Double.valueOf(d)));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeDouble(str, d);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        if (isAllReady()) {
            super.storeFloat(str, f);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.FLOAT, AsyncWriteObject.Action.INSERT, Float.valueOf(f)));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeFloat(str, f);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        if (isAllReady()) {
            super.storeInt(str, i);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.INT, AsyncWriteObject.Action.INSERT, Integer.valueOf(i)));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeInt(str, i);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        if (isAllReady()) {
            super.storeLong(str, j);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.LONG, AsyncWriteObject.Action.INSERT, Long.valueOf(j)));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeLong(str, j);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        if (isAllReady()) {
            super.storeString(str, str2);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING, AsyncWriteObject.Action.INSERT, str2));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeString(str, str2);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        if (isAllReady()) {
            super.storeStringArray(str, strArr);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING_ARRAY, AsyncWriteObject.Action.INSERT, strArr));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeStringArray(str, strArr);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        if (isAllReady()) {
            super.storeStringArrayJustDisk(str, strArr);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING_ARRAY_JUST_DISK, AsyncWriteObject.Action.INSERT, strArr));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeStringArrayJustDisk(str, strArr);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        if (isAllReady()) {
            super.storeStringJustDisk(str, str2);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING_JUST_DISK, AsyncWriteObject.Action.INSERT, str2));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeStringJustDisk(str, str2);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        if (isAllReady()) {
            super.storeStringSet(str, set);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING_SET, AsyncWriteObject.Action.INSERT, set));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeStringSet(str, set);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        if (isAllReady()) {
            super.storeStringSetJustDisk(str, set);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING_SET_JUST_DISK, AsyncWriteObject.Action.INSERT, set));
                return;
            }
            this.mReentrantReadWriteLock.writeLock().unlock();
            checkRepoAllReady();
            super.storeStringSetJustDisk(str, set);
        } finally {
            this.mReentrantReadWriteLock.writeLock().unlock();
        }
    }

    public KevaAsyncWriter(String str, String str2, int i, Callable<KevaImpl> callable, boolean z) {
        super(str, str2, i, callable, z);
        this.mSyncLock = new Object();
        this.mMap = new LinkedHashMap<>();
        this.mReentrantReadWriteLock = new ReentrantReadWriteLock();
        OnFlushListener onFlushListener = new OnFlushListener() { // from class: com.bytedance.keva.KevaAsyncWriter.2
            @Override // com.bytedance.keva.KevaAsyncWriter.OnFlushListener
            public void onFlush() {
                KevaAsyncWriter.this.onFlushImpl();
            }
        };
        this.onFlushListener = onFlushListener;
        registerOnFlushListener(onFlushListener);
        this.mStage = Stage.LOADING;
        super.initTask(callable);
    }
}
