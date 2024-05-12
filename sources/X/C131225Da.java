package X;

import android.util.Size;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$executeLoadFromVideo$1", f = "VideoFrameCache.kt", l = {258}, m = "invokeSuspend")
/* renamed from: X.5Da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131225Da extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public C76732zl LJLILLLLZI;
    public C56K LJLJI;
    public int LJLJJI;
    public final /* synthetic */ C131235Db LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131225Da(C131235Db c131235Db, InterfaceC67352kd<? super C131225Da> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c131235Db;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131225Da(this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int size;
        C76732zl c76732zl;
        C56K c56k;
        List<C1290754t> list;
        boolean z;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                size = this.LJLIL;
                c56k = this.LJLJI;
                c76732zl = this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            size = this.LJLJJL.LJLJLJ.size();
            c76732zl = new C76732zl();
            c56k = new C56K();
        }
        while (true) {
            C131235Db c131235Db = this.LJLJJL;
            synchronized (c131235Db.LJLJLJ) {
                List<C1290754t> poll = c131235Db.LJLJLJ.poll();
                if (poll == null) {
                    int i2 = c131235Db.LJLJLLL - 1;
                    c131235Db.LJLJLLL = i2;
                    InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = c131235Db.LJLILLLLZI;
                    if (interfaceC88472Yns != null) {
                        if (i2 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        interfaceC88472Yns.invoke(Boolean.valueOf(z));
                    }
                }
                list = poll;
            }
            if (list == null) {
                return C76800UCe.LIZ;
            }
            C131235Db c131235Db2 = this.LJLJJL;
            ArrayList arrayList = new ArrayList();
            for (C1290754t c1290754t : list) {
                C1290754t c1290754t2 = c1290754t;
                C5E0 c5e0 = c131235Db2.LJLJJI;
                String str = c1290754t2.LJLIL;
                int i3 = c1290754t2.LJLILLLLZI;
                String LIZ = c5e0.LIZ(str);
                c5e0.getClass();
                if (XA5.LIZ(C5E0.LIZIZ(i3, str, LIZ)) == null) {
                    if (c131235Db2.LJFF(c1290754t2.LJLILLLLZI, c1290754t2.LJLIL) == null) {
                        arrayList.add(c1290754t);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                String str2 = ((C1290754t) ORZ.LJLLJ(list)).LJLIL;
                c76732zl.element++;
                C5DZ c5dz = C5DZ.LIZ;
                String LIZ2 = this.LJLJJL.LJLJJI.LIZ(str2);
                C131235Db c131235Db3 = this.LJLJJL;
                Size size2 = c131235Db3.LJLIL;
                C131325Dk c131325Dk = new C131325Dk(c56k, c76732zl, size);
                this.LJLILLLLZI = c76732zl;
                this.LJLJI = c56k;
                this.LJLIL = size;
                this.LJLJJI = 1;
                if (c5dz.LIZLLL(str2, LIZ2, arrayList, size2, c131235Db3, c131325Dk, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
