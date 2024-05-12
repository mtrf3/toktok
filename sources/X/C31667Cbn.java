package X;

import Y.AfS7S1400000_5;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Cbn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31667Cbn extends AbstractC32664Crs<C81392Vwy<InterfaceC81378Vwk>> {
    public final /* synthetic */ ImageModel LIZ;
    public final /* synthetic */ Boolean LIZIZ;
    public final /* synthetic */ Integer LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ InterfaceC31664Cbk LJ;
    public final /* synthetic */ File LJFF;
    public final /* synthetic */ String LJI;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<InterfaceC81378Vwk>> dataSource) {
        String str;
        o.LJIIIZ(dataSource, "dataSource");
        String str2 = (String) ListProtector.get(this.LIZ.getUrls(), 0);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = this.LIZIZ;
        Integer num = this.LIZJ;
        String str3 = this.LIZLLL;
        Throwable LJFF = dataSource.LJFF();
        if (LJFF == null || (str = LJFF.getMessage()) == null) {
            str = "unknown";
        }
        C28274B7u.LIZ(str2, str3, bool, num, bool2, str);
        InterfaceC31664Cbk interfaceC31664Cbk = this.LJ;
        if (interfaceC31664Cbk != null) {
            new RuntimeException();
            interfaceC31664Cbk.onFail();
        }
        dataSource.close();
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<C81392Vwy<InterfaceC81378Vwk>> dataSource) {
        o.LJIIIZ(dataSource, "dataSource");
        if (dataSource.LIZIZ() && dataSource.getResult() != null) {
            C81392Vwy<InterfaceC81378Vwk> result = dataSource.getResult();
            InterfaceC81378Vwk interfaceC81378Vwk = null;
            if (result != null && result.LJI() != null) {
                C81392Vwy<InterfaceC81378Vwk> result2 = dataSource.getResult();
                if (result2 != null) {
                    interfaceC81378Vwk = result2.LJI();
                }
                AbstractC73672Svk<R> LJII = AbstractC73672Svk.LJJIJIL(interfaceC81378Vwk).LJJL(T16.LIZ()).LJJIJL(C31669Cbp.LJLIL).LJII(new C62705OjF());
                File file = this.LJFF;
                String str = this.LJI;
                ImageModel imageModel = this.LIZ;
                Boolean bool = this.LIZIZ;
                Integer num = this.LIZJ;
                String str2 = this.LIZLLL;
                InterfaceC31664Cbk interfaceC31664Cbk = this.LJ;
                LJII.LJJJLIIL(new C31668Cbo(imageModel, interfaceC31664Cbk, file, bool, num, str, str2), new AfS7S1400000_5(imageModel, bool, num, str2, interfaceC31664Cbk, 0));
                dataSource.close();
                return;
            }
        }
        String str3 = (String) ListProtector.get(this.LIZ.getUrls(), 0);
        Boolean bool2 = Boolean.FALSE;
        Boolean bool3 = this.LIZIZ;
        C28274B7u.LIZ(str3, this.LIZLLL, bool2, this.LIZJ, bool3, "data source error");
        InterfaceC31664Cbk interfaceC31664Cbk2 = this.LJ;
        if (interfaceC31664Cbk2 != null) {
            new IllegalArgumentException();
            interfaceC31664Cbk2.onFail();
        }
    }

    public C31667Cbn(ImageModel imageModel, InterfaceC31664Cbk interfaceC31664Cbk, File file, Boolean bool, Integer num, String str, String str2) {
        this.LIZ = imageModel;
        this.LIZIZ = bool;
        this.LIZJ = num;
        this.LIZLLL = str;
        this.LJ = interfaceC31664Cbk;
        this.LJFF = file;
        this.LJI = str2;
    }
}
