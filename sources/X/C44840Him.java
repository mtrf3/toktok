package X;

import android.content.SharedPreferences;

/* renamed from: X.Him, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44840Him {
    public final SharedPreferences LIZ;
    public final C1HQ<String, Object> LIZIZ = new C1HQ<>();

    public C44840Him(SharedPreferences sharedPreferences) {
        this.LIZ = sharedPreferences;
    }

    public final synchronized boolean LIZ(InterfaceC44844Hiq interfaceC44844Hiq) {
        return this.LIZ.contains(interfaceC44844Hiq.key());
    }

    public final synchronized float LIZIZ(InterfaceC44844Hiq interfaceC44844Hiq) {
        boolean z;
        Float f;
        if (interfaceC44844Hiq.type() == EnumC44843Hip.Float) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJ(z);
        f = (Float) this.LIZIZ.getOrDefault(interfaceC44844Hiq.key(), null);
        if (f == null) {
            interfaceC44844Hiq.LIZIZ();
            f = Float.valueOf(this.LIZ.getFloat(interfaceC44844Hiq.key(), ((Float) interfaceC44844Hiq.LIZ()).floatValue()));
            this.LIZIZ.put(interfaceC44844Hiq.key(), f);
        }
        return f.floatValue();
    }

    public final synchronized int LIZJ(InterfaceC44844Hiq interfaceC44844Hiq) {
        boolean z;
        Integer num;
        if (interfaceC44844Hiq.type() == EnumC44843Hip.Integer) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJ(z);
        num = (Integer) this.LIZIZ.getOrDefault(interfaceC44844Hiq.key(), null);
        if (num == null) {
            interfaceC44844Hiq.LIZIZ();
            num = Integer.valueOf(this.LIZ.getInt(interfaceC44844Hiq.key(), ((Integer) interfaceC44844Hiq.LIZ()).intValue()));
            this.LIZIZ.put(interfaceC44844Hiq.key(), num);
        }
        return num.intValue();
    }

    public final synchronized long LIZLLL(InterfaceC44844Hiq interfaceC44844Hiq) {
        boolean z;
        Long l;
        if (interfaceC44844Hiq.type() == EnumC44843Hip.Long) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJ(z);
        l = (Long) this.LIZIZ.getOrDefault(interfaceC44844Hiq.key(), null);
        if (l == null) {
            interfaceC44844Hiq.LIZIZ();
            l = Long.valueOf(this.LIZ.getLong(interfaceC44844Hiq.key(), ((Long) interfaceC44844Hiq.LIZ()).longValue()));
            this.LIZIZ.put(interfaceC44844Hiq.key(), l);
        }
        return l.longValue();
    }

    public final synchronized String LJ(InterfaceC44844Hiq interfaceC44844Hiq) {
        boolean z;
        String str;
        if (interfaceC44844Hiq.type() == EnumC44843Hip.String) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJ(z);
        str = (String) this.LIZIZ.getOrDefault(interfaceC44844Hiq.key(), null);
        if (str == null) {
            interfaceC44844Hiq.LIZIZ();
            str = this.LIZ.getString(interfaceC44844Hiq.key(), (String) interfaceC44844Hiq.LIZ());
            this.LIZIZ.put(interfaceC44844Hiq.key(), str);
        }
        return str;
    }

    public final synchronized void LJFF(InterfaceC44844Hiq interfaceC44844Hiq, boolean z) {
        boolean z2;
        Boolean bool;
        if (interfaceC44844Hiq.type() == EnumC44843Hip.Boolean) {
            z2 = true;
        } else {
            z2 = false;
        }
        C76917UGr.LJ(z2);
        C1HQ<String, Object> c1hq = this.LIZIZ;
        String key = interfaceC44844Hiq.key();
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        c1hq.put(key, bool);
        interfaceC44844Hiq.LIZIZ();
        this.LIZ.edit().putBoolean(interfaceC44844Hiq.key(), z).apply();
    }

    public final synchronized void LJI(InterfaceC44844Hiq interfaceC44844Hiq, float f) {
        boolean z;
        if (interfaceC44844Hiq.type() == EnumC44843Hip.Float) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJ(z);
        this.LIZIZ.put(interfaceC44844Hiq.key(), Float.valueOf(f));
        interfaceC44844Hiq.LIZIZ();
        this.LIZ.edit().putFloat(interfaceC44844Hiq.key(), f).apply();
    }

    public final synchronized void LJII(InterfaceC44844Hiq interfaceC44844Hiq, int i) {
        boolean z;
        if (interfaceC44844Hiq.type() == EnumC44843Hip.Integer) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJ(z);
        this.LIZIZ.put(interfaceC44844Hiq.key(), Integer.valueOf(i));
        interfaceC44844Hiq.LIZIZ();
        this.LIZ.edit().putInt(interfaceC44844Hiq.key(), i).apply();
    }

    public final synchronized void LJIIIIZZ(InterfaceC44844Hiq interfaceC44844Hiq, long j) {
        boolean z;
        if (interfaceC44844Hiq.type() == EnumC44843Hip.Long) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJ(z);
        this.LIZIZ.put(interfaceC44844Hiq.key(), Long.valueOf(j));
        interfaceC44844Hiq.LIZIZ();
        this.LIZ.edit().putLong(interfaceC44844Hiq.key(), j).apply();
    }

    public final synchronized void LJIIIZ(InterfaceC44844Hiq interfaceC44844Hiq, String str) {
        boolean z;
        if (interfaceC44844Hiq.type() == EnumC44843Hip.String) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJ(z);
        this.LIZIZ.put(interfaceC44844Hiq.key(), str);
        interfaceC44844Hiq.LIZIZ();
        this.LIZ.edit().putString(interfaceC44844Hiq.key(), str).apply();
    }
}
