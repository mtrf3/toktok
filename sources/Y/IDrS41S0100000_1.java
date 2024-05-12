package Y;

import X.AbstractC93453ld;
import X.AnonymousClass435;
import X.C06460Ne;
import X.C0A2;
import X.C0A6;
import X.C1047549f;
import X.C17N;
import X.C33R;
import X.C34B;
import X.C38346F3e;
import X.C47135Ieh;
import X.C4BU;
import X.C65352Pkq;
import X.C72704Sg8;
import X.C8VC;
import X.C90113gF;
import X.C93493lh;
import X.C96373qL;
import X.InterfaceC71762rk;
import X.InterfaceC93663ly;
import X.SYL;
import X.X1D;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.supporterpanel.VGGifterPanelFragment;
import com.ss.android.ugc.aweme.comment.supporterpanel.VGGifterPanelService;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.bottomsheet.GifChoosePanelBottomSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.scrolltobottomindicator.ScrollToBottomIndicator;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.statemanager.ChatRoomLiveStateManager;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.assem.ContactListAssem;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.assem.SearchResultListAssem;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDrS41S0100000_1 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 1:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 2:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 3:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 4:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            case 5:
                LJIILJJIL$4(this, i, recyclerView);
                return;
            case 6:
                LJIILJJIL$5(this, i, recyclerView);
                return;
            case 7:
                LJIILJJIL$6(this, i, recyclerView);
                return;
            case 8:
                LJIILJJIL$7(this, i, recyclerView);
                return;
            case 9:
                LJIILJJIL$8(this, i, recyclerView);
                return;
            case 10:
                LJIILJJIL$9(this, i, recyclerView);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILJJIL$10(this, i, recyclerView);
                return;
            case 12:
                LJIILJJIL$11(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 7:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
        }
    }

    public IDrS41S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            AnonymousClass435.LIZ(((GifChoosePanelBottomSheet) iDrS41S0100000_1.l0).requireActivity(), recyclerView);
        }
    }

    public static final void LJIILJJIL$1(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 2) {
            ((SessionListFragmentV2) iDrS41S0100000_1.l0).Dl(recyclerView);
        } else {
            if (i != 0) {
                return;
            }
            ((SessionListFragmentV2) iDrS41S0100000_1.l0).Dl(recyclerView);
        }
    }

    public static final void LJIILJJIL$10(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        ARunnableS37S0100000_1 aRunnableS37S0100000_1;
        LinearLayoutManager linearLayoutManager = ((AbstractC93453ld) iDrS41S0100000_1.l0).LJLJLJ;
        if (linearLayoutManager == null) {
            return;
        }
        int LLILLIZIL = linearLayoutManager.LLILLIZIL();
        if (((AbstractC93453ld) iDrS41S0100000_1.l0).LJLIL == 0 && LLILLIZIL == r1.getItemCount() - 1 && (aRunnableS37S0100000_1 = ((AbstractC93453ld) iDrS41S0100000_1.l0).LJLJLLL) != null) {
            C93493lh.LIZ(aRunnableS37S0100000_1);
        }
    }

    public static final void LJIILJJIL$11(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        Integer num;
        Integer num2;
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            num = Integer.valueOf(layoutManager.LJJJJZ());
        } else {
            num = null;
        }
        LinearLayoutManager linearLayoutManager = ((VGGifterPanelFragment) iDrS41S0100000_1.l0).LJLLILLLL;
        if (linearLayoutManager != null) {
            num2 = Integer.valueOf(linearLayoutManager.LLILLJJLI());
        } else {
            num2 = null;
        }
        o.LJI(num2);
        int intValue = num2.intValue() + 1;
        if (num == null || num.intValue() != intValue) {
            return;
        }
        VGGifterPanelFragment vGGifterPanelFragment = (VGGifterPanelFragment) iDrS41S0100000_1.l0;
        if (!vGGifterPanelFragment.LJLL) {
            return;
        }
        C90113gF c90113gF = vGGifterPanelFragment.LJLLL;
        if (c90113gF != null) {
            if (c90113gF.LJLILLLLZI) {
                return;
            }
            vGGifterPanelFragment.LJLJLLL = true;
            c90113gF.LJLILLLLZI = true;
            new Handler().post(new ARunnableS37S0100000_1(c90113gF, 151));
            VGGifterPanelService vGGifterPanelService = vGGifterPanelFragment.LJLJLJ;
            if (vGGifterPanelService != null) {
                vGGifterPanelFragment.vl(vGGifterPanelService);
                return;
            } else {
                o.LJIJI("api");
                throw null;
            }
        }
        o.LJIJI("adapter");
        throw null;
    }

    public static final void LJIILJJIL$2(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        InterfaceC93663ly interfaceC93663ly = (InterfaceC93663ly) C8VC.LJFF((ContactListAssem) iDrS41S0100000_1.l0, C65352Pkq.LIZ(InterfaceC93663ly.class), null);
        if (interfaceC93663ly != null) {
            interfaceC93663ly.LJIJI();
        }
    }

    public static final void LJIILJJIL$3(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        InterfaceC93663ly interfaceC93663ly = (InterfaceC93663ly) C8VC.LJFF((SearchResultListAssem) iDrS41S0100000_1.l0, C65352Pkq.LIZ(InterfaceC93663ly.class), null);
        if (interfaceC93663ly != null) {
            interfaceC93663ly.LJIJI();
        }
    }

    public static final void LJIILJJIL$4(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            View search_default_list = ((View) iDrS41S0100000_1.l0).findViewById(R.id.jey);
            o.LJIIIIZZ(search_default_list, "search_default_list");
            C96373qL.LIZ(search_default_list);
        }
    }

    public static final void LJIILJJIL$5(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            View search_result_list = ((View) iDrS41S0100000_1.l0).findViewById(R.id.jh7);
            o.LJIIIIZZ(search_result_list, "search_result_list");
            C96373qL.LIZ(search_result_list);
        }
    }

    public static final void LJIILJJIL$6(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        int i2;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            C1047549f c1047549f = (C1047549f) iDrS41S0100000_1.l0;
            if (c1047549f.LJLJLLL) {
                ChatLinearLayoutManager chatLinearLayoutManager = c1047549f.LLFZ;
                int i3 = -1;
                if (chatLinearLayoutManager != null) {
                    i2 = chatLinearLayoutManager.LLJJJJLIIL();
                } else {
                    i2 = -1;
                }
                ChatLinearLayoutManager chatLinearLayoutManager2 = ((C1047549f) iDrS41S0100000_1.l0).LLFZ;
                if (chatLinearLayoutManager2 != null) {
                    i3 = chatLinearLayoutManager2.LLJJL();
                }
                StringBuilder LIZJ = C06460Ne.LIZJ("\n                            firstVisiblePosition=", i3, "\n                            lastVisiblePosition=", i2, "\n                            mCurrentUnreadPosition=");
                LIZJ.append(((C1047549f) iDrS41S0100000_1.l0).LJLLLLLL);
                LIZJ.append("\n                            mSmoothScrollDistance=");
                LIZJ.append(((C1047549f) iDrS41S0100000_1.l0).LJZL);
                LIZJ.append("\n                        ");
                C34B.LJI("UnreadMessageTips", C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZJ)));
                ((C1047549f) iDrS41S0100000_1.l0).LJLJLLL = false;
            }
        }
    }

    public static final void LJIILJJIL$7(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            return;
        }
        ((ChatRoomLiveStateManager) iDrS41S0100000_1.l0).LJFF();
    }

    public static final void LJIILJJIL$8(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        int i2;
        o.LJIIIZ(recyclerView, "recyclerView");
        C4BU c4bu = (C4BU) iDrS41S0100000_1.l0;
        if (c4bu.LJLLLLLL && i == 0) {
            c4bu.LJLLLLLL = false;
            View LJJIJIL = c4bu.LJLJJLL.LJJIJIL(c4bu.LJLJLJ.LJII);
            if (LJJIJIL == null) {
                return;
            }
            if (C72704Sg8.LIZIZ(LJJIJIL, "view.context")) {
                i2 = C47135Ieh.LIZ(20, LJJIJIL.getLeft());
            } else {
                i2 = -C47135Ieh.LIZ(20, c4bu.LJIIIZ().getWidth() - LJJIJIL.getRight());
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dx=");
            LIZ.append(i2);
            C34B.LIZIZ("EmojiChoosePanelV2", X1D.LIZIZ(LIZ));
            c4bu.LJIIIZ().scrollBy(i2, 0);
        }
    }

    public static final void LJIILJJIL$9(IDrS41S0100000_1 iDrS41S0100000_1, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            AnonymousClass435.LIZ(((SYL) iDrS41S0100000_1.l0).getContext(), recyclerView);
        }
    }

    public static final void LJIILL$0(IDrS41S0100000_1 iDrS41S0100000_1, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        ChatLinearLayoutManager chatLinearLayoutManager = (ChatLinearLayoutManager) ((ScrollToBottomIndicator) iDrS41S0100000_1.l0).LJLJJL.getValue();
        if (chatLinearLayoutManager != null) {
            int LLJJL = chatLinearLayoutManager.LLJJL();
            if (LLJJL < ((Number) ((InterfaceC71762rk) ((ScrollToBottomIndicator) iDrS41S0100000_1.l0).LJLJI.LIZJ).getValue()).intValue()) {
                ((C33R) ((ScrollToBottomIndicator) iDrS41S0100000_1.l0).LJLJI.LIZIZ).setValue(Integer.valueOf(LLJJL));
            }
            ((ScrollToBottomIndicator) iDrS41S0100000_1.l0).getClass();
            if (LLJJL != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ScrollToBottomIndicator scrollToBottomIndicator = (ScrollToBottomIndicator) iDrS41S0100000_1.l0;
                if (scrollToBottomIndicator.LJLL) {
                    scrollToBottomIndicator.LJLJJLL.setAlpha(0.0f);
                    C17N.LJJLIIIJJI(scrollToBottomIndicator.LJLJJLL);
                    ViewPropertyAnimator animate = scrollToBottomIndicator.LJLJJLL.animate();
                    if (animate != null) {
                        animate.cancel();
                        animate.setInterpolator(new PathInterpolator(0.17f, 0.06f, 0.25f, 1.0f));
                        animate.alpha(1.0f);
                        animate.setDuration(280L);
                        animate.start();
                    }
                    scrollToBottomIndicator.LJLL = false;
                    return;
                }
                return;
            }
            ScrollToBottomIndicator scrollToBottomIndicator2 = (ScrollToBottomIndicator) iDrS41S0100000_1.l0;
            if (scrollToBottomIndicator2.LJLL) {
                return;
            }
            scrollToBottomIndicator2.LJLJJLL.setAlpha(1.0f);
            ViewPropertyAnimator animate2 = scrollToBottomIndicator2.LJLJJLL.animate();
            if (animate2 != null) {
                animate2.cancel();
                animate2.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f));
                animate2.alpha(0.0f);
                animate2.setDuration(300L);
                animate2.withEndAction(new ARunnableS37S0100000_1(scrollToBottomIndicator2, 8));
                animate2.start();
            }
            scrollToBottomIndicator2.LJLL = true;
            ((C33R) scrollToBottomIndicator2.LJLJI.LIZIZ).setValue(0);
            ((HashSet) scrollToBottomIndicator2.LJLJI.LIZ).clear();
        }
    }

    public static final void LJIILL$1(IDrS41S0100000_1 iDrS41S0100000_1, RecyclerView recyclerView, int i, int i2) {
        ChatLinearLayoutManager chatLinearLayoutManager;
        o.LJIIIZ(recyclerView, "recyclerView");
        C1047549f c1047549f = (C1047549f) iDrS41S0100000_1.l0;
        boolean z = false;
        if (c1047549f.LLF.getVisibility() == 8 || (chatLinearLayoutManager = c1047549f.LLFZ) == null) {
            return;
        }
        int LLJJJJLIIL = chatLinearLayoutManager.LLJJJJLIIL();
        List<IMMessage> currentList = c1047549f.LJLJI.getCurrentList();
        o.LJIIIIZZ(currentList, "adapter.currentList");
        if (LLJJJJLIIL < 0 || LLJJJJLIIL >= currentList.size()) {
            return;
        }
        if (((IMMessage) ListProtector.get(currentList, LLJJJJLIIL)).getMessage().getIndex() <= c1047549f.LJLLILLLL) {
            z = true;
        }
        if (z) {
            c1047549f.LIZIZ(null);
        } else {
            if (LLJJJJLIIL != currentList.size() - 1 || c1047549f.LJLJJL.LJZL) {
                return;
            }
            c1047549f.LIZIZ(null);
        }
    }
}
