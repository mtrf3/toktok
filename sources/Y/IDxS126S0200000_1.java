package Y;

import X.C34D;
import X.C3C0;
import X.C3CK;
import X.C44192HWa;
import X.C79963Bw;
import X.InterfaceC116954iR;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.MBB;
import X.XKX;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesApi;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.originalPanel.StickerItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDxS126S0200000_1 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onComplete$1(IDxS126S0200000_1 iDxS126S0200000_1) {
    }

    public static final void onComplete$2(IDxS126S0200000_1 iDxS126S0200000_1) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            case 2:
                onComplete$2(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                return;
            case 1:
                onError$1(this, th);
                return;
            case 2:
                o.LJIIIZ(th, "e");
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            case 2:
                onNext$2(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC92693kP);
                return;
            case 1:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 2:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public static final void onComplete$0(IDxS126S0200000_1 iDxS126S0200000_1) {
        ((C3CK) iDxS126S0200000_1.l0).LJJIFFI(null);
    }

    public static final void onError$0(IDxS126S0200000_1 iDxS126S0200000_1, Throwable th) {
        ((C3CK) iDxS126S0200000_1.l0).LJJIFFI(th);
    }

    public static final void onError$1(IDxS126S0200000_1 iDxS126S0200000_1, Throwable e) {
        o.LJIIIZ(e, "e");
        ((InterfaceC88472Yns) iDxS126S0200000_1.l1).invoke(e);
    }

    public static final void onNext$0(IDxS126S0200000_1 iDxS126S0200000_1, Object obj) {
        Object LJ;
        try {
            C3CK c3ck = (C3CK) iDxS126S0200000_1.l0;
            if (c3ck.LJIILLIIL(obj) instanceof C3C0) {
                LJ = XKX.LJ(MBB.INSTANCE, new C79963Bw(c3ck, obj, null));
            }
        } catch (InterruptedException unused) {
        }
    }

    public static final void onNext$1(IDxS126S0200000_1 iDxS126S0200000_1, Object obj) {
        Integer num;
        LocationServicesApi.DeleteLocationHistoryResponse t = (LocationServicesApi.DeleteLocationHistoryResponse) obj;
        o.LJIIIZ(t, "t");
        if (t.status_code == 0 && (num = t.resultCode) != null) {
            ((InterfaceC88472Yns) iDxS126S0200000_1.l0).invoke(Integer.valueOf(num.intValue()));
        }
    }

    public static final void onNext$2(IDxS126S0200000_1 iDxS126S0200000_1, Object obj) {
        StickerItemList t = (StickerItemList) obj;
        o.LJIIIZ(t, "t");
        t.getCursor();
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDxS126S0200000_1.l0;
        C44192HWa c44192HWa = (C44192HWa) iDxS126S0200000_1.l1;
        final int cursor = t.getCursor();
        final List<NewFaceStickerBean> stickers = t.getStickers();
        c44192HWa.getClass();
        o.LJIIIZ(stickers, "stickers");
        interfaceC88472Yns.invoke(new C34D(cursor, stickers) { // from class: X.33s
            public final int LIZ;
            public final List<NewFaceStickerBean> LIZIZ;

            @Override // X.C34D
            public final List<String> LIZIZ() {
                ArrayList arrayList = new ArrayList();
                Iterator<NewFaceStickerBean> it = this.LIZIZ.iterator();
                while (it.hasNext()) {
                    String str = it.next().effectId;
                    o.LJIIIIZZ(str, "item.effectId");
                    arrayList.add(str);
                }
                return arrayList;
            }

            @Override // X.C34D
            public final int LIZ() {
                return this.LIZ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = cursor;
                this.LIZIZ = stickers;
            }
        });
    }

    public static final void onSubscribe$0(IDxS126S0200000_1 iDxS126S0200000_1, InterfaceC92693kP interfaceC92693kP) {
        AtomicReference atomicReference = (AtomicReference) iDxS126S0200000_1.l1;
        while (!atomicReference.compareAndSet(null, interfaceC92693kP)) {
            if (atomicReference.get() != null) {
                interfaceC92693kP.dispose();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDxS126S0200000_1(Object obj, C3CK<Object> c3ck, AtomicReference<InterfaceC92693kP> atomicReference) {
        this.$t = atomicReference;
        this.l0 = obj;
        this.l1 = c3ck;
    }
}
