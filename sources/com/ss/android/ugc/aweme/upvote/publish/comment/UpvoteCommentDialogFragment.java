package com.ss.android.ugc.aweme.upvote.publish.comment;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C03880Dg;
import X.C10A;
import X.C110154Tz;
import X.C110614Vt;
import X.C111024Xi;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C183127Gq;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C29S;
import X.C2PY;
import X.C32151Nz;
import X.C32I;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C47261Igj;
import X.C4VN;
import X.C56412MCa;
import X.C61328O5c;
import X.C61878OQg;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78496UrM;
import X.C78926UyI;
import X.C78939UyV;
import X.C7EW;
import X.C86V;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9KF;
import X.FMX;
import X.HG3;
import X.InterfaceC182577En;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.O6R;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.RBX;
import X.SY4;
import X.T5T;
import X.TBT;
import X.TBW;
import X.ViewOnClickListenerC13880ga;
import X.W5F;
import X.W5U;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS39S0100000_3;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.upvote.publish.comment.UpvoteCommentDialogFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS92S0300000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class UpvoteCommentDialogFragment extends BaseDialogFragment implements KPL, TextWatcher, InterfaceC182577En {
    public View LJLJI;
    public String LJLLLL;
    public String LJLLLLLL;
    public UpvotePublishMobParam LJLZ;
    public String LJZ;
    public boolean LJZI;
    public final C214378bB LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1199));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1192));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1201));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1197));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1195));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1194));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1196));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1198));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, LinkMicRtcMixBitrateSetting.DEFAULT));
    public final List<String> LJLLJ = C47261Igj.LJJIJIIJI("👏", "😍", "😂");
    public final List<String> LJLLL = C47261Igj.LJJIJIIJI("😁", "🥰", "😳", "😏", "😅", "🥺", "😌", "😬", "😊", "😎");

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public UpvoteCommentDialogFragment() {
        AqS60S0110000_3 LJJ;
        C65776Prg LIZ = C65352Pkq.LIZ(UpvotePublishVM.class);
        C183127Gq c183127Gq = C183127Gq.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJZL = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c183127Gq, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    public final LinearLayout Al() {
        return (LinearLayout) this.LJLLI.getValue();
    }

    public final C111024Xi Dl() {
        return (C111024Xi) this.LJLJJI.getValue();
    }

    public final UpvotePublishVM Gl() {
        return (UpvotePublishVM) this.LJZL.getValue();
    }

    public final SY4 Hl() {
        return (SY4) this.LJLLILLLL.getValue();
    }

    public final T5T xl() {
        return (T5T) this.LJLJLLL.getValue();
    }

    public final void Il() {
        Al().setAlpha(1.0f);
        ((View) this.LJLJL.getValue()).setAlpha(1.0f);
        xl().setAlpha(1.0f);
        ((C2PY) this.LJLJLJ.getValue()).setInterceptTouchEvent(false);
        ((C2PY) this.LJLL.getValue()).setInterceptTouchEvent(false);
        Hl().setLoading(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        xl().setCursorVisible(false);
        super.dismiss();
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        List<InterfaceC182577En> list = Dl().getKeyBoardObservable().LIZLLL;
        if (list != null) {
            ((ArrayList) list).remove(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dl().getKeyBoardObservable().LIZJ(this);
        vl(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.2TB, android.view.View] */
    public final void wl() {
        CharSequence LJZI;
        String str;
        if (getContext() == null) {
            return;
        }
        final int i = 0;
        if (Hl().LLI) {
            vl(false);
            return;
        }
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1193);
        Editable text = xl().getText();
        final AttributeSet attributeSet = null;
        if (text == null || (LJZI = s.LJZI(text)) == null || LJZI.length() == 0) {
            aqS153S0100000_3.invoke();
            return;
        }
        OSZ[] oszArr = new OSZ[2];
        UpvotePublishMobParam upvotePublishMobParam = this.LJLZ;
        if (upvotePublishMobParam != null) {
            str = upvotePublishMobParam.enterFrom;
        } else {
            str = null;
        }
        oszArr[0] = new OSZ("enter_from", str);
        oszArr[1] = new OSZ("pop_up_type", "cancel_text");
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        FMX.LJIIL("show_discard_pop_up", LJJLIIIIJ);
        final Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        ?? r7 = new ConstraintLayout(requireContext, attributeSet, i) { // from class: X.2TB
            public final void setMessage(String message) {
                o.LJIIIZ(message, "message");
                ((TextView) findViewById(R.id.mb7)).setText(message);
            }

            public final void setTitle(String title) {
                o.LJIIIZ(title, "title");
                ((TextView) findViewById(R.id.mo6)).setText(title);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(requireContext, attributeSet, i);
                new LinkedHashMap();
                C16880lQ.LLLLIILL(C16880lQ.LLZIL(requireContext), R.layout.drf, this, true);
            }
        };
        String LJFF = C86V.LJFF(R.string.pu0);
        o.LJIIIIZZ(LJFF, "getString(R.string.rec_halfscreen_discard_title)");
        r7.setTitle(LJFF);
        String message = C86V.LJFF(R.string.q37);
        o.LJIIIIZZ(message, "message");
        r7.setMessage(message);
        AlertDialog create = new AlertDialog.Builder(requireContext()).setView((View) r7).create();
        String LJFF2 = C86V.LJFF(R.string.ptx);
        o.LJIIIIZZ(LJFF2, "getString(R.string.rec_halfscreen_discard_button1)");
        AqS92S0300000_3 aqS92S0300000_3 = new AqS92S0300000_3(LJJLIIIIJ, create, aqS153S0100000_3, 5);
        TuxTextView tuxTextView = (TuxTextView) r7.findViewById(R.id.mej);
        tuxTextView.setText(LJFF2);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0100000_3(aqS92S0300000_3, 330));
        String LJFF3 = C86V.LJFF(R.string.pty);
        o.LJIIIIZZ(LJFF3, "getString(R.string.rec_halfscreen_discard_button2)");
        AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3(LJJLIIIIJ, (Map<String, String>) create, (AlertDialog) 51);
        TuxTextView tuxTextView2 = (TuxTextView) r7.findViewById(R.id.mbz);
        tuxTextView2.setText(LJFF3);
        C16880lQ.LJJJJI(tuxTextView2, new ACListenerS23S0100000_3(aqS150S0200000_3, 329));
        if (!new C03880Dg(2).LIZJ(300000, "android/app/AlertDialog", "show", create, new Object[0], "void", new C65300Pk0(false, "()V", "-3625289068302288129")).LIZ) {
            create.show();
        }
        Window window = create.getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawableResource(R.drawable.a9c);
        WindowManager.LayoutParams attributes = window.getAttributes();
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        attributes.width = Math.min(C63081OpJ.LJJJJL(requireContext2) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)) * 2), O6R.LJJIIZ(C32151Nz.LJIIZILJ(360)));
        window.setAttributes(attributes);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        SY4 Hl = Hl();
        if (editable == null || editable.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Hl.setEnabled(!z);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        if (bundle != null) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Dl().LIZ(0, false);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        setStyle(1, R.style.adc);
        Bundle arguments = getArguments();
        UpvotePublishMobParam upvotePublishMobParam = null;
        if (arguments != null) {
            str = arguments.getString("upvote_item_id");
        } else {
            str = null;
        }
        this.LJLLLL = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("emoji_text");
        } else {
            str2 = null;
        }
        this.LJLLLLLL = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            upvotePublishMobParam = (UpvotePublishMobParam) arguments3.getParcelable("mob_param");
        }
        this.LJLZ = upvotePublishMobParam;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        o.LJIIIIZZ(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(20);
        }
        Window window2 = onCreateDialog.getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    public final void vl(boolean z) {
        if (z) {
            T5T xl = xl();
            if (xl != null) {
                xl.requestFocus();
            }
            KeyboardUtils.LIZLLL(xl());
            return;
        }
        KeyboardUtils.LIZIZ(xl());
        dismiss();
    }

    @Override // X.InterfaceC182577En
    public final void LLILLL(int i, boolean z) {
        if (z) {
            C111024Xi llRoot = Dl();
            o.LJIIIIZZ(llRoot, "llRoot");
            if (llRoot.getVisibility() == 0) {
                return;
            }
            llRoot.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Iterable] */
    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        ?? r3;
        Editable text;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (getContext() != null) {
            Dl().setKeyBoardObservable(new C7EW());
            Dl().setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0100000_3(this, 327)));
            Dl().setVisibility(4);
            Dl().postDelayed(new ARunnableS39S0100000_3(this, 230), 500L);
            View view2 = (View) this.LJLJJL.getValue();
            C110614Vt c110614Vt = new C110614Vt();
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            c110614Vt.LIZ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.cr, requireContext));
            c110614Vt.LJIIIIZZ = C61328O5c.LIZJ(8);
            c110614Vt.LJIIIZ = C61328O5c.LIZJ(8);
            Context requireContext2 = requireContext();
            o.LJIIIIZZ(requireContext2, "requireContext()");
            view2.setBackground(c110614Vt.LIZ(requireContext2));
            C16880lQ.LJIL((ConstraintLayout) this.LJLJJL.getValue(), null);
            C252709vu c252709vu = (C252709vu) this.LJLJJLL.getValue();
            C9KF c9kf = new C9KF();
            String LJFF = C86V.LJFF(R.string.pu2);
            o.LJIIIIZZ(LJFF, "getString(R.string.rec_halfscreen_message_title)");
            c9kf.LIZJ = LJFF;
            c252709vu.LJIILLIIL(c9kf);
            C252709vu c252709vu2 = (C252709vu) this.LJLJJLL.getValue();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(new AqS153S0100000_3(this, 1772));
            c252709vu2.LIZIZ(LIZJ);
            W5F LJII = W5U.LJII(C78939UyV.LJ(((RBX) HG3.LJIILL()).getCurUser().getAvatarThumb()));
            LJII.LJJIIJ = (SmartImageView) this.LJLJL.getValue();
            C16880lQ.LLJJJ(LJII);
            String str = this.LJLLLLLL;
            if (str != null && str.length() != 0 && (text = xl().getText()) != null) {
                text.append((CharSequence) this.LJLLLLLL);
            }
            xl().addTextChangedListener(this);
            xl().setFilters(new InputFilter[]{new InputFilter() { // from class: X.7K5
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                    int i5;
                    String str2;
                    UpvoteCommentDialogFragment upvoteCommentDialogFragment = UpvoteCommentDialogFragment.this;
                    if (spanned != null) {
                        upvoteCommentDialogFragment.getClass();
                        i5 = spanned.length();
                    } else {
                        i5 = 0;
                    }
                    int i6 = 150 - (i5 - (i4 - i3));
                    Context context = upvoteCommentDialogFragment.getContext();
                    CharSequence charSequence2 = null;
                    if (context != null) {
                        str2 = context.getString(R.string.txr);
                    } else {
                        str2 = null;
                    }
                    if (i6 <= 0) {
                        if (charSequence != null && charSequence.length() != 0) {
                            C26045AKb c26045AKb = new C26045AKb(upvoteCommentDialogFragment);
                            c26045AKb.LJIIIZ(str2);
                            c26045AKb.LJIIJ();
                        }
                        charSequence2 = "";
                    } else if (i6 < i2 - i) {
                        int i7 = i6 + i;
                        if (charSequence != null && charSequence.length() != 0) {
                            int i8 = i7 - 1;
                            if (Character.isHighSurrogate(charSequence.charAt(i8))) {
                                if (i8 == i) {
                                    C26045AKb c26045AKb2 = new C26045AKb(upvoteCommentDialogFragment);
                                    c26045AKb2.LJIIIZ(str2);
                                    c26045AKb2.LJIIJ();
                                    return "";
                                }
                                i7 = i8;
                            }
                        }
                        C26045AKb c26045AKb3 = new C26045AKb(upvoteCommentDialogFragment);
                        c26045AKb3.LJIIIZ(str2);
                        c26045AKb3.LJIIJ();
                        if (charSequence != null) {
                            charSequence2 = charSequence.subSequence(i, i7);
                        }
                    }
                    return charSequence2;
                }
            }});
            SY4 Hl = Hl();
            String str2 = this.LJLLLLLL;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            Hl.setEnabled(!z);
            C16880lQ.LJJIZ(Hl(), new ACListenerS23S0100000_3(this, 328));
            List<String> list = this.LJLLJ;
            C4VN.LIZ();
            List LIZIZ = C110154Tz.LIZIZ(2);
            if (LIZIZ != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(LIZIZ, 10));
                Iterator it = LIZIZ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ImSysEmojiModel) it.next()).getPreviewEmoji());
                }
                if (!arrayList.isEmpty()) {
                    List<String> list2 = this.LJLLL;
                    r3 = new ArrayList();
                    for (String str3 : list2) {
                        if (arrayList.contains(str3) && !this.LJLLJ.contains(str3)) {
                            r3.add(str3);
                        }
                    }
                    Al().post(new ARunnableS21S0200000_2(ORZ.LLIIIZ(r3, list), this, 73));
                }
            }
            r3 = C61878OQg.INSTANCE;
            Al().post(new ARunnableS21S0200000_2(ORZ.LLIIIZ(r3, list), this, 73));
        }
        Gl().asyncSubscribe(new TBT() { // from class: X.7Gr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C181627Aw) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS169S0100000_3(this, 1017), new AqS153S0100000_3(this, 1775), new AqS169S0100000_3(this, 1018));
        C8YN.LJII(this, Gl(), new TBT() { // from class: X.7Aq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C181627Aw) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 228), 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.dr5, viewGroup, false, "inflater.inflate(R.layou…omment, container, false)");
        this.LJLJI = LIZIZ;
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
