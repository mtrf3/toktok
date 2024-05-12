package X;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OR0 extends AbstractC61891OQt<File> {
    public final ArrayDeque<OR6> LJLJI;
    public final /* synthetic */ OR4 LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object, java.io.File] */
    @Override // X.AbstractC61891OQt
    public final void LIZ() {
        ?? LIZ;
        while (true) {
            OR6 peek = this.LJLJI.peek();
            if (peek == null) {
                this.LJLIL = EnumC61894OQw.Done;
                return;
            }
            LIZ = peek.LIZ();
            if (LIZ == 0) {
                this.LJLJI.pop();
            } else if (o.LJ(LIZ, peek.LIZ) || !LIZ.isDirectory() || this.LJLJI.size() >= this.LJLJJI.LJFF) {
                break;
            } else {
                this.LJLJI.push(LIZIZ(LIZ));
            }
        }
        this.LJLILLLLZI = LIZ;
        this.LJLIL = EnumC61894OQw.Ready;
    }

    public OR0(OR4 or4) {
        this.LJLJJI = or4;
        ArrayDeque<OR6> arrayDeque = new ArrayDeque<>();
        this.LJLJI = arrayDeque;
        if (or4.LIZ.isDirectory()) {
            arrayDeque.push(LIZIZ(or4.LIZ));
        } else if (or4.LIZ.isFile()) {
            arrayDeque.push(new OR1(or4.LIZ));
        } else {
            this.LJLIL = EnumC61894OQw.Done;
        }
    }

    public final OR5 LIZIZ(File file) {
        int i = C67192kN.LIZ[this.LJLJJI.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new OR2(this, file);
            }
            throw new C162476Zf();
        }
        return new OR3(this, file);
    }
}
