package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.ODo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61548ODo implements InterfaceC61556ODw, Serializable {
    public final InterfaceC61582OEw LJLIL;
    public int LJLILLLLZI;
    public final List<OE0> LJLJI;
    public AbstractC61551ODr LJLJJI;
    public java.util.Map<String, Object> LJLJJL;

    @Override // X.InterfaceC61556ODw
    public final Object LIZ() {
        this.LJLILLLLZI = 0;
        this.LJLJJI = null;
        return LJ(null);
    }

    @Override // X.InterfaceC61556ODw
    public final Object LIZIZ(Class cls) {
        for (AbstractC61551ODr abstractC61551ODr = this.LJLJJI; abstractC61551ODr != null; abstractC61551ODr = abstractC61551ODr.LIZ) {
            if (abstractC61551ODr.getClass() == cls) {
                return abstractC61551ODr.LIZIZ;
            }
        }
        throw new IllegalArgumentException(C09K.LIZIZ("can not find pre Interceptor , class:", cls));
    }

    @Override // X.InterfaceC61556ODw
    public final Object LIZJ(String str) {
        return this.LJLJJL.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC61556ODw
    public final Object LJ(Object obj) {
        AbstractC61551ODr abstractC61551ODr = this.LJLJJI;
        if (abstractC61551ODr != null) {
            abstractC61551ODr.LIZJ = obj;
            OE9 oe9 = abstractC61551ODr.LIZLLL;
            if (oe9 != null) {
                oe9.LIZIZ(abstractC61551ODr.LJ, abstractC61551ODr);
            }
        }
        if (this.LJLILLLLZI >= this.LJLJI.size()) {
            return obj;
        }
        OE0 oe0 = (OE0) ListProtector.get(this.LJLJI, this.LJLILLLLZI);
        Class<? extends AbstractC61551ODr> cls = oe0.LIZ;
        this.LJLIL.getClass();
        try {
            AbstractC61551ODr newInstance = cls.newInstance();
            if (newInstance != null) {
                OE9 oe92 = oe0.LIZIZ;
                C61548ODo c61548ODo = new C61548ODo(this.LJLJI, this.LJLILLLLZI + 1, this.LJLIL, newInstance);
                c61548ODo.LJLJJL = this.LJLJJL;
                AbstractC61551ODr abstractC61551ODr2 = this.LJLJJI;
                Object[] objArr = oe0.LIZJ;
                newInstance.LJ = new C61546ODm(c61548ODo);
                newInstance.LIZ = abstractC61551ODr2;
                newInstance.LIZIZ = obj;
                newInstance.LIZLLL = oe92;
                if (abstractC61551ODr2 != null || AbstractC61551ODr.LJFF.getAndIncrement() >= 0) {
                    newInstance.LIZ(objArr);
                    OE9 oe93 = newInstance.LIZLLL;
                    if (oe93 != null) {
                        oe93.LJFF(newInstance.LJ, newInstance);
                    }
                    try {
                        Object LIZIZ = newInstance.LIZIZ(c61548ODo, obj);
                        OE9 oe94 = newInstance.LIZLLL;
                        if (oe94 != null) {
                            oe94.LIZLLL(newInstance.LJ, newInstance);
                        }
                        return LIZIZ;
                    } catch (OEX e) {
                        Throwable cause = e.getCause();
                        OE9 oe95 = newInstance.LIZLLL;
                        if (oe95 != null) {
                            oe95.LIZ(newInstance.LJ, newInstance, cause);
                        }
                        throw e;
                    } catch (Throwable th) {
                        OE9 oe96 = newInstance.LIZLLL;
                        if (oe96 != null) {
                            oe96.LIZJ(newInstance.LJ, newInstance, th);
                        }
                        throw new OEX(th);
                    }
                }
                throw new RuntimeException("Pipeline ID use up!");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("interceptor == null , index = ");
            LIZ.append(obj);
            LIZ.append(" , class: ");
            LIZ.append(cls);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // X.InterfaceC61556ODw
    public final Object LJFF(Class cls) {
        for (AbstractC61551ODr abstractC61551ODr = this.LJLJJI; abstractC61551ODr != null; abstractC61551ODr = abstractC61551ODr.LIZ) {
            if (abstractC61551ODr.getClass() == cls) {
                return abstractC61551ODr.LIZJ;
            }
        }
        throw new IllegalArgumentException(C09K.LIZIZ("can not find pre Interceptor , class:", cls));
    }

    @Override // X.InterfaceC61556ODw
    public final void LIZLLL(Object obj, String str) {
        this.LJLJJL.put(str, obj);
    }

    public C61548ODo(List<OE0> list, int i, InterfaceC61582OEw interfaceC61582OEw, AbstractC61551ODr abstractC61551ODr) {
        HashMap hashMap = new HashMap();
        this.LJLJJL = hashMap;
        this.LJLJI = list;
        this.LJLILLLLZI = i;
        this.LJLIL = interfaceC61582OEw;
        this.LJLJJI = abstractC61551ODr;
        hashMap.put("req_type", 1);
        this.LJLJJL.put("sync_task_id", 0);
    }
}
