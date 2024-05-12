package Y;

import X.ASQ;
import X.ASX;
import X.C141335gf;
import X.C176996x5;
import X.C188727au;
import X.C223338pd;
import X.C27739Aud;
import X.C3C5;
import X.C65330PkU;
import X.C65352Pkq;
import X.C90113gF;
import X.C90203gO;
import X.FMX;
import X.InterfaceC116954iR;
import X.InterfaceC67352kd;
import X.InterfaceC92693kP;
import android.os.Handler;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.s;
import com.ss.android.ugc.aweme.comment.supporterpanel.GiftAndSenders;
import com.ss.android.ugc.aweme.comment.supporterpanel.GiftListPanelResponse;
import com.ss.android.ugc.aweme.comment.supporterpanel.GiftSender;
import com.ss.android.ugc.aweme.comment.supporterpanel.GiftSupporterPanelInfo;
import com.ss.android.ugc.aweme.comment.supporterpanel.GiftSupporterPanelResponse;
import com.ss.android.ugc.aweme.comment.supporterpanel.VGGifterPanelFragment;
import com.ss.android.ugc.aweme.comment.supporterpanel.VGSupportPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CCDCCardInfoDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PiPoResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDxS303S0100000_1 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(IDxS303S0100000_1 iDxS303S0100000_1) {
    }

    public static final void onComplete$1(IDxS303S0100000_1 iDxS303S0100000_1) {
    }

    public static final void onComplete$2(IDxS303S0100000_1 iDxS303S0100000_1) {
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
                onError$2(this, th);
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
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 1:
                onSubscribe$1(this, interfaceC92693kP);
                return;
            case 2:
                onSubscribe$2(this, interfaceC92693kP);
                return;
            default:
                return;
        }
    }

    public IDxS303S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(IDxS303S0100000_1 iDxS303S0100000_1, Throwable t) {
        o.LJIIIZ(t, "t");
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDxS303S0100000_1.l0;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    public static final void onError$1(IDxS303S0100000_1 iDxS303S0100000_1, Throwable e) {
        o.LJIIIZ(e, "e");
        C223338pd c223338pd = ((VGGifterPanelFragment) iDxS303S0100000_1.l0).LJLZ;
        if (c223338pd != null) {
            c223338pd.LIZJ();
            VGGifterPanelFragment vGGifterPanelFragment = (VGGifterPanelFragment) iDxS303S0100000_1.l0;
            RecyclerView recyclerView = vGGifterPanelFragment.LJLLJ;
            if (recyclerView != null) {
                if (recyclerView.getVisibility() != 0) {
                    LinearLayout linearLayout = vGGifterPanelFragment.LJLLLL;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                        return;
                    } else {
                        o.LJIJI("errorView");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("recyclerView");
            throw null;
        }
        o.LJIJI("tuxDualBallView");
        throw null;
    }

    public static final void onError$2(IDxS303S0100000_1 iDxS303S0100000_1, Throwable e) {
        o.LJIIIZ(e, "e");
        C223338pd c223338pd = ((VGSupportPanelFragment) iDxS303S0100000_1.l0).LJLJLLL;
        if (c223338pd != null) {
            c223338pd.LIZJ();
            LinearLayout linearLayout = ((VGSupportPanelFragment) iDxS303S0100000_1.l0).LJLLI;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            } else {
                o.LJIJI("errorView");
                throw null;
            }
        }
        o.LJIJI("tuxDualBallView");
        throw null;
    }

    public static final void onNext$0(IDxS303S0100000_1 iDxS303S0100000_1, Object obj) {
        Object LIZ;
        PiPoResponse data = (PiPoResponse) obj;
        o.LJIIIZ(data, "data");
        Object obj2 = null;
        try {
            try {
                Object LJII = C27739Aud.LJFF().LJII(data.getResponse(), C65330PkU.LIZJ(C65352Pkq.LJI(CCDCCardInfoDTO.class)));
                if (!(LJII instanceof CCDCCardInfoDTO)) {
                    LJII = null;
                }
                LIZ = (CCDCCardInfoDTO) LJII;
            } catch (s unused) {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj2 = LIZ;
        }
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDxS303S0100000_1.l0;
        C3C5.m7constructorimpl(obj2);
        interfaceC67352kd.resumeWith(obj2);
    }

    public static final void onNext$1(IDxS303S0100000_1 iDxS303S0100000_1, Object obj) {
        Integer num;
        String str;
        GiftListPanelResponse t = (GiftListPanelResponse) obj;
        o.LJIIIZ(t, "t");
        C223338pd c223338pd = ((VGGifterPanelFragment) iDxS303S0100000_1.l0).LJLZ;
        String str2 = null;
        if (c223338pd != null) {
            c223338pd.LIZJ();
            if (t.code == 0) {
                LinearLayout linearLayout = ((VGGifterPanelFragment) iDxS303S0100000_1.l0).LJLLLLLL;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    C90113gF c90113gF = ((VGGifterPanelFragment) iDxS303S0100000_1.l0).LJLLL;
                    if (c90113gF != null) {
                        if (c90113gF.LJLILLLLZI && ((ArrayList) c90113gF.LJLIL).size() != 0) {
                            ListProtector.remove(c90113gF.LJLIL, ((ArrayList) r1).size() - 1);
                            c90113gF.notifyItemRemoved(((ArrayList) c90113gF.LJLIL).size());
                            c90113gF.LJLILLLLZI = false;
                        }
                        List<GiftSender> list = t.senders;
                        if (list != null) {
                            C90113gF c90113gF2 = ((VGGifterPanelFragment) iDxS303S0100000_1.l0).LJLLL;
                            if (c90113gF2 != null) {
                                new Handler().post(new ARunnableS20S0200000_1(c90113gF2, list, 61));
                            } else {
                                o.LJIJI("adapter");
                                throw null;
                            }
                        }
                        VGGifterPanelFragment vGGifterPanelFragment = (VGGifterPanelFragment) iDxS303S0100000_1.l0;
                        vGGifterPanelFragment.LJLL = t.hasMore;
                        Long l = t.cursor;
                        if (l != null) {
                            vGGifterPanelFragment.LJLLI = l.longValue();
                        }
                        VGGifterPanelFragment vGGifterPanelFragment2 = (VGGifterPanelFragment) iDxS303S0100000_1.l0;
                        if (vGGifterPanelFragment2.LJLJLLL) {
                            if (!vGGifterPanelFragment2.LJLL) {
                                C90113gF c90113gF3 = vGGifterPanelFragment2.LJLLL;
                                if (c90113gF3 != null) {
                                    new Handler().post(new ARunnableS37S0100000_1(c90113gF3, 150));
                                    return;
                                } else {
                                    o.LJIJI("adapter");
                                    throw null;
                                }
                            }
                            return;
                        }
                        List<GiftSender> list2 = t.senders;
                        if (list2 != null) {
                            num = Integer.valueOf(list2.size());
                        } else {
                            num = null;
                        }
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", vGGifterPanelFragment2.LJLJJL);
                        c188727au.LJIIIZ("enter_method", "click");
                        Aweme aweme = vGGifterPanelFragment2.LJLJJI;
                        if (aweme != null) {
                            str = aweme.getAid();
                        } else {
                            str = null;
                        }
                        c188727au.LJIIIZ("group_id", str);
                        Aweme aweme2 = vGGifterPanelFragment2.LJLJJI;
                        if (aweme2 != null) {
                            str2 = aweme2.getAuthorUid();
                        }
                        c188727au.LJIIIZ("author_id", str2);
                        c188727au.LJFF(num, "num_results");
                        FMX.LJIIL("show_gifters_list", c188727au.LIZ);
                        return;
                    }
                    o.LJIJI("adapter");
                    throw null;
                }
                o.LJIJI("gifterPanelView");
                throw null;
            }
            VGGifterPanelFragment vGGifterPanelFragment3 = (VGGifterPanelFragment) iDxS303S0100000_1.l0;
            RecyclerView recyclerView = vGGifterPanelFragment3.LJLLJ;
            if (recyclerView != null) {
                if (recyclerView.getVisibility() == 0) {
                    return;
                }
                LinearLayout linearLayout2 = vGGifterPanelFragment3.LJLLLL;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("errorView");
                    throw null;
                }
            }
            o.LJIJI("recyclerView");
            throw null;
        }
        o.LJIJI("tuxDualBallView");
        throw null;
    }

    public static final void onNext$2(IDxS303S0100000_1 iDxS303S0100000_1, Object obj) {
        List<GiftAndSenders> list;
        GiftSupporterPanelResponse response = (GiftSupporterPanelResponse) obj;
        o.LJIIIZ(response, "response");
        C223338pd c223338pd = ((VGSupportPanelFragment) iDxS303S0100000_1.l0).LJLJLLL;
        if (c223338pd != null) {
            c223338pd.LIZJ();
            if (response.code == 0) {
                GiftSupporterPanelInfo giftSupporterPanelInfo = response.data;
                if (giftSupporterPanelInfo != null && (list = giftSupporterPanelInfo.otherGifts) != null && (!list.isEmpty())) {
                    VGSupportPanelFragment vGSupportPanelFragment = (VGSupportPanelFragment) iDxS303S0100000_1.l0;
                    vGSupportPanelFragment.LJLJL = response;
                    C90203gO c90203gO = vGSupportPanelFragment.LJLILLLLZI;
                    if (c90203gO != null) {
                        vGSupportPanelFragment.wl(c90203gO, response, true);
                        return;
                    } else {
                        o.LJIJI("adapter");
                        throw null;
                    }
                }
                VGSupportPanelFragment vGSupportPanelFragment2 = (VGSupportPanelFragment) iDxS303S0100000_1.l0;
                vGSupportPanelFragment2.getClass();
                VGSupportPanelFragment.LJLLJ = true;
                ASQ.LIZ(vGSupportPanelFragment2, ASX.LIZ);
                C176996x5 c176996x5 = ((VGSupportPanelFragment) iDxS303S0100000_1.l0).LJLIL;
                if (c176996x5 != null) {
                    c176996x5.LJJLIIIJ("", "");
                    return;
                } else {
                    o.LJIJI("mCommentInputManager");
                    throw null;
                }
            }
            LinearLayout linearLayout = ((VGSupportPanelFragment) iDxS303S0100000_1.l0).LJLLI;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            } else {
                o.LJIJI("errorView");
                throw null;
            }
        }
        o.LJIJI("tuxDualBallView");
        throw null;
    }

    public static final void onSubscribe$1(IDxS303S0100000_1 iDxS303S0100000_1, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        ((VGGifterPanelFragment) iDxS303S0100000_1.l0).LJLJL = d;
    }

    public static final void onSubscribe$2(IDxS303S0100000_1 iDxS303S0100000_1, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        ((VGSupportPanelFragment) iDxS303S0100000_1.l0).LJLJJLL = d;
    }
}
