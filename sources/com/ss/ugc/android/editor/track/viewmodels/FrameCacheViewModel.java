package com.ss.ugc.android.editor.track.viewmodels;

import X.C1300758p;
import X.C131235Db;
import X.C141335gf;
import X.C221108m2;
import X.C36636EZk;
import X.C3C5;
import X.C48841JEv;
import X.C5DX;
import X.C5DY;
import X.C5DZ;
import X.C5E0;
import X.C62822Ol8;
import X.C76800UCe;
import X.InterfaceC70422pa;
import X.MBA;
import X.ORZ;
import X.T2R;
import X.XA5;
import android.graphics.Bitmap;
import android.util.Size;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FrameCacheViewModel extends ViewModel implements InterfaceC70422pa {
    public final MBA LJLIL = C36636EZk.LIZ.plus(T2R.LJIIJJI());
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 627));

    public final C131235Db hv0() {
        return (C131235Db) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C48841JEv.LIZJ(this, null);
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL;
    }

    public static void jv0(FrameCacheViewModel frameCacheViewModel) {
        frameCacheViewModel.hv0().LJI(false);
    }

    public final Bitmap gv0(int i, String path) {
        o.LJIIIZ(path, "path");
        return hv0().LJFF(i, path);
    }

    public final void iv0(long j, String str) {
        Object LIZ;
        C131235Db hv0 = hv0();
        hv0.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int i2 = C1300758p.LIZ * i;
            if (i2 <= j) {
                arrayList.add(Integer.valueOf(i2));
            }
            i++;
        } while (i < 5);
        if (!arrayList.isEmpty()) {
            String fileId = hv0.LJLJJI.LIZ(str);
            Size cacheSize = hv0.LJLIL;
            o.LJIIIZ(fileId, "fileId");
            o.LJIIIZ(cacheSize, "cacheSize");
            synchronized (C5DZ.LJ) {
                C5DZ.LJFF = false;
            }
            try {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int intValue = ((Number) next).intValue();
                    hv0.LJLJJI.getClass();
                    if (XA5.LIZ(C5E0.LIZIZ(intValue, str, fileId)) == null && hv0.LJFF(intValue, str) == null) {
                        arrayList2.add(next);
                    }
                }
                synchronized (C5DZ.LIZJ) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C5DZ.LIZJ.put(new C5DY(str, ((Number) it2.next()).intValue(), fileId), null);
                    }
                }
                final List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
                C5DZ.LJ(C5DZ.LIZ, str, fileId, arrayList, cacheSize, new C5DX() { // from class: X.5DW
                    @Override // X.C5DX
                    public final void LIZ(C5DY key, Bitmap b) {
                        C5DX c5dx;
                        o.LJIIIZ(key, "key");
                        o.LJIIIZ(b, "b");
                        HashMap<C5DY, Bitmap> hashMap = C5DZ.LIZJ;
                        synchronized (hashMap) {
                            hashMap.put(key, b);
                            HashMap<C5DY, C5DX> hashMap2 = C5DZ.LIZLLL;
                            c5dx = hashMap2.get(key);
                            if (c5dx != null) {
                                hashMap.remove(key);
                                hashMap2.remove(key);
                            }
                        }
                        C5DX c5dx2 = c5dx;
                        if (c5dx2 != null) {
                            c5dx2.LIZ(key, b);
                        }
                        if (C5DZ.LJFF) {
                            return;
                        }
                        Object obj = C5DZ.LJ;
                        List<Integer> list = LLJILJILJ;
                        synchronized (obj) {
                            list.remove(Integer.valueOf(key.LIZIZ));
                            if (list.isEmpty()) {
                                C5DZ.LJFF = true;
                                obj.notifyAll();
                            }
                        }
                    }
                }, null, true, 32);
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                HashMap<C5DY, Bitmap> hashMap = C5DZ.LIZJ;
                synchronized (hashMap) {
                    hashMap.clear();
                }
                Object obj = C5DZ.LJ;
                synchronized (obj) {
                    C5DZ.LJFF = true;
                    obj.notifyAll();
                }
            }
        }
    }
}
