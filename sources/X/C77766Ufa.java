package X;

import com.bytedance.android.live.wallet.common.IapViewModelImpl;
import com.bytedance.android.live.wallet.model.IapProductBuyParam;
import com.bytedance.android.live.wallet.model.IapProductBuyResult;
import com.bytedance.android.live.wallet.model.IapProductGetResult;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ufa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77766Ufa implements InterfaceC77737Uf7 {
    public final /* synthetic */ IapViewModelImpl LJLIL;

    @Override // X.InterfaceC77737Uf7
    public final void LIZ(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LIZIZ(int i, C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LIZLLL(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJI(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIIIZZ(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIIZ(int i, C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIL(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIILJJIL(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIILLIIL(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJI(int i, C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJJ(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIL(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final InterfaceC77748UfI LIZJ() {
        this.LJLIL.getClass();
        return null;
    }

    public C77766Ufa(IapViewModelImpl iapViewModelImpl) {
        this.LJLIL = iapViewModelImpl;
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIJJI(C31556Ca0 c31556Ca0) {
        IapViewModelImpl iapViewModelImpl = this.LJLIL;
        iapViewModelImpl.getClass();
        A6G a6g = iapViewModelImpl.LJLIL;
        if (a6g != null) {
            a6g.LLLLLILLIL();
        }
        C77612Ud6 c77612Ud6 = c31556Ca0.LJLJI;
        String str = c77612Ud6.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = c77612Ud6.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        if (str.length() > 0 && str3.length() > 0) {
            A6G a6g2 = iapViewModelImpl.LJLIL;
            if (a6g2 != null) {
                C77612Ud6 c77612Ud62 = c31556Ca0.LJLJI;
                IapProductBuyResult iapProductBuyResult = new IapProductBuyResult();
                iapProductBuyResult.code = 1;
                IapProductBuyResult.Item item = new IapProductBuyResult.Item();
                String str4 = c77612Ud62.LIZ;
                if (str4 == null) {
                    str4 = "";
                }
                item.productId = str4;
                String str5 = c77612Ud62.LIZIZ;
                if (str5 != null) {
                    str2 = str5;
                }
                item.orderId = str2;
                iapProductBuyResult.data = item;
                a6g2.LLLLLL(iapProductBuyResult);
                return;
            }
            return;
        }
        iapViewModelImpl.hv0(c31556Ca0.LJLIL, -1, -1, new Exception(C15380j0.LJIILJJIL(R.string.ot5)));
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJFF(int i, C77623UdH c77623UdH) {
        IapViewModelImpl iapViewModelImpl = this.LJLIL;
        iapViewModelImpl.getClass();
        IapProductBuyParam iapProductBuyParam = iapViewModelImpl.LJLJJI;
        A6G a6g = iapViewModelImpl.LJLIL;
        if (a6g != null) {
            a6g.LJIJ();
        }
        if (iapProductBuyParam == null) {
            A6G a6g2 = iapViewModelImpl.LJLIL;
            if (a6g2 != null) {
                a6g2.LJIIJ(IapViewModelImpl.gv0(c77623UdH.getErrorCode(), c77623UdH.getDetailCode(), c77623UdH.getException()));
                return;
            }
            return;
        }
        iapViewModelImpl.hv0(i, 203, c77623UdH.getDetailCode(), c77623UdH.getException());
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIZILJ(int i, C77623UdH c77623UdH) {
        IapViewModelImpl iapViewModelImpl = this.LJLIL;
        iapViewModelImpl.getClass();
        A6G a6g = iapViewModelImpl.LJLIL;
        if (a6g != null) {
            a6g.LLLLLILLIL();
        }
        iapViewModelImpl.hv0(i, c77623UdH.getErrorCode(), c77623UdH.getDetailCode(), c77623UdH.getException());
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJJ(int i, C31556Ca0 c31556Ca0) {
        String str;
        IapViewModelImpl iapViewModelImpl = this.LJLIL;
        iapViewModelImpl.getClass();
        Diamond diamond = (Diamond) ORZ.LJLLLLLL(0, c31556Ca0.LJLILLLLZI);
        if (diamond == null || (str = diamond.LJLILLLLZI) == null) {
            str = "";
        }
        if (!C38354F3m.LIZJ(C77769Ufd.LIZJ, str) || !C77769Ufd.LIZIZ()) {
            ConcurrentHashMap<String, Diamond> concurrentHashMap = C77769Ufd.LIZLLL;
            concurrentHashMap.clear();
            C77769Ufd.LIZJ = str;
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            if (C77769Ufd.LIZIZ != currentUserId) {
                C77769Ufd.LIZIZ = currentUserId;
                concurrentHashMap.clear();
            }
        }
        List<? extends Diamond> list = c31556Ca0.LJLILLLLZI;
        o.LJIIIZ(list, "list");
        long currentUserId2 = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (C77769Ufd.LIZIZ != currentUserId2) {
            C77769Ufd.LIZIZ = currentUserId2;
            C77769Ufd.LIZLLL.clear();
        }
        C77769Ufd.LIZ = System.currentTimeMillis();
        for (Diamond diamond2 : list) {
            C77769Ufd.LIZLLL.put(diamond2.iapId, diamond2);
        }
        IapProductBuyParam iapProductBuyParam = iapViewModelImpl.LJLJJI;
        if (iapProductBuyParam == null) {
            if (!c31556Ca0.LJLILLLLZI.isEmpty()) {
                A6G a6g = iapViewModelImpl.LJLIL;
                if (a6g != null) {
                    a6g.LJIJ();
                }
                A6G a6g2 = iapViewModelImpl.LJLIL;
                if (a6g2 != null) {
                    List<? extends Diamond> list2 = c31556Ca0.LJLILLLLZI;
                    IapProductGetResult iapProductGetResult = new IapProductGetResult();
                    iapProductGetResult.code = 1;
                    for (Diamond diamond3 : list2) {
                        IapProductGetResult.Item item = new IapProductGetResult.Item();
                        String str2 = diamond3.iapId;
                        o.LJIIIIZZ(str2, "it.iapId");
                        item.productId = str2;
                        String str3 = diamond3.LJLJJI;
                        o.LJIIIIZZ(str3, "it.description");
                        item.skuName = str3;
                        String str4 = diamond3.LJLILLLLZI;
                        o.LJIIIIZZ(str4, "it.priceCurrencyCode");
                        item.currency = str4;
                        String str5 = diamond3.price;
                        o.LJIIIIZZ(str5, "it.price");
                        item.price = str5;
                        item.priceAmountMicros = diamond3.LJLJI;
                        HashMap<String, IapProductGetResult.Item> hashMap = iapProductGetResult.data;
                        if (hashMap != null) {
                            hashMap.put(item.productId, item);
                        }
                    }
                    a6g2.LJIILIIL(iapProductGetResult);
                    return;
                }
                return;
            }
            A6G a6g3 = iapViewModelImpl.LJLIL;
            if (a6g3 != null) {
                a6g3.LJIJ();
            }
            A6G a6g4 = iapViewModelImpl.LJLIL;
            if (a6g4 != null) {
                a6g4.LJIIJ(IapViewModelImpl.gv0(-1, -1, new Exception(C15380j0.LJIILJJIL(R.string.ot5))));
                return;
            }
            return;
        }
        Diamond LIZ = C77769Ufd.LIZ(iapProductBuyParam.productId);
        if (LIZ != null) {
            LIZ.id = iapProductBuyParam.diamondId;
            iapViewModelImpl.getPayManager().LJII(iapProductBuyParam.way, iapProductBuyParam.source, iapProductBuyParam.tradeType, iapProductBuyParam.businessType, C29306Beo.LIZIZ(iapViewModelImpl.LJLJJL), iapViewModelImpl.LJLJI, LIZ, iapProductBuyParam.orderId);
        } else {
            A6G a6g5 = iapViewModelImpl.LJLIL;
            if (a6g5 != null) {
                a6g5.LJIJ();
            }
            iapViewModelImpl.hv0(c31556Ca0.LJLIL, -1, -1, new Exception(C15380j0.LJIILJJIL(R.string.ot5)));
        }
    }
}
