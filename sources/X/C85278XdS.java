package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: X.XdS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85278XdS {
    public Serializable LIZ;
    public Serializable LIZIZ;
    public final Object LIZJ;

    public /* synthetic */ C85278XdS() {
        this.LIZ = new PriorityBlockingQueue();
        this.LIZIZ = new PriorityBlockingQueue();
        this.LIZJ = new C58102Pu[4];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C85278XdS(int i) {
        this();
        if (i != 1) {
        } else {
            this.LIZJ = new ArrayList();
        }
    }
}
