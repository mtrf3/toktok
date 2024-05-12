package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class g extends j implements Iterable<j> {
    public final List<j> LJLIL;

    @Override // com.google.gson.j
    public final j LIZJ() {
        if (!((ArrayList) this.LJLIL).isEmpty()) {
            g gVar = new g(((ArrayList) this.LJLIL).size());
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                gVar.LJJII(((j) it.next()).LIZJ());
            }
            return gVar;
        }
        return new g();
    }

    @Override // com.google.gson.j
    public final boolean LJFF() {
        if (((ArrayList) this.LJLIL).size() == 1) {
            return ((j) ((ArrayList) this.LJLIL).get(0)).LJFF();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public final byte LJII() {
        if (((ArrayList) this.LJLIL).size() == 1) {
            return ((j) ((ArrayList) this.LJLIL).get(0)).LJII();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public final char LJIIIIZZ() {
        if (((ArrayList) this.LJLIL).size() == 1) {
            return ((j) ((ArrayList) this.LJLIL).get(0)).LJIIIIZZ();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public final double LJIIIZ() {
        if (((ArrayList) this.LJLIL).size() == 1) {
            return ((j) ((ArrayList) this.LJLIL).get(0)).LJIIIZ();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public final float LJIIJ() {
        if (((ArrayList) this.LJLIL).size() == 1) {
            return ((j) ((ArrayList) this.LJLIL).get(0)).LJIIJ();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public final int LJIILJJIL() {
        if (((ArrayList) this.LJLIL).size() == 1) {
            return ((j) ((ArrayList) this.LJLIL).get(0)).LJIILJJIL();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public final long LJIJJLI() {
        if (((ArrayList) this.LJLIL).size() == 1) {
            return ((j) ((ArrayList) this.LJLIL).get(0)).LJIJJLI();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public final Number LJIL() {
        if (((ArrayList) this.LJLIL).size() == 1) {
            return ((j) ((ArrayList) this.LJLIL).get(0)).LJIL();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public final short LJJI() {
        if (((ArrayList) this.LJLIL).size() == 1) {
            return ((j) ((ArrayList) this.LJLIL).get(0)).LJJI();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public final String LJJIFFI() {
        if (((ArrayList) this.LJLIL).size() == 1) {
            return ((j) ((ArrayList) this.LJLIL).get(0)).LJJIFFI();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<j> iterator() {
        return this.LJLIL.iterator();
    }

    public final int size() {
        return this.LJLIL.size();
    }

    public g() {
        this.LJLIL = new ArrayList();
    }

    public g(int i) {
        this.LJLIL = new ArrayList(i);
    }

    public final void LJJII(j jVar) {
        if (jVar == null) {
            jVar = l.LJLIL;
        }
        ((ArrayList) this.LJLIL).add(jVar);
    }

    public final void LJJIII(Number number) {
        j pVar;
        List<j> list = this.LJLIL;
        if (number == null) {
            pVar = l.LJLIL;
        } else {
            pVar = new p(number);
        }
        ((ArrayList) list).add(pVar);
    }

    public final void LJJIIJ(String str) {
        j pVar;
        List<j> list = this.LJLIL;
        if (str == null) {
            pVar = l.LJLIL;
        } else {
            pVar = new p(str);
        }
        ((ArrayList) list).add(pVar);
    }

    public final j LJJIIZ(int i) {
        return this.LJLIL.get(i);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof g) && ((g) obj).LJLIL.equals(this.LJLIL))) {
            return true;
        }
        return false;
    }
}
