package X;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.22M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22M extends AbstractC43321my {
    public String LJFF;
    public String LJI;
    public int LJII;
    public String LJIIIIZZ;
    public final AtomicBoolean LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;

    public C22M() {
        this(0);
    }

    @Override // X.AbstractC20690rZ
    public final void LIZ() {
        this.LJIIIZ.set(false);
        this.LIZJ = "";
        this.LJ = "";
        this.LIZLLL = "";
        this.LJFF = null;
        this.LJI = null;
        this.LJII = -1;
        this.LJIIIIZZ = "";
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        ((HashMap) super.LIZLLL()).clear();
    }

    @Override // X.AbstractC20690rZ
    public final boolean LIZJ() {
        return this.LJIIIZ.get();
    }

    @Override // X.AbstractC34871Yl
    public final java.util.Map<String, Object> LIZLLL() {
        java.util.Map<String, Object> LIZLLL = super.LIZLLL();
        HashMap hashMap = (HashMap) LIZLLL;
        hashMap.put("repo_name", this.LIZJ);
        hashMap.put("repo_type", this.LIZLLL);
        hashMap.put("repo_path", this.LJ);
        String str = this.LJFF;
        if (str != null) {
            hashMap.put("key", str);
        }
        String str2 = this.LJI;
        if (str2 != null) {
            hashMap.put("key_type", str2);
        }
        hashMap.put("value_size", Integer.valueOf(this.LJII));
        hashMap.put("target_event", this.LJIIIIZZ);
        long j = this.LJIIJ;
        if (j > 0) {
            hashMap.put("cost_serialize", Long.valueOf(j));
        }
        long j2 = this.LJIIJJI;
        if (j2 > 0) {
            hashMap.put("cost_migration", Long.valueOf(j2));
        }
        long j3 = this.LJIIL;
        if (j3 > 0) {
            hashMap.put("cost_cipher", Long.valueOf(j3));
        }
        return LIZLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22M(int i) {
        super(-1L, "infra_unistore_kv_access_dev", "", "", "");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.LJFF = null;
        this.LJI = null;
        this.LJII = -1;
        this.LJIIIIZZ = "";
        this.LJIIIZ = atomicBoolean;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
    }
}
