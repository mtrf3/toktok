package com.google.gson.internal;

import X.InterfaceC65405Plh;
import X.InterfaceC65406Pli;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class Excluder implements com.google.gson.u, Cloneable {
    public static final Excluder LJLJL = new Excluder();
    public boolean LJLJJI;
    public final double LJLIL = -1.0d;
    public int LJLILLLLZI = 136;
    public final boolean LJLJI = true;
    public List<com.google.gson.a> LJLJJL = Collections.emptyList();
    public List<com.google.gson.a> LJLJJLL = Collections.emptyList();

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean LIZIZ(Class<?> cls) {
        if (this.LJLIL != -1.0d && !LIZLLL((InterfaceC65405Plh) cls.getAnnotation(InterfaceC65405Plh.class), (InterfaceC65406Pli) cls.getAnnotation(InterfaceC65406Pli.class))) {
            return true;
        }
        if (!this.LJLJI && cls.isMemberClass() && (cls.getModifiers() & 8) == 0) {
            return true;
        }
        if (!Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(Class<?> cls, boolean z) {
        List<com.google.gson.a> list;
        if (z) {
            list = this.LJLJJL;
        } else {
            list = this.LJLJJLL;
        }
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZLLL(InterfaceC65405Plh interfaceC65405Plh, InterfaceC65406Pli interfaceC65406Pli) {
        if (interfaceC65405Plh != null && interfaceC65405Plh.value() > this.LJLIL) {
            return false;
        }
        if (interfaceC65406Pli != null && interfaceC65406Pli.value() <= this.LJLIL) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0015, code lost:
    
        if (r2 == false) goto L8;
     */
    @Override // com.google.gson.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.google.gson.TypeAdapter<T> create(final com.google.gson.Gson r10, final com.google.gson.reflect.TypeToken<T> r11) {
        /*
            r9 = this;
            r8 = r11
            java.lang.Class r3 = r8.getRawType()
            r4 = r9
            boolean r2 = r4.LIZIZ(r3)
            r1 = 0
            r0 = 1
            if (r2 != 0) goto L14
            boolean r0 = r4.LIZJ(r3, r0)
            if (r0 == 0) goto L26
        L14:
            r6 = 1
            if (r2 != 0) goto L1d
        L17:
            boolean r0 = r4.LIZJ(r3, r1)
            if (r0 == 0) goto L24
        L1d:
            r5 = 1
        L1e:
            if (r6 != 0) goto L28
            if (r5 != 0) goto L28
            r0 = 0
            return r0
        L24:
            r5 = 0
            goto L1e
        L26:
            r6 = 0
            goto L17
        L28:
            com.google.gson.internal.Excluder$1 r3 = new com.google.gson.internal.Excluder$1
            r7 = r10
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }

    public final Excluder LJ(com.google.gson.a aVar, boolean z, boolean z2) {
        Excluder clone = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.LJLJJL);
            clone.LJLJJL = arrayList;
            arrayList.add(aVar);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.LJLJJLL);
            clone.LJLJJLL = arrayList2;
            arrayList2.add(aVar);
        }
        return clone;
    }
}
