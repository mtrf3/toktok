package X;

import Y.IDComparatorS29S0000000_1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115954gp extends ArrayList<C109544Rq> {
    public static final IDComparatorS29S0000000_1 LJLIL = new IDComparatorS29S0000000_1(6);

    public C115954gp() {
    }

    public C115954gp(Collection<? extends C109544Rq> collection) {
        super(collection);
    }

    public static boolean LIZJ(C109544Rq c109544Rq) {
        if (c109544Rq != null && !c109544Rq.isDeleted() && c109544Rq.getSvrStatus() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(C109544Rq c109544Rq) {
        int indexOf = indexOf(c109544Rq);
        if (indexOf < 0) {
            add(0, c109544Rq);
            return true;
        }
        if (!LJFF(indexOf, c109544Rq)) {
            return true;
        }
        Collections.sort(this, LJLIL);
        return true;
    }

    public void addList(List<C109544Rq> list) {
        if (list != null && !list.isEmpty()) {
            boolean z = false;
            for (C109544Rq c109544Rq : list) {
                if (LIZJ(c109544Rq)) {
                    int indexOf = indexOf(c109544Rq);
                    if (indexOf < 0) {
                        add(0, c109544Rq);
                    } else if (LJFF(indexOf, c109544Rq)) {
                        z = true;
                    }
                }
            }
            if (z) {
                Collections.sort(this, LJLIL);
            }
        }
    }

    public void appendList(List<C109544Rq> list) {
        if (list != null && !list.isEmpty()) {
            boolean z = false;
            for (C109544Rq c109544Rq : list) {
                if (LIZJ(c109544Rq)) {
                    int indexOf = indexOf(c109544Rq);
                    if (indexOf < 0) {
                        super.add((C115954gp) c109544Rq);
                    } else if (LJFF(indexOf, c109544Rq)) {
                        z = true;
                    }
                }
            }
            if (z) {
                Collections.sort(this, LJLIL);
            }
        }
    }

    public synchronized void deleteMessage(C109544Rq c109544Rq) {
        if (c109544Rq == null) {
            return;
        }
        int i = -1;
        for (int i2 = 0; i2 < size(); i2++) {
            if (get(i2).equals(c109544Rq)) {
                i = i2;
            }
        }
        if (i != -1) {
            remove(i);
        }
    }

    public boolean update(C109544Rq c109544Rq) {
        int indexOf = indexOf(c109544Rq);
        if (indexOf < 0 || !LJFF(indexOf, c109544Rq)) {
            return true;
        }
        Collections.sort(this, LJLIL);
        return true;
    }

    public void updateList(List<C109544Rq> list) {
        int indexOf;
        if (list != null && !list.isEmpty()) {
            boolean z = false;
            for (C109544Rq c109544Rq : list) {
                if (LIZJ(c109544Rq) && (indexOf = indexOf(c109544Rq)) >= 0 && LJFF(indexOf, c109544Rq)) {
                    z = true;
                }
            }
            if (z) {
                Collections.sort(this, LJLIL);
            }
        }
    }

    public final boolean LJFF(int i, C109544Rq c109544Rq) {
        C109544Rq c109544Rq2 = get(i);
        set(i, c109544Rq);
        if (c109544Rq2.getOrderIndex() != c109544Rq.getOrderIndex()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("message orderIndex updated old=");
            LIZ.append(c109544Rq2.getOrderIndex());
            LIZ.append(" new=");
            LIZ.append(c109544Rq.getOrderIndex());
            LIZ.append(" msgId=");
            LIZ.append(c109544Rq.getMsgId());
            LIZ.append(" msgType=");
            LIZ.append(c109544Rq.getMsgType());
            C63322OtC.LIZIZ("MessageSortedList", X1D.LIZIZ(LIZ));
            return true;
        }
        return false;
    }
}
