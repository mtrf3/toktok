package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aeD, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94265aeD extends AbstractC03120Ai {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ List LIZIZ;

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return true;
    }

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C94265aeD(List list, List list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        AbstractC94370afu abstractC94370afu;
        Object obj = ListProtector.get(this.LIZ, i);
        AbstractC94370afu abstractC94370afu2 = null;
        if (!(obj instanceof C93815aWx)) {
            obj = null;
        }
        C93815aWx c93815aWx = (C93815aWx) obj;
        Object obj2 = ListProtector.get(this.LIZIZ, i2);
        if (!(obj2 instanceof C93815aWx)) {
            obj2 = null;
        }
        C93815aWx c93815aWx2 = (C93815aWx) obj2;
        if (c93815aWx != null) {
            abstractC94370afu = c93815aWx.LIZ;
        } else {
            abstractC94370afu = null;
        }
        if (c93815aWx2 != null) {
            abstractC94370afu2 = c93815aWx2.LIZ;
        }
        return o.LJ(abstractC94370afu, abstractC94370afu2);
    }
}
