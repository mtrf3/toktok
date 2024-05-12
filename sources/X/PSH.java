package X;

import Y.ARunnableS47S0100000_11;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes12.dex */
public final class PSH implements SharedPreferences {
    public static final Object LJIIJJI = new Object();
    public final File LIZ;
    public final String LIZIZ;
    public final File LIZJ;
    public final Object LIZLLL;
    public final Object LJ;
    public java.util.Map<String, Object> LJFF;
    public int LJI;
    public boolean LJII;
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;

    public final void LIZ() {
        if (!this.LJII) {
            PSN.LIZIZ.get().LIZ();
        }
        while (!this.LJII) {
            try {
                this.LIZLLL.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        synchronized (this.LIZLLL) {
            LIZ();
        }
        return new PSG(this);
    }

    @Override // android.content.SharedPreferences
    public final java.util.Map<String, ?> getAll() {
        HashMap hashMap;
        synchronized (this.LIZLLL) {
            LIZ();
            hashMap = new HashMap(this.LJFF);
        }
        return hashMap;
    }

    public static FileOutputStream LIZIZ(File file) {
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
    public final boolean contains(String str) {
        boolean containsKey;
        synchronized (this.LIZLLL) {
            LIZ();
            containsKey = this.LJFF.containsKey(str);
        }
        return containsKey;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.LIZLLL) {
            this.LJIIIIZZ.put(onSharedPreferenceChangeListener, LJIIJJI);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.LIZLLL) {
            this.LJIIIIZZ.remove(onSharedPreferenceChangeListener);
        }
    }

    public PSH(String str, File file) {
        Object obj = new Object();
        this.LIZLLL = obj;
        this.LJ = new Object();
        this.LJI = 0;
        this.LJII = false;
        this.LJIIIIZZ = new WeakHashMap<>();
        this.LIZ = file;
        this.LIZIZ = str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(file.getPath());
        LIZ.append(".bak");
        this.LIZJ = new File(X1D.LIZIZ(LIZ));
        this.LJII = false;
        this.LJFF = null;
        synchronized (obj) {
            this.LJII = false;
        }
        new PSF(this).start();
    }

    public final void LIZLLL(PSL psl, boolean z) {
        boolean z2;
        boolean exists = this.LIZ.exists();
        System.currentTimeMillis();
        if (exists) {
            try {
                if (this.LJIIJ < psl.LIZ) {
                    if (!z) {
                        synchronized (this.LIZLLL) {
                            if (this.LJIIIZ == psl.LIZ) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        if (!z2) {
                        }
                    }
                    if (!this.LIZJ.exists()) {
                        if (!this.LIZ.renameTo(this.LIZJ)) {
                            psl.LJFF = false;
                            psl.LJ.countDown();
                            return;
                        }
                    } else {
                        C16880lQ.LLLZZIL(this.LIZ);
                    }
                }
                psl.LJFF = true;
                psl.LJ.countDown();
                return;
            } finally {
                System.currentTimeMillis();
            }
        }
        try {
            FileOutputStream LIZIZ = LIZIZ(this.LIZ);
            if (LIZIZ == null) {
                psl.LJFF = false;
                psl.LJ.countDown();
                return;
            }
            C79256V8q.LIZJ(psl.LIZLLL, LIZIZ);
            if (!PSJ.LIZIZ()) {
                try {
                    LIZIZ.getFD().sync();
                } catch (Exception unused) {
                }
            }
            LIZIZ.close();
            C16880lQ.LLLZZIL(this.LIZJ);
            this.LJIIJ = psl.LIZ;
            psl.LJFF = true;
            psl.LJ.countDown();
        } catch (IOException unused2) {
            C16880lQ.LLLZZIL(this.LIZ);
            psl.LJFF = false;
            psl.LJ.countDown();
        } catch (XmlPullParserException unused3) {
            C16880lQ.LLLZZIL(this.LIZ);
            psl.LJFF = false;
            psl.LJ.countDown();
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        synchronized (this.LIZLLL) {
            LIZ();
            try {
                Boolean bool = (Boolean) this.LJFF.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } catch (ClassCastException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        synchronized (this.LIZLLL) {
            LIZ();
            try {
                Float f2 = (Float) this.LJFF.get(str);
                if (f2 != null) {
                    f = f2.floatValue();
                }
            } catch (ClassCastException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        synchronized (this.LIZLLL) {
            LIZ();
            try {
                Integer num = (Integer) this.LJFF.get(str);
                if (num != null) {
                    i = num.intValue();
                }
            } catch (ClassCastException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        synchronized (this.LIZLLL) {
            LIZ();
            try {
                Long l = (Long) this.LJFF.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            } catch (ClassCastException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        String str3;
        synchronized (this.LIZLLL) {
            LIZ();
            try {
                str3 = (String) this.LJFF.get(str);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                str3 = null;
            }
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set<String> getStringSet(String str, java.util.Set<String> set) {
        java.util.Set<String> set2;
        synchronized (this.LIZLLL) {
            LIZ();
            try {
                set2 = (java.util.Set) this.LJFF.get(str);
            } catch (ClassCastException e) {
                C16880lQ.LLLLIIL(e);
                set2 = null;
            }
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    public final void LIZJ(PSL psl, ARunnableS47S0100000_11 aRunnableS47S0100000_11, List list) {
        boolean z;
        boolean z2 = false;
        if (aRunnableS47S0100000_11 == null) {
            z = true;
        } else {
            z = false;
        }
        PSI psi = new PSI(this, psl, z, aRunnableS47S0100000_11, list);
        if (z) {
            synchronized (this.LIZLLL) {
                if (this.LJI == 1) {
                    z2 = true;
                }
            }
            if (z2) {
                psi.run();
                return;
            }
        }
        PSJ.LIZJ(psi, !z);
    }
}
