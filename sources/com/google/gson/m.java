package com.google.gson;

import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class m extends j {
    public final com.google.gson.internal.m<String, j> LJLIL = new com.google.gson.internal.m<>();

    @Override // com.google.gson.j
    /* renamed from: LJJIIZI, reason: merged with bridge method [inline-methods] */
    public final m LIZJ() {
        m mVar = new m();
        for (Map.Entry<String, j> entry : this.LJLIL.entrySet()) {
            mVar.LJJII(entry.getKey(), entry.getValue().LIZJ());
        }
        return mVar;
    }

    public final Set<String> LJJIZ() {
        return this.LJLIL.keySet();
    }

    public final Set<Map.Entry<String, j>> entrySet() {
        return this.LJLIL.entrySet();
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final int size() {
        return this.LJLIL.size();
    }

    public final j LJJIJ(String str) {
        return this.LJLIL.get(str);
    }

    public final g LJJIJIIJI(String str) {
        return (g) this.LJLIL.get(str);
    }

    public final m LJJIJIL(String str) {
        return (m) this.LJLIL.get(str);
    }

    public final p LJJIJL(String str) {
        return (p) this.LJLIL.get(str);
    }

    public final boolean LJJIJLIJ(String str) {
        return this.LJLIL.containsKey(str);
    }

    public final void LJJJ(String str) {
        this.LJLIL.remove(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof m) && ((m) obj).LJLIL.equals(this.LJLIL))) {
            return true;
        }
        return false;
    }

    public final void LJJII(String str, j jVar) {
        if (jVar == null) {
            jVar = l.LJLIL;
        }
        this.LJLIL.put(str, jVar);
    }

    public final void LJJIII(Boolean bool, String str) {
        j pVar;
        if (bool == null) {
            pVar = l.LJLIL;
        } else {
            pVar = new p((Object) bool);
        }
        LJJII(str, pVar);
    }

    public final void LJJIIJ(String str, Number number) {
        j pVar;
        if (number == null) {
            pVar = l.LJLIL;
        } else {
            pVar = new p((Object) number);
        }
        LJJII(str, pVar);
    }

    public final void LJJIIZ(String str, String str2) {
        j pVar;
        if (str2 == null) {
            pVar = l.LJLIL;
        } else {
            pVar = new p((Object) str2);
        }
        LJJII(str, pVar);
    }
}
