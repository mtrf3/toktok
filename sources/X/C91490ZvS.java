package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvS, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91490ZvS implements InterfaceC91458Zuw {
    public final InterfaceC91291ZsF LJLIL;
    public final CopyOnWriteArrayList<InterfaceC91296ZsK> LJLILLLLZI;
    public final CopyOnWriteArrayList<InterfaceC91296ZsK> LJLJI;
    public InterfaceC91297ZsL LJLJJI;
    public EnumC91307ZsV LJLJJL;
    public volatile int LJLJJLL;

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91297ZsL LJIIZILJ() {
        throw null;
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
    }

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91296ZsK LIZ() {
        return (InterfaceC91296ZsK) ORZ.LJLLLLLL(this.LJLJJLL, this.LJLJI);
    }

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91296ZsK LIZJ() {
        return this.LJLJJL.getNext(this.LJLJI, this.LJLJJLL);
    }

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91296ZsK LJIIIIZZ() {
        return this.LJLJJL.getPre(this.LJLJI, this.LJLJJLL);
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIILLIIL() {
        InterfaceC91297ZsL interfaceC91297ZsL = this.LJLJJI;
        if (interfaceC91297ZsL != null) {
            this.LJLIL.Y50(interfaceC91297ZsL);
        }
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        this.LJLILLLLZI.clear();
        this.LJLJI.clear();
        InterfaceC91297ZsL interfaceC91297ZsL = this.LJLJJI;
        if (interfaceC91297ZsL != null) {
            interfaceC91297ZsL.onDetach();
        }
    }

    @Override // X.InterfaceC91458Zuw
    public final boolean LJFF() {
        if (LIZJ() != null) {
            return true;
        }
        return false;
    }

    public C91490ZvS(InterfaceC91461Zuz mListener) {
        o.LJIIIZ(mListener, "mListener");
        this.LJLIL = mListener;
        this.LJLILLLLZI = new CopyOnWriteArrayList<>();
        this.LJLJI = new CopyOnWriteArrayList<>();
        this.LJLJJL = EnumC91307ZsV.SEQUENCE;
        this.LJLJJLL = -1;
    }

    @Override // X.InterfaceC91458Zuw
    public final void LIZIZ(AbstractC91380Ztg playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        InterfaceC91297ZsL interfaceC91297ZsL = this.LJLJJI;
        if (interfaceC91297ZsL != null) {
            interfaceC91297ZsL.onDetach();
        }
        playableQueue.onAttach();
        this.LJLJJI = playableQueue;
        this.LJLILLLLZI.clear();
        CopyOnWriteArrayList<InterfaceC91296ZsK> copyOnWriteArrayList = this.LJLILLLLZI;
        CopyOnWriteArrayList<InterfaceC91296ZsK> copyOnWriteArrayList2 = playableQueue.LJLIL;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC91296ZsK> it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            InterfaceC91296ZsK next = it.next();
            if (hashSet.add(next.getId())) {
                arrayList.add(next);
            }
        }
        copyOnWriteArrayList.addAll(arrayList);
        this.LJLJJLL = -1;
        this.LJLJI.clear();
        this.LJLJI.addAll(this.LJLJJL.getRealPlayableList(this.LJLILLLLZI));
        this.LJLIL.Hz(playableQueue);
    }

    @Override // X.InterfaceC91458Zuw
    public final List<InterfaceC91296ZsK> LJ(InterfaceC91296ZsK interfaceC91296ZsK) {
        ArrayList arrayList = new ArrayList();
        InterfaceC91296ZsK LIZ = LIZ();
        if (LIZ != null) {
            arrayList.add(LIZ);
        }
        arrayList.addAll(LJIIIZ(interfaceC91296ZsK));
        return arrayList;
    }

    @Override // X.InterfaceC91458Zuw
    public final List<InterfaceC91296ZsK> LJIIIZ(InterfaceC91296ZsK interfaceC91296ZsK) {
        int i;
        if (interfaceC91296ZsK == null) {
            i = this.LJLJJLL;
        } else {
            Iterator<InterfaceC91296ZsK> it = this.LJLJI.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!o.LJ(it.next().getId(), interfaceC91296ZsK.getId())) {
                    i++;
                }
            }
            return C61878OQg.INSTANCE;
        }
        if (i >= 0) {
            return this.LJLJJL.getFuturePlayableList(this.LJLJI, i);
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIIJ(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
        this.LJLJJL = playMode;
        this.LJLJI.clear();
        this.LJLJI.addAll(this.LJLJJL.getRealPlayableList(this.LJLILLLLZI));
        this.LJLIL.Kj(playMode);
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIILIIL(List playableList) {
        String str;
        o.LJIIIZ(playableList, "playableList");
        InterfaceC91296ZsK LIZ = LIZ();
        CopyOnWriteArrayList<InterfaceC91296ZsK> copyOnWriteArrayList = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(copyOnWriteArrayList, 10));
        Iterator<InterfaceC91296ZsK> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getId());
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : playableList) {
            if (hashSet.add(((InterfaceC91296ZsK) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!arrayList.contains(((InterfaceC91296ZsK) next).getId())) {
                arrayList3.add(next);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        this.LJLILLLLZI.addAll(arrayList3);
        this.LJLJI.addAll(this.LJLJJL.getRealPlayableList(arrayList3));
        Iterator<InterfaceC91296ZsK> it3 = this.LJLJI.iterator();
        int i = 0;
        while (true) {
            if (it3.hasNext()) {
                String id = it3.next().getId();
                if (LIZ != null) {
                    str = LIZ.getId();
                } else {
                    str = null;
                }
                if (o.LJ(id, str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        this.LJLJJLL = i;
        InterfaceC91297ZsL interfaceC91297ZsL = this.LJLJJI;
        if (interfaceC91297ZsL != null) {
            this.LJLIL.Hz(interfaceC91297ZsL);
        }
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIIJJI(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK) {
        Iterator<InterfaceC91296ZsK> it = this.LJLJI.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(it.next().getId(), interfaceC91296ZsK.getId())) {
                if (i < 0) {
                    return;
                }
                this.LJLJJLL = i;
                this.LJLIL.a50(c91299ZsN, interfaceC91296ZsK);
                return;
            }
            i++;
        }
    }
}
