package X;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.ZXg, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90088ZXg {
    public final Bundle LIZ;
    public ArrayList<String> LIZIZ;
    public ArrayList<IntentFilter> LIZJ;

    public final C90089ZXh LIZIZ() {
        ArrayList<IntentFilter> arrayList = this.LIZJ;
        if (arrayList != null) {
            this.LIZ.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList<String> arrayList2 = this.LIZIZ;
        if (arrayList2 != null) {
            this.LIZ.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new C90089ZXh(this.LIZ);
    }

    public C90088ZXg(C90089ZXh c90089ZXh) {
        if (c90089ZXh != null) {
            this.LIZ = new Bundle(c90089ZXh.LIZ);
            if (!c90089ZXh.LIZIZ().isEmpty()) {
                this.LIZIZ = new ArrayList<>(c90089ZXh.LIZIZ());
            }
            c90089ZXh.LIZ();
            if (!c90089ZXh.LIZJ.isEmpty()) {
                this.LIZJ = new ArrayList<>(c90089ZXh.LIZJ);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("descriptor must not be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Collection collection) {
        if (collection != null) {
            if (!collection.isEmpty()) {
                for (Object obj : collection) {
                    if (obj != null) {
                        if (this.LIZJ == null) {
                            this.LIZJ = new ArrayList<>();
                        }
                        if (!this.LIZJ.contains(obj)) {
                            this.LIZJ.add(obj);
                        }
                    } else {
                        throw new IllegalArgumentException("filter must not be null");
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("filters must not be null");
    }

    public C90088ZXg(String str, String str2) {
        Bundle bundle = new Bundle();
        this.LIZ = bundle;
        bundle.putString("id", str);
        bundle.putString("name", str2);
    }
}
