package X;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.22L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22L extends AbstractC43321my {
    public boolean LJFF;
    public int LJI;
    public final AtomicBoolean LJII;

    public C22L() {
        this(0);
    }

    @Override // X.AbstractC20690rZ
    public final void LIZ() {
        this.LJII.set(false);
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = "";
        this.LIZIZ = -1L;
        this.LJFF = false;
        this.LJI = -1;
        ((HashMap) super.LIZLLL()).clear();
    }

    @Override // X.AbstractC20690rZ
    public final boolean LIZJ() {
        return this.LJII.get();
    }

    @Override // X.AbstractC34871Yl
    public final java.util.Map<String, Object> LIZLLL() {
        java.util.Map<String, Object> LIZLLL = super.LIZLLL();
        HashMap hashMap = (HashMap) LIZLLL;
        hashMap.put("repo_name", this.LIZJ);
        hashMap.put("repo_type", this.LIZLLL);
        hashMap.put("repo_path", this.LJ);
        hashMap.put("is_first", Boolean.valueOf(this.LJFF));
        hashMap.put("open_count", Integer.valueOf(this.LJI));
        return LIZLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22L(int i) {
        super(-1L, "infra_unistore_kv_create_repo_dev", "", "", "");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.LJFF = false;
        this.LJI = -1;
        this.LJII = atomicBoolean;
    }
}
