package X;

import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.WyG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84020WyG implements InterfaceC45910I0c {
    public final ArrayList<C84021WyH> LIZ;
    public final ArrayList<C84021WyH> LIZIZ;
    public final InterfaceC83192Wku LIZJ;

    @Override // X.InterfaceC45910I0c
    public final void commit() {
        List<ComposerInfo> list;
        InterfaceC83192Wku interfaceC83192Wku = this.LIZJ;
        if (interfaceC83192Wku instanceof C84023WyJ) {
            C84023WyJ c84023WyJ = (C84023WyJ) interfaceC83192Wku;
            c84023WyJ.getClass();
            if (this.LIZ.size() > 0) {
                Iterator<C84021WyH> it = this.LIZ.iterator();
                while (it.hasNext()) {
                    C84021WyH next = it.next();
                    int i = next.LIZ;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    c84023WyJ.LIZ.remove(Integer.valueOf(next.LIZIZ));
                                }
                            } else {
                                c84023WyJ.LIZIZ(next.LIZJ);
                            }
                        } else {
                            List<ComposerInfo> list2 = c84023WyJ.LIZ.get(Integer.valueOf(next.LIZIZ));
                            int i2 = 12;
                            String str = null;
                            if (list2 == null) {
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                copyOnWriteArrayList.add(new ComposerInfo(next.LIZJ, next.LJFF, str, i2));
                                c84023WyJ.LIZ.put(Integer.valueOf(next.LIZIZ), copyOnWriteArrayList);
                            } else {
                                list2.add(new ComposerInfo(next.LIZJ, next.LJFF, str, i2));
                            }
                        }
                    } else {
                        c84023WyJ.LIZ.clear();
                        c84023WyJ.LIZIZ.LIZIZ.setComposerNodes(new String[0], 0);
                    }
                }
                c84023WyJ.LIZ();
            }
            Iterator<C84021WyH> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                C84021WyH next2 = it2.next();
                int i3 = next2.LIZIZ;
                if (i3 != -1 && (list = c84023WyJ.LIZ.get(Integer.valueOf(i3))) != null) {
                    for (ComposerInfo composerInfo : list) {
                        String str2 = composerInfo.nodePath;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(next2.LIZJ);
                        LIZ.append(";");
                        LIZ.append(next2.LIZLLL);
                        if (s.LJJJLZIJ(str2, X1D.LIZIZ(LIZ), false)) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(next2.LIZJ);
                            LIZ2.append(";");
                            LIZ2.append(next2.LIZLLL);
                            LIZ2.append(";");
                            LIZ2.append(next2.LJ);
                            String LIZIZ = X1D.LIZIZ(LIZ2);
                            o.LJIIIZ(LIZIZ, "<set-?>");
                            composerInfo.nodePath = LIZIZ;
                        }
                        String str3 = composerInfo.nodePath;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(next2.LIZJ);
                        LIZ3.append(":");
                        LIZ3.append(next2.LIZLLL);
                        if (s.LJJJLZIJ(str3, X1D.LIZIZ(LIZ3), false)) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append(next2.LIZJ);
                            LIZ4.append(":");
                            LIZ4.append(next2.LIZLLL);
                            LIZ4.append(":");
                            LIZ4.append(next2.LJ);
                            String LIZIZ2 = X1D.LIZIZ(LIZ4);
                            o.LJIIIZ(LIZIZ2, "<set-?>");
                            composerInfo.nodePath = LIZIZ2;
                        }
                    }
                }
                c84023WyJ.LIZIZ.LJIILL(next2.LIZJ, next2.LIZLLL, next2.LJ);
            }
            this.LIZ.clear();
            this.LIZIZ.clear();
            return;
        }
        throw new Exception("should not go this case ");
    }

    public C84020WyG(InterfaceC83192Wku composerService) {
        o.LJIIIZ(composerService, "composerService");
        this.LIZJ = composerService;
        this.LIZ = new ArrayList<>();
        this.LIZIZ = new ArrayList<>();
    }

    @Override // X.InterfaceC45910I0c
    public final C84020WyG LIZIZ(String path, String featureTag, float f) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(featureTag, "featureTag");
        this.LIZIZ.add(new C84021WyH(path, featureTag, f));
        return this;
    }

    @Override // X.InterfaceC45910I0c
    public final C84020WyG LIZ(float f, String path, int i, String featureTag) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(featureTag, "featureTag");
        this.LIZIZ.add(new C84021WyH(i, path, featureTag, f));
        return this;
    }
}
