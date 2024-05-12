package X;

import Y.IDHandlerS21S0100000_8;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ij2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47404Ij2 {
    public static final C5H3<C47404Ij2> LJIIIIZZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C47407Ij5.LJLIL);
    public IDHandlerS21S0100000_8 LIZ;
    public boolean LIZIZ;
    public AudioManager LIZJ;
    public C47054IdO LIZLLL;
    public final WeakHashMap<Object, C47405Ij3> LJ = new WeakHashMap<>();
    public final WeakHashMap<Object, C47405Ij3> LJFF = new WeakHashMap<>();
    public final LinkedList<C47405Ij3> LJI = new LinkedList<>();
    public final WeakHashMap<Object, Object> LJII = new WeakHashMap<>();

    /* JADX WARN: Type inference failed for: r0v7, types: [X.IdO] */
    public final void LIZJ() {
        if (this.LIZJ == null) {
            try {
                Object LLILL = C16880lQ.LLILL(C16880lQ.LLLLL(IXN.LIZJ.context()), "audio");
                if (LLILL != null) {
                    this.LIZJ = (AudioManager) LLILL;
                    this.LIZLLL = new AudioManager.OnAudioFocusChangeListener() { // from class: X.IdO
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i) {
                            C47404Ij2 this$0 = C47404Ij2.this;
                            o.LJIIIZ(this$0, "this$0");
                            Message obtain = Message.obtain();
                            obtain.what = 3;
                            boolean z = true;
                            if (i != 1 && i != 2 && i != 3 && i != 4) {
                                z = false;
                            }
                            obtain.obj = Boolean.valueOf(z);
                            IDHandlerS21S0100000_8 iDHandlerS21S0100000_8 = this$0.LIZ;
                            o.LJI(iDHandlerS21S0100000_8);
                            iDHandlerS21S0100000_8.sendMessage(obtain);
                        }
                    };
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
            } catch (Throwable unused) {
            }
        }
    }

    public final void LJII() {
        LJIIIIZZ(this.LJ);
        LJIIIIZZ(this.LJFF);
        LinkedList<C47405Ij3> linkedList = this.LJI;
        int i = 0;
        while (i < linkedList.size()) {
            if (linkedList.get(i).LIZIZ.get() == null) {
                linkedList.remove(i);
            } else {
                i++;
            }
        }
    }

    public static C47403Ij1 LIZ(C47405Ij3 c47405Ij3) {
        Object obj;
        InterfaceC47408Ij6 interfaceC47408Ij6;
        Handler handler = null;
        if (c47405Ij3 == null || (obj = c47405Ij3.LIZIZ.get()) == null) {
            return null;
        }
        int i = c47405Ij3.LIZ;
        WeakReference<InterfaceC47408Ij6> weakReference = c47405Ij3.LIZJ;
        if (weakReference == null) {
            interfaceC47408Ij6 = null;
        } else {
            interfaceC47408Ij6 = weakReference.get();
        }
        WeakReference<Handler> weakReference2 = c47405Ij3.LIZLLL;
        if (weakReference2 != null) {
            handler = weakReference2.get();
        }
        return new C47403Ij1(i, obj, interfaceC47408Ij6, handler);
    }

    public static void LJIIIIZZ(WeakHashMap weakHashMap) {
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() == null) {
                it.remove();
            }
        }
    }

    public final void LIZIZ(boolean z) {
        C47405Ij3 last;
        C47403Ij1 LIZ;
        this.LIZIZ = z;
        if (z) {
            this.LJII.clear();
        }
        if (this.LIZIZ) {
            if (!this.LJ.isEmpty()) {
                for (Map.Entry<Object, C47405Ij3> entry : this.LJ.entrySet()) {
                    if (!this.LJFF.containsKey(entry.getKey())) {
                        LinkedList<C47405Ij3> linkedList = this.LJI;
                        Object key = entry.getKey();
                        o.LJIIIIZZ(key, "entry.key");
                        if (LIZLLL(linkedList, key)) {
                            LinkedList<C47405Ij3> linkedList2 = this.LJI;
                            Object key2 = entry.getKey();
                            o.LJIIIIZZ(key2, "entry.key");
                            LJ(linkedList2, key2);
                        }
                    }
                    C47403Ij1 LIZ2 = LIZ(entry.getValue());
                    if (LIZ2 != null) {
                        this.LJFF.remove(entry.getKey());
                        Object key3 = entry.getKey();
                        o.LJIIIIZZ(key3, "entry.key");
                        LJFF(key3);
                        this.LJFF.put(entry.getKey(), entry.getValue());
                        Object key4 = entry.getKey();
                        o.LJIIIIZZ(key4, "entry.key");
                        LJI(true, LIZ2, key4);
                    }
                }
                this.LJ.clear();
            } else if ((!this.LJI.isEmpty()) && (LIZ = LIZ((last = this.LJI.getLast()))) != null) {
                LJ(this.LJI, LIZ.LIZIZ);
                this.LJFF.put(LIZ.LIZIZ, last);
                LJI(true, LIZ, LIZ.LIZIZ);
            }
        } else {
            Object obj = new Object();
            for (Map.Entry<Object, C47405Ij3> entry2 : this.LJ.entrySet()) {
                if (!this.LJFF.containsKey(entry2.getKey())) {
                    LinkedList<C47405Ij3> linkedList3 = this.LJI;
                    Object key5 = entry2.getKey();
                    o.LJIIIIZZ(key5, "entry.key");
                    if (LIZLLL(linkedList3, key5)) {
                        C47403Ij1 LIZ3 = LIZ(entry2.getValue());
                        if (LIZ3 != null) {
                            LJI(false, LIZ3, obj);
                        }
                    } else {
                        C47403Ij1 LIZ4 = LIZ(entry2.getValue());
                        if (LIZ4 != null) {
                            this.LJI.add(entry2.getValue());
                            LJI(false, LIZ4, obj);
                        }
                    }
                }
            }
            this.LJ.clear();
            LJFF(obj);
        }
        Iterator<C47405Ij3> it = this.LJI.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void LJFF(Object obj) {
        for (Map.Entry<Object, C47405Ij3> entry : this.LJFF.entrySet()) {
            C47403Ij1 LIZ = LIZ(entry.getValue());
            if (LIZ != null) {
                this.LJI.add(entry.getValue());
                LJI(false, LIZ, obj);
            }
        }
        this.LJFF.clear();
    }

    public static boolean LIZLLL(LinkedList linkedList, Object obj) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (o.LJ(((C47405Ij3) it.next()).LIZIZ.get(), obj)) {
                return true;
            }
        }
        return false;
    }

    public static void LJ(LinkedList linkedList, Object obj) {
        int i = 0;
        while (i < linkedList.size()) {
            Object obj2 = ((C47405Ij3) linkedList.get(i)).LIZIZ.get();
            if (obj2 == null || o.LJ(obj2, obj)) {
                linkedList.remove(i);
            } else {
                i++;
            }
        }
    }

    public final void LJI(final boolean z, final C47403Ij1 c47403Ij1, Object obj) {
        final boolean z2 = true;
        if (!(obj instanceof C47002IcY) && !(!this.LJII.isEmpty())) {
            z2 = false;
        }
        Handler handler = c47403Ij1.LIZLLL;
        if (handler == null) {
            InterfaceC47408Ij6 interfaceC47408Ij6 = c47403Ij1.LIZJ;
            if (interfaceC47408Ij6 == null) {
                return;
            }
            interfaceC47408Ij6.LIZ(z, z2);
            return;
        }
        handler.post(new Runnable() { // from class: X.Ij4
            @Override // java.lang.Runnable
            public final void run() {
                C47403Ij1 audioFocusMsg = C47403Ij1.this;
                boolean z3 = z;
                boolean z4 = z2;
                o.LJIIIZ(audioFocusMsg, "$audioFocusMsg");
                InterfaceC47408Ij6 interfaceC47408Ij62 = audioFocusMsg.LIZJ;
                if (interfaceC47408Ij62 == null) {
                    return;
                }
                interfaceC47408Ij62.LIZ(z3, z4);
            }
        });
    }
}
