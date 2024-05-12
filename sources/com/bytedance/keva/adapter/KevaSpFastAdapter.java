package com.bytedance.keva.adapter;

import X.C16880lQ;
import X.C1HQ;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.keva.adapter.xml.XmlUtils;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import defpackage.a1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class KevaSpFastAdapter implements SharedPreferences {
    public static final Executor sApplyExecutor = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("KevaSpFastAdapter"));
    public static final Executor sWriterExecutor = C16880lQ.LLLLZLLIL();
    public File mBackupFile;
    public final Map<SharedPreferences.OnSharedPreferenceChangeListener, Keva.OnChangeListener> mChangeListenerMap = new C1HQ();
    public File mFile;
    public Keva mKeva;

    /* loaded from: classes7.dex */
    public class Editor implements SharedPreferences.Editor {
        public boolean mClear;
        public volatile Map<String, Object> mTempMap = new C1HQ();

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.mClear = true;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            doWriteKeva(this.mTempMap, this.mClear);
            if (KevaSpFastAdapter.this.mFile != null) {
                KevaSpFastAdapter.sWriterExecutor.execute(new Runnable() { // from class: com.bytedance.keva.adapter.KevaSpFastAdapter.Editor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bytedance_keva_adapter_KevaSpFastAdapter$Editor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bytedance_keva_adapter_KevaSpFastAdapter$Editor$1__run$___twin___() {
                        KevaSpFastAdapter kevaSpFastAdapter = KevaSpFastAdapter.this;
                        kevaSpFastAdapter.doWriteSp(kevaSpFastAdapter.getAll());
                    }

                    public static void com_bytedance_keva_adapter_KevaSpFastAdapter$Editor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_bytedance_keva_adapter_KevaSpFastAdapter$Editor$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
            this.mTempMap = new C1HQ();
            if (this.mClear) {
                this.mClear = false;
                return true;
            }
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            commit();
        }

        public Editor() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                map.put(str, this);
            }
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            if (z) {
                KevaSpFastAdapter.this.mKeva.clear();
            }
            synchronized (map) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        KevaSpFastAdapter.this.mKeva.erase(key);
                    }
                    if (value instanceof Integer) {
                        KevaSpFastAdapter.this.mKeva.storeInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        KevaSpFastAdapter.this.mKeva.storeBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        KevaSpFastAdapter.this.mKeva.storeString(key, (String) value);
                    } else if (value instanceof Long) {
                        KevaSpFastAdapter.this.mKeva.storeLong(key, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        KevaSpFastAdapter.this.mKeva.storeFloat(key, ((Float) value).floatValue());
                    } else if (value instanceof Set) {
                        KevaSpFastAdapter.this.mKeva.storeStringSet(key, (Set) value);
                    } else {
                        KevaSpFastAdapter.this.mKeva.erase(key);
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                map.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                map.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                map.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                map.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                map.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                map.put(str, set);
            }
            return this;
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new Editor();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.mKeva.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof String[]) {
                    HashSet hashSet = new HashSet(16, 0.75f);
                    for (String str : (String[]) value) {
                        hashSet.add(str);
                    }
                    value = hashSet;
                }
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public KevaSpFastAdapter(Keva keva) {
        this.mKeva = keva;
    }

    public static FileOutputStream createFileOutputStream(File file) {
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                return null;
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused2) {
                return null;
            }
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.mKeva.contains(str);
    }

    public void doWriteSp(Map<String, ?> map) {
        boolean exists = this.mBackupFile.exists();
        if (this.mFile.exists()) {
            if (!exists) {
                this.mFile.renameTo(this.mBackupFile);
            } else {
                C16880lQ.LLLZZIL(this.mFile);
            }
        }
        FileOutputStream createFileOutputStream = createFileOutputStream(this.mFile);
        try {
            if (createFileOutputStream == null) {
                return;
            }
            try {
                XmlUtils.writeMapXml(map, createFileOutputStream);
                createFileOutputStream.getFD().sync();
                C16880lQ.LLLZZIL(this.mBackupFile);
            } catch (IOException unused) {
                C16880lQ.LLLZZIL(this.mFile);
            } catch (XmlPullParserException unused2) {
                C16880lQ.LLLZZIL(this.mFile);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("fail to write ");
                LIZ.append(this.mFile.getName());
                LIZ.append(", dump: ");
                LIZ.append(map.keySet());
                throw new RuntimeException(X1D.LIZIZ(LIZ), e);
            }
        } finally {
            try {
                createFileOutputStream.close();
            } catch (IOException unused3) {
            }
        }
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Keva.OnChangeListener onChangeListener = new Keva.OnChangeListener() { // from class: com.bytedance.keva.adapter.KevaSpFastAdapter.1
            @Override // com.bytedance.keva.Keva.OnChangeListener
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpFastAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(onChangeListener);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, onChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mKeva.unRegisterChangeListener(this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return this.mKeva.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return this.mKeva.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return this.mKeva.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return this.mKeva.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            return string;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            return stringSet;
        }
        return set;
    }

    public static KevaSpFastAdapter getSharedPreferences(Context context, String str, int i, boolean z) {
        int i2;
        if (i == 4) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        KevaSpFastAdapter kevaSpFastAdapter = new KevaSpFastAdapter(KevaImpl.getRepoFromSp(context, str, i2));
        if (z) {
            File LLIIJLIL = C16880lQ.LLIIJLIL(context);
            if (!LLIIJLIL.exists()) {
                LLIIJLIL.mkdirs();
            }
            kevaSpFastAdapter.mFile = new File(LLIIJLIL.getParent(), a1.LJ("shared_prefs/", str, ".xml"));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(kevaSpFastAdapter.mFile.getPath());
            LIZ.append(".bak");
            kevaSpFastAdapter.mBackupFile = new File(X1D.LIZIZ(LIZ));
        }
        return kevaSpFastAdapter;
    }
}
