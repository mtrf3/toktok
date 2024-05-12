package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.AbstractC030309z;
import X.BEP;
import X.BEQ;
import X.BZI;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C223338pd;
import X.C23010vJ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29306Beo;
import X.C2A7;
import X.C31616Cay;
import X.C31619Cb1;
import X.C31621Cb3;
import X.C41051jJ;
import X.C41081jM;
import X.C47121t6;
import X.C72259SXn;
import X.C79045V0n;
import X.InterfaceC88472Yns;
import X.Q7L;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDCListenerS206S0100000_5;
import Y.IDCSpanS31S0100000_5;
import Y.IDLListenerS193S0100000_5;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.livesetting.subscription.LiveGiftSubMerchantIdSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveGiftSubTermsCheckboxSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubscriptionGiftSendDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LLD = 0;
    public FrameLayout LJLIL;
    public ConstraintLayout LJLILLLLZI;
    public C223338pd LJLJI;
    public BEQ LJLJJI;
    public C41081jM LJLJJL;
    public ConstraintLayout LJLJJLL;
    public C47121t6 LJLJL;
    public C41051jJ LJLJLJ;
    public ObjectAnimator LJLJLLL;
    public C2A7 LJLL;
    public RecyclerView LJLLI;
    public C31616Cay LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLZ;
    public InterfaceC88472Yns<? super BZI, BZI> LJZ;
    public boolean LJZI;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public String LJLLLL = "";
    public String LJLLLLLL = "";
    public final String LJZL = LiveGiftSubMerchantIdSetting.INSTANCE.getValue();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void wl() {
        setCancelable(true);
        C2A7 c2a7 = this.LJLL;
        if (c2a7 != null) {
            c2a7.LJL();
        }
        C31616Cay c31616Cay = this.LJLLILLLL;
        if (c31616Cay != null) {
            c31616Cay.LJLJJI = false;
        }
        C41051jJ c41051jJ = this.LJLJLJ;
        if (c41051jJ == null) {
            return;
        }
        c41051jJ.setClickable(true);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d15);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 60;
        return c28507BGt;
    }

    public final void vl() {
        C223338pd c223338pd = this.LJLJI;
        if (c223338pd != null) {
            c223338pd.setVisibility(0);
        }
        C223338pd c223338pd2 = this.LJLJI;
        if (c223338pd2 != null) {
            c223338pd2.LIZIZ();
        }
        C1EW.LIZ(((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getSubGiftTemplateInfo(this.LJLLLL)).LJJJLIIL(new AfS57S0100000_5(this, 115), new AfS57S0100000_5(this, 116));
    }

    public final void xl() {
        Long l;
        C223338pd c223338pd = this.LJLJI;
        if (c223338pd != null) {
            c223338pd.setVisibility(8);
        }
        C223338pd c223338pd2 = this.LJLJI;
        if (c223338pd2 != null) {
            c223338pd2.LIZJ();
        }
        C2A7 c2a7 = this.LJLL;
        if (c2a7 != null) {
            c2a7.setEnabled(true);
        }
        this.LJLLL = true;
        InterfaceC88472Yns<? super BZI, BZI> interfaceC88472Yns = this.LJZ;
        if (interfaceC88472Yns != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_subscription_gift_sub_detail_page_show");
            LIZ.LJIIZILJ();
            AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(this, 342);
            Room LJJIJLIJ = C29306Beo.LJJIJLIJ(this.dataChannel);
            if (LJJIJLIJ != null) {
                l = Long.valueOf(LJJIJLIJ.getOwnerUserId());
            } else {
                l = null;
            }
            LIZ.LJJI(String.valueOf(l), "anchor_id", aqS155S0100000_5);
            LIZ.LJIJJ(this.LJLLLLLL, "room_id");
            BZI invoke = interfaceC88472Yns.invoke(LIZ);
            if (invoke != null) {
                invoke.LJJIIJZLJL();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ObjectAnimator objectAnimator = this.LJLJLLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            C16880lQ.LJLJJLL(objectAnimator);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer LJI;
        ViewTreeObserver viewTreeObserver;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLL = (C2A7) view.findViewById(R.id.azj);
        this.LJLJJLL = (ConstraintLayout) view.findViewById(R.id.l2k);
        this.LJLJLJ = (C41051jJ) view.findViewById(R.id.b_d);
        this.LJLJL = (C47121t6) view.findViewById(R.id.kp7);
        this.LJLLI = (RecyclerView) view.findViewById(R.id.dwr);
        this.LJLJI = (C223338pd) view.findViewById(R.id.i6a);
        this.LJLJJI = (BEQ) view.findViewById(R.id.kns);
        this.LJLJJL = (C41081jM) view.findViewById(R.id.d4t);
        this.LJLILLLLZI = (ConstraintLayout) view.findViewById(R.id.ap9);
        this.LJLIL = (FrameLayout) view.findViewById(R.id.gf6);
        ForegroundColorSpan foregroundColorSpan = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.div, C16880lQ.LLZIL(getContext()), null);
        C16880lQ.LJJIII((C2A7) LLLZIIL.findViewById(R.id.dv7), new ACListenerS25S0100000_5(this, 326));
        BEQ beq = this.LJLJJI;
        if (beq != null) {
            BEP LIZ = BEP.LIZ(getContext());
            LIZ.LIZLLL = LLLZIIL;
            beq.setBuilder(LIZ);
        }
        C41081jM c41081jM = this.LJLJJL;
        if (c41081jM != null) {
            C16880lQ.LJJIIZI(c41081jM, new ACListenerS25S0100000_5(this, 327));
        }
        C2A7 c2a7 = this.LJLL;
        if (c2a7 != null) {
            c2a7.setRadius(C15380j0.LIZ(8.0f));
            c2a7.setEnabled(false);
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 328));
        }
        C41051jJ c41051jJ = this.LJLJLJ;
        if (c41051jJ != null) {
            LiveGiftSubTermsCheckboxSetting liveGiftSubTermsCheckboxSetting = LiveGiftSubTermsCheckboxSetting.INSTANCE;
            if (liveGiftSubTermsCheckboxSetting.getValue() == liveGiftSubTermsCheckboxSetting.getHIDE()) {
                C41051jJ c41051jJ2 = this.LJLJLJ;
                if (c41051jJ2 != null) {
                    C29306Beo.LJI(c41051jJ2);
                }
                this.LJLLJ = true;
            } else {
                C41051jJ c41051jJ3 = this.LJLJLJ;
                if (c41051jJ3 != null) {
                    C29306Beo.LJJLJLI(c41051jJ3);
                }
                c41051jJ.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 25));
                C72259SXn.LIZIZ(c41051jJ, 8, 8, 8, 8);
            }
        }
        C47121t6 c47121t6 = this.LJLJL;
        if (c47121t6 != null) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lp8);
            String LJIILL = C15380j0.LJIILL(R.string.lp6, LJIILJJIL);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LJIILL);
            int length = LJIILL.length();
            int length2 = length - (LJIILJJIL.length() + 1);
            C23010vJ.LIZJ(getContext(), spannableStringBuilder, length2, length, 33, 5, 600);
            spannableStringBuilder.setSpan(new IDCSpanS31S0100000_5(this, 9), length2, length, 33);
            Context context = getContext();
            if (context != null && (LJI = C79045V0n.LJI(R.attr.ax8, context)) != null) {
                foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, length2, length, 33);
            c47121t6.setText(spannableStringBuilder);
        }
        C47121t6 c47121t62 = this.LJLJL;
        if (c47121t62 != null) {
            c47121t62.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C47121t6 c47121t63 = this.LJLJL;
        if (c47121t63 != null) {
            c47121t63.setHighlightColor(0);
        }
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
        RecyclerView recyclerView = this.LJLLI;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.LJLLI;
        if (recyclerView2 != null) {
            final int LIZ2 = C15380j0.LIZ(8.0f);
            recyclerView2.LJII(new AbstractC030309z(LIZ2) { // from class: X.4SS
                public final int LJLIL;

                {
                    this.LJLIL = LIZ2;
                }

                @Override // X.AbstractC030309z
                public final void LJ(Rect outRect, View view2, RecyclerView parent, C0AC state) {
                    GridLayoutManager gridLayoutManager2;
                    o.LJIIIZ(outRect, "outRect");
                    o.LJIIIZ(view2, "view");
                    o.LJIIIZ(parent, "parent");
                    o.LJIIIZ(state, "state");
                    C0A2 layoutManager = parent.getLayoutManager();
                    if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager2 = (GridLayoutManager) layoutManager) == null) {
                        return;
                    }
                    int LJJJJIZL = RecyclerView.LJJJJIZL(view2);
                    int i = gridLayoutManager2.LLIIIL;
                    int i2 = LJJJJIZL % i;
                    int i3 = this.LJLIL;
                    outRect.left = (i2 * i3) / i;
                    outRect.right = i3 - (((i2 + 1) * i3) / i);
                    if (LJJJJIZL >= i) {
                        outRect.top = i3;
                    }
                }
            }, -1);
        }
        RecyclerView recyclerView3 = this.LJLLI;
        if (recyclerView3 != null) {
            recyclerView3.setNestedScrollingEnabled(false);
        }
        C31616Cay c31616Cay = new C31616Cay(this.LJLZ, this);
        this.LJLLILLLL = c31616Cay;
        RecyclerView recyclerView4 = this.LJLLI;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(c31616Cay);
        }
        IDLListenerS193S0100000_5 iDLListenerS193S0100000_5 = new IDLListenerS193S0100000_5(this, 6);
        View view2 = getView();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(iDLListenerS193S0100000_5);
        }
        C31619Cb1 c31619Cb1 = C31621Cb3.LIZIZ;
        if (c31619Cb1 == null || !this.LJLZ) {
            vl();
            return;
        }
        C31616Cay c31616Cay2 = this.LJLLILLLL;
        if (c31616Cay2 != null) {
            c31616Cay2.LJLJJL = c31619Cb1;
            c31616Cay2.notifyDataSetChanged();
        }
        xl();
    }
}
