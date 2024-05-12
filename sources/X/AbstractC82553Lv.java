package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82553Lv implements InterfaceC82613Mb<IMContact> {
    public final C3R9 LJLIL;
    public InterfaceC82613Mb<IMContact> LJLJI;
    public final AbstractC113374cf<? extends Comparable<?>, IMContact> LJLJL;
    public final C83753Ql LJLJLJ;
    public final C83753Ql LJLJLLL;
    public volatile List<String> LJLL;
    public final String LJLILLLLZI = "BaseRelationModel";
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C81383Hi.LJLIL);
    public final String LJLJJL = C80853Fh.LIZ();
    public final String LJLJJLL = C80853Fh.LIZJ();

    public boolean LIZJ() {
        return this instanceof C3R0;
    }

    public abstract C3RZ LJ();

    public C3LJ LIZ() {
        C3R9 parameters = this.LJLIL;
        o.LJIIIZ(parameters, "parameters");
        return new C3LJ(parameters);
    }

    public final List<IMContact> LIZIZ() {
        return (List) this.LJLJJI.getValue();
    }

    public void LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refresh start, ts: ");
        LIZ.append(SystemClock.elapsedRealtime());
        C34B.LJI("LOAD_CONTACT_PROCESS", X1D.LIZIZ(LIZ));
        if (!LJ().LJI) {
            LJ().LJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01d3  */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.3HH] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.3Mo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC82553Lv(X.C3R9 r10) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC82553Lv.<init>(X.3R9):void");
    }

    public static final List<String> LJII(List<? extends IMContact> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "<this>");
        Iterator<? extends IMContact> it = list.iterator();
        while (it.hasNext()) {
            IMUser LIZ = C81573Ib.LIZ(it.next());
            if (LIZ != null) {
                String uid = LIZ.getUid();
                o.LJIIIIZZ(uid, "it.uid");
                LJ.add(uid);
            }
        }
        return LJ;
    }

    @Override // X.InterfaceC82613Mb
    public final void L8(Throwable th) {
        InterfaceC82613Mb<IMContact> interfaceC82613Mb = this.LJLJI;
        if (interfaceC82613Mb != null) {
            interfaceC82613Mb.L8(th);
        }
    }

    public final void LJFF(InterfaceC82613Mb subscriber) {
        o.LJIIIZ(subscriber, "subscriber");
        C34B.LJI(this.LJLILLLLZI, "subscribe");
        this.LJLJI = subscriber;
    }

    @Override // X.InterfaceC82613Mb
    public void Y8(Throwable th) {
        InterfaceC82613Mb<IMContact> interfaceC82613Mb = this.LJLJI;
        if (interfaceC82613Mb != null) {
            interfaceC82613Mb.Y8(th);
        }
    }

    @Override // X.InterfaceC82613Mb
    public final void L20(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
        LIZIZ().addAll(list);
        InterfaceC82613Mb<IMContact> interfaceC82613Mb = this.LJLJI;
        if (interfaceC82613Mb != null) {
            interfaceC82613Mb.L20(list, z);
        }
    }

    @Override // X.InterfaceC82613Mb
    public void zr0(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
        String str = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadSuccess start: ");
        LIZ.append(list.size());
        C34B.LJI(str, X1D.LIZIZ(LIZ));
        try {
            LIZIZ().clear();
            LIZIZ().addAll(list);
        } catch (Exception e) {
            C34B.LJ(this.LJLILLLLZI, e);
        }
        C34B.LJI(this.LJLILLLLZI, "onLoadSuccess finish: " + LIZIZ().size());
        InterfaceC82613Mb<IMContact> interfaceC82613Mb = this.LJLJI;
        if (interfaceC82613Mb != null) {
            interfaceC82613Mb.zr0(list, z);
        }
    }

    public static void LJI(AbstractC82553Lv abstractC82553Lv, final InterfaceC88471Ynr interfaceC88471Ynr, final InterfaceC88472Yns interfaceC88472Yns) {
        final C3BT onLoadMoreSuccess = C3BT.LJLIL;
        final C3N4 onLoadMoreError = C3N4.LJLIL;
        o.LJIIIZ(onLoadMoreSuccess, "onLoadMoreSuccess");
        o.LJIIIZ(onLoadMoreError, "onLoadMoreError");
        abstractC82553Lv.LJFF(new InterfaceC82613Mb<IMContact>() { // from class: X.3MJ
            @Override // X.InterfaceC82613Mb
            public final void L8(Throwable th) {
                onLoadMoreError.invoke(th);
            }

            @Override // X.InterfaceC82613Mb
            public final void Y8(Throwable th) {
                interfaceC88472Yns.invoke(th);
            }

            @Override // X.InterfaceC82613Mb
            public final void L20(List<IMContact> list, boolean z) {
                o.LJIIIZ(list, "list");
                onLoadMoreSuccess.invoke(list, Boolean.valueOf(z));
            }

            @Override // X.InterfaceC82613Mb
            public final void zr0(List<IMContact> list, boolean z) {
                o.LJIIIZ(list, "list");
                interfaceC88471Ynr.invoke(list, Boolean.valueOf(z));
            }
        });
    }
}
