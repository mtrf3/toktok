package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hc1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44421Hc1 {
    public final List LIZ;
    public Object LIZIZ;
    public final NOC LIZJ;
    public Object LIZLLL;
    public Object LJ;

    public final C44412Hbs LIZ() {
        if (this.LJ == null) {
            this.LJ = new C44412Hbs(this);
        }
        return (C44412Hbs) this.LJ;
    }

    public /* synthetic */ C44421Hc1() {
        this.LIZ = new ArrayList();
    }

    public /* synthetic */ C44421Hc1(SparseArray taskParams, List taskTypeList, NOC factory, InterfaceC59247NNb taskContext) {
        o.LJIIIZ(taskParams, "taskParams");
        o.LJIIIZ(taskTypeList, "taskTypeList");
        o.LJIIIZ(factory, "factory");
        o.LJIIIZ(taskContext, "taskContext");
        this.LIZIZ = taskParams;
        this.LIZ = taskTypeList;
        this.LIZJ = factory;
        this.LIZLLL = taskContext;
        this.LJ = new JSONObject();
    }
}
