package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C176996x5;
import X.C223338pd;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C73969T1h;
import X.C76800UCe;
import X.C770830u;
import X.C90113gF;
import X.C90903hW;
import X.C9KF;
import X.EFJ;
import X.InterfaceC219588ja;
import X.InterfaceC789838c;
import X.InterfaceC92693kP;
import X.T16;
import Y.ACListenerS21S0100000_1;
import Y.AObjectS45S0101000_13;
import Y.IDrS41S0100000_1;
import Y.IDxS303S0100000_1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.comment.supporterpanel.GiftPageItem;
import com.ss.android.ugc.aweme.comment.supporterpanel.VGGifterPanelFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VGGifterPanelFragment extends Fragment implements InterfaceC219588ja {
    public C176996x5 LJLIL;
    public GiftPageItem LJLILLLLZI;
    public String LJLJI;
    public Aweme LJLJJI;
    public String LJLJJL;
    public final InterfaceC789838c LJLJJLL;
    public InterfaceC92693kP LJLJL;
    public VGGifterPanelService LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public LinearLayoutManager LJLLILLLL;
    public RecyclerView LJLLJ;
    public C90113gF LJLLL;
    public LinearLayout LJLLLL;
    public LinearLayout LJLLLLLL;
    public C223338pd LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();

    public VGGifterPanelFragment() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LJLJJLL = C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str);
        this.LJLL = true;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 48));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        LIZLLL.LIZJ = "Gifters";
        c235119Kp.LIZJ = LIZLLL;
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJZ).clear();
    }

    public final void vl(VGGifterPanelService vGGifterPanelService) {
        Long l;
        String str = this.LJLJI;
        GiftPageItem giftPageItem = this.LJLILLLLZI;
        if (giftPageItem != null) {
            l = Long.valueOf(giftPageItem.id);
        } else {
            l = null;
        }
        vGGifterPanelService.getGifterPanel(str, l, Long.valueOf(this.LJLLI)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS303S0100000_1(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        TextView textView;
        SmartAvatarImageView smartAvatarImageView;
        String str2;
        String str3;
        UrlModel urlModel;
        List<String> urlList;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        this.LJLJI = str;
        View findViewById = view.findViewById(R.id.dw7);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.gifter_panel_loader)");
        this.LJLZ = (C223338pd) findViewById;
        View findViewById2 = view.findViewById(R.id.dw3);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.gifter_panel_error_layout)");
        this.LJLLLL = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.dw6);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.gifter_panel_layout)");
        this.LJLLLLLL = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.dw9);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.gifter_recycler_view)");
        this.LJLLJ = (RecyclerView) findViewById4;
        C90113gF c90113gF = new C90113gF();
        this.LJLLL = c90113gF;
        RecyclerView recyclerView = this.LJLLJ;
        if (recyclerView != null) {
            recyclerView.setAdapter(c90113gF);
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            this.LJLLILLLL = linearLayoutManager;
            RecyclerView recyclerView2 = this.LJLLJ;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
                IDrS41S0100000_1 iDrS41S0100000_1 = new IDrS41S0100000_1(this, 12);
                RecyclerView recyclerView3 = this.LJLLJ;
                if (recyclerView3 != null) {
                    recyclerView3.LJIIJJI(iDrS41S0100000_1);
                    View view2 = getView();
                    if (view2 != null) {
                        textView = (TextView) view2.findViewById(R.id.dts);
                    } else {
                        textView = null;
                    }
                    View view3 = getView();
                    if (view3 != null) {
                        smartAvatarImageView = (SmartAvatarImageView) view3.findViewById(R.id.dte);
                    } else {
                        smartAvatarImageView = null;
                    }
                    if (textView != null) {
                        GiftPageItem giftPageItem = this.LJLILLLLZI;
                        if (giftPageItem != null) {
                            str2 = giftPageItem.name;
                        } else {
                            str2 = null;
                        }
                        textView.setText(str2);
                    }
                    if (smartAvatarImageView != null) {
                        GiftPageItem giftPageItem2 = this.LJLILLLLZI;
                        if (giftPageItem2 != null && (urlModel = giftPageItem2.imageURL) != null && (urlList = urlModel.getUrlList()) != null) {
                            str3 = (String) ListProtector.get(urlList, 0);
                        } else {
                            str3 = null;
                        }
                        smartAvatarImageView.setImageURI(str3);
                        C16880lQ.LJJJJL(smartAvatarImageView, new View.OnClickListener() { // from class: X.6x7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                VGGifterPanelFragment vGGifterPanelFragment = VGGifterPanelFragment.this;
                                GiftPageItem giftPageItem3 = vGGifterPanelFragment.LJLILLLLZI;
                                if (giftPageItem3 != null) {
                                    long j = giftPageItem3.id;
                                    C176996x5 c176996x5 = vGGifterPanelFragment.LJLIL;
                                    if (c176996x5 != null) {
                                        if (!c176996x5.LJJIJIIJI()) {
                                            return;
                                        }
                                        C186577Tx.LIZIZ("gift", c176996x5.LJIJJLI());
                                        GiftViewModel giftViewModel = c176996x5.LLIIJLIL;
                                        giftViewModel.LJLLILLLL = "show_gifters_list_gift";
                                        giftViewModel.LJLLJ = Long.valueOf(j);
                                        c176996x5.LLIIII = "show_gifters_list_gift";
                                        c176996x5.LJJIJIL("show_gifters_list_gift");
                                        DataCenter dataCenter = c176996x5.LLI;
                                        if (dataCenter != null) {
                                            dataCenter.jv0(6, "comment_dialog_state");
                                        }
                                        C177146xK c177146xK = c176996x5.LJLIL;
                                        if (c177146xK != null && (c176996x5.LJLJJI instanceof CommentListFragment)) {
                                            c177146xK.LIZ = c176996x5.LJLLJ;
                                            c177146xK.LIZ(new AObjectS45S0101000_13(3, c176996x5, 5));
                                            C177146xK c177146xK2 = c176996x5.LJLIL;
                                            C177896yX panelType = C177896yX.LIZ;
                                            String str4 = c176996x5.LJLLJ;
                                            c177146xK2.getClass();
                                            o.LJIIIZ(panelType, "panelType");
                                            c177146xK2.LIZIZ.O3(panelType, str4);
                                            return;
                                        }
                                        Bundle LJIJI = c176996x5.LJIJI("");
                                        LJIJI.putBoolean("showGiftPanel", true);
                                        c176996x5.LJIIJJI(KeyboardDialogFragment.Al(c176996x5.LJLJJI.getCommentInputViewType(), c176996x5.LJLJJI.hasUpvoteOption(), c176996x5.LJIJJLI(), LJIJI, c176996x5.LLILZ));
                                        return;
                                    }
                                    o.LJIJI("mCommentInputManager");
                                    throw null;
                                }
                            }
                        });
                    }
                    VGGifterPanelService vGGifterPanelService = (VGGifterPanelService) this.LJLJJLL.create(VGGifterPanelService.class);
                    o.LJIIIZ(vGGifterPanelService, "<set-?>");
                    this.LJLJLJ = vGGifterPanelService;
                    C223338pd c223338pd = this.LJLZ;
                    if (c223338pd != null) {
                        c223338pd.LIZIZ();
                        VGGifterPanelService vGGifterPanelService2 = this.LJLJLJ;
                        if (vGGifterPanelService2 != null) {
                            vl(vGGifterPanelService2);
                            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dw4);
                            tuxTextView.setClickable(true);
                            C16880lQ.LJJJJI(tuxTextView, new ACListenerS21S0100000_1(this, 31));
                            return;
                        }
                        o.LJIJI("api");
                        throw null;
                    }
                    o.LJIJI("tuxDualBallView");
                    throw null;
                }
                o.LJIJI("recyclerView");
                throw null;
            }
            o.LJIJI("recyclerView");
            throw null;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.pk, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
