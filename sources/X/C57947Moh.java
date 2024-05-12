package X;

import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Moh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57947Moh {
    public final C57859MnH LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final XLM LJ;
    public final XLM LJFF;

    public final void LIZ() {
        XLM xlm = this.LJ;
        C57948Moi c57948Moi = (C57948Moi) xlm.getValue();
        int i = ((C57948Moi) this.LJ.getValue()).LJLILLLLZI + 1;
        List<InterfaceC57861MnJ> processorList = c57948Moi.LJLIL;
        o.LJIIIZ(processorList, "processorList");
        xlm.setValue(new C57948Moi(processorList, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57947Moh(C57859MnH config) {
        o.LJIIIZ(config, "config");
        this.LIZ = config;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1048));
        this.LIZIZ = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1051));
        this.LIZJ = LIZIZ2;
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1049));
        C62822Ol8 LIZIZ4 = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1052));
        C62822Ol8 LIZIZ5 = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1050));
        this.LIZLLL = LIZIZ5;
        XLM LIZ = V8H.LIZ(new C57948Moi(C47261Igj.LJJIJIIJI(LIZIZ.getValue(), LIZIZ2.getValue(), LIZIZ5.getValue(), LIZIZ4.getValue(), LIZIZ3.getValue()), 0));
        this.LJ = LIZ;
        this.LJFF = LIZ;
    }
}
